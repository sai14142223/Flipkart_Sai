package FlipkartTwoWheeler;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;


public class TwoWheelerPOM {
    WebDriver driver;
    @FindBy(xpath = ".//div[contains(text(),'Two Wheelers')]")
    WebElement Mouse_Hover;
    @FindBy(xpath = "(//a[@class='_6WOcW9 _3YpNQe'])[2]")
    WebElement Electrical_Vehical;
    @FindBy(xpath = "(//a[@class='_2KpZ6l _3dESVI'])[1]")
    WebElement ViewAll_Button;
    @FindBy(xpath = "(//div[@class='_24_Dny'])[1]")
    WebElement FourStarRating;
    @FindBy(xpath = "(//div[@class='_3879cV'])[3]")
    WebElement ThreeStarRating;
    @FindBy(xpath = "//div[@class='_2id1nE']")
    WebElement ClearAll;
    @FindBy(xpath = "(//img[@class='_396cs4'])[1]")
    WebElement Okaya_freedumProduct;
    @FindBy(xpath = "//div[@class='_35DpL-']")
    WebElement ClickAllImages;
    @FindBy(xpath ="//input[@class='_36yFo0']")
    WebElement Pin_Code;
    @FindBy(xpath ="//span[@class='_2P_LDn']")
    WebElement Check_PinCode;
    @FindBy(xpath ="(.//span[contains(text(),'VIEW ALL')])[1]")
    WebElement View_All_Features;
    @FindBy(xpath ="//button[@class='_2KpZ6l _1FH0tX']")
    WebElement Read_More;
    @FindBy(xpath = "//button[@class='_2KpZ6l _1q9yVr']")
    WebElement Rate_Product;
    @FindBy(xpath = "(//a[@class='_1fGeJ5'])[1]")
    WebElement ModalVersion;
    @FindBy(xpath = "//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")
    WebElement Add_Cart;
    @FindBy(xpath = "K//div[@class='KK-o3G']")
    WebElement Cart_Header;
    @FindBy(xpath = "(//button[@class='_23FHuj'])[2]")
    WebElement Add_Multiple;
    @FindBy(xpath = "(//button[@class='_23FHuj'])[1]")
    WebElement Minus;
    @FindBy(xpath = "(//div[@class='_3dsJAO'])[1]")
    WebElement Save_For_Later;
    @FindBy(xpath = "(//div[@class='_3dsJAO'])[2]")
    WebElement Remove;
    @FindBy(xpath = "//button[@class='_2KpZ6l _2ObVJD _3AWRsL']")
    WebElement Place_Order;






    public TwoWheelerPOM(WebDriver driver){
       this.driver = driver;
       PageFactory.initElements(driver, this);
   }
   public void  twoWheelerCategory() throws InterruptedException {
       Actions actions=new Actions(driver);
       WebElement menuOption = Mouse_Hover;
       actions.moveToElement(menuOption).build().perform();
       WebElement subMenuOption =Electrical_Vehical;
       subMenuOption.click();

   }

    public void validateViewAll_Button() {
        Actions actions = new Actions(driver);
        WebElement menuOption = ViewAll_Button;
        actions.moveToElement(menuOption).build().perform();
        menuOption.click();
    }
    public void validateFourStarRating() {
        Actions actions = new Actions(driver);
        WebElement menuOption = FourStarRating;
        actions.moveToElement(menuOption).build().perform();
        menuOption.click();
    }

    public void validateThreeStarRating() {
        Actions actions = new Actions(driver);
        WebElement menuOption = ThreeStarRating;
        actions.moveToElement(menuOption).build().perform();
        menuOption.click();
    }
    public void validateClearAllFilters() {
        Actions actions = new Actions(driver);
        WebElement menuOption = ClearAll;
        actions.moveToElement(menuOption).build().perform();
        menuOption.click();
    }

