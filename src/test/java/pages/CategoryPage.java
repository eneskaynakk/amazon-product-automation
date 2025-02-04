package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CategoryPage {
    WebDriver driver;
    ElementControlPage elementControlPage;
    ProductPage productPage;

    public CategoryPage(WebDriver driver) {
        this.driver = driver;
        this.elementControlPage = new ElementControlPage(driver);
        this.productPage = new ProductPage(driver);
    }

    By skin = By.cssSelector("span[data-csa-c-content-id=\"p_n_format_browse-bin/13815617031\"] > li > span > a > span");
    By writer = By.cssSelector("span[data-csa-c-content-id=\"p_lbr_books_authors_browse-bin/J.K. Rowling\"] > li > span > a > span");
    By language = By.cssSelector("div#p_n_feature_nine_browse-bin div > a > span");
    By languageTr = By.cssSelector("span[data-csa-c-content-id=\"p_n_feature_nine_browse-bin/14717299031\"] > li > span > a > span");
    By stock = By.cssSelector("div#p_n_availability a > span");
    By harryPotter = By.xpath("//span[text()=\"Harry Potter ve Felsefe Taşı 20. Yıl Gryffindor Özel Baskısı\"]");

    By bestSellingProduct = By.xpath("(//li[@class=\"a-carousel-card\"])[17]");
    By dealsOfTheDayDepartmentFilter = By.cssSelector("div#DealsGridScrollAnchor div:nth-child(1) > div > span:nth-child(4) > div > label > span > span");
    By dealsOfTheDayBrandFilter = By.cssSelector("span:nth-of-type(1) > div[data-a-input-name=\"brands\"]");
    By dealsOfTheDayProduct = By.xpath("(//span[@data-a-word-break=\"normal\"])[1]");
    By newReleasesProduct = By.xpath("(//li[@class=\"a-carousel-card\"])[19]");
    By electronicBrandFilter = By.cssSelector("label[for=\"apb-browse-refinements-checkbox_4\"] > i");
    By electronicStockFilter = By.cssSelector("div#p_n_availability a > span");
    By electronicProduct = By.xpath("(//h2[@class=\"a-size-base-plus a-spacing-none a-color-base a-text-normal\"])[6]");
    By giftIdeasProduct = By.xpath("(//h2[@class=\"a-size-base-plus a-spacing-none a-color-base a-text-normal\"])[14]");
    By skinlessBookFilter = By.cssSelector("label[for=\"apb-browse-refinements-checkbox_16\"] > i");
    By bookWriterFilter = By.xpath("//*[@id=\"p_lbr_books_authors_browse-bin/-Scholastic-\"]/span/a/div/label/i");
    By bookLanguageFilter = By.xpath("//li[@id=\"p_n_feature_nine_browse-bin/14717274031\"]/span/a/div/label/i");
    By bookStockFilter = By.cssSelector("div#p_n_availability i");
    By bookProduct = By.xpath("(//div[@role=\"listitem\"])[4]/div/div/span/div/div/div/div[2]/div/div/div[1]");

    public void filterTheSearchedProduct(){
        elementControlPage.elementVisibilityV1(skin);
        elementControlPage.elementVisibilityV1(writer);
        elementControlPage.elementVisibilityV1(language);
        elementControlPage.elementVisibilityV1(languageTr);
        elementControlPage.elementVisibilityV1(stock);
        elementControlPage.elementVisibilityV1(harryPotter);
        productPage.addToCart();
    }

    public void filteringSubcategoryProducts(){
        for (int i=1; i<8; i++){
            By subcategories= By.cssSelector("div[id=\"nav-xshop\"] > a[data-csa-c-type=\"link\"]:nth-of-type(" + i + ")");

            if(i==1){
                elementControlPage.elementVisibilityV1(subcategories);
                elementControlPage.elementVisibilityV1(bestSellingProduct);
                productPage.addToCart();
            }
            else if(i==2){
                elementControlPage.elementVisibilityV1(subcategories);
                elementControlPage.elementVisibilityV2(dealsOfTheDayDepartmentFilter);
                elementControlPage.elementVisibilityV2(dealsOfTheDayBrandFilter);
                elementControlPage.elementVisibilityV2(dealsOfTheDayProduct);
                productPage.addToCart();
            }
            else if(i==3){
                continue;
            }
            else if(i==4){
                elementControlPage.elementVisibilityV1(subcategories);
                elementControlPage.elementVisibilityV1(newReleasesProduct);
                productPage.addToCart();
            }
            else if(i==5){
                elementControlPage.elementVisibilityV1(subcategories);
                elementControlPage.elementVisibilityV2(electronicBrandFilter);
                elementControlPage.elementVisibilityV1(electronicStockFilter);
                elementControlPage.elementVisibilityV1(electronicProduct);
                productPage.addToCart();
            }
            else if(i==6){
                elementControlPage.elementVisibilityV1(subcategories);
                elementControlPage.elementVisibilityV1(giftIdeasProduct);
                productPage.addToCart();
            }
            else{
                elementControlPage.elementVisibilityV1(subcategories);
                elementControlPage.elementVisibilityV1(skinlessBookFilter);
                elementControlPage.elementVisibilityV1(bookWriterFilter);
                elementControlPage.elementVisibilityV1(bookLanguageFilter);
                elementControlPage.elementVisibilityV1(bookStockFilter);
                elementControlPage.elementVisibilityV1(bookProduct);
                productPage.addToCart();
            }
        }
    }
}
