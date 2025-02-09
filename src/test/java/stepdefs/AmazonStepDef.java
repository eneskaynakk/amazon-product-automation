package stepdefs;

import io.cucumber.java.en.*;
import pages.*;

public class AmazonStepDef{
    HomePage homePage = new HomePage();
    ProductListPage productListPage = new ProductListPage();
    ProductPage productPage = new ProductPage();
    CartPage cartPage = new CartPage();
    MainPage mainPage = new MainPage();

    @Given("Kullanıcı amazon.com.tr adresine gider")
    public void amazonHomePage() {
        Hooks.driver.get("https://www.amazon.com.tr");
    }

    @When("Çerez pop-up'ı varsa kapatılır")
    public void closeCookie() {
        homePage.rejectCookie();
    }

    @When("Arama çubuğuna istenilen ürün adı {string} girilir ve arama yapılır")
    public void productNameSearch(String productName) {
        mainPage.productSearch(productName);
    }

    @When("Aranan ürün filtrelenir ve ürün sepete eklenir")
    public void stepToFilterTheSearchedProduct() {
        productListPage.filterTheSearchedProduct();
        productPage.addToCart();
    }

    @When("Alt kategorilerde ürün filtrelemesi varsa yapılır ve istenilen ürünler sırasıyla sepete eklenir")
    public void subcategory() {
        mainPage.goToSubcategories();
    }

    @When("Sepet sayfasına gidilir")
    public void goToTheCartPage() {
        mainPage.goToCartPage();
    }

    @Then("Sepetteki tüm ürünler kaldırılır")
    public void stepToProductRemoval() {
        cartPage.productRemoval();
    }
}