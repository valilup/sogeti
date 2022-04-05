package cucumber.steps;

import framework.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import io.restassured.response.Response;
import org.json.simple.parser.ParseException;

import static cucumber.utils.RestAPI.*;

public class ApiRequests extends BaseClass {

    private Response response;

    @Given("I perform a GET request to the {string} url")
    public void iPerformAGETRequestToTheUrl(String url) {
        response = GET(url);
    }

    @Then("I verify that the status code is {int}")
    public void iVerifyThatTheStatusCodeIs(int statusCode) {
        validateStatusCode(response, statusCode);
    }

    @Then("I verify that the content type is {string}")
    public void iVerifyThatTheContentTypeIs(String contentType) {
        checkContentType(response, contentType);
    }

    @Then("I verify that the response time is below {int} seconds")
    public void iVerifyThatTheResponseTimeIsBelowSeconds(Integer time) {
        checkResponseTimeSmallerThan(response, time);
    }

    @Then("I verify that the {string} key has the {string} value")
    public void iVerifyThatTheKeyHasTheValue(String key, String value) {
        checkSpecificResponseValueIsCorrect(response, key, value);
    }

    @Given("I perform a GET request to {string} {string}")
    public void iPerformAGETRequestTo(String country, String postalCode) {
        response = GET(country + "/" + postalCode);
    }

    @Then("I verify that the postal code {string} has the place name {string}")
    public void iVerifyThatThePostalCodeHasThePlaceName(String postalCode, String placeName) throws ParseException {
        checkThatPostalCodeHasPlaceName(response, postalCode, placeName);
    }
}
