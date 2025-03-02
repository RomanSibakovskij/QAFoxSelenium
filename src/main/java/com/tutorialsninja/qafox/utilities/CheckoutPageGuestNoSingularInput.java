package com.tutorialsninja.qafox.utilities;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;

public class CheckoutPageGuestNoSingularInput extends BasePage{

    //billing details section
    @FindBy(xpath = "//div[@id='collapse-payment-address']//div[@class='col-sm-6'][1]//input[@id='input-payment-firstname']")
    private WebElement checkoutPageFirstNameInputField;
    @FindBy(xpath = "//div[@id='collapse-payment-address']//div[@class='col-sm-6'][1]//input[@id='input-payment-lastname']")
    private WebElement checkoutPageLastNameInputField;
    @FindBy(xpath = "//div[@id='collapse-payment-address']//div[@class='col-sm-6'][1]//input[@id='input-payment-email']")
    private WebElement checkoutPageEmailInputField;
    @FindBy(xpath = "//div[@id='collapse-payment-address']//div[@class='col-sm-6'][1]//input[@id='input-payment-telephone']")
    private WebElement checkoutPagePhoneInputField;
    @FindBy(xpath = "//div[@id='collapse-payment-address']//div[@class='col-sm-6'][2]//input[@id='input-payment-company']")
    private WebElement checkoutPageCompanyInputField;
    @FindBy(xpath = "//div[@id='collapse-payment-address']//div[@class='col-sm-6'][2]//input[@id='input-payment-address-1']")
    private WebElement checkoutPageAddress1InputField;
    @FindBy(xpath = "//div[@id='collapse-payment-address']//div[@class='col-sm-6'][2]//input[@id='input-payment-city']")
    private WebElement checkoutPageCityInputField;
    @FindBy(xpath = "//div[@id='collapse-payment-address']//div[@class='col-sm-6'][2]//input[@id='input-payment-postcode']")
    private WebElement checkoutPagePostCodeInputField;
    @FindBy(xpath = "//div[@id='collapse-payment-address']//div[@class='col-sm-6'][2]//select[@id='input-payment-country']")
    private WebElement checkoutPageCountryDropdownMenu;
    @FindBy(xpath = "//select[@id='input-payment-country']/option[@value='223']")
    private WebElement checkoutPageUsCountryOption;
    @FindBy(xpath = "//div[@id='collapse-payment-address']//div[@class='col-sm-6'][2]//select[@id='input-payment-zone']")
    private WebElement checkoutPageStateDropdownMenu;
    @FindBy(xpath = "//select[@id='input-payment-zone']/option[@value='3635']")
    private WebElement checkoutPageIllinoisStateOption;
    @FindBy(xpath = "//div[@id='collapse-payment-address']//input[@id='button-guest']")
    private WebElement checkoutPageGuestAccContinueButton;

    public CheckoutPageGuestNoSingularInput(WebDriver driver) {super(driver);}


}
