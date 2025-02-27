package com.tutorialsninja.qafox.utilities;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

public class EditAccountPageTooShortSingularInput extends BasePage{

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

    //too short singular input
    private String tooShortFirstName;
    private String tooShortLastName;

    public EditAccountPageTooShortSingularInput(WebDriver driver) {super(driver);}

    //invalid user input data methods - too short singular input
    public void inputTooShortFirstNameIntoFirstNameInputField(){
        tooShortFirstName = "S";
        editAccountInfoFirstNameInputField.clear();
        editAccountInfoFirstNameInputField.sendKeys(tooShortFirstName);
        logger.info("Too short edited first name: " + tooShortFirstName);
    }

    public void inputTooShortLastNameIntoLastNameInputField(){
        tooShortLastName = "B";
        editAccountInfoLastNameInputField.clear();
        editAccountInfoLastNameInputField.sendKeys(tooShortLastName);
        logger.info("Too short edited last name: " + tooShortLastName);
    }


    //invalid singular input error getter
    public String getInvalidSingularInputError(){return editAccountInfoInvalidSingularInputError.getText();}
}
