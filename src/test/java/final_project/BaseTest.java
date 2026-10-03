package final_project;

import testrail.TestrailApi;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static com.codeborne.selenide.Selenide.clearBrowserCookies;
import static com.codeborne.selenide.Selenide.open;

public class BaseTest {

    private static final int RUN_ID = 14;

    @BeforeMethod
    public void openHomePage() {
        open("https://ksd.ua/");
        clearBrowserCookies();
    }

    @AfterMethod
    public void sendResults(ITestResult testResult) {
        String result = testResult.getMethod().getDescription();

        try {
            int id = Integer.parseInt(result.replace("TestCaseID=", ""));

            if (testResult.getStatus() == ITestResult.SUCCESS) {
                TestrailApi.sendResult(1, id, RUN_ID);
            } else {
                TestrailApi.sendResult(5, id, RUN_ID);
            }
        } catch (Exception ex) {
            System.out.println("TestRail send failed: " + ex.getMessage());
        }


    }
}

