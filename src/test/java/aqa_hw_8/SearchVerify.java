package aqa_hw_8;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchVerify extends BaseTest {

    @Test
    public void verifySearch() {
        String textSearch = "Кавомашина";
        HomePage homePage = new HomePage(getDriver());

        homePage.enterSearch(textSearch);

        SearchResultsPage result = new SearchResultsPage(getDriver());
        String actualText = result.searchTitle();

        Assert.assertTrue(actualText.contains(textSearch));
    }
}
