package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Homepage extends Baseclass {

    // Example WebElements (add your actual locators)
    @FindBy(xpath = "//input[@name='q']")
    private WebElement searchBox;

    @FindBy(xpath = "//input[@name='btnK']")
    private WebElement searchButton;

    // Constructor
    public Homepage(WebDriver driver) {
        super(driver);  // Call parent constructor
    }

    // Methods
    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }

    public String getPageTitle() {
        return driver.getTitle();
    }

    public void searchFor(String searchTerm) {
        searchBox.sendKeys(searchTerm);
        searchButton.click();
    }

    public boolean isSearchBoxDisplayed() {
        return searchBox.isDisplayed();
    }
}