package register;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.RegisterPage;
import pages.RegisterResult;

public class TC01_RegisterTests extends BaseTests {

    HomePage HomePage;
    RegisterPage registerPage;
    RegisterResult registerResult;

    @Test
    public void testSuccessfulRegister(){
        HomePage = new HomePage(driver);
        HomePage.clickRegister();
        registerPage = new RegisterPage(driver);
        registerPage.setMale("male");
        registerPage.setFirstName("Ahmed");
        registerPage.setLastName("Magdy");
        registerPage.setEmail("ahmedm@gmail.com");
        registerPage.setPassword("Password");
        registerPage.setConfirmPassword("Password");
        registerPage.clickRegisterButton();
        registerResult = new RegisterResult(driver);
        registerResult.clickContinue();
    }
}
