package services;


import cucumber.pages.CookieBannerPage;
import cucumber.utils.Helpers;
import framework.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class CookieBannerServices extends BaseClass {
    public CookieBannerServices() {
    }

    public CookieBannerServices(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void clickOn(String button) throws Exception {
        CookieBannerPage cookieBannerPage = new CookieBannerPage(driver);
        WebElement elToClick;

        switch (button.toLowerCase()) {
            case "allow all cookies":
                elToClick = cookieBannerPage.allowAllCookiesButton;
                break;

            default:
                throw new Exception("Unknown button " + button + " to click on");
        }
        Helpers.click(elToClick);
    }
}
