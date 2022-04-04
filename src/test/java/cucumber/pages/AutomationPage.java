package cucumber.pages;

import framework.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AutomationPage extends BaseClass {
    public AutomationPage(){}

    public AutomationPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(className = "page-heading")
    public WebElement pageHeading;

}
