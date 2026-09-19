package aqa_hw_8;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static java.lang.Thread.sleep;

public class HomePage {

    private WebDriver driver;
    private WebDriverWait waiter;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        waiter = new WebDriverWait(driver, Duration.ofSeconds(3));
    }

    public void enterSearch(String textSearch) {
        WebElement searchField = driver.findElement(By.cssSelector("[type='text']"));
        searchField.sendKeys(textSearch, Keys.ENTER);
    }

    public void clickLoginButton() {
        WebElement loginButton = driver.findElement(By.cssSelector("div.user-info"));
        loginButton.click();
    }
}
