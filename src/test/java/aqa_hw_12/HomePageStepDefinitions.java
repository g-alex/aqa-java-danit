package aqa_hw_12;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class HomePageStepDefinitions {

    private HomePage homePage = new HomePage();

    @Given("User opens Home Page")
    public void openHomePage() {
        homePage.openHomePage();
    }

    @When("User enters {string} word into search field on Home Page and press enter")
    public void enterSearchWordAndPressEnter(String wordToSearch) {
        homePage.enterSearchTextAndPressEnter(wordToSearch);
    }

    @When("User enters {string} word into search field on Home Page")
    public void enterSearchWord(String wordToSearch) {
        homePage.enterSearchText(wordToSearch);
    }

    @When("User clicks on main catalog button on Home Page")
    public void clickOnMainCatalogButton() {
        homePage.clickOnMainCatalogButton();
    }

    @When("User clicks on city button in header")
    public void clickOnCityLocator() {
        homePage.clickOnCityLocator();
    }

    @When("User enters {string} into city search field")
    public void enterCityName(String cityName) {
        homePage.enterCityName(cityName);
    }

    @When("User clicks on first city in dropdown")
    public void clickOnFirstCityInDropdown() {
        homePage.clickOnFirstCityInDropdown();
    }

    @Then("Verify main catalog menu appears on Home Page")
    public void verifyMainCatalogMenuIsDisplayed() {
        Assert.assertTrue(homePage.verifyMainCatalogMenuIsDisplayed());
    }

    @Then("Dropdown contains {string} search word in list")
    public void verifyDropdownContainsWord(String wordToVerify) {
        Assert.assertTrue((homePage.getDropdownDisplayed().contains(wordToVerify)));

    }

    @Then("Verify city name is {string} in header")
    public void verifyCityName(String cityName) {
        Assert.assertTrue(homePage.getCityName().contains(cityName));
    }
}
