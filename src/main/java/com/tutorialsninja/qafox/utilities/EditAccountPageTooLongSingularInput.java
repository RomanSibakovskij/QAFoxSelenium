package com.tutorialsninja.qafox.utilities;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

public class EditAccountPageTooLongSingularInput extends BasePage{

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

    //too long singular input
    private String tooLongFirstName;

    public EditAccountPageTooLongSingularInput(WebDriver driver) {super(driver);}

    //invalid user input data method - too long singular input
    public void inputTooLongFirstNameIntoFirstNameInputField(){
        tooLongFirstName = "Addfgfsdasfdsgfdhweqeeregdfsdzxcs";
        editAccountInfoFirstNameInputField.clear();
        editAccountInfoFirstNameInputField.sendKeys(tooLongFirstName);
            logger.info("Too long edited first name: " + tooLongFirstName);
    }

    //invalid singular input error getter
    public String getInvalidSingularInputError(){return editAccountInfoInvalidSingularInputError.getText();}
}
