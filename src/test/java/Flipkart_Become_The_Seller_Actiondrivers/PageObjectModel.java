package Flipkart_Become_The_Seller_Actiondrivers;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObjectModel {
    WebDriver driver;
    @FindBy(xpath = "//a[@class='_3-PJz-']")
    WebElement Become_A_Seller;
    @FindBy(xpath = "//img[@class='styles__LogoImage-rbc3lh-2 gZANpw']")
    WebElement Logo;
    @FindBy(xpath = "(//a[@class='link-color'])[1]")
    WebElement Fee_Structure;
    @FindBy(xpath = "(//a[@class='link-color'])[2]")
    WebElement Services;
    @FindBy(xpath = "(//a[@class='link-color'])[3]")
    WebElement Resources;
    @FindBy(xpath = "(//a[@class='link-color'])[4]")
    WebElement FAQs;
    @FindBy(xpath = "(//a[@class='link-color'])[5]")
    WebElement Shopsy;
    @FindBy(xpath = "(//div[@class='styles__RegisterContainer-sc-1kfv72o-0 ilMBvo'])[2]")
    WebElement Start_Selling;
    @FindBy(xpath = "//div[@class='styles__LoginContainer-rbc3lh-5 jExJvC']")
    WebElement LoginButton;
    @FindBy(xpath = "/html/body/div[1]/div[3]/section/section/div/div[2]/a")
    WebElement Register_For_New_Account;
    @FindBy(xpath = "//button[@id='moe-dontallow_button']")
    WebElement DontAllow_Button;
    @FindBy(xpath = "//input[@class='styles__StyledInput-cql555-1 fPuYwe login']")
    WebElement Username_Or_10_Digit_Phone_Number_Or_Email;
    @FindBy(xpath = "//input[@class='styles__StyledInput-cql555-1 gNVcCr styles__CustomInput-sc-12mlfxt-3 bfXnRM sign-up']")
    WebElement Enter_Mobile_Number;
    @FindBy(xpath = "(//input[@class='styles__StyledInput-cql555-1 fPuYwe styles__CustomInput-sc-12mlfxt-3 bfXnRM sign-up'])[1]")
    WebElement Enter_Email_ID;
    @FindBy(xpath = "(//input[@class='styles__StyledInput-cql555-1 fPuYwe styles__CustomInput-sc-12mlfxt-3 bfXnRM sign-up'])[2]")
    WebElement Enter_GSTIN_Number;
    @FindBy(xpath = "(//label[@class='styles__RadioLabel-yucwqx-3 coeOsD'])[1]")
    WebElement All_Categories;
    @FindBy(xpath = "(//label[@class='styles__RadioLabel-yucwqx-3 coeOsD'])[1]")
    WebElement Only_Books;
    @FindBy(xpath = "//button[@class='styles__ButtonStyle-sekd9q-0 uQOWs styles__RegisterBtn-sc-1vnxfs1-7 grjwEx']")
    WebElement Register_And_Continue_Button;

    public PageObjectModel(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void BecomeSeller() {
        Become_A_Seller.click();

    }

    public void Logo() {
        Logo.click();

    }

    public void Fee_Structure() {

        Fee_Structure.click();
    }

    public void Services() {

        Services.click();
    }

    public void FAQS() {

        FAQs.click();
    }

    public void Shopsy() {

        Shopsy.click();
    }

    public void StartSelling() {

        Start_Selling.click();
    }

    public void Login() {
        Actions actions = new Actions(driver);
        WebElement Login_Button = LoginButton;
        actions.moveToElement(Login_Button).perform();
        LoginButton.click();
    }
    public void Register() {
        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
            System.out.println("Window Switch");
            Register_For_New_Account.click();

        }
    }
    public void CloseAlert() {
        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
            System.out.println("Window Switch");
            DontAllow_Button.click();

        }
    }


    public void RegistrationDetails() throws InterruptedException {

        Username_Or_10_Digit_Phone_Number_Or_Email.sendKeys("pujita_12345");
        Enter_Mobile_Number.sendKeys("9876543210");
        Enter_Email_ID.sendKeys("testuser@gmail.com");
        Enter_GSTIN_Number.sendKeys("22AAAAA0000A1Z5");
        All_Categories.click();
        Thread.sleep(5000);
        Only_Books.click();
        Thread.sleep(5000);
        Register_And_Continue_Button.click();
        Thread.sleep(5000);

    }


}











