package aqa_hw_11;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;

public class SubscribePage {
    @Step("Set {emailValue} in email field")
    public void setEmail(String emailValue) {
        $("[id=\"POPUP_EMAIL\"]").setValue(emailValue);
    }

    @Step("Click on continue bitton on subscribe newletter popup")
    public void clickContinueButton() {
        $("[name=\"web_form_submit\"]").click();
    }

    @Step("Check on error text")
    public boolean checkOnError() {
        return $("[id=\"POPUP_EMAIL-error\"]").isDisplayed();
    }
}
