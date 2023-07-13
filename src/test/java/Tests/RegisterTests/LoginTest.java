package Tests.RegisterTests;

import Pages.HomePage;
import Pages.AuthenticationPage;
import Pages.CreateAccountPage;
import Pages.MyAccountPage;
import Tests.TestBase.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {

    HomePage homePage;
    AuthenticationPage authenticationPage ;
    CreateAccountPage createAccountPage;
    MyAccountPage accountPage;

    @BeforeClass
    public void beforeClass(){
        homePage = new HomePage(driver);
        authenticationPage = new AuthenticationPage(driver);
        createAccountPage = new CreateAccountPage(driver);
        accountPage = new MyAccountPage(driver);

        homePage.OpenRegisterLink();
        authenticationPage.proceedToCreateAccount("ssshsss@ss3s.com");
        Assert.assertTrue(createAccountPage.getPageHeadingText().contains("CREATE AN ACCOUNT"));
        createAccountPage.createAccount("Mr","Mostafa","Ibrahem","123456789","1","2","1997");
        accountPage.logOut();
    }


    @Test
    public void UserLoginSuccessfully(){

        authenticationPage.login("sss@s3s.com","123456789");
        Assert.assertTrue(accountPage.getAccountName().contains("Mostafa"+" "+"Ibrahem"));

    }

}
