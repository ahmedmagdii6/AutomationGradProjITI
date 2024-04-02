package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FlowerGirlBracelet extends PageBase{
    public FlowerGirlBracelet(WebDriver driver) {
        super(driver);
    }
    public FlowerGirlBracelet clickFlower() {
        WebElement FlowerLink = driver.findElement(By.linkText("Flower Girl Bracelet"));
        clicking(FlowerLink);
        return new FlowerGirlBracelet(driver);
    }


}
