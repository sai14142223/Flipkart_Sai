package Objects;

import Flipkart_Become_The_Seller_Actiondrivers.BaseClass;
import Flipkart_Become_The_Seller_Actiondrivers.PageObjectModel;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

import static Flipkart_Become_The_Seller_Actiondrivers.BaseClass.*;

public class BecomeTheSeller_Testcases {
    PageObjectModel el;
    BaseClass bc;
    int i=0;
    @BeforeMethod
    public void setup() throws Exception {
        openBrowser("chrome","https://www.flipkart.com/");
        takeScreenshot ("FlipKart Launch");
        el = new PageObjectModel (driver);
        driver.manage ().timeouts ().implicitlyWait (Duration.ofSeconds (10));
        BaseClass.LoginPopup ();
        takeScreenshot ("ClosedLoginPopup");

    }
    @Test
    public void TC001() throws Exception {
        el.BecomeSeller();
        takeScreenshot("BecomeSeller");
    }

    @Test
    public void TC002() throws Exception {
        el.BecomeSeller();
        el.Logo();
        takeScreenshot("Logo");
    }
    @Test
    public void TC003() throws Exception {
        el.BecomeSeller();
        el.Logo();
        el.Fee_Structure();
        Thread.sleep(5000);
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        takeScreenshot("sc1");

    }
    @Test
    public void TC004() throws Exception {
        el.BecomeSeller();
        el.Logo();
        el.Fee_Structure();
        el.Services();
        Thread.sleep(4000);
        takeScreenshot("sc2");
    }
    @Test
    public void TC005() throws Exception {
        el.BecomeSeller();
        el.Logo();
        el.Fee_Structure();
        el.Services();
        el.FAQS();
        Thread.sleep(4000);
        takeScreenshot("sc3");
    }
    @Test
    public void TC006() throws Exception {
        el.BecomeSeller();
        el.Logo();
        el.Fee_Structure();
        el.Services();
        el.FAQS();
        el.Shopsy();
        Thread.sleep(4000);
        takeScreenshot("sc4");
    }

    @Test
    public void TC007() throws Exception {
        el.BecomeSeller();
        el.StartSelling();
        Thread.sleep(4000);
        takeScreenshot("sc5");

    }
    @Test
    public void TC008() throws Exception {
        el.BecomeSeller();
        el.Login();
        Thread.sleep(4000);
        takeScreenshot("sc6");


    }
    @Test
    public void TC009() throws Exception {
        el.BecomeSeller();
        el.Login();
        el.Register();
        Thread.sleep(4000);
        takeScreenshot("sc7");
        bc.Popup();
        takeScreenshot("close popup");
    }


    @AfterMethod
    public void testEnd(ITestResult result) throws Exception {
        i = i + 1;
        String screenshotName = "Login fail";
        String x = screenshotName + String.valueOf (i);
        if (ITestResult.FAILURE == result.getStatus ()) {
            takeScreenshot (screenshotName);

        }
        closeBrowser();
    }

}



