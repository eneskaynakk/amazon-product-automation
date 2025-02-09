package pages;
import org.openqa.selenium.*;

public class HomePage extends LocatorsPage {
    ElementControlPage elementControlPage = new ElementControlPage();

    public HomePage rejectCookie() {
        elementControlPage.elementVisibilityV1(cookie);
        return this;
    }

    public HomePage productSearch(String productName){
        elementControlPage.elementVisibilityV1(searchClick);
        driver.findElement(searchClick).sendKeys(productName + Keys.ENTER);
        return this;
    }
}