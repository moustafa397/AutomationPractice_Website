package Pages;

import Base.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class SearchPage extends PageBase {
    public SearchPage(WebDriver driver) {
        super(driver);
    }

    private By productsDisplayed = By.cssSelector("div#center_column > ul > li > div > div > h5 > a");
    private By numberOfResultsTxt = By.xpath("//span[@class='heading-counter']");



    public int getNumberOfProductsDisplayed() {
        List<WebElement> products = driver.findElements(productsDisplayed);
        return products.size();
    }


    public int getNumberOfResults() {
        String resultsText = getElementText(numberOfResultsTxt);
        char resultsNumber = resultsText.charAt(0);
        int number = Character.getNumericValue(resultsNumber);
        return number;
    }

   /* public String getTextOfProductsDisplayed() {
        List<WebElement> products = driver.findElements(productsDisplayed);
        return products.toString();
    }*/

    public List<String> getTextOfProductsDisplayed() {
        List<WebElement> products = driver.findElements(productsDisplayed);
        List<String> productTexts = new ArrayList<>();
        for (WebElement product : products) {
            productTexts.add(product.getText());
        }
        return productTexts;
    }








}
