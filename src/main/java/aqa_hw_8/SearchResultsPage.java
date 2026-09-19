package aqa_hw_8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class SearchResultsPage {
    private WebDriver driver;
    private WebDriverWait waiter;

    public static final By ITEM_TITLE = By.cssSelector("div.search__title");

    public static final By ELEMENTS_LIST = By.cssSelector("a.item-title");


    public SearchResultsPage(WebDriver driver) {
        this.driver = driver;
        waiter = new WebDriverWait(driver, Duration.ofSeconds(3));

    }

    public String searchTitle() {
        waiter.until(ExpectedConditions.visibilityOfElementLocated(ITEM_TITLE));
        WebElement titleText = driver.findElement(ITEM_TITLE);
        return titleText.getText();

    }

    private WebElement getElement(int index) {
        waiter.until(ExpectedConditions.visibilityOfElementLocated(ELEMENTS_LIST));
        List<WebElement> list = driver.findElements(ELEMENTS_LIST);
        return list.get(index - 1);
    }

    public String getNameProduct(int index) {
        WebElement name = getElement(index);
        return name.getText();
    }

    public void clickOnProduct(int index) {
        WebElement name = getElement(index);
        name.click();
    }
}
