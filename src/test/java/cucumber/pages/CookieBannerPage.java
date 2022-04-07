package cucumber.pages;

import framework.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CookieBannerPage extends BaseClass {
    @FindBy(className = "acceptCookie")
    public WebElement allowAllCookiesButton;

    public CookieBannerPage() {
    }

    public CookieBannerPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
