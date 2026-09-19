package final_project;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThanOrEqual;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class SearchResultPage {
    private static final String PRODUCT_NAME = "p.ui-catalog-card__title";

    public String getSearchTitleText() {
        return $("h1.MuiTypography-h1").shouldBe(visible).getText();
    }

    public String getSearchErrorText() {
        return $("[class*=\"error-block\"] .MuiTypography-h1").shouldBe(visible).getText();
    }

    public String getEmptySearchText() {
        return $(".MuiTypography-h3").shouldBe(visible).getText();
    }

    public String getProductName(int productIndex) {
        $(PRODUCT_NAME).shouldBe(visible);
        return $$(PRODUCT_NAME)
                .shouldHave(sizeGreaterThanOrEqual(productIndex)).get(productIndex - 1).getText();
    }

    public ProductPage clickOnProduct(int productIndex) {
        $$(PRODUCT_NAME)
                .shouldHave(sizeGreaterThanOrEqual(productIndex)).get(productIndex - 1).click();
        return new ProductPage();
    }
}
