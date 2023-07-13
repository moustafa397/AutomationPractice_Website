package Tests.ContactUsTests;

import Pages.ContactUsPage;
import Pages.HomePage;
import Tests.TestBase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContactUsTest extends TestBase {

    HomePage homePage;
    ContactUsPage contact;

    @Test
    public void sendCustomerServiceMessage(){
        homePage = new HomePage(driver);
        contact = new ContactUsPage(driver);
        homePage.OpenContactPage();
        Assert.assertTrue(contact.getContactUsText().contains("CUSTOMER SERVICE - CONTACT US"));
        contact.SendMessage("sss@sasa.com","15015090","picture is different reality","D:\\Courses\\Automation(tarek)\\Projects\\AutomationPractice_Website\\src\\test\\java\\Data\\fileToUpload.png");
        Assert.assertTrue(contact.getMessageSentTxt().contains("Your message has been successfully sent to our team."));
    }

}
