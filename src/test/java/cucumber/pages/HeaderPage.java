package cucumber.pages;

import framework.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HeaderPage extends BaseClass {


    @FindBy(css = "li[data-levelname='level2']")
    public WebElement servicesLink;
    @FindBy(css = "[class='subMenuLink'][href*='automation']")
    public WebElement automationLink;
    @FindBy(xpath = "//a[@class='subMenuLink' and contains(@href,'automation')]/ancestor::li[contains(@class,'current')]")
    public WebElement selectedAutomationLink;
    @FindBy(css = "[id='country-list-id'] a")
    public List<WebElement> sogetiSpecificCountryLinks;
    @FindBy(css = "[class='navbar-global focus-style']")
    public WebElement worldwideGlobeIcon;

    public HeaderPage() {
    }

    public HeaderPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
