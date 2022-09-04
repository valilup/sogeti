package cucumber.steps;

import cucumber.pages.AutomationPage;
import framework.BaseClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AutomationSteps extends BaseClass {
    public AutomationSteps() {
    }

    public AutomationSteps(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @Then("I verify that the {string} is visible on the Automation Page")
    public void iVerifyThatTheIsVisibleOnTheAutomationPage(String element) throws Exception {
        AutomationPage automationPage = new AutomationPage(driver);
        automationPage.verifyIsVisible(element);
    }
}
