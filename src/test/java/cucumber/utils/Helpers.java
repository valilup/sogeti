package cucumber.utils;

import framework.BaseClass;
import io.cucumber.java.en_old.Ac;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Helpers extends BaseClass {
    private static final int timeoutDuration = 60;

    public static void click(WebElement element){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutDuration));
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }

    public static void hoverOn(WebElement element){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutDuration));
        wait.until(ExpectedConditions.elementToBeClickable(element));
        Actions actions = new Actions(driver);
        actions.moveToElement(element).perform();
    }

    public static void isVisible(WebElement element){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutDuration));
        wait.until(ExpectedConditions.visibilityOf(element));
    }
}
