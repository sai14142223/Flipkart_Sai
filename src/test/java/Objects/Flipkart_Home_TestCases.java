package Objects;

import FlipkartHome_Furniture_ActionDriver.FlipkartBaseClass;
import FlipkartHome_Furniture_ActionDriver.FlipkartPOM;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

import static FlipkartHome_Furniture_ActionDriver.FlipkartBaseClass.*;


public class Flipkart_Home_TestCases
{
    FlipkartPOM lp;
    FlipkartBaseClass bs;
    int i=0;
    @BeforeMethod
    public void Verify_FlipkartLandingPage() throws Exception {
        openBrowser("chrome","https://www.flipkart.com/");
        takeScreenshot ("FlipKart Launch");
        lp = new FlipkartPOM (driver);
        driver.manage ().timeouts ().implicitlyWait (Duration.ofSeconds (10));
        FlipkartBaseClass.LoinPopup ();
        takeScreenshot ("ClosedLoginPopup");
        //logger.info ("LoginPopup closed successfully ");
    }

    @Test
    public void Verify_That_Home_FurnitureCategory() throws Exception {
        lp.ValidateHomeAndFurnitureCategory ();
        takeScreenshot ("Select HomeCategory");
    }

    @Test
    public void Verify_That_Home_FurnitureSubcategory() throws Exception {
        lp.ValidateHomeAndFurnitureCategory ();
        lp.ValidateHome_FurnishingsSubcategory ();
        takeScreenshot ("Select HomeSubCategory");
    }
    @Test
    public void Verify_That_Bed_LinensSubcategory() throws Exception {
        lp.ValidateHomeAndFurnitureCategory ();
        lp.ValidateHome_FurnishingsSubcategory ();
        lp.ValidateBed_LinensSubcategory ();
        takeScreenshot ("Open ProductListingPage");
    }
    @Test
    public void Verify_That_Customer_4StarRating_CheckBoxField() throws Exception {
        lp.ValidateHomeAndFurnitureCategory ();
        lp.ValidateHome_FurnishingsSubcategory ();
        lp.ValidateBed_LinensSubcategory ();
        lp.ValidateCustomer4StarRatingCheckBoxField ();
        takeScreenshot ("4_Rating");
    }
    @Test
    public void Verify_That_Customer_3StarRating_CheckBoxField() throws Exception {
        lp.ValidateHomeAndFurnitureCategory ();
        lp.ValidateHome_FurnishingsSubcategory ();
        lp.ValidateBed_LinensSubcategory ();
        lp.VakidateCustomer3StarRatingCheckBoxField ();
        takeScreenshot ("3_Rating");
    }
    @Test
    public void Verify_That_Customer_2StarRating_CheckBoxField() throws Exception {
        lp.ValidateHomeAndFurnitureCategory ();
        lp.ValidateHome_FurnishingsSubcategory ();
        lp.ValidateBed_LinensSubcategory ();
        lp.ValidateCustomer2starRatingCheckBoxField ();
        takeScreenshot ("2_Rating");
    }
    @Test
    public void Verify_That_Customer_1StarRating_CheckBoxField() throws Exception {
        lp.ValidateHomeAndFurnitureCategory ();
        lp.ValidateHome_FurnishingsSubcategory ();
        lp.ValidateBed_LinensSubcategory ();
        lp.ValidateCustomer1StarRatingCheckBoxField ();
        takeScreenshot ("1_Rating");
    }
    @Test
    public void Verify_That_ByeMore_SaveMore_CheckBoxField() throws Exception {
        lp.ValidateHomeAndFurnitureCategory ();
        lp.ValidateHome_FurnishingsSubcategory ();
        lp.ValidateBed_LinensSubcategory ();
        lp.ValidateByeMore_SaveMore_CheckBoxField ();
        takeScreenshot ("BuyMore");

    }
    @Test
    public void Verify_That_No_Cost_EMI_CheckBoxField() throws Exception {
        lp.ValidateHomeAndFurnitureCategory ();
        lp.ValidateHome_FurnishingsSubcategory ();
        lp.ValidateBed_LinensSubcategory ();
        lp.ValidateNo_Cost_EMI_CheckBoxField ();
        takeScreenshot ("NoCostEMI");
    }
    @Test
    public void Verify_That_Special_Price_CheckBoxField() throws Exception {
        lp.ValidateHomeAndFurnitureCategory ();
        lp.ValidateHome_FurnishingsSubcategory ();
        lp.ValidateBed_LinensSubcategory ();
        lp.ValidateSpecial_Price_CheckBoxField ();
        takeScreenshot ("SpecialPrice");
    }
    @Test
    public void Verify_That_AvailabilityDropdownField() throws Exception {
        lp.ValidateHomeAndFurnitureCategory ();
        lp.ValidateHome_FurnishingsSubcategory ();
        lp.ValidateBed_LinensSubcategory ();
        lp.Validate_AvailabilityDropdownField ();
        takeScreenshot ("SelectAvailability");
    }
    @Test
    public void Verify_That_Availability_CheckboxField() throws Exception {
            lp.ValidateHomeAndFurnitureCategory ();
            lp.ValidateHome_FurnishingsSubcategory ();
            lp.ValidateBed_LinensSubcategory ();
            lp.Validate_AvailabilityDropdownField ();
            lp.ValidateAvailability_CheckboxField ();
            takeScreenshot ("SelectAvailabilityCheckbox");
        }
    @Test
    public void Verify_That_FlipkartAssField() throws Exception {
        lp.ValidateHomeAndFurnitureCategory ();
        lp.ValidateHome_FurnishingsSubcategory ();
        lp.ValidateBed_LinensSubcategory ();
        lp.ValidateFlipkartAssField ();
        takeScreenshot ("SelectFlipkartAssured");
    }
        @Test
        public void Verify_That_Select_ALL_CheckboxFields() throws Exception {
            lp.ValidateHomeAndFurnitureCategory ();
            lp.ValidateHome_FurnishingsSubcategory ();
            lp.ValidateBed_LinensSubcategory ();
            driver.manage ().timeouts ().implicitlyWait (Duration.ofSeconds (10));
            driver.manage ().timeouts ().pageLoadTimeout (Duration.ofSeconds (40));
            lp.ValidateSelect_ALL_CheckboxFields ();
            takeScreenshot ("Select_all_Checkbox");
        }
        @Test
        public void Verify_That_UserSwitchToNewTabWindow() throws Exception {
            lp.ValidateHomeAndFurnitureCategory ();
            lp.ValidateHome_FurnishingsSubcategory ();
            lp.ValidateBed_LinensSubcategory ();
            lp.ValidateFlipkartAssField ();
            lp.ValidateSelect_ALL_CheckboxFields ();
            Thread.sleep (2000);
            lp.ValidateUserOpenProductDetailPage ();
            takeScreenshot ("Product_Detail_page");
            lp.ValidateUserSwitchToNewTabWindow ();
            takeScreenshot ("Switch_product_DetailPage");
        }
    @Test
    public void Verify_That_UserClick_Favorite_icon() throws Exception {
        lp.ValidateHomeAndFurnitureCategory ();
        lp.ValidateHome_FurnishingsSubcategory ();
        lp.ValidateBed_LinensSubcategory ();
        lp.ValidateFlipkartAssField ();
        lp.ValidateSelect_ALL_CheckboxFields ();
        Thread.sleep (2000);
        lp.ValidateUserOpenProductDetailPage ();
        takeScreenshot ("Product_Detail_page");
        lp.ValidateUserSwitchToNewTabWindow ();
          driver.manage ().timeouts ().implicitlyWait (Duration.ofSeconds (10));
        lp.ValidateUserClick_Favorite_icon ();
        takeScreenshot ("ClickFavoriteIcon");
        bs.LoinPopup ();

    }
    @Test
    public void Verify_That_ValidateUserEnter_PinCode() throws Exception {
        lp.ValidateHomeAndFurnitureCategory ();
        lp.ValidateHome_FurnishingsSubcategory ();
        lp.ValidateBed_LinensSubcategory ();
        lp.ValidateSelect_ALL_CheckboxFields();
        lp.ValidateFlipkartAssField ();
        driver.manage ().timeouts ().implicitlyWait (Duration.ofSeconds (10));
        Thread.sleep (2000);
        lp.ValidateUserOpenProductDetailPage ();
        takeScreenshot ("Product_Detail_page");
        lp.ValidateUserSwitchToNewTabWindow ();
        takeScreenshot ("Switch_product_DetailPage");
        driver.manage ().timeouts ().implicitlyWait (Duration.ofSeconds (10));
        lp.ValidateUserEnter_PinCode ();

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
