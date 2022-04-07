package cucumber.utils;

import framework.BaseClass;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Helpers extends BaseClass {
    private static final int timeoutDuration = 60;

    public static void click(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutDuration));
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }

    public static void hoverOn(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutDuration));
        wait.until(ExpectedConditions.elementToBeClickable(element));
        Actions actions = new Actions(driver);
        actions.moveToElement(element).perform();
    }

    public static void scrollTo(WebElement element){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutDuration));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true)", element);
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.ARROW_UP).perform();
        actions.sendKeys(Keys.ARROW_UP).perform();
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public static void sendKeys(WebElement element, String text){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutDuration));
        wait.until(ExpectedConditions.visibilityOf(element));
        element.sendKeys(text);
    }

    public static void selectByValueFromDropdown(WebElement element, String value){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutDuration));
        wait.until(ExpectedConditions.elementToBeClickable(element));
        Select select = new Select(element);
        select.selectByValue(value);
    }
}
