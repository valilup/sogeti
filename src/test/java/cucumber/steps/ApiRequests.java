package cucumber.steps;

import framework.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Factory;

public class ApiRequests extends BaseClass {


    @Given("i perform a get request on bla service")
    public void iPerformAGetRequestOnBlaService() {

        System.out.println("this has been done");
    }


}
