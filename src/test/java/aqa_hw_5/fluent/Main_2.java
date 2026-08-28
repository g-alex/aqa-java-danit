package aqa_hw_5.fluent;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;


public class Main_2 {
    public static void main(String[] args) {
        String url = "https://hotline.ua/";
        String search = "Кавомашина";
        WebDriver driver = new ChromeDriver();
        FluentWait<WebDriver> fluentWait = new FluentWait<>(driver)
                .pollingEvery(Duration.ofMillis(500))
                .withTimeout(Duration.ofSeconds(5))
                .ignoring(IllegalArgumentException.class);

        try {

            driver.manage().window().maximize();
            driver.get(url);

            fluentWait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.user-info")));
            WebElement user = driver.findElement(By.cssSelector("div.user-info"));
            user.click();

            fluentWait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[href=\"/ua/reminder/\"]")));
            WebElement remindPass = driver.findElement(By.cssSelector("[href=\"/ua/reminder/\"]"));
            remindPass.click();


            fluentWait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button.reminder-form__button")));
            WebElement remindButton = driver.findElement(By.cssSelector("button.reminder-form__button"));

            Assert.assertTrue(remindButton.isDisplayed());
        } catch (AssertionError ex) {
            ex.printStackTrace();
        } finally {
            driver.quit();
        }
    }

}
