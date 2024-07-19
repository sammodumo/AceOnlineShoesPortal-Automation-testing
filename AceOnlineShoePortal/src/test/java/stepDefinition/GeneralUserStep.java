package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import pages.GeneralView;

public class GeneralUserStep {
    private WebDriver driver;
    private GeneralView generalView;

    @Given("User navigates to the Online products page")
    public void userNavigatesToTheOnlineProductsPage() throws InterruptedException {
        WebDriver driver = WebDriverManager.chromedriver().create();
        driver.get("https://anupdamoda.github.io/AceOnlineShoePortal/index.html");
        Thread.sleep(2000);
        generalView = new GeneralView(driver);

        generalView.clickMenuToggle();
        Thread.sleep(2000);

        generalView.clickOnlineProducts();
        Thread.sleep(2000);
    }

    @When("User clicks on formal Shoes drop down")
    public void userClicksOnFormalShoesDropDown() throws InterruptedException {
        generalView.clickDropDown();
        Thread.sleep(2000);
    }

    @Then("User should be able to view products")
    public void userShouldBeAbleToViewProducts() throws InterruptedException {
        generalView.assertForProductDetails();
        Thread.sleep(2000);
    }
}
