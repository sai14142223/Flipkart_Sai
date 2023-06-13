package FlipkartElectronics;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

import static FlipkartElectronics.Flipkart_Electronics_BaseClass.*;

public class FlipkartElectronics_Testcase {
    WebDriver driver;
    FlipkartPOM tl;
    int i=0;

    @BeforeMethod
    public void Setup() throws Exception {
        openBrowser("Chrome", "https://www.flipkart.com");
        takeScreenshot("flipkart Launch");
        tl=new FlipkartPOM(driver);
        takeScreenshot("Lunch Browser");
    }
    @Test
    public void TestCase1() throws Exception {
        tl.Electronics();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        takeScreenshot("Tc_1");

    }
    @AfterMethod
    public void TestClose(ITestResult result) throws Exception {

            i = i + 1;
            String screenshotName = "Login fail";
            String x = screenshotName + String.valueOf (i);
            if (ITestResult.FAILURE == result.getStatus ()) {
                takeScreenshot (screenshotName);

            }
            closeBrowser();
        }

    }

