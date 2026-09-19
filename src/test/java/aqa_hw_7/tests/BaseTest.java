package aqa_hw_7.tests;

import aqa_hw_7.listener.Listener;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

import java.time.Duration;

@Listeners(Listener.class)
public class BaseTest {
    private WebDriver driver;

    @BeforeMethod
    public void initDriver() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://hotline.ua/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

    }

    @AfterMethod
    public void closeDriver() {
        this.driver.quit();
    }

    public WebDriver getDriver() {
        return this.driver;
    }
}
