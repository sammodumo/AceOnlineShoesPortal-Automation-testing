package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import pages.HomePage;

public class HomePageStep {

    private WebDriver driver;
    private HomePage homePage;

    @Given("User navigates to the Login page")
    public void userNavigatesToTheLoginPage() throws InterruptedException {
        WebDriver driver = WebDriverManager.chromedriver().create();
        driver.get("https://anupdamoda.github.io/AceOnlineShoePortal/index.html");
        Thread.sleep(2000);
        homePage = new HomePage(driver);

        homePage.clickMenuToggle();
        Thread.sleep(2000);

        homePage.clickSignInPortal();
        Thread.sleep(2000);

    }

    @When("User successfully enters the log in credentials")
    public void userSuccessfullyEntersTheLogInCredentials() throws InterruptedException {
        homePage.enterUsername();
        Thread.sleep(2000);

        homePage.enterPassword();
        Thread.sleep(2000);

        homePage.clickLogInBtn();
        Thread.sleep(2000);
    }

    @Then("User should be able to view product category page")
    public void userShouldBeAbleToViewProductCategoryPage() throws InterruptedException {
        homePage.assertProductDetails();
        Thread.sleep(2000);
    }
}
