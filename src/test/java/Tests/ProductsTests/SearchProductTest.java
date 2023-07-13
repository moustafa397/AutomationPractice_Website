package Tests.ProductsTests;

import Pages.HomePage;
import Pages.SearchPage;
import Tests.TestBase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class SearchProductTest extends TestBase {

    HomePage homePage;
    SearchPage searchPage;

    @Test
    public void searchProduct () {
        homePage = new HomePage(driver);
        searchPage = new SearchPage(driver);
        SoftAssert softAssert = new SoftAssert();


        homePage.makeSearch("Printed Dress");
        Assert.assertEquals(searchPage.getNumberOfProductsDisplayed(),searchPage.getNumberOfResults());

        List<String> productTexts = searchPage.getTextOfProductsDisplayed();
        for (String text : productTexts) {
            softAssert.assertTrue(text.contains("Dress"));
        }

        softAssert.assertAll();

    }
}
