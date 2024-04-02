package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyAccount extends PageBase {

    public MyAccount(WebDriver driver) {
        super(driver);
    }

    public void clickChangePasswordButton(){

        WebElement changePasswordButton = driver.findElement(By.xpath("//a[text()='Change password']"));
        clicking(changePasswordButton);
        new MyAccount(driver);
    }

}
