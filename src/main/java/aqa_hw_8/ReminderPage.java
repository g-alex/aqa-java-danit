package aqa_hw_8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ReminderPage {
    private WebDriver driver;
    private WebDriverWait waiter;

    public static final By TEXT_FIELD = By.cssSelector("[type='text']");
    public static final By BUTTON_TITLE = By.cssSelector("*.reminder-form__button");
    public static final By ERROR_TEXT = By.cssSelector(".error.m_b-5");

    public ReminderPage(WebDriver driver) {
        this.driver = driver;
        waiter = new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    public void emailField(String email) {
        waiter.until(ExpectedConditions.visibilityOfElementLocated(TEXT_FIELD));
        WebElement field = driver.findElement(TEXT_FIELD);
        field.sendKeys(email);
    }

    public void buttonClick() {
        waiter.until(ExpectedConditions.visibilityOfElementLocated(BUTTON_TITLE));
        WebElement button = driver.findElement(BUTTON_TITLE);
        button.click();
    }

    public boolean errorText() {
        waiter.until(ExpectedConditions.visibilityOfElementLocated(ERROR_TEXT));
        WebElement text = driver.findElement(ERROR_TEXT);
        boolean check = text.isDisplayed();
        return check;
    }
}
