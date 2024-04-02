package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JewelryPage extends PageBase{
    public JewelryPage(WebDriver driver) {
        super(driver);
    }

    public JewelryPage clickJewelry() {
        WebElement JewelryLink = driver.findElement(By.linkText("Jewelry"));
        clicking(JewelryLink);
        return new JewelryPage(driver);
    }




}
