package pages;

public class HomePage extends LocatorsPage {
    ElementControlPage elementControlPage = new ElementControlPage();

    public HomePage rejectCookie() {
        elementControlPage.elementVisibilityV1(cookie);
        return this;
    }
}