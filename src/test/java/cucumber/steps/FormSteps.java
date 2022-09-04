package cucumber.steps;

import cucumber.pages.AutomationPage;
import cucumber.pages.FormPage;
import framework.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import static cucumber.utils.Helpers.scrollTo;

public class FormSteps extends BaseClass {
    public FormSteps() {
    }

    public FormSteps(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @Then("I verify that the invalid captcha error message is displayed")
    public void iVerifyThatTheInvalidCaptchaErrorMessageIsDisplayed() {
        FormPage formPage = new FormPage(driver);
        formPage.verifyErrorMessage();
    }

    @When("I complete the contact form with valid information")
    public void iCompleteTheContactFormWithValidInformation() throws Exception {
        AutomationPage automationPage = new AutomationPage(driver);

        //TODO: which is the correct way to implement for cleaner understanding
        automationPage.scrollToElement(automationPage.contactUsFormTitle);//this follows the POM model
        scrollTo(automationPage.contactUsFormTitle);//this doesn't follow the POM model ?

        FormPage formPage = new FormPage(driver);
        formPage.completeForm();
    }
}
