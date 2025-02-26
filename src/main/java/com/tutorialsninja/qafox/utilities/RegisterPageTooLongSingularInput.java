package com.tutorialsninja.qafox.utilities;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

public class RegisterPageTooLongSingularInput extends BasePage{

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

    //too long singular input
    private String tooLongFirstName;
    private String tooLongLastName;
    private String tooLongEmail;

    public RegisterPageTooLongSingularInput(WebDriver driver) {super(driver);}

    //valid user data input methods (for remaining inputs)
    public void inputFirstNameIntoFirstNameInputField(){registerPageFirstNameInputField.sendKeys(userFirstName);}
    public void inputLastNameIntoLastNameInputField(){registerPageLastNameInputField.sendKeys(userLastName);}
    public void inputEmailIntoEmailInputField(){registerPageEmailInputField.sendKeys(userEmail);}
    public void inputPhoneIntoPhoneInputField(){registerPagePhoneInputField.sendKeys(userPhoneNumber);}
    public void inputPasswordIntoPasswordInputField(){registerPagePasswordInputField.sendKeys(userPassword);}
    public void inputConfirmPasswordIntoConfirmPasswordInputField(){registerPageConfirmPasswordInputField.sendKeys(userConfirmPassword);}

    //invalid user register data getter - too long user first name (33 chars)
    public void invalidUserRegDataTooLongFirstNameGetter(){

        tooLongFirstName = "Azfddfsfvxvxcbfgswerteryytiyuokjm";
        userLastName = TestDataGenerator.getRandomLastName();
        userEmail = TestDataGenerator.generateRandomEmailAddress(6);
        userPhoneNumber = TestDataGenerator.generatePhoneNumber(8);
        userPassword = TestDataGenerator.generateRandomPassword();
        userConfirmPassword = userPassword;

        System.out.println("Invalid user register data generated (too long user first name): " + "\n");
        logger.info("Too long user first name: " + tooLongFirstName);
        logger.info("Valid user last name (too long user first name): " + userLastName);
        logger.info("Valid user email (too long user first name): " + userEmail);
        logger.info("Valid user phone number (too long user first name): " + userPhoneNumber);
        logger.info("Valid user password (too long user first name): " + userPassword);

        System.out.println("\n");
    }

    //invalid singular input methods - too long user first name
    public void inputTooLongFirstNameIntoFirstNameInputField(){registerPageFirstNameInputField.sendKeys(tooLongFirstName);}

    //invalid user register data getter - too long user last name (33 chars)
    public void invalidUserRegDataTooLongLastNameGetter(){

        userFirstName = TestDataGenerator.getRandomFirstName();
        tooLongLastName = "Azfddfsfvxvxcbfgswerteryytiyuokjm";
        userEmail = TestDataGenerator.generateRandomEmailAddress(6);
        userPhoneNumber = TestDataGenerator.generatePhoneNumber(8);
        userPassword = TestDataGenerator.generateRandomPassword();
        userConfirmPassword = userPassword;

        System.out.println("Invalid user register data generated (too long user last name): " + "\n");
        logger.info("Valid user first name: " + userFirstName);
        logger.info("Too long user last name (too long user last name): " + tooLongLastName);
        logger.info("Valid user email (too long user last name): " + userEmail);
        logger.info("Valid user phone number (too long user last name): " + userPhoneNumber);
        logger.info("Valid user password (too long user last name): " + userPassword);

        System.out.println("\n");
    }

    //invalid singular input methods - too long user last name
    public void inputTooLongLastNameIntoLastNameInputField(){registerPageLastNameInputField.sendKeys(tooLongLastName);}

    //invalid user register data getter - too long user email address (100 chars -> name, domain)
    public void invalidUserRegDataTooLongEmailGetter(){

        userFirstName = TestDataGenerator.getRandomFirstName();
        userLastName = TestDataGenerator.getRandomLastName();
        tooLongEmail = "Azfddfsfvxvxcbfgswerteryytiyuokjmsdsdffdxcxchgjhhjlkrtertrtuyuyoupjhdfsdcxcbgjgjgsdasdsderweqwqerter@gfzfddfsfvxvxcbfgswerteryytiyuokjmsdsdffdxcxchgjhhjlkrtertrtuyuyoupjhdfsdcxcbgjgjgsdasdsderweqwqerter.com";
        userPhoneNumber = TestDataGenerator.generatePhoneNumber(8);
        userPassword = TestDataGenerator.generateRandomPassword();
        userConfirmPassword = userPassword;

        System.out.println("Invalid user register data generated (too long user email): " + "\n");
        logger.info("Valid user first name (too long user email): " + userFirstName);
        logger.info("Valid user last name (too long user email): " + userLastName);
        logger.info("Too long user email: " + tooLongEmail);
        logger.info("Valid user phone number (too long user email): " + userPhoneNumber);
        logger.info("Valid user password (too long user email): " + userPassword);

        System.out.println("\n");
    }

    //invalid singular input methods - too long user email address
    public void inputTooLongEmailIntoEmailInputField(){registerPageEmailInputField.sendKeys(tooLongEmail);}

    //invalid singular input error getter
    public String getInvalidSingularInputError(){return registerPageInvalidSingularInputError.getText();}

}
