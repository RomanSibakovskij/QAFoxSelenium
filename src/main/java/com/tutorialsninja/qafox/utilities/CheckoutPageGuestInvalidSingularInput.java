package com.tutorialsninja.qafox.utilities;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;

public class CheckoutPageGuestInvalidSingularInput extends BasePage{

    //billing details section
    @FindBy(xpath = "//div[@id='collapse-payment-address']//div[@class='col-sm-6'][1]//input[@id='input-payment-firstname']")
    private WebElement checkoutPageFirstNameInputField;
    @FindBy(xpath = "//div[@id='collapse-payment-address']//div[@class='col-sm-6'][1]//input[@id='input-payment-lastname']")
    private WebElement checkoutPageLastNameInputField;
    @FindBy(xpath = "//div[@id='collapse-payment-address']//div[@class='col-sm-6'][1]//input[@id='input-payment-email']")
    private WebElement checkoutPageEmailInputField;
    @FindBy(xpath = "//div[@id='collapse-payment-address']//div[@class='col-sm-6'][1]//input[@id='input-payment-telephone']")
    private WebElement checkoutPagePhoneInputField;
    @FindBy(xpath = "//div[@id='collapse-payment-address']//div[@class='col-sm-6'][2]//input[@id='input-payment-address-1']")
    private WebElement checkoutPageAddress1InputField;
    @FindBy(xpath = "//div[@id='collapse-payment-address']//div[@class='col-sm-6'][2]//input[@id='input-payment-city']")
    private WebElement checkoutPageCityInputField;
    @FindBy(xpath = "//div[@id='collapse-payment-address']//div[@class='col-sm-6'][2]//input[@id='input-payment-postcode']")
    private WebElement checkoutPagePostCodeInputField;
    //invalid singular input error message element
    @FindBy(xpath = "//div[@class='text-danger']")
    private WebElement checkoutPageInvalidGuestInputError;

    //valid guest input data (for remaining inputs)
    private String validGuestFirstName;
    private String validGuestLastName;
    private String validGuestEmail;
    private String validGuestPhone;
    private String validGuestAddress;
    private String validGuestCity;
    private int validGuestPostCode;

    //invalid singular input (by format -> special symbols, digits only)
    private String invalidGuestFirstNameFormat;

    public CheckoutPageGuestInvalidSingularInput(WebDriver driver) {super(driver);}

    //valid guest user data input methods (for remaining inputs)
    public void inputValidGuestFirstNameIntoFirstNameInputField(){checkoutPageFirstNameInputField.sendKeys(validGuestFirstName);}
    public void inputValidGuestLastNameIntoLastNameInputField(){checkoutPageLastNameInputField.sendKeys(validGuestLastName);}
    public void inputValidGuestEmailIntoEmailInputField(){checkoutPageEmailInputField.sendKeys(validGuestEmail);}
    public void inputValidGuestPhoneIntoPhoneInputField(){checkoutPagePhoneInputField.sendKeys(validGuestPhone);}
    public void inputValidGuestAddress1IntoAddress1InputField(){checkoutPageAddress1InputField.sendKeys(validGuestAddress);}
    public void inputValidGuestCityIntoCityInputField(){checkoutPageCityInputField.sendKeys(validGuestCity);}
    public void inputValidGuestPostCodeIntoPostCodeInputField(){checkoutPagePostCodeInputField.sendKeys(String.valueOf(validGuestPostCode));}


    //invalid guest user data input getter - invalid guest first name format (special symbols only)
    public void invalidGuestAccountDataInvalidFirstNameInputFormatGetter(){

        invalidGuestFirstNameFormat = "@#@%$#%^&%#$@#@$@#$";
        validGuestLastName = TestDataGenerator.getRandomLastName();
        validGuestEmail = TestDataGenerator.generateRandomEmailAddress(11);
        validGuestPhone = TestDataGenerator.generatePhoneNumber(7);
        validGuestAddress = TestDataGenerator.generateRandomAddress(8);
        validGuestCity = TestDataGenerator.getRandomCity();
        validGuestPostCode = TestDataGenerator.getRandomPostalCode();

        System.out.println("Invalid guest user input generated data (invalid guest first name format): " + "\n");
        logger.info("Invalid guest user first name format: " + invalidGuestFirstNameFormat);
        logger.info("Valid guest user last name (invalid guest first name format): " + validGuestLastName);
        logger.info("Valid guest user email (invalid guest first name format): " + validGuestEmail);
        logger.info("Valid guest user phone number (invalid guest first name format): " + validGuestPhone);
        logger.info("Valid guest user address (invalid guest first name format): " + validGuestAddress);
        logger.info("Valid guest user city (invalid guest first name format): " + validGuestCity);
        logger.info("Valid guest user post code (invalid guest first name format): " + validGuestPostCode);
        System.out.println("\n");

    }

    //invalid guest user data input methods - invalid singular input format
    public void inputInvalidGuestFirstNameFormatIntoFirstNameInputField(){checkoutPageFirstNameInputField.sendKeys(invalidGuestFirstNameFormat);}


    //guest checkout invalid singular input error getter
    public String getInvalidGuestCheckoutInputError(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(2100));
        wait.until(ExpectedConditions.visibilityOf(checkoutPageInvalidGuestInputError));
        return checkoutPageInvalidGuestInputError.getText();
    }

}
