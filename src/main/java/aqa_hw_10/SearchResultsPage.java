package aqa_hw_10;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class SearchResultsPage {

    @Step("Get search result title")
    public String searchResultTitle() {
        return $("div.search-page-wrap div.form-control input[type=\"text\"]").getValue();
    }

    @Step("Get error message")
    public boolean getErrorMessage() {
        return $(".alert-danger").isDisplayed();
    }

    private SelenideElement getElement(int index) {
        ElementsCollection element = $$(".item_info");
        return element.get(index - 1);
    }

    @Step("Get product name {index}")
    public String getProductName(int index) {
        SelenideElement currentProduct = getElement(index);
        return currentProduct.$("a.dark_link.option-font-bold").getText();
    }

    @Step("Click on product {index}")
    public ProductPage clickOnProduct(int index) {
        SelenideElement currentProduct = getElement(index);
        currentProduct.$(".dark_link").click();
        return new ProductPage();
    }
}
