package aqa_hw_7.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;


public class AnotherTwoTests extends BaseTest{

    @Test(groups = {"positive"})
    public void testLanguage(){
        WebElement languageButton = getDriver().findElement(By.cssSelector("div.lang-button"));
        languageButton.click();

        List<WebElement> languages = getDriver().findElements(By.cssSelector("div.lang-item"));
        WebElement languageRu = languages.get(1);
        languageRu.click();

        WebElement languageAfterChange = getDriver().findElement(By.cssSelector("div.lang-button"));
        String languageText =  languageAfterChange.getText();
        System.out.println(languageText);
        Assert.assertEquals(languageText, "RU");

    }

    @Test(groups = {"positive"})
    public void testCategory() throws InterruptedException{
        WebElement categoryIcon = getDriver().findElement(By.cssSelector("i.icon-section--categories--auto"));
        categoryIcon.click();

        WebElement categoryDiski = getDriver().findElement(By.cssSelector("div[class='section-navigation__item content'] a[href='/ua/auto/avtoshiny-i-motoshiny/']"));
        categoryDiski.click();

        WebDriverWait wait = new WebDriverWait(getDriver(),Duration.ofSeconds(5));
        wait.until(ExpectedConditions.urlToBe("https://hotline.ua/ua/auto/avtoshiny-i-motoshiny/"));

        String currentUrl = getDriver().getCurrentUrl();
        Assert.assertEquals(currentUrl,"https://hotline.ua/ua/auto/avtoshiny-i-motoshiny/");

    }

}
