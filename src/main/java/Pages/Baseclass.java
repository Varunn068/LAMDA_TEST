package Pages;

import Base.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Baseclass extends BaseTest {

    //protected WebDriver driver;

    // Constructor
    public Baseclass(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Default constructor (needed for inheritance)
    public Baseclass() {
    }
}