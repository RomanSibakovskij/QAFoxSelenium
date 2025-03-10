package com.tutorialsninja.qafox.utilities;

import com.tutorialsninja.qafox.RegisterPage;
import com.tutorialsninja.qafox.utilities.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

public class AddAddressPageTooLongSingularInput extends BasePage{

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

    //too long singular input data
    private String tooLongFirstName;
    private String tooLongLastName;
    private String tooLongAddress;
    private String tooLongCity;

    public AddAddressPageTooLongSingularInput(WebDriver driver) {super(driver);}

    //valid user data input methods (for remaining inputs)
    public void inputValidFirstNameIntoFirstNameInputField(){addAddressFirstNameInputField.sendKeys(addressFirstName);}
    public void inputValidLastNameIntoLastNameInputField(){addAddressLastNameInputField.sendKeys(addressLastName);}
    public void inputValidAddress1IntoAddress1InputField(){addAddressAddress1InputField.sendKeys(address1);}
    public void inputValidCityIntoCityInputField(){addAddressCityInputField.sendKeys(city);}
    public void inputValidPostCodeIntoPostCodeInputField(){addAddressPostCodeInputField.sendKeys(String.valueOf(postCode));}

    //invalid user address data getter - too long first name (33 chars)
    public void invalidUserAddressDataTooLongFirstNameGetter(RegisterPage registerPage) {

        tooLongFirstName = "Rdffdgjnfdgbvcvzxcfdgfgjhgkjhkhfd";
        addressLastName = registerPage.getUserLastName();
        address1 = TestDataGenerator.generateRandomAddress(8);
        city = TestDataGenerator.getRandomCity();
        postCode = TestDataGenerator.getRandomPostalCode();

        System.out.println("Invalid generated user address data (too long user first name): " + "\n");
        logger.info("Too long user first name: " + tooLongFirstName);
        logger.info("Valid user last name (too long user first name): " + addressLastName);
        logger.info("Valid user address 1 (too long user first name): " + address1);
        logger.info("Valid user city (too long user first name): " + city);
        logger.info("Valid user post code (too long user first name): " + postCode);
        System.out.println("\n");
    }

    //invalid user address data getter - too long last name (33 chars)
    public void invalidUserAddressDataTooLongLastNameGetter(RegisterPage registerPage) {

        addressFirstName = registerPage.getUserFirstName();
        tooLongLastName = "Rdffdgjnfdgbvcvzxcfdgfgjhgkjhkhfd";
        address1 = TestDataGenerator.generateRandomAddress(8);
        city = TestDataGenerator.getRandomCity();
        postCode = TestDataGenerator.getRandomPostalCode();

        System.out.println("Invalid generated user address data (too long user last name): " + "\n");
        logger.info("Valid user first name (too long user last name): " + addressFirstName);
        logger.info("Too long user last name: " + tooLongLastName);
        logger.info("Valid user address 1 (too long user last name): " + address1);
        logger.info("Valid user city (too long user last name): " + city);
        logger.info("Valid user post code (too long user last name): " + postCode);
        System.out.println("\n");
    }

    //invalid user address data getter - too long address (129 chars)
    public void invalidUserAddressDataTooLongAddressGetter(RegisterPage registerPage) {

        addressFirstName = registerPage.getUserFirstName();
        addressLastName = registerPage.getUserLastName();
        tooLongAddress = "23, Fcgjhdffdgfgfgdsdsdsfgjhdffgrretrthsfsgdghkmjnbhffwretyuiolukmjynhbgvdfsjghkmhjhgfsdasdsdsadsadwqwrwetrytyddddsfsfdgfhdfhtnbv";
        city = TestDataGenerator.getRandomCity();
        postCode = TestDataGenerator.getRandomPostalCode();

        System.out.println("Invalid generated user address data (too long user address): " + "\n");
        logger.info("Valid user first name (too long user address): " + addressFirstName);
        logger.info("Valid user last name (too long user address): " + addressLastName);
        logger.info("Too long user address 1: " + tooLongAddress);
        logger.info("Valid user city (too long user address): " + city);
        logger.info("Valid user post code (too long user address): " + postCode);
        System.out.println("\n");
    }

    //invalid user address data getter - too long user city (129 chars)
    public void invalidUserAddressDataTooLongCityGetter(RegisterPage registerPage) {

        addressFirstName = registerPage.getUserFirstName();
        addressLastName = registerPage.getUserLastName();
        address1 = TestDataGenerator.generateRandomAddress(8);
        tooLongCity = "Fcgjhdffdgfgfgdsdsdsfgjhdffgrretrthsfsgdghkmjnbhffwretyuiolukmjynhbgvdfsjghkmhjhgfsdasdsdsadsadwqwrwetrytyddddsfsfdgfhdfhtnbvsads";
        postCode = TestDataGenerator.getRandomPostalCode();

        System.out.println("Invalid generated user address data (too long user city): " + "\n");
        logger.info("Valid user first name (too long user city): " + addressFirstName);
        logger.info("Valid user last name (too long user city): " + addressLastName);
        logger.info("Valid user address 1 (too long user city): " + address1);
        logger.info("Too long user city: " + tooLongCity);
        logger.info("Valid user post code (too long user city): " + postCode);
        System.out.println("\n");
    }

    //invalid user data input methods - too long singular input
    public void inputTooLongFirstNameIntoFirstNameInputField(){addAddressFirstNameInputField.sendKeys(tooLongFirstName);}
    public void inputTooLongLastNameIntoLastNameInputField(){addAddressLastNameInputField.sendKeys(tooLongLastName);}
    public void inputTooLongAddress1IntoAddress1InputField(){addAddressAddress1InputField.sendKeys(tooLongAddress);}
    public void inputTooLongCityIntoCityInputField(){addAddressCityInputField.sendKeys(tooLongCity);}

    //invalid input error getter
    public String getInvalidInputError(){return addAddressInvalidSingularInputError.getText();}
}
