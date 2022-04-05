package cucumber.pages;

import framework.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AutomationPage extends BaseClass {
    @FindBy(className = "page-heading")
    public WebElement pageHeading;

    @FindBy(className = "Form__Title")
    public WebElement contactUsFormTitle;

    public AutomationPage() {
    }

    public AutomationPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
