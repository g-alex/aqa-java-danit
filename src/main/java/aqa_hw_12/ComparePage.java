package aqa_hw_12;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class ComparePage {
    public boolean checkOnErrorText() {
        return $("span.text-danger").shouldBe(visible).isDisplayed();
    }
}
