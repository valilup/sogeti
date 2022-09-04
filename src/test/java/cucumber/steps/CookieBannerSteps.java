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

}
