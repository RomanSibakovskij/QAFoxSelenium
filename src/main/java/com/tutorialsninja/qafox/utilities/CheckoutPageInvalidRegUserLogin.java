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

    //invalid registered user login credentials input methods - no singular input
    public void inputNoCheckoutLoginEmailIntoEmailInputField() {checkoutPageReturningCustomerSectionEmailInputField.sendKeys(noValidRegUserLoginEmail);}

    //invalid singular input error message getter
    public String getInvalidSingularInputErrorMessage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(2100));
        wait.until(ExpectedConditions.visibilityOf(checkoutPageReturningCustomerInvalidLoginInputError));
        return checkoutPageReturningCustomerInvalidLoginInputError.getText();
    }
}
