package cucumber.steps;

import cucumber.pages.HeaderServices;
import framework.BaseClass;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

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

    @Then("I verify that all the Country specific Sogeti links are working")
    public void iVerifyThatAllTheCountrySpecificSogetiLinksAreWorking() throws IOException {
        HeaderServices headerServices = new HeaderServices(driver);
        headerServices.verifyAllTheLinksAreWorking();
    }

    @Then("I verify that the Service and Automation are selected")
    public void iVerifyThatTheServiceAndAutomationAreSelected(DataTable dataTable) throws Exception {
        HeaderServices headerServices = new HeaderServices(driver);

        List<List<String>> myVal = dataTable.asLists();
        for (int i = 0; i < myVal.size(); i++) {
            for (int y = 0; y < myVal.get(i).size(); y++) {
                headerServices.containsAttribute(myVal.get(i).get(0), myVal.get(i).get(1), myVal.get(i).get(2));
            }
        }
    }
}
