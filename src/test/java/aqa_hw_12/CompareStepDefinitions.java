package aqa_hw_12;

import io.cucumber.java.en.Then;
import org.junit.Assert;

public class CompareStepDefinitions {
    @Then("Verify error text is displayed on Compare Page")
    public void verifyDisplayedError() {
        ComparePage comparePage = new ComparePage();
        Assert.assertTrue(comparePage.checkOnErrorText());
    }
}
