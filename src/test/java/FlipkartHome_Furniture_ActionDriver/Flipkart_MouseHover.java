package FlipkartHome_Furniture_ActionDriver;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.io.File;
import java.io.IOException;

public class Flipkart_MouseHover
{
//    public static void main(String[] args)
//    {
//        WebDriver driver;
//        ChromeOptions options = new ChromeOptions ();
//        options.addArguments ("--no-sandbox--");
//        options.addArguments ("--disable-dev-shm-usage--");
//        options.addArguments ("--remote-allow-origins=*");
//        driver = new ChromeDriver (options);
//        driver.manage ().window ().maximize ();
//        driver.get("https://www.flipkart.com/");
//
//        for (String winHandle : driver.getWindowHandles ()) {
//            driver.switchTo ().window (winHandle);
//            System.out.println ("Window Switch");
//            driver.findElement (By.xpath ("//button[@class='_2KpZ6l _2doB4z']")).click ();
//        }
//        Actions actions = new Actions (driver);
//        WebElement menuOption = driver.findElement (By.xpath (".//div[contains(text(),'Home')]"));
//        actions.moveToElement (menuOption).perform ();
//        System.out.println("Done Mouse hover on 'HomeCategory' from Menu");
//
//        WebElement subMenuOption = driver.findElement (By.xpath (".//a[contains(text(),'Home Furnishings')]"));
//        actions.moveToElement (subMenuOption).perform ();
//        System.out.println("Done Mouse hover on 'HomeSubCategory' from Menu");
//
//        WebElement selectMenuOption = driver.findElement (By.xpath (".//a[contains(text(),'All')]"));
//        selectMenuOption.click ();
//        System.out.println("Selected 'All' from Menu");
//
//
//    }
//}


    public static void main(String[] args) throws InterruptedException, IOException {
        WebDriver driver;
        ChromeOptions options = new ChromeOptions ();
        options.addArguments ("--no-sandbox--");
        options.addArguments ("--disable-dev-shm-usage--");
        options.addArguments ("--remote-allow-origins=*");
        driver=new ChromeDriver (options);
        driver.manage ().window ().maximize ();
        driver.get ("https://www.hyrtutorials.com/p/alertsdemo.html");
        File screenShortFile = ((TakesScreenshot) driver).getScreenshotAs (OutputType.FILE);
        FileUtils.copyFile (screenShortFile,new File (".//ScreenShort/screen.png"));


        driver.findElement (By.xpath ("//button[@id='alertBox']")).click ();
        Alert alert = driver.switchTo ().alert ();
        String text = alert.getText ();

        {
            System.out.println ("alert text is :"+text);
        }
        alert.accept ();

        driver.findElement (By.xpath ("//button[@id='confirmBox']")).click ();

        Alert alert1 = driver.switchTo ().alert ();
        String text1 = alert1.getText ();
        {
            System.out.println ("alert text is : "+text1);
        }
        alert1.dismiss ();

        driver.findElement (By.xpath ("//button[@id='promptBox']")).click ();
        Alert alert2 = driver.switchTo ().alert ();
        String text2 = alert2.getText ();
        System.out.println ("alert text is : "+text2);
        alert2.sendKeys ("gopi");
        alert2.accept ();
        //driver.quit ();



    }
}

