package cucumber.pages;

import framework.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class HomepagePage extends BaseClass {

    public HomepagePage(){ }

    public HomepagePage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

}
