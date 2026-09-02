package aqa_hw_11;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.testng.annotations.Test;

public class FilterInStockTest extends BaseTest {
    @Test(description = "TestCaseID=48")
    @Epic("Search")
    @Feature("In stock filter")
    @Description("Test filter 'in stock'")
    public void positiveSearchTest() {
        String textToSearch = "одиссея";

        SearchResultPage searchResultsPage = new HomePage().enterTextToSearch(textToSearch);
        searchResultsPage.clickInStock();
        searchResultsPage.checkOnOutOfStock();

    }
}
