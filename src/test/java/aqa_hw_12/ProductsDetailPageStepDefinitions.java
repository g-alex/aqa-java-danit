package aqa_hw_12;

import io.cucumber.java.en.Then;
import org.junit.Assert;

public class ProductsDetailPageStepDefinitions extends BaseStepDefinition {
    private ProductDetailsPage productDetailPage = new ProductDetailsPage();

    @Then("User verify product title is correct on Product Details Page")
    public void verifyProductTitle() {
        String expectedProductName = getValueFromMapByKey("expectedProductName");
        String actualProductTitle = productDetailPage.getProductName();
        Assert.assertTrue(actualProductTitle.contains(expectedProductName));
    }
}
