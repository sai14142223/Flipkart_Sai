package Objects;

import FlipkartElectronics.BaseClass;
import FlipkartElectronics.PageObjectModal;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.time.Duration;

import static FlipkartElectronics.BaseClass.*;

public class TestCases {
    PageObjectModal lp;
    BaseClass bs;
    int i=0;
    @BeforeTest
    public void Verify_FlipkartLandingPage() throws Exception {
        openBrowser("chrome","https://www.flipkart.com/");
        takeScreenshot ("FlipKart Launch");
        lp = new PageObjectModal (driver);
        driver.manage ().timeouts ().implicitlyWait (Duration.ofSeconds (10));
        BaseClass.LoinPopup ();
        takeScreenshot ("ClosedLoginPopup");
        //logger.info ("LoginPopup closed successfully ");
    }

    @Test(priority = 0)
    public void Verify_Electronics_Category() throws Exception {
        lp.validateElectronicsCategory();
        takeScreenshot("TC1");
    }
    @Test(priority = 1)
    public void Verify_WirelessField() throws Exception {

        lp.validateTrue_WirelessField();
        takeScreenshot("TC2");
    }
    @Test(priority = 2)
    public void Verify_RatingFields() throws Exception {

        lp.validateFourStarRatingField();
        Thread.sleep(5000);
        takeScreenshot("TC3");
    }
    @Test(priority = 3)
    public void Verify_BrandFields() throws Exception {

        lp.validateBoat_BrandField();
        Thread.sleep(5000);
        takeScreenshot("TC4");
    }
    @Test(priority = 4)
    public void Verify_NoiseBudsProduct() throws Exception {

        lp.validateNoiseBudsProduct();Thread.sleep(5000);
        takeScreenshot("TC5");
    }
    @Test(priority = 5)
    public void Verify_SwitchToNewWindow() throws Exception {

        lp.ValidateUserSwitchToNewTabWindow();Thread.sleep(5000);
        takeScreenshot("TC6");
    }
//    @Test(priority = 6)
//    public void Verify_ProductDetailPage() throws Exception {
//
//        lp.ValidateSelect_ALL_TailImagesFields();Thread.sleep(5000);
//        lp.validatePinCode();Thread.sleep(5000);
//        takeScreenshot("TC6");
//    }

    @Test(priority = 7)
    public void Verify_Add_to_CartButton() throws Exception {

        lp.validatePinCode();Thread.sleep(5000);
        lp.validateAdd_to_CartButton();Thread.sleep(5000);
        takeScreenshot("TC7");
    }
    @Test(priority = 8)
    public void Verify_AddMoreQuantityField() throws Exception {

        lp.validateAddMoreQuantityField();Thread.sleep(5000);
        takeScreenshot("TC9");
    }
    @Test(priority = 9)
    public void Verify_SaveForLaterField() throws Exception {

        lp.validateSaveForLaterField();Thread.sleep(5000);
        takeScreenshot("TC10");

    }
    @Test(priority = 10)
    public void Verify_MoveToCartField() throws Exception {

        lp.validateMoveToCartField();Thread.sleep(5000);
        takeScreenshot("TC11");

    }
    @Test(priority = 11)
    public void Verify_RemoveQuantityField() throws Exception {


       lp.validateRemoveQuantityField();Thread.sleep(5000);
       takeScreenshot("TC12");

    }
    @Test(priority = 12)
    public void Verify_PlaceToOrder() throws Exception {

        lp.validatePlaceToOrder();Thread.sleep(5000);
        takeScreenshot("TC13");

    }


    @AfterTest
    public void testEnd(ITestResult result) throws Exception {
        i = i + 1;
        String screenshotName = "Login fail";
        String x = screenshotName + String.valueOf (i);
        if (ITestResult.FAILURE == result.getStatus ()) {
            takeScreenshot (screenshotName);

        }
       // closeBrowser();
    }
}
