package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import pages.UserRegistration;

public class UserRegistrationStep {

    private WebDriver driver;
    private UserRegistration userRegistration;

    @Given("User navigates to the Login page in Registration")
    public void userNavigatesToTheLoginPageInRegistration() throws InterruptedException {
        WebDriver driver = WebDriverManager.chromedriver().create();
        driver.get("https://anupdamoda.github.io/AceOnlineShoePortal/index.html");
        Thread.sleep(2000);
        userRegistration = new UserRegistration(driver);

        userRegistration.clickMenuToggle();
        Thread.sleep(2000);

        userRegistration.clickSignInPortal();
        Thread.sleep(2000);

    }

    @When("User clicks on new Registration button")
    public void userClicksOnNewRegistrationButton() throws InterruptedException {
        userRegistration.clickUserRegistrationBtn();
        Thread.sleep(2000);
    }

    @And("User fills out the registration form with valid details")
    public void userFillsOutTheRegistrationFormWithValidDetails() throws InterruptedException {
        userRegistration.clickDropDown();
        Thread.sleep(2000);

        userRegistration.enterFirstName();
        Thread.sleep(2000);

        userRegistration.enterLastName();
        Thread.sleep(2000);

        userRegistration.enterEmail();
        Thread.sleep(2000);

        userRegistration.enterContactNumber();
        Thread.sleep(2000);

        userRegistration.enterUserName();
        Thread.sleep(2000);

        userRegistration.enterPassWord();
        Thread.sleep(2000);
    }

    @And("User submits the registration form")
    public void userSubmitsTheRegistrationForm() throws InterruptedException {
        userRegistration.clickSubmitBtn();
        Thread.sleep(2000);
    }

    @Then("User should be registered successfully")
    public void userShouldBeRegisteredSuccessfully() throws InterruptedException {
        userRegistration.assertUserRegistrationText();
        Thread.sleep(2000);
    }
}
