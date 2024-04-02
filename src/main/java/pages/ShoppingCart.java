package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShoppingCart extends PageBase{
    public ShoppingCart(WebDriver driver) {
        super(driver);
    }

    public ShoppingCart clicktickTerms(){

        WebElement checkbox = driver.findElement(By.id("termsofservice"));
        if (!checkbox.isSelected()) {
            checkbox.click();
        }
        return new ShoppingCart(driver);
    }
    public ShoppingCart clickcheckoutButton(){

        WebElement checkoutButton = driver.findElement(By.id("checkout"));
        clicking(checkoutButton);
        return new ShoppingCart(driver);
    }
}
