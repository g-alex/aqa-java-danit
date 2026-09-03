package aqa_hw_9;

import org.junit.Assert;
import org.testng.annotations.Test;

public class SearchVerify extends BaseTest {
    @Test
    public void verifySearch() {
        String textSearch = "Кавомашина";

        HomePage homePage = new HomePage();
        homePage.enterSearch(textSearch);

        SearchResultsPage result = new SearchResultsPage();
        String actualText = result.searchResultTitle();
        System.out.println(actualText);

        Assert.assertTrue(actualText.contains(textSearch));
    }
}
