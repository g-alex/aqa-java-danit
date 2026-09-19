package aqa_hw_8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProductPage {
    private WebDriver driver;
    private WebDriverWait waiter;
    public static final By PRODUCT_TITLE = By.cssSelector("h1.title__main");

    public ProductPage(WebDriver driver) {
        this.driver = driver;
        waiter = new WebDriverWait(driver, Duration.ofSeconds(3));
    }

    public String getProductTitle() {
        waiter.until(ExpectedConditions.visibilityOfElementLocated(PRODUCT_TITLE));
        WebElement titleText = driver.findElement(PRODUCT_TITLE);
        return titleText.getText();
    }
}
