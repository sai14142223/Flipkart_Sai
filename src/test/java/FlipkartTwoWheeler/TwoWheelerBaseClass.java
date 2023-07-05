package FlipkartTwoWheeler;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.io.File;
import java.time.Duration;

public class TwoWheelerBaseClass
{
    public static WebDriver driver;
    public static String baseUrl;
    public static String browser = "Chrome";
    public static String browser1 = "Edge";
    public static void openBrowser(String browserName, String baseUrl)
    {
        if (browserName.equalsIgnoreCase("Chrome"))
        {
                WebDriverManager.chromedriver().setup();
                ChromeOptions options = new ChromeOptions();
                options.addArguments("--no-sandbox");
                options.addArguments("--disable-dev-shm-usage");
                options.addArguments("--remote-allow-origins=*");
                driver = new ChromeDriver(options);
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        }
        else if (browserName.equalsIgnoreCase("FireFox"))
        {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        }
        else if (browserName.equalsIgnoreCase("Edge"))
        {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        }
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get(baseUrl);
        driver.getCurrentUrl();
    }
    public static void takeScreenshot(String ScreenshotName) throws Exception
    {
        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File("screenshots/" + ScreenshotName + ".png"));
    }
    public static void LoinPopup()
    {
        for (String winHandle : driver.getWindowHandles())
        {
            driver.switchTo().window(winHandle);
            System.out.println("Window Switch");
            driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
        }
    }
        public static void closeBrowser ()
        {
           driver.quit();

        }
}