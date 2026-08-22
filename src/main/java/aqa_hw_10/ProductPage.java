package aqa_hw_10;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;

public class ProductPage {
    @Step("Get title text on search page")
    public String productTitle() {
        return $("[id=\"pagetitle\"]").getText();

    }

    @Step("Add to Cart")
    public Cart addToCart() {
        $(".btn-lg.to-cart").click();
        return new Cart();
    }
}
