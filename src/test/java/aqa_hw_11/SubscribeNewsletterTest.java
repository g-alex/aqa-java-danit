package aqa_hw_11;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SubscribeNewsletterTest extends BaseTest {
    @Test(description = "TestCaseID=49")
    @Epic("Subscribe")
    @Feature("Subscribe page")
    @Description("Verify that error appears when submitting wrong format email")
    public void checkSubscribeWrongFormat() {
        String wrongEmail = "test";
        SubscribePage subscribePage = new HomePage().clickOnSubscribeButton();
        subscribePage.setEmail(wrongEmail);
        subscribePage.clickContinueButton();

        boolean checkOnError = subscribePage.checkOnError();

        Assert.assertTrue(checkOnError);
    }
}
