package hu.masterfield.steps.steps;
import hu.masterfield.steps.pages.HomePage;
import hu.masterfield.steps.pages.SearchResultPage;
import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.PendingException;
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
    private HomePage homePage;
    private SearchResultPage searchResultPage;
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
        driver.get("https://bevasarlas.tesco.hu/groceries/hu-HU ");
        homePage = new HomePage(driver);
        homePage.isLoaded();
    }

    @When("I search for {string}")
    public void iSearchFor(String productName) {searchResultPage = homePage.search(productName);
    }

     @Then("{int} products are displayed")
    public void productSAreDisplayed(int numberOfProducts) {
        searchResultPage.validateSearchResultNumber(numberOfProducts);
     }

    @And("the product's name contains {string}")
    public void theProductSNameContains(String product) {
    searchResultPage.searchProduct(product);
    }

    @And("header contains the word {string}")
    public void headerContainsTheWord(String arg0) {
    throw new PendingException();
    }

    @Then("nothing changes on the page")
    public void nothingChangesOnThePage() {
        throw new PendingException();
    }

    @Then("a message displayed that the search didn't find relevant products")
    public void aMessageDisplayedThatTheSearchDidnTFindRelevantProducts() {
        throw new PendingException();
    }

    @And("{string} button is available")
    public void buttonIsAvailable(String arg0) {
        throw new PendingException();
    }


}