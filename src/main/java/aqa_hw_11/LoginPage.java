package aqa_hw_11;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class LoginPage {

    @Step("Click on continue button")
    public LoginPage clickOnContinue() {
        $("button.btn-default span").shouldHave(text("Продовжити")).click();
        return this;
    }

    @Step("Check if error message is displayed")
    public boolean checkOnError() {
        return $("[id=\"AUTH_PHONE_OR_LOGIN-error\"]").isDisplayed();
    }
}
