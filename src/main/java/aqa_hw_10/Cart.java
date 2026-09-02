package aqa_hw_10;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class Cart {
    @Step("Get cart items name")
    public String getItemText() {
        return $("div.description .name").shouldBe(visible).getText();
    }
}
