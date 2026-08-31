package aqa_hw_9;

import static com.codeborne.selenide.Selenide.$;

public class HomePage {
    public void enterSearch(String text) {
        $("[type=\"text\"]").setValue(text).pressEnter();
    }

    public void clickLoginPage() {
        $("a.user-button").click();
    }
}
