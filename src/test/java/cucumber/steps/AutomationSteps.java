package cucumber.steps;

import framework.BaseClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import services.AutomationServices;

public class AutomationSteps extends BaseClass {
    public AutomationSteps(){}

    public AutomationSteps(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @Then("I verify that the {string} is visible on the Automation Page")
    public void iVerifyThatTheIsVisibleOnTheAutomationPage(String element) throws Exception {
        AutomationServices automationServices = new AutomationServices(driver);
        automationServices.verifyIsVisible(element);
    }
}
