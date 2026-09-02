package aqa_hw_9;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;


import static com.codeborne.selenide.CollectionCondition.sizeGreaterThanOrEqual;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class SearchResultsPage {
    public String searchResultTitle(){
        $("div.search__title").shouldBe(visible);
        return $("div.search__title").getText();
    }

    private SelenideElement getElement(int index){
        ElementsCollection elements = $$("div.list-item").shouldHave(sizeGreaterThanOrEqual(48));
        return elements.get(index -1) ;
    }
    public String getProductName(int index){
        SelenideElement currentProduct = getElement(index);
       return  currentProduct.$("a.item-title").getText();

    }
    public void clickOnProduct(int index){
        SelenideElement currentProduct = getElement(index);
        currentProduct.click();
    }

}
