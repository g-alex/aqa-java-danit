package final_project;

import com.codeborne.selenide.WebDriverRunner;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchTests extends BaseTest {

    @Test(description = "TestCaseID=50")
    @Epic("Search")
    @Feature("Search")
    @Description("Test search with correct word")
    public void searchWithCorrectWord() {
        String textToSearch = "Дюна";

        SearchResultPage searchResultPage = new HomePage().clickOnSearchField().enterTextToSearch(textToSearch).pressEnter();
        String searchResultTitle = searchResultPage.getSearchTitleText();
        Assert.assertTrue(searchResultTitle.contains(textToSearch));
    }

    @Test(description = "TestCaseID=51")
    @Epic("Search")
    @Feature("Search")
    @Description("Test search with incorrect word")
    public void searchWithIncorrectWord() {
        String textToSearch = "gsdgsdgsdg";

        SearchResultPage searchResultPage = new HomePage().clickOnSearchField().enterTextToSearch(textToSearch).pressEnter();
        String searchResultText = searchResultPage.getEmptySearchText();

        Assert.assertTrue(searchResultText.contains("Нічого не знайдено"));
    }

    @Test(description = "TestCaseID=52")
    @Epic("Search")
    @Feature("Search")
    @Description("Test search with empty field")
    public void searchWithEmptyField() {
        new HomePage().clickOnSearchField().pressEnterOnEmpty();

        Assert.assertEquals(WebDriverRunner.url(), "https://ksd.ua/");
    }

    @Test(description = "TestCaseID=53")
    @Epic("Search")
    @Feature("Search")
    @Description("Check dropdown hints are shown after entering word")
    public void dropdownCheck() {
        String textToSearch = "Дюна";

        HomePage homePage = new HomePage().clickOnSearchField().enterTextToSearch(textToSearch);
        String dropdownText = homePage.getDropdownText();

        Assert.assertTrue(dropdownText.contains(textToSearch));
    }

    @Test(description = "TestCaseID=54")
    @Epic("Search")
    @Feature("Search")
    @Description("Test search with special character")
    public void searchWithSpecialCharacter() {
        String textToSearch = "`";

        SearchResultPage searchResultPage = new HomePage().clickOnSearchField().enterTextToSearch(textToSearch).pressEnter();
        String searchResultText = searchResultPage.getSearchErrorText();

        Assert.assertTrue(searchResultText.contains("Вибачте, на сайті виникла помилка"));
    }


    @Test(description = "TestCaseID=60")
    @Epic("Search")
    @Feature("Search")
    @Description("Test on product name same in search result page and product page")
    public void openProductPage() {
        String textToSearch = "Дюна";

        SearchResultPage searchResultPage = new HomePage().searchFor(textToSearch);
        String nameOnSearchPage = searchResultPage.getProductName(1);
        String productTitle = searchResultPage.clickOnProduct(1).productTitle();

        Assert.assertEquals(nameOnSearchPage, productTitle);
    }
}
