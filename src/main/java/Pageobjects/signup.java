package Pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class signup
{
        WebDriver driver;

        public signup(WebDriver driver) {
            this.driver = driver;
        }

        By firstName = By.id("firstname");
        By lastName = By.id("lastname");
        By email = By.id("email_address");
        By password = By.id("password");
        By confirmPassword = By.id("password-confirmation");
        By submit = By.cssSelector("button[title='Create an Account']");

        public void registerUser(String fname, String lname, String emailAddr, String pwd) {
            driver.findElement(firstName).sendKeys(fname);
            driver.findElement(lastName).sendKeys(lname);
            driver.findElement(email).sendKeys(emailAddr);
            driver.findElement(password).sendKeys(pwd);
            driver.findElement(confirmPassword).sendKeys(pwd);
            driver.findElement(submit).click();
        }
    }

