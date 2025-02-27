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

    public EditPasswordInvalidSingularInput(WebDriver driver) {super(driver);}


}
