package cucumber.steps;

import framework.BaseClass;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import services.CookieBannerServices;

public class CookieBannerSteps extends BaseClass {

    public CookieBannerSteps() {
    }

    public CookieBannerSteps(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @When("I click on the {string} button on the Cookies Banner")
    public void iClickOnTheButtonOnTheCookiesBanner(String button) throws Exception {
        CookieBannerServices cookieBannerServices = new CookieBannerServices(driver);
        cookieBannerServices.clickOn(button);
    }
}
