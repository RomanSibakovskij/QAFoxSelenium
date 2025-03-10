package com.tutorialsninja.qafox.utilities;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

public class RegisterPageNoSingularInput extends BasePage{

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
    //invalid singular input message element
    @FindBy(xpath = "//div[@class='text-danger']")
    private WebElement registerPageInvalidSingularInputError;
    //missing 'Agree to Privacy Policy' checkbox click error element
    @FindBy(xpath = "//div[@class='alert alert-danger alert-dismissible']")
    private WebElement registerPageMissingAgreeToPrivacyError;

    //valid user register data
    private static String userFirstName;
    private static String userLastName;
    private static String userEmail;
    private static String userPassword;
    private String userPhoneNumber;
    private String userConfirmPassword;

    //missing singular input
    private String noFirstName;
    private String noLastName;
    private String noEmail;
    private String noPhoneNumber;
    private String noPassword;
    private String noConfirmPassword;

    public RegisterPageNoSingularInput(WebDriver driver) {super(driver);}

    //valid user data input methods (for remaining inputs)
    public void inputFirstNameIntoFirstNameInputField(){registerPageFirstNameInputField.sendKeys(userFirstName);}
    public void inputLastNameIntoLastNameInputField(){registerPageLastNameInputField.sendKeys(userLastName);}
    public void inputEmailIntoEmailInputField(){registerPageEmailInputField.sendKeys(userEmail);}
    public void inputPhoneIntoPhoneInputField(){registerPagePhoneInputField.sendKeys(userPhoneNumber);}
    public void inputPasswordIntoPasswordInputField(){registerPagePasswordInputField.sendKeys(userPassword);}
    public void inputConfirmPasswordIntoConfirmPasswordInputField(){registerPageConfirmPasswordInputField.sendKeys(userConfirmPassword);}

    //invalid user register data getter - no user first name
    public void invalidUserRegDataNoFirstNameGetter(){

        noFirstName = "";
        userLastName = TestDataGenerator.getRandomLastName();
        userEmail = TestDataGenerator.generateRandomEmailAddress(6);
        userPhoneNumber = TestDataGenerator.generatePhoneNumber(8);
        userPassword = TestDataGenerator.generateRandomPassword();
        userConfirmPassword = userPassword;

        System.out.println("Invalid user register data generated (no user first name): " + "\n");
        logger.info("No user first name: " + noFirstName);
        logger.info("Valid user last name (no user first name): " + userLastName);
        logger.info("Valid user email (no user first name): " + userEmail);
        logger.info("Valid user phone number (no user first name): " + userPhoneNumber);
        logger.info("Valid user password (no user first name): " + userPassword);

        System.out.println("\n");
    }

    //invalid singular input methods - no user first name
    public void inputNoFirstNameIntoFirstNameInputField(){registerPageFirstNameInputField.sendKeys(noFirstName);}


    //invalid user register data getter - no user last name
    public void invalidUserRegDataNoLastNameGetter(){

        userFirstName = TestDataGenerator.getRandomFirstName();
        noLastName = "";
        userEmail = TestDataGenerator.generateRandomEmailAddress(6);
        userPhoneNumber = TestDataGenerator.generatePhoneNumber(8);
        userPassword = TestDataGenerator.generateRandomPassword();
        userConfirmPassword = userPassword;

        System.out.println("Invalid user register data generated (no user last name): " + "\n");
        logger.info("Valid user first name (no user last name): " + userFirstName);
        logger.info("No user last name: " + noLastName);
        logger.info("Valid user email (no user last name): " + userEmail);
        logger.info("Valid user phone number (no user last name): " + userPhoneNumber);
        logger.info("Valid user password (no user last name): " + userPassword);

        System.out.println("\n");
    }

    //invalid singular input methods - no user last name
    public void inputNoLastNameIntoLastNameInputField(){registerPageLastNameInputField.sendKeys(noLastName);}

