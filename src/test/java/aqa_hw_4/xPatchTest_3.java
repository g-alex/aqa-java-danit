package aqa_hw_4;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.String.format;
import static java.lang.Thread.sleep;

public class xPatchTest_3 {
    public static void main(String[] args) throws InterruptedException {
        String url = "https://hotline.ua";
        WebDriver driver = new ChromeDriver();
        try {
            driver.get(url);
            driver.manage().window().maximize();

            WebElement firstPopularProduct = driver.findElement(By.xpath("//*[@class='popular-products-section__product-label']"));
            firstPopularProduct.click();
            sleep(4000);

            WebElement compareButton = driver.findElement(By.xpath("//*[@class='compare-button compare-button--product-page']"));
            compareButton.click();
            sleep(1000);

            WebElement compareIcon = driver.findElement(By.xpath("//*[@class='popover product-compare']"));
            compareIcon.click();
            sleep(1000);

            WebElement compareInsideButton = driver.findElement(By.xpath("//*[@class='profile-sidebar__section-child-container']"));
            compareInsideButton.click();
            sleep(2000);

            WebElement titleCopmare = driver.findElement(By.xpath("//p[contains(@class, 'error-text-block__title')]"));
            String titleString = titleCopmare.getText();

            Assert.assertTrue(format("Error: %s", titleString), titleString.contains("Помилка"));

        } catch (AssertionError ex) {
            ex.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}
