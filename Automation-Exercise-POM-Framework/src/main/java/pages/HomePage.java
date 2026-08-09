package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    // variable
    private WebDriver driver;


    // constructor
    public HomePage(WebDriver driver){
        this.driver = driver;
    }


    // Locator
    private By homeLink = By.linkText("Home");
    private By products = By.cssSelector("a[href='/products']");
    private By cart = By.cssSelector("a[href='/view_cart']");
    private By login = By.cssSelector("a[href='/login']");
    private By testCases = By.cssSelector("a[href='/test_cases']");
    private By apiTesting = By.cssSelector("a[href='/api_list']");
    private By videoTutorial = By.partialLinkText("Video Tutorials");
    private By contactUs = By.cssSelector("a[href='/contact_us']");


    // Method
    public void clickHomePage(){
        driver.findElement(homeLink).click();
    }
    public void clickProducts(){
        driver.findElement(products).click();
    }
    public void clickCart(){
        driver.findElement(cart).click();
    }
    public void clickLogin(){
        driver.findElement(login).click();
    }
    public void clickTestCases(){
        driver.findElement(testCases).click();
    }
    public void clickAPITesting(){
        driver.findElement(apiTesting).click();
    }
    public void clickVideoTutorial(){
        driver.findElement(videoTutorial).click();
    }
    public void clickContactUs(){
        driver.findElement(contactUs).click();
    }
}
