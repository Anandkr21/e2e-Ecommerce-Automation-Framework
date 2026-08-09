package tests;

import base.BaseClass;
import org.testng.annotations.Test;
import pages.HomePage;

public class HomePageTest extends BaseClass {


    @Test
    public void verifyHomePage(){
        HomePage homepage = new HomePage(driver);
        homepage.clickHomePage();
    }
}
