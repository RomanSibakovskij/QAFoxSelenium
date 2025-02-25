package com.tutorialsninja.qafox.utilities;

import com.tutorialsninja.qafox.utilities.*;
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

    //missing singular input
    private String noFirstName;

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

        System.out.println("Valid user register data generated: " + "\n");
        logger.info("Valid user first name: " + userFirstName);
        logger.info("Valid user last name: " + userLastName);
        logger.info("Valid user email: " + userEmail);
        logger.info("Valid user phone number: " + userPhoneNumber);
        logger.info("Valid user password: " + userPassword);

        System.out.println("\n");
    }

    //invalid singular input methods - no user first name
    public void inputNoFirstNameIntoFirstNameInputField(){registerPageFirstNameInputField.sendKeys(noFirstName);}

    //invalid singular input error getter
    public String getInvalidSingularInputError(){return registerPageInvalidSingularInputError.getText();}

}
