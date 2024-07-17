package hu.masterfield.steps.steps;
import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
/* Selenium Webdriver elindítása */
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
public class TescoSteps {

    protected static WebDriver driver;

    protected static WebDriverWait wait;

@BeforeAll
public static void setup() {
    // set chrome options
    ChromeOptions chromeOptions = new ChromeOptions();
    chromeOptions.addArguments("--disable-blink-features=AutomationControlled");

    // init driver
    driver = new ChromeDriver(chromeOptions);
    wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    driver.manage().window().setSize(new Dimension(900, 900));
}

@AfterAll
public static void cleanup() {
    driver.quit();
}
}