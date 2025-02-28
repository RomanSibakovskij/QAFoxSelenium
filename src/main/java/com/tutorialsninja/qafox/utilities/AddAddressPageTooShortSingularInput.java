package com.tutorialsninja.qafox.utilities;

import com.tutorialsninja.qafox.RegisterPage;
import com.tutorialsninja.qafox.utilities.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

public class AddAddressPageTooShortSingularInput extends BasePage{

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

    //too short singular input data
    private String tooShortFirstName;
    private String tooShortLastName;
    private String tooShortAddress;
    private String tooShortCity;

    public AddAddressPageTooShortSingularInput(WebDriver driver) {super(driver);}

    //valid user data input methods (for remaining inputs)
    public void inputValidFirstNameIntoFirstNameInputField(){addAddressFirstNameInputField.sendKeys(addressFirstName);}
    public void inputValidLastNameIntoLastNameInputField(){addAddressLastNameInputField.sendKeys(addressLastName);}
    public void inputValidAddress1IntoAddress1InputField(){addAddressAddress1InputField.sendKeys(address1);}
    public void inputValidCityIntoCityInputField(){addAddressCityInputField.sendKeys(city);}
    public void inputValidPostCodeIntoPostCodeInputField(){addAddressPostCodeInputField.sendKeys(String.valueOf(postCode));}

    //invalid user address data getter - too short first name
    public void invalidUserAddressDataTooShortFirstNameGetter(RegisterPage registerPage) {

        tooShortFirstName = "U";
        addressLastName = registerPage.getUserLastName();
        address1 = TestDataGenerator.generateRandomAddress(8);
        city = TestDataGenerator.getRandomCity();
        postCode = TestDataGenerator.getRandomPostalCode();

        System.out.println("Invalid generated user address data (too short user first name): " + "\n");
        logger.info("Too short user first name: " + tooShortFirstName);
        logger.info("Valid user last name (too short user first name): " + addressLastName);
        logger.info("Valid user address 1 (too short user first name): " + address1);
        logger.info("Valid user city (too short user first name): " + city);
        logger.info("Valid user post code (too short user first name): " + postCode);
        System.out.println("\n");
    }

    //invalid user address data getter - too short last name
    public void invalidUserAddressDataTooShortLastNameGetter(RegisterPage registerPage) {

        addressFirstName = registerPage.getUserFirstName();
        tooShortLastName = "K";
        address1 = TestDataGenerator.generateRandomAddress(8);
        city = TestDataGenerator.getRandomCity();
        postCode = TestDataGenerator.getRandomPostalCode();

        System.out.println("Invalid generated user address data (too short user last name): " + "\n");
        logger.info("Valid user first name (too short user last name): " + addressFirstName);
        logger.info("Too short user last name: " + tooShortLastName);
        logger.info("Valid user address 1 (too short user last name): " + address1);
        logger.info("Valid user city (too short user last name): " + city);
        logger.info("Valid user post code (too short user last name): " + postCode);
        System.out.println("\n");
    }

    //invalid user address data getter - too short address
    public void invalidUserAddressDataTooShortAddressGetter(RegisterPage registerPage) {

        addressFirstName = registerPage.getUserFirstName();
        addressLastName = registerPage.getUserLastName();
        tooShortAddress = "D4";
        city = TestDataGenerator.getRandomCity();
        postCode = TestDataGenerator.getRandomPostalCode();

        System.out.println("Invalid generated user address data (too short user address): " + "\n");
        logger.info("Valid user first name (too short user address): " + addressFirstName);
        logger.info("Valid user last name (too short user address): " + addressLastName);
        logger.info("Too short user address 1: " + tooShortAddress);
        logger.info("Valid user city (too short user address): " + city);
        logger.info("Valid user post code (too short user address): " + postCode);
        System.out.println("\n");
    }

    //invalid user address data getter - too short user city
    public void invalidUserAddressDataTooShortCityGetter(RegisterPage registerPage) {

        addressFirstName = registerPage.getUserFirstName();
        addressLastName = registerPage.getUserLastName();
        address1 = TestDataGenerator.generateRandomAddress(8);
        tooShortCity = "G";
        postCode = TestDataGenerator.getRandomPostalCode();

        System.out.println("Invalid generated user address data (too short user city): " + "\n");
        logger.info("Valid user first name (too short user city): " + addressFirstName);
        logger.info("Valid user last name (too short user city): " + addressLastName);
        logger.info("Valid user address 1 (too short user city): " + address1);
        logger.info("Too short user city: " + tooShortCity);
        logger.info("Valid user post code (too short user city): " + postCode);
        System.out.println("\n");
    }

    //invalid user data input methods - too short singular input
    public void inputTooShortFirstNameIntoFirstNameInputField(){addAddressFirstNameInputField.sendKeys(tooShortFirstName);}
    public void inputTooShortLastNameIntoLastNameInputField(){addAddressLastNameInputField.sendKeys(tooShortLastName);}
    public void inputTooShortAddress1IntoAddress1InputField(){addAddressAddress1InputField.sendKeys(tooShortAddress);}
    public void inputTooShortCityIntoCityInputField(){addAddressCityInputField.sendKeys(tooShortCity);}

    //invalid input error getter
    public String getInvalidInputError(){return addAddressInvalidSingularInputError.getText();}

}
