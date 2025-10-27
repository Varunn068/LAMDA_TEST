package Tests;

import Base.BaseTest;
import Pages.Homepage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Homepagetest extends BaseTest {

    @Test
    public void verifyHomepageUrl() {
        // Initialize the Homepage page object with driver
        Homepage homepage = new Homepage(driver);  // Pass driver to Homepage

        // Get current URL
        String currentUrl = homepage.getCurrentUrl();

        // Print the URL
        System.out.println("Current URL: " + currentUrl);

        // Add assertion if needed
        Assert.assertNotNull(currentUrl, "URL should not be null");
    }
}