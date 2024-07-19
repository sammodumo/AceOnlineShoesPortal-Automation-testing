package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserRegistration extends HomePage{
    public UserRegistration(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(driver,this);
    }

    //Locators

    @FindBy(xpath = "//*[@id=\"menuToggle\"]/input")
    private WebElement menuToggle;

    @FindBy(xpath = "//*[@id=\"menu\"]/a[2]/li")
    private WebElement signInPortal;

    @FindBy(xpath = "//*[@id=\"NewRegistration\"]")
    private WebElement userRegistrationBtn;

    @FindBy(xpath = "//*[@id=\"Salutation\"]/option[1]")
    private WebElement dropDown;

    @FindBy(xpath = "//*[@id=\"firstname\"]")
    private WebElement firstName;

    @FindBy(xpath = "//*[@id=\"lastname\"]")
    private WebElement lastName;

    @FindBy(xpath = "//*[@id=\"emailId\"]")
    private WebElement emailId;

    @FindBy(xpath = "//*[@id=\"contactNumber\"]")
    private WebElement contactNumber;

    @FindBy(xpath = "//*[@id=\"usr\"]")
    private WebElement userName;

    @FindBy(xpath = "//*[@id=\"pwd\"]")
    private WebElement password;

    @FindBy(xpath = "//*[@id=\"first_form\"]/div/div[2]/center/input")
    private WebElement submitBtn;

    @FindBy(xpath = "/html/body/center[1]/h1")
    private WebElement userRegistrationText;


    //Methods

    public void clickMenuToggle(){
        menuToggle.click();
    }

    public void clickSignInPortal(){
        signInPortal.click();
    }

    public void clickUserRegistrationBtn(){
        userRegistrationBtn.click();
    }

    public void clickDropDown(){
        dropDown.click();
    }

    public void enterFirstName(){
        firstName.sendKeys("Software");
    }

    public void enterLastName(){
        lastName.sendKeys("Tester");
    }

    public void enterEmail(){
        emailId.sendKeys("softwaretester44@gmail.com");
    }

    public void enterContactNumber(){
        contactNumber.sendKeys("0123456789");
    }

    public void enterUserName(){
        userName.sendKeys("softwaretester44@gmail.com");
    }

    public void enterPassWord(){
        password.sendKeys("SoftWare_QA_Dev");
    }

    public void clickSubmitBtn(){
        submitBtn.click();
    }

    public void assertUserRegistrationText(){
        String expectedDetails = "User Registered Successfully !!!";

        String actualDetails = userRegistrationText.getText().trim();

        Assert.assertTrue("Product details do not match", actualDetails.contains(expectedDetails));
    }
}
