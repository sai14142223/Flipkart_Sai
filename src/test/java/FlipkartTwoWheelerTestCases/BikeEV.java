package FlipkartTwoWheelerTestCases;

import FlipkartTwoWheeler.TwoWheelerBaseClass;
import FlipkartTwoWheeler.TwoWheelerPOM;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.time.Duration;

import static FlipkartTwoWheeler.TwoWheelerBaseClass.*;

public class BikeEV {
    TwoWheelerBaseClass ev;
    TwoWheelerPOM ln;
    int i=0;
    @BeforeMethod
    public void Setup() throws Exception {
      openBrowser("Chrome", "https://www.flipkart.com/");
      takeScreenshot("Flipkart Launch");
      ln = new TwoWheelerPOM(driver);
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
      TwoWheelerBaseClass.LoinPopup();
      System.out.println("enter");
      takeScreenshot("sc1");
    }
    @Test
    public void TestCase1() throws Exception
    {
        ln.twoWheelerCategory();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        takeScreenshot("sc2");
    }
    @Test
    public void TestCase_2() throws Exception
    {
        ln.twoWheelerCategory();
        ln.validateViewAll_Button();
        takeScreenshot("sc3");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @Test
    public void TestCase_3() throws Exception
    {
        ln.twoWheelerCategory();
        ln.validateViewAll_Button();
        ln.validateFourStarRating();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        ln.validateThreeStarRating();
        takeScreenshot("sc4");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    public void TestCase4() throws Exception
    {
        ln.twoWheelerCategory();
        ln.validateViewAll_Button();
        ln.validateFourStarRating();
        ln.validateThreeStarRating();
        ln.validateClearAllFilters();
        takeScreenshot("sc5");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    public void TestCase_5() throws Exception
    {
        ln.twoWheelerCategory();
        ln.validateViewAll_Button();
        ln.validateFourStarRating();
        ln.validateThreeStarRating();
        ln.validateClearAllFilters();
        ln.validateOkaya_Scooters();
        takeScreenshot("sc6");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    public void TestCase_6() throws Exception
    {
        ln.twoWheelerCategory();
        ln.validateViewAll_Button();
        ln.validateFourStarRating();
        ln.validateThreeStarRating();
        ln.validateClearAllFilters();
        ln.validateOkaya_Scooters();
        ln.ValidateSelect_ALL_TailImages();
        takeScreenshot("sc7");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    public void TestCase_7() throws Exception
    {
        ln.twoWheelerCategory();
        ln.validateViewAll_Button();
        ln.validateFourStarRating();
        ln.validateThreeStarRating();
        ln.validateClearAllFilters();
        ln.validateOkaya_Scooters();
        ln.ValidateSelect_ALL_TailImages();
        ln.PinCode();
        takeScreenshot("sc8");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    public void TestCase_8() throws Exception
    {
        ln.twoWheelerCategory();
        ln.validateViewAll_Button();
        ln.validateFourStarRating();
        ln.validateThreeStarRating();
        ln.validateClearAllFilters();
        ln.validateOkaya_Scooters();
        ln.ValidateSelect_ALL_TailImages();
        ln.PinCode();
        ln.AddToCart();
        takeScreenshot("sc9");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    public void TestCase_9() throws Exception
    {
        ln.twoWheelerCategory();
        ln.validateViewAll_Button();
        ln.validateFourStarRating();
        ln.validateThreeStarRating();
        ln.validateClearAllFilters();
        ln.validateOkaya_Scooters();
        ln.ValidateSelect_ALL_TailImages();
        ln.PinCode();
        ln.AddToCart();
        takeScreenshot("sc10");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    public void TestCase_10() throws Exception
    {
        ln.HeaderCart();
        takeScreenshot("sc11");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }
    public void TestCase_11() throws Exception
    {
        ln.HeaderCart();
        ln.AddMultiple();
        ln.AddMultiple();takeScreenshot("sc12");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


    }
    public void TestCase_12() throws Exception
    {
        ln.HeaderCart();
        ln.AddMultiple();
        ln.MinusCart();
        takeScreenshot("sc13");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }
    public void TestCase_13() throws Exception{
        ln.HeaderCart();
        ln.AddMultiple();
        ln.MinusCart();
        ln.SaveForLater();
        takeScreenshot("sc14");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }
    public void TestCase_14() throws Exception
    {
        ln.HeaderCart();
        ln.AddMultiple();
        ln.MinusCart();
        ln.SaveForLater();
        takeScreenshot("sc15");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }
    public void TestCase_15() throws Exception
    {
        ln.HeaderCart();
        ln.AddMultiple();
        ln.MinusCart();
        ln.SaveForLater();
        ln.PlaceOrder();
        takeScreenshot("sc15");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

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
