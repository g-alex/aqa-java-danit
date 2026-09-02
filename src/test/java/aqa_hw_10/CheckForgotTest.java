package aqa_hw_10;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckForgotTest extends BaseTest {

    @Test
    @Epic("Login")
    @Feature("Reminder Page")
    @Description("Verify that wrong data not found")
    public void checkForgotPage() {
        String login = "test";

        ForgotPage forgotPage = new HomePage().openLoginPage().openForgotPage();
        forgotPage.forgotField(login);
        forgotPage.submitButton();

        boolean checkResult = forgotPage.result();

        Assert.assertTrue(checkResult);
    }
}
