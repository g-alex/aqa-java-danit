package aqa_hw_8;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestLogin extends BaseTest {

    @Test
    public void testLoginPage() {
        String login = "testemail";

        HomePage homePage = new HomePage(getDriver());

        homePage.clickLoginButton();

        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.reminderClick();

        ReminderPage reminderPage = new ReminderPage(getDriver());

        reminderPage.emailField(login);

        reminderPage.buttonClick();

        boolean errorCheck = reminderPage.errorText();
        Assert.assertTrue(errorCheck);

    }
}
