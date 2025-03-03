package com.tutorialsninja.qafox.utilities;

import com.tutorialsninja.qafox.RegisterPage;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.*;

public class CheckoutPageValidRegUserLogin extends BasePage{

    //returning customer section web elements
    @FindBy(xpath = "//div[@id='collapse-checkout-option']//div[@class='col-sm-6'][2]//input[@id='input-email']")
    private WebElement checkoutPageReturningCustomerSectionEmailInputField;
    @FindBy(xpath = "//div[@id='collapse-checkout-option']//div[@class='col-sm-6'][2]//input[@id='input-password']")
    private WebElement checkoutPageReturningCustomerSectionPasswordInputField;
    @FindBy(xpath = "//div[@id='collapse-checkout-option']//div[@class='col-sm-6'][2]/input")
    private WebElement checkoutPageReturningCustomerLoginButton;

    //valid registered user data
    private String validRegUserLoginEmail;
    private String validRegUserLoginPassword;

    public CheckoutPageValidRegUserLogin(WebDriver driver) {super(driver);}

    //valid registered user credentials getter
    public void validRegUserLoginCheckoutDataGetter(RegisterPage registerPage) {

        validRegUserLoginEmail = registerPage.getUserEmail();
        validRegUserLoginPassword = registerPage.getUserPassword();

        System.out.println("Valid checkout registered user login credentials: " + "\n");
        logger.info("Valid checkout login email: " + validRegUserLoginEmail);
        logger.info("Valid checkout login password: " + validRegUserLoginPassword);
        System.out.println("\n");

    }

    //valid registered user login credentials input methods
    public void inputCheckoutLoginEmailIntoEmailInputField() {checkoutPageReturningCustomerSectionEmailInputField.sendKeys(validRegUserLoginEmail);}
    public void inputCheckoutLoginPasswordIntoPasswordInputField() {checkoutPageReturningCustomerSectionPasswordInputField.sendKeys(validRegUserLoginPassword);}

    //click 'Login' button method
    public void clickCheckoutLoginButton() {
        Actions action = new Actions(driver);
        action.moveToElement(checkoutPageReturningCustomerLoginButton).click().perform();
    }

}
