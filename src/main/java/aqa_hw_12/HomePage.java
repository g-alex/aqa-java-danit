package aqa_hw_12;


import com.codeborne.selenide.ClickOptions;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class HomePage {
    public void openHomePage() {
        open("https://hotline.ua/");
    }

    public void enterSearchTextAndPressEnter(String textToSearch) {
        $("[type=\"text\"]").setValue(textToSearch).pressEnter();
    }

    public void clickOnMainCatalogButton() {
        $("div.button-menu-main").click();
    }

    public boolean verifyMainCatalogMenuIsDisplayed() {
        return $("ul.menu-main__list").shouldBe(visible).isDisplayed();
    }

    public void enterSearchText(String textToSearch) {
        $("[type=\"text\"]").setValue(textToSearch);
    }

    public String getDropdownDisplayed() {
        return $("[id=\"autosuggest__results-item--0\"]").shouldBe(visible).getText();
    }

    public void clickOnCityLocator() {
        $("div.location__city").click(ClickOptions.usingJavaScript());
    }

    public void enterCityName(String cityName) {
        $("[placeholder=\"Почніть вводити назву\"]").setValue(cityName);
    }

    public void clickOnFirstCityInDropdown() {
        $(".middle-xs.full-height").click();
    }

    public String getCityName() {
        return $("div.location__city").shouldBe(visible).getText();
    }
}
