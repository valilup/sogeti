package cucumber.pages;

import com.github.javafaker.Faker;
import framework.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import static cucumber.utils.Helpers.*;


public class FormPage extends BaseClass {

    @FindBy(name = "__field_123927")
    public WebElement firstNameInputField;

    @FindBy(name = "__field_123938")
    public WebElement lastNameInputField;

    @FindBy(name = "__field_123928")
    public WebElement emailInputField;

    @FindBy(name = "__field_123929")
    public WebElement phoneInputField;

    @FindBy(name = "__field_132738")
    public WebElement companyInputField;

    @FindBy(name = "__field_123931")
    public WebElement messageTextAreaField;

    @FindBy(name = "__field_132596")
    public WebElement countryDropdown;

    @FindBy(css = "[class='block choiceelementblock  ']")
    public WebElement iAgreeCheckbox;

    @FindBy(name = "submit")
    public WebElement submitButton;

    @FindBy(css = "[aria-live='polite'][class='Form__Element__ValidationError']")
    public WebElement capchaErrorMessage;

    public FormPage() {
    }

    public FormPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void completeForm() {
        Faker faker = new Faker();

        sendKeys(firstNameInputField, faker.name().firstName());
        sendKeys(lastNameInputField, faker.name().lastName());
        sendKeys(emailInputField, faker.name().firstName().toLowerCase() + "@mail.com");
        sendKeys(phoneInputField, faker.phoneNumber().cellPhone());
        sendKeys(companyInputField, faker.company().name());
        sendKeys(messageTextAreaField, faker.harryPotter().book());
        selectByValueFromDropdown(countryDropdown, "Romania");
        click(iAgreeCheckbox);
        click(submitButton);
    }

    public void verifyErrorMessage() {
        Assert.assertTrue(capchaErrorMessage.isDisplayed());
    }
}
