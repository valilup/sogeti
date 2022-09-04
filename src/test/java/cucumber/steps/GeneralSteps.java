package cucumber.steps;

import cucumber.pages.CookieBannerPage;
import cucumber.pages.HeaderServices;
import framework.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import cucumber.pages.GeneralServices;

public class GeneralSteps extends BaseClass {
    public GeneralSteps() {
    }

    public GeneralSteps(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @And("I verify that the current url contains {string} text")
    public void iVerifyThatTheCurrentUrlContainsText(String partialUrl) {
        GeneralServices generalServices = new GeneralServices(driver);
        generalServices.checkUrlContains(partialUrl);
    }

    @Given("I am on the {string} page")
    public void iAmOnThePage(String site) throws Exception {
        GeneralServices generalServices = new GeneralServices(driver);
        generalServices.navigateTo(site);

        CookieBannerPage cookieBannerPage = new CookieBannerPage(driver);
        cookieBannerPage.clickOn("allow all cookies");
    }
}

