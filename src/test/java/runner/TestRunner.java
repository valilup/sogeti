package runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

/**
 * feature => location of the cucumber features
 * glue => where the steps implementation of the features steps are
 * publish => publishes the cucumber reports of the test to a cucumber online webpage
 * plugin => generates a local report (this can be in different formats json, html, junit/XML)
 */
@CucumberOptions(features="src/test/resources/Features",
        glue={"cucumber/steps"},
        publish = true,
        plugin = {"pretty", "html:target/HtmlReports"})
public class TestRunner extends AbstractTestNGCucumberTests {

}
