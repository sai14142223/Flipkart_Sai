package Objects;

import FlipkartElectronics.BaseClass;
import FlipkartElectronics.PageObjectModal;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

import static FlipkartElectronics.BaseClass.*;

public class TestCases {
    PageObjectModal lp;
    BaseClass bs;
    int i=0;
    @BeforeMethod
    public void Verify_FlipkartLandingPage() throws Exception {
        openBrowser("chrome","https://www.flipkart.com/");
        takeScreenshot ("FlipKart Launch");
        lp = new PageObjectModal (driver);
        driver.manage ().timeouts ().implicitlyWait (Duration.ofSeconds (10));
        BaseClass.LoinPopup ();
        takeScreenshot ("ClosedLoginPopup");
        //logger.info ("LoginPopup closed successfully ");
    }

    @Test
    public void Verify_Electronics_Category() throws Exception {
        lp.validateElectronicsCategory();
        takeScreenshot("TC1");
    }
    @Test
    public void Verify_WirelessField() throws Exception {
        lp.validateElectronicsCategory();
        Thread.sleep(5000);
        lp.validateTrue_WirelessField();
        takeScreenshot("TC2");
    }
    @Test
    public void Verify_RatingFields() throws Exception {
        lp.validateElectronicsCategory();
        Thread.sleep(5000);
        lp.validateTrue_WirelessField();
        Thread.sleep(5000);
        lp.validateFourStarRatingField();
        Thread.sleep(5000);
        takeScreenshot("TC3");
    }
    @Test
    public void Verify_BrandFields() throws Exception {
        lp.validateElectronicsCategory();
        Thread.sleep(5000);
        lp.validateTrue_WirelessField();
        Thread.sleep(5000);
        lp.validateFourStarRatingField();
        Thread.sleep(5000);
        lp.validateBoat_BrandField();
        Thread.sleep(5000);
        takeScreenshot("TC4");
    }
    @Test
    public void Verify_NoiseBudsProduct() throws Exception {
        lp.validateElectronicsCategory();Thread.sleep(5000);
        lp.validateTrue_WirelessField();Thread.sleep(5000);
        lp.validateFourStarRatingField();Thread.sleep(5000);
        lp.validateBoat_BrandField();Thread.sleep(5000);
        lp.validateNoiseBudsProduct();Thread.sleep(5000);
        lp.ValidateUserSwitchToNewTabWindow();Thread.sleep(5000);
        takeScreenshot("TC5");
    }
    @Test
    public void Verify_ProductDetailPage() throws Exception {
        lp.validateElectronicsCategory();Thread.sleep(5000);
        lp.validateTrue_WirelessField();Thread.sleep(5000);
        lp.validateFourStarRatingField();Thread.sleep(5000);
        lp.validateBoat_BrandField();Thread.sleep(5000);
        lp.validateNoiseBudsProduct();Thread.sleep(5000);
        lp.ValidateUserSwitchToNewTabWindow();Thread.sleep(5000);
        //lp.ValidateSelect_ALL_TailImagesFields();Thread.sleep(5000);
        lp.validatePinCode();Thread.sleep(5000);
        takeScreenshot("TC6");
    }

    @Test
    public void Verify_Add_to_CartButton() throws Exception {
        lp.validateElectronicsCategory();Thread.sleep(5000);
        lp.validateTrue_WirelessField();Thread.sleep(5000);
        lp.validateFourStarRatingField();Thread.sleep(5000);
        lp.validateBoat_BrandField();Thread.sleep(5000);
        lp.validateNoiseBudsProduct();Thread.sleep(5000);
        lp.ValidateUserSwitchToNewTabWindow();Thread.sleep(5000);
        //lp.ValidateSelect_ALL_TailImagesFields();Thread.sleep(5000);
        lp.validatePinCode();Thread.sleep(5000);
        lp.validateAdd_to_CartButton();Thread.sleep(5000);
        takeScreenshot("TC7");
    }
    @Test
    public void Verify_CartPage() throws Exception {
        lp.validateElectronicsCategory();Thread.sleep(5000);
        lp.validateTrue_WirelessField();Thread.sleep(5000);
        lp.validateFourStarRatingField();Thread.sleep(5000);
        lp.validateBoat_BrandField();Thread.sleep(5000);
        lp.validateNoiseBudsProduct();Thread.sleep(5000);
        lp.ValidateUserSwitchToNewTabWindow();Thread.sleep(5000);
        //lp.ValidateSelect_ALL_TailImagesFields();Thread.sleep(5000);
        lp.validatePinCode();Thread.sleep(5000);
        lp.validateAdd_to_CartButton();Thread.sleep(5000);
        takeScreenshot("TC8");
       // lp.validateAddMoreQuantityField();Thread.sleep(5000);
        //takeScreenshot("TC9");
        lp.validateSaveForLaterField();Thread.sleep(5000);
        takeScreenshot("TC10");
        lp.validateMoveToCartField();Thread.sleep(5000);
        takeScreenshot("TC11");
//        lp.validateRemoveQuantityField();Thread.sleep(5000);
//        takeScreenshot("TC12");
        lp.validatePlaceToOrder();Thread.sleep(5000);
        takeScreenshot("TC13");


    }


    @AfterMethod
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
