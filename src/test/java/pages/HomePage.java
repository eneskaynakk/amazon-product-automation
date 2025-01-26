package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class HomePage {
        WebDriver driver;

        public HomePage(WebDriver driver) {
            this.driver = driver;
        }

        By searchBox = By.id("twotabsearchtextbox");
        By searchButton = By.id("nav-search-submit-button");
        By notification = By.id("div#B0BGQMM9J6 img");

        public void searchProduct(String productName) {
            driver.findElement(notification).click();
            driver.findElement(searchBox).sendKeys(productName);
            driver.findElement(searchButton).click();
        }

}
