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
    private String invalidGuestLastNameFormat;
    private String invalidGuestEmailFormat;
    private String existingEmail;
    private String invalidGuestPhoneFormat;
    private String invalidGuestAddressFormat;
    private String invalidGuestCityFormat;

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

    //invalid guest user data input getter - invalid guest last name format (special symbols and digits only)
    public void invalidGuestAccountDataInvalidLastNameInputFormatGetter(){

        validGuestFirstName = TestDataGenerator.getRandomFirstName();
        invalidGuestLastNameFormat = "!@$#$243%^$^$#$@#";
        validGuestEmail = TestDataGenerator.generateRandomEmailAddress(11);
        validGuestPhone = TestDataGenerator.generatePhoneNumber(7);
        validGuestAddress = TestDataGenerator.generateRandomAddress(8);
        validGuestCity = TestDataGenerator.getRandomCity();
        validGuestPostCode = TestDataGenerator.getRandomPostalCode();

        System.out.println("Invalid guest user input generated data (invalid guest last name format): " + "\n");
        logger.info("Valid guest user first name (invalid guest last name format): " + validGuestFirstName);
        logger.info("Invalid guest user last name format: " + invalidGuestLastNameFormat);
        logger.info("Valid guest user email (invalid guest last name format): " + validGuestEmail);
        logger.info("Valid guest user phone number (invalid guest last name format): " + validGuestPhone);
        logger.info("Valid guest user address (invalid guest last name format): " + validGuestAddress);
        logger.info("Valid guest user city (invalid guest last name format): " + validGuestCity);
        logger.info("Valid guest user post code (invalid guest last name format): " + validGuestPostCode);
        System.out.println("\n");

    }

    //invalid guest user data input getter - invalid guest email format (missing '@')
    public void invalidGuestAccountDataInvalidEmailInputFormatGetter(){

        validGuestFirstName = TestDataGenerator.getRandomFirstName();
        validGuestLastName = TestDataGenerator.getRandomLastName();
        invalidGuestEmailFormat = "kuytgfakemail.com";
        validGuestPhone = TestDataGenerator.generatePhoneNumber(7);
        validGuestAddress = TestDataGenerator.generateRandomAddress(8);
        validGuestCity = TestDataGenerator.getRandomCity();
        validGuestPostCode = TestDataGenerator.getRandomPostalCode();

        System.out.println("Invalid guest user input generated data (invalid guest email format): " + "\n");
        logger.info("Valid guest user first name (invalid guest email format): " + validGuestFirstName);
        logger.info("Valid guest user last name (invalid guest email format): " + validGuestLastName);
        logger.info("Invalid guest user email format: " + invalidGuestEmailFormat);
        logger.info("Valid guest user phone number (invalid guest email format): " + validGuestPhone);
        logger.info("Valid guest user address (invalid guest email format): " + validGuestAddress);
        logger.info("Valid guest user city (invalid guest email format): " + validGuestCity);
        logger.info("Valid guest user post code (invalid guest email format): " + validGuestPostCode);
        System.out.println("\n");

    }

    //invalid guest user data input getter - existing email input (used in other account)
    public void invalidGuestAccountDataExistingEmailInputGetter(){

        validGuestFirstName = TestDataGenerator.getRandomFirstName();
        validGuestLastName = TestDataGenerator.getRandomLastName();
        existingEmail = "m0@example.com";
        validGuestPhone = TestDataGenerator.generatePhoneNumber(7);
        validGuestAddress = TestDataGenerator.generateRandomAddress(8);
        validGuestCity = TestDataGenerator.getRandomCity();
        validGuestPostCode = TestDataGenerator.getRandomPostalCode();

        System.out.println("Invalid guest user input generated data (existing email): " + "\n");
        logger.info("Valid guest user first name (existing email): " + validGuestFirstName);
        logger.info("Valid guest user last name (existing email): " + validGuestLastName);
        logger.info("Pre-existing user email: " + existingEmail);
        logger.info("Valid guest user phone number (existing email): " + validGuestPhone);
        logger.info("Valid guest user address (existing email): " + validGuestAddress);
        logger.info("Valid guest user city (existing email): " + validGuestCity);
        logger.info("Valid guest user post code (existing email): " + validGuestPostCode);
        System.out.println("\n");

    }

    //invalid guest user data input getter - invalid guest phone format (special symbols only)
    public void invalidGuestAccountDataInvalidPhoneInputFormatGetter(){

        validGuestFirstName = TestDataGenerator.getRandomFirstName();
        validGuestLastName = TestDataGenerator.getRandomLastName();
        validGuestEmail = TestDataGenerator.generateRandomEmailAddress(11);
        invalidGuestPhoneFormat = "!@#@$#%$#^%$";
        validGuestAddress = TestDataGenerator.generateRandomAddress(8);
        validGuestCity = TestDataGenerator.getRandomCity();
        validGuestPostCode = TestDataGenerator.getRandomPostalCode();

        System.out.println("Invalid guest user input generated data (invalid guest phone format): " + "\n");
        logger.info("Valid guest user first name (invalid guest phone format): " + validGuestFirstName);
        logger.info("Valid guest user last name (invalid guest phone format): " + validGuestLastName);
        logger.info("Valid guest user email (invalid guest phone format): " + validGuestEmail);
        logger.info("Invalid guest user phone number format: " + invalidGuestPhoneFormat);
        logger.info("Valid guest user address (invalid guest phone format): " + validGuestAddress);
        logger.info("Valid guest user city (invalid guest phone format): " + validGuestCity);
        logger.info("Valid guest user post code (invalid guest phone format): " + validGuestPostCode);
        System.out.println("\n");

    }

    //invalid guest user data input getter - invalid guest address format (special symbols only)
    public void invalidGuestAccountDataInvalidAddressInputFormatGetter(){

        validGuestFirstName = TestDataGenerator.getRandomFirstName();
        validGuestLastName = TestDataGenerator.getRandomLastName();
        validGuestEmail = TestDataGenerator.generateRandomEmailAddress(11);
        validGuestPhone = TestDataGenerator.generatePhoneNumber(7);
        invalidGuestAddressFormat = "!#@%$$#^$%&%";
        validGuestCity = TestDataGenerator.getRandomCity();
        validGuestPostCode = TestDataGenerator.getRandomPostalCode();

        System.out.println("Invalid guest user input generated data (invalid guest address format): " + "\n");
        logger.info("Valid guest user first name (invalid guest address format): " + validGuestFirstName);
        logger.info("Valid guest user last name (invalid guest address format): " + validGuestLastName);
        logger.info("Valid guest user email (invalid guest address format): " + validGuestEmail);
        logger.info("Valid guest user phone number (invalid guest address format): " + validGuestPhone);
        logger.info("Invalid guest user address format: " + invalidGuestAddressFormat);
        logger.info("Valid guest user city (invalid guest address format): " + validGuestCity);
        logger.info("Valid guest user post code (invalid guest address format): " + validGuestPostCode);
        System.out.println("\n");

    }

    //invalid guest user data input getter - invalid guest city format (special symbols only)
    public void invalidGuestAccountDataInvalidCityInputFormatGetter(){

        validGuestFirstName = TestDataGenerator.getRandomFirstName();
        validGuestLastName = TestDataGenerator.getRandomLastName();
        validGuestEmail = TestDataGenerator.generateRandomEmailAddress(11);
        validGuestPhone = TestDataGenerator.generatePhoneNumber(7);
        validGuestAddress = TestDataGenerator.generateRandomAddress(8);
        invalidGuestCityFormat = "%$%^&$#$@#";
        validGuestPostCode = TestDataGenerator.getRandomPostalCode();

        System.out.println("Invalid guest user input generated data (invalid guest city format): " + "\n");
        logger.info("Valid guest user first name (invalid guest city format): " + validGuestFirstName);
        logger.info("Valid guest user last name (invalid guest city format): " + validGuestLastName);
        logger.info("Valid guest user email (invalid guest city format): " + validGuestEmail);
        logger.info("Valid guest user phone number (invalid guest city format): " + validGuestPhone);
        logger.info("Valid guest user address (invalid guest city format): " + validGuestAddress);
        logger.info("Invalid guest user city format: " + invalidGuestCityFormat);
        logger.info("Valid guest user post code (invalid guest city format): " + validGuestPostCode);
        System.out.println("\n");

    }

    //invalid guest user data input methods - invalid singular input format
    public void inputInvalidGuestFirstNameFormatIntoFirstNameInputField(){checkoutPageFirstNameInputField.sendKeys(invalidGuestFirstNameFormat);}
    public void inputInvalidGuestLastNameFormatIntoLastNameInputField(){checkoutPageLastNameInputField.sendKeys(invalidGuestLastNameFormat);}
    public void inputInvalidGuestEmailFormatIntoEmailInputField(){checkoutPageEmailInputField.sendKeys(invalidGuestEmailFormat);}
    public void inputPreexistingGuestEmailIntoEmailInputField(){checkoutPageEmailInputField.sendKeys(existingEmail);}
    public void inputInvalidGuestPhoneFormatIntoPhoneInputField(){checkoutPagePhoneInputField.sendKeys(invalidGuestPhoneFormat);}
    public void inputInvalidGuestAddress1FormatIntoAddress1InputField(){checkoutPageAddress1InputField.sendKeys(invalidGuestAddressFormat);}
    public void inputInvalidGuestCityFormatIntoCityInputField(){checkoutPageCityInputField.sendKeys(invalidGuestCityFormat);}

    //guest checkout invalid singular input error getter
    public String getInvalidGuestCheckoutInputError(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(2100));
        wait.until(ExpectedConditions.visibilityOf(checkoutPageInvalidGuestInputError));
        return checkoutPageInvalidGuestInputError.getText();
    }

}
