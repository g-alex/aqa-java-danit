package aqa_hw_9;

import org.junit.Assert;
import org.testng.annotations.Test;

public class TestProductPage extends BaseTest {
    @Test
    public void productPage() {
        String textSearch = "Samsung";
        int productIndex = 1;

        HomePage homePage = new HomePage();
        homePage.enterSearch(textSearch);

        SearchResultsPage result = new SearchResultsPage();

        String currentName = result.getProductName(productIndex);
        result.clickOnProduct(productIndex);

        ProductPage productPage = new ProductPage();
        String actualName = productPage.getProductTitle();

        Assert.assertTrue(actualName.contains(currentName));
    }
}