    //invalid user register data getter - no user email address
    public void invalidUserRegDataNoEmailGetter(){

        userFirstName = TestDataGenerator.getRandomFirstName();
        userLastName = TestDataGenerator.getRandomLastName();
        noEmail = "";
        userPhoneNumber = TestDataGenerator.generatePhoneNumber(8);
        userPassword = TestDataGenerator.generateRandomPassword();
        userConfirmPassword = userPassword;

        System.out.println("Invalid user register data generated (no user email): " + "\n");
        logger.info("Valid user first name (no user email): " + userFirstName);
        logger.info("Valid user last name (no user email): " + userLastName);
        logger.info("No user email: " + noEmail);
        logger.info("Valid user phone number (no user email): " + userPhoneNumber);
        logger.info("Valid user password (no user email): " + userPassword);

        System.out.println("\n");
    }

    //invalid singular input methods - no user email address
    public void inputNoEmailIntoEmailInputField(){registerPageEmailInputField.sendKeys(noEmail);}

    //invalid user register data getter - no user phone
    public void invalidUserRegDataNoPhoneGetter(){

        userFirstName = TestDataGenerator.getRandomFirstName();
        userLastName = TestDataGenerator.getRandomLastName();
        userEmail = TestDataGenerator.generateRandomEmailAddress(6);
        noPhoneNumber = "";
        userPassword = TestDataGenerator.generateRandomPassword();
        userConfirmPassword = userPassword;

        System.out.println("Invalid user register data generated (no user phone): " + "\n");
        logger.info("Valid user first name (no user phone): " + userFirstName);
        logger.info("Valid user last name (no user phone): " + userLastName);
        logger.info("Valid user email (no user phone): " + userEmail);
        logger.info("No user phone number: " + noPhoneNumber);
        logger.info("Valid user password (no user phone): " + userPassword);

        System.out.println("\n");
    }

    //invalid singular input methods - no user phone number
    public void inputNoPhoneIntoPhoneInputField(){registerPagePhoneInputField.sendKeys(noPhoneNumber);}

    //invalid user register data getter - no user password
    public void invalidUserRegDataNoPasswordGetter(){

        userFirstName = TestDataGenerator.getRandomFirstName();
        userLastName = TestDataGenerator.getRandomLastName();
        userEmail = TestDataGenerator.generateRandomEmailAddress(6);
        userPhoneNumber = TestDataGenerator.generatePhoneNumber(8);
        noPassword = "";
        userConfirmPassword = noPassword;

        System.out.println("Invalid user register data generated (no user password): " + "\n");
        logger.info("Valid user first name (no user password): " + userFirstName);
        logger.info("Valid user last name (no user password): " + userLastName);
        logger.info("Valid user email (no user password): " + userEmail);
        logger.info("Valid user phone number (no user password): " + userPhoneNumber);
        logger.info("No user password: " + noPassword);

        System.out.println("\n");
    }

    //invalid singular input methods - no user password
    public void inputNoPasswordIntoPasswordInputField(){registerPagePasswordInputField.sendKeys(noPassword);}

    //invalid user register data getter - no user confirm password
    public void invalidUserRegDataNoConfirmPasswordGetter(){

        userFirstName = TestDataGenerator.getRandomFirstName();
        userLastName = TestDataGenerator.getRandomLastName();
        userEmail = TestDataGenerator.generateRandomEmailAddress(6);
        userPhoneNumber = TestDataGenerator.generatePhoneNumber(8);
        userPassword = TestDataGenerator.generateRandomPassword();
        noConfirmPassword = "";

        System.out.println("Invalid user register data generated (no user confirm password): " + "\n");
        logger.info("Valid user first name (no user confirm password): " + userFirstName);
        logger.info("Valid user last name (no user confirm password)): " + userLastName);
        logger.info("Valid user email (no user confirm password): " + userEmail);
        logger.info("Valid user phone number (no user confirm password): " + userPhoneNumber);
        logger.info("Valid user password (no user confirm password): " + userPassword);

        System.out.println("\n");
    }

    //invalid singular input methods - no user confirm password
    public void inputNoConfirmPasswordIntoConfirmPasswordInputField(){registerPageConfirmPasswordInputField.sendKeys(noConfirmPassword);}

    //invalid singular input error getter
    public String getInvalidSingularInputError(){return registerPageInvalidSingularInputError.getText();}
    //missing 'Agree to Privacy Policy' error getter
    public String getAgreeToPrivacyPolicyError(){return registerPageMissingAgreeToPrivacyError.getText();}

}
