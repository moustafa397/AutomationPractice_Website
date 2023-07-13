package Pages;

import Base.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends PageBase {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    private By signInLink = By.linkText("Sign in");




    public void OpenRegisterLink(){

         clickButton(signInLink);
    }



}
