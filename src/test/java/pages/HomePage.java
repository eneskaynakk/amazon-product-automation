package pages;
import org.openqa.selenium.*;


public class HomePage {
        WebDriver driver;
        ElementControlPage elementControlPage;

        public HomePage(WebDriver driver) {
            this.driver = driver;
            this.elementControlPage = new ElementControlPage(driver);
        }

        By cookie = By.id("sp-cc-rejectall-link");
        By searchClick = By.cssSelector("input[id=\"twotabsearchtextbox\"]");

        public void rejectCookie() {
            elementControlPage.elementVisibilityV1(cookie);
        }

        public void productSearch(String productName){
            elementControlPage.elementVisibilityV1(searchClick);
            driver.findElement(searchClick).sendKeys(productName + Keys.ENTER);
        }
}
