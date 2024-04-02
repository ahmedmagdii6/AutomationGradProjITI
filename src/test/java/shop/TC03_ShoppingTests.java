package shop;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.*;

public class TC03_ShoppingTests extends BaseTests {

    HomePage HomePage;
    LoginPage loginPage;
    JewelryPage jewelryPage;
    FlowerGirlBracelet flowerGirlBracelet;
    BraceletPage braceletPage;
    ShoppingCart shoppingCart;
    CheckoutPage checkoutPage;

    @Test
    public void testSuccessfulShop(){
        HomePage = new HomePage(driver);
        HomePage.clickLogin();
        loginPage = new LoginPage(driver);
        loginPage.setEmail("ahmedm@gmail.com");
        loginPage.setPassword("Password");
        loginPage.clickLoginButton();
        jewelryPage = new JewelryPage(driver);
        jewelryPage.clickJewelry();
        flowerGirlBracelet = new FlowerGirlBracelet(driver);
        flowerGirlBracelet.clickFlower();
        braceletPage = new BraceletPage(driver);
        braceletPage.clickAddButton();
        braceletPage.clickCart();
        shoppingCart = new ShoppingCart(driver);
        shoppingCart.clicktickTerms();
        shoppingCart.clickcheckoutButton();
        checkoutPage = new CheckoutPage(driver);
        checkoutPage.clickDropdown();
        checkoutPage.setCity("Sheikh Zayed");
        checkoutPage.setAddress("Beverly Hills");
        checkoutPage.setPostal("12345");
        checkoutPage.setNumber("01150262640");
        checkoutPage.clickContinue();
        checkoutPage.setNextDay("Next Day Air");
        checkoutPage.clickContinue2();
        checkoutPage.clickContinue3();
        checkoutPage.clickContinue4();
        checkoutPage.clickConfirm();
        HomePage.clickLogout();
    }
}
