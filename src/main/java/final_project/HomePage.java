package final_project;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class HomePage {
    // inline style contains opacity: 1, the hidden clone in backdrop — opacity: 0.
    private static final String INPUT_FIELD = "[style*='opacity: 1'] .MuiInputBase-inputAdornedEnd";

    public HomePage clickOnSearchField() {
        $(".search__input input").shouldBe(visible).click();
        return this;
    }

    public HomePage enterTextToSearch(String textToSearch) {
        $(INPUT_FIELD).shouldBe(visible).setValue(textToSearch);
        return this;
    }

    public SearchResultPage pressEnter() {
        $(INPUT_FIELD).pressEnter();
        return new SearchResultPage();
    }

    public void pressEnterOnEmpty() {
        $(INPUT_FIELD).shouldBe(visible).pressEnter();
    }

    public String getDropdownText() {
        return $(".MuiTypography-subtitle2").shouldBe(visible).getText();
    }

    public SearchResultPage searchFor(String text) {
        return clickOnSearchField().enterTextToSearch(text).pressEnter();
    }

    public HomePage hoverOnCategory(String category) {
        $$(".header__menu span[class*='mui-']")
                .findBy(text(category))
                .hover();
        return this;
    }


    public void dropdownShouldBeVisible(){
        $("#menu-item-popper").shouldBe(visible);
    }


    public CategoryPage clickOnCategory(String subcategory) {
        $("[aria-label=\"" + subcategory + "\"]").click();
        return new CategoryPage();
    }
}
