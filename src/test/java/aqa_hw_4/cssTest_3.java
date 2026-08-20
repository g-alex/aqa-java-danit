package aqa_hw_4;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.sleep;

public class cssTest_3 {
    public static void main(String[] args) throws InterruptedException {
        String url = "https://hotline.ua";
        WebDriver driver = new ChromeDriver();
        try {
            driver.get(url);
            driver.manage().window().maximize();

            WebElement themeButton = driver.findElement(By.cssSelector("button.color-switcher"));
            themeButton.click();
            sleep(2000);

            WebElement theme = driver.findElement(By.cssSelector(".light-mode"));

            Assert.assertTrue(theme.isEnabled());
        } catch (AssertionError ex) {
            ex.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}
