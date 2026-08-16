package tests;

import base.BaseClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.ProductPage;
import utils.ConfigReader;

public class ProductPageTest extends BaseClass {

    private ProductPage productPage;
    String searchProduct = ConfigReader.getProperty("searchProduct");
    String productName = ConfigReader.getProperty("productName");

    @BeforeMethod
    public void setUpPage(){
        productPage = new ProductPage(driver);
    }

    @Test(priority = 1)
    public void verifyProductPageNavigation(){
        productPage.clickProducts();
    }

    @Test (priority = 2)
    public void verifyProductName(){
        productPage.getProductNames()
                .forEach(product -> System.out.println(product.getText()));

    }

    @Test (priority = 3)
    public void verifyProductPrices(){
        productPage.getProductPrices()
                .forEach(price -> System.out.println(price.getText()));
    }

    @Test(priority = 4)
    public void verifySearch(){

        productPage.clickProducts();
        productPage.searchProduct(searchProduct);
    }

    @Test (priority = 5)
    public void verifyProductSelection(){
        productPage.clickProducts();
        productPage.clickProduct(productName);
    }





}
