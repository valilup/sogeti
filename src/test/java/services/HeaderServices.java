package services;

import com.sun.corba.se.spi.ior.IdentifiableFactory;
import cucumber.pages.HeaderPage;
import cucumber.utils.Helpers;
import framework.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.Locale;

import static cucumber.utils.Helpers.click;
import static cucumber.utils.Helpers.hoverOn;

public class HeaderServices extends BaseClass {
    public HeaderServices() {
    }

    public HeaderServices(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void hoverOver(String object) throws Exception {
        HeaderPage headerPage = new HeaderPage(driver);
        WebElement elToHoverOver;

        switch (object.toLowerCase()) {
            case "services link":
                elToHoverOver = headerPage.servicesLink;
                break;
            default:
                throw new Exception("Unknown object " + object + " to hover on");
        }
        hoverOn(elToHoverOver);
    }

    public void clickOn(String button) throws Exception {
        HeaderPage headerPage = new HeaderPage(driver);
        WebElement elToClick;

        switch (button.toLowerCase()) {
            case "automation link":
                elToClick = headerPage.automationLink;
                break;
            default:
                throw new Exception("Unknown button " + button + " to click on");
        }
        click(elToClick);
    }

    public void containsAttribute(String element, String attribute, String value) throws Exception {
        HeaderPage headerPage = new HeaderPage(driver);
        WebElement elementToCheck;

        switch (element.toLowerCase()) {
            case "services link":
                elementToCheck = headerPage.servicesLink;
                break;
            case "automation link":
                elementToCheck = headerPage.selectedAutomationLink;
                break;
            default:
                throw new Exception("Unknown element to check for: " + element);
        }

        Assert.assertTrue(elementToCheck.getAttribute(attribute).contains(value));
    }
}
