package com.tutorialsninja.qafox.utilities;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;

public class CheckoutPageGuestTooShortSingularInput extends BasePage{

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

    //too short singular input
    private String tooShortGuestFirstName;
    private String tooShortGuestLastName;
    private String tooShortGuestEmail;
    private String tooShortGuestPhone;
    private String tooShortGuestAddress;

    public CheckoutPageGuestTooShortSingularInput(WebDriver driver) {super(driver);}

    //valid guest user data input methods (for remaining inputs)
    public void inputValidGuestFirstNameIntoFirstNameInputField(){checkoutPageFirstNameInputField.sendKeys(validGuestFirstName);}
    public void inputValidGuestLastNameIntoLastNameInputField(){checkoutPageLastNameInputField.sendKeys(validGuestLastName);}
    public void inputValidGuestEmailIntoEmailInputField(){checkoutPageEmailInputField.sendKeys(validGuestEmail);}
    public void inputValidGuestPhoneIntoPhoneInputField(){checkoutPagePhoneInputField.sendKeys(validGuestPhone);}
    public void inputValidGuestAddress1IntoAddress1InputField(){checkoutPageAddress1InputField.sendKeys(validGuestAddress);}
    public void inputValidGuestCityIntoCityInputField(){checkoutPageCityInputField.sendKeys(validGuestCity);}
    public void inputValidGuestPostCodeIntoPostCodeInputField(){checkoutPagePostCodeInputField.sendKeys(String.valueOf(validGuestPostCode));}

    //invalid guest user data input getter - too short guest first name (1 char)
    public void invalidGuestAccountDataTooShortFirstNameInputGetter(){

        tooShortGuestFirstName = "G";
        validGuestLastName = TestDataGenerator.getRandomLastName();
        validGuestEmail = TestDataGenerator.generateRandomEmailAddress(11);
        validGuestPhone = TestDataGenerator.generatePhoneNumber(7);
        validGuestAddress = TestDataGenerator.generateRandomAddress(8);
        validGuestCity = TestDataGenerator.getRandomCity();
        validGuestPostCode = TestDataGenerator.getRandomPostalCode();

        System.out.println("Invalid guest user input generated data (too short guest first name): " + "\n");
        logger.info("Too short guest user first name: " + tooShortGuestFirstName);
        logger.info("Valid guest user last name (too short guest first name): " + validGuestLastName);
        logger.info("Valid guest user email (too short guest first name): " + validGuestEmail);
        logger.info("Valid guest user phone number (too short guest first name): " + validGuestPhone);
        logger.info("Valid guest user address (too short guest first name): " + validGuestAddress);
        logger.info("Valid guest user city (too short guest first name): " + validGuestCity);
        logger.info("Valid guest user post code (too short guest first name): " + validGuestPostCode);
        System.out.println("\n");

    }

    //invalid guest user data input getter - too short guest last name (1 char)
    public void invalidGuestAccountDataTooShortLastNameInputGetter(){

        validGuestFirstName = TestDataGenerator.getRandomFirstName();
        tooShortGuestLastName = "S";
        validGuestEmail = TestDataGenerator.generateRandomEmailAddress(11);
        validGuestPhone = TestDataGenerator.generatePhoneNumber(7);
        validGuestAddress = TestDataGenerator.generateRandomAddress(8);
        validGuestCity = TestDataGenerator.getRandomCity();
        validGuestPostCode = TestDataGenerator.getRandomPostalCode();

        System.out.println("Invalid guest user input generated data (too short guest last name): " + "\n");
        logger.info("Valid guest user first name (too short guest last name): " + validGuestFirstName);
        logger.info("Too short guest user last name: " + tooShortGuestLastName);
        logger.info("Valid guest user email (too short guest last name): " + validGuestEmail);
        logger.info("Valid guest user phone number (too short guest last name): " + validGuestPhone);
        logger.info("Valid guest user address (too short guest last name): " + validGuestAddress);
        logger.info("Valid guest user city (too short guest last name): " + validGuestCity);
        logger.info("Valid guest user post code (too short guest last name): " + validGuestPostCode);
        System.out.println("\n");

    }

