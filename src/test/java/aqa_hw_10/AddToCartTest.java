package aqa_hw_10;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddToCartTest extends BaseTest {
    @Test
    @Epic("Cart")
    @Feature("Add to Cart")
    @Description("Verify that success add to cart from product page")
    public void addToCart() {
        String textToSearch = "Пригоди тома";
        int productIndex = 1;

        SearchResultsPage searchResultsPage = new HomePage().enterTextToSearch(textToSearch);

        String productName = searchResultsPage.getProductName(productIndex);

        Cart cart = searchResultsPage.clickOnProduct(productIndex).addToCart();

        String cartItemText = cart.getItemText();

        Assert.assertEquals(productName, cartItemText);
    }
}
