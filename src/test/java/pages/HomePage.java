package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;


public class HomePage {
        WebDriver driver;
        ErrorPage errorPage;

        public HomePage(WebDriver driver) {
            this.driver = driver;
        }

        By cookie = By.id("sp-cc-rejectall-link");

        public void rejectCookie() {
            errorPage = new ErrorPage(driver);
            try{
                driver.findElement(cookie).click();
            }
            catch (NoSuchElementException e){
                errorPage.elementControl(cookie);
            }
        }
}
