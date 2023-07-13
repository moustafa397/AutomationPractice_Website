package Pages;

import Base.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends PageBase {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    private final By  signInLink = By.linkText("Sign in");
    private final By contactUsBtn = By.linkText("Contact us");
    private final By searchTxtBox = By.xpath("//input[@placeholder='Search']");
    private final By searchBtn = By.xpath("//button[@name='submit_search']");





    public void OpenRegisterLink(){

         clickButton(signInLink);
    }

    public void OpenContactPage(){

        clickButton(contactUsBtn);
    }

    public void makeSearch (String searchValue){
        setTxtBoxText(searchTxtBox,searchValue);
        clickButton(searchBtn);
    }


}
