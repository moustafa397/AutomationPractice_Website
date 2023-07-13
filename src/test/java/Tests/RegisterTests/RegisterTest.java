package Tests.RegisterTests;

import Data.ExcelReader;
import Pages.HomePage;
import Pages.AuthenticationPage;
import Pages.CreateAccountPage;
import Pages.MyAccountPage;
import Tests.TestBase.TestBase;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;

public class RegisterTest extends TestBase {

    HomePage homePage;
    AuthenticationPage authenticationPage;
    CreateAccountPage createAccountPage;
    MyAccountPage  accountPage;

    @DataProvider(name = "ExcelData")
    public Object [] [] userRegisterData() throws IOException {
        //read data for excel reader class
        ExcelReader ER = new ExcelReader();
        return ER.getExcelData();
    }

    @Test(priority = 1,alwaysRun = true,dataProvider = "ExcelData")
    public void UserCanRegisterSuccessfully(String email,String title,String firstName,String lastName , String passwd,String day, String month, String year){

        homePage = new HomePage(driver);
        authenticationPage = new AuthenticationPage(driver);
        createAccountPage = new CreateAccountPage(driver);
        accountPage = new MyAccountPage(driver);


        homePage.OpenRegisterLink();
        Assert.assertTrue(authenticationPage.getPageHeading().contains("AUTHENTICATION"));
        authenticationPage.proceedToCreateAccount(email);
        Assert.assertTrue(createAccountPage.getPageHeadingText().contains("CREATE AN ACCOUNT"));
        createAccountPage.createAccount(title,firstName,lastName,passwd,day,month,year);
        Assert.assertTrue(accountPage.getAccountCreatedText().contains("Your account has been created"));
        Assert.assertTrue(accountPage.getAccountName().contains(firstName+" "+lastName));




    }



}
