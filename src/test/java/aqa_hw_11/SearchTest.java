package aqa_hw_11;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchTest extends BaseTest {
    @Test(description = "TestCaseID=46")
    @Epic("Search")
    @Feature("Valid Search")
    @Description("Verify that search results contain the entered keyword")
    public void positiveSearchTest() {
        String textToSearch = "Фантастика";

        SearchResultPage searchResultsPage = new HomePage().enterTextToSearch(textToSearch);

        String actualTitle = searchResultsPage.getSearchTitleText();

        Assert.assertTrue(actualTitle.contains(textToSearch));

    }
}
