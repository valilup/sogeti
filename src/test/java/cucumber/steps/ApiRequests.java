package cucumber.steps;

import framework.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;

import static cucumber.utils.RestAPI.*;

public class ApiRequests extends BaseClass {
    private Response response;

    @Given("I perform a GET request to {string} {string} {string}")
    public void iPerformAGETRequestTo(String country, String postalCode, String arg2) {
        response = GET(country + "/" + postalCode);
        response.prettyPrint();
    }

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
}
