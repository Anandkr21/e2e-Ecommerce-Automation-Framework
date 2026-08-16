package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddToCartPage {

    // WebDriver
    private WebDriver driver;

    //Constructor
    public AddToCartPage(WebDriver driver) {
        this.driver = driver;
    }


    //Locators
    private By productNavigation =
            By.cssSelector("a[href='/products']");

    private By addToCartBtn1 =
            By.cssSelector("a[data-product-id='1']");

    private By continueShoppingBtn =
            By.xpath("//button[text()='Continue Shopping']");

    private By addToCartBtn2 =
            By.cssSelector("a[data-product-id='2']");

    private By viewCartNavigation =
            By.cssSelector("a[href='/view_cart']");

    private By deleteCartItem =
            By.cssSelector("a[data-product-id='1']");

    private By proceedToCheckout =
            By.linkText("Proceed To Checkout");


    // Methods
    public void clickProductNavigation() {
        driver.findElement(productNavigation).click();
    }

    public void clickAddToCart1() {

        WebElement addToCart = driver.findElement(addToCartBtn1);

        ((JavascriptExecutor) driver)
                .executeScript(
                        "arguments[0].scrollIntoView({block: 'center'});",
                        addToCart
                );

        addToCart.click();
    }

    public void clickAddToCart2() {
        driver.findElement(addToCartBtn2).click();
    }

    public void clickContinueShopping() {
        driver.findElement(continueShoppingBtn).click();
    }

    public void clickViewCartNavigation() {
        driver.findElement(viewCartNavigation).click();
    }
}
