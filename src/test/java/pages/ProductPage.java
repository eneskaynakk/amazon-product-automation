package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {
    WebDriver driver;

    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }

    By firstProduct = By.cssSelector("div#search div:nth-child(6) > div > div > span > div > div > div.s-product-image-container.aok-relative.s-text-center.s-image-overlay-grey.puis-image-overlay-grey.s-padding-left-small.s-padding-right-small.puis-spacing-small.s-height-equalized.puis.puis-v6c64cvwlsyid2hldh28hsxay3 > span > a > div > img");
    By addToCartButton = By.id("add-to-cart-button abc");

    public void selectFirstProduct() {
        driver.findElement(firstProduct).click();
    }

    public void addToCart() {
        driver.findElement(addToCartButton).click();
    }


}
