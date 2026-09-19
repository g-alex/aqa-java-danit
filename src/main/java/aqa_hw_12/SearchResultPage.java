package aqa_hw_12;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThanOrEqual;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class SearchResultPage {
    public String getTitle() {
        return $("div.search__title").getText();
    }

    public String getProductName(int productIndex) {
        return $$("div.list-item__title-container")
                .shouldHave(sizeGreaterThanOrEqual(productIndex - 1)).get(productIndex - 1).getText();
    }

    public void clickOnProductPicture(int productIndex) {
        $$("a.list-item__img").shouldHave(sizeGreaterThanOrEqual(productIndex - 1)).get(productIndex - 1).scrollTo().click();
    }

    public void clickOnCompareButtonOnProduct() {
        $(".compare-button").click();
    }

    public void clickOnCompareButtonInHeader() {
        $(".product-compare div.button__icon.flex").click();
    }

    public void clickOnCategoryInCompareDropdown() {
        $("div.profile-sidebar__section-child-container").click();
    }
}
