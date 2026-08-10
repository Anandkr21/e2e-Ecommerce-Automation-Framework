package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    // =============== Variable
    private WebDriver driver;


    // =================== Constructor
    public LoginPage(WebDriver driver){
        this.driver = driver;
    }


    // =============== Locators
    private By loginSignupNavigation = By.cssSelector("a[href='/login']");
    private By emailInput = By.xpath("//input[2][@type='email' and @name = 'email']");
    private By passwordInput = By.xpath("//input[3][@type='password']");
    private By loginButton = By.xpath("//button[@type='submit']");


    // ============= Methods
    public void clickloginSignupNavigation(){
        driver.findElement(loginSignupNavigation).click();
    }
    public void clickLoginButton(String email, String password){
        driver.findElement(emailInput).sendKeys(email);
        driver.findElement(passwordInput).sendKeys(password);
        driver.findElement(loginButton).click();
    }



}
