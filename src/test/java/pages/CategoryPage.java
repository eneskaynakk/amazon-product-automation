package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CategoryPage {
    WebDriver driver;
    ElementControlPage elementControlPage;

    public CategoryPage(WebDriver driver) {
        this.driver = driver;
        this.elementControlPage = new ElementControlPage(driver);
    }

    By skin = By.cssSelector("span[data-csa-c-content-id=\"p_n_format_browse-bin/13815617031\"] > li > span > a > span");
    By writer = By.cssSelector("span[data-csa-c-content-id=\"p_lbr_books_authors_browse-bin/J.K. Rowling\"] > li > span > a > span");
    By language = By.cssSelector("div#p_n_feature_nine_browse-bin div > a > span");
    By languageTr = By.cssSelector("span[data-csa-c-content-id=\"p_n_feature_nine_browse-bin/14717299031\"] > li > span > a > span");
    By stock = By.cssSelector("div#p_n_availability a > span");
    By harryPotter = By.xpath("//span[text()=\"Harry Potter ve Felsefe Taşı 20. Yıl Gryffindor Özel Baskısı\"]");

    public void categoryFilter1(){
        elementControlPage.elementVisibilityV1(skin);
        elementControlPage.elementVisibilityV1(writer);
        elementControlPage.elementVisibilityV1(language);
        elementControlPage.elementVisibilityV1(languageTr);
        elementControlPage.elementVisibilityV1(stock);
        elementControlPage.elementVisibilityV1(harryPotter);
    }

}
