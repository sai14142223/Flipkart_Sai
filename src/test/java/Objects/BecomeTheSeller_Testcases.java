package Objects;

import Flipkart_Become_The_Seller_Actiondrivers.BaseClass;
import Flipkart_Become_The_Seller_Actiondrivers.PageObjectModel;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.time.Duration;

import static Flipkart_Become_The_Seller_Actiondrivers.BaseClass.*;

public class BecomeTheSeller_Testcases {
    PageObjectModel el;
    BaseClass bc;
    int i=0;
    @BeforeTest
    public void setup() throws Exception {
        openBrowser("chrome","https://www.flipkart.com/");
        takeScreenshot ("FlipKart Launch");
        el = new PageObjectModel (driver);
        driver.manage ().timeouts ().implicitlyWait (Duration.ofSeconds (10));
        BaseClass.LoginPopup ();
        takeScreenshot ("ClosedLoginPopup");

    }
    @Test(priority = 0)
    public void TC001() throws Exception {
        el.BecomeSeller();
        takeScreenshot("BecomeSeller");
    }

    @Test(priority = 1)
    public void TC002() throws Exception {
        el.Logo();
        takeScreenshot("Logo");
    }
    @Test(priority = 2)
    public void TC003() throws Exception {
        el.Fee_Structure();
        Thread.sleep(5000);
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        takeScreenshot("sc1");

    }
    @Test(priority = 3)
    public void TC004() throws Exception {
        el.Services();
        Thread.sleep(4000);
        takeScreenshot("sc2");
    }
    @Test(priority = 4)
    public void TC005() throws Exception {
        el.FAQS();
        Thread.sleep(4000);
        takeScreenshot("sc3");
    }
    @Test(priority = 5)
    public void TC006() throws Exception {
        el.Shopsy();
        Thread.sleep(4000);
        takeScreenshot("sc4");
    }

    @Test(priority = 6)
    public void TC007() throws Exception {
        el.StartSelling();
        Thread.sleep(8000);
        takeScreenshot("sc5");

    }
    @Test(priority = 7)
    public void TC008() throws Exception {
        el.Login();
        Thread.sleep(8000);
        takeScreenshot("sc6");


    }
    @Test(priority = 8)
    public void TC009() throws Exception {
        el.Register();
        Thread.sleep(8000);
        takeScreenshot("sc7");
    }
    @Test(priority = 9)
    public void TC010() throws Exception {
        el.CloseAlert();
        Thread.sleep(4000);
        takeScreenshot("sc8");
    }
    @Test(priority = 10)
    public void TC011() throws Exception {
        el.RegistrationDetails();
        takeScreenshot("sc9");

    }


    @AfterTest
    public void testEnd(ITestResult result) throws Exception {
//        i = i + 1;
//        String screenshotName = "Login fail";
//        String x = screenshotName + String.valueOf (i);
//        if (ITestResult.FAILURE == result.getStatus ()) {
//            takeScreenshot (screenshotName);
//
//        }
        closeBrowser();
    }

}



