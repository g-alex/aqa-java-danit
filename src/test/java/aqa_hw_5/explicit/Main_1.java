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

public class Main_1 {
    public static void main(String[] args) {
        String url = "https://hotline.ua/";
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        try {

            driver.manage().window().maximize();
            driver.get(url);

            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class='icon-section--categories icon-section--categories--dom']")));
            WebElement dom = driver.findElement(By.cssSelector("[class='icon-section--categories icon-section--categories--dom']"));
            dom.click();

            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class, 'section-navigation__link-text') and contains(text(), 'Ліжка')]")));
            WebElement krovati = driver.findElement(By.xpath("//div[contains(@class, 'section-navigation__link-text') and contains(text(), 'Ліжка')]"));
            krovati.click();

            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[id='catalogListContainer']")));
            WebElement catalogContainer = driver.findElement(By.cssSelector("[id='catalogListContainer']"));

            Assert.assertTrue(catalogContainer.isDisplayed());
        } catch (AssertionError ex) {
            ex.printStackTrace();
        } finally {
            driver.quit();
        }
    }

}
