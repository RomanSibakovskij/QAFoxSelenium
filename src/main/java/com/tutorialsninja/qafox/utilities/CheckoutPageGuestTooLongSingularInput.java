package com.tutorialsninja.qafox.utilities;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;

public class CheckoutPageGuestTooLongSingularInput extends BasePage{

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

    //too long singular input
    private String tooLongGuestFirstName;
    private String tooLongGuestLastName;
    private String tooLongGuestEmail;
    private String tooLongGuestPhone;
    private String tooLongGuestAddress;
    private String tooLongGuestCity;
    private String tooLongGuestPostCode;

    public CheckoutPageGuestTooLongSingularInput(WebDriver driver) {super(driver);}

    //valid guest user data input methods (for remaining inputs)
    public void inputValidGuestFirstNameIntoFirstNameInputField(){checkoutPageFirstNameInputField.sendKeys(validGuestFirstName);}
    public void inputValidGuestLastNameIntoLastNameInputField(){checkoutPageLastNameInputField.sendKeys(validGuestLastName);}
    public void inputValidGuestEmailIntoEmailInputField(){checkoutPageEmailInputField.sendKeys(validGuestEmail);}
    public void inputValidGuestPhoneIntoPhoneInputField(){checkoutPagePhoneInputField.sendKeys(validGuestPhone);}
    public void inputValidGuestAddress1IntoAddress1InputField(){checkoutPageAddress1InputField.sendKeys(validGuestAddress);}
    public void inputValidGuestCityIntoCityInputField(){checkoutPageCityInputField.sendKeys(validGuestCity);}
    public void inputValidGuestPostCodeIntoPostCodeInputField(){checkoutPagePostCodeInputField.sendKeys(String.valueOf(validGuestPostCode));}

    //invalid guest user data input getter - too long guest first name (33 chars)
    public void invalidGuestAccountDataTooLongFirstNameInputGetter(){

        tooLongGuestFirstName = "Sxcdffgjfyryrtuyytiyujfgddfhfgjhd";
        validGuestLastName = TestDataGenerator.getRandomLastName();
        validGuestEmail = TestDataGenerator.generateRandomEmailAddress(11);
        validGuestPhone = TestDataGenerator.generatePhoneNumber(7);
        validGuestAddress = TestDataGenerator.generateRandomAddress(8);
        validGuestCity = TestDataGenerator.getRandomCity();
        validGuestPostCode = TestDataGenerator.getRandomPostalCode();

        System.out.println("Invalid guest user input generated data (too long guest first name): " + "\n");
        logger.info("Too long guest user first name: " + tooLongGuestFirstName);
        logger.info("Valid guest user last name (too long guest first name): " + validGuestLastName);
        logger.info("Valid guest user email (too long guest first name): " + validGuestEmail);
        logger.info("Valid guest user phone number (too long guest first name): " + validGuestPhone);
        logger.info("Valid guest user address (too long guest first name): " + validGuestAddress);
        logger.info("Valid guest user city (too long guest first name): " + validGuestCity);
        logger.info("Valid guest user post code (too long guest first name): " + validGuestPostCode);
        System.out.println("\n");

    }

    //invalid guest user data input getter - too long guest last name (33 chars)
    public void invalidGuestAccountDataTooLongLastNameInputGetter(){

        validGuestFirstName = TestDataGenerator.getRandomFirstName();
        tooLongGuestLastName = "Sxcdffgjfyryrtuyytiyujfgddfhfgjhd";
        validGuestEmail = TestDataGenerator.generateRandomEmailAddress(11);
        validGuestPhone = TestDataGenerator.generatePhoneNumber(7);
        validGuestAddress = TestDataGenerator.generateRandomAddress(8);
        validGuestCity = TestDataGenerator.getRandomCity();
        validGuestPostCode = TestDataGenerator.getRandomPostalCode();

        System.out.println("Invalid guest user input generated data (too long guest last name): " + "\n");
        logger.info("Valid guest user first name (too long guest last name): " + validGuestFirstName);
        logger.info("Too long guest user last name: " + tooLongGuestLastName);
        logger.info("Valid guest user email (too long guest last name): " + validGuestEmail);
        logger.info("Valid guest user phone number (too long guest last name): " + validGuestPhone);
        logger.info("Valid guest user address (too long guest last name): " + validGuestAddress);
        logger.info("Valid guest user city (too long guest last name): " + validGuestCity);
        logger.info("Valid guest user post code (too long guest last name): " + validGuestPostCode);
        System.out.println("\n");

    }

