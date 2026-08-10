package tests;

import base.BaseClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.SignupPage;
import utils.ConfigReader;

public class SignupPageTest extends BaseClass {

    private SignupPage signupPage;

    // Reading data from Config file
    String signUpEmail = ConfigReader.getProperty("signUpEmail");
    String name = ConfigReader.getProperty("name");


    String password = ConfigReader.getProperty("password");
    String day = ConfigReader.getProperty("day");
    String month = ConfigReader.getProperty("month");
    String year = ConfigReader.getProperty("year");
    String fName = ConfigReader.getProperty("fName");
    String lName = ConfigReader.getProperty("lName");
    String company = ConfigReader.getProperty("company");
    String address1 = ConfigReader.getProperty("address1");
    String address2 = ConfigReader.getProperty("address2");
    String state = ConfigReader.getProperty("state");
    String city = ConfigReader.getProperty("city");
    String zipcode = ConfigReader.getProperty("zipcode");
    String mobile = ConfigReader.getProperty("mobile");

    // ==========================================================================

    @BeforeMethod
    public void setUpPage(){
        signupPage = new SignupPage(driver);
    }
    @Test
    public void verifyUserSignup() {

        signupPage.clickSignupNavigation();
        signupPage.enterSignupDetails(name, signUpEmail);

        // Checking if user already exist, further process will be terminate

        if (signupPage.getExistingEmailMessage()) {
            System.out.println("User is already registered.");
            return;
        }


        signupPage.selectMaleGender();
        signupPage.enterPassword(password);
        signupPage.selectDay(day);
        signupPage.selectMonth(month);
        signupPage.selectYear(year);
        signupPage.selectNewsletter();
        signupPage.selectOptin();

        signupPage.enterFirstName(fName);
        signupPage.enterLastName(lName);
        signupPage.enterCompany(company);
        signupPage.enterAddress1(address1);
        signupPage.enterAddress2(address2);
        signupPage.enterState(state);
        signupPage.enterCity(city);
        signupPage.enterZipcode(zipcode);
        signupPage.enterMobileNumber(mobile);

        signupPage.clickCreateAccount();
    }


}
