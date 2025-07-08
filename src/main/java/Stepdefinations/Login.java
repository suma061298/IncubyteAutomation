package Stepdefinations;

import Pageobjects.Loginpage;
import Pageobjects.signup;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.UUID;

public class Login {
    WebDriver driver;
    signup signUp;
    Loginpage login;
  //  String emailGenerated = "Test123@gmail.com";
 //   String password = "Test@1234";
    @Given("user is on Magento login page")
    public void openLoginPage() {
        driver = new ChromeDriver();
        driver.get("https://magento.softwaretestingboard.com/customer/account/login/");
        login = new Loginpage(driver);
    }

    @When("user enters valid login credentials")
    public void enterLoginDetails() {

        login.login("Suma@gmail.com", "Suma@123");
    }

    @And("submits the login form")
    public void submitLoginForm() {
        // Handled in login method
    }

    @Then("user should be redirected to dashboard")
    public void verifyLogin() {
        boolean result = driver.getTitle().contains("My Account");
        System.out.println("Login Successful: " + result);
        driver.quit();
    }
}