    //invalid guest user data input getter - too long guest email (100 chars -> name, domain)
    public void invalidGuestAccountDataTooLongEmailInputGetter(){

        validGuestFirstName = TestDataGenerator.getRandomFirstName();
        validGuestLastName = TestDataGenerator.getRandomLastName();
        tooLongGuestEmail = TestDataGenerator.generateRandomTooLongEmailAddress(100);
        validGuestPhone = TestDataGenerator.generatePhoneNumber(7);
        validGuestAddress = TestDataGenerator.generateRandomAddress(8);
        validGuestCity = TestDataGenerator.getRandomCity();
        validGuestPostCode = TestDataGenerator.getRandomPostalCode();

        System.out.println("Invalid guest user input generated data (too long guest email): " + "\n");
        logger.info("Valid guest user first name (too long guest email): " + validGuestFirstName);
        logger.info("Valid guest user last name (too long guest email): " + validGuestLastName);
        logger.info("Too long guest user email: " + tooLongGuestEmail);
        logger.info("Valid guest user phone number (too long guest email): " + validGuestPhone);
        logger.info("Valid guest user address (too long guest email): " + validGuestAddress);
        logger.info("Valid guest user city (too long guest email): " + validGuestCity);
        logger.info("Valid guest user post code (too long guest email): " + validGuestPostCode);
        System.out.println("\n");

    }

    //invalid guest user data input getter - too long guest phone (33 digits)
    public void invalidGuestAccountDataTooLongPhoneInputGetter(){

        validGuestFirstName = TestDataGenerator.getRandomFirstName();
        validGuestLastName = TestDataGenerator.getRandomLastName();
        validGuestEmail = TestDataGenerator.generateRandomEmailAddress(11);
        tooLongGuestPhone = "434642355776967453545787684533454";
        validGuestAddress = TestDataGenerator.generateRandomAddress(8);
        validGuestCity = TestDataGenerator.getRandomCity();
        validGuestPostCode = TestDataGenerator.getRandomPostalCode();

        System.out.println("Invalid guest user input generated data (too long guest phone): " + "\n");
        logger.info("Valid guest user first name (too long guest phone): " + validGuestFirstName);
        logger.info("Valid guest user last name (too long guest phone): " + validGuestLastName);
        logger.info("Valid guest user email (too long guest phone): " + validGuestEmail);
        logger.info("Too long guest user phone number: " + tooLongGuestPhone);
        logger.info("Valid guest user address (too long guest phone): " + validGuestAddress);
        logger.info("Valid guest user city (too long guest phone): " + validGuestCity);
        logger.info("Valid guest user post code (too long guest phone): " + validGuestPostCode);
        System.out.println("\n");

    }

    //invalid guest user data input getter - too long guest address (129 chars)
    public void invalidGuestAccountDataTooLongAddressInputGetter(){

        validGuestFirstName = TestDataGenerator.getRandomFirstName();
        validGuestLastName = TestDataGenerator.getRandomLastName();
        validGuestEmail = TestDataGenerator.generateRandomEmailAddress(11);
        validGuestPhone = TestDataGenerator.generatePhoneNumber(7);
        tooLongGuestAddress = "232, Sssfdfhfghtreytujynhrgfsdfhjghkmjnbhfdsfdadryutikolikjmyhtgrfsdgjhklhgfdsazdxfgjhhgfqwertyyhgrfdasfdghgrerrwerfdfdsgfdgddwsd";
        validGuestCity = TestDataGenerator.getRandomCity();
        validGuestPostCode = TestDataGenerator.getRandomPostalCode();

        System.out.println("Invalid guest user input generated data (too long guest address): " + "\n");
        logger.info("Valid guest user first name (too long guest address): " + validGuestFirstName);
        logger.info("Valid guest user last name (too long guest address): " + validGuestLastName);
        logger.info("Valid guest user email (too long guest address): " + validGuestEmail);
        logger.info("Valid guest user phone number (too long guest address): " + validGuestPhone);
        logger.info("Too long guest user address: " + tooLongGuestAddress);
        logger.info("Valid guest user city (too long guest address): " + validGuestCity);
        logger.info("Valid guest user post code (too long guest address): " + validGuestPostCode);
        System.out.println("\n");

    }

