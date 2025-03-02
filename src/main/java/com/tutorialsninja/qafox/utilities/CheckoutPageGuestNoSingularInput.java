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

    //missing singular input
    private String noGuestFirstName;
    private String noGuestLastName;
    private String noGuestEmail;
    private String noGuestPhone;
    private String noGuestAddress;
    private String noGuestCity;
    private String noGuestPostCode;

    public CheckoutPageGuestNoSingularInput(WebDriver driver) {super(driver);}

    //valid guest user data input methods (for remaining inputs)
    public void inputValidGuestFirstNameIntoFirstNameInputField(){checkoutPageFirstNameInputField.sendKeys(validGuestFirstName);}
    public void inputValidGuestLastNameIntoLastNameInputField(){checkoutPageLastNameInputField.sendKeys(validGuestLastName);}
    public void inputValidGuestEmailIntoEmailInputField(){checkoutPageEmailInputField.sendKeys(validGuestEmail);}
    public void inputValidGuestPhoneIntoPhoneInputField(){checkoutPagePhoneInputField.sendKeys(validGuestPhone);}
    public void inputValidGuestAddress1IntoAddress1InputField(){checkoutPageAddress1InputField.sendKeys(validGuestAddress);}
    public void inputValidGuestCityIntoCityInputField(){checkoutPageCityInputField.sendKeys(validGuestCity);}
    public void inputValidGuestPostCodeIntoPostCodeInputField(){checkoutPagePostCodeInputField.sendKeys(String.valueOf(validGuestPostCode));}

    //invalid guest user data input getter - no guest first name
    public void invalidGuestAccountDataNoFirstNameInputGetter(){

        noGuestFirstName = "";
        validGuestLastName = TestDataGenerator.getRandomLastName();
        validGuestEmail = TestDataGenerator.generateRandomEmailAddress(11);
        validGuestPhone = TestDataGenerator.generatePhoneNumber(7);
        validGuestAddress = TestDataGenerator.generateRandomAddress(8);
        validGuestCity = TestDataGenerator.getRandomCity();
        validGuestPostCode = TestDataGenerator.getRandomPostalCode();

        System.out.println("Invalid guest user input generated data (no guest first name): " + "\n");
        logger.info("No guest user first name: " + noGuestFirstName);
        logger.info("Valid guest user last name (no guest first name): " + validGuestLastName);
        logger.info("Valid guest user email (no guest first name): " + validGuestEmail);
        logger.info("Valid guest user phone number (no guest first name): " + validGuestPhone);
        logger.info("Valid guest user address (no guest first name): " + validGuestAddress);
        logger.info("Valid guest user city (no guest first name): " + validGuestCity);
        logger.info("Valid guest user post code (no guest first name): " + validGuestPostCode);
        System.out.println("\n");

    }

    //invalid guest user data input getter - no guest last name
    public void invalidGuestAccountDataNoLastNameInputGetter(){

        validGuestFirstName = TestDataGenerator.getRandomFirstName();
        noGuestLastName = "";
        validGuestEmail = TestDataGenerator.generateRandomEmailAddress(11);
        validGuestPhone = TestDataGenerator.generatePhoneNumber(7);
        validGuestAddress = TestDataGenerator.generateRandomAddress(8);
        validGuestCity = TestDataGenerator.getRandomCity();
        validGuestPostCode = TestDataGenerator.getRandomPostalCode();

        System.out.println("Invalid guest user input generated data (no guest last name): " + "\n");
        logger.info("Valid guest user first name (no guest last name): " + validGuestFirstName);
        logger.info("No guest user last name: " + noGuestLastName);
        logger.info("Valid guest user email (no guest last name): " + validGuestEmail);
        logger.info("Valid guest user phone number (no guest last name): " + validGuestPhone);
        logger.info("Valid guest user address (no guest last name): " + validGuestAddress);
        logger.info("Valid guest user city (no guest last name): " + validGuestCity);
        logger.info("Valid guest user post code (no guest last name): " + validGuestPostCode);
        System.out.println("\n");

    }

    //invalid guest user data input getter - no guest email
    public void invalidGuestAccountDataNoEmailInputGetter(){

        validGuestFirstName = TestDataGenerator.getRandomFirstName();
        validGuestLastName = TestDataGenerator.getRandomLastName();
        noGuestEmail = "";
        validGuestPhone = TestDataGenerator.generatePhoneNumber(7);
        validGuestAddress = TestDataGenerator.generateRandomAddress(8);
        validGuestCity = TestDataGenerator.getRandomCity();
        validGuestPostCode = TestDataGenerator.getRandomPostalCode();

        System.out.println("Invalid guest user input generated data (no guest email address): " + "\n");
        logger.info("Valid guest user first name (no guest email address): " + validGuestFirstName);
        logger.info("Valid guest user last name (no guest email address): " + validGuestLastName);
        logger.info("No guest user email: " + noGuestEmail);
        logger.info("Valid guest user phone number (no guest email address): " + validGuestPhone);
        logger.info("Valid guest user address (no guest email address): " + validGuestAddress);
        logger.info("Valid guest user city (no guest email address): " + validGuestCity);
        logger.info("Valid guest user post code (no guest email address): " + validGuestPostCode);
        System.out.println("\n");

    }

    //invalid guest user data input getter - no guest phone
    public void invalidGuestAccountDataNoPhoneInputGetter(){

        validGuestFirstName = TestDataGenerator.getRandomFirstName();
        validGuestLastName = TestDataGenerator.getRandomLastName();
        validGuestEmail = TestDataGenerator.generateRandomEmailAddress(11);
        noGuestPhone = "";
        validGuestAddress = TestDataGenerator.generateRandomAddress(8);
        validGuestCity = TestDataGenerator.getRandomCity();
        validGuestPostCode = TestDataGenerator.getRandomPostalCode();

        System.out.println("Invalid guest user input generated data (no guest phone): " + "\n");
        logger.info("Valid guest user first name (no guest phone): " + validGuestFirstName);
        logger.info("Valid guest user last name (no guest phone): " + validGuestLastName);
        logger.info("Valid guest user email (no guest phone): " + validGuestEmail);
        logger.info("No guest user phone number: " + noGuestPhone);
        logger.info("Valid guest user address (no guest phone): " + validGuestAddress);
        logger.info("Valid guest user city (no guest phone): " + validGuestCity);
        logger.info("Valid guest user post code (no guest phone): " + validGuestPostCode);
        System.out.println("\n");

    }

    //invalid guest user data input getter - no guest address
    public void invalidGuestAccountDataNoAddressInputGetter(){

        validGuestFirstName = TestDataGenerator.getRandomFirstName();
        validGuestLastName = TestDataGenerator.getRandomLastName();
        validGuestEmail = TestDataGenerator.generateRandomEmailAddress(11);
        validGuestPhone = TestDataGenerator.generatePhoneNumber(7);
        noGuestAddress = "";
        validGuestCity = TestDataGenerator.getRandomCity();
        validGuestPostCode = TestDataGenerator.getRandomPostalCode();

        System.out.println("Invalid guest user input generated data (no guest address): " + "\n");
        logger.info("Valid guest user first name (no guest address): " + validGuestFirstName);
        logger.info("Valid guest user last name (no guest address): " + validGuestLastName);
        logger.info("Valid guest user email (no guest address): " + validGuestEmail);
        logger.info("Valid guest user phone number (no guest address): " + validGuestPhone);
        logger.info("No guest user address: " + noGuestAddress);
        logger.info("Valid guest user city (no guest address): " + validGuestCity);
        logger.info("Valid guest user post code (no guest address): " + validGuestPostCode);
        System.out.println("\n");

    }

    //invalid guest user data input getter - no guest city
    public void invalidGuestAccountDataNoCityInputGetter(){

        validGuestFirstName = TestDataGenerator.getRandomFirstName();
        validGuestLastName = TestDataGenerator.getRandomLastName();
        validGuestEmail = TestDataGenerator.generateRandomEmailAddress(11);
        validGuestPhone = TestDataGenerator.generatePhoneNumber(7);
        validGuestAddress = TestDataGenerator.generateRandomAddress(8);
        noGuestCity = "";
        validGuestPostCode = TestDataGenerator.getRandomPostalCode();

        System.out.println("Invalid guest user input generated data (no guest city): " + "\n");
        logger.info("Valid guest user first name (no guest city): " + validGuestFirstName);
        logger.info("Valid guest user last name (no guest city): " + validGuestLastName);
        logger.info("Valid guest user email (no guest city): " + validGuestEmail);
        logger.info("Valid guest user phone number (no guest city): " + validGuestPhone);
        logger.info("Valid guest user address (no guest city): " + validGuestAddress);
        logger.info("No guest user city: " + noGuestCity);
        logger.info("Valid guest user post code (no guest city): " + validGuestPostCode);
        System.out.println("\n");

    }

    //invalid guest user data input getter - no guest post code
    public void invalidGuestAccountDataNoPostCodeInputGetter(){

        validGuestFirstName = TestDataGenerator.getRandomFirstName();
        validGuestLastName = TestDataGenerator.getRandomLastName();
        validGuestEmail = TestDataGenerator.generateRandomEmailAddress(11);
        validGuestPhone = TestDataGenerator.generatePhoneNumber(7);
        validGuestAddress = TestDataGenerator.generateRandomAddress(8);
        validGuestCity = TestDataGenerator.getRandomCity();
        noGuestPostCode = "";

        System.out.println("Invalid guest user input generated data (no guest post code): " + "\n");
        logger.info("Valid guest user first name (no guest post code): " + validGuestFirstName);
        logger.info("Valid guest user last name (no guest post code): " + validGuestLastName);
        logger.info("Valid guest user email (no guest post code): " + validGuestEmail);
        logger.info("Valid guest user phone number (no guest post code): " + validGuestPhone);
        logger.info("Valid guest user address (no guest post code): " + validGuestAddress);
        logger.info("Valid guest user city (no guest post code): " + validGuestCity);
        logger.info("No guest user post code: " + noGuestPostCode);
        System.out.println("\n");

    }

    //invalid guest user data input methods - no singular input
    public void inputNoGuestFirstNameIntoFirstNameInputField(){checkoutPageFirstNameInputField.sendKeys(noGuestFirstName);}
    public void inputNoGuestLastNameIntoLastNameInputField(){checkoutPageLastNameInputField.sendKeys(noGuestLastName);}
    public void inputNoGuestEmailIntoEmailInputField(){checkoutPageEmailInputField.sendKeys(noGuestEmail);}
    public void inputNoGuestPhoneIntoPhoneInputField(){checkoutPagePhoneInputField.sendKeys(noGuestPhone);}
    public void inputNoGuestAddress1IntoAddress1InputField(){checkoutPageAddress1InputField.sendKeys(noGuestAddress);}
    public void inputNoGuestCityIntoCityInputField(){checkoutPageCityInputField.sendKeys(noGuestCity);}
    public void inputNoGuestPostCodeIntoPostCodeInputField(){checkoutPagePostCodeInputField.sendKeys(noGuestPostCode);}

    //guest checkout invalid singular input error getter
    public String getInvalidGuestCheckoutInputError(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(2100));
        wait.until(ExpectedConditions.visibilityOf(checkoutPageInvalidGuestInputError));
        return checkoutPageInvalidGuestInputError.getText();
    }

}
