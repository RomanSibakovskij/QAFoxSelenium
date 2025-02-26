package com.tutorialsninja.qafox.utilities;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.*;

public class EditAccountPageNoSingularInput extends BasePage{

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

    //missing singular input
    private String noEditedFirstName = "";
    private String noEditedLastName = "";

    public EditAccountPageNoSingularInput(WebDriver driver) {super(driver);}

    //invalid edited user input data methods - no singular input
    public void inputNoFirstNameIntoFirstNameInputField(){
        editAccountInfoFirstNameInputField.clear();
        editAccountInfoFirstNameInputField.sendKeys(noEditedFirstName);
    }

    public void inputNoLastNameIntoLastNameInputField(){
        editAccountInfoLastNameInputField.clear();
        editAccountInfoLastNameInputField.sendKeys(noEditedLastName);
    }

    //invalid singular input error getter
    public String getInvalidSingularInputError(){return editAccountInfoInvalidSingularInputError.getText();}
}
