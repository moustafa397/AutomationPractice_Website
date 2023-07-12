package Pages.SignIn;

import Pages.Base.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AuthenticationPage extends PageBase {
    public AuthenticationPage(WebDriver driver) {
        super(driver);
    }

    private By pageHeading = By.className("page-heading");
    private By emailTxtBox = By.id("email_create");
    private By createAccountBtn = By.id("SubmitCreate");

    public void proceedToCreateAccount(String email){
        setTxtBoxText(emailTxtBox,email);
        clickButton(createAccountBtn);
        waitTillTextAppear(pageHeading,"CREATE AN ACCOUNT",30);

    }

    public String getPageHeading(){
       return   getElementText(pageHeading);
    }



}
