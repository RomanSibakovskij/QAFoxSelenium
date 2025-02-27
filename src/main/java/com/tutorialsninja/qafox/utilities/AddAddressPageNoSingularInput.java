package com.tutorialsninja.qafox.utilities;

import com.tutorialsninja.qafox.RegisterPage;
import com.tutorialsninja.qafox.utilities.*;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;

public class AddAddressPageNoSingularInput extends BasePage{

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

    //missing singular input data
    private String noAddressFirstName;
    private String noAddressLastName;
    private String noAddress;


    public AddAddressPageNoSingularInput(WebDriver driver) {super(driver);}

    //valid user data input methods (for remaining inputs)
    public void inputValidFirstNameIntoFirstNameInputField(){addAddressFirstNameInputField.sendKeys(addressFirstName);}
    public void inputValidLastNameIntoLastNameInputField(){addAddressLastNameInputField.sendKeys(addressLastName);}
    public void inputValidAddress1IntoAddress1InputField(){addAddressAddress1InputField.sendKeys(address1);}
    public void inputValidCityIntoCityInputField(){addAddressCityInputField.sendKeys(city);}
    public void inputValidPostCodeIntoPostCodeInputField(){addAddressPostCodeInputField.sendKeys(String.valueOf(postCode));}

    //invalid user address data getter - no first name
    public void invalidUserAddressDataNoFirstNameGetter(RegisterPage registerPage) {

        noAddressFirstName = "";
        addressLastName = registerPage.getUserLastName();
        address1 = TestDataGenerator.generateRandomAddress(8);
        city = TestDataGenerator.getRandomCity();
        postCode = TestDataGenerator.getRandomPostalCode();

        System.out.println("Invalid generated user address data (no user first name): " + "\n");
        logger.info("No user first name: " + noAddressFirstName);
        logger.info("Valid user last name (no user first name): " + addressLastName);
        logger.info("Valid user address 1 (no user first name): " + address1);
        logger.info("Valid user city (no user first name): " + city);
        logger.info("Valid user post code (no user first name): " + postCode);
        System.out.println("\n");
    }

    //invalid user address data getter - no last name
    public void invalidUserAddressDataNoLastNameGetter(RegisterPage registerPage) {

        addressFirstName = registerPage.getUserFirstName();
        noAddressLastName = "";
        address1 = TestDataGenerator.generateRandomAddress(8);
        city = TestDataGenerator.getRandomCity();
        postCode = TestDataGenerator.getRandomPostalCode();

        System.out.println("Invalid generated user address data (no user last name): " + "\n");
        logger.info("Valid user first name (no user last name): " + addressFirstName);
        logger.info("No user last name: " + noAddressLastName);
        logger.info("Valid user address 1 (no user last name): " + address1);
        logger.info("Valid user city (no user last name): " + city);
        logger.info("Valid user post code (no user last name): " + postCode);
        System.out.println("\n");
    }

    //invalid user address data getter - no address data
    public void invalidUserAddressDataNoAddressGetter(RegisterPage registerPage) {

        addressFirstName = registerPage.getUserFirstName();
        addressLastName = registerPage.getUserLastName();
        noAddress = "";
        city = TestDataGenerator.getRandomCity();
        postCode = TestDataGenerator.getRandomPostalCode();

        System.out.println("Invalid generated user address data (no user last name): " + "\n");
        logger.info("Valid user first name (no user last name): " + addressFirstName);
        logger.info("No user last name: " + noAddressLastName);
        logger.info("Valid user address 1 (no user last name): " + address1);
        logger.info("Valid user city (no user last name): " + city);
        logger.info("Valid user post code (no user last name): " + postCode);
        System.out.println("\n");
    }

    //invalid user data input methods - no singular input
    public void inputNoFirstNameIntoFirstNameInputField(){addAddressFirstNameInputField.sendKeys(noAddressFirstName);}
    public void inputNoLastNameIntoLastNameInputField(){addAddressLastNameInputField.sendKeys(noAddressLastName);}
    public void inputNoAddress1IntoAddress1InputField(){addAddressAddress1InputField.sendKeys(noAddress);}

    //invalid input error getter
    public String getInvalidInputError(){return addAddressInvalidSingularInputError.getText();}

}
