package services;

import cucumber.pages.AutomationPage;
import framework.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class AutomationServices extends BaseClass {

    public AutomationServices() {
    }

    public AutomationServices(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void verifyIsVisible(String element) throws Exception {
        AutomationPage automationPage = new AutomationPage(driver);
        WebElement elementToCheck;

        switch (element.toLowerCase()) {
            case "automation header text":
                elementToCheck = automationPage.pageHeading;
                break;
            default:
                throw new Exception("Unknown element to check for: " + element);

        }
        Assert.assertTrue(elementToCheck.isDisplayed());
    }
}
