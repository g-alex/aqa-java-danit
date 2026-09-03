package final_project;


import org.openqa.selenium.Dimension;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverConditions.urlContaining;

public class CategoryPage {
    private static final String CATEGORY_TITLE = ".MuiGrid-item h1.MuiTypography-h1";

    public String getCategoryTitle() {
        return $(CATEGORY_TITLE).shouldBe(visible).getText();
    }

    public CategoryPage clickOnSubcategory(String subCategory) {
        $$(".MuiChip-labelMedium")
                .findBy(text(subCategory))
                .click();
        return this;
    }

    public CategoryPage waitForTitle(String expectedTitle) {
        $(CATEGORY_TITLE).shouldHave(text(expectedTitle));
        return this;
    }

    public void clickOnFilterButton() {
        $("[role=combobox]").click();
    }

    public void clickOnFilterLoToHi() {
        $("[data-value=by_price_asc]").click();
    }

    public int getPrice(int productIndex) {
        String price = $$(".MuiTypography-h4.ui-catalog-card__price")
                .get(productIndex - 1).getText();
        return Integer.parseInt(price.replaceAll("[^0-9]", ""));
    }

    public void waitForReload(String url) {
        webdriver().shouldHave(urlContaining(url));
    }

    public void clickOnEbook() {
        $(".catalog__filter a[href*=\"ebook\"]").click();
    }

    public int getCountOfProductsOnPage() {
        return $$("a.ui-catalog-card--variant-default").size();
    }

    public int checkOnlyEbook() {
        return $$("a.ui-catalog-card--variant-default .ui-catalog-card__top")
                .filterBy(text("EBOOK")).size();
    }

    public int checkOutOfStock() {
        return $$("p.ui-catalog-card__soon-available").size();
    }

    public void changeCatalogSize(String buttonName) {
        $("button[aria-label='" + buttonName + "']").click();
    }

    public int getProductSize() {
        Dimension productCardSize = $("a.ui-catalog-card--variant-default")
                .getWrappedElement().getSize();
        int width = productCardSize.width;
        return width;
    }

    public String currentCatalogName() {
        return $(".catalog__switcher .is-active").shouldBe(visible)
                .getAttribute("aria-label");
    }

    public CategoryPage waitForActiveButton(String buttonName) {
        $(".catalog__switcher [aria-label='" + buttonName + "']")
                .shouldHave(cssClass("is-active"));
        return this;
    }
}
