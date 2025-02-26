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

    public RegisterPageTooLongSingularInput(WebDriver driver) {super(driver);}


}
