package cucumber.pages;

import framework.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static cucumber.utils.Helpers.click;

public class CookieBannerPage extends BaseClass {

    @FindBy(className = "acceptCookie")
    public WebElement allowAllCookiesButton;

    public CookieBannerPage() {
    }

    public CookieBannerPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void clickOn(String button) throws Exception {
        WebElement elToClick;

        switch (button.toLowerCase()) {
            case "allow all cookies":
                elToClick = allowAllCookiesButton;
                break;

            default:
                throw new Exception("Unknown button " + button + " to click on");
        }
        click(elToClick);
    }
}
