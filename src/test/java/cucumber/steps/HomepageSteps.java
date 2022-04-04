package cucumber.steps;

import framework.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class HomepageSteps extends BaseClass {

    public HomepageSteps(){}

    public HomepageSteps(WebDriver driver){
        PageFactory.initElements(driver, this);
    }


    @Given("I navigate to the {string}")
    public void iNavigateToThe(String arg0) {
        driver.get("https://www.sogeti.com");
    }

    @When("I accept all the cookies")
    public void i_accept_all_the_cookies() {
        System.out.println("Second step");
    }

    @When("I hover over the {string} from the main navigation")
    public void i_hover_over_the_from_the_main_navigation(String string) {
        System.out.println("Third step");
    }

    @When("I click on the {string} from the main navigation")
    public void i_click_on_the_from_the_main_navigation(String string) {
        System.out.println("Forth Step");
    }
}
