package services;

import com.github.javafaker.Faker;
import cucumber.pages.FormPage;
import framework.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import static cucumber.utils.Helpers.*;


public class FormServices extends BaseClass {
    public FormServices(){}

    public FormServices(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public void completeForm(){
        FormPage formPage = new FormPage(driver);
        Faker faker = new Faker();

        sendKeys(formPage.firstNameInputField, faker.name().firstName());
        sendKeys(formPage.lastNameInputField, faker.name().lastName());
        sendKeys(formPage.emailInputField, faker.name().firstName().toLowerCase()+"@mail.com");
        sendKeys(formPage.phoneInputField, faker.phoneNumber().cellPhone());
        sendKeys(formPage.companyInputField, faker.company().name());
        sendKeys(formPage.messageTextAreaField, faker.harryPotter().book());
        selectByValueFromDropdown(formPage.countryDropdown, "Romania");
        click(formPage.iAgreeCheckbox);
        click(formPage.submitButton);
    }

    public void verifyErrorMessage() {
        FormPage formPage = new FormPage(driver);

        Assert.assertTrue(formPage.capchaErrorMessage.isDisplayed());
    }
}
