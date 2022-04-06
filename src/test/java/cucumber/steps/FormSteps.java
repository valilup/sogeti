package cucumber.steps;

import cucumber.pages.FormPage;
import framework.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import services.FormServices;

public class FormSteps extends BaseClass {
    public FormSteps(){}

    public FormSteps(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @And("I complete the contact form with valid information on the Form")
    public void iCompleteTheContactFormWithValidInformationOnTheForm() throws InterruptedException {
        FormServices formServices = new FormServices(driver);
        formServices.completeForm();
    }

    @Then("I verify that the invalid captcha error message is displayed")
    public void iVerifyThatTheInvalidCaptchaErrorMessageIsDisplayed() {
        FormServices formServices = new FormServices(driver);
        formServices.verifyErrorMessage();
    }
}
