package com.tutorialsninja.qafox.utilities;

import com.tutorialsninja.qafox.RegisterPage;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CheckoutPageInvalidRegUserLogin extends BasePage{

    //returning customer section web elements
    @FindBy(xpath = "//div[@id='collapse-checkout-option']//div[@class='col-sm-6'][2]//input[@id='input-email']")
    private WebElement checkoutPageReturningCustomerSectionEmailInputField;
    @FindBy(xpath = "//div[@id='collapse-checkout-option']//div[@class='col-sm-6'][2]//input[@id='input-password']")
    private WebElement checkoutPageReturningCustomerSectionPasswordInputField;
    @FindBy(xpath = "//div[@id='collapse-checkout-option']//div[@class='col-sm-6'][2]/input")
    private WebElement checkoutPageReturningCustomerLoginButton;
    //invalid singular input error element
    @FindBy(xpath = "//div[@class='alert alert-danger alert-dismissible']")
    private WebElement checkoutPageReturningCustomerInvalidLoginInputError;

    //valid registered user data (for remaining inputs)
    private String validRegUserLoginEmail;
    private String validRegUserLoginPassword;

    //no singular input
    private String noValidRegUserLoginEmail;
    private String noValidRegUserLoginPassword;

    //invalid singular input
    private String invalidRegUserLoginEmail;
    private String invalidRegUserLoginPassword;

    public CheckoutPageInvalidRegUserLogin(WebDriver driver) {super(driver);}

    //valid registered user login credentials input methods (for remaining inputs)
    public void inputCheckoutLoginEmailIntoEmailInputField() {checkoutPageReturningCustomerSectionEmailInputField.sendKeys(validRegUserLoginEmail);}
    public void inputCheckoutLoginPasswordIntoPasswordInputField() {checkoutPageReturningCustomerSectionPasswordInputField.sendKeys(validRegUserLoginPassword);}

    //invalid registered user credentials getter - no login email
    public void invalidRegUserLoginCheckoutDataNoEmailGetter(RegisterPage registerPage) {

        noValidRegUserLoginEmail = "";
        validRegUserLoginPassword = registerPage.getUserPassword();

        System.out.println("Invalid checkout registered user login credentials (no login email): " + "\n");
        logger.info("No checkout login email: " + noValidRegUserLoginEmail);
        logger.info("Valid checkout login password (no login email): " + validRegUserLoginPassword);
        System.out.println("\n");

    }

    //invalid registered user credentials getter - no login password
    public void invalidRegUserLoginCheckoutDataNoPasswordGetter(RegisterPage registerPage) {

        validRegUserLoginEmail = registerPage.getUserEmail();
        noValidRegUserLoginPassword = "";

        System.out.println("Invalid checkout registered user login credentials (no login password): " + "\n");
        logger.info("Valid checkout login email (no login password): " + validRegUserLoginEmail);
        logger.info("No checkout login password: " + noValidRegUserLoginPassword);
        System.out.println("\n");

    }

    //invalid registered user credentials getter - invalid login email
    public void invalidRegUserLoginCheckoutDataInvalidEmailGetter(RegisterPage registerPage) {

        invalidRegUserLoginEmail = "bghgfd@fakemail.com";
        validRegUserLoginPassword = registerPage.getUserPassword();

        System.out.println("Invalid checkout registered user login credentials (invalid login email): " + "\n");
        logger.info("Invalid checkout login email: " + invalidRegUserLoginEmail);
        logger.info("Valid checkout login password (invalid login email): " + validRegUserLoginPassword);
        System.out.println("\n");

    }

    //invalid registered user credentials getter - invalid login password
    public void invalidRegUserLoginCheckoutDataInvalidPasswordGetter(RegisterPage registerPage) {

        validRegUserLoginEmail = registerPage.getUserEmail();
        invalidRegUserLoginPassword = "Fdfggrt433432dws";

        System.out.println("Invalid checkout registered user login credentials (invalid login password): " + "\n");
        logger.info("Valid checkout login email (invalid login password): " + validRegUserLoginEmail);
        logger.info("Invalid checkout login password: " + invalidRegUserLoginPassword);
        System.out.println("\n");

    }

    //invalid registered user login credentials input methods - no singular input
    public void inputNoCheckoutLoginEmailIntoEmailInputField() {checkoutPageReturningCustomerSectionEmailInputField.sendKeys(noValidRegUserLoginEmail);}
    public void inputNoCheckoutLoginPasswordIntoPasswordInputField() {checkoutPageReturningCustomerSectionPasswordInputField.sendKeys(noValidRegUserLoginPassword);}

    //invalid registered user login credentials input methods - invalid singular input
    public void inputInvalidCheckoutLoginEmailIntoEmailInputField() {checkoutPageReturningCustomerSectionEmailInputField.sendKeys(invalidRegUserLoginEmail);}
    public void inputInvalidCheckoutLoginPasswordIntoPasswordInputField() {checkoutPageReturningCustomerSectionPasswordInputField.sendKeys(invalidRegUserLoginPassword);}

    //invalid singular input error message getter
    public String getInvalidSingularInputErrorMessage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(2100));
        wait.until(ExpectedConditions.visibilityOf(checkoutPageReturningCustomerInvalidLoginInputError));
        return checkoutPageReturningCustomerInvalidLoginInputError.getText();
    }
}
