package Tests.TestBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.*;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class TestBase {

    public static WebDriver driver;


    @BeforeClass
    @Parameters({"browser"})
    public void startDriver(@Optional("chrome") String browserName){

        if (browserName.equalsIgnoreCase("chrome") ) {
            driver = new ChromeDriver();

        } else if (browserName.equalsIgnoreCase("firefox")) {

            driver = new FirefoxDriver();

        }
        else if (browserName.equalsIgnoreCase("edge")) {
            driver = new EdgeDriver();

        }

        driver.manage().window().maximize();
        driver.get("http://www.automationpractice.pl/");



    }



    @AfterClass
    public void stopDriver(){
        //driver.quit();

    }
}
