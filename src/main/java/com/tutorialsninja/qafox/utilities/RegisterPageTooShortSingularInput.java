package com.tutorialsninja.qafox.utilities;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

public class RegisterPageTooShortSingularInput extends BasePage{

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

    //too short singular input
    private String tooShortFirstName;
    private String tooShortLastName;
    private String tooShortEmail;
    private String tooShortPhone;
    private String tooShortPassword;
    private String tooShortConfirmPassword;

    public RegisterPageTooShortSingularInput(WebDriver driver) {super(driver);}

    //valid user data input methods (for remaining inputs)
    public void inputFirstNameIntoFirstNameInputField(){registerPageFirstNameInputField.sendKeys(userFirstName);}
    public void inputLastNameIntoLastNameInputField(){registerPageLastNameInputField.sendKeys(userLastName);}
    public void inputEmailIntoEmailInputField(){registerPageEmailInputField.sendKeys(userEmail);}
    public void inputPhoneIntoPhoneInputField(){registerPagePhoneInputField.sendKeys(userPhoneNumber);}
    public void inputPasswordIntoPasswordInputField(){registerPagePasswordInputField.sendKeys(userPassword);}
    public void inputConfirmPasswordIntoConfirmPasswordInputField(){registerPageConfirmPasswordInputField.sendKeys(userConfirmPassword);}

    //invalid user register data getter - too short user first name (1 char)
    public void invalidUserRegDataTooShortFirstNameGetter(){

        tooShortFirstName = "L";
        userLastName = TestDataGenerator.getRandomLastName();
        userEmail = TestDataGenerator.generateRandomEmailAddress(6);
        userPhoneNumber = TestDataGenerator.generatePhoneNumber(8);
        userPassword = TestDataGenerator.generateRandomPassword();
        userConfirmPassword = userPassword;

        System.out.println("Invalid user register data generated (too short user first name): " + "\n");
        logger.info("Too short user first name: " + tooShortFirstName);
        logger.info("Valid user last name (too short user first name): " + userLastName);
        logger.info("Valid user email (too short user first name): " + userEmail);
        logger.info("Valid user phone number (too short user first name): " + userPhoneNumber);
        logger.info("Valid user password (too short user first name): " + userPassword);

        System.out.println("\n");
    }

    //invalid singular input methods - too short user first name
    public void inputTooShortFirstNameIntoFirstNameInputField(){registerPageFirstNameInputField.sendKeys(tooShortFirstName);}

    //invalid user register data getter - too short user last name
    public void invalidUserRegDataTooShortLastNameGetter(){

        userFirstName = TestDataGenerator.getRandomFirstName();
        tooShortLastName = "X";
        userEmail = TestDataGenerator.generateRandomEmailAddress(6);
        userPhoneNumber = TestDataGenerator.generatePhoneNumber(8);
        userPassword = TestDataGenerator.generateRandomPassword();
        userConfirmPassword = userPassword;

        System.out.println("Invalid user register data generated (too short user last name): " + "\n");
        logger.info("Valid user first name (too short user last name): " + userFirstName);
        logger.info("Too short user last name: " + tooShortLastName);
        logger.info("Valid user email (too short user last name): " + userEmail);
        logger.info("Valid user phone number (too short user last name): " + userPhoneNumber);
        logger.info("Valid user password (too short user last name): " + userPassword);

        System.out.println("\n");
    }

    //invalid singular input methods - too short user last name
    public void inputTooShortLastNameIntoLastNameInputField(){registerPageLastNameInputField.sendKeys(tooShortLastName);}

    //invalid user register data getter - too short user email address (1 char -> name, domain)
    public void invalidUserRegDataTooShortEmailGetter(){

        userFirstName = TestDataGenerator.getRandomFirstName();
        userLastName = TestDataGenerator.getRandomLastName();
        tooShortEmail = "k@g.com";
        userPhoneNumber = TestDataGenerator.generatePhoneNumber(8);
        userPassword = TestDataGenerator.generateRandomPassword();
        userConfirmPassword = userPassword;

        System.out.println("Invalid user register data generated (too short user email): " + "\n");
        logger.info("Valid user first name (too short user email): " + userFirstName);
        logger.info("Valid user last name (too short user email): " + userLastName);
        logger.info("Too short user email: " + tooShortEmail);
        logger.info("Valid user phone number (too short user email): " + userPhoneNumber);
        logger.info("Valid user password (too short user email): " + userPassword);

        System.out.println("\n");
    }

    //invalid singular input methods - too short user email address
    public void inputTooShortEmailIntoEmailInputField(){registerPageEmailInputField.sendKeys(tooShortEmail);}

    //invalid user register data getter - too short user phone (2 digits)
    public void invalidUserRegDataTooShortPhoneGetter(){

        userFirstName = TestDataGenerator.getRandomFirstName();
        userLastName = TestDataGenerator.getRandomLastName();
        userEmail = TestDataGenerator.generateRandomEmailAddress(6);
        tooShortPhone = "41";
        userPassword = TestDataGenerator.generateRandomPassword();
        userConfirmPassword = userPassword;

        System.out.println("Invalid user register data generated (too short user phone): " + "\n");
        logger.info("Valid user first name (too short user phone): " + userFirstName);
        logger.info("Valid user last name (too short user phone): " + userLastName);
        logger.info("Valid user email (too short user phone): " + userEmail);
        logger.info("Too short user phone number: " + tooShortPhone);
        logger.info("Valid user password (too short user phone): " + userPassword);

        System.out.println("\n");
    }

    //invalid singular input methods - too short user phone number (2 digits)
    public void inputTooShortPhoneIntoPhoneInputField(){registerPagePhoneInputField.sendKeys(tooShortPhone);}

    //invalid user register data getter - too short user password (3 chars)
    public void invalidUserRegDataTooShortPasswordGetter(){

        userFirstName = TestDataGenerator.getRandomFirstName();
        userLastName = TestDataGenerator.getRandomLastName();
        userEmail = TestDataGenerator.generateRandomEmailAddress(6);
        userPhoneNumber = TestDataGenerator.generatePhoneNumber(8);
        tooShortPassword = "F5#";
        tooShortConfirmPassword = tooShortPassword;

        System.out.println("Invalid user register data generated (too short user password): " + "\n");
        logger.info("Valid user first name (too short user password): " + userFirstName);
        logger.info("Valid user last name (too short user password): " + userLastName);
        logger.info("Valid user email (too short user password): " + userEmail);
        logger.info("Valid user phone number (too short user password): " + userPhoneNumber);
        logger.info("Too short user password: " + tooShortPassword);

        System.out.println("\n");
    }

    //invalid singular input methods - too short user password
    public void inputTooShortPasswordIntoPasswordInputField(){registerPagePasswordInputField.sendKeys(tooShortPassword);}
    //invalid singular input methods - too short user confirm password
    public void inputTooShortConfirmPasswordIntoConfirmPasswordInputField(){registerPageConfirmPasswordInputField.sendKeys(tooShortConfirmPassword);}

    //invalid singular input error getter
    public String getInvalidSingularInputError(){return registerPageInvalidSingularInputError.getText();}
}
