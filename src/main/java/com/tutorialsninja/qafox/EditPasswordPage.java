package com.tutorialsninja.qafox;

import com.tutorialsninja.qafox.utilities.*;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.*;

public class EditPasswordPage extends BasePage{

    //edit password page web elements
    @FindBy(xpath = "//div[@id='content']/h1")
    private WebElement editPasswordPageTitle;
    @FindBy(xpath = "//fieldset/legend")
    private WebElement editPasswordPageSubtitle;
    @FindBy(xpath = "//label[@for='input-password']")
    private WebElement passwordSubtext;
    @FindBy(xpath = "//input[@id='input-password']")
    private WebElement passwordInputField;
    @FindBy(xpath = "//label[@for='input-confirm']")
    private WebElement confirmPasswordSubtext;
    @FindBy(xpath = "//input[@id='input-confirm']")
    private WebElement confirmPasswordInputField;
    @FindBy(xpath = "//div[@class='buttons clearfix']//a")
    private WebElement editPasswordBackButton;
    @FindBy(xpath = "//div[@class='buttons clearfix']//input")
    private WebElement editPasswordContinueButton;

    //valid edited password input data
    private static String newPassword;
    private String confirmPassword;

    public EditPasswordPage(WebDriver driver) {super(driver);}

    //valid new password getter
    public void validNewPasswordGetter(){

        newPassword = "Saxsd@@34_&*45";
        confirmPassword = newPassword;

        logger.info("New password: " + newPassword);
        logger.info("Matching confirm password: " + confirmPassword);
        System.out.println("\n");
    }

    //valid new data input methods
    public void inputNewPasswordIntoPasswordInputField(){passwordInputField.sendKeys(newPassword);}
    public void inputConfirmPasswordIntoConfirmPasswordInputField(){confirmPasswordInputField.sendKeys(confirmPassword);}

    //click 'Continue' button method
    public void clickEditPasswordContinueButton(){
        Actions actions = new Actions(driver);
        actions.moveToElement(editPasswordContinueButton).click().perform();
    }

    //edit password page text element getters
    public String getEditPasswordPageTitle() {return editPasswordPageTitle.getText();}
    public String getEditPasswordPageSubtitle() {return editPasswordPageSubtitle.getText();}
    public String getPasswordSubtext() {return passwordSubtext.getText();}
    public String getConfirmPasswordSubtext() {return confirmPasswordSubtext.getText();}

    //new password getter
    public String getNewPassword() {return newPassword;}

    //edit password page web element assert methods
    public boolean isEditPasswordPageTitleDisplayed() {return editPasswordPageTitle.isDisplayed();}
    public boolean isEditPasswordPageSubtitleDisplayed() {return editPasswordPageSubtitle.isDisplayed();}
    public boolean isPasswordSubtextDisplayed() {return passwordSubtext.isDisplayed();}
    public boolean isPasswordInputFieldDisplayed() {return passwordInputField.isDisplayed();}
    public boolean isConfirmPasswordSubtextDisplayed() {return confirmPasswordSubtext.isDisplayed();}
    public boolean isConfirmPasswordInputFieldDisplayed() {return confirmPasswordInputField.isDisplayed();}
    public boolean isEditPasswordBackButtonDisplayed() {return editPasswordBackButton.isDisplayed();}
    public boolean isEditPasswordContinueButtonDisplayed() {return editPasswordContinueButton.isDisplayed();}

}
