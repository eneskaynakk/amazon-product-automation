package pages;

import org.openqa.selenium.By;
import stepdefs.Hooks;

public class LocatorsPage extends Hooks {

    public By cookie = By.id("sp-cc-rejectall-link");
    public By searchClick = By.cssSelector("input[id=\"twotabsearchtextbox\"]");

    public By cartButton = By.id("nav-cart");

    public By increaseProductQuantity = By.cssSelector("span[id=\"nav-cart-count\"]");
    public By deleteButton = By.xpath("(//input[@data-feature-id=\"item-delete-button\"])[1]");

    public By addToCartButton = By.cssSelector("input[title=\"Alışveriş Sepetine Ekle\"]");

    public By skin = By.cssSelector("span[data-csa-c-content-id=\"p_n_format_browse-bin/13815617031\"] > li > span > a > span");
    public By writer = By.cssSelector("span[data-csa-c-content-id=\"p_lbr_books_authors_browse-bin/J.K. Rowling\"] > li > span > a > span");
    public By language = By.cssSelector("div#p_n_feature_nine_browse-bin div > a > span");
    public By languageTr = By.cssSelector("span[data-csa-c-content-id=\"p_n_feature_nine_browse-bin/14717299031\"] > li > span > a > span");
    public By stock = By.cssSelector("div#p_n_availability a > span");
    public By harryPotter = By.xpath("//span[text()=\"Harry Potter ve Felsefe Taşı 20. Yıl Gryffindor Özel Baskısı\"]");

    public By bestSellingProduct = By.xpath("(//li[@class=\"a-carousel-card\"])[32]");
    public By dealsOfTheDayDepartmentFilter = By.cssSelector("div#DealsGridScrollAnchor div:nth-child(1) > div > span:nth-child(4) > div > label > span > span");
    public By dealsOfTheDayBrandFilter = By.cssSelector("span:nth-of-type(1) > div[data-a-input-name=\"brands\"]");
    public By dealsOfTheDayProduct = By.xpath("(//span[@data-a-word-break=\"normal\"])[1]");
    public By newReleasesProduct = By.xpath("(//li[@class=\"a-carousel-card\"])[19]");
    public By electronicBrandFilter = By.cssSelector("label[for=\"apb-browse-refinements-checkbox_4\"] > i");
    public By electronicStockFilter = By.cssSelector("div#p_n_availability a > span");
    public By electronicProduct = By.xpath("(//h2[@class=\"a-size-base-plus a-spacing-none a-color-base a-text-normal\"])[6]");
    public By giftIdeasProduct = By.xpath("(//h2[@class=\"a-size-base-plus a-spacing-none a-color-base a-text-normal\"])[14]");
    public By skinlessBookFilter = By.cssSelector("label[for=\"apb-browse-refinements-checkbox_16\"] > i");
    public By bookWriterFilter = By.xpath("//*[@id=\"p_lbr_books_authors_browse-bin/-Scholastic-\"]/span/a/div/label/i");
    public By bookLanguageFilter = By.xpath("//li[@id=\"p_n_feature_nine_browse-bin/14717248031\"]/span/a/div/label/i");
    public By bookStockFilter = By.cssSelector("div#p_n_availability i");
    public By bookProduct = By.xpath("(//div[@role=\"listitem\"])[4]/div/div/span/div/div/div/div[2]/div/div/div[1]");
}
