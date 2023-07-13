package Pages;

import Base.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyAccountPage extends PageBase {
    public MyAccountPage(WebDriver driver) {
        super(driver);
    }

    private By accountCreatedText = By.cssSelector(".alert.alert-success");
    private By accountName = By.xpath("//a [@title = 'View my customer account']/span");
    private By logOutBtn = By.linkText("Sign out");
    private By signInLink = By.linkText("Sign in");


    public String getAccountCreatedText () {
        return getElementText(accountCreatedText);
    }

    public String getAccountName () {

        return getElementText(accountName);
    }

    public void logOut (){
        clickButton(logOutBtn);
    }


}
