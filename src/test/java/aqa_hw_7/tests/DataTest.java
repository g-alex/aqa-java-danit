package aqa_hw_7.tests;

import aqa_hw_7.data.ProvideData;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DataTest extends BaseTest {

    @Test(dataProvider = "getSearchData", dataProviderClass = ProvideData.class,groups = {"positive"})
    public void searchTest(String searchString, String searchResult)  {
        WebElement searchField = getDriver().findElement(By.cssSelector("[type=\"text\"]"));
        searchField.sendKeys(searchString, Keys.ENTER);

        WebElement searchTitle = getDriver().findElement(By.cssSelector("div.search__title"));
        String titleString = searchTitle.getText();
        boolean titleCheck = titleString.contains(searchResult);
        Assert.assertTrue(titleCheck);
    }
}
