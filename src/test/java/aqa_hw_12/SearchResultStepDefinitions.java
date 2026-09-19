package aqa_hw_12;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class SearchResultStepDefinitions extends BaseStepDefinition {
    private SearchResultPage searchResultPage = new SearchResultPage();

    @When("User remember {int} product name on Search Result Page")
    public void rememberProductName(int productIndex) {
        String expectedProductName = searchResultPage.getProductName(productIndex);
        putValueToMapByKey("expectedProductName", expectedProductName);

    }

    @When("User clicks on {int} product picture on Search Result Page")
    public void clickOnProductPicture(int productIndex) {
        searchResultPage.clickOnProductPicture(productIndex);
    }

    @Then("Title contains {string} search word on Search Result Page")
    public void verifyTitle(String wordToVerify) {
        String actualTitle = searchResultPage.getTitle();
        Assert.assertTrue(actualTitle.contains(wordToVerify));
    }

    @When("User click on compare button on first product in list")
    public void clickOnCompareButtonOnProduct() {
        searchResultPage.clickOnCompareButtonOnProduct();
    }

    @When("User click on compare button in header menu")
    public void clickOnCompareButtonInHeader() {
        searchResultPage.clickOnCompareButtonInHeader();
    }

    @When("User click on category in dropdown menu in compare list")
    public void clickOnCategoryInCompareDropdown() {
        searchResultPage.clickOnCategoryInCompareDropdown();
    }
}
