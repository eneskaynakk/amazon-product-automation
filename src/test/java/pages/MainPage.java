package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class MainPage extends LocatorsPage{
    ElementControlPage elementControlPage = new ElementControlPage();
    ProductListPage productListPage = new ProductListPage();
    ProductPage productPage = new ProductPage();

    public MainPage productSearch(String productName){
        elementControlPage.elementVisibilityV1(searchClick);
        driver.findElement(searchClick).sendKeys(productName + Keys.ENTER);
        return this;
    }

    public MainPage goToCartPage(){
        elementControlPage.elementVisibilityV1(cartButton);
        return this;
    }

    public MainPage goToSubcategories(){
        for (int i=1; i<8; i++){
            By subcategories= By.cssSelector("div[id=\"nav-xshop\"] > a[data-csa-c-type=\"link\"]:nth-of-type(" + i + ")");

            if(i==1){
                elementControlPage.elementVisibilityV1(subcategories);
                productListPage.filterBestSelling();
                productPage.addToCart();
            }
            else if(i==2){
                elementControlPage.elementVisibilityV1(subcategories);
                productListPage.filterDealsOfTheDay();
                productPage.addToCart();
            }
            else if(i==3){
                continue;
            }
            else if(i==4){
                elementControlPage.elementVisibilityV1(subcategories);
                productListPage.filterNewReleases();
                productPage.addToCart();
            }
            else if(i==5){
                elementControlPage.elementVisibilityV1(subcategories);
                productListPage.filterElectronics();
                productPage.addToCart();
            }
            else if(i==6){
                elementControlPage.elementVisibilityV1(subcategories);
                productListPage.filterGiftIdeas();
                productPage.addToCart();
            }
            else{
                elementControlPage.elementVisibilityV1(subcategories);
                productListPage.filterBooks();
                productPage.addToCart();
            }
        }
        return this;
    }
}
