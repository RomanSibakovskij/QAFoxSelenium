package com.tutorialsninja.qafox.utilities;

import com.tutorialsninja.qafox.utilities.BasePage;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

public class EditPasswordInvalidSingularInput extends BasePage{

    //input form
    @FindBy(xpath = "//input[@id='input-password']")
    private WebElement passwordInputField;
    @FindBy(xpath = "//input[@id='input-confirm']")
    private WebElement confirmPasswordInputField;
    //invalid singular input message element
    @FindBy(xpath = "//div[@class='text-danger']")
    private WebElement editPasswordInvalidSingularInputError;

    //missing input data
    private String noEditedPassword = "";
    private String noConfirmPassword = noEditedPassword;

    //too short input data
    private String tooShortEditedPassword = "G%c";
    private String tooShortConfirmPassword = tooShortEditedPassword;

    //too long input data
    private String tooLongEditedPassword = "Rfdfdg$%^*&%fgdfdfh23";
    private String tooLongConfirmPassword = tooLongEditedPassword;

    public EditPasswordInvalidSingularInput(WebDriver driver) {super(driver);}

    //invalid new password input methods
    //no input
    public void inputNoPasswordIntoPasswordInputField(){passwordInputField.sendKeys(noEditedPassword);}
    public void inputNoConfirmPasswordIntoConfirmPasswordInputField(){confirmPasswordInputField.sendKeys(noConfirmPassword);}

    //too short input (3 chars)
    public void inputTooShortPasswordIntoPasswordInputField(){
        passwordInputField.sendKeys(tooShortEditedPassword);
        logger.info("Too short edited password: " + tooShortEditedPassword);
    }
    public void inputTooShortConfirmPasswordIntoConfirmPasswordInputField(){
        confirmPasswordInputField.sendKeys(tooShortConfirmPassword);
        logger.info("Too short matching confirm password: " + tooShortConfirmPassword);
    }

    //too short input (21 chars)
    public void inputTooLongPasswordIntoPasswordInputField(){
        passwordInputField.sendKeys(tooLongEditedPassword);
        logger.info("Too long edited password: " + tooLongEditedPassword);
    }
    public void inputTooLongConfirmPasswordIntoConfirmPasswordInputField(){
        confirmPasswordInputField.sendKeys(tooLongConfirmPassword);
        logger.info("Too long matching confirm password: " + tooLongConfirmPassword);
    }

    //invalid singular input error getter
    public String getInvalidSingularInputError(){return editPasswordInvalidSingularInputError.getText();}
}
