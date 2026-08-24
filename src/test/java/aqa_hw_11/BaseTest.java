package aqa_hw_11;

import aqa_hw_11.testrail.TestrailApi;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static com.codeborne.selenide.Selenide.open;


public class BaseTest {

    @BeforeMethod
    static void init() {
        open("https://book24.ua/ua/");
    }
    @AfterMethod
    public void sendResults(ITestResult testResult) {
        String result = testResult.getMethod().getDescription();
        int id = Integer.parseInt(result.replace("TestCaseID=",""));
        System.out.println(id);
        if (testResult.getStatus() == ITestResult.SUCCESS){
            TestrailApi.sendResult(1,id);
        }
        else {
            TestrailApi.sendResult(5,id);
        }

    }
}
