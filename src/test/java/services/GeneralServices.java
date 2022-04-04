package services;

import cucumber.pages.CookieBannerPage;
import framework.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


public class GeneralServices extends BaseClass {

    public GeneralServices() {
    }

    public GeneralServices(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void navigateTo(String site) throws Exception {
        String url = null;

        switch (site.toLowerCase()) {
            case "sogeti homepage":
                url = "https://www.sogeti.com/";
                break;
            default:
                throw new Exception("Unknown URL: " + url);
        }
        driver.get(url);
    }
}
