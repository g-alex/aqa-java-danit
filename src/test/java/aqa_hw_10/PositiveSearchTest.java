package aqa_hw_10;

import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.Test;


public class PositiveSearchTest extends BaseTest {

    @Test
    @Epic("Search")
    @Feature("Valid Search")
    @Description("Verify that search results contain the entered keyword - {textToSearch}")
    @Link(name = "Search", url = "https://book24.ua/ua/catalog/?q=")
    @Issue("JIRA-00001")
    public void positiveSearchTest() {
        String textToSearch = "Фантастика";

        SearchResultsPage searchResultsPage = new HomePage().enterTextToSearch(textToSearch);

        String actualTitle = searchResultsPage.searchResultTitle();

        Assert.assertTrue(actualTitle.contains(textToSearch));

    }
}
