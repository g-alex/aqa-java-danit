package aqa_hw_9;

import static com.codeborne.selenide.Selenide.$;

public class ReminderPage {
    public void emailField(String email){
        $("[type=\"text\"]").sendKeys(email);
    }
    public void buttonClick(){
        $("button.btn").click();
    }
    public boolean errorText(){
        return $(".error.m_b-5").isDisplayed();
    }
}
