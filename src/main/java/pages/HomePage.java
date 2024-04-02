package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends PageBase {

    public HomePage(WebDriver driver){
        super (driver);
    }
    public RegisterPage clickRegister(){
        WebElement registerLink = driver.findElement(By.linkText("Register"));
        clicking(registerLink);
        return new RegisterPage(driver);
    }

    public LoginPage clickLogin() {
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        clicking(loginLink);
        return new LoginPage(driver);
    }
    public LoginPage clickLogout() {
        WebElement logoutLink = driver.findElement(By.linkText("Log out"));
        clicking(logoutLink);
        return new LoginPage(driver);
    }
}