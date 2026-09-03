package final_project;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class ProductPage {
    public String productTitle() {
        return $("h1.MuiTypography-h3").shouldBe(visible).getText();
    }

    public ProductPage clickAddToCart() {
        $(".MuiButton-fullWidth[aria-label=\"Додати в кошик\"]").click();
        return this;
    }

    public String getPopupText() {
        return $("[class*='popper-container'] .MuiTypography-h4").shouldBe(visible).getText();
    }

    public int getCountOnCartButton() {
        return Integer.parseInt($(".MuiBadge-standard.MuiBadge-anchorOriginTopRightCircular").getText());
    }

    public CartPage clickOnCartButton() {
        $("[class*='header-cart-button']").click();
        return new CartPage();
    }

    public int getProductPrice() {
        String price = $("[class*='short-information'] .MuiTypography-h2").shouldBe(visible).getText();
        return Integer.parseInt(price.replaceAll("[^0-9]", ""));
    }
}
