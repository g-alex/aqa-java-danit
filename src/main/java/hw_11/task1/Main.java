package hw_11.task1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        MyBrowser browser = new MyBrowser();
        MyFile file = new MyFile();
        List<CanBeClosed> listToClose = new ArrayList<>(List.of(browser, file));

        SessionCloser close = list -> {
            for(CanBeClosed val : list){
                val.close();
                }
        };
        close.closeSession(listToClose);
    }
}
