package aqa_hw_4;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.sleep;

public class cssTest_1 {
    public static void main(String[] args) throws InterruptedException {
        String url = "https://hotline.ua";
        WebDriver driver = new ChromeDriver();
        try {
            driver.get(url);
            driver.manage().window().maximize();

            WebElement menuButton = driver.findElement(By.cssSelector("div.button-menu-main"));
            menuButton.click();
            sleep(1000);

            WebElement categoryButton = driver.findElement(By.cssSelector("[data-id=\"1437\"]"));
            categoryButton.click();
            sleep(1000);

            WebElement titleCategory = driver.findElement(By.cssSelector("[id=sadovaya-tehnika]"));
            String titleString = titleCategory.getText();

            Assert.assertNotNull(titleString);
        } catch (AssertionError ex) {
            ex.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}
