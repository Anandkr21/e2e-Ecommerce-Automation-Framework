package tests;

import base.BaseClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.SignupPage;

public class SignupPageTest extends BaseClass {

    private SignupPage signupPage;


    @BeforeMethod
    public void setUpPage(){
        signupPage = new SignupPage(driver);
    }

    @Test
    public void verifySignupPageNavigation(){
        signupPage.clickSignupNavigation();
    }
}
