package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CheckoutPage extends PageBase {
    public CheckoutPage(WebDriver driver) {
        super(driver);
    }

    public void clickDropdown() {

        WebElement dropdown = driver.findElement(By.id("BillingNewAddress_CountryId"));
        Select select = new Select(dropdown);
        select.selectByVisibleText("Egypt");
        new CheckoutPage(driver);
    }

    public void setCity(String city) {
        WebElement cityField = driver.findElement(By.id("BillingNewAddress_City"));
        inputText(cityField, city);
    }

    public void setAddress(String address) {
        WebElement addressField = driver.findElement(By.id("BillingNewAddress_Address1"));
        inputText(addressField, address);
    }

    public void setPostal(String postal) {
        WebElement postalField = driver.findElement(By.id("BillingNewAddress_ZipPostalCode"));
        inputText(postalField, postal);
    }

    public void setNumber(String number) {
        WebElement numberField = driver.findElement(By.id("BillingNewAddress_PhoneNumber"));
        inputText(numberField, number);
    }

    public void clickContinue() {

        WebElement continueButton = driver.findElement(By.xpath("//button[@name='save' and @class='button-1 new-address-next-step-button' and contains(., 'Continue')]"));
        clicking(continueButton);
        new CheckoutPage(driver);
    }

    public void setNextDay(String nextDay) {
        WebElement nextDayButton = driver.findElement(By.id("shippingoption_1"));
        clicking(nextDayButton);
    }

    public void clickNotNow() {

        WebElement notNowButton = driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/ol/li[3]/div[2]/form/div[2]/button"));
        clicking(notNowButton);
        new CheckoutPage(driver);
    }

    public void clickContinue2() {

        WebElement continueButton = driver.findElement(By.xpath("//button[@class='button-1 shipping-method-next-step-button' and @onclick='if (!window.__cfRLUnblockHandlers) return false; ShippingMethod.save()']"));
        clicking(continueButton);
        new CheckoutPage(driver);
    }
    public void clickContinue3() {

        WebElement continueButton = driver.findElement(By.xpath("//button[@name='save' and @class='button-1 payment-method-next-step-button']"));
        clicking(continueButton);
        new CheckoutPage(driver);
    }
    public void clickContinue4() {

        WebElement continueButton = driver.findElement(By.xpath("//button[@type='button' and @class='button-1 payment-info-next-step-button']"));
        clicking(continueButton);
        new CheckoutPage(driver);
    }
    public void clickConfirm() {

        WebElement confirmButton = driver.findElement(By.xpath("//button[@class='button-1 confirm-order-next-step-button' and text()='Confirm']"));
        clicking(confirmButton);
        new CheckoutPage(driver);
    }
}