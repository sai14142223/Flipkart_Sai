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



