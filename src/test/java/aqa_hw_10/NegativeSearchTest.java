package aqa_hw_10;

import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NegativeSearchTest extends BaseTest {
    @Test
    @Epic("Search")
    @Feature("Invalid search")
    @Description("Verify that search result returned 0 when search word -- {textToSearch} --- can`t find")
    @Link(name = "Search", url = "https://book24.ua/ua/catalog/?q=")
    @Issue("JIRA-00002")
    public void negativeSearchTest() {
        String textToSearch = "dfhdfhdhdfhdf";

        SearchResultsPage searchResultsPage = new HomePage().enterTextToSearch(textToSearch);

        Assert.assertTrue(searchResultsPage.getErrorMessage());
    }
}
