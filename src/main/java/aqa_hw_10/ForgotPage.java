package aqa_hw_10;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;

public class ForgotPage {
    @Step("Send the login {login} to the field")
    public void forgotField(String login) {
        $("[id=\"FORGOTPASSWD_PHONE_OR_LOGIN\"]").sendKeys(login);
    }

    @Step("Find submit button")
    public void submitButton() {
        $("[name=\"send_account_info\"]").click();
    }

    @Step("Check result on forgot page")
    public boolean result() {
        return $(".alert-danger").isDisplayed();
    }
}
