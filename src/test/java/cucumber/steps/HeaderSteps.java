package cucumber.steps;

import framework.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import services.HeaderServices;

public class HeaderSteps extends BaseClass {

    public HeaderSteps() {
    }

    public HeaderSteps(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @When("I hover over the {string} from the Header")
    public void iHoverOverTheFromTheHeader(String object) throws Exception {
        HeaderServices headerServices = new HeaderServices(driver);
        headerServices.hoverOver(object);
    }

    @When("I click on the {string} from the Header")
    public void iClickOnTheFromTheHeader(String button) throws Exception {
        HeaderServices headerServices = new HeaderServices(driver);
        headerServices.clickOn(button);
    }


    @Then("I verify that the {string} element with the {string} attribute contains {string} value from the Header")
    public void iVerifyThatTheElementWithTheAttributeContainsValueFromTheHeader(String element, String attribute, String value) throws Exception {
        HeaderServices headerServices = new HeaderServices(driver);
        headerServices.containsAttribute(element, attribute, value);
    }
}
