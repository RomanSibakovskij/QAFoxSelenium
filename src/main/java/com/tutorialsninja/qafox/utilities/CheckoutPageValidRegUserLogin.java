package com.tutorialsninja.qafox.utilities;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;

public class CheckoutPageValidRegUserLogin extends BasePage{

    //returning customer section web elements
    @FindBy(xpath = "//div[@id='collapse-checkout-option']//div[@class='col-sm-6'][2]//input[@id='input-email']")
    private WebElement checkoutPageReturningCustomerSectionEmailInputField;
    @FindBy(xpath = "//div[@id='collapse-checkout-option']//div[@class='col-sm-6'][2]//input[@id='input-password']")
    private WebElement checkoutPageReturningCustomerSectionPasswordInputField;
    @FindBy(xpath = "//div[@id='collapse-checkout-option']//div[@class='col-sm-6'][2]/input")
    private WebElement checkoutPageReturningCustomerLoginButton;

    public CheckoutPageValidRegUserLogin(WebDriver driver) {super(driver);}


}
