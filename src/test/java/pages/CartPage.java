package pages;

public class CartPage extends LocatorsPage{
    ElementControlPage elementControlPage = new ElementControlPage();

    public CartPage goToCartPage(){
        elementControlPage.elementVisibilityV1(cartButton);
        return this;
    }

    public CartPage productRemoval(){
        String increaseProductQuantityString = driver.findElement(increaseProductQuantity).getText();
        int increaseProductQuantityInt = Integer.parseInt(increaseProductQuantityString);

        for(int i=1; i<increaseProductQuantityInt+1; i++){
            elementControlPage.elementVisibilityV1(deleteButton);
        }
        return this;
    }
}
