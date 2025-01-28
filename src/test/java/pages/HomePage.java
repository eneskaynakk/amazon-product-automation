package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

import javax.swing.*;


public class HomePage {
        WebDriver driver;
        ErrorPage errorPage;

        public HomePage(WebDriver driver) {
            this.driver = driver;
        }

        By cookie = By.id("sp-cc-rejectall-link");
        By searchClick = By.cssSelector("input[id=\"twotabsearchtextbox\"]");


        public void rejectCookie() {
            errorPage = new ErrorPage(driver);
            try{
                driver.findElement(cookie).click();
            }
            catch (NoSuchElementException e){
                errorPage.elementControl(cookie);
            }
        }

        public void productSearch(String productName){
            try{
                driver.findElement(searchClick).click();
                driver.findElement(searchClick).sendKeys(productName + Keys.ENTER);
            }
            catch (NoSuchElementException e){
                errorPage.elementControl(searchClick);
            }

        }
}
