package aqa_hw_11;

import io.qameta.allure.Step;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class SearchResultPage {
    @Step("Get search result title")
    public String getSearchTitleText() {
        return $("div.search-page-wrap div.form-control input[type=\"text\"]").getValue();
    }

    @Step("Click on 'in stock' filer checkbox")
    public void clickInStock() {
        $("[title=\"В наявності\"]").click();
    }

    public void checkOnOutOfStock() {
        $$("div.item-stock .value.font_sxs").filterBy(text("Немає у постачальника")).shouldHave(size(0));
    }

}
