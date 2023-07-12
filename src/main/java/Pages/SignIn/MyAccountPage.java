package Pages.SignIn;

import Pages.Base.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyAccountPage extends PageBase {
    public MyAccountPage(WebDriver driver) {
        super(driver);
    }

    private By accountCreatedText = By.cssSelector(".alert.alert-success");
    private By accountName = By.xpath("//a [@title = 'View my customer account']/span");

    public String getAccountCreatedText () {
        return getElementText(accountCreatedText);
    }

    public String getAccountName () {

        return getElementText(accountName);
    }


}
