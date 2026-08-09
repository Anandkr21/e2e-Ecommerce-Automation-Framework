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


    // Method
    public void clickHomePage(){
        driver.findElement(homeLink).click();
    }
}
