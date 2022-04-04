package cucumber.pages;

import framework.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AutomationPage extends BaseClass {
    //TODO 1. Ce ar trebui sa trec in readme file?
    //TODO 2. Ce raport sa le dau ca sa le fie ok? ajunge asta online de caca de pe cucumber?
    //TODO 3. Nu mi se logheaza testele de API in raport pentru ca am facut sa nu mi se deshida browserul printr-un @tag
    //TODO 4. Ce commanda de runner sa le dau la oameni? ca eu rulez testele din intelij, sau cu mvn clean test
    //TODO 5. Te rog pune-mi intrebari pe care crezi tu ca ar trebui sa le stiu
    //TODO 6. E bun numele fisierelor de feature?
    //TODO 7. Ce sa trec la Feature si la Scenarii

    @FindBy(className = "page-heading")
    public WebElement pageHeading;
    @FindBy(className = "Form__Title")
    public WebElement contactUsFormTitle;

    //TODO de ce avem constructori goi si si constructori care paseza driverul? la ce ma ajuta constructorul gol?
    public AutomationPage() {
    }

    public AutomationPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
