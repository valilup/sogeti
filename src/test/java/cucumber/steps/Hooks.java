package cucumber.steps;

import framework.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;


public class Hooks extends BaseClass {

    @After("@cucumber")
    public static void tearDown() {
        driver.close();
        driver.quit();
    }

    @Before("@cucumber")
    public void testInit() {
        SetUp();
    }
}
