package Flipkart_Become_The_Seller_Actiondrivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObjectModel{
    WebDriver driver;
    @FindBy(xpath = "//a[@class='_3-PJz-']")
    WebElement Become_A_Seller;
    @FindBy(xpath ="//img[@class='styles__LogoImage-rbc3lh-2 gZANpw']" )
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
    @FindBy(xpath = "(//button[@class='styles__RegisterButton-sc-1kfv72o-1 kFfmtT'])[1]")
    WebElement Start_Selling;
    @FindBy(xpath="//li[@class='mobile-visible']")
    WebElement Login;
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
        PageFactory.initElements (driver, this);
    }
    public void BecomeSeller() {
        Become_A_Seller.click();

    }









}