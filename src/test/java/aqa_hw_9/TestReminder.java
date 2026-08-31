package aqa_hw_9;

import org.junit.Assert;
import org.testng.annotations.Test;

public class TestReminder extends BaseTest {
    @Test
    public void testReminderPage() {
        String email = "testemail";

        HomePage homePage = new HomePage();
        homePage.clickLoginPage();

        LoginPage loginPage = new LoginPage();
        loginPage.reminderClick();

        ReminderPage reminderPage = new ReminderPage();
        reminderPage.emailField(email);

        reminderPage.buttonClick();
        boolean checkError = reminderPage.errorText();
        Assert.assertTrue(checkError);
    }
}
