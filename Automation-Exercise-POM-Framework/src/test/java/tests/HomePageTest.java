package tests;

import base.BaseClass;
import org.openqa.selenium.remote.tracing.Propagator;
import org.testng.annotations.Test;
import pages.HomePage;

public class HomePageTest extends BaseClass {


    @Test
    public void verifyHomePage(){
        HomePage homepage = new HomePage(driver);
        homepage.clickHomePage();
    }

    @Test
    public void verifyProducts(){
        HomePage homePage = new HomePage(driver);
        homePage.clickProducts();
    }
    @Test
    public void verifyCart(){
        HomePage homePage = new HomePage(driver);
        homePage.clickCart();
    }
    @Test
    public void verifyLogin(){
        HomePage homePage = new HomePage(driver);
        homePage.clickLogin();
    }
    @Test
    public void verifyTestCases(){
        HomePage homePage = new HomePage(driver);
        homePage.clickTestCases();
    }@Test
    public void verifyAPITesting(){
        HomePage homePage = new HomePage(driver);
        homePage.clickAPITesting();
    }
    @Test
    public void verifyVideoTutorial(){
        HomePage homePage = new HomePage(driver);
        homePage.clickVideoTutorial();
    }
    @Test
    public void verifyContactUs(){
        HomePage homePage = new HomePage(driver);
        homePage.clickContactUs();
    }




}
