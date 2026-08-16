package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddToCartPage {

    // WebDriver
    private WebDriver driver;

    // Constructor
    public void AddToCartPage(WebDriver driver){
        this.driver = driver;
    }

    // Locators
    private By productNavigation = By.cssSelector("a[href = '/products']");

    private By addToCartBtn1 = By.cssSelector("a[data-product-id='1']");
    private By continueShoppingBtn1 = By.xpath("//button[text()='Continue Shopping']");

    private By addToCartBtn2 = By.cssSelector("a[data-product-id='2']");
    private By continueShoppingBtn2 = By.xpath("//button[text()='Continue Shopping']");

    private By viewCartNavigation = By.cssSelector("a[href='/view cart']");

    private By deleteCartItem = By.cssSelector("a[data-product-id='1']");

    private By proceedToCheckout = By.linkText("Proceed To Checkout");



    // Methods
    public void clickProductNavigation(){
        driver.findElement(productNavigation);
    }


}
