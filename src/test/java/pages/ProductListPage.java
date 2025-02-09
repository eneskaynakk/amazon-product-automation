package pages;

public class ProductListPage extends LocatorsPage{
    ElementControlPage elementControlPage = new ElementControlPage();

    public ProductListPage filterTheSearchedProduct(){
        elementControlPage.elementVisibilityV1(skin)
                .elementVisibilityV1(writer)
                .elementVisibilityV1(language)
                .elementVisibilityV1(languageTr)
                .elementVisibilityV1(stock)
                .elementVisibilityV1(harryPotter);
        return this;
    }

    public ProductListPage filterBestSelling() {
        elementControlPage.elementVisibilityV1(bestSellingProduct);
        return this;
    }

    public ProductListPage filterDealsOfTheDay() {
        elementControlPage.elementVisibilityV2(dealsOfTheDayDepartmentFilter)
                .elementVisibilityV2(dealsOfTheDayBrandFilter)
                .elementVisibilityV2(dealsOfTheDayProduct);
        return this;
    }

    public ProductListPage filterNewReleases() {
        elementControlPage.elementVisibilityV1(newReleasesProduct);
        return this;
    }

    public ProductListPage filterElectronics() {
        elementControlPage.elementVisibilityV2(electronicBrandFilter)
                .elementVisibilityV1(electronicStockFilter)
                .elementVisibilityV1(electronicProduct);
        return this;
    }

    public ProductListPage filterGiftIdeas() {
        elementControlPage.elementVisibilityV1(giftIdeasProduct);
        return this;
    }

    public ProductListPage filterBooks() {
        elementControlPage.elementVisibilityV1(skinlessBookFilter)
                .elementVisibilityV1(bookWriterFilter)
                .elementVisibilityV1(bookLanguageFilter)
                .elementVisibilityV1(bookStockFilter)
                .elementVisibilityV1(bookProduct);
        return this;
    }
}