    //invalid guest user data input getter - too short guest email (1 char -> name, domain)
    public void invalidGuestAccountDataTooShortEmailInputGetter(){

        validGuestFirstName = TestDataGenerator.getRandomFirstName();
        validGuestLastName = TestDataGenerator.getRandomLastName();
        tooShortGuestEmail = TestDataGenerator.generateRandomTooShortEmailAddress(1);
        validGuestPhone = TestDataGenerator.generatePhoneNumber(7);
        validGuestAddress = TestDataGenerator.generateRandomAddress(8);
        validGuestCity = TestDataGenerator.getRandomCity();
        validGuestPostCode = TestDataGenerator.getRandomPostalCode();

        System.out.println("Invalid guest user input generated data (too short guest email): " + "\n");
        logger.info("Valid guest user first name (too short guest email): " + validGuestFirstName);
        logger.info("Valid guest user last name (too short guest email): " + validGuestLastName);
        logger.info("Too short guest user email: " + tooShortGuestEmail);
        logger.info("Valid guest user phone number (too short guest email): " + validGuestPhone);
        logger.info("Valid guest user address (too short guest email): " + validGuestAddress);
        logger.info("Valid guest user city (too short guest email): " + validGuestCity);
        logger.info("Valid guest user post code (too short guest email): " + validGuestPostCode);
        System.out.println("\n");

    }

    //invalid guest user data input getter - too short guest phone (2 digits)
    public void invalidGuestAccountDataTooShortPhoneInputGetter(){

        validGuestFirstName = TestDataGenerator.getRandomFirstName();
        validGuestLastName = TestDataGenerator.getRandomLastName();
        validGuestEmail = TestDataGenerator.generateRandomEmailAddress(11);
        tooShortGuestPhone = "56";
        validGuestAddress = TestDataGenerator.generateRandomAddress(8);
        validGuestCity = TestDataGenerator.getRandomCity();
        validGuestPostCode = TestDataGenerator.getRandomPostalCode();

        System.out.println("Invalid guest user input generated data (too short guest phone): " + "\n");
        logger.info("Valid guest user first name (too short guest phone): " + validGuestFirstName);
        logger.info("Valid guest user last name (too short guest phone): " + validGuestLastName);
        logger.info("Valid guest user email (too short guest phone): " + validGuestEmail);
        logger.info("Too short guest user phone number: " + tooShortGuestPhone);
        logger.info("Valid guest user address (too short guest phone): " + validGuestAddress);
        logger.info("Valid guest user city (too short guest phone): " + validGuestCity);
        logger.info("Valid guest user post code (too short guest phone): " + validGuestPostCode);
        System.out.println("\n");

    }

    //invalid guest user data input getter - too short guest address (2 digits)
    public void invalidGuestAccountDataTooShortAddressInputGetter(){

        validGuestFirstName = TestDataGenerator.getRandomFirstName();
        validGuestLastName = TestDataGenerator.getRandomLastName();
        validGuestEmail = TestDataGenerator.generateRandomEmailAddress(11);
        validGuestPhone = TestDataGenerator.generatePhoneNumber(7);
        tooShortGuestAddress = "3F";
        validGuestCity = TestDataGenerator.getRandomCity();
        validGuestPostCode = TestDataGenerator.getRandomPostalCode();

        System.out.println("Invalid guest user input generated data (too short guest address): " + "\n");
        logger.info("Valid guest user first name (too short guest address): " + validGuestFirstName);
        logger.info("Valid guest user last name (too short guest address): " + validGuestLastName);
        logger.info("Valid guest user email (too short guest address): " + validGuestEmail);
        logger.info("Valid guest user phone number (too short guest address): " + validGuestPhone);
        logger.info("Too short guest user address: " + tooShortGuestAddress);
        logger.info("Valid guest user city (too short guest address): " + validGuestCity);
        logger.info("Valid guest user post code (too short guest address): " + validGuestPostCode);
        System.out.println("\n");

    }

    //invalid guest user data input methods - too short singular input
    public void inputTooShortGuestFirstNameIntoFirstNameInputField(){checkoutPageFirstNameInputField.sendKeys(tooShortGuestFirstName);}
    public void inputTooShortGuestLastNameIntoLastNameInputField(){checkoutPageLastNameInputField.sendKeys(tooShortGuestLastName);}
    public void inputTooShortGuestEmailIntoEmailInputField(){checkoutPageEmailInputField.sendKeys(tooShortGuestEmail);}
    public void inputTooShortGuestPhoneIntoPhoneInputField(){checkoutPagePhoneInputField.sendKeys(tooShortGuestPhone);}
    public void inputTooShortGuestAddress1IntoAddress1InputField(){checkoutPageAddress1InputField.sendKeys(tooShortGuestAddress);}

    //guest checkout invalid singular input error getter
    public String getInvalidGuestCheckoutInputError(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(2100));
        wait.until(ExpectedConditions.visibilityOf(checkoutPageInvalidGuestInputError));
        return checkoutPageInvalidGuestInputError.getText();
    }


}
