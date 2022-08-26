package cucumber.steps;

import cucumber.pages.CookieBannerPage;
import framework.BaseClass;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class CookieBannerSteps extends BaseClass {
    public CookieBannerSteps() {
    }

    public CookieBannerSteps(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @When("I click on the {string} button on the Cookies Banner")
    public void iClickOnTheButtonOnTheCookiesBanner(String button) throws Exception {
        CookieBannerPage cookieBannerPage = new CookieBannerPage(driver);
        cookieBannerPage.clickOn(button);
    }
}
