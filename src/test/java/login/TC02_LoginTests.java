package login;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class TC02_LoginTests extends BaseTests {

    HomePage HomePage;
    LoginPage loginPage;

    @Test
    public void testSuccessfulLogin(){
        HomePage = new HomePage(driver);
        HomePage.clickLogin();
        loginPage = new LoginPage(driver);
        loginPage.setEmail("ahmedm@gmail.com");
        loginPage.setPassword("Password");
        loginPage.clickLoginButton();
        loginPage.clickLogoutButton();
    }
}
