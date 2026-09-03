package aqa_hw_10;

import io.qameta.allure.*;
import org.junit.Assert;
import org.testng.annotations.Test;


public class ProductPageTest extends BaseTest {
    @Test
    @Epic("Catalog")
    @Feature("Product Page")
    @Description("Verify that product page opened from search page")
    public void productPage() {
        String textToSearch = "Пригоди тома";
        int productIndex = 1;

        SearchResultsPage searchResultsPage = new HomePage().enterTextToSearch(textToSearch);

        String productName = searchResultsPage.getProductName(productIndex);
        ProductPage productPage = searchResultsPage.clickOnProduct(productIndex);

        String productTitle = productPage.productTitle();

        Assert.assertTrue(productName, productTitle.contains(productName));
    }
}
