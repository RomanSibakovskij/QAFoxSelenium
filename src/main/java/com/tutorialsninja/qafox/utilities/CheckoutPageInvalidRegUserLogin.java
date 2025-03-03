package com.tutorialsninja.qafox.utilities;

import com.tutorialsninja.qafox.RegisterPage;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.*;

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

    public CheckoutPageInvalidRegUserLogin(WebDriver driver) {super(driver);}

    
}
