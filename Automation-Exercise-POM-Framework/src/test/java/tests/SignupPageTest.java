package tests;

import base.BaseClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.SignupPage;
import utils.ConfigReader;

public class SignupPageTest extends BaseClass {

    private SignupPage signupPage;
    String signUpEmail = ConfigReader.getProperty("signUpEmail");
    String name = ConfigReader.getProperty("name");


    @BeforeMethod
    public void setUpPage(){
        signupPage = new SignupPage(driver);
    }
    @Test
    public void verifyUserSignup() {

        signupPage.clickSignupNavigation();
        signupPage.enterSignupDetails(name, signUpEmail);

        signupPage.selectMaleGender();
        signupPage.enterPassword("12345678");
        signupPage.selectDay("12");
        signupPage.selectMonth("May");
        signupPage.selectYear("2000");
        signupPage.selectNewsletter();
        signupPage.selectOptin();

        signupPage.enterFirstName("John");
        signupPage.enterLastName("Cena");
        signupPage.enterCompany("ABC");
        signupPage.enterAddress1("CP");
        signupPage.enterAddress2("Dwarka");
        signupPage.enterState("Delhi");
        signupPage.enterCity("Delhi");
        signupPage.enterZipcode("123456");
        signupPage.enterMobileNumber("123456790");

        signupPage.clickCreateAccount();
    }


}
