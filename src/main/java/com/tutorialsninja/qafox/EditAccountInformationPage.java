package com.tutorialsninja.qafox;

import com.tutorialsninja.qafox.utilities.*;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.*;

public class EditAccountInformationPage extends BasePage{

    //edit account information web elements
    @FindBy(xpath = "//div[@id='content']/h1")
    private WebElement editAccountInformationTitle;
    @FindBy(xpath = "//fieldset/legend")
    private WebElement editAccountInformationSubtitle;
    //input form
    @FindBy(xpath = "//label[@for='input-firstname']")
    private WebElement editAccountInfoFirstNameSubtitle;
    @FindBy(xpath = "//input[@id='input-firstname']")
    private WebElement editAccountInfoFirstNameInputField;
    @FindBy(xpath = "//label[@for='input-lastname']")
    private WebElement editAccountInfoLastNameSubtitle;
    @FindBy(xpath = "//input[@id='input-lastname']")
    private WebElement editAccountInfoLastNameInputField;
    @FindBy(xpath = "//label[@for='input-email']")
    private WebElement editAccountInfoEmailSubtitle;
    @FindBy(xpath = "//input[@id='input-email']")
    private WebElement editAccountInfoEmailInputField;
    @FindBy(xpath = "//label[@for='input-telephone']")
    private WebElement editAccountInfoPhoneSubtitle;
    @FindBy(xpath = "//input[@id='input-telephone']")
    private WebElement editAccountInfoPhoneInputField;
    @FindBy(xpath = "//div[@class='buttons clearfix']//a")
    private WebElement editAccountInfoBackButton;
    @FindBy(xpath = "//div[@class='buttons clearfix']//input")
    private WebElement editAccountInfoContinueButton;

    //valid user input data
    private String editedFirstName;
    private String editedLastName;
    private static String editedEmail;
    private String editedPhone;

    public EditAccountInformationPage(WebDriver driver) {super(driver);}

    //valid user input data getters
    public void validUserEditedFirstNameGetter(){

        editedFirstName = "Matthew";

        System.out.println("Generated valid user edited first name: " + "\n");
        logger.info("Edited first name: " + editedFirstName);
        System.out.println("\n");
    }

    public void validUserEditedLastNameGetter(){

        editedLastName = "O'Broody";

        System.out.println("Generated valid user edited last name: " + "\n");
        logger.info("Edited last name: " + editedLastName);
        System.out.println("\n");
    }

    public void validUserEditedEmailGetter(){

        editedEmail = TestDataGenerator.generateRandomEmailAddress(9);

        System.out.println("Generated valid user edited email: " + "\n");
        logger.info("Edited email: " + editedEmail);
        System.out.println("\n");
    }

    public void validUserEditedPhoneGetter(){

        editedPhone = TestDataGenerator.generatePhoneNumber(13);

        System.out.println("Generated valid user edited phone: " + "\n");
        logger.info("Edited phone: " + editedPhone);
        System.out.println("\n");
    }

    //valid edited user input data methods
    public void inputEditedFirstNameIntoFirstNameInputField(){
        editAccountInfoFirstNameInputField.clear();
        editAccountInfoFirstNameInputField.sendKeys(editedFirstName);
    }
    public void inputEditedLastNameIntoLastNameInputField(){
        editAccountInfoLastNameInputField.clear();
        editAccountInfoLastNameInputField.sendKeys(editedLastName);
    }
    public void inputEditedEmailIntoEmailInputField(){
        editAccountInfoEmailInputField.clear();
        editAccountInfoEmailInputField.sendKeys(editedEmail);
    }
    public void inputEditedPhoneIntoPhoneInputField(){
        editAccountInfoPhoneInputField.clear();
        editAccountInfoPhoneInputField.sendKeys(editedPhone);
    }

    //click 'Continue' button method
    public void clickEditInfoContinueButton(){
        Actions actions = new Actions(driver);
        actions.click(editAccountInfoContinueButton).click().perform();
    }

    //updated valid user login data getter
    public String getUpdatedUserEmail() {return editedEmail;}

    //edit account information text element getters
    public String getEditAccountInformationTitle() {return editAccountInformationTitle.getText();}
    public String getEditAccountInformationSubtitle() {return editAccountInformationSubtitle.getText();}
    public String getEditAccountInfoFirstNameSubtitle() {return editAccountInfoFirstNameSubtitle.getText();}
    public String getEditAccountInfoLastNameSubtitle(){return editAccountInfoLastNameSubtitle.getText();}
    public String getEditAccountInfoEmailSubtitle() {return editAccountInfoEmailSubtitle.getText();}
    public String getEditAccountInfoPhoneSubtitle() {return editAccountInfoPhoneSubtitle.getText();}

    //edit account information page web element assert methods
    public boolean isEditAccountInformationTitleDisplayed(){return editAccountInformationTitle.isDisplayed();}
    public boolean isEditAccountInformationSubtitleDisplayed(){return editAccountInformationSubtitle.isDisplayed();}
    //main section
    public boolean isEditAccountInfoFirstNameSubtitleDisplayed(){return editAccountInfoFirstNameSubtitle.isDisplayed();}
    public boolean isEditAccountInfoFirstNameInputFieldDisplayed(){return editAccountInfoFirstNameInputField.isDisplayed();}
    public boolean isEditAccountInfoLastNameSubtitleDisplayed(){return editAccountInfoLastNameSubtitle.isDisplayed();}
    public boolean isEditAccountInfoLastNameInputFieldDisplayed(){return editAccountInfoLastNameInputField.isDisplayed();}
    public boolean isEditAccountInfoEmailSubtitleDisplayed(){return editAccountInfoEmailSubtitle.isDisplayed();}
    public boolean isEditAccountInfoEmailInputFieldDisplayed(){return editAccountInfoEmailInputField.isDisplayed();}
    public boolean isEditAccountInfoPhoneSubtitleDisplayed(){return editAccountInfoPhoneSubtitle.isDisplayed();}
    public boolean isEditAccountInfoPhoneInputFieldDisplayed(){return editAccountInfoPhoneInputField.isDisplayed();}
    public boolean isEditAccountInfoBackButtonDisplayed(){return editAccountInfoBackButton.isDisplayed();}
    public boolean isEditAccountInfoContinueButtonDisplayed(){return editAccountInfoContinueButton.isDisplayed();}

}
