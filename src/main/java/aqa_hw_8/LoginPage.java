package aqa_hw_8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {
    private WebDriver driver;
    private WebDriverWait waiter;
    public static final By REMINDER_BUTTON = By.cssSelector("[href=\"/ua/reminder/\"]");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        waiter = new WebDriverWait(driver, Duration.ofSeconds(3));
    }

    public void reminderClick() {
        waiter.until(ExpectedConditions.visibilityOfElementLocated(REMINDER_BUTTON));
        WebElement reminder = driver.findElement(REMINDER_BUTTON);
        reminder.click();
    }

}
