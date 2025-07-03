package Pageobjects;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpage{
        WebDriver driver;

        public Loginpage(WebDriver driver) {
            this.driver = driver;
        }

        By email = By.id("email");
        By password = By.id("pass");
        By signIn = By.id("send2");

        public void login(String userEmail, String userPass) {
            driver.findElement(email).sendKeys(userEmail);
            driver.findElement(password).sendKeys(userPass);
            driver.findElement(signIn).click();
        }
    }


