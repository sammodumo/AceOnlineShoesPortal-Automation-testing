package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    WebDriver driver;

    public HomePage(WebDriver webDriver){
        driver = webDriver;
        PageFactory.initElements(driver,this);
    }

    //Locators

    @FindBy(xpath = "//*[@id=\"menuToggle\"]/input")
    private WebElement menuToggle;

    @FindBy(xpath = "//*[@id=\"menu\"]/a[2]/li")
    private WebElement signInPortal;

    @FindBy(xpath = "//*[@id=\"usr\"]")
    private WebElement userName;

    @FindBy(xpath = "//*[@id=\"pwd\"]")
    private WebElement password;

    @FindBy(xpath = "//*[@id=\"second_form\"]/input")
    private WebElement loginBtn;

    @FindBy(xpath = "//*[@id=\"ShoeType\"]")
    private WebElement productType;

    //Methods

    public void clickMenuToggle(){
        menuToggle.click();
    }

    public void clickSignInPortal(){
        signInPortal.click();
    }

    public void enterUsername(){
        userName.sendKeys("SoftwareTester44");
    }

    public void enterPassword(){
        password.sendKeys("SQA_Dev");
    }

    public void clickLogInBtn(){
        loginBtn.click();
    }

    public void assertProductDetails() {

        String expectedDetails = "Formal Shoes";

        String actualDetails = productType.getText().trim();

        Assert.assertTrue("Product details do not match", actualDetails.contains(expectedDetails));
    }
}
