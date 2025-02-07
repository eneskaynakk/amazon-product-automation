package stepdefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Hooks {
    public static WebDriver driver;

    @Before
    public void setUp() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver/chromedriver.exe");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
