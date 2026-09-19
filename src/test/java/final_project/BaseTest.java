package final_project;

import final_project.testrail.TestrailApi;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static com.codeborne.selenide.Selenide.clearBrowserCookies;
import static com.codeborne.selenide.Selenide.open;

public class BaseTest {

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
                TestrailApi.sendResult(1, id);
            } else {
                TestrailApi.sendResult(5, id);
            }
        } catch (Exception ex) {
            System.out.println("TestRail send failed: " + ex.getMessage());
        }


    }
}