    public void validateOkaya_Scooters(){
        Actions actions = new Actions(driver);
        WebElement menuOption = Okaya_freedumProduct;
        actions.moveToElement (menuOption).build ().perform ();
        menuOption.click();
    }
    public void NewTabSwitch(){

            Set<String> handles = driver.getWindowHandles();
            Iterator<String> it = handles.iterator();
            String parentTab = it.next();
            String childTab = it.next();
            driver.switchTo().window(childTab);

    }
    public void ValidateSelect_ALL_TailImages() throws InterruptedException
    {
//        Actions actions=new Actions (driver);
//        actions.scrollToElement (ClickAllImages).build ().perform ();
//        driver.manage ().timeouts ().implicitlyWait (Duration.ofSeconds (10));
//        List<WebElement>Checkboxes= (List<WebElement>) ClickAllImages;
//        System.out.println ("Total no of elements:"+Checkboxes.size ());
//        driver.manage ().timeouts ().implicitlyWait (Duration.ofSeconds (10));
//        for(int i=0;i<Checkboxes.size ();i++)
//        {
//            Thread.sleep (5000);
//            Checkboxes.get (i).click ();
//        }

            List<WebElement> allStars = driver.findElements(By.xpath("//div[@class='_35DpL-']"));
            System.out.println("<<<<<<<<<<<<------List of all stars, size------------>>>>>>>>>>"+allStars.size());
            for (WebElement e : allStars)
            {
                Actions act = new Actions(driver);
                act.moveToElement(e).build().perform();
                Thread.sleep(5000);

        }
    }
    public void PinCode(){
        Actions actions = new Actions(driver);
        WebElement menuOption = Pin_Code;
        actions.moveToElement (menuOption).build ().perform ();
        menuOption.sendKeys("500086");
        Check_PinCode.click();
    }
//    public void VerifyPin(){
//        Actions actions = new Actions(driver);
//        WebElement menuOption = Check_PinCode;
//        actions.moveToElement (menuOption).build ().perform ();
//        menuOption.click();
//    }
//    public void ViewFeatures(){
//    Actions actions = new Actions(driver);
//    WebElement menuOption = View_All_Features;
//    actions.moveToElement (menuOption).build ().perform ();
//    menuOption.click();
//    }
//    public void ReadMore(){
//        Actions actions = new Actions(driver);
//        WebElement menuOption = Read_More;
//        actions.moveToElement (menuOption).build ().perform ();
//        menuOption.click();
//    }
//    public void RateProduct(){
//        Actions actions = new Actions(driver);
//        WebElement menuOption = Rate_Product;
//        actions.moveToElement (menuOption).build ().perform ();
//        menuOption.click();
//    }

    public void modalVersion(){
        Actions actions = new Actions(driver);
        WebElement menuOption = ModalVersion;
        actions.moveToElement (menuOption).build ().perform ();
        menuOption.click();
    }
    public void AddToCart(){
        Actions actions = new Actions(driver);
        WebElement menuOption = Add_Cart;
        actions.moveToElement (menuOption).build ().perform ();
        menuOption.click();
    }
    public void HeaderCart(){
        Actions actions = new Actions(driver);
        WebElement menuOption = Cart_Header;
        actions.moveToElement (menuOption).build ().perform ();
        menuOption.click();
    }
    public void AddMultiple(){
        Actions actions = new Actions(driver);
        WebElement menuOption = Add_Multiple;
        actions.moveToElement (menuOption).build ().perform ();
        menuOption.click();
    }
    public void MinusCart(){
        Actions actions = new Actions(driver);
        WebElement menuOption = Minus;
        actions.moveToElement (menuOption).build ().perform ();
        menuOption.click();
    }
    public void SaveForLater(){
        Actions actions = new Actions(driver);
        WebElement menuOption = Save_For_Later;
        actions.moveToElement (menuOption).build ().perform ();
        menuOption.click();
    }
//    public void RemoveFromCart(){
//        Actions actions = new Actions(driver);
//        WebElement menuOption = Remove;
//        actions.moveToElement (menuOption).build ().perform ();
//        menuOption.click();
//    }
    public void PlaceOrder(){
        Actions actions = new Actions(driver);
        WebElement menuOption = Place_Order;
        actions.moveToElement (menuOption).build ().perform ();
        menuOption.click();
    }







}