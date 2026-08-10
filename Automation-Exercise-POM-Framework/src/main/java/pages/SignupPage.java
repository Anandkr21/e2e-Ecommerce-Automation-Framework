package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class SignupPage {

    // Variable
    private WebDriver driver;

    // Constructor
    public  SignupPage(WebDriver driver){
        this.driver = driver;
    }

    // Locators
    // =============== SignUp / Login Page
    private By loginSignupNavigation = By.cssSelector("a[href='/login']");
    private By nameInput = By.name("name");
    private By emailInput = By.xpath("//form/input[3][@type='email']");
    private By existingEmailMessage = By.xpath("//p[contains(text(), 'Email Address already exist!')]");
    private By signupButton = By.xpath("//button[text()='Signup']");

    // ================ Account Info Page

    private By maleRadioButton = By.id("id_gender1");
    private By femaleRadioButton = By.id("id_gender2");
    private By passwordInput = By.id("password");
    private By dayDropdown = By.id("days");
    private By monthDropdown = By.id("months");
    private By yearDropdown = By.id("years");
    private By newsletterCheckbox = By.id("newsletter");
    private By optinCheckbox = By.id("optin");

    // ============ Address Information
    private By firstNameInput = By.id("first_name");
    private By lastNameInput = By.id("last_name");
    private By companyInput = By.id("company");
    private By address1Input = By.id("address1");
    private By address2Input = By.id("address2");
    private By stateInput = By.id("state");
    private By cityInput = By.id("city");
    private By zipcodeInput = By.id("zipcode");
    private By mobileNumberInput = By.id("mobile_number");
    private By createAccountButton = By.xpath("//button[text()='Create Account']");


    // =================Methods

    public void clickSignupNavigation() {
        driver.findElement(loginSignupNavigation).click();
    }
    public void alertMsg() {
        driver.findElement(existingEmailMessage);
    }
    public void enterSignupDetails(String name, String email) {
        driver.findElement(nameInput).sendKeys(name);
        driver.findElement(emailInput).sendKeys(email);
        driver.findElement(signupButton).click();
    }


    // ============ Account Information

    public void selectMaleGender() {
        driver.findElement(maleRadioButton).click();
    }
    public void selectFemaleGender() {
        driver.findElement(femaleRadioButton).click();
    }
    public void enterPassword(String password) {
        driver.findElement(passwordInput).sendKeys(password);
    }
    public void selectDay(String day) {
        Select select = new Select(driver.findElement(dayDropdown));
        select.selectByVisibleText(day);
    }
    public void selectMonth(String month) {
        Select select = new Select(driver.findElement(monthDropdown));
        select.selectByVisibleText(month);
    }
    public void selectYear(String year) {
        Select select = new Select(driver.findElement(yearDropdown));
        select.selectByVisibleText(year);
    }
    public void selectNewsletter() {
        driver.findElement(newsletterCheckbox).click();
    }
    public void selectOptin() {
        driver.findElement(optinCheckbox).click();
    }


    // ============ Address

    public void enterFirstName(String firstName) {
        driver.findElement(firstNameInput).sendKeys(firstName);
    }
    public void enterLastName(String lastName) {
        driver.findElement(lastNameInput).sendKeys(lastName);
    }
    public void enterCompany(String company) {
        driver.findElement(companyInput).sendKeys(company);
    }
    public void enterAddress1(String address1) {
        driver.findElement(address1Input).sendKeys(address1);
    }
    public void enterAddress2(String address2) {
        driver.findElement(address2Input).sendKeys(address2);
    }
    public void enterState(String state) {
        driver.findElement(stateInput).sendKeys(state);
    }
    public void enterCity(String city) {
        driver.findElement(cityInput).sendKeys(city);
    }
    public void enterZipcode(String zipcode) {
        driver.findElement(zipcodeInput).sendKeys(zipcode);
    }
    public void enterMobileNumber(String mobileNumber) {
        driver.findElement(mobileNumberInput).sendKeys(mobileNumber);
    }
    public void clickCreateAccount() {
        driver.findElement(createAccountButton).click();
    }
}
