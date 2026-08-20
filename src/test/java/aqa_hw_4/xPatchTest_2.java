package aqa_hw_4;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.sleep;

public class xPatchTest_2 {
    public static void main(String[] args) throws InterruptedException {
        String url = "https://hotline.ua";
        WebDriver driver = new ChromeDriver();
        try {
            driver.get(url);
            driver.manage().window().maximize();

            WebElement searchField = driver.findElement(By.xpath("//*[@placeholder='Знайти товар, магазин, бренд']"));
            searchField.sendKeys("Iphone");
            sleep(1000);

            WebElement searchButton = driver.findElement(By.xpath("//button[@class='search__btn flex middle-xs center-xs']"));
            searchButton.click();
            sleep(7000);

            WebElement categoryButton = driver.findElement(By.xpath("//button[@title='Додати товар у порівняння']"));
            categoryButton.click();
            sleep(1000);

            WebElement titleCategory = driver.findElement(By.xpath("//span[contains(@class, 'button__count') and contains(text(), '')]"));
            String titleString = titleCategory.getText();

            Assert.assertEquals(titleString, "1");
        } catch (AssertionError ex) {
            ex.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}
