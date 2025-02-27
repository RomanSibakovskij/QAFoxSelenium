package com.tutorialsninja.qafox.utilities;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

public class EditAccountPageInvalidSingularInput extends BasePage{

    //input form
    @FindBy(xpath = "//input[@id='input-firstname']")
    private WebElement editAccountInfoFirstNameInputField;
    @FindBy(xpath = "//input[@id='input-lastname']")
    private WebElement editAccountInfoLastNameInputField;
    @FindBy(xpath = "//input[@id='input-email']")
    private WebElement editAccountInfoEmailInputField;
    @FindBy(xpath = "//input[@id='input-telephone']")
    private WebElement editAccountInfoPhoneInputField;
    //invalid singular input message element
    @FindBy(xpath = "//div[@class='text-danger']")
    private WebElement editAccountInfoInvalidSingularInputError;
    //singular input error element
    @FindBy(xpath = "//div[@class='alert alert-danger alert-dismissible']")
    private WebElement editAccountSingularInputError;

    //invalid singular input format
    private String invalidFirstNameFormat;
    private String invalidLastNameFormat;
    private String invalidEmailFormat;
    //pre-existing singular input
    private String existingEmail;

    public EditAccountPageInvalidSingularInput(WebDriver driver) {super(driver);}

    //invalid user input data method - invalid singular input format
    public void inputInvalidFirstNameFormatIntoFirstNameInputField(){
        invalidFirstNameFormat = "3434!@#@#$3343";
        editAccountInfoFirstNameInputField.clear();
        editAccountInfoFirstNameInputField.sendKeys(invalidFirstNameFormat);
        logger.info("Invalid edited first name format: " + invalidFirstNameFormat);
    }

    public void inputInvalidLastNameFormatIntoLastNameInputField(){
        invalidLastNameFormat = "3434!@#@#$3343";
        editAccountInfoLastNameInputField.clear();
        editAccountInfoLastNameInputField.sendKeys(invalidLastNameFormat);
        logger.info("Invalid edited last name format: " + invalidLastNameFormat);
    }

    public void inputInvalidEmailFormatIntoEmailInputField(){
        invalidEmailFormat = "hgyyahoo.com";
        editAccountInfoEmailInputField.clear();
        editAccountInfoEmailInputField.sendKeys(invalidEmailFormat);
        logger.info("Invalid edited email format: " + invalidEmailFormat);
    }

    public void inputExistingEmailIntoEmailInputField(){
        existingEmail = "m0@example.com";
        editAccountInfoEmailInputField.clear();
        editAccountInfoEmailInputField.sendKeys(existingEmail);
        logger.info("Pre-existing edited email: " + existingEmail);
    }

    //invalid singular input error getter
    public String getInvalidSingularInputError(){return editAccountInfoInvalidSingularInputError.getText();}
    //invalid input error getter
    public String getInvalidInputError(){return editAccountSingularInputError.getText();}
}
