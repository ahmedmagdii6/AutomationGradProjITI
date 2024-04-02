package changePassword;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.ChangePassword;
import pages.HomePage;
import pages.LoginPage;
import pages.MyAccount;

public class TC04_ChangePassword extends BaseTests {

    HomePage HomePage;
    LoginPage loginPage;
    MyAccount myAccount;
    ChangePassword changePassword;

    @Test
    public void testSuccessfulChangePassword(){
        HomePage = new HomePage(driver);
        HomePage.clickLogin();
        loginPage = new LoginPage(driver);
        loginPage.setEmail("ahmedm@gmail.com");
        loginPage.setPassword("Password");
        loginPage.clickLoginButton();
        loginPage.clickMyAccountButton();
        myAccount = new MyAccount(driver);
        myAccount.clickChangePasswordButton();
        changePassword = new ChangePassword(driver);
        changePassword.setOldPassword("Password");
        changePassword.setNewPassword("Password1");
        changePassword.setConfirmPassword("Password1");
        changePassword.clickChangeButton();
        changePassword.clickCloseButton();
        loginPage.clickLogoutButton();
    }
}
