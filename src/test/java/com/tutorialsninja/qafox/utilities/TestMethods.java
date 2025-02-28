package com.tutorialsninja.qafox.utilities;

import com.tutorialsninja.qafox.*;
import org.slf4j.*;
import static org.junit.jupiter.api.Assertions.*;
import org.openqa.selenium.*;
import java.io.File;
import java.nio.file.*;

public class TestMethods extends BaseTest{

    protected static final Logger logger = LoggerFactory.getLogger(TestMethods.class);


    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //user navigation to 'Register' page test method
    protected void userNavigationToRegisterPageTest() {
        GeneralPage generalPage = new GeneralPage(driver);
        HomePage homePage = new HomePage(driver);
        RegisterPage registerPage = new RegisterPage(driver);
        //general page web element assert (elements all pages share)
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert (elements all pages share)
        isGeneralPageTextElementAsExpected(generalPage);
        //home page web element assert
        isHomePageWebElementDisplayed(homePage);
        //home page text element assert
        isHomePageTextElementAsExpected(homePage);
        //log home page featured product data
        logHomePageFeaturedProductData(homePage);
        //capture screenshot of the home page display
        captureScreenshot(driver, "Home Page Display");
        //click account dropdown menu
        generalPage.clickAccountDropdownMenuLink();
        //click 'Register' option
        generalPage.clickRegisterOptionLink();
        //assert the user gets onto 'Register' page
        assertEquals("Register Account", registerPage.getRegisterPageTitle(), "The register page title doesn't match expectations or the user is on the wrong page");
        //capture screenshot of the test result
        captureScreenshot(driver,"User Navigation To Register Page Test Result");
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //valid user account creation test
    protected void validUserAccountCreationTest(RegisterPage registerPage) {
        GeneralPage generalPage = new GeneralPage(driver);
        MyAccountPage myAccountPage = new MyAccountPage(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //register page web element assert
        isRegisterPageWebElementDisplayed(registerPage);
        //register page text element assert
        isRegisterPageTextElementAsExpected(registerPage);
        //capture screenshot before data input
        captureScreenshot(driver, "Register Page Before Valid User Data Input");
        //valid register data getter
        registerPage.validUserRegisterDataGetter();;
        //input valid first name into first name input field
        registerPage.inputFirstNameIntoFirstNameInputField();
        //input valid last name into last name input field
        registerPage.inputLastNameIntoLastNameInputField();
        //input valid email into email input field
        registerPage.inputEmailIntoEmailInputField();
        //input valid phone number into phone input field
        registerPage.inputPhoneIntoPhoneInputField();
        //input valid password into password input field
        registerPage.inputPasswordIntoPasswordInputField();
        //input valid confirm password into confirm password input field
        registerPage.inputConfirmPasswordIntoConfirmPasswordInputField();
        //click 'Agree to Privacy Policy' checkbox
        registerPage.clickAgreeToPrivacyPolicyCheckbox();
        //click 'Continue' button
        registerPage.clickRegisterPageContinueButton();
        //assert user account creation success message matches expectations
        //assertUserAccountCreationMessageMatchesExpectations(registerPage);
        //click 'Continue' button
        myAccountPage.clickContinueButton();
        //my account page web element assert
        isMyAccountPageWebElementDisplayed(myAccountPage);
        //my account page text element assert
        isMyAccountPageTextElementAsExpected(myAccountPage);
        //capture screenshot of the test result
        captureScreenshot(driver, "Valid User Account Creation Test Result");
    }

    //invalid user account creation tests

    //no singular input

    //invalid user account creation test method - no first name
    protected void invalidAccountCreationNoFirstNameTest(RegisterPageNoSingularInput registerPageNoSingularInput) {
        GeneralPage generalPage = new GeneralPage(driver);
        RegisterPage registerPage = new RegisterPage(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //register page web element assert
        isRegisterPageWebElementDisplayed(registerPage);
        //register page text element assert
        isRegisterPageTextElementAsExpected(registerPage);
        //capture screenshot before invalid data input
        captureScreenshot(driver, "Register Page Before Invalid User Data Input");
        //invalid register data getter - no first name
        registerPageNoSingularInput.invalidUserRegDataNoFirstNameGetter();
        //don't input first name into first name input field
        registerPageNoSingularInput.inputNoFirstNameIntoFirstNameInputField();
        //capture screenshot after invalid data input
        captureScreenshot(driver, "Register Page Before Invalid User Data Input - No First Name");
        //input valid last name into last name input field
        registerPageNoSingularInput.inputLastNameIntoLastNameInputField();
        //input valid email into email input field
        registerPageNoSingularInput.inputEmailIntoEmailInputField();
        //input valid phone number into phone input field
        registerPageNoSingularInput.inputPhoneIntoPhoneInputField();
        //input valid password into password input field
        registerPageNoSingularInput.inputPasswordIntoPasswordInputField();
        //input valid confirm password into confirm password input field
        registerPageNoSingularInput.inputConfirmPasswordIntoConfirmPasswordInputField();
        //click 'Agree to Privacy Policy' checkbox
        registerPage.clickAgreeToPrivacyPolicyCheckbox();
        //click 'Continue' button
        registerPage.clickRegisterPageContinueButton();
        //assert the user gets an expected error message
        assertEquals("First Name must be between 1 and 32 characters!", registerPageNoSingularInput.getInvalidSingularInputError(), "The missing first name input error message doesn't match expectations or the error wasn't triggered.");
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Account Creation Test Result - No First Name");
    }

    //invalid user account creation test method - no last name
    protected void invalidAccountCreationNoLastNameTest(RegisterPageNoSingularInput registerPageNoSingularInput) {
        GeneralPage generalPage = new GeneralPage(driver);
        RegisterPage registerPage = new RegisterPage(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //register page web element assert
        isRegisterPageWebElementDisplayed(registerPage);
        //register page text element assert
        isRegisterPageTextElementAsExpected(registerPage);
        //capture screenshot before invalid data input
        captureScreenshot(driver, "Register Page Before Invalid User Data Input");
        //invalid register data getter - no last name
        registerPageNoSingularInput.invalidUserRegDataNoLastNameGetter();
        //input valid first name into first name input field
        registerPageNoSingularInput.inputFirstNameIntoFirstNameInputField();
        //don't input last name into last name input field
        registerPageNoSingularInput.inputNoLastNameIntoLastNameInputField();
        //capture screenshot after invalid data input
        captureScreenshot(driver, "Register Page Before Invalid User Data Input - No Last Name");
        //input valid email into email input field
        registerPageNoSingularInput.inputEmailIntoEmailInputField();
        //input valid phone number into phone input field
        registerPageNoSingularInput.inputPhoneIntoPhoneInputField();
        //input valid password into password input field
        registerPageNoSingularInput.inputPasswordIntoPasswordInputField();
        //input valid confirm password into confirm password input field
        registerPageNoSingularInput.inputConfirmPasswordIntoConfirmPasswordInputField();
        //click 'Agree to Privacy Policy' checkbox
        registerPage.clickAgreeToPrivacyPolicyCheckbox();
        //click 'Continue' button
        registerPage.clickRegisterPageContinueButton();
        //assert the user gets an expected error message
        assertEquals("Last Name must be between 1 and 32 characters!", registerPageNoSingularInput.getInvalidSingularInputError(), "The missing last name input error message doesn't match expectations or the error wasn't triggered.");
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Account Creation Test Result - No Last Name");
    }

    //invalid user account creation test method - no email address
    protected void invalidAccountCreationNoEmailTest(RegisterPageNoSingularInput registerPageNoSingularInput) {
        GeneralPage generalPage = new GeneralPage(driver);
        RegisterPage registerPage = new RegisterPage(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //register page web element assert
        isRegisterPageWebElementDisplayed(registerPage);
        //register page text element assert
        isRegisterPageTextElementAsExpected(registerPage);
        //capture screenshot before invalid data input
        captureScreenshot(driver, "Register Page Before Invalid User Data Input");
        //invalid register data getter - no email address
        registerPageNoSingularInput.invalidUserRegDataNoEmailGetter();
        //input valid first name into first name input field
        registerPageNoSingularInput.inputFirstNameIntoFirstNameInputField();
        //input valid last name into last name input field
        registerPageNoSingularInput.inputLastNameIntoLastNameInputField();
        //don't input email into email input field
        registerPageNoSingularInput.inputNoEmailIntoEmailInputField();
        //capture screenshot after invalid data input
        captureScreenshot(driver, "Register Page Before Invalid User Data Input - No Email Address");
        //input valid phone number into phone input field
        registerPageNoSingularInput.inputPhoneIntoPhoneInputField();
        //input valid password into password input field
        registerPageNoSingularInput.inputPasswordIntoPasswordInputField();
        //input valid confirm password into confirm password input field
        registerPageNoSingularInput.inputConfirmPasswordIntoConfirmPasswordInputField();
        //click 'Agree to Privacy Policy' checkbox
        registerPage.clickAgreeToPrivacyPolicyCheckbox();
        //click 'Continue' button
        registerPage.clickRegisterPageContinueButton();
        //assert the user gets an expected error message
        assertEquals("E-Mail Address does not appear to be valid!", registerPageNoSingularInput.getInvalidSingularInputError(), "The missing email input error message doesn't match expectations or the error wasn't triggered.");
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Account Creation Test Result - No Email Address");
    }

    //invalid user account creation test method - no phone number
    protected void invalidAccountCreationNoPhoneTest(RegisterPageNoSingularInput registerPageNoSingularInput) {
        GeneralPage generalPage = new GeneralPage(driver);
        RegisterPage registerPage = new RegisterPage(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //register page web element assert
        isRegisterPageWebElementDisplayed(registerPage);
        //register page text element assert
        isRegisterPageTextElementAsExpected(registerPage);
        //capture screenshot before invalid data input
        captureScreenshot(driver, "Register Page Before Invalid User Data Input");
        //invalid register data getter - no phone number
        registerPageNoSingularInput.invalidUserRegDataNoPhoneGetter();
        //input valid first name into first name input field
        registerPageNoSingularInput.inputFirstNameIntoFirstNameInputField();
        //input valid last name into last name input field
        registerPageNoSingularInput.inputLastNameIntoLastNameInputField();
        //input valid email into email input field
        registerPageNoSingularInput.inputEmailIntoEmailInputField();
        //don't input phone number into phone input field
        registerPageNoSingularInput.inputNoPhoneIntoPhoneInputField();
        //capture screenshot after invalid data input
        captureScreenshot(driver, "Register Page Before Invalid User Data Input - No Phone Number");
        //input valid password into password input field
        registerPageNoSingularInput.inputPasswordIntoPasswordInputField();
        //input valid confirm password into confirm password input field
        registerPageNoSingularInput.inputConfirmPasswordIntoConfirmPasswordInputField();
        //click 'Agree to Privacy Policy' checkbox
        registerPage.clickAgreeToPrivacyPolicyCheckbox();
        //click 'Continue' button
        registerPage.clickRegisterPageContinueButton();
        //assert the user gets an expected error message
        assertEquals("Telephone must be between 3 and 32 characters!", registerPageNoSingularInput.getInvalidSingularInputError(), "The missing email input error message doesn't match expectations or the error wasn't triggered.");
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Account Creation Test Result - No Phone Number");
    }

    //invalid user account creation test method - no user password
    protected void invalidAccountCreationNoPasswordTest(RegisterPageNoSingularInput registerPageNoSingularInput) {
        GeneralPage generalPage = new GeneralPage(driver);
        RegisterPage registerPage = new RegisterPage(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //register page web element assert
        isRegisterPageWebElementDisplayed(registerPage);
        //register page text element assert
        isRegisterPageTextElementAsExpected(registerPage);
        //capture screenshot before invalid data input
        captureScreenshot(driver, "Register Page Before Invalid User Data Input");
        //invalid register data getter - no password
        registerPageNoSingularInput.invalidUserRegDataNoPasswordGetter();
        //input valid first name into first name input field
        registerPageNoSingularInput.inputFirstNameIntoFirstNameInputField();
        //input valid last name into last name input field
        registerPageNoSingularInput.inputLastNameIntoLastNameInputField();
        //input valid email into email input field
        registerPageNoSingularInput.inputEmailIntoEmailInputField();
        //input valid phone number into phone input field
        registerPageNoSingularInput.inputPhoneIntoPhoneInputField();
        //don't input password into password input field
        registerPageNoSingularInput.inputNoPasswordIntoPasswordInputField();
        //capture screenshot after invalid data input
        captureScreenshot(driver, "Register Page Before Invalid User Data Input - No Password");
        //input valid confirm password into confirm password input field
        registerPageNoSingularInput.inputConfirmPasswordIntoConfirmPasswordInputField();
        //click 'Agree to Privacy Policy' checkbox
        registerPage.clickAgreeToPrivacyPolicyCheckbox();
        //click 'Continue' button
        registerPage.clickRegisterPageContinueButton();
        //assert the user gets an expected error message
        assertEquals("Password must be between 4 and 20 characters!", registerPageNoSingularInput.getInvalidSingularInputError(), "The missing password input error message doesn't match expectations or the error wasn't triggered.");
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Account Creation Test Result - No Password");
    }

    //invalid user account creation test method - no user confirm password
    protected void invalidAccountCreationNoConfirmPasswordTest(RegisterPageNoSingularInput registerPageNoSingularInput) {
        GeneralPage generalPage = new GeneralPage(driver);
        RegisterPage registerPage = new RegisterPage(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //register page web element assert
        isRegisterPageWebElementDisplayed(registerPage);
        //register page text element assert
        isRegisterPageTextElementAsExpected(registerPage);
        //capture screenshot before invalid data input
        captureScreenshot(driver, "Register Page Before Invalid User Data Input");
        //invalid register data getter - no confirm password
        registerPageNoSingularInput.invalidUserRegDataNoConfirmPasswordGetter();
        //input valid first name into first name input field
        registerPageNoSingularInput.inputFirstNameIntoFirstNameInputField();
        //input valid last name into last name input field
        registerPageNoSingularInput.inputLastNameIntoLastNameInputField();
        //input valid email into email input field
        registerPageNoSingularInput.inputEmailIntoEmailInputField();
        //input valid phone number into phone input field
        registerPageNoSingularInput.inputPhoneIntoPhoneInputField();
        //input valid password into password input field
        registerPageNoSingularInput.inputPasswordIntoPasswordInputField();
        //don't input confirm password into password input field
        registerPageNoSingularInput.inputNoConfirmPasswordIntoConfirmPasswordInputField();
        //capture screenshot after invalid data input
        captureScreenshot(driver, "Register Page Before Invalid User Data Input - No Confirm Password");
        //click 'Agree to Privacy Policy' checkbox
        registerPage.clickAgreeToPrivacyPolicyCheckbox();
        //click 'Continue' button
        registerPage.clickRegisterPageContinueButton();
        //assert the user gets an expected error message
        assertEquals("Password confirmation does not match password!", registerPageNoSingularInput.getInvalidSingularInputError(), "The missing confirm password input error message doesn't match expectations or the error wasn't triggered.");
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Account Creation Test Result - No Confirm Password");
    }

    //invalid user account creation test - don't click 'Agree to PrivacyPolicy' checkbox
    protected void invalidUserAccountCreationNoAgreeToPrivacyTest(RegisterPage registerPage) {
        GeneralPage generalPage = new GeneralPage(driver);
        RegisterPageNoSingularInput registerPageNoSingularInput = new RegisterPageNoSingularInput(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //register page web element assert
        isRegisterPageWebElementDisplayed(registerPage);
        //register page text element assert
        isRegisterPageTextElementAsExpected(registerPage);
        //capture screenshot before data input
        captureScreenshot(driver, "Register Page Before Valid User Data Input");
        //valid register data getter
        registerPage.validUserRegisterDataGetter();;
        //input valid first name into first name input field
        registerPage.inputFirstNameIntoFirstNameInputField();
        //input valid last name into last name input field
        registerPage.inputLastNameIntoLastNameInputField();
        //input valid email into email input field
        registerPage.inputEmailIntoEmailInputField();
        //input valid phone number into phone input field
        registerPage.inputPhoneIntoPhoneInputField();
        //input valid password into password input field
        registerPage.inputPasswordIntoPasswordInputField();
        //input valid confirm password into confirm password input field
        registerPage.inputConfirmPasswordIntoConfirmPasswordInputField();
        //click 'Continue' button
        registerPage.clickRegisterPageContinueButton();
        //assert the user gets an expected error message
        assertEquals("Warning: You must agree to the Privacy Policy!", registerPageNoSingularInput.getAgreeToPrivacyPolicyError(), "The error message doesn't match expectations or the error wasn't triggered.");
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Account Creation Test Result - Don't Click 'Agree to Privacy Policy' checkbox.");
    }

    //too short singular input

    //invalid user account creation test method - too short first name (1 char is usually too short)
    protected void invalidAccountCreationTooShortFirstNameTest(RegisterPageTooShortSingularInput registerPageTooShortSingularInput) {
        GeneralPage generalPage = new GeneralPage(driver);
        RegisterPage registerPage = new RegisterPage(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //register page web element assert
        isRegisterPageWebElementDisplayed(registerPage);
        //register page text element assert
        isRegisterPageTextElementAsExpected(registerPage);
        //capture screenshot before invalid data input
        captureScreenshot(driver, "Register Page Before Invalid User Data Input");
        //invalid register data getter - too short first name
        registerPageTooShortSingularInput.invalidUserRegDataTooShortFirstNameGetter();
        //input too short first name into first name input field (1 char)
        registerPageTooShortSingularInput.inputTooShortFirstNameIntoFirstNameInputField();
        //capture screenshot after invalid data input
        captureScreenshot(driver, "Register Page Before Invalid User Data Input - Too Short First Name");
        //input valid last name into last name input field
        registerPageTooShortSingularInput.inputLastNameIntoLastNameInputField();
        //input valid email into email input field
        registerPageTooShortSingularInput.inputEmailIntoEmailInputField();
        //input valid phone number into phone input field
        registerPageTooShortSingularInput.inputPhoneIntoPhoneInputField();
        //input valid password into password input field
        registerPageTooShortSingularInput.inputPasswordIntoPasswordInputField();
        //input valid confirm password into confirm password input field
        registerPageTooShortSingularInput.inputConfirmPasswordIntoConfirmPasswordInputField();
        //click 'Agree to Privacy Policy' checkbox
        registerPage.clickAgreeToPrivacyPolicyCheckbox();
        //click 'Continue' button
        registerPage.clickRegisterPageContinueButton();
        //assert the user gets an expected error message, log the issue if it doesn't appear
        try {
            assertEquals("First Name must be between 1 and 32 characters!", registerPageTooShortSingularInput.getInvalidSingularInputError(), "The too short first name input error message doesn't match expectations.");
        } catch (NoSuchElementException nse) {
            logger.error("The too short first name error doesn't get triggered, the user account gets created");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Account Creation Test Result - Too Short First Name");
    }

    //invalid user account creation test method - too short last name (1 char is usually too short)
    protected void invalidAccountCreationTooShortLastNameTest(RegisterPageTooShortSingularInput registerPageTooShortSingularInput) {
        GeneralPage generalPage = new GeneralPage(driver);
        RegisterPage registerPage = new RegisterPage(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //register page web element assert
        isRegisterPageWebElementDisplayed(registerPage);
        //register page text element assert
        isRegisterPageTextElementAsExpected(registerPage);
        //capture screenshot before invalid data input
        captureScreenshot(driver, "Register Page Before Invalid User Data Input");
        //invalid register data getter - too short last name
        registerPageTooShortSingularInput.invalidUserRegDataTooShortLastNameGetter();
        //input valid first name into first name input field
        registerPageTooShortSingularInput.inputFirstNameIntoFirstNameInputField();
        //input too short last name into last name input field
        registerPageTooShortSingularInput.inputTooShortLastNameIntoLastNameInputField();
        //capture screenshot after invalid data input
        captureScreenshot(driver, "Register Page Before Invalid User Data Input - Too Short Last Name");
        //input valid email into email input field
        registerPageTooShortSingularInput.inputEmailIntoEmailInputField();
        //input valid phone number into phone input field
        registerPageTooShortSingularInput.inputPhoneIntoPhoneInputField();
        //input valid password into password input field
        registerPageTooShortSingularInput.inputPasswordIntoPasswordInputField();
        //input valid confirm password into confirm password input field
        registerPageTooShortSingularInput.inputConfirmPasswordIntoConfirmPasswordInputField();
        //click 'Agree to Privacy Policy' checkbox
        registerPage.clickAgreeToPrivacyPolicyCheckbox();
        //click 'Continue' button
        registerPage.clickRegisterPageContinueButton();
        //assert the user gets an expected error message, log the issue if it doesn't appear
        try {
            assertEquals("Last Name must be between 1 and 32 characters!", registerPageTooShortSingularInput.getInvalidSingularInputError(), "The too short last name input error message doesn't match expectations.");
        } catch (NoSuchElementException nse) {
            logger.error("The too short last name error doesn't get triggered, the user account gets created");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Account Creation Test Result - Too Short Last Name");
    }

    //invalid user account creation test method - too short email (1 char -> name, domain)
    protected void invalidAccountCreationTooShortEmailTest(RegisterPageTooShortSingularInput registerPageTooShortSingularInput) {
        GeneralPage generalPage = new GeneralPage(driver);
        RegisterPage registerPage = new RegisterPage(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //register page web element assert
        isRegisterPageWebElementDisplayed(registerPage);
        //register page text element assert
        isRegisterPageTextElementAsExpected(registerPage);
        //capture screenshot before invalid data input
        captureScreenshot(driver, "Register Page Before Invalid User Data Input");
        //invalid register data getter - too short email
        registerPageTooShortSingularInput.invalidUserRegDataTooShortEmailGetter();
        //input valid first name into first name input field
        registerPageTooShortSingularInput.inputFirstNameIntoFirstNameInputField();
        //input valid last name into last name input field
        registerPageTooShortSingularInput.inputLastNameIntoLastNameInputField();
        //input too short email into email input field (1 char -> name, domain)
        registerPageTooShortSingularInput.inputTooShortEmailIntoEmailInputField();
        //capture screenshot after invalid data input
        captureScreenshot(driver, "Register Page Before Invalid User Data Input - Too Short Email");
        //input valid phone number into phone input field
        registerPageTooShortSingularInput.inputPhoneIntoPhoneInputField();
        //input valid password into password input field
        registerPageTooShortSingularInput.inputPasswordIntoPasswordInputField();
        //input valid confirm password into confirm password input field
        registerPageTooShortSingularInput.inputConfirmPasswordIntoConfirmPasswordInputField();
        //click 'Agree to Privacy Policy' checkbox
        registerPage.clickAgreeToPrivacyPolicyCheckbox();
        //click 'Continue' button
        registerPage.clickRegisterPageContinueButton();
        //assert the user gets an expected error message, log the issue if it doesn't appear
        try {
            assertEquals("E-Mail Address does not appear to be valid!", registerPageTooShortSingularInput.getInvalidSingularInputError(), "The too short email input error message doesn't match expectations.");
        } catch (NoSuchElementException nse) {
            logger.error("The too short email error doesn't get triggered, the user account gets created");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Account Creation Test Result - Too Short Email");
    }

    //invalid user account creation test method - too short phone (2 digits)
    protected void invalidAccountCreationTooShortPhoneTest(RegisterPageTooShortSingularInput registerPageTooShortSingularInput) {
        GeneralPage generalPage = new GeneralPage(driver);
        RegisterPage registerPage = new RegisterPage(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //register page web element assert
        isRegisterPageWebElementDisplayed(registerPage);
        //register page text element assert
        isRegisterPageTextElementAsExpected(registerPage);
        //capture screenshot before invalid data input
        captureScreenshot(driver, "Register Page Before Invalid User Data Input");
        //invalid register data getter - too short phone (2 digits)
        registerPageTooShortSingularInput.invalidUserRegDataTooShortPhoneGetter();
        //input valid first name into first name input field
        registerPageTooShortSingularInput.inputFirstNameIntoFirstNameInputField();
        //input valid last name into last name input field
        registerPageTooShortSingularInput.inputLastNameIntoLastNameInputField();
        //input valid email into email input field
        registerPageTooShortSingularInput.inputEmailIntoEmailInputField();
        //input too short phone number into phone input field (2 digits)
        registerPageTooShortSingularInput.inputTooShortPhoneIntoPhoneInputField();
        //capture screenshot after invalid data input
        captureScreenshot(driver, "Register Page Before Invalid User Data Input - Too Short Phone");
        //input valid password into password input field
        registerPageTooShortSingularInput.inputPasswordIntoPasswordInputField();
        //input valid confirm password into confirm password input field
        registerPageTooShortSingularInput.inputConfirmPasswordIntoConfirmPasswordInputField();
        //click 'Agree to Privacy Policy' checkbox
        registerPage.clickAgreeToPrivacyPolicyCheckbox();
        //click 'Continue' button
        registerPage.clickRegisterPageContinueButton();
        //assert the user gets an expected error message, log the issue if it doesn't appear
        try {
            assertEquals("Telephone must be between 3 and 32 characters!", registerPageTooShortSingularInput.getInvalidSingularInputError(), "The too short phone number input error message doesn't match expectations.");
        } catch (NoSuchElementException nse) {
            logger.error("The too short phone number doesn't get triggered, the user account gets created");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Account Creation Test Result - Too Short Phone");
    }

    //invalid user account creation test method - too short phone (3 chars)
    protected void invalidAccountCreationTooShortPasswordTest(RegisterPageTooShortSingularInput registerPageTooShortSingularInput) {
        GeneralPage generalPage = new GeneralPage(driver);
        RegisterPage registerPage = new RegisterPage(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //register page web element assert
        isRegisterPageWebElementDisplayed(registerPage);
        //register page text element assert
        isRegisterPageTextElementAsExpected(registerPage);
        //capture screenshot before invalid data input
        captureScreenshot(driver, "Register Page Before Invalid User Data Input");
        //invalid register data getter - too short password (3 chars)
        registerPageTooShortSingularInput.invalidUserRegDataTooShortPasswordGetter();
        //input valid first name into first name input field
        registerPageTooShortSingularInput.inputFirstNameIntoFirstNameInputField();
        //input valid last name into last name input field
        registerPageTooShortSingularInput.inputLastNameIntoLastNameInputField();
        //input valid email into email input field
        registerPageTooShortSingularInput.inputEmailIntoEmailInputField();
        //input valid phone number into phone input field
        registerPageTooShortSingularInput.inputPhoneIntoPhoneInputField();
        //input too short password into password input field (3 chars)
        registerPageTooShortSingularInput.inputTooShortPasswordIntoPasswordInputField();
        //capture screenshot after invalid data input
        captureScreenshot(driver, "Register Page Before Invalid User Data Input - Too Short Password");
        //input matching confirm password into confirm password input field
        registerPageTooShortSingularInput.inputTooShortConfirmPasswordIntoConfirmPasswordInputField();
        //click 'Agree to Privacy Policy' checkbox
        registerPage.clickAgreeToPrivacyPolicyCheckbox();
        //click 'Continue' button
        registerPage.clickRegisterPageContinueButton();
        //assert the user gets an expected error message, log the issue if it doesn't appear
        try {
            assertEquals("Password must be between 4 and 20 characters!", registerPageTooShortSingularInput.getInvalidSingularInputError(), "The too short password input error message doesn't match expectations.");
        } catch (NoSuchElementException nse) {
            logger.error("The too short password error doesn't get triggered, the user account gets created");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Account Creation Test Result - Too Short Password");
    }

    //too long singular input

    //invalid user account creation test method - too long first name (33 chars)
    protected void invalidAccountCreationTooLongFirstNameTest(RegisterPageTooLongSingularInput registerPageTooLongSingularInput) {
        GeneralPage generalPage = new GeneralPage(driver);
        RegisterPage registerPage = new RegisterPage(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //register page web element assert
        isRegisterPageWebElementDisplayed(registerPage);
        //register page text element assert
        isRegisterPageTextElementAsExpected(registerPage);
        //capture screenshot before invalid data input
        captureScreenshot(driver, "Register Page Before Invalid User Data Input");
        //invalid register data getter - too long first name
        registerPageTooLongSingularInput.invalidUserRegDataTooLongFirstNameGetter();
        //input too short first name into first name input field (33 chars)
        registerPageTooLongSingularInput.inputTooLongFirstNameIntoFirstNameInputField();
        //capture screenshot after invalid data input
        captureScreenshot(driver, "Register Page Before Invalid User Data Input - Too Long First Name");
        //input valid last name into last name input field
        registerPageTooLongSingularInput.inputLastNameIntoLastNameInputField();
        //input valid email into email input field
        registerPageTooLongSingularInput.inputEmailIntoEmailInputField();
        //input valid phone number into phone input field
        registerPageTooLongSingularInput.inputPhoneIntoPhoneInputField();
        //input valid password into password input field
        registerPageTooLongSingularInput.inputPasswordIntoPasswordInputField();
        //input valid confirm password into confirm password input field
        registerPageTooLongSingularInput.inputConfirmPasswordIntoConfirmPasswordInputField();
        //click 'Agree to Privacy Policy' checkbox
        registerPage.clickAgreeToPrivacyPolicyCheckbox();
        //click 'Continue' button
        registerPage.clickRegisterPageContinueButton();
        //assert the user gets an expected error message, log the issue if it doesn't appear
        try {
            assertEquals("First Name must be between 1 and 32 characters!", registerPageTooLongSingularInput.getInvalidSingularInputError(), "The too long first name input error message doesn't match expectations.");
        } catch (NoSuchElementException nse) {
            logger.error("The too long first name error doesn't get triggered, the user account gets created");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Account Creation Test Result - Too Long First Name");
    }

    //invalid user account creation test method - too long last name (33 chars)
    protected void invalidAccountCreationTooLongLastNameTest(RegisterPageTooLongSingularInput registerPageTooLongSingularInput) {
        GeneralPage generalPage = new GeneralPage(driver);
        RegisterPage registerPage = new RegisterPage(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //register page web element assert
        isRegisterPageWebElementDisplayed(registerPage);
        //register page text element assert
        isRegisterPageTextElementAsExpected(registerPage);
        //capture screenshot before invalid data input
        captureScreenshot(driver, "Register Page Before Invalid User Data Input");
        //invalid register data getter - too long last name
        registerPageTooLongSingularInput.invalidUserRegDataTooLongLastNameGetter();
        //input valid first name into first name input field
        registerPageTooLongSingularInput.inputFirstNameIntoFirstNameInputField();
        //input too long last name into last name input field (33 chars)
        registerPageTooLongSingularInput.inputTooLongLastNameIntoLastNameInputField();
        //capture screenshot after invalid data input
        captureScreenshot(driver, "Register Page Before Invalid User Data Input - Too Long Last Name");
        //input valid email into email input field
        registerPageTooLongSingularInput.inputEmailIntoEmailInputField();
        //input valid phone number into phone input field
        registerPageTooLongSingularInput.inputPhoneIntoPhoneInputField();
        //input valid password into password input field
        registerPageTooLongSingularInput.inputPasswordIntoPasswordInputField();
        //input valid confirm password into confirm password input field
        registerPageTooLongSingularInput.inputConfirmPasswordIntoConfirmPasswordInputField();
        //click 'Agree to Privacy Policy' checkbox
        registerPage.clickAgreeToPrivacyPolicyCheckbox();
        //click 'Continue' button
        registerPage.clickRegisterPageContinueButton();
        //assert the user gets an expected error message, log the issue if it doesn't appear
        try {
            assertEquals("Last Name must be between 1 and 32 characters!", registerPageTooLongSingularInput.getInvalidSingularInputError(), "The too long last name input error message doesn't match expectations.");
        } catch (NoSuchElementException nse) {
            logger.error("The too long last name error doesn't get triggered, the user account gets created");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Account Creation Test Result - Too Long Last Name");
    }

    //invalid user account creation test method - too long email address (100 chars -> name, domain) (the error doesn't get triggered but the account creation has been aborted - test has passed)
    protected void invalidAccountCreationTooLongEmailTest(RegisterPageTooLongSingularInput registerPageTooLongSingularInput) {
        GeneralPage generalPage = new GeneralPage(driver);
        RegisterPage registerPage = new RegisterPage(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //register page web element assert
        isRegisterPageWebElementDisplayed(registerPage);
        //register page text element assert
        isRegisterPageTextElementAsExpected(registerPage);
        //capture screenshot before invalid data input
        captureScreenshot(driver, "Register Page Before Invalid User Data Input");
        //invalid register data getter - too long email
        registerPageTooLongSingularInput.invalidUserRegDataTooLongEmailGetter();
        //input valid first name into first name input field
        registerPageTooLongSingularInput.inputFirstNameIntoFirstNameInputField();
        //input valid last name into last name input field
        registerPageTooLongSingularInput.inputLastNameIntoLastNameInputField();
        //input too long email into email input field (100 chars -> name, domain)
        registerPageTooLongSingularInput.inputTooLongEmailIntoEmailInputField();
        //capture screenshot after invalid data input
        captureScreenshot(driver, "Register Page Before Invalid User Data Input - Too Long Email");
        //input valid phone number into phone input field
        registerPageTooLongSingularInput.inputPhoneIntoPhoneInputField();
        //input valid password into password input field
        registerPageTooLongSingularInput.inputPasswordIntoPasswordInputField();
        //input valid confirm password into confirm password input field
        registerPageTooLongSingularInput.inputConfirmPasswordIntoConfirmPasswordInputField();
        //click 'Agree to Privacy Policy' checkbox
        registerPage.clickAgreeToPrivacyPolicyCheckbox();
        //click 'Continue' button
        registerPage.clickRegisterPageContinueButton();
        //assert the user gets an expected error message, log the issue if it doesn't appear
        try {
            assertEquals("E-Mail Address does not appear to be valid!", registerPageTooLongSingularInput.getInvalidSingularInputError(), "The too long email input error message doesn't match expectations.");
        } catch (NoSuchElementException nse) {
            logger.warn("The too long email error doesn't get triggered, however, the user account gets created");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Account Creation Test Result - Too Long Email");
    }

    //invalid user account creation test method - too long phone number (33 digits)
    protected void invalidAccountCreationTooLongPhoneTest(RegisterPageTooLongSingularInput registerPageTooLongSingularInput) {
        GeneralPage generalPage = new GeneralPage(driver);
        RegisterPage registerPage = new RegisterPage(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //register page web element assert
        isRegisterPageWebElementDisplayed(registerPage);
        //register page text element assert
        isRegisterPageTextElementAsExpected(registerPage);
        //capture screenshot before invalid data input
        captureScreenshot(driver, "Register Page Before Invalid User Data Input");
        //invalid register data getter - too long phone number
        registerPageTooLongSingularInput.invalidUserRegDataTooLongPhoneGetter();
        //input valid first name into first name input field
        registerPageTooLongSingularInput.inputFirstNameIntoFirstNameInputField();
        //input valid last name into last name input field
        registerPageTooLongSingularInput.inputLastNameIntoLastNameInputField();
        //input valid email into email input field
        registerPageTooLongSingularInput.inputEmailIntoEmailInputField();
        //input too long phone number into phone input field (33 digits)
        registerPageTooLongSingularInput.inputTooLongPhoneIntoPhoneInputField();
        //capture screenshot after invalid data input
        captureScreenshot(driver, "Register Page Before Invalid User Data Input - Too Long Phone");
        //input valid password into password input field
        registerPageTooLongSingularInput.inputPasswordIntoPasswordInputField();
        //input valid confirm password into confirm password input field
        registerPageTooLongSingularInput.inputConfirmPasswordIntoConfirmPasswordInputField();
        //click 'Agree to Privacy Policy' checkbox
        registerPage.clickAgreeToPrivacyPolicyCheckbox();
        //click 'Continue' button
        registerPage.clickRegisterPageContinueButton();
        //assert the user gets an expected error message, log the issue if it doesn't appear
        try {
            assertEquals("Telephone must be between 3 and 32 characters!", registerPageTooLongSingularInput.getInvalidSingularInputError(), "The too long phone input error message doesn't match expectations.");
        } catch (NoSuchElementException nse) {
            logger.error("The too long phone error doesn't get triggered, the user account gets created");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Account Creation Test Result - Too Long Phone");
    }

    //invalid user account creation test method - too long password (21 chars) (the user account gets created above upper boundary limit - test has failed)
    protected void invalidAccountCreationTooLongPasswordTest(RegisterPageTooLongSingularInput registerPageTooLongSingularInput) {
        GeneralPage generalPage = new GeneralPage(driver);
        RegisterPage registerPage = new RegisterPage(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //register page web element assert
        isRegisterPageWebElementDisplayed(registerPage);
        //register page text element assert
        isRegisterPageTextElementAsExpected(registerPage);
        //capture screenshot before invalid data input
        captureScreenshot(driver, "Register Page Before Invalid User Data Input");
        //invalid register data getter - too long password (21 chars)
        registerPageTooLongSingularInput.invalidUserRegDataTooLongPasswordGetter();
        //input valid first name into first name input field
        registerPageTooLongSingularInput.inputFirstNameIntoFirstNameInputField();
        //input valid last name into last name input field
        registerPageTooLongSingularInput.inputLastNameIntoLastNameInputField();
        //input valid email into email input field
        registerPageTooLongSingularInput.inputEmailIntoEmailInputField();
        //input valid phone number into phone input field
        registerPageTooLongSingularInput.inputPhoneIntoPhoneInputField();
        //input too long password into password input field (21 chars)
        registerPageTooLongSingularInput.inputTooLongPasswordIntoPasswordInputField();
        //capture screenshot after invalid data input
        captureScreenshot(driver, "Register Page Before Invalid User Data Input - Too Long Password");
        //input matching confirm password into confirm password input field
        registerPageTooLongSingularInput.inputTooLongConfirmPasswordIntoConfirmPasswordInputField();
        //click 'Agree to Privacy Policy' checkbox
        registerPage.clickAgreeToPrivacyPolicyCheckbox();
        //click 'Continue' button
        registerPage.clickRegisterPageContinueButton();
        //assert the user gets an expected error message, log the issue if it doesn't appear
        try {
            assertEquals("Password must be between 4 and 20 characters!", registerPageTooLongSingularInput.getInvalidSingularInputError(), "The too long password input error message doesn't match expectations.");
        } catch (NoSuchElementException nse) {
            logger.error("The too long password error doesn't get triggered, the user account gets created");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Account Creation Test Result - Too Long Password");
    }

    //invalid singular input format

    //invalid user account creation test method - invalid first name input format (special symbols and digits) (user account gets created, test has failed)
    protected void invalidAccountCreationInvalidFirstNameFormatTest(RegisterPageInvalidSingularInputFormat registerPageInvalidSingularInputFormat) {
        GeneralPage generalPage = new GeneralPage(driver);
        RegisterPage registerPage = new RegisterPage(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //register page web element assert
        isRegisterPageWebElementDisplayed(registerPage);
        //register page text element assert
        isRegisterPageTextElementAsExpected(registerPage);
        //capture screenshot before invalid data input
        captureScreenshot(driver, "Register Page Before Invalid User Data Input");
        //invalid register data getter - invalid first name input format (special symbols and digits)
        registerPageInvalidSingularInputFormat.invalidUserRegDataInvalidFirstNameFormatGetter();
        //input invalid first name format into first name input field (special symbols and digits)
        registerPageInvalidSingularInputFormat.inputInvalidFirstNameFormatIntoFirstNameInputField();
        //capture screenshot after invalid data input
        captureScreenshot(driver, "Register Page Before Invalid User Data Input - Invalid First Name Input Format");
        //input valid last name into last name input field
        registerPageInvalidSingularInputFormat.inputLastNameIntoLastNameInputField();
        //input valid email into email input field
        registerPageInvalidSingularInputFormat.inputEmailIntoEmailInputField();
        //input valid phone number into phone input field
        registerPageInvalidSingularInputFormat.inputPhoneIntoPhoneInputField();
        //input valid password into password input field
        registerPageInvalidSingularInputFormat.inputPasswordIntoPasswordInputField();
        //input valid confirm password into confirm password input field
        registerPageInvalidSingularInputFormat.inputConfirmPasswordIntoConfirmPasswordInputField();
        //click 'Agree to Privacy Policy' checkbox
        registerPage.clickAgreeToPrivacyPolicyCheckbox();
        //click 'Continue' button
        registerPage.clickRegisterPageContinueButton();
        //assert the user gets an expected error message, log the issue if it doesn't appear
        try {
            assertEquals("First Name cannon consist of special symbols and digits only!", registerPageInvalidSingularInputFormat.getInvalidSingularInputError(), "The invalid first name input format error message doesn't match expectations.");
        } catch (NoSuchElementException nse) {
            logger.error("The invalid first name input format error doesn't get triggered, the user account gets created");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Account Creation Test Result - Invalid First Name Input Format");
    }

    //invalid user account creation test method - invalid last name input format (special symbols and digits) (user account gets created, test has failed)
    protected void invalidAccountCreationInvalidLastNameFormatTest(RegisterPageInvalidSingularInputFormat registerPageInvalidSingularInputFormat) {
        GeneralPage generalPage = new GeneralPage(driver);
        RegisterPage registerPage = new RegisterPage(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //register page web element assert
        isRegisterPageWebElementDisplayed(registerPage);
        //register page text element assert
        isRegisterPageTextElementAsExpected(registerPage);
        //capture screenshot before invalid data input
        captureScreenshot(driver, "Register Page Before Invalid User Data Input");
        //invalid register data getter - invalid last name input format (special symbols and digits)
        registerPageInvalidSingularInputFormat.invalidUserRegDataInvalidLastNameFormatGetter();
        //input valid first name into first name input field
        registerPageInvalidSingularInputFormat.inputFirstNameIntoFirstNameInputField();
        //input invalid last name format into last name input field (special symbols and digits)
        registerPageInvalidSingularInputFormat.inputInvalidLastNameFormatIntoLastNameInputField();
        //capture screenshot after invalid data input
        captureScreenshot(driver, "Register Page Before Invalid User Data Input - Invalid Last Name Input Format");
        //input valid email into email input field
        registerPageInvalidSingularInputFormat.inputEmailIntoEmailInputField();
        //input valid phone number into phone input field
        registerPageInvalidSingularInputFormat.inputPhoneIntoPhoneInputField();
        //input valid password into password input field
        registerPageInvalidSingularInputFormat.inputPasswordIntoPasswordInputField();
        //input valid confirm password into confirm password input field
        registerPageInvalidSingularInputFormat.inputConfirmPasswordIntoConfirmPasswordInputField();
        //click 'Agree to Privacy Policy' checkbox
        registerPage.clickAgreeToPrivacyPolicyCheckbox();
        //click 'Continue' button
        registerPage.clickRegisterPageContinueButton();
        //assert the user gets an expected error message, log the issue if it doesn't appear
        try {
            assertEquals("Last Name cannon consist of special symbols and digits only!", registerPageInvalidSingularInputFormat.getInvalidSingularInputError(), "The invalid last name input format error message doesn't match expectations.");
        } catch (NoSuchElementException nse) {
            logger.error("The invalid last name input format error doesn't get triggered, the user account gets created");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Account Creation Test Result - Invalid Last Name Input Format");
    }

    //invalid user account creation test method - invalid last name input format (missing '@') (the error hasn't been triggered, however, user account creation has aborted, test has passed)
    protected void invalidAccountCreationInvalidEmailFormatTest(RegisterPageInvalidSingularInputFormat registerPageInvalidSingularInputFormat) {
        GeneralPage generalPage = new GeneralPage(driver);
        RegisterPage registerPage = new RegisterPage(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //register page web element assert
        isRegisterPageWebElementDisplayed(registerPage);
        //register page text element assert
        isRegisterPageTextElementAsExpected(registerPage);
        //capture screenshot before invalid data input
        captureScreenshot(driver, "Register Page Before Invalid User Data Input");
        //invalid register data getter - invalid email input format (missing '@')
        registerPageInvalidSingularInputFormat.invalidUserRegDataInvalidEmailFormatGetter();
        //input valid first name into first name input field
        registerPageInvalidSingularInputFormat.inputFirstNameIntoFirstNameInputField();
        //input valid last name into last name input field
        registerPageInvalidSingularInputFormat.inputLastNameIntoLastNameInputField();
        //input invalid email format into email input field (missing '@')
        registerPageInvalidSingularInputFormat.inputInvalidEmailFormatIntoEmailInputField();
        //capture screenshot after invalid data input
        captureScreenshot(driver, "Register Page Before Invalid User Data Input - Invalid Email Input Format");
        //input valid phone number into phone input field
        registerPageInvalidSingularInputFormat.inputPhoneIntoPhoneInputField();
        //input valid password into password input field
        registerPageInvalidSingularInputFormat.inputPasswordIntoPasswordInputField();
        //input valid confirm password into confirm password input field
        registerPageInvalidSingularInputFormat.inputConfirmPasswordIntoConfirmPasswordInputField();
        //click 'Agree to Privacy Policy' checkbox
        registerPage.clickAgreeToPrivacyPolicyCheckbox();
        //click 'Continue' button
        registerPage.clickRegisterPageContinueButton();
        //assert the user gets an expected error message, log the issue if it doesn't appear
        try {
            assertEquals("E-Mail Address does not appear to be valid!", registerPageInvalidSingularInputFormat.getInvalidSingularInputError(), "The invalid email input format error message doesn't match expectations.");
        } catch (NoSuchElementException nse) {
            logger.error("The invalid email input format error doesn't get triggered, however, the user account creation gets aborted");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Account Creation Test Result - Invalid Email Input Format");
    }

    //invalid user account creation test method - existing email (used beforehand)
    protected void invalidAccountCreationExistingEmailTest(RegisterPage registerPage) {
        GeneralPage generalPage = new GeneralPage(driver);
        MyAccountPage myAccountPage = new MyAccountPage(driver);
        RegisterPageInvalidSingularInputFormat registerPageInvalidSingularInputFormat = new RegisterPageInvalidSingularInputFormat(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //register page web element assert
        isRegisterPageWebElementDisplayed(registerPage);
        //register page text element assert
        isRegisterPageTextElementAsExpected(registerPage);
        //capture screenshot before data input
        captureScreenshot(driver, "Register Page Before Valid User Data Input");
        //valid register data getter
        registerPage.validUserRegisterDataGetter();;
        //input valid first name into first name input field
        registerPage.inputFirstNameIntoFirstNameInputField();
        //input valid last name into last name input field
        registerPage.inputLastNameIntoLastNameInputField();
        //input valid email into email input field
        registerPage.inputEmailIntoEmailInputField();
        //input valid phone number into phone input field
        registerPage.inputPhoneIntoPhoneInputField();
        //input valid password into password input field
        registerPage.inputPasswordIntoPasswordInputField();
        //input valid confirm password into confirm password input field
        registerPage.inputConfirmPasswordIntoConfirmPasswordInputField();
        //click 'Agree to Privacy Policy' checkbox
        registerPage.clickAgreeToPrivacyPolicyCheckbox();
        //click 'Continue' button
        registerPage.clickRegisterPageContinueButton();
        //click 'Continue' button
        myAccountPage.clickContinueButton();
        //my account page web element assert
        isMyAccountPageWebElementDisplayed(myAccountPage);
        //my account page text element assert
        isMyAccountPageTextElementAsExpected(myAccountPage);
        //click 'Logout' link
        myAccountPage.clickLogoutLink();
        //click 'Continue' button
        myAccountPage.clickContinueButton();
        //second account creation loop
        //click account dropdown menu
        generalPage.clickAccountDropdownMenuLink();
        //click 'Register' option
        generalPage.clickRegisterOptionLink();
        //invalid register data getter - existing email (used beforehand in manual testing)
        registerPageInvalidSingularInputFormat.invalidUserRegDataExistingEmailFormatGetter();
        //input valid first name into first name input field
        registerPageInvalidSingularInputFormat.inputFirstNameIntoFirstNameInputField();
        //input valid last name into last name input field
        registerPageInvalidSingularInputFormat.inputLastNameIntoLastNameInputField();
        //input existing email into email input field (used beforehand in manual testing)
        registerPageInvalidSingularInputFormat.inputExistingEmailIntoEmailInputField();
        //capture screenshot after invalid data input
        captureScreenshot(driver, "Register Page Before Invalid User Data Input - Existing Email");
        //input valid phone number into phone input field
        registerPageInvalidSingularInputFormat.inputPhoneIntoPhoneInputField();
        //input valid password into password input field
        registerPageInvalidSingularInputFormat.inputPasswordIntoPasswordInputField();
        //input valid confirm password into confirm password input field
        registerPageInvalidSingularInputFormat.inputConfirmPasswordIntoConfirmPasswordInputField();
        //click 'Agree to Privacy Policy' checkbox
        registerPage.clickAgreeToPrivacyPolicyCheckbox();
        //click 'Continue' button
        registerPage.clickRegisterPageContinueButton();
        //assert the user gets an expected error message, log the issue if it doesn't appear
        try {
            assertEquals("Warning: E-Mail Address is already registered!", registerPageInvalidSingularInputFormat.getExistingEmailError(), "The existing email input error message doesn't match expectations.");
        } catch (NoSuchElementException nse) {
            logger.error("The existing email input error doesn't get triggered.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Account Creation Test Result - Invalid Email Input Format");
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //user logout test method
    protected void userLogOutTest() {
        GeneralPage generalPage = new GeneralPage(driver);
        MyAccountPage myAccountPage = new MyAccountPage(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //my account page web element assert
        isMyAccountPageWebElementDisplayed(myAccountPage);
        //my account page text element assert
        isMyAccountPageTextElementAsExpected(myAccountPage);
        //click 'Logout' link
        myAccountPage.clickLogoutLink();
        //assert the user gets the expected logout success message elements
        assertLogoutSuccessMessageMatchesExpectations(myAccountPage);
        //click 'Continue' button
        myAccountPage.clickContinueButton();
        //capture screenshot of the test result
        captureScreenshot(driver, "User Log Out Test Result");
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //valid user login tests

    //valid user login test method
    protected void validUserLoginTest(RegisterPage registerPage) {
        GeneralPage generalPage = new GeneralPage(driver);
        HomePage homePage = new HomePage(driver);
        RegisterLoginDashboardPage registerLoginDashboardPage = new RegisterLoginDashboardPage(driver);
        MyAccountPage myAccountPage = new MyAccountPage(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //home page web element assert
        isHomePageWebElementDisplayed(homePage);
        //home page text element assert
        isHomePageTextElementAsExpected(homePage);
        //click 'Logout' link
        myAccountPage.clickLogoutLink();
        //assert the user gets the expected logout success message elements
        assertLogoutSuccessMessageMatchesExpectations(myAccountPage);
        //click 'Continue' button
        myAccountPage.clickContinueButton();
        //click account dropdown menu
        generalPage.clickAccountDropdownMenuLink();
        //click 'Login' option link
        generalPage.clickLoginOptionLink();
        //capture screenshot of the page before valid user login data input
        captureScreenshot(driver, "Register and Login Dashboard Page Display Before Valid User Login Data Input");
        //register/login dashboard page web element assert
        isRegisterLoginDashboardPageWebElementDisplayed(registerLoginDashboardPage);
        //register/login dashboard page text element assert
        isRegisterLoginDashboardPageTextElementAsExpected(registerLoginDashboardPage);
        //valid user login data getter
        registerLoginDashboardPage.validUserLoginDataGetter(registerPage);
        //input valid user login email into email input field
        registerLoginDashboardPage.inputValidUserLoginEmailIntoEmailInputField();
        //input valid user login password into password input field
        registerLoginDashboardPage.inputValidUserLoginPasswordIntoPasswordInputField();
        //capture screenshot of the valid user login data input
        captureScreenshot(driver, "Register and Login Dashboard Page Valid User Login Data Input");
        //click 'Login' button
        registerLoginDashboardPage.clickLoginButton();
        //capture screenshot of the test data result
        captureScreenshot(driver, "Valid User Login Test Result");
    }

    //valid user login test method (with updated email)
    protected void validUserLoginUpdatedEmailTest(RegisterPage registerPage) {
        GeneralPage generalPage = new GeneralPage(driver);
        MyAccountPage myAccountPage = new MyAccountPage(driver);
        EditAccountInformationPage editAccountInformationPage = new EditAccountInformationPage(driver);
        RegisterLoginDashboardPage registerLoginDashboardPage = new RegisterLoginDashboardPage(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //click 'Edit account information' link
        myAccountPage.clickEditAccountInfoLink();
        //edit account information page web element assert
        isEditAccountInfoPageWebElementDisplayed(editAccountInformationPage);
        //edit account information page text element assert
        isEditAccountInfoPageTextElementAsExpected(editAccountInformationPage);
        //capture screenshot before edited data input
        captureScreenshot(driver, "Edit Account Information Page Before Edited Last Name Input");
        //valid edited email getter
        editAccountInformationPage.validUserEditedEmailGetter();
        //input edited email
        editAccountInformationPage.inputEditedEmailIntoEmailInputField();
        //capture screenshot before edited data input
        captureScreenshot(driver, "Edit Account Information Page After Edited Email Input");
        //click 'Continue' button
        editAccountInformationPage.clickEditInfoContinueButton();
        //click 'Logout' link
        myAccountPage.clickLogoutLink();
        //click 'Continue' button
        myAccountPage.clickContinueButton();
        //click account dropdown menu
        generalPage.clickAccountDropdownMenuLink();
        //click 'Logout' option link
        generalPage.clickLoginOptionLink();
        //capture screenshot of the page before valid user login data input
        captureScreenshot(driver, "Register and Login Dashboard Page Display Before Valid Updated User Login Data Input");
        //register/login dashboard page web element assert
        isRegisterLoginDashboardPageWebElementDisplayed(registerLoginDashboardPage);
        //register/login dashboard page text element assert
        isRegisterLoginDashboardPageTextElementAsExpected(registerLoginDashboardPage);
        //valid user login data getter (with updated user email)
        registerLoginDashboardPage.validUserLoginUpdatedEmailGetter(registerPage);
        //input valid updated user login email into email input field
        registerLoginDashboardPage.inputUpdatedLoginEmailIntoEmailInputField();
        //input valid user login password into password input field
        registerLoginDashboardPage.inputValidUserLoginPasswordIntoPasswordInputField();
        //capture screenshot of the valid user login data input
        captureScreenshot(driver, "Register and Login Dashboard Page Valid User Login Data Input - With Updated Email");
        //click 'Login' button
        registerLoginDashboardPage.clickLoginButton();
        //capture screenshot of the test data result
        captureScreenshot(driver, "Valid User Login Test Result (with updated email)");
    }

    //invalid login tests

    //no singular input

    //invalid user login test method - no login email
    protected void invalidUserLoginNoEmailTest(RegisterPage registerPage) {
        GeneralPage generalPage = new GeneralPage(driver);
        HomePage homePage = new HomePage(driver);
        RegisterLoginDashboardPage registerLoginDashboardPage = new RegisterLoginDashboardPage(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //home page web element assert
        isHomePageWebElementDisplayed(homePage);
        //home page text element assert
        isHomePageTextElementAsExpected(homePage);
        //click account dropdown menu
        generalPage.clickAccountDropdownMenuLink();
        //click 'Login' option link
        generalPage.clickLoginOptionLink();
        //capture screenshot of the page before invalid user login data input
        captureScreenshot(driver, "Register and Login Dashboard Page Display Before Invalid User Login Data Input");
        //register/login dashboard page web element assert
        isRegisterLoginDashboardPageWebElementDisplayed(registerLoginDashboardPage);
        //register/login dashboard page text element assert
        isRegisterLoginDashboardPageTextElementAsExpected(registerLoginDashboardPage);
        //invalid user login data getter - no login email
        registerLoginDashboardPage.invalidUserLoginNoEmailGetter(registerPage);
        //don't input login email into email input field
        registerLoginDashboardPage.inputNoLoginEmailIntoEmailInputField();
        //capture screenshot of the invalid user login data input
        captureScreenshot(driver, "Register and Login Dashboard Page Invalid User Login Data Input - No Login Email");
        //input valid user login password into password input field
        registerLoginDashboardPage.inputValidUserLoginPasswordIntoPasswordInputField();
        //click 'Login' button
        registerLoginDashboardPage.clickLoginButton();
        //assert the user gets the expected error message
        assertEquals("Warning: No match for E-Mail Address and/or Password.", registerLoginDashboardPage.getLoginSingularInputError(), "The missing login email input error message doesn't match expectations or the error hasn't been triggered.");
        //capture screenshot of the test data result
        captureScreenshot(driver, "Invalid User Login Test Result - No Login Email");
    }

    //invalid user login test method - no login password
    protected void invalidUserLoginNoPaaswordTest(RegisterPage registerPage) {
        GeneralPage generalPage = new GeneralPage(driver);
        HomePage homePage = new HomePage(driver);
        RegisterLoginDashboardPage registerLoginDashboardPage = new RegisterLoginDashboardPage(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //home page web element assert
        isHomePageWebElementDisplayed(homePage);
        //home page text element assert
        isHomePageTextElementAsExpected(homePage);
        //click account dropdown menu
        generalPage.clickAccountDropdownMenuLink();
        //click 'Login' option link
        generalPage.clickLoginOptionLink();
        //capture screenshot of the page before invalid user login data input
        captureScreenshot(driver, "Register and Login Dashboard Page Display Before Invalid User Login Data Input");
        //register/login dashboard page web element assert
        isRegisterLoginDashboardPageWebElementDisplayed(registerLoginDashboardPage);
        //register/login dashboard page text element assert
        isRegisterLoginDashboardPageTextElementAsExpected(registerLoginDashboardPage);
        //invalid user login data getter - no login password
        registerLoginDashboardPage.invalidUserLoginNoPasswordGetter(registerPage);
        //input valid login email into email input field
        registerLoginDashboardPage.inputValidUserLoginEmailIntoEmailInputField();
        //don't input user login password into password input field
        registerLoginDashboardPage.inputNoLoginPasswordIntoPasswordInputField();
        //capture screenshot of the invalid user login data input
        captureScreenshot(driver, "Register and Login Dashboard Page Invalid User Login Data Input - No Login Password");
        //click 'Login' button
        registerLoginDashboardPage.clickLoginButton();
        //assert the user gets the expected error message
        assertEquals("Warning: No match for E-Mail Address and/or Password.", registerLoginDashboardPage.getLoginSingularInputError(), "The missing login password input error message doesn't match expectations or the error hasn't been triggered.");
        //capture screenshot of the test data result
        captureScreenshot(driver, "Invalid User Login Test Result - No Login Password");
    }

    //invalid singular input

    //invalid user login test method - invalid login email
    protected void invalidUserLoginInvalidEmailTest(RegisterPage registerPage) {
        GeneralPage generalPage = new GeneralPage(driver);
        HomePage homePage = new HomePage(driver);
        RegisterLoginDashboardPage registerLoginDashboardPage = new RegisterLoginDashboardPage(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //home page web element assert
        isHomePageWebElementDisplayed(homePage);
        //home page text element assert
        isHomePageTextElementAsExpected(homePage);
        //click account dropdown menu
        generalPage.clickAccountDropdownMenuLink();
        //click 'Login' option link
        generalPage.clickLoginOptionLink();
        //capture screenshot of the page before invalid user login data input
        captureScreenshot(driver, "Register and Login Dashboard Page Display Before Invalid User Login Data Input");
        //register/login dashboard page web element assert
        isRegisterLoginDashboardPageWebElementDisplayed(registerLoginDashboardPage);
        //register/login dashboard page text element assert
        isRegisterLoginDashboardPageTextElementAsExpected(registerLoginDashboardPage);
        //invalid user login data getter - invalid login email
        registerLoginDashboardPage.invalidUserLoginInvalidEmailGetter(registerPage);
        //input invalid login email into email input field
        registerLoginDashboardPage.inputInvalidLoginEmailIntoEmailInputField();
        //capture screenshot of the invalid user login data input
        captureScreenshot(driver, "Register and Login Dashboard Page Invalid User Login Data Input - Invalid Login Email");
        //input valid user login password into password input field
        registerLoginDashboardPage.inputValidUserLoginPasswordIntoPasswordInputField();
        //click 'Login' button
        registerLoginDashboardPage.clickLoginButton();
        //assert the user gets the expected error message
        assertEquals("Warning: No match for E-Mail Address and/or Password.", registerLoginDashboardPage.getLoginSingularInputError(), "The invalid login email input error message doesn't match expectations or the error hasn't been triggered.");
        //capture screenshot of the test data result
        captureScreenshot(driver, "Invalid User Login Test Result - Invalid Login Email");
    }

    //invalid user login test method - invalid login password
    protected void invalidUserLoginInvalidPasswordTest(RegisterPage registerPage) {
        GeneralPage generalPage = new GeneralPage(driver);
        HomePage homePage = new HomePage(driver);
        RegisterLoginDashboardPage registerLoginDashboardPage = new RegisterLoginDashboardPage(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //home page web element assert
        isHomePageWebElementDisplayed(homePage);
        //home page text element assert
        isHomePageTextElementAsExpected(homePage);
        //click account dropdown menu
        generalPage.clickAccountDropdownMenuLink();
        //click 'Login' option link
        generalPage.clickLoginOptionLink();
        //capture screenshot of the page before invalid user login data input
        captureScreenshot(driver, "Register and Login Dashboard Page Display Before Invalid User Login Data Input");
        //register/login dashboard page web element assert
        isRegisterLoginDashboardPageWebElementDisplayed(registerLoginDashboardPage);
        //register/login dashboard page text element assert
        isRegisterLoginDashboardPageTextElementAsExpected(registerLoginDashboardPage);
        //invalid user login data getter - invalid login password
        registerLoginDashboardPage.invalidUserLoginInvalidPasswordGetter(registerPage);
        //input valid user login email into email input field
        registerLoginDashboardPage.inputValidUserLoginEmailIntoEmailInputField();
        //input invalid login password into password input field
        registerLoginDashboardPage.inputInvalidLoginPasswordIntoPasswordInputField();
        //capture screenshot of the invalid user login data input
        captureScreenshot(driver, "Register and Login Dashboard Page Invalid User Login Data Input - Invalid Login Password");
        //click 'Login' button
        registerLoginDashboardPage.clickLoginButton();
        //assert the user gets the expected error message
        assertEquals("Warning: No match for E-Mail Address and/or Password.", registerLoginDashboardPage.getLoginSingularInputError(), "The invalid login email input error message doesn't match expectations or the error hasn't been triggered.");
        //capture screenshot of the test data result
        captureScreenshot(driver, "Invalid User Login Test Result - Invalid Login Password");
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //valid user account information edit tests

    //valid user account first name edit test method
    protected void validEditFirstNameTest(){
        MyAccountPage myAccountPage = new MyAccountPage(driver);
        GeneralPage generalPage = new GeneralPage(driver);
        EditAccountInformationPage editAccountInformationPage = new EditAccountInformationPage(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //click aside 'Edit account information' link
        myAccountPage.clickAsideEditAccountInfoLink();
        //edit account information page web element assert
        isEditAccountInfoPageWebElementDisplayed(editAccountInformationPage);
        //edit account information page text element assert
        isEditAccountInfoPageTextElementAsExpected(editAccountInformationPage);
        //capture screenshot before edited data input
        captureScreenshot(driver, "Edit Account Information Page Before Edited First Name Input");
        //valid edited first name getter
        editAccountInformationPage.validUserEditedFirstNameGetter();
        //input edited first name
        editAccountInformationPage.inputEditedFirstNameIntoFirstNameInputField();
        //capture screenshot after edited data input
        captureScreenshot(driver, "Edit Account Information Page After Edited First Name Input");
        //click 'Continue' button
        editAccountInformationPage.clickEditInfoContinueButton();
        //assert the user gets an expected success message
        assertEquals("Success: Your account has been successfully updated.", myAccountPage.getSuccessMessage(), "The success message doesn't match expectations or the first name edition has failed.");
        //click aside 'Edit account information' link to verify the first name has been indeed edited
        myAccountPage.clickAsideEditAccountInfoLink();
        //capture screenshot of the test result
        captureScreenshot(driver, "Edit User First Name Test Result");
    }

    //valid user account last name edit test method
    protected void validEditLastNameTest(){
        MyAccountPage myAccountPage = new MyAccountPage(driver);
        GeneralPage generalPage = new GeneralPage(driver);
        EditAccountInformationPage editAccountInformationPage = new EditAccountInformationPage(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //click 'Edit account information' link
        myAccountPage.clickEditAccountInfoLink();
        //edit account information page web element assert
        isEditAccountInfoPageWebElementDisplayed(editAccountInformationPage);
        //edit account information page text element assert
        isEditAccountInfoPageTextElementAsExpected(editAccountInformationPage);
        //capture screenshot before edited data input
        captureScreenshot(driver, "Edit Account Information Page Before Edited Valid Data Input");
        //valid edited last name getter
        editAccountInformationPage.validUserEditedLastNameGetter();
        //input edited last name
        editAccountInformationPage.inputEditedLastNameIntoLastNameInputField();
        //capture screenshot after edited data input
        captureScreenshot(driver, "Edit Account Information Page After Edited Last Name Input");
        //click 'Continue' button
        editAccountInformationPage.clickEditInfoContinueButton();
        //assert the user gets an expected success message
        assertEquals("Success: Your account has been successfully updated.", myAccountPage.getSuccessMessage(), "The success message doesn't match expectations or the first name edition has failed.");
        //click 'Edit account information' link to verify the first name has been indeed edited
        myAccountPage.clickEditAccountInfoLink();
        //capture screenshot of the test result
        captureScreenshot(driver, "Edit User Last Name Test Result");
    }

    //valid user account email edit test method
    protected void validEditEmailTest(){
        MyAccountPage myAccountPage = new MyAccountPage(driver);
        GeneralPage generalPage = new GeneralPage(driver);
        EditAccountInformationPage editAccountInformationPage = new EditAccountInformationPage(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //click 'Edit account information' link
        myAccountPage.clickEditAccountInfoLink();
        //edit account information page web element assert
        isEditAccountInfoPageWebElementDisplayed(editAccountInformationPage);
        //edit account information page text element assert
        isEditAccountInfoPageTextElementAsExpected(editAccountInformationPage);
        //capture screenshot before edited data input
        captureScreenshot(driver, "Edit Account Information Page Before Edited Valid Data Input");
        //valid edited email getter
        editAccountInformationPage.validUserEditedEmailGetter();
        //input edited email
        editAccountInformationPage.inputEditedEmailIntoEmailInputField();
        //capture screenshot after edited data input
        captureScreenshot(driver, "Edit Account Information Page After Edited Email Input");
        //click 'Continue' button
        editAccountInformationPage.clickEditInfoContinueButton();
        //assert the user gets an expected success message
        assertEquals("Success: Your account has been successfully updated.", myAccountPage.getSuccessMessage(), "The success message doesn't match expectations or the first name edition has failed.");
        //click 'Edit account information' link to verify the first name has been indeed edited
        myAccountPage.clickEditAccountInfoLink();
        //capture screenshot of the test result
        captureScreenshot(driver, "Edit User Email Test Result");
    }

    //valid user account phone edit test method
    protected void validEditPhoneTest(){
        MyAccountPage myAccountPage = new MyAccountPage(driver);
        GeneralPage generalPage = new GeneralPage(driver);
        EditAccountInformationPage editAccountInformationPage = new EditAccountInformationPage(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //click 'Edit account information' link
        myAccountPage.clickEditAccountInfoLink();
        //edit account information page web element assert
        isEditAccountInfoPageWebElementDisplayed(editAccountInformationPage);
        //edit account information page text element assert
        isEditAccountInfoPageTextElementAsExpected(editAccountInformationPage);
        //capture screenshot before edited data input
        captureScreenshot(driver, "Edit Account Information Page Before Edited Valid Data Input");
        //valid edited phone getter
        editAccountInformationPage.validUserEditedPhoneGetter();
        //input edited phone
        editAccountInformationPage.inputEditedPhoneIntoPhoneInputField();
        //capture screenshot after edited data input
        captureScreenshot(driver, "Edit Account Information Page After Edited Phone Input");
        //click 'Continue' button
        editAccountInformationPage.clickEditInfoContinueButton();
        //assert the user gets an expected success message
        assertEquals("Success: Your account has been successfully updated.", myAccountPage.getSuccessMessage(), "The success message doesn't match expectations or the first name edition has failed.");
        //click 'Edit account information' link to verify the first name has been indeed edited
        myAccountPage.clickEditAccountInfoLink();
        //capture screenshot of the test result
        captureScreenshot(driver, "Edit User Phone Test Result");
    }

    //invalid user account information edit tests

    //no singular input

    //invalid user account first name edit test method - no edited first name
    protected void invalidEditNoFirstNameTest(){
        MyAccountPage myAccountPage = new MyAccountPage(driver);
        GeneralPage generalPage = new GeneralPage(driver);
        EditAccountInformationPage editAccountInformationPage = new EditAccountInformationPage(driver);
        EditAccountPageNoSingularInput editAccountPageNoSingularInput = new EditAccountPageNoSingularInput(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //click aside 'Edit account information' link
        myAccountPage.clickAsideEditAccountInfoLink();
        //edit account information page web element assert
        isEditAccountInfoPageWebElementDisplayed(editAccountInformationPage);
        //edit account information page text element assert
        isEditAccountInfoPageTextElementAsExpected(editAccountInformationPage);
        //capture screenshot before invalid data input
        captureScreenshot(driver, "Edit Account Information Page Before Invalid Data Input");
        //don't input edited first name
        editAccountPageNoSingularInput.inputNoFirstNameIntoFirstNameInputField();
        //capture screenshot after edited data input
        captureScreenshot(driver, "Edit Account Information Page After No First Name Input");
        //click 'Continue' button
        editAccountInformationPage.clickEditInfoContinueButton();
        //assert the user gets an expected error message
        assertEquals("First Name must be between 1 and 32 characters!", editAccountPageNoSingularInput.getInvalidSingularInputError(), "The missing first name input error doesn't match expectations or the error wasn't triggered.");
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Edit Account Info Test Result - No First Name");
    }

    //invalid user account last name edit test method - no edited last name
    protected void invalidEditNoLastNameTest(){
        MyAccountPage myAccountPage = new MyAccountPage(driver);
        GeneralPage generalPage = new GeneralPage(driver);
        EditAccountInformationPage editAccountInformationPage = new EditAccountInformationPage(driver);
        EditAccountPageNoSingularInput editAccountPageNoSingularInput = new EditAccountPageNoSingularInput(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //click aside 'Edit account information' link
        myAccountPage.clickAsideEditAccountInfoLink();
        //edit account information page web element assert
        isEditAccountInfoPageWebElementDisplayed(editAccountInformationPage);
        //edit account information page text element assert
        isEditAccountInfoPageTextElementAsExpected(editAccountInformationPage);
        //capture screenshot before invalid data input
        captureScreenshot(driver, "Edit Account Information Page Before Invalid Data Input");
        //don't input edited last name
        editAccountPageNoSingularInput.inputNoLastNameIntoLastNameInputField();
        //capture screenshot after edited data input
        captureScreenshot(driver, "Edit Account Information Page After No Last Name Input");
        //click 'Continue' button
        editAccountInformationPage.clickEditInfoContinueButton();
        //assert the user gets an expected error message
        assertEquals("Last Name must be between 1 and 32 characters!", editAccountPageNoSingularInput.getInvalidSingularInputError(), "The missing last name input error doesn't match expectations or the error wasn't triggered.");
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Edit Account Info Test Result - No Last Name");
    }

    //invalid user account email edit test method - no edited email
    protected void invalidEditNoEmailTest(){
        MyAccountPage myAccountPage = new MyAccountPage(driver);
        GeneralPage generalPage = new GeneralPage(driver);
        EditAccountInformationPage editAccountInformationPage = new EditAccountInformationPage(driver);
        EditAccountPageNoSingularInput editAccountPageNoSingularInput = new EditAccountPageNoSingularInput(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //click aside 'Edit account information' link
        myAccountPage.clickAsideEditAccountInfoLink();
        //edit account information page web element assert
        isEditAccountInfoPageWebElementDisplayed(editAccountInformationPage);
        //edit account information page text element assert
        isEditAccountInfoPageTextElementAsExpected(editAccountInformationPage);
        //capture screenshot before invalid data input
        captureScreenshot(driver, "Edit Account Information Page Before Invalid Data Input");
        //don't input edited email
        editAccountPageNoSingularInput.inputNoEmailIntoEmailInputField();
        //capture screenshot after edited data input
        captureScreenshot(driver, "Edit Account Information Page After No Email Input");
        //click 'Continue' button
        editAccountInformationPage.clickEditInfoContinueButton();
        //assert the user gets an expected error message
        assertEquals("E-Mail Address does not appear to be valid!", editAccountPageNoSingularInput.getInvalidSingularInputError(), "The missing email input error doesn't match expectations or the error wasn't triggered.");
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Edit Account Info Test Result - No Email");
    }

    //invalid user account phone edit test method - no edited phone
    protected void invalidEditNoPhoneTest(){
        MyAccountPage myAccountPage = new MyAccountPage(driver);
        GeneralPage generalPage = new GeneralPage(driver);
        EditAccountInformationPage editAccountInformationPage = new EditAccountInformationPage(driver);
        EditAccountPageNoSingularInput editAccountPageNoSingularInput = new EditAccountPageNoSingularInput(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //click aside 'Edit account information' link
        myAccountPage.clickAsideEditAccountInfoLink();
        //edit account information page web element assert
        isEditAccountInfoPageWebElementDisplayed(editAccountInformationPage);
        //edit account information page text element assert
        isEditAccountInfoPageTextElementAsExpected(editAccountInformationPage);
        //capture screenshot before invalid data input
        captureScreenshot(driver, "Edit Account Information Page Before Invalid Data Input");
        //don't input edited phone number
        editAccountPageNoSingularInput.inputNoPhoneIntoPhoneInputField();
        //capture screenshot after edited data input
        captureScreenshot(driver, "Edit Account Information Page After No Phone Input");
        //click 'Continue' button
        editAccountInformationPage.clickEditInfoContinueButton();
        //assert the user gets an expected error message
        assertEquals("Telephone must be between 3 and 32 characters!", editAccountPageNoSingularInput.getInvalidSingularInputError(), "The missing phone input error doesn't match expectations or the error wasn't triggered.");
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Edit Account Info Test Result - No Phone");
    }

    //too short singular input

    //invalid user account first name edit test method - too short edited first name (1 char) (first name edit hasn't been aborted, test has failed)
    protected void invalidEditTooShortFirstNameTest(){
        MyAccountPage myAccountPage = new MyAccountPage(driver);
        GeneralPage generalPage = new GeneralPage(driver);
        EditAccountInformationPage editAccountInformationPage = new EditAccountInformationPage(driver);
        EditAccountPageTooShortSingularInput editAccountPageTooShortSingularInput = new EditAccountPageTooShortSingularInput(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //click aside 'Edit account information' link
        myAccountPage.clickAsideEditAccountInfoLink();
        //edit account information page web element assert
        isEditAccountInfoPageWebElementDisplayed(editAccountInformationPage);
        //edit account information page text element assert
        isEditAccountInfoPageTextElementAsExpected(editAccountInformationPage);
        //capture screenshot before invalid data input
        captureScreenshot(driver, "Edit Account Information Page Before Invalid Data Input");
        //input too short edited first name (1 char)
        editAccountPageTooShortSingularInput.inputTooShortFirstNameIntoFirstNameInputField();
        //capture screenshot after edited data input
        captureScreenshot(driver, "Edit Account Information Page After Too Short First Name Input");
        //click 'Continue' button
        editAccountInformationPage.clickEditInfoContinueButton();
        //assert the user gets an expected error message, otherwise, log the issue
        try {
            assertEquals("First Name must be between 1 and 32 characters!", editAccountPageTooShortSingularInput.getInvalidSingularInputError(), "The too short first name input error doesn't match expectations.");
        } catch (NoSuchElementException nse){
            logger.error("The too short first name error wasn't triggered, first name edit hasn't been aborted.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Edit Account Info Test Result - Too Short First Name");
    }

    //invalid user account last name edit test method - too short edited last name (1 char) (last name edit hasn't been aborted, test has failed)
    protected void invalidEditTooShortLastNameTest(){
        MyAccountPage myAccountPage = new MyAccountPage(driver);
        GeneralPage generalPage = new GeneralPage(driver);
        EditAccountInformationPage editAccountInformationPage = new EditAccountInformationPage(driver);
        EditAccountPageTooShortSingularInput editAccountPageTooShortSingularInput = new EditAccountPageTooShortSingularInput(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //click aside 'Edit account information' link
        myAccountPage.clickAsideEditAccountInfoLink();
        //edit account information page web element assert
        isEditAccountInfoPageWebElementDisplayed(editAccountInformationPage);
        //edit account information page text element assert
        isEditAccountInfoPageTextElementAsExpected(editAccountInformationPage);
        //capture screenshot before invalid data input
        captureScreenshot(driver, "Edit Account Information Page Before Invalid Data Input");
        //input too short edited last name (1 char)
        editAccountPageTooShortSingularInput.inputTooShortLastNameIntoLastNameInputField();
        //capture screenshot after edited data input
        captureScreenshot(driver, "Edit Account Information Page After Too Short Last Name Input");
        //click 'Continue' button
        editAccountInformationPage.clickEditInfoContinueButton();
        //assert the user gets an expected error message, otherwise, log the issue
        try {
            assertEquals("Last Name must be between 1 and 32 characters!", editAccountPageTooShortSingularInput.getInvalidSingularInputError(), "The too short last name input error doesn't match expectations.");
        } catch (NoSuchElementException nse){
            logger.error("The too short last name error wasn't triggered, last name edit hasn't been aborted.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Edit Account Info Test Result - Too Short Last Name");
    }

    //invalid user account email edit test method - too short edited email (1 char -> name, domain) (email edit hasn't been aborted, test has failed)
    protected void invalidEditTooShortEmailTest(){
        MyAccountPage myAccountPage = new MyAccountPage(driver);
        GeneralPage generalPage = new GeneralPage(driver);
        EditAccountInformationPage editAccountInformationPage = new EditAccountInformationPage(driver);
        EditAccountPageTooShortSingularInput editAccountPageTooShortSingularInput = new EditAccountPageTooShortSingularInput(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //click aside 'Edit account information' link
        myAccountPage.clickAsideEditAccountInfoLink();
        //edit account information page web element assert
        isEditAccountInfoPageWebElementDisplayed(editAccountInformationPage);
        //edit account information page text element assert
        isEditAccountInfoPageTextElementAsExpected(editAccountInformationPage);
        //capture screenshot before invalid data input
        captureScreenshot(driver, "Edit Account Information Page Before Invalid Data Input");
        //input too short edited email (1 char -> name,domain)
        editAccountPageTooShortSingularInput.inputTooShortEmailIntoEmailInputField();
        //capture screenshot after edited data input
        captureScreenshot(driver, "Edit Account Information Page After Too Short Email Input");
        //click 'Continue' button
        editAccountInformationPage.clickEditInfoContinueButton();
        //assert the user gets an expected error message, otherwise, log the issue
        try {
            assertEquals("E-mail is too short!", editAccountPageTooShortSingularInput.getInvalidSingularInputError(), "The too short email input error doesn't match expectations.");
        } catch (NoSuchElementException nse){
            logger.error("The too short email error wasn't triggered, email edit hasn't been aborted.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Edit Account Info Test Result - Too Short Email");
    }

    //invalid user account phone edit test method - too short edited phone (2 digits)
    protected void invalidEditTooShortPhoneTest(){
        MyAccountPage myAccountPage = new MyAccountPage(driver);
        GeneralPage generalPage = new GeneralPage(driver);
        EditAccountInformationPage editAccountInformationPage = new EditAccountInformationPage(driver);
        EditAccountPageTooShortSingularInput editAccountPageTooShortSingularInput = new EditAccountPageTooShortSingularInput(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //click aside 'Edit account information' link
        myAccountPage.clickAsideEditAccountInfoLink();
        //edit account information page web element assert
        isEditAccountInfoPageWebElementDisplayed(editAccountInformationPage);
        //edit account information page text element assert
        isEditAccountInfoPageTextElementAsExpected(editAccountInformationPage);
        //capture screenshot before invalid data input
        captureScreenshot(driver, "Edit Account Information Page Before Invalid Data Input");
        //input too short edited phone (2 digits)
        editAccountPageTooShortSingularInput.inputTooShortPhoneIntoPhoneInputField();
        //capture screenshot after edited data input
        captureScreenshot(driver, "Edit Account Information Page After Too Short Phone Input");
        //click 'Continue' button
        editAccountInformationPage.clickEditInfoContinueButton();
        //assert the user gets an expected error message, otherwise, log the issue
        try {
            assertEquals("Telephone must be between 3 and 32 characters!", editAccountPageTooShortSingularInput.getInvalidSingularInputError(), "The too short phone input error doesn't match expectations.");
        } catch (NoSuchElementException nse){
            logger.error("The too short phone error wasn't triggered, email edit hasn't been aborted.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Edit Account Info Test Result - Too Short Phone");
    }

    //too long singular input

    //invalid user account first name edit test method - too long edited first name (33 chars)
    protected void invalidEditTooLongFirstNameTest(){
        MyAccountPage myAccountPage = new MyAccountPage(driver);
        GeneralPage generalPage = new GeneralPage(driver);
        EditAccountInformationPage editAccountInformationPage = new EditAccountInformationPage(driver);
        EditAccountPageTooLongSingularInput editAccountPageTooLongSingularInput = new EditAccountPageTooLongSingularInput(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //click aside 'Edit account information' link
        myAccountPage.clickAsideEditAccountInfoLink();
        //edit account information page web element assert
        isEditAccountInfoPageWebElementDisplayed(editAccountInformationPage);
        //edit account information page text element assert
        isEditAccountInfoPageTextElementAsExpected(editAccountInformationPage);
        //capture screenshot before invalid data input
        captureScreenshot(driver, "Edit Account Information Page Before Invalid Data Input");
        //input too long edited first name (33 chars)
        editAccountPageTooLongSingularInput.inputTooLongFirstNameIntoFirstNameInputField();
        //capture screenshot after edited data input
        captureScreenshot(driver, "Edit Account Information Page After Too Long First Name Input");
        //click 'Continue' button
        editAccountInformationPage.clickEditInfoContinueButton();
        //assert the user gets an expected error message, otherwise, log the issue
        try {
            assertEquals("First Name must be between 1 and 32 characters!", editAccountPageTooLongSingularInput.getInvalidSingularInputError(), "The too long first name input error doesn't match expectations.");
        } catch (NoSuchElementException nse){
            logger.error("The too long first name error wasn't triggered, first name edit hasn't been aborted.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Edit Account Info Test Result - Too Long First Name");
    }

    //invalid user account last name edit test method - too long edited last name (33 chars)
    protected void invalidEditTooLongLastNameTest(){
        MyAccountPage myAccountPage = new MyAccountPage(driver);
        GeneralPage generalPage = new GeneralPage(driver);
        EditAccountInformationPage editAccountInformationPage = new EditAccountInformationPage(driver);
        EditAccountPageTooLongSingularInput editAccountPageTooLongSingularInput = new EditAccountPageTooLongSingularInput(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //click aside 'Edit account information' link
        myAccountPage.clickAsideEditAccountInfoLink();
        //edit account information page web element assert
        isEditAccountInfoPageWebElementDisplayed(editAccountInformationPage);
        //edit account information page text element assert
        isEditAccountInfoPageTextElementAsExpected(editAccountInformationPage);
        //capture screenshot before invalid data input
        captureScreenshot(driver, "Edit Account Information Page Before Invalid Data Input");
        //input too long edited last name (33 chars)
        editAccountPageTooLongSingularInput.inputTooLongLastNameIntoLastNameInputField();
        //capture screenshot after edited data input
        captureScreenshot(driver, "Edit Account Information Page After Too Long Last Name Input");
        //click 'Continue' button
        editAccountInformationPage.clickEditInfoContinueButton();
        //assert the user gets an expected error message, otherwise, log the issue
        try {
            assertEquals("Last Name must be between 1 and 32 characters!", editAccountPageTooLongSingularInput.getInvalidSingularInputError(), "The too long last name input error doesn't match expectations.");
        } catch (NoSuchElementException nse){
            logger.error("The too long last name error wasn't triggered, last name edit hasn't been aborted.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Edit Account Info Test Result - Too Long Last Name");
    }

    //invalid user account email edit test method - too long edited email (100 chars -> name,domain) (the error hasn't been triggered but the email edit has been aborted - test has passed)
    protected void invalidEditTooLongEmailTest(){
        MyAccountPage myAccountPage = new MyAccountPage(driver);
        GeneralPage generalPage = new GeneralPage(driver);
        EditAccountInformationPage editAccountInformationPage = new EditAccountInformationPage(driver);
        EditAccountPageTooLongSingularInput editAccountPageTooLongSingularInput = new EditAccountPageTooLongSingularInput(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //click aside 'Edit account information' link
        myAccountPage.clickAsideEditAccountInfoLink();
        //edit account information page web element assert
        isEditAccountInfoPageWebElementDisplayed(editAccountInformationPage);
        //edit account information page text element assert
        isEditAccountInfoPageTextElementAsExpected(editAccountInformationPage);
        //capture screenshot before invalid data input
        captureScreenshot(driver, "Edit Account Information Page Before Invalid Data Input");
        //input too long edited email (100 chars -> name,domain)
        editAccountPageTooLongSingularInput.inputTooLongEmailIntoEmailInputField();
        //capture screenshot after edited data input
        captureScreenshot(driver, "Edit Account Information Page After Too Long Email Input");
        //click 'Continue' button
        editAccountInformationPage.clickEditInfoContinueButton();
        //assert the user gets an expected error message, otherwise, log the issue
        try {
            assertEquals("E-mail address is too long!", editAccountPageTooLongSingularInput.getInvalidSingularInputError(), "The too long email input error doesn't match expectations.");
        } catch (NoSuchElementException nse){
            logger.error("The too long email error wasn't triggered, email edit hasn't been aborted.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Edit Account Info Test Result - Too Long Email");
    }

    //invalid user account phone edit test method - too long edited last name (33 digits)
    protected void invalidEditTooLongPhoneTest(){
        MyAccountPage myAccountPage = new MyAccountPage(driver);
        GeneralPage generalPage = new GeneralPage(driver);
        EditAccountInformationPage editAccountInformationPage = new EditAccountInformationPage(driver);
        EditAccountPageTooLongSingularInput editAccountPageTooLongSingularInput = new EditAccountPageTooLongSingularInput(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //click aside 'Edit account information' link
        myAccountPage.clickAsideEditAccountInfoLink();
        //edit account information page web element assert
        isEditAccountInfoPageWebElementDisplayed(editAccountInformationPage);
        //edit account information page text element assert
        isEditAccountInfoPageTextElementAsExpected(editAccountInformationPage);
        //capture screenshot before invalid data input
        captureScreenshot(driver, "Edit Account Information Page Before Invalid Data Input");
        //input too long edited phone (33 digits)
        editAccountPageTooLongSingularInput.inputTooLongPhoneIntoPhoneInputField();
        //capture screenshot after edited data input
        captureScreenshot(driver, "Edit Account Information Page After Too Long Phone Input");
        //click 'Continue' button
        editAccountInformationPage.clickEditInfoContinueButton();
        //assert the user gets an expected error message, otherwise, log the issue
        try {
            assertEquals("Telephone must be between 3 and 32 characters!", editAccountPageTooLongSingularInput.getInvalidSingularInputError(), "The too long phone input error doesn't match expectations.");
        } catch (NoSuchElementException nse){
            logger.error("The too long phone error wasn't triggered, phone edit hasn't been aborted.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Edit Account Info Test Result - Too Long Phone");
    }

    //invalid singular input format

    //invalid user account first name edit test method - invalid edited first name format (special symbols and digits)  (the error hasn't been triggered, the first name edit hasn't been aborted, the test has failed)
    protected void invalidEditInvalidFirstNameFormatTest(){
        MyAccountPage myAccountPage = new MyAccountPage(driver);
        GeneralPage generalPage = new GeneralPage(driver);
        EditAccountInformationPage editAccountInformationPage = new EditAccountInformationPage(driver);
        EditAccountPageInvalidSingularInput editAccountPageInvalidSingularInput = new EditAccountPageInvalidSingularInput(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //click aside 'Edit account information' link
        myAccountPage.clickAsideEditAccountInfoLink();
        //edit account information page web element assert
        isEditAccountInfoPageWebElementDisplayed(editAccountInformationPage);
        //edit account information page text element assert
        isEditAccountInfoPageTextElementAsExpected(editAccountInformationPage);
        //capture screenshot before invalid data input
        captureScreenshot(driver, "Edit Account Information Page Before Invalid Data Input");
        //input invalid edited first name format (special symbols and digits)
        editAccountPageInvalidSingularInput.inputInvalidFirstNameFormatIntoFirstNameInputField();
        //capture screenshot after edited data input
        captureScreenshot(driver, "Edit Account Information Page After Invalid First Name Format Input");
        //click 'Continue' button
        editAccountInformationPage.clickEditInfoContinueButton();
        //assert the user gets an expected error message, otherwise, log the issue
        try {
            assertEquals("First Name cannot consist of special symbols and digits only!", editAccountPageInvalidSingularInput.getInvalidSingularInputError(), "The invalid first name format input error doesn't match expectations.");
        } catch (NoSuchElementException nse){
            logger.error("The invalid first name format error wasn't triggered, first name edit hasn't been aborted.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Edit Account Info Test Result - Invalid First Name Format");
    }

    //invalid user account last name edit test method - invalid edited last name format (special symbols and digits)  (the error hasn't been triggered, the first name edit hasn't been aborted, the test has failed)
    protected void invalidEditInvalidLastNameFormatTest(){
        MyAccountPage myAccountPage = new MyAccountPage(driver);
        GeneralPage generalPage = new GeneralPage(driver);
        EditAccountInformationPage editAccountInformationPage = new EditAccountInformationPage(driver);
        EditAccountPageInvalidSingularInput editAccountPageInvalidSingularInput = new EditAccountPageInvalidSingularInput(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //click aside 'Edit account information' link
        myAccountPage.clickAsideEditAccountInfoLink();
        //edit account information page web element assert
        isEditAccountInfoPageWebElementDisplayed(editAccountInformationPage);
        //edit account information page text element assert
        isEditAccountInfoPageTextElementAsExpected(editAccountInformationPage);
        //capture screenshot before invalid data input
        captureScreenshot(driver, "Edit Account Information Page Before Invalid Data Input");
        //input invalid edited last name format (special symbols and digits)
        editAccountPageInvalidSingularInput.inputInvalidLastNameFormatIntoLastNameInputField();
        //capture screenshot after edited data input
        captureScreenshot(driver, "Edit Account Information Page After Invalid Last Name Format Input");
        //click 'Continue' button
        editAccountInformationPage.clickEditInfoContinueButton();
        //assert the user gets an expected error message, otherwise, log the issue
        try {
            assertEquals("Last Name cannot consist of special symbols and digits only!", editAccountPageInvalidSingularInput.getInvalidSingularInputError(), "The invalid last name format input error doesn't match expectations.");
        } catch (NoSuchElementException nse){
            logger.error("The invalid last name format error wasn't triggered, last name edit hasn't been aborted.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Edit Account Info Test Result - Invalid Last Name Format");
    }

    //invalid user account email edit test method - invalid edited email format (missing '@')  (the error hasn't been triggered, but the email edit has been aborted, the test has passed)
    protected void invalidEditInvalidEmailFormatTest(){
        MyAccountPage myAccountPage = new MyAccountPage(driver);
        GeneralPage generalPage = new GeneralPage(driver);
        EditAccountInformationPage editAccountInformationPage = new EditAccountInformationPage(driver);
        EditAccountPageInvalidSingularInput editAccountPageInvalidSingularInput = new EditAccountPageInvalidSingularInput(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //click aside 'Edit account information' link
        myAccountPage.clickAsideEditAccountInfoLink();
        //edit account information page web element assert
        isEditAccountInfoPageWebElementDisplayed(editAccountInformationPage);
        //edit account information page text element assert
        isEditAccountInfoPageTextElementAsExpected(editAccountInformationPage);
        //capture screenshot before invalid data input
        captureScreenshot(driver, "Edit Account Information Page Before Invalid Data Input");
        //input invalid edited email format (missing '@')
        editAccountPageInvalidSingularInput.inputInvalidEmailFormatIntoEmailInputField();
        //capture screenshot after edited data input
        captureScreenshot(driver, "Edit Account Information Page After Invalid Email Format Input");
        //click 'Continue' button
        editAccountInformationPage.clickEditInfoContinueButton();
        //assert the user gets an expected error message, otherwise, log the issue
        try {
            assertEquals("E-Mail Address does not appear to be valid!", editAccountPageInvalidSingularInput.getInvalidSingularInputError(), "The invalid email format input error doesn't match expectations.");
        } catch (NoSuchElementException nse){
            logger.error("The invalid email format error wasn't triggered, email edit hasn't been aborted.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Edit Account Info Test Result - Invalid Email Format");
    }

    //invalid user account email edit test method - pre-existing edited email format (used beforehand in manual testing)
    protected void invalidEditExistingEmailTest(){
        MyAccountPage myAccountPage = new MyAccountPage(driver);
        GeneralPage generalPage = new GeneralPage(driver);
        EditAccountInformationPage editAccountInformationPage = new EditAccountInformationPage(driver);
        EditAccountPageInvalidSingularInput editAccountPageInvalidSingularInput = new EditAccountPageInvalidSingularInput(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //click 'Edit account information' link
        myAccountPage.clickEditAccountInfoLink();
        //edit account information page web element assert
        isEditAccountInfoPageWebElementDisplayed(editAccountInformationPage);
        //edit account information page text element assert
        isEditAccountInfoPageTextElementAsExpected(editAccountInformationPage);
        //capture screenshot before invalid data input
        captureScreenshot(driver, "Edit Account Information Page Before Invalid Data Input");
        //input pre-existing edited email (used beforehand in manual testing)
        editAccountPageInvalidSingularInput.inputExistingEmailIntoEmailInputField();
        //capture screenshot after edited data input
        captureScreenshot(driver, "Edit Account Information Page After Existing Email Input");
        //click 'Continue' button
        editAccountInformationPage.clickEditInfoContinueButton();
        //assert the user gets an expected error message, otherwise, log the issue
        try {
            assertEquals("Warning: E-Mail address is already registered!", editAccountPageInvalidSingularInput.getInvalidInputError(), "The existing email input error doesn't match expectations.");
        } catch (NoSuchElementException nse){
            logger.error("The existing email error wasn't triggered, email edit hasn't been aborted.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Edit Account Info Test Result - Existing Email");
    }

    //invalid user account phone edit test method - invalid edited phone format (special symbols)  (the error hasn't been triggered, the phone edit hasn't been aborted, the test has failed)
    protected void invalidEditInvalidPhoneFormatTest(){
        MyAccountPage myAccountPage = new MyAccountPage(driver);
        GeneralPage generalPage = new GeneralPage(driver);
        EditAccountInformationPage editAccountInformationPage = new EditAccountInformationPage(driver);
        EditAccountPageInvalidSingularInput editAccountPageInvalidSingularInput = new EditAccountPageInvalidSingularInput(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //click 'Edit account information' link
        myAccountPage.clickEditAccountInfoLink();
        //edit account information page web element assert
        isEditAccountInfoPageWebElementDisplayed(editAccountInformationPage);
        //edit account information page text element assert
        isEditAccountInfoPageTextElementAsExpected(editAccountInformationPage);
        //capture screenshot before invalid data input
        captureScreenshot(driver, "Edit Account Information Page Before Invalid Data Input");
        //input invalid edited phone format (special symbols)
        editAccountPageInvalidSingularInput.inputInvalidPhoneFormatIntoPhoneInputField();
        //capture screenshot after edited data input
        captureScreenshot(driver, "Edit Account Information Page After Invalid Phone Format Input");
        //click 'Continue' button
        editAccountInformationPage.clickEditInfoContinueButton();
        //assert the user gets an expected error message, otherwise, log the issue
        try {
            assertEquals("Telephone cannot consist of special symbols only!", editAccountPageInvalidSingularInput.getInvalidSingularInputError(), "The invalid phone format input error doesn't match expectations.");
        } catch (NoSuchElementException nse){
            logger.error("The invalid phone format error wasn't triggered, phone edit hasn't been aborted.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Edit Account Info Test Result - Invalid Phone Format");
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //valid edit password test method
    protected void validEditPasswordTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        MyAccountPage myAccountPage = new MyAccountPage(driver);
        EditPasswordPage editPasswordPage = new EditPasswordPage(driver);
        RegisterPage registerPage = new RegisterPage(driver);
        RegisterLoginDashboardPage registerLoginDashboardPage = new RegisterLoginDashboardPage(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //click 'Change your password' link
        myAccountPage.clickChangePasswordInfoLink();
        //edit password page web element assert
        isEditPasswordPageWebElementDisplayed(editPasswordPage);
        //edit password page text element assert
        isEditPasswordPageTextElementAsExpected(editPasswordPage);
        //capture screenshot before new password input
        captureScreenshot(driver, "Edit Account Information Page Before New Password Input");
        //valid new password getter
        editPasswordPage.validNewPasswordGetter();
        //input new password into password input field
        editPasswordPage.inputNewPasswordIntoPasswordInputField();
        //input matching confirm password into confirm password input field
        editPasswordPage.inputConfirmPasswordIntoConfirmPasswordInputField();
        //click 'Continue' button
        editPasswordPage.clickEditPasswordContinueButton();
        //assert the user gets an expected success message
        assertEquals("Success: Your password has been successfully updated.", myAccountPage.getSuccessMessage(), "The success message doesn't match expectations or the password edit has failed.");
        //click aside 'Logout' link
        myAccountPage.clickLogoutLink();
        //assert the user gets the expected logout success message elements (these are general 'My Account' page elements - their content is different on each page)
        assertLogoutSuccessMessageMatchesExpectations(myAccountPage);
        //click 'Continue' button
        myAccountPage.clickContinueButton();
        //click account dropdown menu
        generalPage.clickAccountDropdownMenuLink();
        //click 'Login' option link
        generalPage.clickLoginOptionLink();
        //capture screenshot of the page before valid user login data input
        captureScreenshot(driver, "Register and Login Dashboard Page Display Before User Login Data With New Password Input");
        //register/login dashboard page web element assert
        isRegisterLoginDashboardPageWebElementDisplayed(registerLoginDashboardPage);
        //register/login dashboard page text element assert
        isRegisterLoginDashboardPageTextElementAsExpected(registerLoginDashboardPage);
        //valid user login data getter (with updated password)
        registerLoginDashboardPage.validUserLoginDataWithUpdatedPasswordGetter(registerPage);
        //input valid user login email into email input field
        registerLoginDashboardPage.inputValidUserLoginEmailIntoEmailInputField();
        //input valid user updated login password into password input field
        registerLoginDashboardPage.inputValidUpdatedLoginPasswordIntoPasswordInputField();
        //capture screenshot of the valid user login data input
        captureScreenshot(driver, "Register and Login Dashboard Page Valid User Login Data With Updated Password Input");
        //click 'Login' button
        registerLoginDashboardPage.clickLoginButton();
        //capture screenshot of the test data result
        captureScreenshot(driver, "Valid User Login With Updated Password Test Result");
    }

    //invalid password edit tests

    //no input

    //invalid edit password test method - no password/confirm password
    protected void invalidEditNoPasswordTest() {
        GeneralPage generalPage = new GeneralPage(driver);
        MyAccountPage myAccountPage = new MyAccountPage(driver);
        EditPasswordPage editPasswordPage = new EditPasswordPage(driver);
        EditPasswordInvalidSingularInput editPasswordInvalidSingularInput = new EditPasswordInvalidSingularInput(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //click aside 'Password' link
        myAccountPage.clickAsidePasswordLink();
        //edit password page web element assert
        isEditPasswordPageWebElementDisplayed(editPasswordPage);
        //edit password page text element assert
        isEditPasswordPageTextElementAsExpected(editPasswordPage);
        //capture screenshot before invalid password input
        captureScreenshot(driver, "Edit Password Page Before Invalid Password Input");
        //don't input password into password input field
        editPasswordInvalidSingularInput.inputNoPasswordIntoPasswordInputField();
        //don't input confirm password into confirm password input field
        editPasswordInvalidSingularInput.inputNoConfirmPasswordIntoConfirmPasswordInputField();
        //click 'Continue' button
        editPasswordPage.clickEditPasswordContinueButton();
        //assert the user gets an expected error message
        assertEquals("Password must be between 4 and 20 characters!", editPasswordInvalidSingularInput.getInvalidSingularInputError(), "The missing password input error doesn't match expectations or the error wasn't triggered.");
        //capture screenshot of the test data result
        captureScreenshot(driver, "Invalid Password Edit Test Result - No Password");
    }

    //too short input

    //invalid edit password test method - too short password/confirm password (3 chars)
    protected void invalidEditTooShortPasswordTest() {
        GeneralPage generalPage = new GeneralPage(driver);
        MyAccountPage myAccountPage = new MyAccountPage(driver);
        EditPasswordPage editPasswordPage = new EditPasswordPage(driver);
        EditPasswordInvalidSingularInput editPasswordInvalidSingularInput = new EditPasswordInvalidSingularInput(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //click aside 'Password' link
        myAccountPage.clickAsidePasswordLink();
        //edit password page web element assert
        isEditPasswordPageWebElementDisplayed(editPasswordPage);
        //edit password page text element assert
        isEditPasswordPageTextElementAsExpected(editPasswordPage);
        //capture screenshot before invalid password input
        captureScreenshot(driver, "Edit Password Page Before Invalid Password Input");
        //input too short password into password input field
        editPasswordInvalidSingularInput.inputTooShortPasswordIntoPasswordInputField();
        //input matching confirm password into confirm password input field
        editPasswordInvalidSingularInput.inputTooShortConfirmPasswordIntoConfirmPasswordInputField();
        //click 'Continue' button
        editPasswordPage.clickEditPasswordContinueButton();
        //assert the user gets an expected error message
        assertEquals("Password must be between 4 and 20 characters!", editPasswordInvalidSingularInput.getInvalidSingularInputError(), "The too short password input error doesn't match expectations or the error wasn't triggered.");
        //capture screenshot of the test data result
        captureScreenshot(driver, "Invalid Password Edit Test Result - Too Short Password");
    }

    //too long input

    //invalid edit password test method - too long password/confirm password (21 chars) (the upper boundary error wasn't triggered, test has failed)
    protected void invalidEditTooLongPasswordTest() {
        GeneralPage generalPage = new GeneralPage(driver);
        MyAccountPage myAccountPage = new MyAccountPage(driver);
        EditPasswordPage editPasswordPage = new EditPasswordPage(driver);
        EditPasswordInvalidSingularInput editPasswordInvalidSingularInput = new EditPasswordInvalidSingularInput(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //click aside 'Password' link
        myAccountPage.clickAsidePasswordLink();
        //edit password page web element assert
        isEditPasswordPageWebElementDisplayed(editPasswordPage);
        //edit password page text element assert
        isEditPasswordPageTextElementAsExpected(editPasswordPage);
        //capture screenshot before invalid password input
        captureScreenshot(driver, "Edit Password Page Before Invalid Password Input");
        //input too long password into password input field (21 chars)
        editPasswordInvalidSingularInput.inputTooLongPasswordIntoPasswordInputField();
        //input matching confirm password into confirm password input field
        editPasswordInvalidSingularInput.inputTooLongConfirmPasswordIntoConfirmPasswordInputField();
        //click 'Continue' button
        editPasswordPage.clickEditPasswordContinueButton();
        //assert the user gets an expected error message, otherwise, log the issue
        try {
            assertEquals("Password must be between 4 and 20 characters!", editPasswordInvalidSingularInput.getInvalidSingularInputError(), "The too long password input error doesn't match expectations=.");
        } catch (NoSuchElementException nse) {
            logger.error("The too long password input error wasn't triggered.");
        }
        //capture screenshot of the test data result
        captureScreenshot(driver, "Invalid Password Edit Test Result - Too Long Password");
    }

    //mismatched input

    //invalid edit password test method - mismatched confirm password (the upper boundary error wasn't triggered, test has failed)
    protected void invalidEditMismatchedConfirmPasswordTest() {
        GeneralPage generalPage = new GeneralPage(driver);
        MyAccountPage myAccountPage = new MyAccountPage(driver);
        EditPasswordPage editPasswordPage = new EditPasswordPage(driver);
        EditPasswordInvalidSingularInput editPasswordInvalidSingularInput = new EditPasswordInvalidSingularInput(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //click aside 'Password' link
        myAccountPage.clickAsidePasswordLink();
        //edit password page web element assert
        isEditPasswordPageWebElementDisplayed(editPasswordPage);
        //edit password page text element assert
        isEditPasswordPageTextElementAsExpected(editPasswordPage);
        //capture screenshot before invalid password input
        captureScreenshot(driver, "Edit Password Page Before Invalid Password Input");
        //valid password getter
        editPasswordInvalidSingularInput.invalidPasswordMismatchedConfirmPasswordGetter();
        //input password into password input field
        editPasswordInvalidSingularInput.inputPasswordIntoPasswordInputField();
        //input mismatching confirm password into confirm password input field
        editPasswordInvalidSingularInput.inputMismatchingConfirmPasswordIntoConfirmPasswordInputField();
        //click 'Continue' button
        editPasswordPage.clickEditPasswordContinueButton();
        //assert the user gets an expected error message, otherwise, log the issue
        try {
            assertEquals("Password confirmation does not match password!", editPasswordInvalidSingularInput.getInvalidSingularInputError(), "The mismatched password input error doesn't match expectations=.");
        } catch (NoSuchElementException nse) {
            logger.error("The mismatched password input error wasn't triggered.");
        }
        //capture screenshot of the test data result
        captureScreenshot(driver, "Invalid Password Edit Test Result - Mismatched Confirm Password");
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //valid singular user address addition test

    //valid user address addition test method (setting as default address)
    protected void validUserSingleMainAddressAdditionTest(AddAddressPage addAddressPage){
        GeneralPage generalPage = new GeneralPage(driver);
        RegisterPage registerPage = new RegisterPage(driver);
        MyAccountPage myAccountPage = new MyAccountPage(driver);
        AddressBookEntriesPage addressBookEntriesPage = new AddressBookEntriesPage(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //click 'Modify Address Book Entries' link
        myAccountPage.clickModifyAddressBookEntriesLink();
        //address book entries text element assert
        isAddressBookEntriesPageTextElementAsExpected(addressBookEntriesPage);
        //assert the user gets an expected message (since the user doesn't have the address yet)
        assertEquals("You have no addresses in your account.", addressBookEntriesPage.getAddressBookEntriesPageNoAddressMessage(), "The 'No address' message text doesn't match expectations or the message isn't displayed.");
        //capture screenshot to verify no addresses have been input yet
        captureScreenshot(driver, "Address Book Entries Page Display With No Addresses");
        //click 'New Address' button
        addressBookEntriesPage.clickNewAddressButton();
        //add address page web element assert
        isAddAddressPageWebElementDisplayed(addAddressPage);
        //add address text element assert
        isAddAddressPageTextElementAsExpected(addAddressPage);
        //capture screenshot before valid user address input
        captureScreenshot(driver, "Address Page Display Before Valid Address Data Input");
        //valid user address data getter
        addAddressPage.validUserAddressDataGetter(registerPage);
        //input valid user first name
        addAddressPage.inputValidFirstNameIntoFirstNameInputField();
        //input valid user last name
        addAddressPage.inputValidLastNameIntoLastNameInputField();
        //input valid user address (address1)
        addAddressPage.inputValidAddress1IntoAddress1InputField();
        //input valid user city
        addAddressPage.inputValidCityIntoCityInputField();
        //input valid user post code
        addAddressPage.inputValidPostCodeIntoPostCodeInputField();
        //click country dropdown menu
        addAddressPage.clickCountryDropdownMenu();
        //select 'United States'
        addAddressPage.selectUsCountryOption();
        //click state dropdown menu
        addAddressPage.clickStateDropdownMenu();
        //select 'Illinois' option
        addAddressPage.selectIllinoisStateOption();
        //click 'Yes' default address radio button
        addAddressPage.clickYesDefaultAddressRadioButton();
        //click 'Continue' button
        addAddressPage.clickAddressContinueButton();
        //assert the user get an expected success message
        assertEquals("Your address has been successfully added", addressBookEntriesPage.getAddressAdditionSuccessMessage(), "The address addition success message doesn't match expectations or the address addition has failed.");
        //log default user address data
        logAddressBookEntriesPageEntryData(addressBookEntriesPage);
        //capture screenshot of the test result
        captureScreenshot(driver, "Valid User Main Address Input Test Result");
    }

    //valid multiple address addition test

    //valid multiple addresses addition test method (one default, other not)
    protected void validUserMultipleAddressesAdditionTest(AddAddressPage addAddressPage){
        GeneralPage generalPage = new GeneralPage(driver);
        RegisterPage registerPage = new RegisterPage(driver);
        MyAccountPage myAccountPage = new MyAccountPage(driver);
        AddressBookEntriesPage addressBookEntriesPage = new AddressBookEntriesPage(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //click 'Modify Address Book Entries' link
        myAccountPage.clickModifyAddressBookEntriesLink();
        //address book entries text element assert
        isAddressBookEntriesPageTextElementAsExpected(addressBookEntriesPage);
        //assert the user gets an expected message (since the user doesn't have the address yet)
        assertEquals("You have no addresses in your account.", addressBookEntriesPage.getAddressBookEntriesPageNoAddressMessage(), "The 'No address' message text doesn't match expectations or the message isn't displayed.");
        //capture screenshot to verify no addresses have been input yet
        captureScreenshot(driver, "Address Book Entries Page Display With No Addresses");
        //click 'New Address' button
        addressBookEntriesPage.clickNewAddressButton();
        //add address page web element assert
        isAddAddressPageWebElementDisplayed(addAddressPage);
        //add address text element assert
        isAddAddressPageTextElementAsExpected(addAddressPage);
        //capture screenshot before valid user address input
        captureScreenshot(driver, "Address Page Display Before Valid Address Data Input");
        //valid user address data getter
        addAddressPage.validUserAddressDataGetter(registerPage);
        //input valid user first name
        addAddressPage.inputValidFirstNameIntoFirstNameInputField();
        //input valid user last name
        addAddressPage.inputValidLastNameIntoLastNameInputField();
        //input valid user address (address1)
        addAddressPage.inputValidAddress1IntoAddress1InputField();
        //input valid user city
        addAddressPage.inputValidCityIntoCityInputField();
        //input valid user post code
        addAddressPage.inputValidPostCodeIntoPostCodeInputField();
        //click country dropdown menu
        addAddressPage.clickCountryDropdownMenu();
        //select 'United States'
        addAddressPage.selectUsCountryOption();
        //click state dropdown menu
        addAddressPage.clickStateDropdownMenu();
        //select 'Illinois' option
        addAddressPage.selectIllinoisStateOption();
        //click 'Yes' default address radio button
        addAddressPage.clickYesDefaultAddressRadioButton();
        //click 'Continue' button
        addAddressPage.clickAddressContinueButton();
        //assert the user get an expected success message
        assertEquals("Your address has been successfully added", addressBookEntriesPage.getAddressAdditionSuccessMessage(), "The address addition success message doesn't match expectations or the address addition has failed.");
        //log first user address data
        logAddressBookEntriesPageEntryData(addressBookEntriesPage);
        //capture screenshot after valid user address input
        captureScreenshot(driver, "Valid Main Address Data Input");
        //address book entries web element assert
        isAddressBookEntriesPageWebElementDisplayed(addressBookEntriesPage);
        //address book entries text element assert
        isAddressBookEntriesPageTextElementAsExpected(addressBookEntriesPage);
        //click 'New Address' button
        addressBookEntriesPage.clickNewAddressButton();
        //add address page web element assert
        isAddAddressPageWebElementDisplayed(addAddressPage);
        //add address text element assert
        isAddAddressPageTextElementAsExpected(addAddressPage);
        //capture screenshot before second valid user address input
        captureScreenshot(driver, "Address Page Display Before Second Valid Address Data Input");
        //valid user address data getter
        addAddressPage.validUserAddressDataGetter(registerPage);
        //input valid user first name
        addAddressPage.inputValidFirstNameIntoFirstNameInputField();
        //input valid user last name
        addAddressPage.inputValidLastNameIntoLastNameInputField();
        //input valid user address (address1)
        addAddressPage.inputValidAddress1IntoAddress1InputField();
        //input valid user city
        addAddressPage.inputValidCityIntoCityInputField();
        //input valid user post code
        addAddressPage.inputValidPostCodeIntoPostCodeInputField();
        //click country dropdown menu
        addAddressPage.clickCountryDropdownMenu();
        //select 'United States'
        addAddressPage.selectUsCountryOption();
        //click state dropdown menu
        addAddressPage.clickStateDropdownMenu();
        //select 'Alabama' option
        addAddressPage.selectAlabamaStateOption();
        //click 'Continue' button
        addAddressPage.clickAddressContinueButton();
        //assert the user get an expected success message
        assertEquals("Your address has been successfully added", addressBookEntriesPage.getAddressAdditionSuccessMessage(), "The address addition success message doesn't match expectations or the address addition has failed.");
        //log both user addresses data
        logAddressBookEntriesPageEntryData(addressBookEntriesPage);
        //capture screenshot of the test result
        captureScreenshot(driver, "Valid Multiple Addresses Input Test Result");
    }

    //invalid user address addition tests

    //no singular input

    //invalid user address addition test method - no user first name
    protected void invalidUserSingleAddressAdditionNoFirstNameTest(AddAddressPage addAddressPage){
        GeneralPage generalPage = new GeneralPage(driver);
        RegisterPage registerPage = new RegisterPage(driver);
        MyAccountPage myAccountPage = new MyAccountPage(driver);
        AddressBookEntriesPage addressBookEntriesPage = new AddressBookEntriesPage(driver);
        AddAddressPageNoSingularInput addAddressPageNoSingularInput = new AddAddressPageNoSingularInput(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //click aside 'Address Book' link
        myAccountPage.clickAsideAddressBookLink();
        //address book entries text element assert
        isAddressBookEntriesPageTextElementAsExpected(addressBookEntriesPage);
        //assert the user gets an expected message (since the user doesn't have the address yet)
        assertEquals("You have no addresses in your account.", addressBookEntriesPage.getAddressBookEntriesPageNoAddressMessage(), "The 'No address' message text doesn't match expectations or the message isn't displayed.");
        //capture screenshot to verify no addresses have been input yet
        captureScreenshot(driver, "Address Book Entries Page Display With No Addresses");
        //click 'New Address' button
        addressBookEntriesPage.clickNewAddressButton();
        //add address page web element assert
        isAddAddressPageWebElementDisplayed(addAddressPage);
        //add address text element assert
        isAddAddressPageTextElementAsExpected(addAddressPage);
        //capture screenshot before invalid user address input
        captureScreenshot(driver, "Address Page Display Before Invalid Address Data Input");
        //invalid user address data getter - no user first name
        addAddressPageNoSingularInput.invalidUserAddressDataNoFirstNameGetter(registerPage);
        //don't input user first name
        addAddressPageNoSingularInput.inputNoFirstNameIntoFirstNameInputField();
        //capture screenshot of the invalid input
        captureScreenshot(driver, "Invalid Address Data Input - No First Name");
        //input valid user last name
        addAddressPageNoSingularInput.inputValidLastNameIntoLastNameInputField();
        //input valid user address (address1)
        addAddressPageNoSingularInput.inputValidAddress1IntoAddress1InputField();
        //input valid user city
        addAddressPageNoSingularInput.inputValidCityIntoCityInputField();
        //input valid user post code
        addAddressPageNoSingularInput.inputValidPostCodeIntoPostCodeInputField();
        //click country dropdown menu
        addAddressPage.clickCountryDropdownMenu();
        //select 'United States'
        addAddressPage.selectUsCountryOption();
        //click state dropdown menu
        addAddressPage.clickStateDropdownMenu();
        //select 'Illinois' option
        addAddressPage.selectIllinoisStateOption();
        //click 'Yes' default address radio button
        addAddressPage.clickYesDefaultAddressRadioButton();
        //click 'Continue' button
        addAddressPage.clickAddressContinueButton();
        //assert the user get an expected error message
        assertEquals("First Name must be between 1 and 32 characters!", addAddressPageNoSingularInput.getInvalidInputError(), "The missing first name input error doesn't match expectations or the error wasn't triggered.");
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Main Address Input Test Result - No User First Name");
    }

    //invalid user address addition test method - no user last name
    protected void invalidUserSingleAddressAdditionNoLastNameTest(AddAddressPage addAddressPage){
        GeneralPage generalPage = new GeneralPage(driver);
        RegisterPage registerPage = new RegisterPage(driver);
        MyAccountPage myAccountPage = new MyAccountPage(driver);
        AddressBookEntriesPage addressBookEntriesPage = new AddressBookEntriesPage(driver);
        AddAddressPageNoSingularInput addAddressPageNoSingularInput = new AddAddressPageNoSingularInput(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //click aside 'Address Book' link
        myAccountPage.clickAsideAddressBookLink();
        //address book entries text element assert
        isAddressBookEntriesPageTextElementAsExpected(addressBookEntriesPage);
        //assert the user gets an expected message (since the user doesn't have the address yet)
        assertEquals("You have no addresses in your account.", addressBookEntriesPage.getAddressBookEntriesPageNoAddressMessage(), "The 'No address' message text doesn't match expectations or the message isn't displayed.");
        //capture screenshot to verify no addresses have been input yet
        captureScreenshot(driver, "Address Book Entries Page Display With No Addresses");
        //click 'New Address' button
        addressBookEntriesPage.clickNewAddressButton();
        //add address page web element assert
        isAddAddressPageWebElementDisplayed(addAddressPage);
        //add address text element assert
        isAddAddressPageTextElementAsExpected(addAddressPage);
        //capture screenshot before invalid user address input
        captureScreenshot(driver, "Address Page Display Before Invalid Address Data Input");
        //invalid user address data getter - no user last name
        addAddressPageNoSingularInput.invalidUserAddressDataNoLastNameGetter(registerPage);
        //input valid user first name
        addAddressPageNoSingularInput.inputValidFirstNameIntoFirstNameInputField();
        //don't input user last name
        addAddressPageNoSingularInput.inputNoLastNameIntoLastNameInputField();
        //capture screenshot of the invalid input
        captureScreenshot(driver, "Invalid Address Data Input - No Last Name");
        //input valid user address (address1)
        addAddressPageNoSingularInput.inputValidAddress1IntoAddress1InputField();
        //input valid user city
        addAddressPageNoSingularInput.inputValidCityIntoCityInputField();
        //input valid user post code
        addAddressPageNoSingularInput.inputValidPostCodeIntoPostCodeInputField();
        //click country dropdown menu
        addAddressPage.clickCountryDropdownMenu();
        //select 'United States'
        addAddressPage.selectUsCountryOption();
        //click state dropdown menu
        addAddressPage.clickStateDropdownMenu();
        //select 'Illinois' option
        addAddressPage.selectIllinoisStateOption();
        //click 'Yes' default address radio button
        addAddressPage.clickYesDefaultAddressRadioButton();
        //click 'Continue' button
        addAddressPage.clickAddressContinueButton();
        //assert the user get an expected error message
        assertEquals("Last Name must be between 1 and 32 characters!", addAddressPageNoSingularInput.getInvalidInputError(), "The missing last name input error doesn't match expectations or the error wasn't triggered.");
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Main Address Input Test Result - No User Last Name");
    }

    //invalid user address addition test method - no user address data
    protected void invalidUserSingleAddressAdditionNoAddress1Test(AddAddressPage addAddressPage){
        GeneralPage generalPage = new GeneralPage(driver);
        RegisterPage registerPage = new RegisterPage(driver);
        MyAccountPage myAccountPage = new MyAccountPage(driver);
        AddressBookEntriesPage addressBookEntriesPage = new AddressBookEntriesPage(driver);
        AddAddressPageNoSingularInput addAddressPageNoSingularInput = new AddAddressPageNoSingularInput(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //click aside 'Address Book' link
        myAccountPage.clickAsideAddressBookLink();
        //address book entries text element assert
        isAddressBookEntriesPageTextElementAsExpected(addressBookEntriesPage);
        //assert the user gets an expected message (since the user doesn't have the address yet)
        assertEquals("You have no addresses in your account.", addressBookEntriesPage.getAddressBookEntriesPageNoAddressMessage(), "The 'No address' message text doesn't match expectations or the message isn't displayed.");
        //capture screenshot to verify no addresses have been input yet
        captureScreenshot(driver, "Address Book Entries Page Display With No Addresses");
        //click 'New Address' button
        addressBookEntriesPage.clickNewAddressButton();
        //add address page web element assert
        isAddAddressPageWebElementDisplayed(addAddressPage);
        //add address text element assert
        isAddAddressPageTextElementAsExpected(addAddressPage);
        //capture screenshot before invalid user address input
        captureScreenshot(driver, "Address Page Display Before Invalid Address Data Input");
        //invalid user address data getter - no user address (address 1)
        addAddressPageNoSingularInput.invalidUserAddressDataNoAddressGetter(registerPage);
        //input valid user first name
        addAddressPageNoSingularInput.inputValidFirstNameIntoFirstNameInputField();
        //input valid user last name
        addAddressPageNoSingularInput.inputValidLastNameIntoLastNameInputField();
        //don't input user address (address1)
        addAddressPageNoSingularInput.inputNoAddress1IntoAddress1InputField();
        //capture screenshot of the invalid input
        captureScreenshot(driver, "Invalid Address Data Input - No Address");
        //input valid user city
        addAddressPageNoSingularInput.inputValidCityIntoCityInputField();
        //input valid user post code
        addAddressPageNoSingularInput.inputValidPostCodeIntoPostCodeInputField();
        //click country dropdown menu
        addAddressPage.clickCountryDropdownMenu();
        //select 'United States'
        addAddressPage.selectUsCountryOption();
        //click state dropdown menu
        addAddressPage.clickStateDropdownMenu();
        //select 'Illinois' option
        addAddressPage.selectIllinoisStateOption();
        //click 'Yes' default address radio button
        addAddressPage.clickYesDefaultAddressRadioButton();
        //click 'Continue' button
        addAddressPage.clickAddressContinueButton();
        //assert the user get an expected error message
        assertEquals("Address must be between 3 and 128 characters!", addAddressPageNoSingularInput.getInvalidInputError(), "The missing address input error doesn't match expectations or the error wasn't triggered.");
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Main Address Input Test Result - No User Address");
    }

    //invalid user address addition test method - no user city
    protected void invalidUserSingleAddressAdditionNoCityTest(AddAddressPage addAddressPage){
        GeneralPage generalPage = new GeneralPage(driver);
        RegisterPage registerPage = new RegisterPage(driver);
        MyAccountPage myAccountPage = new MyAccountPage(driver);
        AddressBookEntriesPage addressBookEntriesPage = new AddressBookEntriesPage(driver);
        AddAddressPageNoSingularInput addAddressPageNoSingularInput = new AddAddressPageNoSingularInput(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //click aside 'Address Book' link
        myAccountPage.clickAsideAddressBookLink();
        //address book entries text element assert
        isAddressBookEntriesPageTextElementAsExpected(addressBookEntriesPage);
        //assert the user gets an expected message (since the user doesn't have the address yet)
        assertEquals("You have no addresses in your account.", addressBookEntriesPage.getAddressBookEntriesPageNoAddressMessage(), "The 'No address' message text doesn't match expectations or the message isn't displayed.");
        //capture screenshot to verify no addresses have been input yet
        captureScreenshot(driver, "Address Book Entries Page Display With No Addresses");
        //click 'New Address' button
        addressBookEntriesPage.clickNewAddressButton();
        //add address page web element assert
        isAddAddressPageWebElementDisplayed(addAddressPage);
        //add address text element assert
        isAddAddressPageTextElementAsExpected(addAddressPage);
        //capture screenshot before invalid user address input
        captureScreenshot(driver, "Address Page Display Before Invalid Address Data Input");
        //invalid user address data getter - no user city
        addAddressPageNoSingularInput.invalidUserAddressDataNoCityGetter(registerPage);
        //input valid user first name
        addAddressPageNoSingularInput.inputValidFirstNameIntoFirstNameInputField();
        //input valid user last name
        addAddressPageNoSingularInput.inputValidLastNameIntoLastNameInputField();
        //input valid user address
        addAddressPageNoSingularInput.inputValidAddress1IntoAddress1InputField();
        //don't input user city
        addAddressPageNoSingularInput.inputNoCityIntoCityInputField();
        //capture screenshot of the invalid input
        captureScreenshot(driver, "Invalid Address Data Input - No City");
        //input valid user post code
        addAddressPageNoSingularInput.inputValidPostCodeIntoPostCodeInputField();
        //click country dropdown menu
        addAddressPage.clickCountryDropdownMenu();
        //select 'United States'
        addAddressPage.selectUsCountryOption();
        //click state dropdown menu
        addAddressPage.clickStateDropdownMenu();
        //select 'Illinois' option
        addAddressPage.selectIllinoisStateOption();
        //click 'Yes' default address radio button
        addAddressPage.clickYesDefaultAddressRadioButton();
        //click 'Continue' button
        addAddressPage.clickAddressContinueButton();
        //assert the user get an expected error message
        assertEquals("City must be between 2 and 128 characters!", addAddressPageNoSingularInput.getInvalidInputError(), "The missing city input error doesn't match expectations or the error wasn't triggered.");
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Main Address Input Test Result - No User City");
    }

    //invalid user address addition test method - no user country
    protected void invalidUserSingleAddressAdditionNoCountryTest(AddAddressPage addAddressPage){
        GeneralPage generalPage = new GeneralPage(driver);
        RegisterPage registerPage = new RegisterPage(driver);
        MyAccountPage myAccountPage = new MyAccountPage(driver);
        AddressBookEntriesPage addressBookEntriesPage = new AddressBookEntriesPage(driver);
        AddAddressPageNoSingularInput addAddressPageNoSingularInput = new AddAddressPageNoSingularInput(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //click 'Modify Address Book Entries' link
        myAccountPage.clickModifyAddressBookEntriesLink();
        //address book entries text element assert
        isAddressBookEntriesPageTextElementAsExpected(addressBookEntriesPage);
        //assert the user gets an expected message (since the user doesn't have the address yet)
        assertEquals("You have no addresses in your account.", addressBookEntriesPage.getAddressBookEntriesPageNoAddressMessage(), "The 'No address' message text doesn't match expectations or the message isn't displayed.");
        //capture screenshot to verify no addresses have been input yet
        captureScreenshot(driver, "Address Book Entries Page Display With No Addresses");
        //click 'New Address' button
        addressBookEntriesPage.clickNewAddressButton();
        //add address page web element assert
        isAddAddressPageWebElementDisplayed(addAddressPage);
        //add address text element assert
        isAddAddressPageTextElementAsExpected(addAddressPage);
        //capture screenshot before invalid user address input
        captureScreenshot(driver, "Address Page Display Before Invalid Address Data Input");
        //valid user address data getter
        addAddressPage.validUserAddressDataGetter(registerPage);
        //input valid user first name
        addAddressPage.inputValidFirstNameIntoFirstNameInputField();
        //input valid user last name
        addAddressPage.inputValidLastNameIntoLastNameInputField();
        //input valid user address (address1)
        addAddressPage.inputValidAddress1IntoAddress1InputField();
        //input valid user city
        addAddressPage.inputValidCityIntoCityInputField();
        //input valid user post code
        addAddressPage.inputValidPostCodeIntoPostCodeInputField();
        //click country dropdown menu
        addAddressPageNoSingularInput.clickCountryDropdownMenu();
        //select 'Please Select' (blank) country option
        addAddressPageNoSingularInput.selectPleaseSelectCountryOption();
        //capture screenshot of the invalid input
        captureScreenshot(driver, "Invalid Address Data Input - No Country");
        //click 'Yes' default address radio button
        addAddressPage.clickYesDefaultAddressRadioButton();
        //click 'Continue' button
        addAddressPage.clickAddressContinueButton();
        //assert the user get an expected error message
        assertEquals("Please select a country!", addAddressPageNoSingularInput.getInvalidInputError(), "The missing country input error doesn't match expectations or the error wasn't triggered.");
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Main Address Input Test Result - No User Country");
    }

    //invalid user address addition test method - no user state
    protected void invalidUserSingleAddressAdditionNoStateTest(AddAddressPage addAddressPage){
        GeneralPage generalPage = new GeneralPage(driver);
        RegisterPage registerPage = new RegisterPage(driver);
        MyAccountPage myAccountPage = new MyAccountPage(driver);
        AddressBookEntriesPage addressBookEntriesPage = new AddressBookEntriesPage(driver);
        AddAddressPageNoSingularInput addAddressPageNoSingularInput = new AddAddressPageNoSingularInput(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //click 'Modify Address Book Entries' link
        myAccountPage.clickModifyAddressBookEntriesLink();
        //address book entries text element assert
        isAddressBookEntriesPageTextElementAsExpected(addressBookEntriesPage);
        //assert the user gets an expected message (since the user doesn't have the address yet)
        assertEquals("You have no addresses in your account.", addressBookEntriesPage.getAddressBookEntriesPageNoAddressMessage(), "The 'No address' message text doesn't match expectations or the message isn't displayed.");
        //capture screenshot to verify no addresses have been input yet
        captureScreenshot(driver, "Address Book Entries Page Display With No Addresses");
        //click 'New Address' button
        addressBookEntriesPage.clickNewAddressButton();
        //add address page web element assert
        isAddAddressPageWebElementDisplayed(addAddressPage);
        //add address text element assert
        isAddAddressPageTextElementAsExpected(addAddressPage);
        //capture screenshot before invalid user address input
        captureScreenshot(driver, "Address Page Display Before Invalid Address Data Input");
        //valid user address data getter
        addAddressPage.validUserAddressDataGetter(registerPage);
        //input valid user first name
        addAddressPage.inputValidFirstNameIntoFirstNameInputField();
        //input valid user last name
        addAddressPage.inputValidLastNameIntoLastNameInputField();
        //input valid user address (address1)
        addAddressPage.inputValidAddress1IntoAddress1InputField();
        //input valid user city
        addAddressPage.inputValidCityIntoCityInputField();
        //input valid user post code
        addAddressPage.inputValidPostCodeIntoPostCodeInputField();
        //click country dropdown menu
        addAddressPage.clickCountryDropdownMenu();
        //select 'United States'
        addAddressPage.selectUsCountryOption();
        //capture screenshot of the invalid input
        captureScreenshot(driver, "Invalid Address Data Input - No State");
        //click 'Yes' default address radio button
        addAddressPage.clickYesDefaultAddressRadioButton();
        //click 'Continue' button
        addAddressPage.clickAddressContinueButton();
        //assert the user get an expected error message
        assertEquals("Please select a region / state!", addAddressPageNoSingularInput.getInvalidInputError(), "The missing state error doesn't match expectations or the error wasn't triggered.");
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Main Address Input Test Result - No User State");
    }

    //too short singular input

    //invalid user address addition test method - too short user first name (1 char) (the user address gets added, test has failed)
    protected void invalidUserSingleAddressAdditionTooShortFirstNameTest(AddAddressPage addAddressPage){
        GeneralPage generalPage = new GeneralPage(driver);
        RegisterPage registerPage = new RegisterPage(driver);
        MyAccountPage myAccountPage = new MyAccountPage(driver);
        AddressBookEntriesPage addressBookEntriesPage = new AddressBookEntriesPage(driver);
        AddAddressPageTooShortSingularInput addAddressPageTooShortSingularInput = new AddAddressPageTooShortSingularInput(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //click aside 'Address Book' link
        myAccountPage.clickAsideAddressBookLink();
        //address book entries text element assert
        isAddressBookEntriesPageTextElementAsExpected(addressBookEntriesPage);
        //assert the user gets an expected message (since the user doesn't have the address yet)
        assertEquals("You have no addresses in your account.", addressBookEntriesPage.getAddressBookEntriesPageNoAddressMessage(), "The 'No address' message text doesn't match expectations or the message isn't displayed.");
        //capture screenshot to verify no addresses have been input yet
        captureScreenshot(driver, "Address Book Entries Page Display With No Addresses");
        //click 'New Address' button
        addressBookEntriesPage.clickNewAddressButton();
        //add address page web element assert
        isAddAddressPageWebElementDisplayed(addAddressPage);
        //add address text element assert
        isAddAddressPageTextElementAsExpected(addAddressPage);
        //capture screenshot before invalid user address input
        captureScreenshot(driver, "Address Page Display Before Invalid Address Data Input");
        //invalid user address data getter - too short user first name (1 char)
        addAddressPageTooShortSingularInput.invalidUserAddressDataTooShortFirstNameGetter(registerPage);
        //input too short user first name (1 char)
        addAddressPageTooShortSingularInput.inputTooShortFirstNameIntoFirstNameInputField();
        //capture screenshot of the invalid input
        captureScreenshot(driver, "Invalid Address Data Input - Too Short First Name");
        //input valid user last name
        addAddressPageTooShortSingularInput.inputValidLastNameIntoLastNameInputField();
        //input valid user address (address1)
        addAddressPageTooShortSingularInput.inputValidAddress1IntoAddress1InputField();
        //input valid user city
        addAddressPageTooShortSingularInput.inputValidCityIntoCityInputField();
        //input valid user post code
        addAddressPageTooShortSingularInput.inputValidPostCodeIntoPostCodeInputField();
        //click country dropdown menu
        addAddressPage.clickCountryDropdownMenu();
        //select 'United States'
        addAddressPage.selectUsCountryOption();
        //click state dropdown menu
        addAddressPage.clickStateDropdownMenu();
        //select 'Illinois' option
        addAddressPage.selectIllinoisStateOption();
        //click 'Yes' default address radio button
        addAddressPage.clickYesDefaultAddressRadioButton();
        //click 'Continue' button
        addAddressPage.clickAddressContinueButton();
        //assert the user get an expected error message, otherwise, log the issue
        try {
            assertEquals("First Name must be between 1 and 32 characters!", addAddressPageTooShortSingularInput.getInvalidInputError(), "The too short first name input error doesn't match expectations.");
        } catch (NoSuchElementException nse) {
            logger.error("The too short first name error wasn't triggered.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Main Address Input Test Result - Too Short User First Name");
    }

    //invalid user address addition test method - too short user last name (1 char) (the user address gets added, test has failed)
    protected void invalidUserSingleAddressAdditionTooShortLastNameTest(AddAddressPage addAddressPage){
        GeneralPage generalPage = new GeneralPage(driver);
        RegisterPage registerPage = new RegisterPage(driver);
        MyAccountPage myAccountPage = new MyAccountPage(driver);
        AddressBookEntriesPage addressBookEntriesPage = new AddressBookEntriesPage(driver);
        AddAddressPageTooShortSingularInput addAddressPageTooShortSingularInput = new AddAddressPageTooShortSingularInput(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //click aside 'Address Book' link
        myAccountPage.clickAsideAddressBookLink();
        //address book entries text element assert
        isAddressBookEntriesPageTextElementAsExpected(addressBookEntriesPage);
        //assert the user gets an expected message (since the user doesn't have the address yet)
        assertEquals("You have no addresses in your account.", addressBookEntriesPage.getAddressBookEntriesPageNoAddressMessage(), "The 'No address' message text doesn't match expectations or the message isn't displayed.");
        //capture screenshot to verify no addresses have been input yet
        captureScreenshot(driver, "Address Book Entries Page Display With No Addresses");
        //click 'New Address' button
        addressBookEntriesPage.clickNewAddressButton();
        //add address page web element assert
        isAddAddressPageWebElementDisplayed(addAddressPage);
        //add address text element assert
        isAddAddressPageTextElementAsExpected(addAddressPage);
        //capture screenshot before invalid user address input
        captureScreenshot(driver, "Address Page Display Before Invalid Address Data Input");
        //invalid user address data getter - too short user last name (1 char)
        addAddressPageTooShortSingularInput.invalidUserAddressDataTooShortLastNameGetter(registerPage);
        //input valid user first name
        addAddressPageTooShortSingularInput.inputValidFirstNameIntoFirstNameInputField();
        //input too short user last name
        addAddressPageTooShortSingularInput.inputTooShortLastNameIntoLastNameInputField();
        //capture screenshot of the invalid input
        captureScreenshot(driver, "Invalid Address Data Input - Too Short Last Name");
        //input valid user address (address1)
        addAddressPageTooShortSingularInput.inputValidAddress1IntoAddress1InputField();
        //input valid user city
        addAddressPageTooShortSingularInput.inputValidCityIntoCityInputField();
        //input valid user post code
        addAddressPageTooShortSingularInput.inputValidPostCodeIntoPostCodeInputField();
        //click country dropdown menu
        addAddressPage.clickCountryDropdownMenu();
        //select 'United States'
        addAddressPage.selectUsCountryOption();
        //click state dropdown menu
        addAddressPage.clickStateDropdownMenu();
        //select 'Illinois' option
        addAddressPage.selectIllinoisStateOption();
        //click 'Yes' default address radio button
        addAddressPage.clickYesDefaultAddressRadioButton();
        //click 'Continue' button
        addAddressPage.clickAddressContinueButton();
        //assert the user get an expected error message, otherwise, log the issue
        try {
            assertEquals("Last Name must be between 1 and 32 characters!", addAddressPageTooShortSingularInput.getInvalidInputError(), "The too short last name input error doesn't match expectations.");
        } catch (NoSuchElementException nse) {
            logger.error("The too short last name error wasn't triggered.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Main Address Input Test Result - Too Short User Last Name");
    }

    //invalid user address addition test method - too short user address (2 chars)
    protected void invalidUserSingleAddressAdditionTooShortAddress1Test(AddAddressPage addAddressPage){
        GeneralPage generalPage = new GeneralPage(driver);
        RegisterPage registerPage = new RegisterPage(driver);
        MyAccountPage myAccountPage = new MyAccountPage(driver);
        AddressBookEntriesPage addressBookEntriesPage = new AddressBookEntriesPage(driver);
        AddAddressPageTooShortSingularInput addAddressPageTooShortSingularInput = new AddAddressPageTooShortSingularInput(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //click aside 'Address Book' link
        myAccountPage.clickAsideAddressBookLink();
        //address book entries text element assert
        isAddressBookEntriesPageTextElementAsExpected(addressBookEntriesPage);
        //assert the user gets an expected message (since the user doesn't have the address yet)
        assertEquals("You have no addresses in your account.", addressBookEntriesPage.getAddressBookEntriesPageNoAddressMessage(), "The 'No address' message text doesn't match expectations or the message isn't displayed.");
        //capture screenshot to verify no addresses have been input yet
        captureScreenshot(driver, "Address Book Entries Page Display With No Addresses");
        //click 'New Address' button
        addressBookEntriesPage.clickNewAddressButton();
        //add address page web element assert
        isAddAddressPageWebElementDisplayed(addAddressPage);
        //add address text element assert
        isAddAddressPageTextElementAsExpected(addAddressPage);
        //capture screenshot before invalid user address input
        captureScreenshot(driver, "Address Page Display Before Invalid Address Data Input");
        //invalid user address data getter - too short user address (2 chars)
        addAddressPageTooShortSingularInput.invalidUserAddressDataTooShortAddressGetter(registerPage);
        //input valid user first name
        addAddressPageTooShortSingularInput.inputValidFirstNameIntoFirstNameInputField();
        //input valid user last name
        addAddressPageTooShortSingularInput.inputValidLastNameIntoLastNameInputField();
        //input too short user address (address1)
        addAddressPageTooShortSingularInput.inputTooShortAddress1IntoAddress1InputField();
        //capture screenshot of the invalid input
        captureScreenshot(driver, "Invalid Address Data Input - Too Short Address");
        //input valid user city
        addAddressPageTooShortSingularInput.inputValidCityIntoCityInputField();
        //input valid user post code
        addAddressPageTooShortSingularInput.inputValidPostCodeIntoPostCodeInputField();
        //click country dropdown menu
        addAddressPage.clickCountryDropdownMenu();
        //select 'United States'
        addAddressPage.selectUsCountryOption();
        //click state dropdown menu
        addAddressPage.clickStateDropdownMenu();
        //select 'Illinois' option
        addAddressPage.selectIllinoisStateOption();
        //click 'Yes' default address radio button
        addAddressPage.clickYesDefaultAddressRadioButton();
        //click 'Continue' button
        addAddressPage.clickAddressContinueButton();
        //assert the user get an expected error message, otherwise, log the issue
        try {
            assertEquals("Address must be between 3 and 128 characters!", addAddressPageTooShortSingularInput.getInvalidInputError(), "The too short address input error doesn't match expectations.");
        } catch (NoSuchElementException nse) {
            logger.error("The too short address error wasn't triggered.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Main Address Input Test Result - Too Short User Address");
    }

    //invalid user address addition test method - too short user city (1 char)
    protected void invalidUserSingleAddressAdditionTooShortCityTest(AddAddressPage addAddressPage){
        GeneralPage generalPage = new GeneralPage(driver);
        RegisterPage registerPage = new RegisterPage(driver);
        MyAccountPage myAccountPage = new MyAccountPage(driver);
        AddressBookEntriesPage addressBookEntriesPage = new AddressBookEntriesPage(driver);
        AddAddressPageTooShortSingularInput addAddressPageTooShortSingularInput = new AddAddressPageTooShortSingularInput(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //click aside 'Address Book' link
        myAccountPage.clickAsideAddressBookLink();
        //address book entries text element assert
        isAddressBookEntriesPageTextElementAsExpected(addressBookEntriesPage);
        //assert the user gets an expected message (since the user doesn't have the address yet)
        assertEquals("You have no addresses in your account.", addressBookEntriesPage.getAddressBookEntriesPageNoAddressMessage(), "The 'No address' message text doesn't match expectations or the message isn't displayed.");
        //capture screenshot to verify no addresses have been input yet
        captureScreenshot(driver, "Address Book Entries Page Display With No Addresses");
        //click 'New Address' button
        addressBookEntriesPage.clickNewAddressButton();
        //add address page web element assert
        isAddAddressPageWebElementDisplayed(addAddressPage);
        //add address text element assert
        isAddAddressPageTextElementAsExpected(addAddressPage);
        //capture screenshot before invalid user address input
        captureScreenshot(driver, "Address Page Display Before Invalid Address Data Input");
        //invalid user address data getter - too short user city (1 char)
        addAddressPageTooShortSingularInput.invalidUserAddressDataTooShortCityGetter(registerPage);
        //input valid user first name
        addAddressPageTooShortSingularInput.inputValidFirstNameIntoFirstNameInputField();
        //input valid user last name
        addAddressPageTooShortSingularInput.inputValidLastNameIntoLastNameInputField();
        //input valid short user address (address1)
        addAddressPageTooShortSingularInput.inputValidAddress1IntoAddress1InputField();
        //input too short user city
        addAddressPageTooShortSingularInput.inputTooShortCityIntoCityInputField();
        //capture screenshot of the invalid input
        captureScreenshot(driver, "Invalid Address Data Input - Too Short City");
        //input valid user post code
        addAddressPageTooShortSingularInput.inputValidPostCodeIntoPostCodeInputField();
        //click country dropdown menu
        addAddressPage.clickCountryDropdownMenu();
        //select 'United States'
        addAddressPage.selectUsCountryOption();
        //click state dropdown menu
        addAddressPage.clickStateDropdownMenu();
        //select 'Illinois' option
        addAddressPage.selectIllinoisStateOption();
        //click 'Yes' default address radio button
        addAddressPage.clickYesDefaultAddressRadioButton();
        //click 'Continue' button
        addAddressPage.clickAddressContinueButton();
        //assert the user get an expected error message, otherwise, log the issue
        try {
            assertEquals("City must be between 2 and 128 characters!", addAddressPageTooShortSingularInput.getInvalidInputError(), "The too short city input error doesn't match expectations.");
        } catch (NoSuchElementException nse) {
            logger.error("The too short city error wasn't triggered.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Main Address Input Test Result - Too Short User City");
    }

    //too long singular input

    //invalid user address addition test method - too long user first name (33 chars)
    protected void invalidUserSingleAddressAdditionTooLongFirstNameTest(AddAddressPage addAddressPage){
        GeneralPage generalPage = new GeneralPage(driver);
        RegisterPage registerPage = new RegisterPage(driver);
        MyAccountPage myAccountPage = new MyAccountPage(driver);
        AddressBookEntriesPage addressBookEntriesPage = new AddressBookEntriesPage(driver);
        AddAddressPageTooLongSingularInput addAddressPageTooLongSingularInput = new AddAddressPageTooLongSingularInput(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //click aside 'Address Book' link
        myAccountPage.clickAsideAddressBookLink();
        //address book entries text element assert
        isAddressBookEntriesPageTextElementAsExpected(addressBookEntriesPage);
        //assert the user gets an expected message (since the user doesn't have the address yet)
        assertEquals("You have no addresses in your account.", addressBookEntriesPage.getAddressBookEntriesPageNoAddressMessage(), "The 'No address' message text doesn't match expectations or the message isn't displayed.");
        //capture screenshot to verify no addresses have been input yet
        captureScreenshot(driver, "Address Book Entries Page Display With No Addresses");
        //click 'New Address' button
        addressBookEntriesPage.clickNewAddressButton();
        //add address page web element assert
        isAddAddressPageWebElementDisplayed(addAddressPage);
        //add address text element assert
        isAddAddressPageTextElementAsExpected(addAddressPage);
        //capture screenshot before invalid user address input
        captureScreenshot(driver, "Address Page Display Before Invalid Address Data Input");
        //invalid user address data getter - too long user first name (33 chars)
        addAddressPageTooLongSingularInput.invalidUserAddressDataTooLongFirstNameGetter(registerPage);
        //input too long user first name (33 chars)
        addAddressPageTooLongSingularInput.inputTooLongFirstNameIntoFirstNameInputField();
        //capture screenshot of the invalid input
        captureScreenshot(driver, "Invalid Address Data Input - Too Long First Name");
        //input valid user last name
        addAddressPageTooLongSingularInput.inputValidLastNameIntoLastNameInputField();
        //input valid user address (address1)
        addAddressPageTooLongSingularInput.inputValidAddress1IntoAddress1InputField();
        //input valid user city
        addAddressPageTooLongSingularInput.inputValidCityIntoCityInputField();
        //input valid user post code
        addAddressPageTooLongSingularInput.inputValidPostCodeIntoPostCodeInputField();
        //click country dropdown menu
        addAddressPage.clickCountryDropdownMenu();
        //select 'United States'
        addAddressPage.selectUsCountryOption();
        //click state dropdown menu
        addAddressPage.clickStateDropdownMenu();
        //select 'Illinois' option
        addAddressPage.selectIllinoisStateOption();
        //click 'Yes' default address radio button
        addAddressPage.clickYesDefaultAddressRadioButton();
        //click 'Continue' button
        addAddressPage.clickAddressContinueButton();
        //assert the user get an expected error message, otherwise, log the issue
        try {
            assertEquals("First Name must be between 1 and 32 characters!", addAddressPageTooLongSingularInput.getInvalidInputError(), "The too long first name input error doesn't match expectations.");
        } catch (NoSuchElementException nse) {
            logger.error("The too long first name error wasn't triggered.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Main Address Input Test Result - Too Long User First Name");
    }

    //invalid user address addition test method - too long user last name (33 chars)
    protected void invalidUserSingleAddressAdditionTooLongLastNameTest(AddAddressPage addAddressPage){
        GeneralPage generalPage = new GeneralPage(driver);
        RegisterPage registerPage = new RegisterPage(driver);
        MyAccountPage myAccountPage = new MyAccountPage(driver);
        AddressBookEntriesPage addressBookEntriesPage = new AddressBookEntriesPage(driver);
        AddAddressPageTooLongSingularInput addAddressPageTooLongSingularInput = new AddAddressPageTooLongSingularInput(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //click aside 'Address Book' link
        myAccountPage.clickAsideAddressBookLink();
        //address book entries text element assert
        isAddressBookEntriesPageTextElementAsExpected(addressBookEntriesPage);
        //assert the user gets an expected message (since the user doesn't have the address yet)
        assertEquals("You have no addresses in your account.", addressBookEntriesPage.getAddressBookEntriesPageNoAddressMessage(), "The 'No address' message text doesn't match expectations or the message isn't displayed.");
        //capture screenshot to verify no addresses have been input yet
        captureScreenshot(driver, "Address Book Entries Page Display With No Addresses");
        //click 'New Address' button
        addressBookEntriesPage.clickNewAddressButton();
        //add address page web element assert
        isAddAddressPageWebElementDisplayed(addAddressPage);
        //add address text element assert
        isAddAddressPageTextElementAsExpected(addAddressPage);
        //capture screenshot before invalid user address input
        captureScreenshot(driver, "Address Page Display Before Invalid Address Data Input");
        //invalid user address data getter - too long user last name (33 chars)
        addAddressPageTooLongSingularInput.invalidUserAddressDataTooLongLastNameGetter(registerPage);
        //input valid user first name
        addAddressPageTooLongSingularInput.inputValidFirstNameIntoFirstNameInputField();
        //input too long user last name (33 chars)
        addAddressPageTooLongSingularInput.inputTooLongLastNameIntoLastNameInputField();
        //capture screenshot of the invalid input
        captureScreenshot(driver, "Invalid Address Data Input - Too Long Last Name");
        //input valid user address (address1)
        addAddressPageTooLongSingularInput.inputValidAddress1IntoAddress1InputField();
        //input valid user city
        addAddressPageTooLongSingularInput.inputValidCityIntoCityInputField();
        //input valid user post code
        addAddressPageTooLongSingularInput.inputValidPostCodeIntoPostCodeInputField();
        //click country dropdown menu
        addAddressPage.clickCountryDropdownMenu();
        //select 'United States'
        addAddressPage.selectUsCountryOption();
        //click state dropdown menu
        addAddressPage.clickStateDropdownMenu();
        //select 'Illinois' option
        addAddressPage.selectIllinoisStateOption();
        //click 'Yes' default address radio button
        addAddressPage.clickYesDefaultAddressRadioButton();
        //click 'Continue' button
        addAddressPage.clickAddressContinueButton();
        //assert the user get an expected error message, otherwise, log the issue
        try {
            assertEquals("Last Name must be between 1 and 32 characters!", addAddressPageTooLongSingularInput.getInvalidInputError(), "The too long last name input error doesn't match expectations.");
        } catch (NoSuchElementException nse) {
            logger.error("The too long last name error wasn't triggered.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Main Address Input Test Result - Too Long User Last Name");
    }

    //invalid user address addition test method - too long user address (129 chars)
    protected void invalidUserSingleAddressAdditionTooLongAddressTest(AddAddressPage addAddressPage){
        GeneralPage generalPage = new GeneralPage(driver);
        RegisterPage registerPage = new RegisterPage(driver);
        MyAccountPage myAccountPage = new MyAccountPage(driver);
        AddressBookEntriesPage addressBookEntriesPage = new AddressBookEntriesPage(driver);
        AddAddressPageTooLongSingularInput addAddressPageTooLongSingularInput = new AddAddressPageTooLongSingularInput(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //click aside 'Address Book' link
        myAccountPage.clickAsideAddressBookLink();
        //address book entries text element assert
        isAddressBookEntriesPageTextElementAsExpected(addressBookEntriesPage);
        //assert the user gets an expected message (since the user doesn't have the address yet)
        assertEquals("You have no addresses in your account.", addressBookEntriesPage.getAddressBookEntriesPageNoAddressMessage(), "The 'No address' message text doesn't match expectations or the message isn't displayed.");
        //capture screenshot to verify no addresses have been input yet
        captureScreenshot(driver, "Address Book Entries Page Display With No Addresses");
        //click 'New Address' button
        addressBookEntriesPage.clickNewAddressButton();
        //add address page web element assert
        isAddAddressPageWebElementDisplayed(addAddressPage);
        //add address text element assert
        isAddAddressPageTextElementAsExpected(addAddressPage);
        //capture screenshot before invalid user address input
        captureScreenshot(driver, "Address Page Display Before Invalid Address Data Input");
        //invalid user address data getter - too long user address (address1) (129 chars)
        addAddressPageTooLongSingularInput.invalidUserAddressDataTooLongAddressGetter(registerPage);
        //input valid user first name
        addAddressPageTooLongSingularInput.inputValidFirstNameIntoFirstNameInputField();
        //input valid user last name
        addAddressPageTooLongSingularInput.inputValidLastNameIntoLastNameInputField();
        //input too long user address (address1) (129 chars)
        addAddressPageTooLongSingularInput.inputTooLongAddress1IntoAddress1InputField();
        //capture screenshot of the invalid input
        captureScreenshot(driver, "Invalid Address Data Input - Too Long Address");
        //input valid user city
        addAddressPageTooLongSingularInput.inputValidCityIntoCityInputField();
        //input valid user post code
        addAddressPageTooLongSingularInput.inputValidPostCodeIntoPostCodeInputField();
        //click country dropdown menu
        addAddressPage.clickCountryDropdownMenu();
        //select 'United States'
        addAddressPage.selectUsCountryOption();
        //click state dropdown menu
        addAddressPage.clickStateDropdownMenu();
        //select 'Illinois' option
        addAddressPage.selectIllinoisStateOption();
        //click 'Yes' default address radio button
        addAddressPage.clickYesDefaultAddressRadioButton();
        //click 'Continue' button
        addAddressPage.clickAddressContinueButton();
        //assert the user get an expected error message, otherwise, log the issue
        try {
            assertEquals("Address must be between 3 and 128 characters!", addAddressPageTooLongSingularInput.getInvalidInputError(), "The too long address input error doesn't match expectations.");
        } catch (NoSuchElementException nse) {
            logger.error("The too long address error wasn't triggered.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Main Address Input Test Result - Too Long User Address");
    }

    //invalid user address addition test method - too long user city (129 chars)
    protected void invalidUserSingleAddressAdditionTooLongCityTest(AddAddressPage addAddressPage){
        GeneralPage generalPage = new GeneralPage(driver);
        RegisterPage registerPage = new RegisterPage(driver);
        MyAccountPage myAccountPage = new MyAccountPage(driver);
        AddressBookEntriesPage addressBookEntriesPage = new AddressBookEntriesPage(driver);
        AddAddressPageTooLongSingularInput addAddressPageTooLongSingularInput = new AddAddressPageTooLongSingularInput(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //click aside 'Address Book' link
        myAccountPage.clickAsideAddressBookLink();
        //address book entries text element assert
        isAddressBookEntriesPageTextElementAsExpected(addressBookEntriesPage);
        //assert the user gets an expected message (since the user doesn't have the address yet)
        assertEquals("You have no addresses in your account.", addressBookEntriesPage.getAddressBookEntriesPageNoAddressMessage(), "The 'No address' message text doesn't match expectations or the message isn't displayed.");
        //capture screenshot to verify no addresses have been input yet
        captureScreenshot(driver, "Address Book Entries Page Display With No Addresses");
        //click 'New Address' button
        addressBookEntriesPage.clickNewAddressButton();
        //add address page web element assert
        isAddAddressPageWebElementDisplayed(addAddressPage);
        //add address text element assert
        isAddAddressPageTextElementAsExpected(addAddressPage);
        //capture screenshot before invalid user address input
        captureScreenshot(driver, "Address Page Display Before Invalid Address Data Input");
        //invalid user address data getter - too long user city (129 chars)
        addAddressPageTooLongSingularInput.invalidUserAddressDataTooLongCityGetter(registerPage);
        //input valid user first name
        addAddressPageTooLongSingularInput.inputValidFirstNameIntoFirstNameInputField();
        //input valid user last name
        addAddressPageTooLongSingularInput.inputValidLastNameIntoLastNameInputField();
        //input valid user address (address1)
        addAddressPageTooLongSingularInput.inputValidAddress1IntoAddress1InputField();
        //input too long user city
        addAddressPageTooLongSingularInput.inputTooLongCityIntoCityInputField();
        //capture screenshot of the invalid input
        captureScreenshot(driver, "Invalid Address Data Input - Too Long City");
        //input valid user post code
        addAddressPageTooLongSingularInput.inputValidPostCodeIntoPostCodeInputField();
        //click country dropdown menu
        addAddressPage.clickCountryDropdownMenu();
        //select 'United States'
        addAddressPage.selectUsCountryOption();
        //click state dropdown menu
        addAddressPage.clickStateDropdownMenu();
        //select 'Illinois' option
        addAddressPage.selectIllinoisStateOption();
        //click 'Yes' default address radio button
        addAddressPage.clickYesDefaultAddressRadioButton();
        //click 'Continue' button
        addAddressPage.clickAddressContinueButton();
        //assert the user get an expected error message, otherwise, log the issue
        try {
            assertEquals("City must be between 2 and 128 characters!", addAddressPageTooLongSingularInput.getInvalidInputError(), "The too long city input error doesn't match expectations.");
        } catch (NoSuchElementException nse) {
            logger.error("The too long city error wasn't triggered.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Main Address Input Test Result - Too Long User City");
    }

    //invalid singular input format

    //invalid user address addition test method - invalid user first name format (special symbols and digits) (the error wasn't triggered, test has failed)
    protected void invalidUserSingleAddressAdditionInvalidFirstNameFormatTest(AddAddressPage addAddressPage){
        GeneralPage generalPage = new GeneralPage(driver);
        RegisterPage registerPage = new RegisterPage(driver);
        MyAccountPage myAccountPage = new MyAccountPage(driver);
        AddressBookEntriesPage addressBookEntriesPage = new AddressBookEntriesPage(driver);
        AddAddressPageInvalidSingularInput addAddressPageInvalidSingularInput = new AddAddressPageInvalidSingularInput(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //click aside 'Address Book' link
        myAccountPage.clickAsideAddressBookLink();
        //address book entries text element assert
        isAddressBookEntriesPageTextElementAsExpected(addressBookEntriesPage);
        //assert the user gets an expected message (since the user doesn't have the address yet)
        assertEquals("You have no addresses in your account.", addressBookEntriesPage.getAddressBookEntriesPageNoAddressMessage(), "The 'No address' message text doesn't match expectations or the message isn't displayed.");
        //capture screenshot to verify no addresses have been input yet
        captureScreenshot(driver, "Address Book Entries Page Display With No Addresses");
        //click 'New Address' button
        addressBookEntriesPage.clickNewAddressButton();
        //add address page web element assert
        isAddAddressPageWebElementDisplayed(addAddressPage);
        //add address text element assert
        isAddAddressPageTextElementAsExpected(addAddressPage);
        //capture screenshot before invalid user address input
        captureScreenshot(driver, "Address Page Display Before Invalid Address Data Input");
        //invalid user address data getter - invalid user first name format (special symbols and digits)
        addAddressPageInvalidSingularInput.invalidUserAddressDataInvalidFirstNameFormatGetter(registerPage);
        //input invalid user first name format (special symbols and digits)
        addAddressPageInvalidSingularInput.inputInvalidFirstNameFormatIntoFirstNameInputField();
        //capture screenshot of the invalid input
        captureScreenshot(driver, "Invalid Address Data Input - Invalid First Name Format");
        //input valid user last name
        addAddressPageInvalidSingularInput.inputValidLastNameIntoLastNameInputField();
        //input valid user address (address1)
        addAddressPageInvalidSingularInput.inputValidAddress1IntoAddress1InputField();
        //input valid user city
        addAddressPageInvalidSingularInput.inputValidCityIntoCityInputField();
        //input valid user post code
        addAddressPageInvalidSingularInput.inputValidPostCodeIntoPostCodeInputField();
        //click country dropdown menu
        addAddressPage.clickCountryDropdownMenu();
        //select 'United States'
        addAddressPage.selectUsCountryOption();
        //click state dropdown menu
        addAddressPage.clickStateDropdownMenu();
        //select 'Illinois' option
        addAddressPage.selectIllinoisStateOption();
        //click 'Yes' default address radio button
        addAddressPage.clickYesDefaultAddressRadioButton();
        //click 'Continue' button
        addAddressPage.clickAddressContinueButton();
        //assert the user get an expected error message, otherwise, log the issue
        try {
            assertEquals("First Name cannot consist of special symbols and digits!", addAddressPageInvalidSingularInput.getInvalidInputError(), "The invalid first name input format error doesn't match expectations.");
        } catch (NoSuchElementException nse) {
            logger.error("The invalid first name input format error wasn't triggered.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Main Address Input Test Result - Invalid User First Name Format");
    }

    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //general page web elements assert test method (elements all pages possess)
    protected void isGeneralPageWebElementDisplayed(GeneralPage generalPage){
        //top navbar
        //assert currency dropdown menu is displayed
        assertTrue(generalPage.isCurrencyDropdownMenuDisplayed(), "The currency dropdown menu isn't displayed");
        //assert phone contact icon link is displayed
        assertTrue(generalPage.isPhoneContactIconLinkDisplayed(), "The phone contact icon link isn't displayed");
        //assert account dropdown menu is displayed
        assertTrue(generalPage.isAccountDropdownMenuDisplayed(), "The account dropdown menu isn't displayed");
        //assert wishlist icon link is displayed
        assertTrue(generalPage.isWishlistIconLinkDisplayed(), "The wishlist icon link isn't displayed");
        //assert shopping cart icon link is displayed
        assertTrue(generalPage.isShoppingCartIconLinkDisplayed(), "The shopping cart icon link isn't displayed");
        //assert checkout icon link is displayed
        assertTrue(generalPage.isCheckoutIconLinkDisplayed(), "The checkout icon link isn't displayed");
        //header
        //assert search bar input field is displayed
        assertTrue(generalPage.isSearchBarInputFieldDisplayed(), "The search bar input field isn't displayed");
        //assert search button is displayed
        assertTrue(generalPage.isSearchButtonDisplayed(), "The search button isn't displayed");
        //assert shopping cart button is displayed
        assertTrue(generalPage.isShoppingCartButtonDisplayed(), "The shopping cart button isn't displayed");
        //assert home page logo link is displayed
        assertTrue(generalPage.isHomePageLogoLinkDisplayed(), "The home page logo link isn't displayed");
        //header navbar
        //assert desktops nav link is displayed
        assertTrue(generalPage.isDesktopsNavLinkDisplayed(), "The desktops nav link isn't displayed");
        //assert laptops and notebooks nav link is displayed
        assertTrue(generalPage.isLaptopsNavLinkDisplayed(), "The laptops and notebooks nav link isn't displayed");
        //assert components nav link is displayed
        assertTrue(generalPage.isComponentsNavLinkDisplayed(), "The components nav link isn't displayed");
        //assert tablets nav link is displayed
        assertTrue(generalPage.isTabletsNavLinkDisplayed(), "The tablets nav link isn't displayed");
        //assert software nav link is displayed
        assertTrue(generalPage.isSoftwareNavLinkDisplayed(), "The software nav link isn't displayed");
        //assert phones nav link is displayed
        assertTrue(generalPage.isPhonesNavLinkDisplayed(), "The phones nav link isn't displayed");
        //assert cameras nav link is displayed
        assertTrue(generalPage.isCamerasNavLinkDisplayed(), "The cameras nav link isn't displayed");
        //assert mp3 players nav link is displayed
        assertTrue(generalPage.isMP3PlayersNavLinkDisplayed(), "The mp3 players nav link isn't displayed");
        //footer
        //assert footer information section title is displayed
        assertTrue(generalPage.isFooterInformationSectionTitleDisplayed(), "The footer information section title isn't displayed");
        //assert footer information 'About us' link is displayed
        assertTrue(generalPage.isFooterInfoAboutUsLinkDisplayed(), "The footer information section 'About us' link isn't displayed");
        //assert footer information 'Delivery information' link is displayed
        assertTrue(generalPage.isFooterInfoDeliveryInfoLinkDisplayed(), "The footer information section 'Delivery information' link isn't displayed");
        //assert footer information 'Privacy Policy' link is displayed
        assertTrue(generalPage.isFooterInfoPrivacyPolicyLinkDisplayed(), "The footer information section 'Privacy Policy' link isn't displayed");
        //assert footer information 'Terms and Conditions' link is displayed
        assertTrue(generalPage.isFooterInfoTermsAndConditionsLinkDisplayed(), "The footer information section 'Terms and Conditions' link isn't displayed");
        //assert footer customer service section title is displayed
        assertTrue(generalPage.isFooterCustomerServiceSectionTitleDisplayed(), "The footer customer service section title isn't displayed");
        //assert footer customer service 'Contact us' link is displayed
        assertTrue(generalPage.isFooterCustServiceContactUsLinkDisplayed(), "The footer customer service section 'Contact us' link isn't displayed");
        //assert footer customer service 'Returns' link is displayed
        assertTrue(generalPage.isFooterCustServiceReturnsLinkDisplayed(), "The footer customer service section 'Returns' link isn't displayed");
        //assert footer customer service 'Site Map' link is displayed
        assertTrue(generalPage.isFooterCustServiceSiteMapLinkDisplayed(), "The footer customer service section 'Site Map' link isn't displayed");
        //assert footer extras section title is displayed
        assertTrue(generalPage.isFooterExtrasSectionTitleDisplayed(), "The footer extras section title isn't displayed");
        //assert footer extras 'Brands' link is displayed
        assertTrue(generalPage.isFooterExtrasBrandsLinkDisplayed(), "The footer extras section 'Brands' link isn't displayed");
        //assert footer extras 'Gift Certificates' link is displayed
        assertTrue(generalPage.isFooterExtrasGiftCertificatesLinkDisplayed(), "The footer extras section 'Gift Certificates' link isn't displayed");
        //assert footer extras 'Affiliates' link is displayed
        assertTrue(generalPage.isFooterExtrasAffiliatesLinkDisplayed(), "The footer extras section 'Affiliates' link isn't displayed");
        //assert footer extras 'Specials' link is displayed
        assertTrue(generalPage.isFooterExtrasSpecialsLinkDisplayed(), "The footer extras section 'Specials' link isn't displayed");
        //assert footer my account section title is displayed
        assertTrue(generalPage.isFooterMyAccountSectionTitleDisplayed(), "The footer my account section title isn't displayed");
        //assert footer my account link is displayed
        assertTrue(generalPage.isFooterMyAccountLinkDisplayed(), "The footer 'My account' link isn't displayed");
        //assert footer my account order history link is displayed
        assertTrue(generalPage.isFooterMyAccountOrderHistoryLinkDisplayed(), "The footer my account section 'Order history' link isn't displayed");
        //assert footer my account wishlist link is displayed
        assertTrue(generalPage.isFooterMyAccountWishListLinkDisplayed(), "The footer my account section 'Wishlist' link isn't displayed");
        //assert footer my account newsletter link is displayed
        assertTrue(generalPage.isFooterMyAccountNewsletterLinkDisplayed(), "The footer my account section 'Newsletter' link isn't displayed");
        //assert footer copyright text is displayed
        assertTrue(generalPage.isFooterCopyrightTextDisplayed(), "The footer copyright text isn't displayed");
        //assert footer opencart link is displayed
        assertTrue(generalPage.isFooterOpenCartLinkDisplayed(), "The footer Opencart link isn't displayed");
    }

    //home page web element assert test method
    protected void isHomePageWebElementDisplayed(HomePage homePage) {
        //main
        //assert home page product image carousel is displayed
        assertTrue(homePage.isHomePageProductImgCarouselDisplayed(), "The home page product image carousel isn't displayed");
        //assert home page product image carousel dot left button is displayed
        assertTrue(homePage.isHomePageProductImgCarouselDotLeftButtonDisplayed(), "The home page product image carousel dot left button isn't displayed");
        //assert home page product image carousel dot right button is displayed
        assertTrue(homePage.isHomePageProductImgCarouselDotRightButtonDisplayed(), "The home page product image carousel dot right button isn't displayed");
        //assert home page featured product section title is displayed
        assertTrue(homePage.isHomePageFeaturedProductSectionTitleDisplayed(), "The home page featured product section title isn't displayed");
        //assert home page featured product image links are displayed (as a list)
        assertTrue(homePage.isHomePageFeaturedProductImgLinkDisplayed(), "The home page featured product image links aren't displayed");
        //assert home page featured product name links are displayed (as a list)
        assertTrue(homePage.isHomePageFeaturedProductNameLinkDisplayed(), "The home page featured product name links aren't displayed");
        //assert home page featured product descriptions are displayed (as a list)
        assertTrue(homePage.isHomePageFeaturedProductDescDisplayed(), "The home page featured product descriptions aren't displayed");
        //assert home page featured product unit price are displayed (as a list)
        assertTrue(homePage.isHomePageFeaturedProductUnitPriceDisplayed(), "The home page featured product unit prices aren't displayed");
        //assert home page featured product 'Add to cart' buttons are displayed (as a list)
        assertTrue(homePage.isHomePageFeaturedProductAddToCartButtonDisplayed(), "The home page featured product 'Add to cart' buttons aren't displayed");
        //assert home page featured product 'Add to wishlist' buttons are displayed (as a list)
        assertTrue(homePage.isHomePageFeaturedProductAddToWishlistButtonDisplayed(), "The home page featured product 'Add to wishlist' buttons aren't displayed");
        //assert home page featured product 'Add to compare' buttons are displayed (as a list)
        assertTrue(homePage.isHomePageFeaturedProductAddToCompareButtonDisplayed(), "The home page featured product 'Add to compare' buttons aren't displayed");
        //assert home page brands image carousel is displayed
        assertTrue(homePage.isHomePageBrandsImageCarouselDisplayed(), "The home page brands image carousel isn't displayed");
        //assert home page brands image carousel dot buttons are displayed (as a list)
        assertTrue(homePage.isHomePageBrandsImageCarouselDotButtonDisplayed(), "The home page brands image carousel dot buttons aren't displayed");
    }

    //register/login dashboard page web element assert test method
    protected void isRegisterLoginDashboardPageWebElementDisplayed(RegisterLoginDashboardPage registerLoginDashboardPage) {
        MyAccountPage myAccountPage = new MyAccountPage(driver);
        //assert register/login dashboard page breadcrumb is displayed (as a list)
        assertTrue(myAccountPage.isPageBreadcrumbDisplayed(), "The register/login dashboard page breadcrumb isn't displayed");
        //new customer section
        //assert register/login dashboard page new customer section title is displayed
        assertTrue(registerLoginDashboardPage.isNewCustomerSectionTitleDisplayed(), "The register/login dashboard page new customer section title isn't displayed");
        //assert register/login dashboard page new customer section subtitle is displayed
        assertTrue(registerLoginDashboardPage.isNewCustomerSectionSubtitleDisplayed(), "The register/login dashboard page new customer section subtitle isn't displayed");
        //assert register/login dashboard page new customer section description is displayed
        assertTrue(registerLoginDashboardPage.isNewCustomerSectionDescriptionDisplayed(), "The register/login dashboard page new customer section description isn't displayed");
        //assert register/login dashboard page new customer continue button is displayed
        assertTrue(registerLoginDashboardPage.isNewCustomerContinueButtonDisplayed(), "The register/login dashboard page new customer section continue button isn't displayed");
        //login section
        //assert register/login dashboard page returning customer section title is displayed
        assertTrue(registerLoginDashboardPage.isReturningCustomerSectionTitleDisplayed(), "The register/login dashboard page returning customer section title isn't displayed");
        //assert register/login dashboard page returning customer section subtitle is displayed
        assertTrue(registerLoginDashboardPage.isReturningCustomerSectionSubtitleDisplayed(), "The register/login dashboard page returning customer section subtitle isn't displayed");
        //assert register/login dashboard page login email subtitle is displayed
        assertTrue(registerLoginDashboardPage.isLoginEmailSubtitleDisplayed(), "The register/login dashboard page login email subtitle isn't displayed");
        //assert register/login dashboard page login email input field is displayed
        assertTrue(registerLoginDashboardPage.isLoginEmailInputFieldDisplayed(), "The register/login dashboard page login email input field isn't displayed");
        //assert register/login dashboard page login password subtitle is displayed
        assertTrue(registerLoginDashboardPage.isLoginPasswordSubtitleDisplayed(), "The register/login dashboard page login password subtitle isn't displayed");
        //assert register/login dashboard page login password input field is displayed
        assertTrue(registerLoginDashboardPage.isLoginPasswordInputFieldDisplayed(), "The register/login dashboard page login password input field isn't displayed");
        //assert register/login dashboard page login forgotten password link is displayed
        assertTrue(registerLoginDashboardPage.isLoginForgottenPasswordLinkDisplayed(), "The register/login dashboard page login forgotten password link isn't displayed");
        //assert register/login dashboard page login button is displayed
        assertTrue(registerLoginDashboardPage.isLoginButtonDisplayed(), "The register/login dashboard page login button isn't displayed");
        //aside section assert
        isMyAccountAsideSectionWebElementDisplayed(myAccountPage);
    }

    //register page web element assert test method
    protected void isRegisterPageWebElementDisplayed(RegisterPage registerPage) {
        //assert register page title is displayed
        assertTrue(registerPage.isRegisterPageTitleDisplayed(), "The register page title isn't displayed");
        //assert register page subtitle is displayed
        assertTrue(registerPage.isRegisterPageSubtitleDisplayed(), "The register page subtitle isn't displayed");
        //assert register page login page link is displayed
        assertTrue(registerPage.isRegisterPageLoginPageLinkDisplayed(), "The register page login page link isn't displayed");
        //personal details section
        //assert register page personal details section title is displayed
        assertTrue(registerPage.isRegisterPagePersonalDetailsSectionTitleDisplayed(), "The register page personal details section title isn't displayed");
        //assert register page first name subtitle is displayed
        assertTrue(registerPage.isRegisterPageFirstNameSubtitleDisplayed(), "The register page first name subtitle isn't displayed");
        //assert register page first name input field is displayed
        assertTrue(registerPage.isRegisterPageFirstNameInputFieldDisplayed(), "The register page first name input field isn't displayed");
        //assert register page last name subtitle is displayed
        assertTrue(registerPage.isRegisterPageLastNameSubtitleDisplayed(), "The register page last name subtitle isn't displayed");
        //assert register page last name input field is displayed
        assertTrue(registerPage.isRegisterPageLastNameInputFieldDisplayed(), "The register page last name input field isn't displayed");
        //assert register page email subtitle is displayed
        assertTrue(registerPage.isRegisterPageEmailSubtitleDisplayed(), "The register page email subtitle isn't displayed");
        //assert register page email input field is displayed
        assertTrue(registerPage.isRegisterPageEmailInputFieldDisplayed(), "The register page email input field isn't displayed");
        //assert register page phone subtitle is displayed
        assertTrue(registerPage.isRegisterPagePhoneSubtitleDisplayed(), "The register page phone subtitle isn't displayed");
        //assert register page phone input field is displayed
        assertTrue(registerPage.isRegisterPagePhoneInputFieldDisplayed(), "The register page phone input field isn't displayed");
        //password section
        //assert register page password section title is displayed
        assertTrue(registerPage.isRegisterPagePasswordSectionTitleDisplayed(), "The register page password section title isn't displayed");
        //assert register page password subtitle is displayed
        assertTrue(registerPage.isRegisterPagePasswordSubtitleDisplayed(), "The register page password subtitle isn't displayed");
        //assert register page password input field is displayed
        assertTrue(registerPage.isRegisterPagePasswordInputFieldDisplayed(), "The register page password input field isn't displayed");
        //assert register page confirm password subtitle is displayed
        assertTrue(registerPage.isRegisterPageConfirmPasswordSubtitleDisplayed(), "The register page confirm password subtitle isn't displayed");
        //assert register page confirm password input field is displayed
        assertTrue(registerPage.isRegisterPageConfirmPasswordInputFieldDisplayed(), "The register page confirm password input field isn't displayed");
        //newsletter section
        //assert register page newsletter section title is displayed
        assertTrue(registerPage.isRegisterPageNewsletterSectionTitleDisplayed(), "The register page newsletter section title isn't displayed");
        //assert register page newsletter subtitle is displayed
        assertTrue(registerPage.isRegisterPageNewsletterSubtitleDisplayed(), "The register page newsletter subtitle isn't displayed");
        //assert register page newsletter subscribe radio button is displayed
        assertTrue(registerPage.isRegisterPageNewsletterSubscribeRadioButtonDisplayed(), "The register page newsletter subscribe radio button isn't displayed");
        //assert register page newsletter don't subscribe radio button is displayed
        assertTrue(registerPage.isRegisterPageNewsletterDontSubscribeRadioButtonDisplayed(), "The register page newsletter don't subscribe radio button isn't displayed");//assert register page newsletter section title is displayed
        //remaining elements
        //assert register page privacy policy subtext is displayed
        assertTrue(registerPage.isRegisterPagePrivacyPolicySubtextDisplayed(), "The register page privacy policy subtext isn't displayed");
        //assert register page privacy policy link is displayed
        assertTrue(registerPage.isRegisterPagePrivacyPolicyLinkDisplayed(), "The register page privacy policy link isn't displayed");
        //assert register page privacy policy checkbox is displayed
        assertTrue(registerPage.isRegisterPagePrivacyPolicyCheckboxDisplayed(), "The register page privacy policy checkbox isn't displayed");
        //assert register page continue button is displayed
        assertTrue(registerPage.isRegisterPageContinueButtonDisplayed(), "The register page continue button isn't displayed");
    }

    //my account page web element assert test method
    protected void isMyAccountPageWebElementDisplayed(MyAccountPage myAccountPage) {
        //assert my account page breadcrumb is displayed (as a list)
        assertTrue(myAccountPage.isPageBreadcrumbDisplayed(), "The my account page breadcrumb isn't displayed");
        //my account section
        //assert my account page my account section title is displayed
        assertTrue(myAccountPage.isMyAccountPageMyAccountSectionTitleDisplayed(), "The my account page my account section title isn't displayed");
        //assert my account page edit account link is displayed
        assertTrue(myAccountPage.isMyAccountPageEditAccountInfoLinkDisplayed(), "The my account page edit account link isn't displayed");
        //assert my account page change password link is displayed
        assertTrue(myAccountPage.isMyAccountPageChangePasswordLinkDisplayed(), "The my account page change password link isn't displayed");
        //assert my account page modify address book is displayed
        assertTrue(myAccountPage.isMyAccountPageModifyAddressBookLinkDisplayed(), "The my account page modify address book isn't displayed");
        //assert my account page modify wishlist link is displayed
        assertTrue(myAccountPage.isMyAccountPageModifyWishlistLinkDisplayed(), "The my account page modify wishlist link isn't displayed");
        //my orders section
        //assert my account page my orders section title is displayed
        assertTrue(myAccountPage.isMyAccountPageMyOrdersSectionTitleDisplayed(), "The my account page my orders section title isn't displayed");
        //assert my account page view order history link is displayed
        assertTrue(myAccountPage.isMyAccountPageViewOrderHistoryLinkDisplayed(), "The my account page view order history link isn't displayed");
        //assert my account page downloads link is displayed
        assertTrue(myAccountPage.isMyAccountPageDownloadsLinkDisplayed(), "The my account page downloads link isn't displayed");
        //assert my account page reward points link is displayed
        assertTrue(myAccountPage.isMyAccountPageRewardPointsLinkDisplayed(), "The my account page reward points link isn't displayed");
        //assert my account page return requests link is displayed
        assertTrue(myAccountPage.isMyAccountPageReturnRequestsLinkDisplayed(), "The my account page return requests link isn't displayed");
        //assert my account page transactions link is displayed
        assertTrue(myAccountPage.isMyAccountPageTransactionsLinkDisplayed(), "The my account page transactions link isn't displayed");
        //assert my account page payments link is displayed
        assertTrue(myAccountPage.isMyAccountPagePaymentsLinkDisplayed(), "The my account page payments link isn't displayed");
        //my affiliate account section
        //assert my account page my affiliate account section title is displayed
        assertTrue(myAccountPage.isMyAccountPageMyAffiliateAccountSectionTitleDisplayed(), "The my account page my affiliate account section title isn't displayed");
        //assert my account page register affiliate account link is displayed
        assertTrue(myAccountPage.isMyAccountPageRegisterAffiliateAccountLinkDisplayed(), "The my account page register affiliate account link isn't displayed");
        //newsletter section
        //assert my account page newsletter section title is displayed
        assertTrue(myAccountPage.isMyAccountPageNewsletterSectionTitleDisplayed(), "The my account page newsletter section title isn't displayed");
        //assert my account page subscribe/not subscribe to newsletter link is displayed
        assertTrue(myAccountPage.isMyAccountPageSubscribeNewsletterLinkDisplayed(), "The my account page subscribe/not subscribe to newsletter link isn't displayed");
        //aside section assert
        isMyAccountAsideSectionWebElementDisplayed(myAccountPage);
    }

    //my account aside page web elements (not only 'My Account' page has this aside section, the link names only differ)
    protected void isMyAccountAsideSectionWebElementDisplayed(MyAccountPage myAccountPage) {
        //aside section
        //assert aside my account link is displayed
        assertTrue(myAccountPage.isMyAccountPageAsideMyAccountLinkDisplayed(), "The my account page page aside section 'My Account' link isn't displayed");
        //assert aside edit account link is displayed
        assertTrue(myAccountPage.isMyAccountPageAsideEditAccountLinkDisplayed(), "The my account page aside section edit account link isn't displayed");
        //assert aside password link is displayed
        assertTrue(myAccountPage.isMyAccountPageAsidePasswordLinkDisplayed(), "The my account page aside section password link isn't displayed");
        //assert aside my account link is displayed
        assertTrue(myAccountPage.isMyAccountPageAsideAddressBookLinkDisplayed(), "The my account page aside section address book link isn't displayed");
        //assert aside wishlist link is displayed
        assertTrue(myAccountPage.isMyAccountPageAsideWishlistLinkDisplayed(), "The my account page aside section wishlist link isn't displayed");
        //assert aside order history link is displayed
        assertTrue(myAccountPage.isMyAccountPageAsideOrderHistoryLinkDisplayed(), "The my account page aside section order history link isn't displayed");
        //assert aside downloads link is displayed
        assertTrue(myAccountPage.isMyAccountPageAsideDownloadsLinkDisplayed(), "The my account page aside section downloads link isn't displayed");
        //assert aside recurring payments link is displayed
        assertTrue(myAccountPage.isMyAccountPageAsideRecurringPaymentsLinkDisplayed(), "The my account page aside section recurring payments link isn't displayed");
        //assert aside reward points link is displayed
        assertTrue(myAccountPage.isMyAccountPageAsideRewardPointsLinkDisplayed(), "The my account page aside section reward points link isn't displayed");
        //assert aside returns link is displayed
        assertTrue(myAccountPage.isMyAccountPageAsideReturnsLinkDisplayed(), "The my account page aside section returns link isn't displayed");
        //assert aside returns link is displayed
        assertTrue(myAccountPage.isMyAccountPageAsideTransactionsLinkDisplayed(), "The my account page aside section transactions link isn't displayed");
        //assert aside newsletter link is displayed
        assertTrue(myAccountPage.isMyAccountPageAsideNewsletterLinkDisplayed(), "The my account page aside section newsletter link isn't displayed");
        //assert aside newsletter link is displayed
        assertTrue(myAccountPage.isMyAccountPageAsideLogoutLinkDisplayed(), "The my account page aside section logout link isn't displayed");
    }

    //edit account information web element assert test method
    protected void isEditAccountInfoPageWebElementDisplayed(EditAccountInformationPage editAccountInformationPage) {
        MyAccountPage myAccountPage = new MyAccountPage(driver);
        //assert register/login dashboard page breadcrumb is displayed (as a list)
        assertTrue(myAccountPage.isPageBreadcrumbDisplayed(), "The register/login dashboard page breadcrumb isn't displayed");
        //main section
        //assert edit account information page title is displayed
        assertTrue(editAccountInformationPage.isEditAccountInformationTitleDisplayed(), "The edit account information page title isn't displayed");
        //assert edit account information page subtitle is displayed
        assertTrue(editAccountInformationPage.isEditAccountInformationSubtitleDisplayed(), "The edit account information page subtitle isn't displayed");
        //assert edit account information page first name subtitle is displayed
        assertTrue(editAccountInformationPage.isEditAccountInfoFirstNameSubtitleDisplayed(), "The edit account information page first name subtitle isn't displayed");
        //assert edit account information page first name input field is displayed
        assertTrue(editAccountInformationPage.isEditAccountInfoFirstNameInputFieldDisplayed(), "The edit account information page first name input field isn't displayed");
        //assert edit account information page last name subtitle is displayed
        assertTrue(editAccountInformationPage.isEditAccountInfoLastNameSubtitleDisplayed(), "The edit account information page last name subtitle isn't displayed");
        //assert edit account information page last name input field is displayed
        assertTrue(editAccountInformationPage.isEditAccountInfoLastNameInputFieldDisplayed(), "The edit account information page last name input field isn't displayed");
        //assert edit account information page email subtitle is displayed
        assertTrue(editAccountInformationPage.isEditAccountInfoEmailSubtitleDisplayed(), "The edit account information page email subtitle isn't displayed");
        //assert edit account information page email input field is displayed
        assertTrue(editAccountInformationPage.isEditAccountInfoEmailInputFieldDisplayed(), "The edit account information page email input field isn't displayed");
        //assert edit account information page phone subtitle is displayed
        assertTrue(editAccountInformationPage.isEditAccountInfoPhoneSubtitleDisplayed(), "The edit account information page phone subtitle isn't displayed");
        //assert edit account information page phone input field is displayed
        assertTrue(editAccountInformationPage.isEditAccountInfoPhoneInputFieldDisplayed(), "The edit account information page phone input field isn't displayed");
        //assert edit account information page first name input field is displayed
        assertTrue(editAccountInformationPage.isEditAccountInfoFirstNameInputFieldDisplayed(), "The edit account information page first name input field isn't displayed");
        //assert edit account information page back button is displayed
        assertTrue(editAccountInformationPage.isEditAccountInfoBackButtonDisplayed(), "The edit account information page back button isn't displayed");
        //assert edit account information page continue button is displayed
        assertTrue(editAccountInformationPage.isEditAccountInfoContinueButtonDisplayed(), "The edit account information page continue button isn't displayed");
        //aside section (register page, my account, register/login dashboard and edit account information pages share same aside links but with different names)
        isMyAccountAsideSectionWebElementDisplayed(myAccountPage);
    }

    //edit password page web element assert test method
    protected void isEditPasswordPageWebElementDisplayed(EditPasswordPage editPasswordPage) {
        MyAccountPage myAccountPage = new MyAccountPage(driver);
        //assert register/login dashboard page breadcrumb is displayed (as a list)
        assertTrue(myAccountPage.isPageBreadcrumbDisplayed(), "The register/login dashboard page breadcrumb isn't displayed");
        //main
        //assert edit password page title is displayed
        assertTrue(editPasswordPage.isEditPasswordPageTitleDisplayed(), "The edit password page title isn't displayed");
        //assert edit password page subtitle is displayed
        assertTrue(editPasswordPage.isEditPasswordPageSubtitleDisplayed(), "The edit password page subtitle isn't displayed");
        //assert password subtext is displayed
        assertTrue(editPasswordPage.isPasswordSubtextDisplayed(), "The password subtext isn't displayed");
        //assert password input field is displayed
        assertTrue(editPasswordPage.isPasswordInputFieldDisplayed(), "The password input field isn't displayed");
        //assert confirm password subtext is displayed
        assertTrue(editPasswordPage.isConfirmPasswordSubtextDisplayed(), "The confirm password subtext isn't displayed");
        //assert confirm password input field is displayed
        assertTrue(editPasswordPage.isConfirmPasswordInputFieldDisplayed(), "The confirm password input field isn't displayed");
        //assert edit password page back button is displayed
        assertTrue(editPasswordPage.isEditPasswordBackButtonDisplayed(), "The edit password page back button isn't displayed");
        //assert edit password page continue button is displayed
        assertTrue(editPasswordPage.isEditPasswordContinueButtonDisplayed(), "The edit password page back button isn't displayed");
        //aside section (register page, my account, register/login dashboard, edit account information and edit password pages share same aside links but with different names)
        isMyAccountAsideSectionWebElementDisplayed(myAccountPage);
    }

    //address book entries web element assert test method
    protected void isAddressBookEntriesPageWebElementDisplayed(AddressBookEntriesPage addressBookEntriesPage) {
        MyAccountPage myAccountPage = new MyAccountPage(driver);
        //assert address book entries page breadcrumb is displayed (as a list)
        assertTrue(myAccountPage.isPageBreadcrumbDisplayed(), "The address book entries page breadcrumb isn't displayed");
        //main
        //assert address book entries page title is displayed
        assertTrue(addressBookEntriesPage.isAddressBookEntriesPageTitleDisplayed(), "The address book entries page title isn't displayed");
        //singular elements
        //assert address book entries back button is displayed
        assertTrue(addressBookEntriesPage.isAddressBookEntriesPageBackButtonDisplayed(), "The address book entries page back button isn't displayed");
        //assert address book entries 'New Address'' button is displayed
        assertTrue(addressBookEntriesPage.isAddressBookEntriesPageNewAddressButtonDisplayed(), "The address book entries page 'New Address' button isn't displayed");
        //aside section (register page, my account, register/login dashboard, edit account information, edit password, add address pages and address book entries share same aside links but with different names)
        isMyAccountAsideSectionWebElementDisplayed(myAccountPage);
    }

    //add address page web element assert test method
    protected void isAddAddressPageWebElementDisplayed(AddAddressPage addAddressPage) {
        MyAccountPage myAccountPage = new MyAccountPage(driver);
        //assert add address page breadcrumb is displayed (as a list)
        assertTrue(myAccountPage.isPageBreadcrumbDisplayed(), "The add address page breadcrumb isn't displayed");
        //main
        //assert add address page title is displayed
        assertTrue(addAddressPage.isAddAddressPageTitleDisplayed(), "The add address page title isn't displayed");
        //assert add address page first name subtext is displayed
        assertTrue(addAddressPage.isAddAddressFirstNameSubtextDisplayed(), "The add address page first name subtext isn't displayed");
        //assert add address page first name input field is displayed
        assertTrue(addAddressPage.isAddAddressFirstNameInputFieldDisplayed(), "The add address page first name input field isn't displayed");
        //assert add address page last name subtext is displayed
        assertTrue(addAddressPage.isAddAddressLastNameSubtextDisplayed(), "The add address page last name subtext isn't displayed");
        //assert add address page last name input field is displayed
        assertTrue(addAddressPage.isAddAddressLastNameInputFieldDisplayed(), "The add address page last name input field isn't displayed");
        //assert add address page company subtext is displayed
        assertTrue(addAddressPage.isAddAddressCompanySubtextDisplayed(), "The add address page company subtext isn't displayed");
        //assert add address page company input field is displayed
        assertTrue(addAddressPage.isAddAddressCompanyInputFieldDisplayed(), "The add address page company input field isn't displayed");
        //assert add address page address1 subtext is displayed
        assertTrue(addAddressPage.isAddAddressPageAddress1SubtextDisplayed(), "The add address page address1 subtext isn't displayed");
        //assert add address page address1 input field is displayed
        assertTrue(addAddressPage.isAddAddressPageAddress1InputFieldDisplayed(), "The add address page address1 input field isn't displayed");
        //assert add address page address2 subtext is displayed
        assertTrue(addAddressPage.isAddAddressPageAddress2SubtextDisplayed(), "The add address page address2 subtext isn't displayed");
        //assert add address page address2 input field is displayed
        assertTrue(addAddressPage.isAddAddressPageAddress2InputFieldDisplayed(), "The add address page address2 input field isn't displayed");
        //assert add address page city subtext is displayed
        assertTrue(addAddressPage.isAddAddressCitySubtextDisplayed(), "The add address page city subtext isn't displayed");
        //assert add address page city input field is displayed
        assertTrue(addAddressPage.isAddAddressCityInputFieldDisplayed(), "The add address page city name input field isn't displayed");
        //assert add address page post code subtext is displayed
        assertTrue(addAddressPage.isAddAddressPostCodeSubtextDisplayed(), "The add address page post code subtext isn't displayed");
        //assert add address page post code input field is displayed
        assertTrue(addAddressPage.isAddAddressPostCodeInputFieldDisplayed(), "The add address page post code input field isn't displayed");
        //assert add address page country subtext is displayed
        assertTrue(addAddressPage.isAddAddressCountrySubtextDisplayed(), "The add address page country subtext isn't displayed");
        //assert add address page country dropdown menu is displayed
        assertTrue(addAddressPage.isAddAddressCountryDropdownMenuDisplayed(), "The add address page country dropdown menu isn't displayed");
        //assert add address page state subtext is displayed
        assertTrue(addAddressPage.isAddAddressStateSubtextDisplayed(), "The add address page state subtext isn't displayed");
        //assert add address page state dropdown menu is displayed
        assertTrue(addAddressPage.isAddAddressStateDropdownMenuDisplayed(), "The add address page state dropdown menu isn't displayed");
        //assert add address page default address subtext is displayed
        assertTrue(addAddressPage.isAddAddressDefaultAddressSubtextDisplayed(), "The add address page default address subtext isn't displayed");
        //assert add address page default address 'Yes' radio button is displayed
        assertTrue(addAddressPage.isAddAddressDefaultAddressYesRadioButtonDisplayed(), "The add address page default address 'Yes' radio button isn't displayed");
        //assert add address page default address 'No' radio button is displayed
        assertTrue(addAddressPage.isAddAddressDefaultAddressNoRadioButtonDisplayed(), "The add address page default address 'No' radio button isn't displayed");
        //assert add address page back button is displayed
        assertTrue(addAddressPage.isAddAddressBackButtonDisplayed(), "The add address page back button isn't displayed");
        //assert add address page continue button is displayed
        assertTrue(addAddressPage.isAddAddressContinueButtonDisplayed(), "The add address page continue button isn't displayed");
        //aside section (register page, my account, register/login dashboard, edit account information, edit password and add address pages share same aside links but with different names)
        isMyAccountAsideSectionWebElementDisplayed(myAccountPage);
    }

    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //general page text element assert test method (elements all pages share)
    protected void isGeneralPageTextElementAsExpected(GeneralPage generalPage){
        //footer
        //assert footer information section title is as expected
        assertEquals("Information", generalPage.getFooterInformationSectionTitle(), "The footer information section title doesn't match expectations.");
        //assert footer customer service section title is as expected
        assertEquals("Customer Service", generalPage.getFooterCustomerServiceSectionTitle(), "The footer customer service section title doesn't match expectations.");
        //assert footer extras section title is as expected
        assertEquals("Extras", generalPage.getFooterExtrasSectionTitle(), "The footer extras section title doesn't match expectations.");
        //assert footer my account section title is as expected
        assertEquals("My Account", generalPage.getFooterMyAccountSectionTitle(), "The footer my account section title doesn't match expectations.");
        //assert footer copyright text is as expected
        assertEquals("Powered By OpenCart\n" + "Qafox.com © 2025", generalPage.getFooterCopyrightText(), "The footer copyright text doesn't match expectations.");
    }

    //home page text element assert test method
    protected void isHomePageTextElementAsExpected(HomePage homePage){
        //assert home page featured product section title is as expected
        assertEquals("Featured", homePage.getHomePageFeaturedProductSectionTitle(), "The home page featured section title doesn't match expectations.");
    }

    //register/login dashboard page text element assert
    protected void isRegisterLoginDashboardPageTextElementAsExpected(RegisterLoginDashboardPage registerLoginDashboardPage){
        //assert register/login dashboard page 'New Customer' section title is as expected
        assertEquals("New Customer", registerLoginDashboardPage.getNewCustomerSectionTitle(), "The register/login dashboard page 'New Customer' section title doesn't match expectations.");
        //assert register/login dashboard page 'New Customer' section subtitle is as expected
        assertEquals("Register Account", registerLoginDashboardPage.getNewCustomerSectionSubtitle(), "The register/login dashboard page 'New Customer' section subtitle doesn't match expectations.");
        //assert register/login dashboard page 'New Customer' section description is as expected
        assertEquals("By creating an account you will be able to shop faster, be up to date on an order's status, and keep track of the orders you have previously made.", registerLoginDashboardPage.getNewCustomerSectionDescription(), "The register/login dashboard page 'New Customer' section description doesn't match expectations.");
        //assert register/login dashboard page 'Returning Customer' section title is as expected
        assertEquals("Returning Customer", registerLoginDashboardPage.getReturningCustomerSectionTitle(), "The register/login dashboard page 'Returning Customer' section title doesn't match expectations.");
        //assert register/login dashboard page 'Returning Customer' section subtitle is as expected
        assertEquals("I am a returning customer", registerLoginDashboardPage.getReturningCustomerSectionSubtitle(), "The register/login dashboard page 'Returning Customer' section subtitle doesn't match expectations.");
        //assert register/login dashboard page login email subtitle is as expected
        assertEquals("E-Mail Address", registerLoginDashboardPage.getLoginEmailSubtitle(), "The register/login dashboard page login email title doesn't match expectations.");
        //assert register/login dashboard page 'Returning Customer' login password subtitle is as expected
        assertEquals("Password", registerLoginDashboardPage.getLoginPasswordSubtitle(), "The register/login dashboard page login password subtitle doesn't match expectations.");
    }

    //register page text element assert test method
    protected void isRegisterPageTextElementAsExpected(RegisterPage registerPage){
        //assert the register page title is as expected
        assertEquals("Register Account", registerPage.getRegisterPageTitle(), "The register page title doesn't match expectations.");
        //assert the register page subtitle is as expected
        assertEquals("If you already have an account with us, please login at the login page.", registerPage.getRegisterPageSubtitle(), "The register page subtitle doesn't match expectations.");
        //assert the register page personal details section title is as expected
        assertEquals("Your Personal Details", registerPage.getPersonalDetailsSectionTitle(), "The register page personal details section title doesn't match expectations.");
        //assert the register page first name subtitle is as expected
        assertEquals("First Name", registerPage.getRegisterPageFirstNameSubtitle(), "The register page first name subtitle doesn't match expectations.");
        //assert the register page last name subtitle is as expected
        assertEquals("Last Name", registerPage.getRegisterPageLastNameSubtitle(), "The register page last name subtitle doesn't match expectations.");
        //assert the register page email subtitle is as expected
        assertEquals("E-Mail", registerPage.getRegisterPageEmailSubtitle(), "The register page email subtitle doesn't match expectations.");
        //assert the register page phone subtitle is as expected
        assertEquals("Telephone", registerPage.getRegisterPagePhoneSubtitle(), "The register page phone subtitle doesn't match expectations.");
        //assert the register page password section is as expected
        assertEquals("Your Password", registerPage.getPasswordSectionTitle(), "The register page password section doesn't match expectations.");
        //assert the register page password subtitle is as expected
        assertEquals("Password", registerPage.getRegisterPagePasswordSubtitle(), "The register page password subtitle doesn't match expectations.");
        //assert the register page confirm password subtitle is as expected
        assertEquals("Password Confirm", registerPage.getRegisterPageConfirmPasswordSubtitle(), "The register page confirm password subtitle doesn't match expectations.");
        //assert the register page newsletter section title is as expected
        assertEquals("Newsletter", registerPage.getNewsletterSectionTitle(), "The register page newsletter section title doesn't match expectations.");
        //assert the register page newsletter subtitle is as expected
        assertEquals("Subscribe", registerPage.getRegisterPageNewsletterSubtitle(), "The register page newsletter subtitle doesn't match expectations.");
        //assert the register page privacy policy subtext is as expected (Selenium can't exactly pinpoint the space after the subtext so it's evaluation is ignored -> the text DOES match expectations)
        //assertEquals("I have read and agree to the Privacy Policy ", registerPage.getPrivacyPolicySubtext(), "The register page privacy policy subtext doesn't match expectations.");
    }

    //my account text element assert test method
    protected void isMyAccountPageTextElementAsExpected(MyAccountPage myAccountPage){
        //assert my account section title is as expected
        assertEquals("My Account", myAccountPage.getMyAccountSectionTitle(), "The my account page 'My Account' section title doesn't match expectations.");
        //assert my orders section title is as expected
        assertEquals("My Orders", myAccountPage.getMyOrdersSectionTitle(), "The my account page 'My Orders' section title doesn't match expectations.");
        //assert my affiliate account section title is as expected
        assertEquals("My Affiliate Account", myAccountPage.getMyAffiliateAccountSectionTitle(), "The my account page 'My Affiliate Account' section title doesn't match expectations.");
        //assert newsletter section title is as expected
        assertEquals("Newsletter", myAccountPage.getMyAccountPageNewsletterSectionTitle(), "The my account page 'Newsletter' section title doesn't match expectations.");
    }

    //edit account information page text element assert test method
    protected void isEditAccountInfoPageTextElementAsExpected(EditAccountInformationPage editAccountInformationPage){
        //assert edit account information page title is as expected
        assertEquals("My Account Information", editAccountInformationPage.getEditAccountInformationTitle(), "The edit account information page title doesn't match expectations.");
        //assert edit account information page subtitle is as expected
        assertEquals("Your Personal Details", editAccountInformationPage.getEditAccountInformationSubtitle(), "The edit account information page subtitle doesn't match expectations.");
        //assert edit account information first name subtitle is as expected
        assertEquals("First Name", editAccountInformationPage.getEditAccountInfoFirstNameSubtitle(), "The edit account information page first name subtitle doesn't match expectations.");
        //assert edit account information last name subtitle is as expected
        assertEquals("Last Name", editAccountInformationPage.getEditAccountInfoLastNameSubtitle(), "The edit account information page last name subtitle doesn't match expectations.");
        //assert edit account information email subtitle is as expected
        assertEquals("E-Mail", editAccountInformationPage.getEditAccountInfoEmailSubtitle(), "The edit account information page email subtitle doesn't match expectations.");
        //assert edit account information phone subtitle is as expected
        assertEquals("Telephone", editAccountInformationPage.getEditAccountInfoPhoneSubtitle(), "The edit account information page phone subtitle doesn't match expectations.");
    }

    //edit password page text element assert test method
    protected void isEditPasswordPageTextElementAsExpected(EditPasswordPage editPasswordPage){
        //assert edit password page title is as expected
        assertEquals("Change Password", editPasswordPage.getEditPasswordPageTitle(), "The edit password page title doesn't match expectations.");
        //assert edit password page subtitle is as expected
        assertEquals("Your Password", editPasswordPage.getEditPasswordPageSubtitle(), "The edit password page subtitle doesn't match expectations.");
        //assert edit password page password subtext is as expected
        assertEquals("Password", editPasswordPage.getPasswordSubtext(), "The edit password page password subtext doesn't match expectations.");
        //assert edit password page confirm password subtext is as expected
        assertEquals("Password Confirm", editPasswordPage.getConfirmPasswordSubtext(), "The edit password page confirm password subtext doesn't match expectations.");
    }

    //address book entries page text element assert test method
    protected void isAddressBookEntriesPageTextElementAsExpected(AddressBookEntriesPage addressBookEntriesPage){
        //assert address book entries page title is as expected
        assertEquals("Address Book Entries", addressBookEntriesPage.getAddressBookEntriesPageTitle(), "The address book entries page title doesn't match expectations.");
    }

    //add address page text element assert test method
    protected void isAddAddressPageTextElementAsExpected(AddAddressPage addAddressPage){
        //assert add address page title is as expected
        assertEquals("Add Address", addAddressPage.getAddAddressPageTitle(), "The add address page title doesn't match expectations.");
        //assert add address page first name subtext is as expected
        assertEquals("First Name", addAddressPage.getAddAddressFirstNameSubtext(), "The add address page first name subtext doesn't match expectations.");
        //assert add address page last name subtext is as expected
        assertEquals("Last Name", addAddressPage.getAddAddressLastNameSubtext(), "The add address page last name subtext doesn't match expectations.");
        //assert add address page company subtext is as expected
        assertEquals("Company", addAddressPage.getAddAddressCompanySubtext(), "The add address page company subtext doesn't match expectations.");
        //assert add address page address 1 subtext is as expected
        assertEquals("Address 1", addAddressPage.getAddAddressPageAddress1Subtext(), "The add address page address1 subtext doesn't match expectations.");
        //assert add address page address2 subtext is as expected
        assertEquals("Address 2", addAddressPage.getAddAddressPageAddress2Subtext(), "The add address page address2 subtext doesn't match expectations.");
        //assert add address page city subtext is as expected
        assertEquals("City", addAddressPage.getAddAddressCitySubtext(), "The add address page city subtext doesn't match expectations.");
        //assert add address page post code subtext is as expected
        assertEquals("Post Code", addAddressPage.getAddAddressPostCodeSubtext(), "The add address page post code subtext doesn't match expectations.");
        //assert add address page country subtext is as expected
        assertEquals("Country", addAddressPage.getAddAddressCountrySubtext(), "The add address page country subtext doesn't match expectations.");
        //assert add address page state subtext is as expected
        assertEquals("Region / State", addAddressPage.getAddAddressStateSubtext(), "The add address page state subtext doesn't match expectations.");
        //assert add address page default address subtext is as expected
        assertEquals("Default Address", addAddressPage.getAddAddressDefaultAddressSubtext(), "The add address page default address subtext doesn't match expectations.");
    }

    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //valid user account creation message assert method
    protected void assertUserAccountCreationMessageMatchesExpectations(RegisterPage registerPage){
        MyAccountPage myAccountPage = new MyAccountPage(driver);
        //assert the user gets the expected account creation success message elements (these are general 'My Account' page elements - their content is different on each page)
        assertEquals("Your Account Has Been Created!", myAccountPage.getSuccessMessageTitle(), "The account creation success message title doesn't match expectations or the user account creation has failed.");
        assertEquals("Congratulations! Your new account has been successfully created!", myAccountPage.successMessageOne(), "The account creation success message part one doesn't match expectations or the user account creation has failed.");
        assertEquals("You can now take advantage of member privileges to enhance your online shopping experience with us.", myAccountPage.getSuccessMessageTwo(), "The account creation success message part two doesn't match expectations or the user account creation has failed.");
        assertEquals("If you have ANY questions about the operation of this online shop, please e-mail the store owner.", myAccountPage.getSuccessMessageThree(), "The account creation success message part three doesn't match expectations or the user account creation has failed.");
        assertEquals("A confirmation has been sent to the provided e-mail address. If you have not received it within the hour, please contact us.", myAccountPage.getSuccessMessageFour(), "The account creation success message part four doesn't match expectations or the user account creation has failed.");
        //click 'Continue' button
        myAccountPage.clickContinueButton();
    }

    //logout success message assert method
    protected void assertLogoutSuccessMessageMatchesExpectations(MyAccountPage myAccountPage){
        //assert the user gets the expected logout success message elements (these are general 'My Account' page elements - their content is different on each page)
        assertEquals("Account Logout", myAccountPage.getSuccessMessageTitle(), "The logout success message title doesn't match expectations or the user account creation has failed.");
        assertEquals("You have been logged off your account. It is now safe to leave the computer.", myAccountPage.successMessageOne(), "The logout success message part one doesn't match expectations or the user account creation has failed.");
        assertEquals("Your shopping cart has been saved, the items inside it will be restored whenever you log back into your account.", myAccountPage.getSuccessMessageTwo(), "The logout success message part two doesn't match expectations or the user account creation has failed.");
    }

    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //home page featured product data logger method
    protected void logHomePageFeaturedProductData(HomePage homePage){
        System.out.println("Home page featured product displayed data: " + "\n");
        logger.info("Home page featured product name(s): " + homePage.getFeaturedProductNames());
        logger.info("Home page featured product description(s): " + homePage.getFeaturedProductDescriptions());
        logger.info("Home page featured product unit price(s): " + homePage.getFeaturedProductUnitPrices() + "\n");
        System.out.println("\n");
    }

    //address book entries page data logger method
    protected void logAddressBookEntriesPageEntryData(AddressBookEntriesPage addressBookEntriesPage){
        System.out.println("Available address(es) displayed on address book entries page: " + "\n");
        logger.info("Displayed entry address(es) data: " + addressBookEntriesPage.getAddressBookEntryData() + "\n");
        System.out.println("\n");
    }

    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //test result screenshot method
    public void captureScreenshot(WebDriver driver, String fileName) {
        try {
            Thread.sleep(1500);//apply wait time for the right time to get the screenshot (WebDriverWait doesn't work here)
            File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            File destination = new File("E:\\IntelliAqua Selenium projects\\QAFoxSelenium\\src\\test\\resources\\" + " " +  fileName + ".png");
            Files.copy(screenshot.toPath(), destination.toPath(), StandardCopyOption.REPLACE_EXISTING);
            logger.info("Screenshot saved at: " + destination.getAbsolutePath());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }



}
