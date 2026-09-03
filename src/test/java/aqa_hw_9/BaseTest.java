package aqa_hw_9;

import org.testng.annotations.BeforeMethod;

import static com.codeborne.selenide.Selenide.open;

public class BaseTest {

    @BeforeMethod
    public void init() {
        open("https://hotline.ua/");
    }
}
