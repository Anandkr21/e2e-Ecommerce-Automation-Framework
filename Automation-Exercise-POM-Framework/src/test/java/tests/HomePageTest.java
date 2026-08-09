package tests;

import base.BaseClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import utils.ConfigReader;

public class HomePageTest extends BaseClass {

    private HomePage homePage;
    String email = ConfigReader.getProperty("email");


    @BeforeMethod
    public void setUpPage(){
        homePage = new HomePage(driver);
    }
    @Test(priority = 1)
    public void verifyHomePageNavigation(){
        homePage.clickHomePage();
    }
    @Test(priority = 2)
    public void verifyProductsPageNavigation(){
        homePage.clickProducts();
    }
    @Test(priority = 3)
    public void verifyCartPageNavigation(){
        homePage.clickCart();
    }
    @Test(priority = 4)
    public void verifyLoginPageNavigation(){
        homePage.clickLogin();
    }
    @Test(priority = 5)
    public void verifyTestCasesPageNavigation(){
        homePage.clickTestCases();
    }
    @Test(priority = 6)
    public void verifyAPITestingPageNavigation(){
        homePage.clickAPITesting();
    }
    @Test(priority = 7)
    public void verifyVideoTutorialPageNavigation(){
        homePage.clickVideoTutorial();
    }
    @Test(priority = 8)
    public void verifyContactUsPageNavigation(){
        homePage.clickContactUs();
    }
    @Test(priority = 9)
    public void verifySubscription(){
        homePage.clickSubscribeToNewsletter(email);
    }

}
