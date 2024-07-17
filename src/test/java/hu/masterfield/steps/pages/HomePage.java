package hu.masterfield.steps.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class HomePage extends BasePage {

    @FindBy(xpath = "//*[@id=\"sticky-bar-cookie-wrapper\"]/span/div/div/div[2]/form[1]/button")
    WebElement acceptCookiesButton;

    @FindBy(xpath = "//*[@id=\"search-input\"]")
    WebElement searchField;

    @FindBy(xpath = "//*[@id=\"search-form\"]/button")
    WebElement searchButton;

    public HomePage(WebDriver driver) {
        super(driver);
    }
    public void acceptCookies() {
        acceptCookiesButton.click();
    }

    public SearchResultPage search(String productName) {
        searchField.sendKeys(productName);
        searchButton.click();
        SearchResultPage searchResult = new SearchResultPage(driver);
        searchResult.isLoaded();
        return searchResult;
    }


    public boolean isLoaded() {
        return isLoaded(acceptCookiesButton) && isLoaded(searchField) && isLoaded(searchButton);
    }
}
