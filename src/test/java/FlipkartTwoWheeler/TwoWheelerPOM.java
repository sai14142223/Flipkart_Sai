package FlipkartTwoWheeler;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;


public class TwoWheelerPOM extends TwoWheelerBaseClass {
    WebDriver driver;
    @FindBy(xpath = "//*[@id=/'container/']/div/div[3]/div/div/div[10]/a/div[1]/div/img")
    WebElement Mouse_Hover;
    @FindBy(xpath = "//*[@id=/'container/']/div/div[2]/div/div/div[10]/a/div[2]/div[2]/div[2]/div/div/div/a[2]")
    WebElement Electrical_Vehical;
    @FindBy(xpath = "//*[@id=/'container'/]/div/div[3]/div[2]/div/div[2]/div/div/div[1]/div/div[1]/div/div/div[2]/div/svg/path")
    WebElement Fav;
//    @FindBy(xpath = "")
   public TwoWheelerPOM(WebDriver driver){
       this.driver = driver;
       PageFactory.initElements(driver, this);
   }
   public void Login(){
       Actions actions = new Actions(driver);
       actions.moveToElement(Mouse_Hover).build().perform();
       Mouse_Hover.click();
   }
   public void Ev(){
       Actions actions1 = new Actions(driver);
       actions1.moveToElement(Electrical_Vehical).build().perform();
       Electrical_Vehical.click();

   }
}