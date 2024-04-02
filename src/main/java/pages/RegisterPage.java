package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterPage extends PageBase {


    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    public void setMale(String male){
        WebElement maleRadioButton = driver.findElement(By.id("gender-male"));
        maleRadioButton.click();
    }

    public void setFirstName(String firstName){
        WebElement firstNameField = driver.findElement(By.id("FirstName"));
        inputText(firstNameField,firstName);
    }
    public void setLastName(String lastName){
        WebElement lastNameField = driver.findElement(By.id("LastName"));
        inputText(lastNameField,lastName);
    }
    public void setEmail(String email){
        WebElement emailField = driver.findElement(By.id("Email"));
        inputText(emailField,email);
    }

    public void setPassword(String password){
        WebElement passwordField = driver.findElement(By.id("Password"));
        inputText(passwordField, password);
    }
    public void setConfirmPassword(String password){
        WebElement passwordField = driver.findElement(By.id("ConfirmPassword"));
        inputText(passwordField, password);
    }
    public HomePage clickRegisterButton(){

        WebElement registerButton = driver.findElement(By.id("register-button"));
        clicking(registerButton);
        return new HomePage(driver);
    }
}
