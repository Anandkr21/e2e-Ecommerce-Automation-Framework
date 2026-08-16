package tests;

import base.BaseClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.AddToCartPage;

public class AddToCartPageTest extends BaseClass {

    private AddToCartPage addToCartPage;

    @BeforeMethod
    public void setUpPage() {
        addToCartPage = new AddToCartPage(driver);
    }

    @Test
    public void verifyAddToCart() {

        // Navigate to Products
        addToCartPage.clickProductNavigation();

        // Add product 1
        addToCartPage.clickAddToCart1();

        // Continue shopping
        addToCartPage.clickContinueShopping();

        // Add product 2
        addToCartPage.clickAddToCart2();

        // Continue shopping
        addToCartPage.clickContinueShopping();

        // Open cart
        addToCartPage.clickViewCartNavigation();
    }
}