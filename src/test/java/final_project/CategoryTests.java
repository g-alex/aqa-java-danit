package final_project;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.testng.Assert;
import org.testng.annotations.Test;


public class CategoryTests extends BaseTest {


    @Test(description = "TestCaseID=55")
    @Epic("Category")
    @Feature("Category")
    @Description("Subcategory can be opened")
    public void subCategoryOpen() {

        String category = "Дитячі";
        String subCategory = "Казки і повісті";


        HomePage homePage = new HomePage().hoverOnCategory(category);
        homePage.dropdownShouldBeVisible();

        CategoryPage categoryPage = homePage.clickOnCategory("Всі дитячі");
        String categoryTitle = categoryPage.getCategoryTitle();
        Assert.assertEquals(categoryTitle, category);

        categoryPage.clickOnSubcategory(subCategory);
        categoryPage.waitForTitle(subCategory);
        String subCategoryTitle = categoryPage.getCategoryTitle();
        Assert.assertEquals(subCategoryTitle, subCategory);
    }

    @Test(description = "TestCaseID=56")
    @Epic("Category")
    @Feature("Category")
    @Description("Products are sorted by price from low to high")
    public void sortByPriceLowToHigh() {

        String category = "Художні";

        HomePage homePage = new HomePage().hoverOnCategory(category);
        homePage.dropdownShouldBeVisible();

        CategoryPage categoryPage = homePage.clickOnCategory("Всі художні");
        String categoryTitle = categoryPage.getCategoryTitle();
        Assert.assertEquals(categoryTitle, category);

        categoryPage.clickOnFilterButton();
        categoryPage.clickOnFilterLoToHi();

        categoryPage.waitForReload("by_price_asc");

        int firstProductPrice = categoryPage.getPrice(1);
        int secondProductPrice = categoryPage.getPrice(2);

        boolean compare = firstProductPrice < secondProductPrice;
        Assert.assertTrue(compare);


    }

    @Test(description = "TestCaseID=57")
    @Epic("Category")
    @Feature("Category")
    @Description("Filter shows only eBooks")
    public void showOnlyEbook() {

        String category = "Дитячі";

        HomePage homePage = new HomePage().hoverOnCategory(category);
        homePage.dropdownShouldBeVisible();

        CategoryPage categoryPage = homePage.clickOnCategory("Всі дитячі");
        String categoryTitle = categoryPage.getCategoryTitle();
        Assert.assertEquals(categoryTitle, category);

        categoryPage.clickOnEbook();
        categoryPage.waitForReload("filter/ebook");

        int countAllElements = categoryPage.getCountOfProductsOnPage();
        int countEbook = categoryPage.checkOnlyEbook();

        Assert.assertEquals(countEbook, countAllElements);


    }

    @Test(description = "TestCaseID=58")
    @Epic("Category")
    @Feature("Category")
    @Description("Products \"Незабаром у продажі\" are shown")
    public void checkOutOfStock() {

        String category = "Спецпропозиції";

        HomePage homePage = new HomePage().hoverOnCategory(category);
        homePage.dropdownShouldBeVisible();

        CategoryPage categoryPage = homePage.clickOnCategory("Тимчасово немає у продажу");
        String categoryTitle = categoryPage.getCategoryTitle();
        Assert.assertEquals(categoryTitle, "Книги, яких тимчасово немає у продажу");

        int countAllElements = categoryPage.getCountOfProductsOnPage();
        int outOfStock = categoryPage.checkOutOfStock();
        Assert.assertEquals(outOfStock, countAllElements);

    }

    @Test(description = "TestCaseID=59")
    @Epic("Category")
    @Feature("Category")
    @Description("Catalog size is changed")
    public void changeCatalogSize() {

        String category = "Художні";
        String sizeButton = "Зменшити каталог";

        HomePage homePage = new HomePage().hoverOnCategory(category);
        homePage.dropdownShouldBeVisible();

        CategoryPage categoryPage = homePage.clickOnCategory("Всі художні");
        String categoryTitle = categoryPage.getCategoryTitle();
        Assert.assertEquals(categoryTitle, category);

        int sizeBeforeChange = categoryPage.getProductSize();
        String activeButtonBefore = categoryPage.currentCatalogName();
        Assert.assertEquals(activeButtonBefore, "Збільшити каталог");

        categoryPage.changeCatalogSize(sizeButton);
        categoryPage.waitForActiveButton(sizeButton);

        String actualCatalogSizeButton = categoryPage.currentCatalogName();
        int sizeAfterChange = categoryPage.getProductSize();

        Assert.assertTrue(sizeAfterChange > sizeBeforeChange);
        Assert.assertEquals(actualCatalogSizeButton, sizeButton);
    }
}
