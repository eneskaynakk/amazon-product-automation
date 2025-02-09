package pages;

public class ProductPage extends LocatorsPage{
    ElementControlPage elementControlPage = new ElementControlPage();

    public ProductPage addToCart(){
        elementControlPage.elementVisibilityV2(addToCartButton);
        return this;
    }
}
