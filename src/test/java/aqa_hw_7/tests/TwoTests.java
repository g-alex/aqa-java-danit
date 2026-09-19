package aqa_hw_7.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TwoTests extends BaseTest{

    @Test(groups = {"positive"})
    public void themeTest()
    {
        WebElement themeButton = getDriver().findElement(By.cssSelector("button.color-switcher.hidden-below-xl"));
        themeButton.click();

        WebElement themeType = getDriver().findElement(By.cssSelector(".light-mode"));
        Assert.assertTrue(themeType.isDisplayed());
    }
    @Test(groups = {"negative"})
    public  void wrongSearch()
    {
        WebElement cityButton = getDriver().findElement(By.cssSelector("div.location__city"));
        cityButton.click();

        WebElement cityField = getDriver().findElement(By.cssSelector("[placeholder='Почніть вводити назву']"));
        cityField.sendKeys("gdfgdfgfdgdfg");

        WebElement fieldText = getDriver().findElement(By.cssSelector("div.search__not-found"));
        Assert.assertTrue(fieldText.isDisplayed());
    }
}
