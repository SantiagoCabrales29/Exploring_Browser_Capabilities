package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

public class BaseTest {

    WebDriver driver;

    @BeforeClass
    public void setup(){
        WebDriverManager.firefoxdriver().setup();
    }

    @BeforeMethod
    public void setupUsingWDMBuilderParameterized() {

        driver = WebDriverManager.firefoxdriver().create();
    }

    @Test
    public void baseTest(){
        driver.get("https://bonigarcia.dev/selenium-webdriver-java/");
    }

    @AfterMethod
    public void teardown(){
        driver.quit();
    }
}
