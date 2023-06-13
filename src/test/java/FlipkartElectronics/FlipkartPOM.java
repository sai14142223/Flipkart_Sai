package FlipkartElectronics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipkartPOM {
    WebDriver driver;
    @FindBy(xpath = "//*[@id='container']/div/div[2]/div/div/div[4]/a/div[1]/div/img")
    WebElement Electronics;
    @FindBy(xpath = "(//div[@class='_3LU4EM'])[1]")
    WebElement Acer_laptops;
    @FindBy(xpath = "(//div[@class='_4rR01T'])[1]")
    WebElement Asus_laptops;
    @FindBy(xpath = "//input[@class='_36yFo0']")
    WebElement Enter_Delivery;

    @FindBy(xpath = "//span[@class='_2P_LDn']")
    WebElement Check;
    @FindBy(xpath = "//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")
    WebElement Add_to_cart;


    public FlipkartPOM(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void Electronics() {
        Actions actions = new Actions(driver);
        actions.moveToElement(Electronics).build().perform();
    }

    public void Acer() {
        Actions actions = new Actions(driver);
        actions.moveToElement(Acer_laptops).build().perform();
    }
    public void Delivery() {
        Actions actions = new Actions(driver);
        actions.moveToElement(Enter_Delivery).build().perform();
    }
    public void Check(){
        Actions actions=new Actions(driver);
        actions.moveToElement(Check).build().perform();
    }
    public void Add_to_cart(){
        Actions actions=new Actions(driver);
        actions.moveToElement(Add_to_cart).build().perform();
    }
}
