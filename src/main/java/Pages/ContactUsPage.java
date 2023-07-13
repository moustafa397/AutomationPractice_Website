package Pages;

import Base.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactUsPage extends PageBase {

    public ContactUsPage(WebDriver driver) {
        super(driver);
    }

    private By contactUsText = By.cssSelector("#center_column > h1");
    private By customerServiceSubject = By.cssSelector("#id_contact > option[value='2']");
    private By emailTxtBox = By.id("email");
    private By orderReferenceTxtBox = By.id("id_order");
    private By messageTxtBox = By.id("message");
    private By fileInputField = By.id("fileUpload");

    private By sendBtn = By.id("submitMessage");
    private By messageSentText = By.cssSelector(".alert.alert-success");




    public void SendMessage (String email,String orderId,String message,String filePath){
        clickButton(customerServiceSubject);
        setTxtBoxText(emailTxtBox,email);
        setTxtBoxText(orderReferenceTxtBox,orderId);
        setTxtBoxText(messageTxtBox,message);
        setTxtBoxText(fileInputField,filePath);
        clickButton(sendBtn);
    }

    public String getContactUsText(){
       return getElementText(contactUsText);
    }

    public String getMessageSentTxt(){
        return getElementText(messageSentText);
    }


}
