package Stepdefinations;

import Pageobjects.Loginpage;
import Pageobjects.signup;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class SignupStepdefination {

    WebDriver driver;
    signup signup;
    Loginpage login;
  //  String emailGenerated = "Test123@gmail.com";
  //  String password = "Test@1234";

    @Given("user is on Magento create account page")
    public void openCreateAccountPage() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://magento.softwaretestingboard.com/customer/account/create/");
        signup= new signup(driver);
    }

    @When("user enters valid registration details")
    public void enterRegistrationDetails() {
        signup.registerUser("Suma", "latha","Suma@gmail.com","Suma@123");
    }

    @And("submits the registration form")
    public void submitRegistrationForm() {

    }

    @Then("user should be redirected to My Account page")
    public void verifyAccountPage() {
        boolean result = driver.getTitle().contains("My Account");
        System.out.println("Account Created: " + result);
    }


}





