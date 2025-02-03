package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {
    WebDriver driver;
    ElementControlPage elementControlPage;

    public ProductPage(WebDriver driver) {
        this.driver = driver;
        this.elementControlPage = new ElementControlPage(driver);
    }

    By addToCartButton = By.cssSelector("input[title=\"Alışveriş Sepetine Ekle\"]");

    public void addToCart(){
        elementControlPage.elementVisibilityV2(addToCartButton);
    }
}
