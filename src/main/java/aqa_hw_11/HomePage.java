package aqa_hw_11;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;

public class HomePage {
    @Step("User enter {textToSearch} into search field on Home page")
    public SearchResultPage enterTextToSearch(String textToSearch) {
        $("[id=\"title-search-input_fixed\"]").setValue(textToSearch).pressEnter();
        return new SearchResultPage();
    }

    @Step("Open login  page")
    public LoginPage openLoginPage() {
        $("div.wrap_icon.person").click();
        return new LoginPage();
    }

    @Step("Click on subscribe button")
    public SubscribePage clickOnSubscribeButton() {
        $(".side-block__bottom.side-block__bottom--last").click();
        return new SubscribePage();
    }
}
