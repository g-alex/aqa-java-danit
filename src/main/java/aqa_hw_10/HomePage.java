package aqa_hw_10;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;

public class HomePage {
    @Step("User enter {textToSearch} text into search field on HomePage")
    public SearchResultsPage enterTextToSearch(String textToSearch) {
        $("[id=title-search-input_fixed]").setValue(textToSearch).pressEnter();
        return new SearchResultsPage();

    }

    @Step("Open login page")
    public LoginPage openLoginPage() {
        $("div.wrap_icon.person").click();
        return new LoginPage();
    }
}
