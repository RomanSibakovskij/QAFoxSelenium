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

    //missing singular input
    private String noEditedPassword = "";
    private String noConfirmPassword = noEditedPassword;

    public EditPasswordInvalidSingularInput(WebDriver driver) {super(driver);}

    //invalid new data input methods
    public void inputNoPasswordIntoPasswordInputField(){passwordInputField.sendKeys(noEditedPassword);}
    public void inputNoConfirmPasswordIntoConfirmPasswordInputField(){confirmPasswordInputField.sendKeys(noConfirmPassword);}

    //invalid singular input error getter
    public String getInvalidSingularInputError(){return editPasswordInvalidSingularInputError.getText();}
}
