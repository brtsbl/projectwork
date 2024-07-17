/* Selenium Webdriver elindítása */
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