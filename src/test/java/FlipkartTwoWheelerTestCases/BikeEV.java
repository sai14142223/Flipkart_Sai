package FlipkartTwoWheelerTestCases;

import FlipkartTwoWheeler.TwoWheelerBaseClass;
import FlipkartTwoWheeler.TwoWheelerPOM;
import org.apache.xmlbeans.impl.common.XPath;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

import static FlipkartTwoWheeler.TwoWheelerBaseClass.*;

public class BikeEV {
    WebDriver driver;
    TwoWheelerBaseClass ev;
    TwoWheelerPOM pom;
    int i=0;
    @BeforeMethod
    public void Setup() throws Exception {
      openBrowser("Chrome", "https://www.flipkart.com/");
      ev = new TwoWheelerPOM(driver);
      TwoWheelerBaseClass.LoinPopup();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
      takeScreenshot("sc1");
    }
    @Test
    public void TestCase_1() throws Exception {
        pom.Login();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        takeScreenshot("sc2");
    }
    @Test
    public void TestCase_2() {
        pom.Ev();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @AfterMethod
    public void TestClosure(){
        //closeBrowser();
    }
}
