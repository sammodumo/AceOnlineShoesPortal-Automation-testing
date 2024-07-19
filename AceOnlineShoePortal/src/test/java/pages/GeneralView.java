package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GeneralView extends HomePage{
    public GeneralView(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(driver,this);
    }

    //Locators

    @FindBy(xpath = "//*[@id=\"menuToggle\"]/input")
    private WebElement menuToggle;

    @FindBy(xpath = "//*[@id=\"menu\"]/a[3]/li")
    private WebElement onlineProducts;

    @FindBy(xpath = "/html/body/div[2]/center/div/i[1]")
    private WebElement dropDown;

    @FindBy(xpath = "/html/body/div[2]/table/tbody/tr[1]/td[1]")
    private WebElement productName;

    //Methods

    public void clickMenuToggle(){
        menuToggle.click();
    }

    public void clickOnlineProducts(){
        onlineProducts.click();
    }

    public void clickDropDown(){
        dropDown.click();
    }

    public void assertForProductDetails() {

        String expectedDetails = "Classic Cheltenham";

        String actualDetails = productName.getText().trim();

        Assert.assertTrue("Product details do not match", actualDetails.contains(expectedDetails));
    }
}
