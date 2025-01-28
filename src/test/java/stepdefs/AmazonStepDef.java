package stepdefs;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pages.HomePage;
import pages.CategoryPage;
import pages.ProductPage;
import pages.CartPage;

public class AmazonStepDef {
    WebDriver driver;
    HomePage homePage;
    CategoryPage categoryPage;
    ProductPage productPage;
    CartPage cartPage;

    @Given("Kullanıcı amazon.com.tr adresine gider")
    public void amazonHomePage() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver/chromedriver.exe");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com.tr");

        homePage = new HomePage(driver);
        categoryPage = new CategoryPage(driver);
        productPage = new ProductPage(driver);
        cartPage = new CartPage(driver);

    }
    @When("Çerez pop-up'ı varsa kapatılır")
    public void closeCookie() {
        homePage.rejectCookie();
    }

    @When("Arama çubuğuna istenilen ürün adı {string} girilir,arama yapılır")
    public void productNameSearch(String productName) {
        homePage.productSearch(productName);
    }

}
