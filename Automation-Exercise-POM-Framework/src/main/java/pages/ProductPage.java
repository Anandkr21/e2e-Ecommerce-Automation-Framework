package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import javax.swing.*;
import java.util.List;

public class ProductPage {

    // WebDriver
    private WebDriver driver;

    // constructor
    public ProductPage(WebDriver driver){
        this.driver = driver;
    }



    // locator
    private By productNavigation = By.cssSelector("a[href = '/products']");

    private By productList = By.cssSelector(".features_item .product-image");
    private By productNames = By.cssSelector(".productinfo p");
    private By productPrices = By.cssSelector(".productinfo h2");

    private By searchInput = By.id("search_product");
    private By searchButton = By.id("submit_search");



    // methods
    public void clickProducts(){
        driver.findElement(productNavigation).click();
    }

    public List<WebElement> getProducts(){
        return driver.findElements(productList);
    }

    public List<WebElement> getProductNames(){
        return driver.findElements(productNames);
    }

    public List<WebElement> getProductPrices(){
        return driver.findElements(productPrices);
    }

    public void searchProduct(String productName){
        driver.findElement(searchInput).sendKeys(productName);
        driver.findElement(searchButton).click();
    }


    public void clickProduct(String productName){
        List<WebElement> products = getProducts();

        for(WebElement product:products){
            String name = product
                    .findElement(By.cssSelector(".productinfor p"))
                    .getText();

            if(name.equalsIgnoreCase(productName)){
                product
                        .findElement(
                                By.xpath(".//a[contains(@href, '/product_details/")
                        )
                        .click();

                break;
            }
        }
    }
}
