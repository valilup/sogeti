package cucumber.pages;

import framework.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import static cucumber.utils.Helpers.scrollTo;

public class AutomationPage extends BaseClass {

    @FindBy(className = "page-heading")
    public WebElement pageHeading;

    @FindBy(className = "Form__Title")
    public WebElement contactUsFormTitle;

    public AutomationPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void verifyIsVisible(String element) throws Exception {
        WebElement elementToCheck;

        switch (element.toLowerCase()) {
            case "automation header text":
                elementToCheck = pageHeading;
                break;
            default:
                throw new Exception("Unknown element to check for: " + element);

        }
        Assert.assertTrue(elementToCheck.isDisplayed());
    }

    public void scrollToElement(WebElement element){
        scrollTo(element);
    }
}
