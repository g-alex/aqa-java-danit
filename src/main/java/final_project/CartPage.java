package final_project;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;

public class CartPage {
    public static final String TOTAL_SUM_PRICE = "[class*=\"button-cart-submit-button\"] .MuiTypography-h4";

    public String getNameInCart() {
        return $(".ui-drawer__content p.MuiTypography-body2").getText();
    }

    public void clickPlusButton() {
        $("[aria-label=\"Додати\"]").click();
    }

    public int getTotalSum() {
        return Integer.parseInt($(TOTAL_SUM_PRICE).shouldBe(visible).getText());
    }

    public void waitForTotalSum(int expectedPrice) {
        $(TOTAL_SUM_PRICE).shouldHave(text(Integer.toString(expectedPrice)));
    }

    public int getProductCount() {
        return Integer.parseInt($("[class*=\"item-count\"]").getText());
    }

    public int getProductPrice() {
        String productPrice = $("[class*='cart-item-card'] .MuiTypography-h5").getText();
        return Integer.parseInt(productPrice.replaceAll("[^0-9]", ""));
    }

    public void removeProduct() {
        $("button[aria-label=\"Видалити\"]").click();
    }

    public String getEmptyCartText() {
        return $(".ui-drawer__content .MuiTypography-h3").shouldBe(visible).getText();
    }

}
