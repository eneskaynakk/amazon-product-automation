package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
    WebDriver driver;
    ElementControlPage elementControlPage;

    public CartPage(WebDriver driver) {
        this.driver = driver;
        this.elementControlPage = new ElementControlPage(driver);
    }

    By cartButton = By.id("nav-cart");

    By increaseProductQuantity = By.cssSelector("span[id=\"nav-cart-count\"]");
    By deleteButton = By.xpath("(//input[@data-feature-id=\"item-delete-button\"])[1]");

    public void goToCartPage(){
        elementControlPage.elementVisibilityV1(cartButton);
    }

    public void productRemoval(){
        String increaseProductQuantityString = driver.findElement(increaseProductQuantity).getText();
        int increaseProductQuantityInt = Integer.parseInt(increaseProductQuantityString);

        for(int i=1; i<increaseProductQuantityInt+1; i++){
            elementControlPage.elementVisibilityV1(deleteButton);
        }
    }
}
