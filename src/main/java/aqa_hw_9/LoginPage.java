package aqa_hw_9;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {
    public void reminderClick(){
        $("[href=\"/ua/reminder/\"]").click();
    }
}
