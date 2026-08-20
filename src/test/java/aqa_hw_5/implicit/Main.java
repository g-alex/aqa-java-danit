package aqa_hw_5.implicit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Main {
    public static void main(String[] args) {
        String string = "Зарядная";
        String url = "https://hotline.ua/";
        WebDriver driver = new ChromeDriver();

        try {
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
            driver.manage().window().maximize();
            driver.get(url);

            WebElement search = driver.findElement(By.cssSelector("[type='text']"));
            search.sendKeys(string, Keys.ENTER);

            WebElement afterSearch = driver.findElement(By.xpath("//div[contains(@class, 'search-sidebar-catalogs__name') and contains(text(), 'Зарядні станції')]"));
            afterSearch.click();

            WebElement filterTitle = driver.findElement(By.cssSelector("span.text-x-lg"));
            String titleSting = filterTitle.getText();
            Assert.assertEquals(titleSting, "Фільтри");
        } catch (AssertionError ex) {
            ex.printStackTrace();
        } finally {
            driver.quit();
        }
    }

}
