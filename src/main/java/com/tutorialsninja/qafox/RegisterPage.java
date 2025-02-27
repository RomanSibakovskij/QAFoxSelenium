package com.tutorialsninja.qafox;

import com.tutorialsninja.qafox.utilities.*;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.*;

public class RegisterPage extends BasePage{

    //register page web elements
    @FindBy(xpath = "//div[@id='content']/h1")
    private WebElement registerPageTitle;
    @FindBy(xpath = "//div[@id='content']/p")
    private WebElement registerPageSubtitle;
    @FindBy(xpath = "//div[@id='content']/p/a")
    private WebElement registerPageLoginPageLink;
    //input form
    //personal details section
    @FindBy(xpath = "//fieldset[@id='account']/legend")
    private WebElement registerPagePersonalDetailsSectionTitle;
    @FindBy(xpath = "(//form//label[@class='col-sm-2 control-label'])[2]")
    private WebElement registerPageFirstNameSubtitle;
    @FindBy(xpath = "//fieldset[@id='account']//input[@id='input-firstname']")
    private WebElement registerPageFirstNameInputField;
    @FindBy(xpath = "(//form//label[@class='col-sm-2 control-label'])[3]")
    private WebElement registerPageLastNameSubtitle;
    @FindBy(xpath = "//fieldset[@id='account']//input[@id='input-lastname']")
    private WebElement registerPageLastNameInputField;
    @FindBy(xpath = "(//form//label[@class='col-sm-2 control-label'])[4]")
    private WebElement registerPageEmailSubtitle;
    @FindBy(xpath = "//fieldset[@id='account']//input[@id='input-email']")
    private WebElement registerPageEmailInputField;
    @FindBy(xpath = "(//form//label[@class='col-sm-2 control-label'])[5]")
    private WebElement registerPagePhoneSubtitle;
    @FindBy(xpath = "//fieldset[@id='account']//input[@id='input-telephone']")
    private WebElement registerPagePhoneInputField;
    //password section
    @FindBy(xpath = "//fieldset[2]/legend")
    private WebElement registerPagePasswordSectionTitle;
    @FindBy(xpath = "(//form//label[@class='col-sm-2 control-label'])[6]")
    private WebElement registerPagePasswordSubtitle;
    @FindBy(xpath = "//fieldset[2]//input[@id='input-password']")
    private WebElement registerPagePasswordInputField;
    @FindBy(xpath = "(//form//label[@class='col-sm-2 control-label'])[7]")
    private WebElement registerPageConfirmPasswordSubtitle;
    @FindBy(xpath = "//fieldset[2]//input[@id='input-confirm']")
    private WebElement registerPageConfirmPasswordInputField;
    //newsletter section
    @FindBy(xpath = "//fieldset[3]/legend")
    private WebElement registerPageNewsletterSectionTitle;
    @FindBy(xpath = "(//form//label[@class='col-sm-2 control-label'])[8]")
    private WebElement registerPageNewsletterSubtitle;
    @FindBy(xpath = "//fieldset[3]//input[@value='1']")
    private WebElement registerPageNewsletterSubscribeRadioButton;
    @FindBy(xpath = "//fieldset[3]//input[@value='0']")
    private WebElement registerPageNewsletterDontSubscribeRadioButton;
    @FindBy(xpath = "//div[@class='pull-right']")
    private WebElement registerPagePrivacyPolicySubtext;
    @FindBy(xpath = "//div[@class='pull-right']/a")
    private WebElement registerPagePrivacyPolicyLink;
    @FindBy(xpath = "//div[@class='pull-right']/input[1]")
    private WebElement registerPagePrivacyPolicyCheckbox;
    @FindBy(xpath = "//div[@class='pull-right']/input[2]")
    private WebElement registerPageContinueButton;

    //valid user register data
    private static String userFirstName;
    private static String userLastName;
    private static String userEmail;
    private static String userPassword;
    private String userPhoneNumber;
    private String userConfirmPassword;

    public RegisterPage(WebDriver driver) {super(driver);}

    //valid user register data getter
    public void validUserRegisterDataGetter(){

        userFirstName = TestDataGenerator.getRandomFirstName();
        userLastName = TestDataGenerator.getRandomLastName();
        userEmail = TestDataGenerator.generateRandomEmailAddress(6);
        userPhoneNumber = TestDataGenerator.generatePhoneNumber(8);
        userPassword = TestDataGenerator.generateRandomPassword();
        userConfirmPassword = userPassword;

        System.out.println("Valid user register data generated: " + "\n");
        logger.info("Valid user first name: " + userFirstName);
        logger.info("Valid user last name: " + userLastName);
        logger.info("Valid user email: " + userEmail);
        logger.info("Valid user phone number: " + userPhoneNumber);
        logger.info("Valid user password: " + userPassword);

        System.out.println("\n");
    }

    //valid user data input methods
    public void inputFirstNameIntoFirstNameInputField(){registerPageFirstNameInputField.sendKeys(userFirstName);}
    public void inputLastNameIntoLastNameInputField(){registerPageLastNameInputField.sendKeys(userLastName);}
    public void inputEmailIntoEmailInputField(){registerPageEmailInputField.sendKeys(userEmail);}
    public void inputPhoneIntoPhoneInputField(){registerPagePhoneInputField.sendKeys(userPhoneNumber);}
    public void inputPasswordIntoPasswordInputField(){registerPagePasswordInputField.sendKeys(userPassword);}
    public void inputConfirmPasswordIntoConfirmPasswordInputField(){registerPageConfirmPasswordInputField.sendKeys(userConfirmPassword);}

