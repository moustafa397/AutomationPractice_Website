package Pages;

import Base.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountPage extends PageBase {
    public CreateAccountPage(WebDriver driver) {
        super(driver);
    }

    private By pageHeading = By.className("page-heading");
    private By Mr = By.id("id_gender1") ;
    private By Mrs = By.id("id_gender2");

    private By firstNameTxtBox = By.id("customer_firstname");
    private By lastNameTxtBox = By.id("customer_lastname");
    private By passwdTxtBox = By.id("passwd");
    private By emailTxtBox = By.id("email");
    private By daysDropdownList = By.id("days");
    private By monthDropdownList = By.id("months");
    private By yearDropdownList = By.id("years");
    private By newsletterCheckBox = By.id("newsletter");
    private By registerBtn = By.id("submitAccount");



    public String getPageHeadingText(){
        waitTillTextAppear(pageHeading,"CREATE AN ACCOUNT",30);
        return   getElementText(pageHeading);
    }

    public void createAccount (String title,String firstName,String lastName , String passwd,String day, String month, String year){
        chooseTitle(title);
        setTxtBoxText(firstNameTxtBox,firstName);
        setTxtBoxText(lastNameTxtBox,lastName);
        setTxtBoxText(passwdTxtBox,passwd);
        findDropdownElement(daysDropdownList).selectByValue(day);
        findDropdownElement(monthDropdownList).selectByValue(month);
        findDropdownElement(yearDropdownList).selectByValue(year);
        clickButton(newsletterCheckBox);
        clickButton(registerBtn);



    }

    private Select findDropdownElement ( By dropElement){
        return new Select(driver.findElement(dropElement));
    }
    public void chooseTitle(String title){

        if (title == "Mr"){
            clickButton(Mr);
        }
        else if (title == "Mrs"){
            clickButton(Mrs);
        }

    }



}
