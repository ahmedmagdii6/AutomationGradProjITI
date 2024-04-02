package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends PageBase {

    public LoginPage(WebDriver driver){
        super(driver);
    }

public void setEmail(String email){
    WebElement emailField = driver.findElement(By.id("Email"));
    inputText(emailField,email);
}

public void setPassword(String password){
        WebElement passwordField = driver.findElement(By.id("Password"));
        inputText(passwordField, password);
}

public void clickLoginButton(){

        WebElement loginButton = driver.findElement(By.xpath("//div[@class='buttons']//button[@type='submit']"));
        clicking(loginButton);
        new HomePage(driver);
}
    public void clickMyAccountButton(){

        WebElement accountButton = driver.findElement(By.xpath("//a[@href='/customer/info' and contains(., 'My account')]"));
        clicking(accountButton);
        new HomePage(driver);
    }
    public void clickLogoutButton(){

        WebElement logoutButton = driver.findElement(By.xpath("//a[@href='/logout' and @class='ico-logout']"));
        clicking(logoutButton);
        new HomePage(driver);
    }

}