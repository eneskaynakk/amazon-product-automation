package stepdefs;

import io.cucumber.java.en.*;
import pages.HomePage;
import pages.CategoryPage;
import pages.CartPage;

public class AmazonStepDef{
    HomePage homePage = new HomePage();
    CategoryPage categoryPage = new CategoryPage();
    CartPage cartPage = new CartPage();

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
        homePage.productSearch(productName);
    }

    @When("Aranan ürün filtrelenir ve ürün sepete eklenir")
    public void stepToFilterTheSearchedProduct() {
        categoryPage.filterTheSearchedProduct();
    }

    @When("Alt kategorilerde ürün filtrelemesi varsa yapılır ve istenilen ürünler sırasıyla sepete eklenir")
    public void subcategory() {
        categoryPage.filteringSubcategoryProducts();
    }

    @When("Sepet sayfasına gidilir")
    public void goToTheCartPage() {
        cartPage.goToCartPage();
    }

    @Then("Sepetteki tüm ürünler kaldırılır")
    public void stepToProductRemoval() {
        cartPage.productRemoval();
    }
}