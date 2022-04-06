package cucumber.pages;

import framework.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;


public class FormPage extends BaseClass {
    public FormPage(){}

    public FormPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }



    @FindBy(name = "__field_123927")
    public WebElement firstNameInputField;

    @FindBy(name = "__field_123938")
    public WebElement lastNameInputField;

    @FindBy(name = "__field_123928")
    public WebElement emailInputField;

    @FindBy(name = "__field_123929")
    public WebElement phoneInputField;

    @FindBy(name = "__field_132738")
    public WebElement companyInputField;

    @FindBy(name = "__field_123931")
    public WebElement messageTextAreaField;

    @FindBy(name = "__field_132596")
    public WebElement countryDropdown;

    @FindBy(css = "[class='block choiceelementblock  ']")
    public WebElement iAgreeCheckbox;

    @FindBy(name = "submit")
    public WebElement submitButton;

    @FindBy(css = "[aria-live='polite'][class='Form__Element__ValidationError']")
    public WebElement capchaErrorMessage;
}
