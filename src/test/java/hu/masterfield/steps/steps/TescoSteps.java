package hu.masterfield.steps.steps;
import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
/* Selenium Webdriver elindítása */
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
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

    @Given("I open the home page")
    public void iOpenTheHomePage() {
    }

    @When("I search for {string}")
    public void iSearchFor(String arg0) {
    }

    @Then("{string} product\\(s) is\\/are displayed")
    public void productSIsAreDisplayed(String arg0) {
    }

    @And("the product's name contains {string}")
    public void theProductSNameContains(String arg0) {
    }

    @And("header contains the word {string}")
    public void headerContainsTheWord(String arg0) {
    }

    @Then("nothing changes on the page")
    public void nothingChangesOnThePage() {
    }

    @Then("a message displayed that the search didn't find relevant products")
    public void aMessageDisplayedThatTheSearchDidnTFindRelevantProducts() {
    }

    @And("{string} button is available")
    public void buttonIsAvailable(String arg0) {
    }

}