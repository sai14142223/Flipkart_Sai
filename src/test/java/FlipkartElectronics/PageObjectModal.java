package FlipkartElectronics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class PageObjectModal {
    WebDriver driver;
    @FindBy(xpath = ".//div[contains(text(),'Electronics')]")
    WebElement Electronics;
    @FindBy(xpath = ".//a[contains(text(),'Audio')]")
    WebElement Audio;
    @FindBy(xpath = ".//a[contains(text(),'Bluetooth Headphones')]")
    WebElement Bluetooth_Headphones;
    @FindBy(xpath = "(//div[@class='_24_Dny'])[4]")
    WebElement FourStarRating;

    @FindBy(xpath = " (//div[@class='_24_Dny'])[3]")
    WebElement True_Wireless;
    @FindBy(xpath = "(//div[@class='_24_Dny'])[8]")
    WebElement Boat_Brand;
    @FindBy(xpath = "(//div[@class='CXW8mj'])[1]")
    WebElement NoiseBuds;
    @FindBy(xpath = "//div[@class='_2mLllQ']")
    WebElement ProductTailImages;
    @FindBy(xpath = "//input[@class='_36yFo0']")
    WebElement PinCode;
    @FindBy(xpath = "//span[@class='_2P_LDn']")
    WebElement CheckButton;
    @FindBy(xpath = "(//li[@class='col col-6-12'])[1]")
    WebElement AddToCart;
    @FindBy(xpath = "(//div[@class='YUhWwv'])[1]")
    WebElement HeaderCartButton;
    @FindBy(xpath = "(//button[@class='_23FHuj'])[2]")
    WebElement AddMoreQuantity;
    @FindBy(xpath = "(//div[@class='_3dsJAO'])[1]")
    WebElement SaveForLater;
    @FindBy(xpath = "(//div[@class='_3dsJAO'])[1]")
    WebElement MoveToCart;
    @FindBy(xpath = "(//button[@class='_23FHuj'])[1]")
    WebElement RemoveQuantity;
    @FindBy(xpath = "//button[@class='_2KpZ6l _2ObVJD _3AWRsL']")
    WebElement PlaceToOrder;



    public PageObjectModal(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void validateElectronicsCategory() throws InterruptedException {
        Actions actions = new Actions(driver);
        WebElement menuOption = Electronics;
        actions.moveToElement(menuOption).perform();
        System.out.println("Done Mouse hover on 'ElectronicsCategory' from Menu");

        WebElement subMenuOption = Audio;
        actions.moveToElement(subMenuOption).perform();
        System.out.println("Done Mouse hover on 'AudioSubCategory' from Menu");

        WebElement selectMenuOption = Bluetooth_Headphones;
        selectMenuOption.click();
        System.out.println("Selected 'Bluetooth_Headphones' from Menu");

    }

    public void validateFourStarRatingField() throws InterruptedException {
        Actions actions = new Actions(driver);
        WebElement selectRatings = FourStarRating;
        actions.moveToElement(selectRatings).perform();
        selectRatings.click();
    }

    public void validateTrue_WirelessField() throws InterruptedException {
        Actions actions = new Actions(driver);
        WebElement selectModal = True_Wireless;
        actions.moveToElement(selectModal).perform();
        selectModal.click();
    }

    public void validateBoat_BrandField() throws InterruptedException {
        Actions actions = new Actions(driver);
        WebElement selectBrand = Boat_Brand;
        actions.moveToElement(selectBrand).perform();
        selectBrand.click();
    }

    public void validateNoiseBudsProduct() throws InterruptedException {
        Actions actions = new Actions(driver);
        WebElement selectBrand = NoiseBuds;
        actions.moveToElement(selectBrand).perform();
        selectBrand.click();
    }

    public void ValidateUserSwitchToNewTabWindow() {
        Set<String> handles = driver.getWindowHandles();
        Iterator<String> it = handles.iterator();
        String parentTab = it.next();
        String childTab = it.next();
        driver.switchTo().window(childTab);

    }

//    public void ValidateSelect_ALL_TailImagesFields() throws InterruptedException {
//        Actions actions = new Actions(driver);
//        actions.scrollToElement(ProductTailImages).build().perform();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        List<WebElement> CheckTailImages = (List<WebElement>) CheckTailImages;
//        System.out.println("Total no of elements:" + CheckTailImages.size());
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        for (int i = 0; i < ((List<?>) ProductTailImages).size(); i++) {
//            Thread.sleep(5000);
//            CheckTailImages.get(i).click();
//        }
//    }
        public void validatePinCode() throws InterruptedException {
            Actions actions = new Actions(driver);
            WebElement EnterPinCode = PinCode;
            WebElement Click_Check_Button= CheckButton;
            actions.moveToElement(EnterPinCode).perform();
            EnterPinCode.sendKeys("500073");
            Click_Check_Button.click();


        }
    public void validateAdd_to_CartButton() throws InterruptedException {
        Actions actions = new Actions(driver);
        WebElement addProduct = AddToCart;
        actions.moveToElement(addProduct).perform();
        addProduct.click();
    }
//    public void validateHeaderCartButton() throws InterruptedException {
//        Actions actions = new Actions(driver);
//        WebElement CheckProductCart = HeaderCartButton;
//        actions.moveToElement(CheckProductCart).perform();
//        CheckProductCart.click();
//    }
//    public void validateAddMoreQuantityField() throws InterruptedException {
//        Actions actions = new Actions(driver);
//        WebElement CheckProductCart = AddMoreQuantity;
//        actions.moveToElement(CheckProductCart).perform();
//        CheckProductCart.click();
//    }
    public void validateSaveForLaterField() throws InterruptedException {
        Actions actions = new Actions(driver);
        WebElement CheckProductCart = SaveForLater;
        actions.moveToElement(CheckProductCart).perform();
        CheckProductCart.click();
    }
    public void validateMoveToCartField() throws InterruptedException {
        Actions actions = new Actions(driver);
        WebElement CheckProductCart = MoveToCart;
        actions.moveToElement(CheckProductCart).perform();
        CheckProductCart.click();
    }
    public void validateRemoveQuantityField() throws InterruptedException {
        Actions actions = new Actions(driver);
        WebElement CheckProductCart = RemoveQuantity;
        actions.moveToElement(CheckProductCart).perform();
        CheckProductCart.click();
    }

    public void validatePlaceToOrder() throws InterruptedException {
        Actions actions = new Actions(driver);
        WebElement CheckProductCart = PlaceToOrder;
        actions.moveToElement(CheckProductCart).perform();
        CheckProductCart.click();
    }

    }

