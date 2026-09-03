package aqa_hw_5.fluent;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;
import java.util.List;

import static java.lang.Thread.sleep;

public class Main_1 {
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

            fluentWait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[type='text']")));
            WebElement searchField = driver.findElement(By.cssSelector("[type='text']"));
            searchField.sendKeys(search, Keys.ENTER);

            fluentWait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".compare-button-wrapper")));
            List<WebElement> compareList = driver.findElements(By.cssSelector(".compare-button-wrapper"));

            WebElement productOne = compareList.get(0);
            productOne.click();
            sleep(500); //site need little delay between clicks
            WebElement productTwo = compareList.get(1);
            productTwo.click();


            fluentWait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".popover.product-compare")));
            WebElement compareButton = driver.findElement(By.cssSelector(".popover.product-compare"));
            compareButton.click();

            fluentWait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".profile-sidebar__section-child-container .text-gray")));
            WebElement compareCount = driver.findElement(By.cssSelector(".profile-sidebar__section-child-container .text-gray"));
            String replaceText = compareCount.getText();
            replaceText = replaceText.replace("(", "").replace(")", "");
            int count = Integer.parseInt(replaceText);
            System.out.println(count);
            Assert.assertEquals(2, count);
        } catch (AssertionError | InterruptedException ex) {
            ex.printStackTrace();
        } finally {
            driver.quit();
        }
    }

}
