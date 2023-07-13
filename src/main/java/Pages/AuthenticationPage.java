package Pages;

import Base.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AuthenticationPage extends PageBase {
    public AuthenticationPage(WebDriver driver) {
        super(driver);
    }

    private By pageHeading = By.className("page-heading");
    private By registerEmailTxtBox = By.id("email_create");
    private By createAccountBtn = By.id("SubmitCreate");
    private By signInEmailTxtBox = By.id("email");
    private By passwordTxtBox = By.id("passwd");
    private By signInBtn = By.id("SubmitLogin");


    public void proceedToCreateAccount(String email){
        setTxtBoxText(registerEmailTxtBox,email);
        clickButton(createAccountBtn);

    }

    public String getPageHeading(){
       return   getElementText(pageHeading);
    }

    public void login (String email,String passwd){
        setTxtBoxText(signInEmailTxtBox,email);
        setTxtBoxText(passwordTxtBox,passwd);
        clickButton(signInBtn);
    }

}
