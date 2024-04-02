package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterResult extends PageBase{


    public RegisterResult(WebDriver driver) {
        super(driver);
    }
    public RegisterResult clickContinue(){

        WebElement continueButton = driver.findElement(By.xpath("//a[@class='button-1 register-continue-button' and contains(., 'Continue')]"));
        clicking(continueButton);
        return new RegisterResult(driver);
    }
}
