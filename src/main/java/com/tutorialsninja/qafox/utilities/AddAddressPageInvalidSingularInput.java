package com.tutorialsninja.qafox.utilities;

import com.tutorialsninja.qafox.RegisterPage;
import com.tutorialsninja.qafox.utilities.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

public class AddAddressPageInvalidSingularInput extends BasePage{

    //add address page input form web elements (required)
    @FindBy(xpath = "//input[@id='input-firstname']")
    private WebElement addAddressFirstNameInputField;
    @FindBy(xpath = "//input[@id='input-lastname']")
    private WebElement addAddressLastNameInputField;
    @FindBy(xpath = "//input[@id='input-address-1']")
    private WebElement addAddressAddress1InputField;
    @FindBy(xpath = "//input[@id='input-city']")
    private WebElement addAddressCityInputField;
    @FindBy(xpath = "//input[@id='input-postcode']")
    private WebElement addAddressPostCodeInputField;
    //invalid singular input message element
    @FindBy(xpath = "//div[@class='text-danger']")
    private WebElement addAddressInvalidSingularInputError;

    //valid user address data
    private String addressFirstName;
    private String addressLastName;
    private String address1;
    private String city;
    private int postCode;

    //invalid singular input format
    private String invalidFirstNameFormat;
    private String invalidLastNameFormat;

    public AddAddressPageInvalidSingularInput(WebDriver driver) {super(driver);}

    //valid user data input methods (for remaining inputs)
    public void inputValidFirstNameIntoFirstNameInputField(){addAddressFirstNameInputField.sendKeys(addressFirstName);}
    public void inputValidLastNameIntoLastNameInputField(){addAddressLastNameInputField.sendKeys(addressLastName);}
    public void inputValidAddress1IntoAddress1InputField(){addAddressAddress1InputField.sendKeys(address1);}
    public void inputValidCityIntoCityInputField(){addAddressCityInputField.sendKeys(city);}
    public void inputValidPostCodeIntoPostCodeInputField(){addAddressPostCodeInputField.sendKeys(String.valueOf(postCode));}

    //invalid user address data getter - invalid first name format (special symbols and digits)
    public void invalidUserAddressDataInvalidFirstNameFormatGetter(RegisterPage registerPage) {

        invalidFirstNameFormat = "232@#$%^%&$%#243";
        addressLastName = registerPage.getUserLastName();
        address1 = TestDataGenerator.generateRandomAddress(8);
        city = TestDataGenerator.getRandomCity();
        postCode = TestDataGenerator.getRandomPostalCode();

        System.out.println("Invalid generated user address data (invalid user first name format): " + "\n");
        logger.info("Invalid user first name format: " + invalidFirstNameFormat);
        logger.info("Valid user last name (invalid user first name format): " + addressLastName);
        logger.info("Valid user address 1 (invalid user first name format): " + address1);
        logger.info("Valid user city (invalid user first name format): " + city);
        logger.info("Valid user post code (invalid user first name format): " + postCode);
        System.out.println("\n");
    }

    //invalid user address data getter - invalid last name format (special symbols and digits)
    public void invalidUserAddressDataInvalidLastNameFormatGetter(RegisterPage registerPage) {

        addressFirstName = registerPage.getUserFirstName();
        invalidLastNameFormat = "65@#$#@#@354";
        address1 = TestDataGenerator.generateRandomAddress(8);
        city = TestDataGenerator.getRandomCity();
        postCode = TestDataGenerator.getRandomPostalCode();

        System.out.println("Invalid generated user address data (invalid user last name format): " + "\n");
        logger.info("Valid user first name (invalid user last name format): " + addressFirstName);
        logger.info("Invalid user last name format: " + invalidLastNameFormat);
        logger.info("Valid user address 1 (invalid user last name format): " + address1);
        logger.info("Valid user city (invalid user last name format): " + city);
        logger.info("Valid user post code (invalid user last name format): " + postCode);
        System.out.println("\n");
    }

    //invalid user data input methods - invalid singular input format
    public void inputInvalidFirstNameFormatIntoFirstNameInputField(){addAddressFirstNameInputField.sendKeys(invalidFirstNameFormat);}
    public void inputInvalidLastNameFormatIntoLastNameInputField(){addAddressLastNameInputField.sendKeys(invalidLastNameFormat);}


    //invalid input error getter
    public String getInvalidInputError(){return addAddressInvalidSingularInputError.getText();}
}
