package aqa_hw_10;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {
    @Step("Open forgot page")
    public ForgotPage openForgotPage() {
        $("a.forgot").click();
        return new ForgotPage();
    }
}
