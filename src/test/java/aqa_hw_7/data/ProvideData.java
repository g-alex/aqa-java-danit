package aqa_hw_7.data;

import org.testng.annotations.DataProvider;

public class ProvideData {
    @DataProvider
    public Object[][] getSearchData(){
        return new Object[][]{
                {"oukitel","запитом «oukitel» знайдено"},
                {"Кавомашина","запитом «Кавомашина» знайдено"},
                {"ipod","запитом «ipod» знайдено"}
        };
    }

}
