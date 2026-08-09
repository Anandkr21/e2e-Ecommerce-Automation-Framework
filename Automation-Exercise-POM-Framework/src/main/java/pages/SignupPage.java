package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignupPage {

    // variable
    private WebDriver driver;

    // constructor
    public  SignupPage(WebDriver driver){
        this.driver = driver;
    }

    // locators
    By signupBtn = By.cssSelector("a[href='/login']");
    By inputText = By.xpath("//input[@type = 'text' and @name= 'name']");
    By emailInput = By.xpath("//form/input[3][@type='email']");
    By alertMessage = By.xpath("//p[contains(text(), 'Email Address already exist!')]");


    // methods
    public void clickSignupNavigation(){
        driver.findElement(signupBtn).click();
    }

}
