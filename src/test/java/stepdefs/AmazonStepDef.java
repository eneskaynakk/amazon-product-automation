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

    @Given("I am on the Amazon home page")
    public void iAmOnTheAmazonHomePage() {
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

    @When("I search for {string}")
    public void iSearchFor(String productName) {
        homePage.searchProduct(productName);
    }

    @When("I select the first product")
    public void iSelectTheFirstProduct() {
        productPage.selectFirstProduct();
    }

    @Then("I add the product to the cart")
    public void iAddTheProductToTheCart() {
        productPage.addToCart();
        driver.quit();
    }
}
