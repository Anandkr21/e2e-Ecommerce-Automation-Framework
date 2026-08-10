package tests;

import base.BaseClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.LoginPage;
import utils.ConfigReader;

public class LoginPageTest extends BaseClass {

    private LoginPage loginPage;

    // ===== Reading Config file data
    String email = ConfigReader.getProperty("signUpEmail");
    String password = ConfigReader.getProperty("password");


    @BeforeMethod
    public void setLoginPage(){
        loginPage = new LoginPage(driver);
    }

    @Test
    public void verifyUserLogin(){
        loginPage.clickloginSignupNavigation();
        loginPage.clickLoginButton(email, password);
    }

}
