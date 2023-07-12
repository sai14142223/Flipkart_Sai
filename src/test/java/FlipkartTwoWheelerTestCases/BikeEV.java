package FlipkartTwoWheelerTestCases;

import FlipkartTwoWheeler.TwoWheelerBaseClass;
import FlipkartTwoWheeler.TwoWheelerPOM;
import org.testng.ITestResult;
import org.testng.annotations.*;
import java.time.Duration;

import static FlipkartTwoWheeler.TwoWheelerBaseClass.*;

public class BikeEV {
    TwoWheelerBaseClass ev;
    TwoWheelerPOM ln;
    int i=0;
    @BeforeTest
    public void Setup() throws Exception {
      openBrowser("Chrome", "https://www.flipkart.com/");
      takeScreenshot("Flipkart Launch");
      ln = new TwoWheelerPOM(driver);
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
      TwoWheelerBaseClass.LoinPopup();
      System.out.println("enter");
      takeScreenshot("sc1");
    }
    @Test(priority = 0)
    public void TestCase1() throws Exception
    {
        ln.twoWheelerCategory();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        takeScreenshot("sc2");
    }
    @Test(priority = 1)
    public void TestCase_2() throws Exception
    {

        ln.validateViewAll_Button();
        takeScreenshot("sc3");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test(priority = 2)
    public void TestCase_3() throws Exception
    {

        ln.validateFourStarRating();
        Thread.sleep(8000);
        takeScreenshot("sc4");
    }

    @Test(priority = 3)
    public void TestCase_4() throws Exception
    {

        ln.validateClearAllFilters();
         Thread.sleep(8000);
        takeScreenshot("sc5");
       // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @Test(priority = 4)
    public void TestCase_5() throws Exception
    {

        ln.validateThreeStarRating();
        Thread.sleep(8000);
        takeScreenshot("sc4");
    }
    @Test(priority = 5)
    public void TestCase_6() throws Exception
    {
        ln.validateOkaya_Scooters();
        Thread.sleep(8000);
        takeScreenshot("sc6");
       // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @Test(priority = 6)
    public void TestCase_7() throws Exception
    {
        ln.NewTabSwitch();
        ln.ValidateSelect_ALL_TailImages();
        Thread.sleep(8000);
        takeScreenshot("sc7");
       // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @Test(priority = 7)
    public void TestCase_8() throws Exception
    {
        ln.PinCode();
        takeScreenshot("sc8");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @Test(priority = 7)
    public void TestCase_9() throws Exception
    {
        ln.modalVersion();
        takeScreenshot("sc9");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @Test(priority = 8)
    public void TestCase_10() throws Exception
    {
        ln.AddToCart();
        takeScreenshot("sc10");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test(priority = 10)
    public void TestCase_11() throws Exception
    {
        ln.AddMultiple();
        ln.AddMultiple();takeScreenshot("sc11");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


    }
    @Test(priority = 11)
    public void TestCase_12() throws Exception
    {

        ln.MinusCart();
        takeScreenshot("sc12");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }
    @Test(priority = 12)
    public void TestCase_13() throws Exception{

        ln.SaveForLater();
        takeScreenshot("sc13");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }
    @Test(priority = 13)
    public void TestCase_14() throws Exception
    {
        ln.PlaceOrder();
        takeScreenshot("sc14");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }


    @AfterTest
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
