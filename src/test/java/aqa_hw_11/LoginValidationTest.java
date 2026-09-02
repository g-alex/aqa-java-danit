package aqa_hw_11;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginValidationTest extends BaseTest {
    @Test(description = "TestCaseID=47")
    @Epic("Login")
    @Feature("Empty login")
    @Description("Verify that error appears when submitting empty login form")
    public void checkEmptyLogin() {

        LoginPage loginPage = new HomePage().openLoginPage().clickOnContinue();
        boolean checkOnError = loginPage.checkOnError();

        Assert.assertTrue(checkOnError);
    }
}
