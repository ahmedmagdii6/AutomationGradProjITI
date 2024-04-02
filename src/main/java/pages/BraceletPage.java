package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BraceletPage extends PageBase{
    public BraceletPage(WebDriver driver) {
        super(driver);
    }
    public BraceletPage clickAddButton(){

        WebElement addButton = driver.findElement(By.id("add-to-cart-button-41"));
        clicking(addButton);
        return new BraceletPage(driver);
    }
    public BraceletPage clickCart() {
        WebElement cartLink = driver.findElement(By.linkText("Shopping cart"));
        clicking(cartLink);
        return new BraceletPage(driver);
    }
}
