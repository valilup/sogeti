package cucumber.pages;

import framework.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import static cucumber.utils.Helpers.click;
import static cucumber.utils.Helpers.hoverOn;

public class HeaderServices extends BaseClass {

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

    public HeaderServices() {
    }

    public HeaderServices(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    private static void verifyResponseOfLinkIsOk(String urlLink) throws IOException {
        URL url = new URL(urlLink);
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(3000);
        httpURLConnection.connect();
        Assert.assertEquals(httpURLConnection.getResponseCode(), 200);
    }

    public void hoverOver(String object) throws Exception {
        WebElement elToHoverOver;

        switch (object.toLowerCase()) {
            case "services link":
                elToHoverOver = servicesLink;
                break;
            default:
                throw new Exception("Unknown object " + object + " to hover on");
        }
        hoverOn(elToHoverOver);
    }

    public void clickOn(String button) throws Exception {
        WebElement elToClick;

        switch (button.toLowerCase()) {
            case "automation link":
                elToClick = automationLink;
                break;
            case "worldwide globe icon":
                elToClick = worldwideGlobeIcon;
                break;
            default:
                throw new Exception("Unknown button " + button + " to click on");
        }
        click(elToClick);
    }

    public void containsAttribute(String element, String attribute, String value) throws Exception {
        WebElement elementToCheck;

        switch (element.toLowerCase()) {
            case "services link":
                elementToCheck = servicesLink;
                break;
            case "automation link":
                elementToCheck = selectedAutomationLink;
                break;
            default:
                throw new Exception("Unknown element to check for: " + element);
        }
        Assert.assertTrue(elementToCheck.getAttribute(attribute).contains(value));
    }

    public void verifyAllTheLinksAreWorking() throws IOException {
        List<WebElement> links = sogetiSpecificCountryLinks;
        for (int x = 0; x < links.size(); x++) {
            WebElement element = links.get(x);
            String url = element.getAttribute("href");
            verifyResponseOfLinkIsOk(url);
        }
    }
}
