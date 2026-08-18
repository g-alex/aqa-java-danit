package aqa_hw_4;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.sleep;

public class cssTest_2 {
    public static void main(String[] args) throws InterruptedException {
        String url = "https://hotline.ua";
        WebDriver driver = new ChromeDriver();
        try {
            driver.get(url);
            driver.manage().window().maximize();

            WebElement cityButton = driver.findElement(By.cssSelector("div.location__city"));
            cityButton.click();
            sleep(1000);

            WebElement searchField = driver.findElement(By.cssSelector("[placeholder='Почніть вводити назву']"));
            searchField.sendKeys("Одеса");
            sleep(2000);

            WebElement variants = driver.findElement(By.cssSelector("[data-suggestion-index='0']"));
            String cityString = variants.getText();

            Assert.assertEquals(cityString.contains("Одеса"), true);
        } catch (AssertionError ex) {
            ex.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}
