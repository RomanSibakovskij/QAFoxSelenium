package com.tutorialsninja.qafox.utilities;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

public class RegisterPageInvalidSingularInputFormat extends BasePage{

    @FindBy(xpath = "//fieldset[@id='account']//input[@id='input-firstname']")
    private WebElement registerPageFirstNameInputField;
    @FindBy(xpath = "//fieldset[@id='account']//input[@id='input-lastname']")
    private WebElement registerPageLastNameInputField;
    @FindBy(xpath = "//fieldset[@id='account']//input[@id='input-email']")
    private WebElement registerPageEmailInputField;
    @FindBy(xpath = "//fieldset[@id='account']//input[@id='input-telephone']")
    private WebElement registerPagePhoneInputField;
    //password section
    @FindBy(xpath = "//fieldset[2]//input[@id='input-password']")
    private WebElement registerPagePasswordInputField;
    @FindBy(xpath = "//fieldset[2]//input[@id='input-confirm']")
    private WebElement registerPageConfirmPasswordInputField;
    //invalid singular input message
    @FindBy(xpath = "//div[@class='text-danger']")
    private WebElement registerPageInvalidSingularInputError;

    //valid user register data
    private static String userFirstName;
    private static String userLastName;
    private static String userEmail;
    private static String userPassword;
    private String userPhoneNumber;
    private String userConfirmPassword;

    //invalid singular input format
    private String invalidFirstNameFormat;
    private String invalidLastNameFormat;
    private String invalidEmailFormat;

    public RegisterPageInvalidSingularInputFormat(WebDriver driver) {super(driver);}

    //valid user data input methods (for remaining inputs)
    public void inputFirstNameIntoFirstNameInputField(){registerPageFirstNameInputField.sendKeys(userFirstName);}
    public void inputLastNameIntoLastNameInputField(){registerPageLastNameInputField.sendKeys(userLastName);}
    public void inputEmailIntoEmailInputField(){registerPageEmailInputField.sendKeys(userEmail);}
    public void inputPhoneIntoPhoneInputField(){registerPagePhoneInputField.sendKeys(userPhoneNumber);}
    public void inputPasswordIntoPasswordInputField(){registerPagePasswordInputField.sendKeys(userPassword);}
    public void inputConfirmPasswordIntoConfirmPasswordInputField(){registerPageConfirmPasswordInputField.sendKeys(userConfirmPassword);}

    //invalid user register data getter - invalid user first name format (special symbols only and digits)
    public void invalidUserRegDataInvalidFirstNameFormatGetter(){

        invalidFirstNameFormat = "21!#@#$%#%^%$^$#%112";
        userLastName = TestDataGenerator.getRandomLastName();
        userEmail = TestDataGenerator.generateRandomEmailAddress(6);
        userPhoneNumber = TestDataGenerator.generatePhoneNumber(8);
        userPassword = TestDataGenerator.generateRandomPassword();
        userConfirmPassword = userPassword;

        System.out.println("Invalid user register data generated (invalid user first name format): " + "\n");
        logger.info("Invalid user first name input format: " + invalidFirstNameFormat);
        logger.info("Valid user last name (invalid user first name format): " + userLastName);
        logger.info("Valid user email (invalid user first name format): " + userEmail);
        logger.info("Valid user phone number (invalid user first name format): " + userPhoneNumber);
        logger.info("Valid user password (invalid user first name format): " + userPassword);

        System.out.println("\n");
    }

    //invalid singular input methods - invalid user first name input format
    public void inputInvalidFirstNameFormatIntoFirstNameInputField(){registerPageFirstNameInputField.sendKeys(invalidFirstNameFormat);}

    //invalid user register data getter - invalid user last name format (special symbols only and digits)
    public void invalidUserRegDataInvalidLastNameFormatGetter(){

        userFirstName = TestDataGenerator.getRandomFirstName();
        invalidLastNameFormat = "124@#$#%$#%13232";
        userEmail = TestDataGenerator.generateRandomEmailAddress(6);
        userPhoneNumber = TestDataGenerator.generatePhoneNumber(8);
        userPassword = TestDataGenerator.generateRandomPassword();
        userConfirmPassword = userPassword;

        System.out.println("Invalid user register data generated (invalid user last name format): " + "\n");
        logger.info("Valid user first name (invalid user last name format): " + userFirstName);
        logger.info("Invalid user last name input format: " + invalidLastNameFormat);
        logger.info("Valid user email (invalid user last name format): " + userEmail);
        logger.info("Valid user phone number (invalid user last name format): " + userPhoneNumber);
        logger.info("Valid user password (invalid user last name format): " + userPassword);

        System.out.println("\n");
    }

    //invalid singular input methods - invalid user last name input format
    public void inputInvalidLastNameFormatIntoLastNameInputField(){registerPageLastNameInputField.sendKeys(invalidLastNameFormat);}

    //invalid user register data getter - invalid user email address format (missing '@')
    public void invalidUserRegDataInvalidEmailFormatGetter(){

        userFirstName = TestDataGenerator.getRandomFirstName();
        userLastName = TestDataGenerator.getRandomLastName();
        invalidEmailFormat = "frdsxcdfakemail.com";
        userPhoneNumber = TestDataGenerator.generatePhoneNumber(8);
        userPassword = TestDataGenerator.generateRandomPassword();
        userConfirmPassword = userPassword;

        System.out.println("Invalid user register data generated (invalid user email format): " + "\n");
        logger.info("Valid user first name (invalid user email format): " + userFirstName);
        logger.info("Valid user last name (invalid user email format): " + userLastName);
        logger.info("Invalid user email input format: " + invalidEmailFormat);
        logger.info("Valid user phone number (invalid user email format): " + userPhoneNumber);
        logger.info("Valid user password (invalid user email format): " + userPassword);

        System.out.println("\n");
    }

    //invalid singular input methods - invalid user email address format
    public void inputInvalidEmailFormatIntoEmailInputField(){registerPageEmailInputField.sendKeys(invalidEmailFormat);}

    //invalid singular input error getter
    public String getInvalidSingularInputError(){return registerPageInvalidSingularInputError.getText();}
}