    //click 'Agree to Privacy Policy' checkbox method
    public void clickAgreeToPrivacyPolicyCheckbox(){registerPagePrivacyPolicyCheckbox.click();}

    //click 'Continue' (register) button
    public void clickRegisterPageContinueButton(){
        Actions actions = new Actions(driver);
        actions.click(registerPageContinueButton).click().perform();
    }

    //valid user login data getters
    public String getUserEmail() {return userEmail;}
    public String getUserPassword() {return userPassword;}

    //name getters
    public String getUserFirstName() {return userFirstName;}
    public String getUserLastName() {return userLastName;}

    //register page text getters
    public String getRegisterPageTitle() {return registerPageTitle.getText();}
    public String getRegisterPageSubtitle() {return registerPageSubtitle.getText();}
    public String getPersonalDetailsSectionTitle(){return registerPagePersonalDetailsSectionTitle.getText();}
    public String getRegisterPageFirstNameSubtitle() {return registerPageFirstNameSubtitle.getText();}
    public String getRegisterPageLastNameSubtitle() {return registerPageLastNameSubtitle.getText();}
    public String getRegisterPageEmailSubtitle() {return registerPageEmailSubtitle.getText();}
    public String getRegisterPagePhoneSubtitle() {return registerPagePhoneSubtitle.getText();}
    public String getPasswordSectionTitle(){return registerPagePasswordSectionTitle.getText();}
    public String getRegisterPagePasswordSubtitle() {return registerPagePasswordSubtitle.getText();}
    public String getRegisterPageConfirmPasswordSubtitle() {return registerPageConfirmPasswordSubtitle.getText();}
    public String getNewsletterSectionTitle(){return registerPageNewsletterSectionTitle.getText();}
    public String getRegisterPageNewsletterSubtitle() {return registerPageNewsletterSubtitle.getText();}
    public String getPrivacyPolicySubtext() {return registerPagePrivacyPolicySubtext.getText();}

    //register page web element assert methods
    public boolean isRegisterPageTitleDisplayed() {return registerPageTitle.isDisplayed();}
    public boolean isRegisterPageSubtitleDisplayed() {return registerPageSubtitle.isDisplayed();}
    public boolean isRegisterPageLoginPageLinkDisplayed() {return registerPageLoginPageLink.isDisplayed();}
    //personal details section
    public boolean isRegisterPagePersonalDetailsSectionTitleDisplayed() {return registerPagePersonalDetailsSectionTitle.isDisplayed();}
    public boolean isRegisterPageFirstNameSubtitleDisplayed() {return registerPageFirstNameSubtitle.isDisplayed();}
    public boolean isRegisterPageFirstNameInputFieldDisplayed() {return registerPageFirstNameInputField.isDisplayed();}
    public boolean isRegisterPageLastNameSubtitleDisplayed() {return registerPageLastNameSubtitle.isDisplayed();}
    public boolean isRegisterPageLastNameInputFieldDisplayed() {return registerPageLastNameInputField.isDisplayed();}
    public boolean isRegisterPageEmailSubtitleDisplayed() {return registerPageEmailSubtitle.isDisplayed();}
    public boolean isRegisterPageEmailInputFieldDisplayed() {return registerPageEmailInputField.isDisplayed();}
    public boolean isRegisterPagePhoneSubtitleDisplayed() {return registerPagePhoneSubtitle.isDisplayed();}
    public boolean isRegisterPagePhoneInputFieldDisplayed() {return registerPagePhoneInputField.isDisplayed();}
    //password section
    public boolean isRegisterPagePasswordSectionTitleDisplayed() {return registerPagePasswordSectionTitle.isDisplayed();}
    public boolean isRegisterPagePasswordSubtitleDisplayed() {return registerPagePasswordSubtitle.isDisplayed();}
    public boolean isRegisterPagePasswordInputFieldDisplayed() {return registerPagePasswordInputField.isDisplayed();}
    public boolean isRegisterPageConfirmPasswordSubtitleDisplayed() {return registerPageConfirmPasswordSubtitle.isDisplayed();}
    public boolean isRegisterPageConfirmPasswordInputFieldDisplayed() {return registerPageConfirmPasswordInputField.isDisplayed();}
    //newsletter section
    public boolean isRegisterPageNewsletterSectionTitleDisplayed() {return registerPageNewsletterSectionTitle.isDisplayed();}
    public boolean isRegisterPageNewsletterSubtitleDisplayed() {return registerPageNewsletterSubtitle.isDisplayed();}
    public boolean isRegisterPageNewsletterSubscribeRadioButtonDisplayed() {return registerPageNewsletterSubscribeRadioButton.isDisplayed();}
    public boolean isRegisterPageNewsletterDontSubscribeRadioButtonDisplayed() {return registerPageNewsletterDontSubscribeRadioButton.isDisplayed();}
    //singular remaining elements
    public boolean isRegisterPagePrivacyPolicySubtextDisplayed() {return registerPagePrivacyPolicySubtext.isDisplayed();}
    public boolean isRegisterPagePrivacyPolicyLinkDisplayed() {return registerPagePrivacyPolicyLink.isDisplayed();}
    public boolean isRegisterPagePrivacyPolicyCheckboxDisplayed() {return registerPagePrivacyPolicyCheckbox.isDisplayed();}
    public boolean isRegisterPageContinueButtonDisplayed() {return registerPageContinueButton.isDisplayed();}

}
