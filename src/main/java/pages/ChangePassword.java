package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ChangePassword extends PageBase{
    public ChangePassword(WebDriver driver) {
        super(driver);
    }
    public void setOldPassword(String oldPassword){
        WebElement oldpasswordField = driver.findElement(By.id("OldPassword"));
        inputText(oldpasswordField, oldPassword);
    }
    public void setNewPassword(String newPassword){
        WebElement newpasswordField = driver.findElement(By.id("NewPassword"));
        inputText(newpasswordField, newPassword);
    }
    public void setConfirmPassword(String confirmPassword){
        WebElement confirmpasswordField = driver.findElement(By.id("ConfirmNewPassword"));
        inputText(confirmpasswordField, confirmPassword);
    }
    public void clickChangeButton(){

        WebElement changeButton = driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[2]/div/div[2]/form/div[2]/button"));
        clicking(changeButton);
        new ChangePassword(driver);
    }
    public void clickCloseButton(){

        WebElement closeButton = driver.findElement(By.xpath("//span[@class='close' and @title='Close']"));
        clicking(closeButton);
        new ChangePassword(driver);
    }




}
