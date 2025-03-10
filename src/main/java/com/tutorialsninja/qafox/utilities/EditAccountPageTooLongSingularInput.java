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
    private String tooLongLastName;
    private String tooLongEmail;
    private String tooLongPhone;

    public EditAccountPageTooLongSingularInput(WebDriver driver) {super(driver);}

    //invalid user input data method - too long singular input
    public void inputTooLongFirstNameIntoFirstNameInputField(){
        tooLongFirstName = "Addfgfsdasfdsgfdhweqeeregdfsdzxcs";
        editAccountInfoFirstNameInputField.clear();
        editAccountInfoFirstNameInputField.sendKeys(tooLongFirstName);
        logger.info("Too long edited first name: " + tooLongFirstName);
    }

    public void inputTooLongLastNameIntoLastNameInputField(){
        tooLongLastName = "Addfgfsdasfdsgfdhweqeeregdfsdzxcs";
        editAccountInfoLastNameInputField.clear();
        editAccountInfoLastNameInputField.sendKeys(tooLongLastName);
        logger.info("Too long edited last name: " + tooLongLastName);
    }

    public void inputTooLongEmailIntoEmailInputField(){
        tooLongEmail = TestDataGenerator.generateRandomTooLongEmailAddress(100);
        editAccountInfoEmailInputField.clear();
        editAccountInfoEmailInputField.sendKeys(tooLongEmail);
        logger.info("Too long edited email: " + tooLongEmail);
    }

    public void inputTooLongPhoneIntoPhoneInputField(){
        tooLongPhone = "133465467423547685343566767853437";
        editAccountInfoPhoneInputField.clear();
        editAccountInfoPhoneInputField.sendKeys(tooLongPhone);
        logger.info("Too long edited phone: " + tooLongPhone);
    }

    //invalid singular input error getter
    public String getInvalidSingularInputError(){return editAccountInfoInvalidSingularInputError.getText();}
}
