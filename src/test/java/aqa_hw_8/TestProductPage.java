package aqa_hw_8;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestProductPage extends BaseTest {
    @Test
    public void productPage() {
        String textSearch = "Samsung";
        HomePage homePage = new HomePage(getDriver());

        homePage.enterSearch(textSearch);

        SearchResultsPage result = new SearchResultsPage(getDriver());

        String expectedName = result.getNameProduct(1);
        result.clickOnProduct(1);

        ProductPage productPage = new ProductPage(getDriver());

        String actual = productPage.getProductTitle();
        System.out.println(actual);
        Assert.assertTrue(actual.contains(expectedName));
    }
}
