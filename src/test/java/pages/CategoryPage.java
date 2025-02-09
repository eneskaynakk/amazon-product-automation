package pages;

import org.openqa.selenium.By;

public class CategoryPage extends LocatorsPage{
    ElementControlPage elementControlPage = new ElementControlPage();
    ProductPage productPage = new ProductPage();

    public CategoryPage filterTheSearchedProduct(){
        elementControlPage.elementVisibilityV1(skin)
                .elementVisibilityV1(writer)
                .elementVisibilityV1(language)
                .elementVisibilityV1(languageTr)
                .elementVisibilityV1(stock)
                .elementVisibilityV1(harryPotter);

        productPage.addToCart();
        return this;
    }

    public CategoryPage filteringSubcategoryProducts(){
        for (int i=1; i<8; i++){
            By subcategories= By.cssSelector("div[id=\"nav-xshop\"] > a[data-csa-c-type=\"link\"]:nth-of-type(" + i + ")");

            if(i==1){
                elementControlPage.elementVisibilityV1(subcategories)
                        .elementVisibilityV1(bestSellingProduct);

                productPage.addToCart();
            }
            else if(i==2){
                elementControlPage.elementVisibilityV1(subcategories)
                        .elementVisibilityV2(dealsOfTheDayDepartmentFilter)
                        .elementVisibilityV2(dealsOfTheDayBrandFilter)
                        .elementVisibilityV2(dealsOfTheDayProduct);

                productPage.addToCart();
            }
            else if(i==3){
                continue;
            }
            else if(i==4){
                elementControlPage.elementVisibilityV1(subcategories)
                        .elementVisibilityV1(newReleasesProduct);

                productPage.addToCart();
            }
            else if(i==5){
                elementControlPage.elementVisibilityV1(subcategories)
                        .elementVisibilityV2(electronicBrandFilter)
                        .elementVisibilityV1(electronicStockFilter)
                        .elementVisibilityV1(electronicProduct);

                productPage.addToCart();
            }
            else if(i==6){
                elementControlPage.elementVisibilityV1(subcategories)
                        .elementVisibilityV1(giftIdeasProduct);

                productPage.addToCart();
            }
            else{
                elementControlPage.elementVisibilityV1(subcategories)
                        .elementVisibilityV1(skinlessBookFilter)
                        .elementVisibilityV1(bookWriterFilter)
                        .elementVisibilityV1(bookLanguageFilter)
                        .elementVisibilityV1(bookStockFilter)
                        .elementVisibilityV1(bookProduct);

                productPage.addToCart();
            }
        }
        return this;
    }
}