    //invalid guest user data input getter - too long guest city (129 chars)
    public void invalidGuestAccountDataTooLongCityInputGetter(){

        validGuestFirstName = TestDataGenerator.getRandomFirstName();
        validGuestLastName = TestDataGenerator.getRandomLastName();
        validGuestEmail = TestDataGenerator.generateRandomEmailAddress(11);
        validGuestPhone = TestDataGenerator.generatePhoneNumber(7);
        validGuestAddress = TestDataGenerator.generateRandomAddress(8);
        tooLongGuestCity = "Sssfdfhfghtreytujynhrgfsdfhjghkmjnbhfdsfdadryutikolikjmyhtgrfsdgjhklhgfdsazdxfgjhhgfqwertyyhgrfdasfdghgrerrwerfdfdsgfdgddwsdsdwea";
        validGuestPostCode = TestDataGenerator.getRandomPostalCode();

        System.out.println("Invalid guest user input generated data (too long guest city): " + "\n");
        logger.info("Valid guest user first name (too long guest city): " + validGuestFirstName);
        logger.info("Valid guest user last name (too long guest city): " + validGuestLastName);
        logger.info("Valid guest user email (too long guest city): " + validGuestEmail);
        logger.info("Valid guest user phone number (too long guest city): " + validGuestPhone);
        logger.info("Valid guest user address (too long guest city): " + validGuestAddress);
        logger.info("Too long guest user city: " + tooLongGuestCity);
        logger.info("Valid guest user post code (too long guest city): " + validGuestPostCode);
        System.out.println("\n");

    }

    //invalid guest user data input getter - too long guest post code (11 digits)
    public void invalidGuestAccountDataTooLongPostCodeInputGetter(){

        validGuestFirstName = TestDataGenerator.getRandomFirstName();
        validGuestLastName = TestDataGenerator.getRandomLastName();
        validGuestEmail = TestDataGenerator.generateRandomEmailAddress(11);
        validGuestPhone = TestDataGenerator.generatePhoneNumber(7);
        validGuestAddress = TestDataGenerator.generateRandomAddress(8);
        validGuestCity = TestDataGenerator.getRandomCity();
        tooLongGuestPostCode = "34567832346";

        System.out.println("Invalid guest user input generated data (too long guest post code): " + "\n");
        logger.info("Valid guest user first name (too long guest post code): " + validGuestFirstName);
        logger.info("Valid guest user last name (too long guest post code): " + validGuestLastName);
        logger.info("Valid guest user email (too long guest post code): " + validGuestEmail);
        logger.info("Valid guest user phone number (too long guest post code): " + validGuestPhone);
        logger.info("Valid guest user address (too long guest post code): " + validGuestAddress);
        logger.info("Valid guest user city (too long guest post code): " + validGuestCity);
        logger.info("Too long guest user post code: " + tooLongGuestPostCode);
        System.out.println("\n");

    }

    //invalid guest user data input methods - too long singular input
    public void inputTooLongGuestFirstNameIntoFirstNameInputField(){checkoutPageFirstNameInputField.sendKeys(tooLongGuestFirstName);}
    public void inputTooLongGuestLastNameIntoLastNameInputField(){checkoutPageLastNameInputField.sendKeys(tooLongGuestLastName);}
    public void inputTooLongGuestEmailIntoEmailInputField(){checkoutPageEmailInputField.sendKeys(tooLongGuestEmail);}
    public void inputTooLongGuestPhoneIntoPhoneInputField(){checkoutPagePhoneInputField.sendKeys(tooLongGuestPhone);}
    public void inputTooLongGuestAddress1IntoAddress1InputField(){checkoutPageAddress1InputField.sendKeys(tooLongGuestAddress);}
    public void inputTooLongGuestCityIntoCityInputField(){checkoutPageCityInputField.sendKeys(tooLongGuestCity);}
    public void inputTooLongGuestPostCodeIntoPostCodeInputField(){checkoutPagePostCodeInputField.sendKeys(String.valueOf(tooLongGuestPostCode));}

    //guest checkout invalid singular input error getter
    public String getInvalidGuestCheckoutInputError(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(2100));
        wait.until(ExpectedConditions.visibilityOf(checkoutPageInvalidGuestInputError));
        return checkoutPageInvalidGuestInputError.getText();
    }

}
