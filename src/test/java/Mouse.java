import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Mouse

    {
        public static void main(String[] args)
        {
            WebDriver driver;
            WebDriverManager.chromedriver().setup();
            ChromeOptions options = new ChromeOptions ();
            options.addArguments ("--no-sandbox--");
            options.addArguments ("--disable-dev-shm-usage--");
            options.addArguments ("--remote-allow-origins=*");
            driver = new ChromeDriver(options);
            driver.manage ().window ().maximize ();
            driver.get("https://www.flipkart.com/");

            for (String winHandle : driver.getWindowHandles ()) {
                driver.switchTo ().window (winHandle);
                System.out.println ("Window Switch");
                driver.findElement (By.xpath ("//button[@class='_2KpZ6l _2doB4z']")).click ();
            }
            Actions actions = new Actions (driver);
            WebElement menuOption = driver.findElement (By.xpath (".//div[contains(text(),'Two Wheelers')]"));
            actions.moveToElement (menuOption).perform ();
            System.out.println("Done Mouse hover on 'HomeCategory' from Menu");

            WebElement subMenuOption = driver.findElement (By.xpath ("(//a[@class='_6WOcW9 _3YpNQe'])[2]"));
            subMenuOption.click();
            System.out.println("Done Mouse hover on 'HomeSubCategory' from Menu");






        }
    }

