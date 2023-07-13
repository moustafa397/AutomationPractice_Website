package Pages;

import Base.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends PageBase {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    private By signInLink = By.linkText("Sign in");
    private By contactUsBtn = By.linkText("Contact us");




    public void OpenRegisterLink(){

         clickButton(signInLink);
    }

    public void OpenContactPage(){

        clickButton(contactUsBtn);
    }



}
