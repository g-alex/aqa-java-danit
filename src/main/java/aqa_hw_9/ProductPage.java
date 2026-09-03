package aqa_hw_9;

import static com.codeborne.selenide.Selenide.$;

public class ProductPage {
    public String getProductTitle() {
        return $("h1.title__main").getText();

    }
}

