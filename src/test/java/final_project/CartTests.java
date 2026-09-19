package final_project;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.refresh;

public class CartTests extends BaseTest {

    @Test(description = "TestCaseID=61")
    @Epic("Cart")
    @Feature("Cart")
    @Description("Product can be added to cart")
    public void addProductToCart() {
        String textToSearch = "Дюна";

        SearchResultPage searchResultPage = new HomePage().searchFor(textToSearch);

        ProductPage productPage = searchResultPage.clickOnProduct(1);

        String productTitle = productPage.productTitle();

        String popupText = productPage.clickAddToCart().getPopupText();
        int countOnCart = productPage.getCountOnCartButton();
        String nameInCart = productPage.clickOnCartButton().getNameInCart();

        Assert.assertEquals(popupText, "Товар додано до кошика!");
        Assert.assertEquals(countOnCart, 1);
        Assert.assertEquals(nameInCart, productTitle);
    }

    @Test(description = "TestCaseID=62")
    @Epic("Cart")
    @Feature("Cart")
    @Description("Quantity can be changed")
    public void addProductQuantity() {
        String textToSearch = "Дюна";

        SearchResultPage searchResultPage = new HomePage().searchFor(textToSearch);

        ProductPage productPage = searchResultPage.clickOnProduct(1);

        String productTitle = productPage.productTitle();

        String popupText = productPage.clickAddToCart().getPopupText();
        int countOnCart = productPage.getCountOnCartButton();

        CartPage cartPage = productPage.clickOnCartButton();
        String nameInCart = cartPage.getNameInCart();

        Assert.assertEquals(popupText, "Товар додано до кошика!");
        Assert.assertEquals(countOnCart, 1);
        Assert.assertEquals(nameInCart, productTitle);

        int priceBefore = cartPage.getTotalSum();

        int expectedPrice = priceBefore * 2;

        cartPage.clickPlusButton();
        cartPage.waitForTotalSum(expectedPrice);

        int priceAfter = cartPage.getTotalSum();
        int countAfter = cartPage.getProductCount();

        Assert.assertEquals(priceAfter, expectedPrice);
        Assert.assertEquals(countAfter, 2);
    }

    @Test(description = "TestCaseID=63")
    @Epic("Cart")
    @Feature("Cart")
    @Description("Product price in cart is the same as on product page")
    public void comparePriceOnPageAndCart() {
        String textToSearch = "Дюна";

        SearchResultPage searchResultPage = new HomePage().searchFor(textToSearch);

        ProductPage productPage = searchResultPage.clickOnProduct(1);

        int priceOnProductPage = productPage.getProductPrice();

        String popupText = productPage.clickAddToCart().getPopupText();
        int countOnCart = productPage.getCountOnCartButton();

        Assert.assertEquals(popupText, "Товар додано до кошика!");
        Assert.assertEquals(countOnCart, 1);

        CartPage cartPage = productPage.clickOnCartButton();
        int priceInCart = cartPage.getProductPrice();

        Assert.assertEquals(priceInCart, priceOnProductPage);
    }

    @Test(description = "TestCaseID=64")
    @Epic("Cart")
    @Feature("Cart")
    @Description("Product can be removed from cart")
    public void removeProductFromCart() {
        String textToSearch = "Дюна";

        SearchResultPage searchResultPage = new HomePage().searchFor(textToSearch);

        ProductPage productPage = searchResultPage.clickOnProduct(1);

        String productTitle = productPage.productTitle();

        String popupText = productPage.clickAddToCart().getPopupText();
        int countOnCart = productPage.getCountOnCartButton();

        CartPage cartPage = productPage.clickOnCartButton();
        String nameInCart = cartPage.getNameInCart();

        Assert.assertEquals(popupText, "Товар додано до кошика!");
        Assert.assertEquals(countOnCart, 1);
        Assert.assertEquals(nameInCart, productTitle);

        cartPage.removeProduct();
        String emptyCart = cartPage.getEmptyCartText();

        Assert.assertEquals(emptyCart, "Тут поки що нічого не має");

    }

    @Test(description = "TestCaseID=65")
    @Epic("Cart")
    @Feature("Cart")
    @Description("Cart is saved after page refresh")
    public void cartSavedAfterReload() {
        String textToSearch = "Дюна";

        SearchResultPage searchResultPage = new HomePage().searchFor(textToSearch);

        ProductPage productPage = searchResultPage.clickOnProduct(1);

        String productTitle = productPage.productTitle();


        String popupText = productPage.clickAddToCart().getPopupText();
        int countOnCart = productPage.getCountOnCartButton();

        CartPage cartPage = productPage.clickOnCartButton();
        String nameInCart = cartPage.getNameInCart();

        Assert.assertEquals(popupText, "Товар додано до кошика!");
        Assert.assertEquals(countOnCart, 1);
        Assert.assertEquals(nameInCart, productTitle);

        refresh();
        String nameAfterReload = productPage.clickOnCartButton().getNameInCart();
        int countOnCartAfterRefresh = productPage.getCountOnCartButton();

        Assert.assertEquals(countOnCartAfterRefresh, 1);
        Assert.assertEquals(nameAfterReload, nameInCart);
    }
}
