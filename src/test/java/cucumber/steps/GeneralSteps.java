package cucumber.steps;

import framework.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import services.GeneralServices;

public class GeneralSteps extends BaseClass {
    public GeneralSteps() {
    }

    public GeneralSteps(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @Given("I navigate to the {string} page")
    public void iNavigateToThePage(String site) throws Exception {
        GeneralServices generalServices = new GeneralServices(driver);
        generalServices.navigateTo(site);
    }

    @And("I verify that the current url contains {string} text")
    public void iVerifyThatTheCurrentUrlContainsText(String partialUrl) {
        GeneralServices generalServices = new GeneralServices(driver);
        generalServices.checkUrlContains(partialUrl);
    }
}

