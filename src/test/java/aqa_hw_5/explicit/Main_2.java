package aqa_hw_5.implicit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Main_2 {
    public static void main(String[] args) {
        String url = "https://hotline.ua/";
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        try {

            driver.manage().window().maximize();
            driver.get(url);

            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".services-section__link.link--black.guide")));
            WebElement gid = driver.findElement(By.cssSelector(".services-section__link.link--black.guide"));
            gid.click();

            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[type='text']")));
            List<WebElement> searchList = driver.findElements(By.cssSelector("[type='text']"));
            WebElement searchField = searchList.get(1);
            searchField.sendKeys("Авто");

            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[href=\"/guides/auto/avtomobilnaya-akustika/\"]")));
            WebElement searchContainer = driver.findElement(By.cssSelector("[href=\"/guides/auto/avtomobilnaya-akustika/\"]"));

            Assert.assertTrue(searchContainer.isDisplayed());
        } catch (AssertionError ex) {
            ex.printStackTrace();
        } finally {
            driver.quit();
        }
    }

}
