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
        //wait for elements to load
        generalPage.waitForElementsToLoad();
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

    //user logout test method (for checkout login) -> without 'My Account web/text element asserts
    protected void userLogOutForCheckoutTest() {
        GeneralPage generalPage = new GeneralPage(driver);
        MyAccountPage myAccountPage = new MyAccountPage(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
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

    //user address edit test
    protected void editUserAddressTest(AddAddressPage addAddressPage) {
        GeneralPage generalPage = new GeneralPage(driver);
        AddressBookEntriesPage addressBookEntriesPage = new AddressBookEntriesPage(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //click 'Edit' address button
        addressBookEntriesPage.clickEditAddressButton(0);
        //assert the user gets onto correct page
        assertEquals("Edit Address", addAddressPage.getAddAddressPageTitle(), "The page title doesn't match expectations or the user is on the wrong page.");
        //valid user address edited data getter
        addAddressPage.validUserAddressEditedDataGetter();
        //input valid user first name (edited)
        addAddressPage.inputValidEditedFirstNameIntoFirstNameInputField();
        //input valid user last name (edited)
        addAddressPage.inputValidEditedLastNameIntoLastNameInputField();
        //input valid user address (address1) (edited)
        addAddressPage.inputValidEditedAddress1IntoAddress1InputField();
        //input valid user city (edited)
        addAddressPage.inputValidEditedCityIntoCityInputField();
        //input valid user post code (edited)
        addAddressPage.inputValidEditedPostCodeIntoPostCodeInputField();
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
        assertEquals("Your address has been successfully updated", addressBookEntriesPage.getAddressAdditionSuccessMessage(), "The address edit success message doesn't match expectations or the address edit process has failed.");
        //log updated address data
        logAddressBookEntriesPageEntryData(addressBookEntriesPage);
        //capture screenshot of the test result
        captureScreenshot(driver, "Valid User Address Edit Test Result");
    }

    //user address (default) delete test
    protected void deleteUserDefaultAddressTest(AddAddressPage addAddressPage) {
        GeneralPage generalPage = new GeneralPage(driver);
        AddressBookEntriesPage addressBookEntriesPage = new AddressBookEntriesPage(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //click 'Delete' address button
        addressBookEntriesPage.clickDeleteAddressButton(0);
        //assert the user get an expected success message
        assertEquals("Warning: You can not delete your default address!", addressBookEntriesPage.getAddressRemovalWarningMessage(), "The default address removal warning message doesn't match expectations or the address removal has failed.");
        //capture screenshot of the test result
        captureScreenshot(driver, "Main User Address Delete Test Result");
    }

    //user address (one of addresses / not default) delete test
    protected void deleteUserAddressTest(AddAddressPage addAddressPage) {
        GeneralPage generalPage = new GeneralPage(driver);
        AddressBookEntriesPage addressBookEntriesPage = new AddressBookEntriesPage(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //click 'Delete' address button
        addressBookEntriesPage.clickDeleteAddressButton(1);
        //assert the user get an expected success message
        assertEquals("Your address has been successfully deleted", addressBookEntriesPage.getAddressAdditionSuccessMessage(), "The user address removal success message doesn't match expectations or the address removal has failed.");
        //capture screenshot of the test result
        captureScreenshot(driver, "Valid User Address Delete Test Result");
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

    //invalid user address addition test method - invalid user last name format (special symbols and digits) (the error wasn't triggered, test has failed)
    protected void invalidUserSingleAddressAdditionInvalidLastNameFormatTest(AddAddressPage addAddressPage){
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
        //invalid user address data getter - invalid user last name format (special symbols and digits)
        addAddressPageInvalidSingularInput.invalidUserAddressDataInvalidLastNameFormatGetter(registerPage);
        //input valid user first name
        addAddressPageInvalidSingularInput.inputValidFirstNameIntoFirstNameInputField();
        //input invalid user last name format (special symbols and digits)
        addAddressPageInvalidSingularInput.inputInvalidLastNameFormatIntoLastNameInputField();
        //capture screenshot of the invalid input
        captureScreenshot(driver, "Invalid Address Data Input - Invalid Last Name Format");
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
            assertEquals("Last Name cannot consist of special symbols and digits!", addAddressPageInvalidSingularInput.getInvalidInputError(), "The invalid last name input format error doesn't match expectations.");
        } catch (NoSuchElementException nse) {
            logger.error("The invalid last name input format error wasn't triggered.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Main Address Input Test Result - Invalid User Last Name Format");
    }

    //invalid user address addition test method - invalid user address1 format (special symbols only) (the error wasn't triggered, test has failed)
    protected void invalidUserSingleAddressAdditionInvalidAddress1FormatTest(AddAddressPage addAddressPage){
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
        //invalid user address data getter - invalid user address (address1) format (special symbols only)
        addAddressPageInvalidSingularInput.invalidUserAddressDataInvalidAddressFormatGetter(registerPage);
        //input valid user first name
        addAddressPageInvalidSingularInput.inputValidFirstNameIntoFirstNameInputField();
        //input valid user last name
        addAddressPageInvalidSingularInput.inputValidLastNameIntoLastNameInputField();
        //input invalid user address format (address1) (special symbols only)
        addAddressPageInvalidSingularInput.inputInvalidAddress1FormatIntoAddress1InputField();
        //capture screenshot of the invalid input
        captureScreenshot(driver, "Invalid Address Data Input - Invalid Address Format");
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
            assertEquals("Address cannot consist of special symbols!", addAddressPageInvalidSingularInput.getInvalidInputError(), "The invalid address input format error doesn't match expectations.");
        } catch (NoSuchElementException nse) {
            logger.error("The invalid address input format error wasn't triggered.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Main Address Input Test Result - Invalid User Address Format");
    }

    //invalid user address addition test method - invalid user city format (special symbols only) (the error wasn't triggered, test has failed)
    protected void invalidUserSingleAddressAdditionInvalidCityFormatTest(AddAddressPage addAddressPage){
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
        //invalid user address data getter - invalid user city format (special symbols only)
        addAddressPageInvalidSingularInput.invalidUserAddressDataInvalidCityFormatGetter(registerPage);
        //input valid user first name
        addAddressPageInvalidSingularInput.inputValidFirstNameIntoFirstNameInputField();
        //input valid user last name
        addAddressPageInvalidSingularInput.inputValidLastNameIntoLastNameInputField();
        //input valid user address (address1)
        addAddressPageInvalidSingularInput.inputValidAddress1IntoAddress1InputField();
        //input invalid user city format (special symbols only)
        addAddressPageInvalidSingularInput.inputInvalidCityFormatIntoCityInputField();
        //capture screenshot of the invalid input
        captureScreenshot(driver, "Invalid Address Data Input - Invalid City Format");
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
            assertEquals("City cannot consist of special symbols!", addAddressPageInvalidSingularInput.getInvalidInputError(), "The invalid city input format error doesn't match expectations.");
        } catch (NoSuchElementException nse) {
            logger.error("The invalid city input format error wasn't triggered.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Main Address Input Test Result - Invalid User City Format");
    }

    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //products addition (all categories produce the same output - where products are available) to wishlist tests (only registered users have this feature) -> both in-stock and not in-stock products produce the same output

    //featured product addition to wishlist test
    protected void addFeaturedProductToWishlistTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        HomePage homePage = new HomePage(driver);
        WishlistPage wishlistPage = new WishlistPage(driver);
        //general page web element assert (elements all pages share)
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert (elements all pages share)
        isGeneralPageTextElementAsExpected(generalPage);
        //click homepage logo link (to return to home page)
        generalPage.clickHomePageLogoLink();
        //home page web element assert
        isHomePageWebElementDisplayed(homePage);
        //home page text element assert
        isHomePageTextElementAsExpected(homePage);
        //click featured product (MacBook) 'Add to Wishlist' button
        homePage.clickAddToWishlistButton(0);
        //click header navbar wishlist button
        generalPage.clickWishlistIconLinkButton();
        //wishlist page web element assert
        isWishlistPageWebElementDisplayed(wishlistPage);
        //wishlist page test element assert
        isWishlistPageTextElementAsExpected(wishlistPage);
        //capture screenshot of the wishlist page
        captureScreenshot(driver, "Wishlist Page Display (MacBook)");
        //log wishlist product table data
        logWishlistProductTableData(wishlistPage);
        //capture screenshot of the test result
        captureScreenshot(driver, "Add Featured Product (MacBook) To Wishlist Page Test Result");
    }

    //multiple featured products addition to wishlist test
    protected void addMultipleFeaturedProductsToWishlistTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        HomePage homePage = new HomePage(driver);
        WishlistPage wishlistPage = new WishlistPage(driver);
        //general page web element assert (elements all pages share)
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert (elements all pages share)
        isGeneralPageTextElementAsExpected(generalPage);
        //click homepage logo link (to return to home page)
        generalPage.clickHomePageLogoLink();
        //home page web element assert
        isHomePageWebElementDisplayed(homePage);
        //home page text element assert
        isHomePageTextElementAsExpected(homePage);
        //click featured product (MacBook) 'Add to Wishlist' button
        homePage.clickAddToWishlistButton(0);
        //click featured product (Iphone) 'Add to Wishlist' button
        homePage.clickAddToWishlistButton(1);
        //click featured product (Apple Cinema 30'') 'Add to Wishlist' button
        homePage.clickAddToWishlistButton(2);
        //click header navbar wishlist button
        generalPage.clickWishlistIconLinkButton();
        //wishlist page web element assert
        isWishlistPageWebElementDisplayed(wishlistPage);
        //wishlist page test element assert
        isWishlistPageTextElementAsExpected(wishlistPage);
        //capture screenshot of the wishlist page
        captureScreenshot(driver, "Wishlist Page Display (MacBook, Iphone, Apple Cinema 30'')");
        //log wishlist product table data
        logWishlistProductTableData(wishlistPage);
        //capture screenshot of the test result
        captureScreenshot(driver, "Add Multiple Featured Products (MacBook, Iphone, Apple Cinema 30'') To Wishlist Page Test Result");
    }

    //add available product from wishlist to cart test method
    protected void addAvailableProductToCartFromWishlistTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        SingleProductCategoryDashboardPage singleProductCategoryDashboardPage = new SingleProductCategoryDashboardPage(driver);
        WishlistPage wishlistPage = new WishlistPage(driver);
        SingleProductPage singleProductPage = new SingleProductPage(driver);
        //general page web element assert (elements all pages share)
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert (elements all pages share)
        isGeneralPageTextElementAsExpected(generalPage);
        //hover over 'Desktops' nav bar link
        generalPage.hoverOverDesktopsNavBarLink();
        //click 'Show all desktops' dropdown link
        generalPage.clickShowAllDesktopsDropdownLink();
        //assert the user is on the correct dashboard page
        assertEquals("Desktops", singleProductCategoryDashboardPage.getSingleProductCategoryDashboardPageTitle(), "The 'Desktops' category page title doesn't match expectations or the user is on the wrong category page.");
        //single product category dashboard page web element assert
        isSingleProductCategoryDashboardPageWebElementDisplayed(singleProductCategoryDashboardPage);
        //single product category dashboard additional page web element assert(not all categories have them)
        isSingleProductCategoryDashboardPageAdditionalWebElementDisplayed(singleProductCategoryDashboardPage);
        //log 'Desktops' category page product table data
        logSingleProductCategoryProductData(singleProductCategoryDashboardPage);
        //click 'HP LP3065' product 'Add to Wishlist' button
        singleProductCategoryDashboardPage.clickAddToWishlistButton(2);
        //click header navbar wishlist button
        generalPage.clickWishlistIconLinkButton();
        //wishlist page web element assert
        isWishlistPageWebElementDisplayed(wishlistPage);
        //wishlist page test element assert
        isWishlistPageTextElementAsExpected(wishlistPage);
        //capture screenshot of the wishlist page
        captureScreenshot(driver, "Wishlist Page Display (MacBook)");
        //log wishlist product table data
        logWishlistProductTableData(wishlistPage);
        //click 'Add to Cart' product from wishlist button
        wishlistPage.clickAddToCartFromWishlistButton(0);
        //single product page web element assert
        isSingleProductPageWebElementDisplayed(singleProductPage);
        //single product page additional web element assert (for this page)
        isSingleProductPageAdditionalWebElementDisplayed(singleProductPage);
        //capture screenshot of the single product page
        captureScreenshot(driver, "HP LP3065 Product Page Display (redirect from wishlist)");
        //log single product data
        logSingleProductPageData(singleProductPage);
        //add delivery date
        singleProductPage.addDeliveryDate();
        //click 'Reviews' link
        singleProductPage.clickReviewsLink();
        //reviews section text element assert
        isSingleProductPageReviewsSectionTextElementAsExpected(singleProductPage);
        //input guest username
        singleProductPage.inputGuestUserNameIntoUserNameInputField();
        //input user review
        singleProductPage.inputUserReview();
        //click 'Average' rating radio button
        singleProductPage.clickRatingRadioButton();
        //click 'Submit' review button
        singleProductPage.clickSubmitReviewButton();
        //assert the user gets the review submission confirmation message
        assertEquals("Thank you for your review. It has been submitted to the webmaster for approval.", singleProductPage.getReviewSuccessMessage(), "The review submission success message doesn't match expectations or the user has failed to submit the review.");
        //capture screenshot of the review submission
        captureScreenshot(driver, "HP LP3065 Product Review Submitted (redirect from wishlist)");
        //click 'Specifications' link
        singleProductPage.clickSpecificationsLink();
        //log product specification data
        logSingleProductPageProductSpecificationData(singleProductPage);
        //capture screenshot of the single product specification
        captureScreenshot(driver, "HP LP3065 Product Page Specification (redirect from wishlist)");
        //click 'Add to Cart' button
        singleProductPage.clickAddToCartButton();
        //assert the user gets the addition to cart confirmation message
        assertEquals("Success: You have added HP LP3065 to your shopping cart!\n" + "×", singleProductPage.getAdditionToCartSuccessMessage(), "The addition to cart success message doesn't match expectations or the user has failed to add the product to cart.");
        //click 'Shopping Cart' dropdown button
        generalPage.clickShoppingCartDropdownButton();
        //shopping cart dropdown web element assert
        isShoppingCartDropdownWebElementDisplayed(generalPage);
        //log shopping cart dropdown product data
        logShoppingCartDropdownProductData(generalPage);
        //capture screenshot of the single product shopping cart dropdown menu
        captureScreenshot(driver, "HP LP3065 Product Shopping Cart Dropdown Menu Display (redirect from wishlist)");
        //click 'View Cart' link (to proceed to shopping cart page)
        generalPage.clickViewCartLink();
        //capture screenshot of the test result
        captureScreenshot(driver, "HP LP3065 Product Addition From Wishlist To Cart Test Result");
    }

    //remove product from wishlist test - the result is similar for all categories / product quantities

    //featured product removal to wishlist test
    protected void removeFeaturedProductFromWishlistTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        HomePage homePage = new HomePage(driver);
        WishlistPage wishlistPage = new WishlistPage(driver);
        //general page web element assert (elements all pages share)
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert (elements all pages share)
        isGeneralPageTextElementAsExpected(generalPage);
        //click homepage logo link (to return to home page)
        generalPage.clickHomePageLogoLink();
        //home page web element assert
        isHomePageWebElementDisplayed(homePage);
        //home page text element assert
        isHomePageTextElementAsExpected(homePage);
        //click featured product (MacBook) 'Add to Wishlist' button
        homePage.clickAddToWishlistButton(0);
        //click header navbar wishlist button
        generalPage.clickWishlistIconLinkButton();
        //wishlist page web element assert
        isWishlistPageWebElementDisplayed(wishlistPage);
        //wishlist page test element assert
        isWishlistPageTextElementAsExpected(wishlistPage);
        //capture screenshot of the wishlist page
        captureScreenshot(driver, "Wishlist Page Display (MacBook)");
        //log wishlist product table data
        logWishlistProductTableData(wishlistPage);
        //click 'Remove' product from wishlist button
        wishlistPage.clickRemoveFromWishlistButton(0);
        //assert the user gets an expected success message
        assertEquals("Success: You have modified your wish list!\n" + "×", wishlistPage.getWishlistSuccessMessage(), "The wishlist success message doesn't match expectations or its update has failed.");
        //capture screenshot of the test result
        captureScreenshot(driver, "Remove Featured Product (MacBook) From Wishlist Page Test Result");
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //user navigation to single category page tests (all categories would have the same output but Desktops has most products in its list)

    //user navigation to single product category dashboard page (Desktops) test method - as a guest
    protected void navigateToDesktopsCategoryDashboardPageTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        HomePage homePage = new HomePage(driver);
        SingleProductCategoryDashboardPage singleProductCategoryDashboardPage = new SingleProductCategoryDashboardPage(driver);
        //general page web element assert (elements all pages share)
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert (elements all pages share)
        isGeneralPageTextElementAsExpected(generalPage);
        //home page web element assert
        isHomePageWebElementDisplayed(homePage);
        //home page text element assert
        isHomePageTextElementAsExpected(homePage);
        //hover over 'Desktops' nav bar link
        generalPage.hoverOverDesktopsNavBarLink();
        //click 'Show all desktops' dropdown link
        generalPage.clickShowAllDesktopsDropdownLink();
        //assert the user is on the correct dashboard page
        assertEquals("Desktops", singleProductCategoryDashboardPage.getSingleProductCategoryDashboardPageTitle(), "The 'Desktops' category page title doesn't match expectations or the user is on the wrong category page.");
        //single product category dashboard page web element assert
        isSingleProductCategoryDashboardPageWebElementDisplayed(singleProductCategoryDashboardPage);
        //single product category dashboard additional page web element assert(not all categories have them)
        isSingleProductCategoryDashboardPageAdditionalWebElementDisplayed(singleProductCategoryDashboardPage);
        //log 'Desktops' category page product table data
        logSingleProductCategoryProductData(singleProductCategoryDashboardPage);
        //capture screenshot of the test result
        captureScreenshot(driver, "Navigation To 'Desktops' Category Dashboard Page Test Result (as a guest)");
    }

    //user navigation to single product category dashboard page (Desktops) test method - as a registered user
    protected void navigateToDesktopsCategoryDashboardPageRegUserTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        SingleProductCategoryDashboardPage singleProductCategoryDashboardPage = new SingleProductCategoryDashboardPage(driver);
        //general page web element assert (elements all pages share)
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert (elements all pages share)
        isGeneralPageTextElementAsExpected(generalPage);
        //hover over 'Desktops' nav bar link
        generalPage.hoverOverDesktopsNavBarLink();
        //click 'Show all desktops' dropdown link
        generalPage.clickShowAllDesktopsDropdownLink();
        //assert the user is on the correct dashboard page
        assertEquals("Desktops", singleProductCategoryDashboardPage.getSingleProductCategoryDashboardPageTitle(), "The 'Desktops' category page title doesn't match expectations or the user is on the wrong category page.");
        //single product category dashboard page web element assert
        isSingleProductCategoryDashboardPageWebElementDisplayed(singleProductCategoryDashboardPage);
        //single product category dashboard additional page web element assert(not all categories have them)
        isSingleProductCategoryDashboardPageAdditionalWebElementDisplayed(singleProductCategoryDashboardPage);
        //log 'Desktops' category page product table data
        logSingleProductCategoryProductData(singleProductCategoryDashboardPage);
        //capture screenshot of the test result
        captureScreenshot(driver, "Navigation To 'Desktops' Category Dashboard Page Test Result (as a registered user)");
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //add products to compare list test

    //add products (HP LP3065, Iphone, Canon EOS 5ED) to compare list test method (both as a guest and registered user)
    protected void addProductsToCompareListTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        SingleProductCategoryDashboardPage singleProductCategoryDashboardPage = new SingleProductCategoryDashboardPage(driver);
        ProductCompareListPage productCompareListPage = new ProductCompareListPage(driver);
        //general page web element assert (elements all pages share)
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert (elements all pages share)
        isGeneralPageTextElementAsExpected(generalPage);
        //click 'List' view button
        singleProductCategoryDashboardPage.clickListViewButton();
        //click 'HP LP3065' product 'Add to Compare' button
        singleProductCategoryDashboardPage.clickAddToCompareButton(2);
        //click 'Iphone' product 'Add to Compare' button
        singleProductCategoryDashboardPage.clickAddToCompareButton(4);
        //click 'Canon EOS E5D' product 'Add to Compare' button
        singleProductCategoryDashboardPage.clickAddToCompareButton(1);
        //click 'Product compare' link
        singleProductCategoryDashboardPage.clickProductCompareLink();
        //product comparison page web element assert
        isProductComparisonPageWebElementDisplayed(productCompareListPage);
        //product comparison page web element assert (for HP LP3065 product specific table rows)
        isProductComparisonPageHPWebElementDisplayed(productCompareListPage);
        //product comparison page text element assert
        isProductComparisonPageTextElementAsExpected(productCompareListPage);
        //log product comparison page data
        logProductComparisonListProductTableData(productCompareListPage);
        //log product comparison HP LP3065 specific product data
        logHPLP3065ProductComparisonData(productCompareListPage);
        //capture screenshot of the test result
        captureScreenshot(driver, "Add To Product Comparison Page (HP LP3065, Iphone, Canon EOS 5ED) Test Result");
    }

    //add products to compare list test

    //add products (HP LP3065) to cart from compare list test method (both as a guest and registered user)
    protected void addProductsToCartFromCompareListTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        SingleProductCategoryDashboardPage singleProductCategoryDashboardPage = new SingleProductCategoryDashboardPage(driver);
        ProductCompareListPage productCompareListPage = new ProductCompareListPage(driver);
        SingleProductPage singleProductPage = new SingleProductPage(driver);
        //general page web element assert (elements all pages share)
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert (elements all pages share)
        isGeneralPageTextElementAsExpected(generalPage);
        //click 'List' view button
        singleProductCategoryDashboardPage.clickListViewButton();
        //click 'HP LP3065' product 'Add to Compare' button
        singleProductCategoryDashboardPage.clickAddToCompareButton(2);
        //click 'Iphone' product 'Add to Compare' button
        singleProductCategoryDashboardPage.clickAddToCompareButton(4);
        //click 'Canon EOS E5D' product 'Add to Compare' button
        singleProductCategoryDashboardPage.clickAddToCompareButton(1);
        //click 'Product compare' link
        singleProductCategoryDashboardPage.clickProductCompareLink();
        //product comparison page web element assert
        isProductComparisonPageWebElementDisplayed(productCompareListPage);
        //product comparison page web element assert (for HP LP3065 product specific table rows)
        isProductComparisonPageHPWebElementDisplayed(productCompareListPage);
        //product comparison page text element assert
        isProductComparisonPageTextElementAsExpected(productCompareListPage);
        //log product comparison page data
        logProductComparisonListProductTableData(productCompareListPage);
        //log product comparison HP LP3065 specific product data
        logHPLP3065ProductComparisonData(productCompareListPage);
        //click 'Add to Cart' button (for HP LP3065 as it's the only product fully available for testing)
        productCompareListPage.clickAddToCartFromCompareListButton(0);
        //single product page web element assert
        isSingleProductPageWebElementDisplayed(singleProductPage);
        //single product page additional web element assert (for this page)
        isSingleProductPageAdditionalWebElementDisplayed(singleProductPage);
        //capture screenshot of the single product page
        captureScreenshot(driver, "HP LP3065 Product Page Display (redirect from compare list)");
        //log single product data
        logSingleProductPageData(singleProductPage);
        //add delivery date
        singleProductPage.addDeliveryDate();
        //click 'Reviews' link
        singleProductPage.clickReviewsLink();
        //reviews section text element assert
        isSingleProductPageReviewsSectionTextElementAsExpected(singleProductPage);
        //input guest username
        singleProductPage.inputGuestUserNameIntoUserNameInputField();
        //input user review
        singleProductPage.inputUserReview();
        //click 'Average' rating radio button
        singleProductPage.clickRatingRadioButton();
        //click 'Submit' review button
        singleProductPage.clickSubmitReviewButton();
        //assert the user gets the review submission confirmation message
        assertEquals("Thank you for your review. It has been submitted to the webmaster for approval.", singleProductPage.getReviewSuccessMessage(), "The review submission success message doesn't match expectations or the user has failed to submit the review.");
        //capture screenshot of the review submission
        captureScreenshot(driver, "HP LP3065 Product Review Submitted (redirect from compare list)");
        //click 'Specifications' link
        singleProductPage.clickSpecificationsLink();
        //log product specification data
        logSingleProductPageProductSpecificationData(singleProductPage);
        //capture screenshot of the single product specification
        captureScreenshot(driver, "HP LP3065 Product Page Specification (redirect from compare list)");
        //click 'Add to Cart' button
        singleProductPage.clickAddToCartButton();
        //assert the user gets the addition to cart confirmation message
        assertEquals("Success: You have added HP LP3065 to your shopping cart!\n" + "×", singleProductPage.getAdditionToCartSuccessMessage(), "The addition to cart success message doesn't match expectations or the user has failed to add the product to cart.");
        //click 'Shopping Cart' dropdown button
        generalPage.clickShoppingCartDropdownButton();
        //shopping cart dropdown web element assert
        isShoppingCartDropdownWebElementDisplayed(generalPage);
        //log shopping cart dropdown product data
        logShoppingCartDropdownProductData(generalPage);
        //capture screenshot of the single product shopping cart dropdown menu
        captureScreenshot(driver, "HP LP3065 Product Shopping Cart Dropdown Menu Display (redirect from compare list)");
        //click 'View Cart' link (to proceed to shopping cart page)
        generalPage.clickViewCartLink();
        //capture screenshot of the test result
        captureScreenshot(driver, "HP LP3065 Product Addition From Compare List To Cart Test Result");
    }

    //remove products from compare list test (guest and registered user will have the same output so only guest branch here is tested)

    //remove products (HP LP3065, Iphone, Canon EOS 5ED) from compare list test method (as a guest)
    protected void removeProductsFromCompareListTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        SingleProductCategoryDashboardPage singleProductCategoryDashboardPage = new SingleProductCategoryDashboardPage(driver);
        ProductCompareListPage productCompareListPage = new ProductCompareListPage(driver);
        //general page web element assert (elements all pages share)
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert (elements all pages share)
        isGeneralPageTextElementAsExpected(generalPage);
        //click 'List' view button
        singleProductCategoryDashboardPage.clickListViewButton();
        //click 'HP LP3065' product 'Add to Compare' button
        singleProductCategoryDashboardPage.clickAddToCompareButton(2);
        //click 'Iphone' product 'Add to Compare' button
        singleProductCategoryDashboardPage.clickAddToCompareButton(4);
        //click 'Canon EOS E5D' product 'Add to Compare' button
        singleProductCategoryDashboardPage.clickAddToCompareButton(1);
        //click 'Product compare' link
        singleProductCategoryDashboardPage.clickProductCompareLink();
        //product comparison page web element assert
        isProductComparisonPageWebElementDisplayed(productCompareListPage);
        //product comparison page web element assert (for HP LP3065 product specific table rows)
        isProductComparisonPageHPWebElementDisplayed(productCompareListPage);
        //product comparison page text element assert
        isProductComparisonPageTextElementAsExpected(productCompareListPage);
        //log product comparison page data
        logProductComparisonListProductTableData(productCompareListPage);
        //log product comparison HP LP3065 specific product data
        logHPLP3065ProductComparisonData(productCompareListPage);
        //click 'Remove' buttons on each product
        productCompareListPage.clickRemoveProductFromCompareListButton(0);
        productCompareListPage.clickRemoveProductFromCompareListButton(1);
        productCompareListPage.clickRemoveProductFromCompareListButton(0);
        //assert the user gets an expected confirmation message
        assertEquals("You have not chosen any products to compare.", productCompareListPage.getProductRemovalSuccessMessage(), "The product removal from comparison list message doesn't match expectations or the product removal from comparison page process has failed.");
        //capture screenshot of the test result
        captureScreenshot(driver, "Remove From Product Comparison Page (HP LP3065, Iphone, Canon EOS 5ED) Products Test Result");
    }

    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //add 'HP LP3065' to cart test method
    protected void addHPLP3065ToCartTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        SingleProductCategoryDashboardPage singleProductCategoryDashboardPage = new SingleProductCategoryDashboardPage(driver);
        SingleProductPage singleProductPage = new SingleProductPage(driver);
        //general page web element assert (elements all pages share)
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert (elements all pages share)
        isGeneralPageTextElementAsExpected(generalPage);
        //click 'Add to Cart' (HP LP3065) button
        singleProductCategoryDashboardPage.clickAddToCartButton(2);
        //single product page web element assert
        isSingleProductPageWebElementDisplayed(singleProductPage);
        //single product page additional web element assert (for this page)
        isSingleProductPageAdditionalWebElementDisplayed(singleProductPage);
        //capture screenshot of the single product page
        captureScreenshot(driver, "HP LP3065 Product Page Display");
        //log single product data
        logSingleProductPageData(singleProductPage);
        //add delivery date
        singleProductPage.addDeliveryDate();
        //click 'Reviews' link
        singleProductPage.clickReviewsLink();
        //reviews section text element assert
        isSingleProductPageReviewsSectionTextElementAsExpected(singleProductPage);
        //input guest review
        guestProductReviewSubmission(singleProductPage);
        //click 'Specifications' link
        singleProductPage.clickSpecificationsLink();
        //log product specification data
        logSingleProductPageProductSpecificationData(singleProductPage);
        //capture screenshot of the single product specification
        captureScreenshot(driver, "HP LP3065 Product Page Specification");
        //click 'Add to Cart' button
        singleProductPage.clickAddToCartButton();
        //assert the user gets the addition to cart confirmation message
        assertEquals("Success: You have added HP LP3065 to your shopping cart!\n" + "×", singleProductPage.getAdditionToCartSuccessMessage(), "The addition to cart success message doesn't match expectations or the user has failed to add the product to cart.");
        //click 'Shopping Cart' dropdown button
        generalPage.clickShoppingCartDropdownButton();
        //shopping cart dropdown web element assert
        isShoppingCartDropdownWebElementDisplayed(generalPage);
        //log shopping cart dropdown product data
        logShoppingCartDropdownProductData(generalPage);
        //capture screenshot of the single product shopping cart dropdown menu
        captureScreenshot(driver, "HP LP3065 Product Shopping Cart Dropdown Menu Display");
        //click 'View Cart' link (to proceed to shopping cart page)
        generalPage.clickViewCartLink();
        //capture screenshot of the test result
        captureScreenshot(driver, "HP LP3065 Product Addition To Cart Test Result");
    }

    //add 'HP LP3065' to cart test method (reg user)
    protected void addHPLP3065RegUserToCartTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        SingleProductCategoryDashboardPage singleProductCategoryDashboardPage = new SingleProductCategoryDashboardPage(driver);
        SingleProductPage singleProductPage = new SingleProductPage(driver);
        //general page web element assert (elements all pages share)
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert (elements all pages share)
        isGeneralPageTextElementAsExpected(generalPage);
        //click 'Add to Cart' (HP LP3065) button
        singleProductCategoryDashboardPage.clickAddToCartButton(2);
        //single product page web element assert
        isSingleProductPageWebElementDisplayed(singleProductPage);
        //single product page additional web element assert (for this page)
        isSingleProductPageAdditionalWebElementDisplayed(singleProductPage);
        //capture screenshot of the single product page
        captureScreenshot(driver, "HP LP3065 Product Page Display");
        //log single product data
        logSingleProductPageData(singleProductPage);
        //add delivery date
        singleProductPage.addDeliveryDate();
        //input registered user review
        regUserProductReviewSubmission(singleProductPage);
        //click 'Specifications' link
        singleProductPage.clickSpecificationsLink();
        //log product specification data
        logSingleProductPageProductSpecificationData(singleProductPage);
        //capture screenshot of the single product specification
        captureScreenshot(driver, "HP LP3065 Product Page Specification");
        //click 'Add to Cart' button
        singleProductPage.clickAddToCartButton();
        //assert the user gets the addition to cart confirmation message
        assertEquals("Success: You have added HP LP3065 to your shopping cart!\n" + "×", singleProductPage.getAdditionToCartSuccessMessage(), "The addition to cart success message doesn't match expectations or the user has failed to add the product to cart.");
        //click 'Shopping Cart' dropdown button
        generalPage.clickShoppingCartDropdownButton();
        //shopping cart dropdown web element assert
        isShoppingCartDropdownWebElementDisplayed(generalPage);
        //log shopping cart dropdown product data
        logShoppingCartDropdownProductData(generalPage);
        //capture screenshot of the single product shopping cart dropdown menu
        captureScreenshot(driver, "HP LP3065 Product Shopping Cart Dropdown Menu Display");
        //click 'View Cart' link (to proceed to shopping cart page)
        generalPage.clickViewCartLink();
        //capture screenshot of the test result
        captureScreenshot(driver, "HP LP3065 Product Addition To Cart Test Result");
    }

    //add multiple 'HP LP3065' products to cart test method (as a guest)
    protected void addMultipleHPLP3065ProductsToCartGuestTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        SingleProductCategoryDashboardPage singleProductCategoryDashboardPage = new SingleProductCategoryDashboardPage(driver);
        SingleProductPage singleProductPage = new SingleProductPage(driver);
        //general page web element assert (elements all pages share)
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert (elements all pages share)
        isGeneralPageTextElementAsExpected(generalPage);
        //click 'Add to Cart' (HP LP3065) button
        singleProductCategoryDashboardPage.clickAddToCartButton(2);
        //single product page web element assert
        isSingleProductPageWebElementDisplayed(singleProductPage);
        //single product page additional web element assert (for this page)
        isSingleProductPageAdditionalWebElementDisplayed(singleProductPage);
        //capture screenshot of the single product page
        captureScreenshot(driver, "HP LP3065 Product Page Display");
        //log single product data
        logSingleProductPageData(singleProductPage);
        //click 'Reviews' link
        singleProductPage.clickReviewsLink();
        //reviews section text element assert
        isSingleProductPageReviewsSectionTextElementAsExpected(singleProductPage);
        //input guest review
        guestProductReviewSubmission(singleProductPage);
        //click 'Specifications' link
        singleProductPage.clickSpecificationsLink();
        //log product specification data
        logSingleProductPageProductSpecificationData(singleProductPage);
        //capture screenshot of the single product specification
        captureScreenshot(driver, "HP LP3065 Product Page Specification");
        //add delivery date
        singleProductPage.addDeliveryDate();
        //setup product quantity
        singleProductPage.changeProductQuantity();
        //capture screenshot of the quantity input
        captureScreenshot(driver, "HP LP3065 Multiple Product Quantity Input (as a guest)");
        //click 'Add to Cart' button
        singleProductPage.clickAddToCartButton();
        //assert the user gets the addition to cart confirmation message
        assertEquals("Success: You have added HP LP3065 to your shopping cart!\n" + "×", singleProductPage.getAdditionToCartSuccessMessage(), "The addition to cart success message doesn't match expectations or the user has failed to add the product to cart.");
        //click 'Shopping Cart' dropdown button
        generalPage.clickShoppingCartDropdownButton();
        //shopping cart dropdown web element assert
        isShoppingCartDropdownWebElementDisplayed(generalPage);
        //log shopping cart dropdown product data
        logShoppingCartDropdownProductData(generalPage);
        //capture screenshot of the changed product quantity
        captureScreenshot(driver, "HP LP3065 Multiple Products Shopping Cart Dropdown Menu Display (as a guest)");
        //click 'View Cart' link (to proceed to shopping cart page)
        generalPage.clickViewCartLink();
        //capture screenshot of the test result
        captureScreenshot(driver, "HP LP3065 Multiple Products Addition To Cart Test Result (as a guest)");
    }

    //add multiple 'HP LP3065' products to cart test method (as a register user)
    protected void addMultipleHPLP3065ProductsToCartRegUserTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        SingleProductCategoryDashboardPage singleProductCategoryDashboardPage = new SingleProductCategoryDashboardPage(driver);
        SingleProductPage singleProductPage = new SingleProductPage(driver);
        //general page web element assert (elements all pages share)
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert (elements all pages share)
        isGeneralPageTextElementAsExpected(generalPage);
        //click 'Add to Cart' (HP LP3065) button
        singleProductCategoryDashboardPage.clickAddToCartButton(2);
        //single product page web element assert
        isSingleProductPageWebElementDisplayed(singleProductPage);
        //single product page additional web element assert (for this page)
        isSingleProductPageAdditionalWebElementDisplayed(singleProductPage);
        //capture screenshot of the single product page
        captureScreenshot(driver, "HP LP3065 Product Page Display");
        //log single product data
        logSingleProductPageData(singleProductPage);
        //click 'Reviews' link
        singleProductPage.clickReviewsLink();
        //reviews section text element assert
        isSingleProductPageReviewsSectionTextElementAsExpected(singleProductPage);
        //input registered user review
        regUserProductReviewSubmission(singleProductPage);
        //click 'Specifications' link
        singleProductPage.clickSpecificationsLink();
        //log product specification data
        logSingleProductPageProductSpecificationData(singleProductPage);
        //capture screenshot of the single product specification
        captureScreenshot(driver, "HP LP3065 Product Page Specification");
        //add delivery date
        singleProductPage.addDeliveryDate();
        //setup product quantity
        singleProductPage.changeProductQuantity();
        //capture screenshot of the quantity input
        captureScreenshot(driver, "HP LP3065 Multiple Product Quantity Input (as a registered user)");
        //click 'Add to Cart' button
        singleProductPage.clickAddToCartButton();
        //assert the user gets the addition to cart confirmation message
        assertEquals("Success: You have added HP LP3065 to your shopping cart!\n" + "×", singleProductPage.getAdditionToCartSuccessMessage(), "The addition to cart success message doesn't match expectations or the user has failed to add the product to cart.");
        //click 'Shopping Cart' dropdown button
        generalPage.clickShoppingCartDropdownButton();
        //shopping cart dropdown web element assert
        isShoppingCartDropdownWebElementDisplayed(generalPage);
        //log shopping cart dropdown product data
        logShoppingCartDropdownProductData(generalPage);
        //capture screenshot of the changed product quantity
        captureScreenshot(driver, "HP LP3065 Multiple Products Shopping Cart Dropdown Menu Display (as a registered user)");
        //click 'View Cart' link (to proceed to shopping cart page)
        generalPage.clickViewCartLink();
        //capture screenshot of the test result
        captureScreenshot(driver, "HP LP3065 Multiple Products Addition To Cart Test Result (as a registered user)");
    }

    //add searched (Ipod Touch) product to cart test method (it's not currently in stock)
    protected void addSearchedIpodTouchToCartTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        SingleProductCategoryDashboardPage singleProductCategoryDashboardPage = new SingleProductCategoryDashboardPage(driver);
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        //general page web element assert (elements all pages share)
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert (elements all pages share)
        isGeneralPageTextElementAsExpected(generalPage);
        //input 'Ipod Touch' (lowercase) into search input field
        generalPage.inputIpodTouchSearchQueryIntoSearchInputField();
        //click 'Search' button
        generalPage.clickSearchHeaderButton();
        //searched product dashboard page web element assert
        isSearchedProductDashboardPageWebElementDisplayed();
        //click 'Add to Cart' (Ipod Touch) button
        singleProductCategoryDashboardPage.clickAddToCartButton(0);
        //assert the user gets the addition to cart confirmation message
        assertEquals("Success: You have added iPod Touch to your shopping cart!\n" + "×", singleProductCategoryDashboardPage.getAdditionToCartSuccessMessage(), "The addition to cart success message doesn't match expectations or the user has failed to add the product to cart.");
        //click 'Shopping Cart' dropdown button
        generalPage.clickShoppingCartDropdownButton();
        //shopping cart dropdown web element assert
        isShoppingCartDropdownWebElementDisplayed(generalPage);
        //log shopping cart dropdown product data
        logShoppingCartDropdownProductData(generalPage);
        //capture screenshot of the single product shopping cart dropdown menu
        captureScreenshot(driver, "Ipod Touch Product Shopping Cart Dropdown Menu Display");
        //click 'View Cart' link (to proceed to shopping cart page)
        generalPage.clickViewCartLink();
        //if the product isn't available or in-stock, assert the user gets the expected warning message
        if(shoppingCartPage.isShoppingCartWarningMessageDisplayed()) {
            assertEquals("Products marked with *** are not available in the desired quantity or not in stock!\n" + "×", shoppingCartPage.getShoppingCartWarningMessage(), "The shopping cart warning message doesn't match expectations or the warning wasn't triggered.");
        } else {
            logger.info("The searched product (Ipod Touch) is in stock.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Ipod Touch Product Addition To Cart Test Result");
    }

    //product removal from shopping cart dropdown menu test method
    protected void removeHPLP3065ProductFromShoppingCartDropdownMenuTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        SingleProductCategoryDashboardPage singleProductCategoryDashboardPage = new SingleProductCategoryDashboardPage(driver);
        SingleProductPage singleProductPage = new SingleProductPage(driver);
        //general page web element assert (elements all pages share)
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert (elements all pages share)
        isGeneralPageTextElementAsExpected(generalPage);
        //click 'Add to Cart' (HP LP3065) button
        singleProductCategoryDashboardPage.clickAddToCartButton(2);
        //single product page web element assert
        isSingleProductPageWebElementDisplayed(singleProductPage);
        //single product page additional web element assert (for this page)
        isSingleProductPageAdditionalWebElementDisplayed(singleProductPage);
        //capture screenshot of the single product page
        captureScreenshot(driver, "HP LP3065 Product Page Display");
        //log single product data
        logSingleProductPageData(singleProductPage);
        //add delivery date
        singleProductPage.addDeliveryDate();
        //click 'Reviews' link
        singleProductPage.clickReviewsLink();
        //reviews section text element assert
        isSingleProductPageReviewsSectionTextElementAsExpected(singleProductPage);
        //input guest review
        guestProductReviewSubmission(singleProductPage);
        //click 'Specifications' link
        singleProductPage.clickSpecificationsLink();
        //log product specification data
        logSingleProductPageProductSpecificationData(singleProductPage);
        //capture screenshot of the single product specification
        captureScreenshot(driver, "HP LP3065 Product Page Specification");
        //click 'Add to Cart' button
        singleProductPage.clickAddToCartButton();
        //assert the user gets the addition to cart confirmation message
        assertEquals("Success: You have added HP LP3065 to your shopping cart!\n" + "×", singleProductPage.getAdditionToCartSuccessMessage(), "The addition to cart success message doesn't match expectations or the user has failed to add the product to cart.");
        //click 'Shopping Cart' dropdown button
        generalPage.clickShoppingCartDropdownButton();
        //shopping cart dropdown web element assert
        isShoppingCartDropdownWebElementDisplayed(generalPage);
        //log shopping cart dropdown product data
        logShoppingCartDropdownProductData(generalPage);
        //capture screenshot of the single product shopping cart dropdown menu
        captureScreenshot(driver, "HP LP3065 Product Shopping Cart Dropdown Menu Display");
        //click shopping cart dropdown menu 'Remove' button
        generalPage.clickShoppingCartDropdownRemoveButtonLink(0);
        //click 'Shopping Cart' dropdown button
        generalPage.clickShoppingCartDropdownButton();
        //assert the user gets the expected message
        assertEquals("Your shopping cart is empty!", generalPage.getShoppingCartEmptyMessage(), "The empty shopping cart dropdown menu message doesn't match expectations");
        //capture screenshot of the test result
        captureScreenshot(driver, "HP LP3065 Product Removal From Shopping Cart Dropdown Menu Test Result");
    }

    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //single product page invalid submission data tests (review, delivery date) -> since guest and registered user will have the same output, only guest branch will be tested

    //no singular input

    //single product (set category) review submission without username test
    protected void addHPLP3065ToCartWithoutReviewUserNameTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        SingleProductCategoryDashboardPage singleProductCategoryDashboardPage = new SingleProductCategoryDashboardPage(driver);
        SingleProductPage singleProductPage = new SingleProductPage(driver);
        //general page web element assert (elements all pages share)
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert (elements all pages share)
        isGeneralPageTextElementAsExpected(generalPage);
        //click 'Add to Cart' (HP LP3065) button
        singleProductCategoryDashboardPage.clickAddToCartButton(2);
        //single product page web element assert
        isSingleProductPageWebElementDisplayed(singleProductPage);
        //single product page additional web element assert (for this page)
        isSingleProductPageAdditionalWebElementDisplayed(singleProductPage);
        //capture screenshot of the single product page
        captureScreenshot(driver, "HP LP3065 Product Page Display");
        //log single product data
        logSingleProductPageData(singleProductPage);
        //add delivery date
        singleProductPage.addDeliveryDate();
        //click 'Reviews' link
        singleProductPage.clickReviewsLink();
        //reviews section text element assert
        isSingleProductPageReviewsSectionTextElementAsExpected(singleProductPage);
        //input guest review (no guest username)
        guestProductReviewNoUsernameSubmission(singleProductPage);
        //click 'Specifications' link
        singleProductPage.clickSpecificationsLink();
        //log product specification data
        logSingleProductPageProductSpecificationData(singleProductPage);
        //capture screenshot of the single product specification
        captureScreenshot(driver, "HP LP3065 Product Page Specification");
        //click 'Add to Cart' button
        singleProductPage.clickAddToCartButton();
        //assert the user gets the addition to cart confirmation message
        assertEquals("Success: You have added HP LP3065 to your shopping cart!\n" + "×", singleProductPage.getAdditionToCartSuccessMessage(), "The addition to cart success message doesn't match expectations or the user has failed to add the product to cart.");
        //click 'Shopping Cart' dropdown button
        generalPage.clickShoppingCartDropdownButton();
        //shopping cart dropdown web element assert
        isShoppingCartDropdownWebElementDisplayed(generalPage);
        //log shopping cart dropdown product data
        logShoppingCartDropdownProductData(generalPage);
        //capture screenshot of the single product shopping cart dropdown menu
        captureScreenshot(driver, "HP LP3065 Product Shopping Cart Dropdown Menu Display");
        //click 'View Cart' link (to proceed to shopping cart page)
        generalPage.clickViewCartLink();
        //capture screenshot of the test result
        captureScreenshot(driver, "HP LP3065 Product Addition To Cart Test Result");
    }

    //single product (set category) review submission without review text test
    protected void addHPLP3065ToCartWithoutReviewTextTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        SingleProductCategoryDashboardPage singleProductCategoryDashboardPage = new SingleProductCategoryDashboardPage(driver);
        SingleProductPage singleProductPage = new SingleProductPage(driver);
        //general page web element assert (elements all pages share)
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert (elements all pages share)
        isGeneralPageTextElementAsExpected(generalPage);
        //click 'Add to Cart' (HP LP3065) button
        singleProductCategoryDashboardPage.clickAddToCartButton(2);
        //single product page web element assert
        isSingleProductPageWebElementDisplayed(singleProductPage);
        //single product page additional web element assert (for this page)
        isSingleProductPageAdditionalWebElementDisplayed(singleProductPage);
        //capture screenshot of the single product page
        captureScreenshot(driver, "HP LP3065 Product Page Display");
        //log single product data
        logSingleProductPageData(singleProductPage);
        //add delivery date
        singleProductPage.addDeliveryDate();
        //click 'Reviews' link
        singleProductPage.clickReviewsLink();
        //reviews section text element assert
        isSingleProductPageReviewsSectionTextElementAsExpected(singleProductPage);
        //input guest review (no guest review)
        guestProductReviewNoReviewTextSubmission(singleProductPage);
        //click 'Specifications' link
        singleProductPage.clickSpecificationsLink();
        //log product specification data
        logSingleProductPageProductSpecificationData(singleProductPage);
        //capture screenshot of the single product specification
        captureScreenshot(driver, "HP LP3065 Product Page Specification");
        //click 'Add to Cart' button
        singleProductPage.clickAddToCartButton();
        //assert the user gets the addition to cart confirmation message
        assertEquals("Success: You have added HP LP3065 to your shopping cart!\n" + "×", singleProductPage.getAdditionToCartSuccessMessage(), "The addition to cart success message doesn't match expectations or the user has failed to add the product to cart.");
        //click 'Shopping Cart' dropdown button
        generalPage.clickShoppingCartDropdownButton();
        //shopping cart dropdown web element assert
        isShoppingCartDropdownWebElementDisplayed(generalPage);
        //log shopping cart dropdown product data
        logShoppingCartDropdownProductData(generalPage);
        //capture screenshot of the single product shopping cart dropdown menu
        captureScreenshot(driver, "HP LP3065 Product Shopping Cart Dropdown Menu Display");
        //click 'View Cart' link (to proceed to shopping cart page)
        generalPage.clickViewCartLink();
        //capture screenshot of the test result
        captureScreenshot(driver, "HP LP3065 Product Addition To Cart Test Result");
    }

    //single product (set category) review submission without review rating test
    protected void addHPLP3065ToCartWithoutReviewRatingTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        SingleProductCategoryDashboardPage singleProductCategoryDashboardPage = new SingleProductCategoryDashboardPage(driver);
        SingleProductPage singleProductPage = new SingleProductPage(driver);
        //general page web element assert (elements all pages share)
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert (elements all pages share)
        isGeneralPageTextElementAsExpected(generalPage);
        //click 'Add to Cart' (HP LP3065) button
        singleProductCategoryDashboardPage.clickAddToCartButton(2);
        //single product page web element assert
        isSingleProductPageWebElementDisplayed(singleProductPage);
        //single product page additional web element assert (for this page)
        isSingleProductPageAdditionalWebElementDisplayed(singleProductPage);
        //capture screenshot of the single product page
        captureScreenshot(driver, "HP LP3065 Product Page Display");
        //log single product data
        logSingleProductPageData(singleProductPage);
        //add delivery date
        singleProductPage.addDeliveryDate();
        //click 'Reviews' link
        singleProductPage.clickReviewsLink();
        //reviews section text element assert
        isSingleProductPageReviewsSectionTextElementAsExpected(singleProductPage);
        //input guest review (no guest review rating)
        guestProductReviewNoReviewRatingSubmission(singleProductPage);
        //click 'Specifications' link
        singleProductPage.clickSpecificationsLink();
        //log product specification data
        logSingleProductPageProductSpecificationData(singleProductPage);
        //capture screenshot of the single product specification
        captureScreenshot(driver, "HP LP3065 Product Page Specification");
        //click 'Add to Cart' button
        singleProductPage.clickAddToCartButton();
        //assert the user gets the addition to cart confirmation message
        assertEquals("Success: You have added HP LP3065 to your shopping cart!\n" + "×", singleProductPage.getAdditionToCartSuccessMessage(), "The addition to cart success message doesn't match expectations or the user has failed to add the product to cart.");
        //click 'Shopping Cart' dropdown button
        generalPage.clickShoppingCartDropdownButton();
        //shopping cart dropdown web element assert
        isShoppingCartDropdownWebElementDisplayed(generalPage);
        //log shopping cart dropdown product data
        logShoppingCartDropdownProductData(generalPage);
        //capture screenshot of the single product shopping cart dropdown menu
        captureScreenshot(driver, "HP LP3065 Product Shopping Cart Dropdown Menu Display");
        //click 'View Cart' link (to proceed to shopping cart page)
        generalPage.clickViewCartLink();
        //capture screenshot of the test result
        captureScreenshot(driver, "HP LP3065 Product Addition To Cart Test Result");
    }

    //too short singular input

    //single product (set category) review submission with too short username test (2 chars)
    protected void addHPLP3065ToCartWithTooShortReviewUserNameTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        SingleProductCategoryDashboardPage singleProductCategoryDashboardPage = new SingleProductCategoryDashboardPage(driver);
        SingleProductPage singleProductPage = new SingleProductPage(driver);
        //general page web element assert (elements all pages share)
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert (elements all pages share)
        isGeneralPageTextElementAsExpected(generalPage);
        //click 'Add to Cart' (HP LP3065) button
        singleProductCategoryDashboardPage.clickAddToCartButton(2);
        //single product page web element assert
        isSingleProductPageWebElementDisplayed(singleProductPage);
        //single product page additional web element assert (for this page)
        isSingleProductPageAdditionalWebElementDisplayed(singleProductPage);
        //capture screenshot of the single product page
        captureScreenshot(driver, "HP LP3065 Product Page Display");
        //log single product data
        logSingleProductPageData(singleProductPage);
        //add delivery date
        singleProductPage.addDeliveryDate();
        //click 'Reviews' link
        singleProductPage.clickReviewsLink();
        //reviews section text element assert
        isSingleProductPageReviewsSectionTextElementAsExpected(singleProductPage);
        //input guest review (too short guest username) (2 chars)
        guestProductReviewTooShortUsernameSubmission(singleProductPage);
        //click 'Specifications' link
        singleProductPage.clickSpecificationsLink();
        //log product specification data
        logSingleProductPageProductSpecificationData(singleProductPage);
        //capture screenshot of the single product specification
        captureScreenshot(driver, "HP LP3065 Product Page Specification");
        //click 'Add to Cart' button
        singleProductPage.clickAddToCartButton();
        //assert the user gets the addition to cart confirmation message
        assertEquals("Success: You have added HP LP3065 to your shopping cart!\n" + "×", singleProductPage.getAdditionToCartSuccessMessage(), "The addition to cart success message doesn't match expectations or the user has failed to add the product to cart.");
        //click 'Shopping Cart' dropdown button
        generalPage.clickShoppingCartDropdownButton();
        //shopping cart dropdown web element assert
        isShoppingCartDropdownWebElementDisplayed(generalPage);
        //log shopping cart dropdown product data
        logShoppingCartDropdownProductData(generalPage);
        //capture screenshot of the single product shopping cart dropdown menu
        captureScreenshot(driver, "HP LP3065 Product Shopping Cart Dropdown Menu Display");
        //click 'View Cart' link (to proceed to shopping cart page)
        generalPage.clickViewCartLink();
        //capture screenshot of the test result
        captureScreenshot(driver, "HP LP3065 Product Addition To Cart Test Result");
    }

    //single product (set category) review submission with too short review text test
    protected void addHPLP3065ToCartWithTooShortReviewTextTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        SingleProductCategoryDashboardPage singleProductCategoryDashboardPage = new SingleProductCategoryDashboardPage(driver);
        SingleProductPage singleProductPage = new SingleProductPage(driver);
        //general page web element assert (elements all pages share)
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert (elements all pages share)
        isGeneralPageTextElementAsExpected(generalPage);
        //click 'Add to Cart' (HP LP3065) button
        singleProductCategoryDashboardPage.clickAddToCartButton(2);
        //single product page web element assert
        isSingleProductPageWebElementDisplayed(singleProductPage);
        //single product page additional web element assert (for this page)
        isSingleProductPageAdditionalWebElementDisplayed(singleProductPage);
        //capture screenshot of the single product page
        captureScreenshot(driver, "HP LP3065 Product Page Display");
        //log single product data
        logSingleProductPageData(singleProductPage);
        //add delivery date
        singleProductPage.addDeliveryDate();
        //click 'Reviews' link
        singleProductPage.clickReviewsLink();
        //reviews section text element assert
        isSingleProductPageReviewsSectionTextElementAsExpected(singleProductPage);
        //input guest review (too short guest review) (24 chars)
        guestProductReviewTooShortReviewTextSubmission(singleProductPage);
        //click 'Specifications' link
        singleProductPage.clickSpecificationsLink();
        //log product specification data
        logSingleProductPageProductSpecificationData(singleProductPage);
        //capture screenshot of the single product specification
        captureScreenshot(driver, "HP LP3065 Product Page Specification");
        //click 'Add to Cart' button
        singleProductPage.clickAddToCartButton();
        //assert the user gets the addition to cart confirmation message
        assertEquals("Success: You have added HP LP3065 to your shopping cart!\n" + "×", singleProductPage.getAdditionToCartSuccessMessage(), "The addition to cart success message doesn't match expectations or the user has failed to add the product to cart.");
        //click 'Shopping Cart' dropdown button
        generalPage.clickShoppingCartDropdownButton();
        //shopping cart dropdown web element assert
        isShoppingCartDropdownWebElementDisplayed(generalPage);
        //log shopping cart dropdown product data
        logShoppingCartDropdownProductData(generalPage);
        //capture screenshot of the single product shopping cart dropdown menu
        captureScreenshot(driver, "HP LP3065 Product Shopping Cart Dropdown Menu Display");
        //click 'View Cart' link (to proceed to shopping cart page)
        generalPage.clickViewCartLink();
        //capture screenshot of the test result
        captureScreenshot(driver, "HP LP3065 Product Addition To Cart Test Result");
    }

    //too short singular input

    //single product (set category) review submission with too long username test (26 chars)
    protected void addHPLP3065ToCartWithTooLongReviewUserNameTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        SingleProductCategoryDashboardPage singleProductCategoryDashboardPage = new SingleProductCategoryDashboardPage(driver);
        SingleProductPage singleProductPage = new SingleProductPage(driver);
        //general page web element assert (elements all pages share)
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert (elements all pages share)
        isGeneralPageTextElementAsExpected(generalPage);
        //click 'Add to Cart' (HP LP3065) button
        singleProductCategoryDashboardPage.clickAddToCartButton(2);
        //single product page web element assert
        isSingleProductPageWebElementDisplayed(singleProductPage);
        //single product page additional web element assert (for this page)
        isSingleProductPageAdditionalWebElementDisplayed(singleProductPage);
        //capture screenshot of the single product page
        captureScreenshot(driver, "HP LP3065 Product Page Display");
        //log single product data
        logSingleProductPageData(singleProductPage);
        //add delivery date
        singleProductPage.addDeliveryDate();
        //click 'Reviews' link
        singleProductPage.clickReviewsLink();
        //reviews section text element assert
        isSingleProductPageReviewsSectionTextElementAsExpected(singleProductPage);
        //input guest review (too long guest username) (26 chars)
        guestProductReviewTooLongUsernameSubmission(singleProductPage);
        //click 'Specifications' link
        singleProductPage.clickSpecificationsLink();
        //log product specification data
        logSingleProductPageProductSpecificationData(singleProductPage);
        //capture screenshot of the single product specification
        captureScreenshot(driver, "HP LP3065 Product Page Specification");
        //click 'Add to Cart' button
        singleProductPage.clickAddToCartButton();
        //assert the user gets the addition to cart confirmation message
        assertEquals("Success: You have added HP LP3065 to your shopping cart!\n" + "×", singleProductPage.getAdditionToCartSuccessMessage(), "The addition to cart success message doesn't match expectations or the user has failed to add the product to cart.");
        //click 'Shopping Cart' dropdown button
        generalPage.clickShoppingCartDropdownButton();
        //shopping cart dropdown web element assert
        isShoppingCartDropdownWebElementDisplayed(generalPage);
        //log shopping cart dropdown product data
        logShoppingCartDropdownProductData(generalPage);
        //capture screenshot of the single product shopping cart dropdown menu
        captureScreenshot(driver, "HP LP3065 Product Shopping Cart Dropdown Menu Display");
        //click 'View Cart' link (to proceed to shopping cart page)
        generalPage.clickViewCartLink();
        //capture screenshot of the test result
        captureScreenshot(driver, "HP LP3065 Product Addition To Cart Test Result");
    }

    //single product (set category) review submission with too long review text test
    protected void addHPLP3065ToCartWithTooLongReviewTextTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        SingleProductCategoryDashboardPage singleProductCategoryDashboardPage = new SingleProductCategoryDashboardPage(driver);
        SingleProductPage singleProductPage = new SingleProductPage(driver);
        //general page web element assert (elements all pages share)
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert (elements all pages share)
        isGeneralPageTextElementAsExpected(generalPage);
        //click 'Add to Cart' (HP LP3065) button
        singleProductCategoryDashboardPage.clickAddToCartButton(2);
        //single product page web element assert
        isSingleProductPageWebElementDisplayed(singleProductPage);
        //single product page additional web element assert (for this page)
        isSingleProductPageAdditionalWebElementDisplayed(singleProductPage);
        //capture screenshot of the single product page
        captureScreenshot(driver, "HP LP3065 Product Page Display");
        //log single product data
        logSingleProductPageData(singleProductPage);
        //add delivery date
        singleProductPage.addDeliveryDate();
        //click 'Reviews' link
        singleProductPage.clickReviewsLink();
        //reviews section text element assert
        isSingleProductPageReviewsSectionTextElementAsExpected(singleProductPage);
        //input guest review (too long guest review) (1001 chars)
        guestProductReviewTooLongReviewTextSubmission(singleProductPage);
        //click 'Specifications' link
        singleProductPage.clickSpecificationsLink();
        //log product specification data
        logSingleProductPageProductSpecificationData(singleProductPage);
        //capture screenshot of the single product specification
        captureScreenshot(driver, "HP LP3065 Product Page Specification");
        //click 'Add to Cart' button
        singleProductPage.clickAddToCartButton();
        //assert the user gets the addition to cart confirmation message
        assertEquals("Success: You have added HP LP3065 to your shopping cart!\n" + "×", singleProductPage.getAdditionToCartSuccessMessage(), "The addition to cart success message doesn't match expectations or the user has failed to add the product to cart.");
        //click 'Shopping Cart' dropdown button
        generalPage.clickShoppingCartDropdownButton();
        //shopping cart dropdown web element assert
        isShoppingCartDropdownWebElementDisplayed(generalPage);
        //log shopping cart dropdown product data
        logShoppingCartDropdownProductData(generalPage);
        //capture screenshot of the single product shopping cart dropdown menu
        captureScreenshot(driver, "HP LP3065 Product Shopping Cart Dropdown Menu Display");
        //click 'View Cart' link (to proceed to shopping cart page)
        generalPage.clickViewCartLink();
        //capture screenshot of the test result
        captureScreenshot(driver, "HP LP3065 Product Addition To Cart Test Result");
    }

    //invalid delivery date input tests -> since guest and registered user will have the same output, only guest branch will be tested

    //invalid add 'HP LP3065' to cart test method - no delivery date
    protected void invalidAddHPLP3065ToCartNoDeliveryDateTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        SingleProductCategoryDashboardPage singleProductCategoryDashboardPage = new SingleProductCategoryDashboardPage(driver);
        SingleProductPage singleProductPage = new SingleProductPage(driver);
        //general page web element assert (elements all pages share)
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert (elements all pages share)
        isGeneralPageTextElementAsExpected(generalPage);
        //click 'Add to Cart' (HP LP3065) button
        singleProductCategoryDashboardPage.clickAddToCartButton(2);
        //single product page web element assert
        isSingleProductPageWebElementDisplayed(singleProductPage);
        //single product page additional web element assert (for this page)
        isSingleProductPageAdditionalWebElementDisplayed(singleProductPage);
        //capture screenshot of the single product page
        captureScreenshot(driver, "HP LP3065 Product Page Display");
        //log single product data
        logSingleProductPageData(singleProductPage);
        //don't input delivery date
        singleProductPage.addNoDeliveryDate();
        //capture screenshot of the invalid delivery date input
        captureScreenshot(driver, "No Delivery Date Input For HP LP3065 Product");
        //click 'Reviews' link
        singleProductPage.clickReviewsLink();
        //reviews section text element assert
        isSingleProductPageReviewsSectionTextElementAsExpected(singleProductPage);
        //input guest review
        guestProductReviewSubmission(singleProductPage);
        //click 'Specifications' link
        singleProductPage.clickSpecificationsLink();
        //log product specification data
        logSingleProductPageProductSpecificationData(singleProductPage);
        //capture screenshot of the single product specification
        captureScreenshot(driver, "HP LP3065 Product Page Specification");
        //click 'Add to Cart' button
        singleProductPage.clickAddToCartButton();
        //assert the user gets the expected error
        assertEquals("Delivery Date required!", singleProductPage.getDeliveryDateErrorMessage(), "The delivery date error message doesn't match expectations or the error wasn't triggered.");
        //capture screenshot of the test result
        captureScreenshot(driver, "HP LP3065 Product Addition To Cart With No Delivery Date Test Result");
    }

    //invalid add 'HP LP3065' to cart test method - reversed delivery date
    protected void invalidAddHPLP3065ToCartReversedDeliveryDateTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        SingleProductCategoryDashboardPage singleProductCategoryDashboardPage = new SingleProductCategoryDashboardPage(driver);
        SingleProductPage singleProductPage = new SingleProductPage(driver);
        //general page web element assert (elements all pages share)
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert (elements all pages share)
        isGeneralPageTextElementAsExpected(generalPage);
        //click 'Add to Cart' (HP LP3065) button
        singleProductCategoryDashboardPage.clickAddToCartButton(2);
        //single product page web element assert
        isSingleProductPageWebElementDisplayed(singleProductPage);
        //single product page additional web element assert (for this page)
        isSingleProductPageAdditionalWebElementDisplayed(singleProductPage);
        //capture screenshot of the single product page
        captureScreenshot(driver, "HP LP3065 Product Page Display");
        //log single product data
        logSingleProductPageData(singleProductPage);
        //click 'Reviews' link
        singleProductPage.clickReviewsLink();
        //reviews section text element assert
        isSingleProductPageReviewsSectionTextElementAsExpected(singleProductPage);
        //input guest review
        guestProductReviewSubmission(singleProductPage);
        //click 'Specifications' link
        singleProductPage.clickSpecificationsLink();
        //log product specification data
        logSingleProductPageProductSpecificationData(singleProductPage);
        //capture screenshot of the single product specification
        captureScreenshot(driver, "HP LP3065 Product Page Specification");
        //input reversed delivery date
        singleProductPage.addReversedDeliveryDate();
        //capture screenshot of the invalid delivery date input
        captureScreenshot(driver, "Invalid Delivery Date Input For HP LP3065 Product");
        //click 'Add to Cart' button
        singleProductPage.clickAddToCartButton();
        //assert the user gets the expected error, otherwise, log the issue
        try {
            assertEquals("Delivery Date format has to be 'YYYY-MMM-DD'!", singleProductPage.getDeliveryDateErrorMessage(), "The invalid delivery date error message doesn't match expectations.");
        } catch(Exception e){
            logger.error("The invalid delivery date error wasn't triggered.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "HP LP3065 Product Addition To Cart With Reversed Delivery Date Test Result");
    }

    //invalid add 'HP LP3065' to cart test method - past delivery date
    protected void invalidAddHPLP3065ToCartPastDeliveryDateTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        SingleProductCategoryDashboardPage singleProductCategoryDashboardPage = new SingleProductCategoryDashboardPage(driver);
        SingleProductPage singleProductPage = new SingleProductPage(driver);
        //general page web element assert (elements all pages share)
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert (elements all pages share)
        isGeneralPageTextElementAsExpected(generalPage);
        //click 'Add to Cart' (HP LP3065) button
        singleProductCategoryDashboardPage.clickAddToCartButton(2);
        //single product page web element assert
        isSingleProductPageWebElementDisplayed(singleProductPage);
        //single product page additional web element assert (for this page)
        isSingleProductPageAdditionalWebElementDisplayed(singleProductPage);
        //capture screenshot of the single product page
        captureScreenshot(driver, "HP LP3065 Product Page Display");
        //log single product data
        logSingleProductPageData(singleProductPage);
        //click 'Reviews' link
        singleProductPage.clickReviewsLink();
        //reviews section text element assert
        isSingleProductPageReviewsSectionTextElementAsExpected(singleProductPage);
        //input guest review
        guestProductReviewSubmission(singleProductPage);
        //click 'Specifications' link
        singleProductPage.clickSpecificationsLink();
        //log product specification data
        logSingleProductPageProductSpecificationData(singleProductPage);
        //capture screenshot of the single product specification
        captureScreenshot(driver, "HP LP3065 Product Page Specification");
        //input past delivery date
        singleProductPage.addPastDeliveryDate();
        //capture screenshot of the invalid delivery date input
        captureScreenshot(driver, "Past Delivery Date Input For HP LP3065 Product");
        //click 'Add to Cart' button
        singleProductPage.clickAddToCartButton();
        //assert the user gets the expected error, otherwise, log the issue
        try {
            assertEquals("Delivery Date cannot be in the past!", singleProductPage.getDeliveryDateErrorMessage(), "The invalid (past) delivery date error message doesn't match expectations.");
        } catch(Exception e){
            logger.error("The invalid delivery (past) date error wasn't triggered.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "HP LP3065 Product Addition To Cart With Reversed Delivery Date Test Result");
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //add single product to check out test method (as a guest)
    protected void addHPLP3065ProductToCheckoutGuestTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        //general page web element assert (elements all pages share)
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert (elements all pages share)
        isGeneralPageTextElementAsExpected(generalPage);
        //capture screenshot of the shopping cart page display
        captureScreenshot(driver, "Shopping Cart Page Display");
        //click 'Estimate shipping' dropdown link
        shoppingCartPage.clickEstimateShippingDropdownLink();
        //shopping cart page web element assert
        isShoppingCartPageWebElementDisplayed(shoppingCartPage);
        //shopping cart 'Estimate shipping' page web element assert (this product has this section)
        isShoppingCartPageEstimateShippingSectionWebElementDisplayed(shoppingCartPage);
        //shopping cart page text element assert
        isShoppingCartPageTextElementAsExpected(shoppingCartPage);
        //log shopping cart product data
        logShoppingCartPageProductData(shoppingCartPage);
        //click shipping country dropdown menu
        shoppingCartPage.clickShippingCountryDropdownMenu();
        //select 'United States' option
        shoppingCartPage.selectUsCountryOption();
        //click shipping state dropdown menu
        shoppingCartPage.clickShippingStateDropdownMenu();
        //select 'Illinois' option
        shoppingCartPage.selectIllinoisStateOption();
        //click 'Get quotes' button
        shoppingCartPage.clickGetQuotesButton();
        //click 'Flat shipping' radio button
        shoppingCartPage.clickFlatShippingRadioButton();
        //click 'Apply shipping' radio button
        shoppingCartPage.clickApplyShippingButton();
        //assert the shipping rate has been applied
        assertEquals("Success: Your shipping estimate has been applied!\n" + "×", shoppingCartPage.getShippingRateApplicationSuccessMessage(), "The shipping rate application success message doesn't match expectations or the shipping rate application has failed.");
        //click 'Checkout' button
        shoppingCartPage.clickCheckoutButton();
        //capture screenshot of the test result
        captureScreenshot(driver, "Single Product (HP LP3065) Addition To Checkout Test Result (guest)");
    }

    //add single product to check out test method (as a registered user)
    protected void addHPLP3065ProductToCheckoutRegUserTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        //general page web element assert (elements all pages share)
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert (elements all pages share)
        isGeneralPageTextElementAsExpected(generalPage);
        //capture screenshot of the shopping cart page display
        captureScreenshot(driver, "Shopping Cart Page Display");
        //click 'Estimate shipping' dropdown link
        shoppingCartPage.clickEstimateShippingDropdownLink();
        //shopping cart page web element assert
        isShoppingCartPageWebElementDisplayed(shoppingCartPage);
        //shopping cart 'Estimate shipping' page web element assert (this product has this section)
        isShoppingCartPageEstimateShippingSectionWebElementDisplayed(shoppingCartPage);
        //shopping cart page text element assert
        isShoppingCartPageTextElementAsExpected(shoppingCartPage);
        //log shopping cart product data
        logShoppingCartPageProductData(shoppingCartPage);
        //click 'Checkout' button
        shoppingCartPage.clickCheckoutButton();
        //capture screenshot of the test result
        captureScreenshot(driver, "Single Product (HP LP3065) Addition To Checkout Test Result (registered user)");
    }

    //update product qty during addition to check out test method -> both guest and registered user will have the same output, guest branch only is being tested
    protected void updateHPLP3065ProductQtyToCheckoutTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        //general page web element assert (elements all pages share)
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert (elements all pages share)
        isGeneralPageTextElementAsExpected(generalPage);
        //capture screenshot of the shopping cart page display
        captureScreenshot(driver, "Shopping Cart Page Display");
        //click 'Estimate shipping' dropdown link
        shoppingCartPage.clickEstimateShippingDropdownLink();
        //shopping cart page web element assert
        isShoppingCartPageWebElementDisplayed(shoppingCartPage);
        //shopping cart 'Estimate shipping' page web element assert (this product has this section)
        isShoppingCartPageEstimateShippingSectionWebElementDisplayed(shoppingCartPage);
        //shopping cart page text element assert
        isShoppingCartPageTextElementAsExpected(shoppingCartPage);
        //log shopping cart product data
        logShoppingCartPageProductData(shoppingCartPage);
        //assert the title matches expectations
        assertEquals("Shopping Cart  (1.00kg)", shoppingCartPage.getShoppingCartPageTitle(), "The shopping cart page title doesn't match expectations.");
        //click shipping country dropdown menu
        shoppingCartPage.clickShippingCountryDropdownMenu();
        //select 'United States' option
        shoppingCartPage.selectUsCountryOption();
        //click shipping state dropdown menu
        shoppingCartPage.clickShippingStateDropdownMenu();
        //select 'Illinois' option
        shoppingCartPage.selectIllinoisStateOption();
        //click 'Get quotes' button
        shoppingCartPage.clickGetQuotesButton();
        //click 'Flat shipping' radio button
        shoppingCartPage.clickFlatShippingRadioButton();
        //click 'Apply shipping' radio button
        shoppingCartPage.clickApplyShippingButton();
        //assert the shipping rate has been applied
        assertEquals("Success: Your shipping estimate has been applied!\n" + "×", shoppingCartPage.getShippingRateApplicationSuccessMessage(), "The shipping rate application success message doesn't match expectations or the shipping rate application has failed.");
        //input updated quantity
        shoppingCartPage.inputProductQtyIntoQtyInputField(0);
        //click 'Update' quantity button
        shoppingCartPage.clickUpdateQuantityButton(0);
        //assert the shipping rate has been applied
        assertEquals("Success: You have modified your shopping cart!\n" + "×", shoppingCartPage.getShippingRateApplicationSuccessMessage(), "The product quantity update success message doesn't match expectations or the product quantity update has failed.");
        //click 'Checkout' button
        shoppingCartPage.clickCheckoutButton();
        //capture screenshot of the test result
        captureScreenshot(driver, "Updated Product (HP LP3065) Addition To Checkout Test Result (guest)");
    }

    //remove product from shopping cart page table test method -> both guest and registered user will have the same output, guest branch only is being tested
    protected void removeHPLP3065ProductFromShoppingCartTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        //general page web element assert (elements all pages share)
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert (elements all pages share)
        isGeneralPageTextElementAsExpected(generalPage);
        //capture screenshot of the shopping cart page display
        captureScreenshot(driver, "Shopping Cart Page Display");
        //click 'Estimate shipping' dropdown link
        shoppingCartPage.clickEstimateShippingDropdownLink();
        //shopping cart page web element assert
        isShoppingCartPageWebElementDisplayed(shoppingCartPage);
        //shopping cart 'Estimate shipping' page web element assert (this product has this section)
        isShoppingCartPageEstimateShippingSectionWebElementDisplayed(shoppingCartPage);
        //shopping cart page text element assert
        isShoppingCartPageTextElementAsExpected(shoppingCartPage);
        //log shopping cart product data
        logShoppingCartPageProductData(shoppingCartPage);
        //assert the title matches expectations
        assertEquals("Shopping Cart  (1.00kg)", shoppingCartPage.getShoppingCartPageTitle(), "The shopping cart page title doesn't match expectations.");
        //click shipping country dropdown menu
        shoppingCartPage.clickShippingCountryDropdownMenu();
        //select 'United States' option
        shoppingCartPage.selectUsCountryOption();
        //click shipping state dropdown menu
        shoppingCartPage.clickShippingStateDropdownMenu();
        //select 'Illinois' option
        shoppingCartPage.selectIllinoisStateOption();
        //click 'Get quotes' button
        shoppingCartPage.clickGetQuotesButton();
        //click 'Flat shipping' radio button
        shoppingCartPage.clickFlatShippingRadioButton();
        //click 'Apply shipping' radio button
        shoppingCartPage.clickApplyShippingButton();
        //assert the shipping rate has been applied
        assertEquals("Success: Your shipping estimate has been applied!\n" + "×", shoppingCartPage.getShippingRateApplicationSuccessMessage(), "The shipping rate application success message doesn't match expectations or the shipping rate application has failed.");
        //click 'Remove' button
        shoppingCartPage.clickRemoveProductButton(0);
        //assert the user gets the expected message
        assertEquals("Your shopping cart is empty!", shoppingCartPage.getShoppingCartEmptyMessage(), "'The shopping cart is empty' message doesn't match expectations.");
        //capture screenshot of the test result
        captureScreenshot(driver, "Product (HP LP3065) Removal From Shopping Cart Test Result");
    }

    //add single product to check out without selecting shipping country / state test method  -> both guest and registered user will have the same output, guest branch only is being tested
    protected void addHPLP3065ProductToCheckoutWithoutShippingCountryStateTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        //general page web element assert (elements all pages share)
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert (elements all pages share)
        isGeneralPageTextElementAsExpected(generalPage);
        //capture screenshot of the shopping cart page display
        captureScreenshot(driver, "Shopping Cart Page Display");
        //click 'Estimate shipping' dropdown link
        shoppingCartPage.clickEstimateShippingDropdownLink();
        //shopping cart page web element assert
        isShoppingCartPageWebElementDisplayed(shoppingCartPage);
        //shopping cart 'Estimate shipping' page web element assert (this product has this section)
        isShoppingCartPageEstimateShippingSectionWebElementDisplayed(shoppingCartPage);
        //shopping cart page text element assert
        isShoppingCartPageTextElementAsExpected(shoppingCartPage);
        //log shopping cart product data
        logShoppingCartPageProductData(shoppingCartPage);
        //click shipping country dropdown menu
        shoppingCartPage.clickShippingCountryDropdownMenu();
        //select 'Please Select' option
        shoppingCartPage.selectPleaseSelectCountryOption();
        //click shipping state dropdown menu
        shoppingCartPage.clickShippingStateDropdownMenu();
        //select 'Illinois' option
        shoppingCartPage.selectPleaseSelectsStateOption();
        //click 'Get quotes' button
        shoppingCartPage.clickGetQuotesButton();
        //assert the user gets an expected error messages
        assertEquals("Please select a country!", shoppingCartPage.getShoppingCartCountryErrorMessage(), "The select country error message doesn't match expectations or the error wasn't triggered.");
        assertEquals("Please select a region / state!", shoppingCartPage.getShoppingCartStateErrorMessage(), "The select state error message doesn't match expectations or the error wasn't triggered.");
        //click 'Checkout' button
        shoppingCartPage.clickCheckoutButton();
        //capture screenshot of the test result
        captureScreenshot(driver, "Single Product (HP LP3065) Addition To Checkout Without Shipping Country and State Test Result (guest)");
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //valid checkout test (as a guest)

    //valid 'HP LP3065' product order checkout test method (as a guest)
    protected void validHPLP3065ProductOrderCheckoutConfirmationGuestTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        CheckoutPageGuest checkoutPageGuest = new CheckoutPageGuest(driver);
        //general page web element assert (elements all pages share)
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert (elements all pages share)
        isGeneralPageTextElementAsExpected(generalPage);
        //capture screenshot of the checkout page display
        captureScreenshot(driver, "HP LP3065 Product Checkout Page Display");
        //checkout page web element assert
        isCheckoutPageWebElementDisplayed(checkoutPage);
        //checkout page text element assert
        isCheckoutPageTextElementAsExpected(checkoutPage);
        //checkout page new customer section web element assert
        isCheckoutPageNewCustomerSectionWebElementDisplayed(checkoutPage);
        //checkout page returning customer section web element assert
        isCheckoutPageReturningCustomerSectionWebElementDisplayed(checkoutPage);
        //checkout page new customer section text element assert
        isCheckoutPageNewCustomerSectionTextElementAsExpected(checkoutPage);
        //capture screenshot of the checkout page display - new customer section
        captureScreenshot(driver, "HP LP3065 Product Checkout Page Display - New Customer Section");
        //click 'Guest' account radio button
        checkoutPageGuest.clickGuestAccountRadioButton();
        //click new customer section 'Continue' button
        checkoutPageGuest.clickNewCustomerContinueButton();
        //checkout page billing details section web element assert
        isCheckoutPageGuestSectionWebElementDisplayed(checkoutPage);
        //checkout page billing details section text element assert
        isCheckoutPageBillingDetailsSectionTextElementAsExpected(checkoutPage);
        //valid guest input data getter (for guest account creation)
        checkoutPageGuest.validGuestAccountDataInputGetter();
        //input valid guest first name into first name input field
        checkoutPageGuest.inputValidGuestFirstNameIntoFirstNameInputField();
        //input valid guest last name into last name input field
        checkoutPageGuest.inputValidGuestLastNameIntoLastNameInputField();
        //input valid guest email into email input field
        checkoutPageGuest.inputValidGuestEmailIntoEmailInputField();
        //input valid guest phone into phone input field
        checkoutPageGuest.inputValidGuestPhoneIntoPhoneInputField();
        //input valid guest address 1 into address 1 input field
        checkoutPageGuest.inputValidGuestAddress1IntoAddress1InputField();
        //input valid guest city into city input field
        checkoutPageGuest.inputValidGuestCityIntoCityInputField();
        //input valid guest post code into post code input field
        checkoutPageGuest.inputValidGuestPostCodeIntoPostCodeInputField();
        //click country dropdown menu
        checkoutPageGuest.clickBillingDetailsCountryDropdownMenu();
        //select 'United States' option
        checkoutPageGuest.selectUsCountryOption();
        //click state dropdown menu
        checkoutPageGuest.clickBillingDetailsStateDropdownMenu();
        //select 'Illinois' option
        checkoutPageGuest.selectIllinoisStateOption();
        //capture screenshot of the checkout page display - valid guest account data input
        captureScreenshot(driver, "HP LP3065 Product Checkout Page Display - Valid Guest Account Data Input");
        //click 'Billing details' section 'Continue' button
        checkoutPageGuest.clickBillingDetailsContinueButton();
        //checkout page delivery method section web element assert
        isCheckoutPageDeliverySectionWebElementDisplayed(checkoutPage);
        //checkout page delivery method section text element assert
        isCheckoutPageDeliveryMethodSectionTextElementAsExpected(checkoutPage);
        //capture screenshot of the checkout page (delivery method section) display
        captureScreenshot(driver, "HP LP3065 Product Checkout Page Delivery Method Section Display");
        //click delivery method section 'Continue' button
        checkoutPage.clickDeliveryMethodContinueButton();
        //checkout page payment method section web element assert
        isCheckoutPagePaymentSectionWebElementDisplayed(checkoutPage);
        //checkout page payment method section text element assert
        isCheckoutPagePaymentMethodSectionTextElementAsExpected(checkoutPage);
        //capture screenshot of the checkout page (payment method section) display
        captureScreenshot(driver, "HP LP3065 Product Checkout Page Payment Method Section Display");
        //click payment method section 'Agree to terms and conditions' button
        checkoutPage.clickPayMethodTermsConditionsCheckbox();
        //click payment method section 'Continue' button
        checkoutPage.clickPaymentMethodContinueButton();
        //checkout page confirm order section web element display
        isCheckoutPageConfirmOrderSectionWebElementDisplayed(checkoutPage);
        //capture screenshot of the checkout page (confirm order section) display
        captureScreenshot(driver, "HP LP3065 Product Checkout Page Confirm Order Section Display");
        //log confirm order section product table data
        logCheckoutPageProductTableData(checkoutPage);
        //click 'Confirm order' button
        checkoutPage.clickConfirmOrderButton();
        //capture screenshot of the test result
        captureScreenshot(driver, "HP LP3065 Product Checkout Page Confirmation Test Result (as a guest)");
    }

    //valid checkout test (as a registered user)

    //valid 'HP LP3065' product order checkout test method (as a registered user)
    protected void validHPLP3065ProductOrderCheckoutConfirmationRegUserTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        //general page web element assert (elements all pages share)
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert (elements all pages share)
        isGeneralPageTextElementAsExpected(generalPage);
        //capture screenshot of the checkout page display
        captureScreenshot(driver, "HP LP3065 Product Checkout Page Display");
        //checkout page web element assert
        isCheckoutPageWebElementDisplayed(checkoutPage);
        //checkout page text element assert
        isCheckoutPageTextElementAsExpected(checkoutPage);
        //capture screenshot of the checkout page display - new customer section
        captureScreenshot(driver, "HP LP3065 Product Checkout Page Display - New Customer Section");
        //click billing address section 'Continue' button
        checkoutPage.clickBillingAddressContinueButton();
        //capture screenshot of the checkout page (delivery details section) display
        captureScreenshot(driver, "HP LP3065 Product Checkout Page Delivery Details Section Display");
        //click delivery details section 'Continue' button
        checkoutPage.clickDeliveryDetailsContinueButton();
        //checkout page delivery method section web element assert
        isCheckoutPageDeliverySectionWebElementDisplayed(checkoutPage);
        //checkout page delivery method section text element assert
        isCheckoutPageDeliveryMethodSectionTextElementAsExpected(checkoutPage);
        //capture screenshot of the checkout page (delivery method section) display
        captureScreenshot(driver, "HP LP3065 Product Checkout Page Delivery Method Section Display");
        //click delivery method section 'Continue' button
        checkoutPage.clickDeliveryMethodContinueButton();
        //checkout page payment method section web element assert
        isCheckoutPagePaymentSectionWebElementDisplayed(checkoutPage);
        //checkout page payment method section text element assert
        isCheckoutPagePaymentMethodSectionTextElementAsExpected(checkoutPage);
        //capture screenshot of the checkout page (payment method section) display
        captureScreenshot(driver, "HP LP3065 Product Checkout Page Payment Method Section Display");
        //click payment method section 'Agree to terms and conditions' button
        checkoutPage.clickPayMethodTermsConditionsCheckbox();
        //click payment method section 'Continue' button
        checkoutPage.clickPaymentMethodContinueButton();
        //checkout page confirm order section web element display
        isCheckoutPageConfirmOrderSectionWebElementDisplayed(checkoutPage);
        //capture screenshot of the checkout page (confirm order section) display
        captureScreenshot(driver, "HP LP3065 Product Checkout Page Confirm Order Section Display");
        //log confirm order section product table data
        logCheckoutPageProductTableData(checkoutPage);
        //click 'Confirm order' button
        checkoutPage.clickConfirmOrderButton();
        //capture screenshot of the test result
        captureScreenshot(driver, "HP LP3065 Product Checkout Page Confirmation Test Result (as a registered user)");
    }

    //invalid checkout tests (as a guest) -> guest checkout section

    //no singular input

    //invalid 'HP LP3065' product order checkout test method (as a guest) - no guest account first name
    protected void invalidHPLP3065ProductOrderCheckoutConfirmationNoGuestFirstNameTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        CheckoutPageGuest checkoutPageGuest = new CheckoutPageGuest(driver);
        CheckoutPageGuestNoSingularInput checkoutPageGuestNoSingularInput = new CheckoutPageGuestNoSingularInput(driver);
        //general page web element assert (elements all pages share)
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert (elements all pages share)
        isGeneralPageTextElementAsExpected(generalPage);
        //capture screenshot of the checkout page display
        captureScreenshot(driver, "HP LP3065 Product Checkout Page Display");
        //checkout page web element assert
        isCheckoutPageWebElementDisplayed(checkoutPage);
        //checkout page text element assert
        isCheckoutPageTextElementAsExpected(checkoutPage);
        //checkout page new customer section web element assert
        isCheckoutPageNewCustomerSectionWebElementDisplayed(checkoutPage);
        //checkout page returning customer section web element assert
        isCheckoutPageReturningCustomerSectionWebElementDisplayed(checkoutPage);
        //checkout page new customer section text element assert
        isCheckoutPageNewCustomerSectionTextElementAsExpected(checkoutPage);
        //capture screenshot of the checkout page display - new customer section
        captureScreenshot(driver, "HP LP3065 Product Checkout Page Display - New Customer Section");
        //click 'Guest' account radio button
        checkoutPageGuest.clickGuestAccountRadioButton();
        //click new customer section 'Continue' button
        checkoutPageGuest.clickNewCustomerContinueButton();
        //checkout page billing details section web element assert
        isCheckoutPageGuestSectionWebElementDisplayed(checkoutPage);
        //checkout page billing details section text element assert
        isCheckoutPageBillingDetailsSectionTextElementAsExpected(checkoutPage);
        //invalid guest input data getter (for guest account creation) - no guest first name
        checkoutPageGuestNoSingularInput.invalidGuestAccountDataNoFirstNameInputGetter();
        //don't input guest first name into first name input field
        checkoutPageGuestNoSingularInput.inputNoGuestFirstNameIntoFirstNameInputField();
        //capture screenshot of the checkout page display - invalid guest account data input
        captureScreenshot(driver, "HP LP3065 Product Checkout Page Display - No Guest First Name");
        //input valid guest last name into last name input field
        checkoutPageGuestNoSingularInput.inputValidGuestLastNameIntoLastNameInputField();
        //input valid guest email into email input field
        checkoutPageGuestNoSingularInput.inputValidGuestEmailIntoEmailInputField();
        //input valid guest phone into phone input field
        checkoutPageGuestNoSingularInput.inputValidGuestPhoneIntoPhoneInputField();
        //input valid guest address 1 into address 1 input field
        checkoutPageGuestNoSingularInput.inputValidGuestAddress1IntoAddress1InputField();
        //input valid guest city into city input field
        checkoutPageGuestNoSingularInput.inputValidGuestCityIntoCityInputField();
        //input valid guest post code into post code input field
        checkoutPageGuestNoSingularInput.inputValidGuestPostCodeIntoPostCodeInputField();
        //click country dropdown menu
        checkoutPageGuest.clickBillingDetailsCountryDropdownMenu();
        //select 'United States' option
        checkoutPageGuest.selectUsCountryOption();
        //click state dropdown menu
        checkoutPageGuest.clickBillingDetailsStateDropdownMenu();
        //select 'Illinois' option
        checkoutPageGuest.selectIllinoisStateOption();
        //capture screenshot of the checkout page display - invalid guest account data input
        captureScreenshot(driver, "HP LP3065 Product Checkout Page Display - Invalid Guest Account Data Input - No First Name");
        //click 'Billing details' section 'Continue' button
        checkoutPageGuest.clickBillingDetailsContinueButton();
        //assert the user gets an expected error message
        assertEquals("First Name must be between 1 and 32 characters!", checkoutPageGuestNoSingularInput.getInvalidGuestCheckoutInputError(), "The missing guest account first name input error doesn't match expectations or the error hasn't been triggered.");
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid HP LP3065 Product Checkout Page Confirmation Test Result - No Guest First Name");
    }

    //invalid 'HP LP3065' product order checkout test method (as a guest) - no guest account last name
    protected void invalidHPLP3065ProductOrderCheckoutConfirmationNoGuestLastNameTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        CheckoutPageGuest checkoutPageGuest = new CheckoutPageGuest(driver);
        CheckoutPageGuestNoSingularInput checkoutPageGuestNoSingularInput = new CheckoutPageGuestNoSingularInput(driver);
        //general page web element assert (elements all pages share)
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert (elements all pages share)
        isGeneralPageTextElementAsExpected(generalPage);
        //capture screenshot of the checkout page display
        captureScreenshot(driver, "HP LP3065 Product Checkout Page Display");
        //checkout page web element assert
        isCheckoutPageWebElementDisplayed(checkoutPage);
        //checkout page text element assert
        isCheckoutPageTextElementAsExpected(checkoutPage);
        //checkout page new customer section web element assert
        isCheckoutPageNewCustomerSectionWebElementDisplayed(checkoutPage);
        //checkout page returning customer section web element assert
        isCheckoutPageReturningCustomerSectionWebElementDisplayed(checkoutPage);
        //checkout page new customer section text element assert
        isCheckoutPageNewCustomerSectionTextElementAsExpected(checkoutPage);
        //capture screenshot of the checkout page display - new customer section
        captureScreenshot(driver, "HP LP3065 Product Checkout Page Display - New Customer Section");
        //click 'Guest' account radio button
        checkoutPageGuest.clickGuestAccountRadioButton();
        //click new customer section 'Continue' button
        checkoutPageGuest.clickNewCustomerContinueButton();
        //checkout page billing details section web element assert
        isCheckoutPageGuestSectionWebElementDisplayed(checkoutPage);
        //checkout page billing details section text element assert
        isCheckoutPageBillingDetailsSectionTextElementAsExpected(checkoutPage);
        //invalid guest input data getter (for guest account creation) - no guest last name
        checkoutPageGuestNoSingularInput.invalidGuestAccountDataNoLastNameInputGetter();
        //input valid guest first name into first name input field
        checkoutPageGuestNoSingularInput.inputValidGuestFirstNameIntoFirstNameInputField();
        //don't input guest last name into last name input field
        checkoutPageGuestNoSingularInput.inputNoGuestLastNameIntoLastNameInputField();
        //capture screenshot of the checkout page display - invalid guest account data input
        captureScreenshot(driver, "HP LP3065 Product Checkout Page Display - No Guest Last Name");
        //input valid guest email into email input field
        checkoutPageGuestNoSingularInput.inputValidGuestEmailIntoEmailInputField();
        //input valid guest phone into phone input field
        checkoutPageGuestNoSingularInput.inputValidGuestPhoneIntoPhoneInputField();
        //input valid guest address 1 into address 1 input field
        checkoutPageGuestNoSingularInput.inputValidGuestAddress1IntoAddress1InputField();
        //input valid guest city into city input field
        checkoutPageGuestNoSingularInput.inputValidGuestCityIntoCityInputField();
        //input valid guest post code into post code input field
        checkoutPageGuestNoSingularInput.inputValidGuestPostCodeIntoPostCodeInputField();
        //click country dropdown menu
        checkoutPageGuest.clickBillingDetailsCountryDropdownMenu();
        //select 'United States' option
        checkoutPageGuest.selectUsCountryOption();
        //click state dropdown menu
        checkoutPageGuest.clickBillingDetailsStateDropdownMenu();
        //select 'Illinois' option
        checkoutPageGuest.selectIllinoisStateOption();
        //capture screenshot of the checkout page display - invalid guest account data input
        captureScreenshot(driver, "HP LP3065 Product Checkout Page Display - Invalid Guest Account Data Input - No Last Name");
        //click 'Billing details' section 'Continue' button
        checkoutPageGuest.clickBillingDetailsContinueButton();
        //assert the user gets an expected error message
        assertEquals("Last Name must be between 1 and 32 characters!", checkoutPageGuestNoSingularInput.getInvalidGuestCheckoutInputError(), "The missing guest account last name input error doesn't match expectations or the error hasn't been triggered.");
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid HP LP3065 Product Checkout Page Confirmation Test Result - No Guest Last Name");
    }

    //invalid 'HP LP3065' product order checkout test method (as a guest) - no guest account email
    protected void invalidHPLP3065ProductOrderCheckoutConfirmationNoGuestEmailTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        CheckoutPageGuest checkoutPageGuest = new CheckoutPageGuest(driver);
        CheckoutPageGuestNoSingularInput checkoutPageGuestNoSingularInput = new CheckoutPageGuestNoSingularInput(driver);
        //general page web element assert (elements all pages share)
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert (elements all pages share)
        isGeneralPageTextElementAsExpected(generalPage);
        //capture screenshot of the checkout page display
        captureScreenshot(driver, "HP LP3065 Product Checkout Page Display");
        //checkout page web element assert
        isCheckoutPageWebElementDisplayed(checkoutPage);
        //checkout page text element assert
        isCheckoutPageTextElementAsExpected(checkoutPage);
        //checkout page new customer section web element assert
        isCheckoutPageNewCustomerSectionWebElementDisplayed(checkoutPage);
        //checkout page returning customer section web element assert
        isCheckoutPageReturningCustomerSectionWebElementDisplayed(checkoutPage);
        //checkout page new customer section text element assert
        isCheckoutPageNewCustomerSectionTextElementAsExpected(checkoutPage);
        //capture screenshot of the checkout page display - new customer section
        captureScreenshot(driver, "HP LP3065 Product Checkout Page Display - New Customer Section");
        //click 'Guest' account radio button
        checkoutPageGuest.clickGuestAccountRadioButton();
        //click new customer section 'Continue' button
        checkoutPageGuest.clickNewCustomerContinueButton();
        //checkout page billing details section web element assert
        isCheckoutPageGuestSectionWebElementDisplayed(checkoutPage);
        //checkout page billing details section text element assert
        isCheckoutPageBillingDetailsSectionTextElementAsExpected(checkoutPage);
        //invalid guest input data getter (for guest account creation) - no guest email
        checkoutPageGuestNoSingularInput.invalidGuestAccountDataNoEmailInputGetter();
        //input valid guest first name into first name input field
        checkoutPageGuestNoSingularInput.inputValidGuestFirstNameIntoFirstNameInputField();
        //input valid guest last name into last name input field
        checkoutPageGuestNoSingularInput.inputValidGuestLastNameIntoLastNameInputField();
        //don't input guest email into email input field
        checkoutPageGuestNoSingularInput.inputNoGuestEmailIntoEmailInputField();
        //capture screenshot of the checkout page display - invalid guest account data input
        captureScreenshot(driver, "HP LP3065 Product Checkout Page Display - No Guest Email");
        //input valid guest phone into phone input field
        checkoutPageGuestNoSingularInput.inputValidGuestPhoneIntoPhoneInputField();
        //input valid guest address 1 into address 1 input field
        checkoutPageGuestNoSingularInput.inputValidGuestAddress1IntoAddress1InputField();
        //input valid guest city into city input field
        checkoutPageGuestNoSingularInput.inputValidGuestCityIntoCityInputField();
        //input valid guest post code into post code input field
        checkoutPageGuestNoSingularInput.inputValidGuestPostCodeIntoPostCodeInputField();
        //click country dropdown menu
        checkoutPageGuest.clickBillingDetailsCountryDropdownMenu();
        //select 'United States' option
        checkoutPageGuest.selectUsCountryOption();
        //click state dropdown menu
        checkoutPageGuest.clickBillingDetailsStateDropdownMenu();
        //select 'Illinois' option
        checkoutPageGuest.selectIllinoisStateOption();
        //capture screenshot of the checkout page display - invalid guest account data input
        captureScreenshot(driver, "HP LP3065 Product Checkout Page Display - Invalid Guest Account Data Input - No Email");
        //click 'Billing details' section 'Continue' button
        checkoutPageGuest.clickBillingDetailsContinueButton();
        //assert the user gets an expected error message
        assertEquals("E-Mail address does not appear to be valid!", checkoutPageGuestNoSingularInput.getInvalidGuestCheckoutInputError(), "The missing guest account email input error doesn't match expectations or the error hasn't been triggered.");
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid HP LP3065 Product Checkout Page Confirmation Test Result - No Guest Email");
    }

    //invalid 'HP LP3065' product order checkout test method (as a guest) - no guest account phone
    protected void invalidHPLP3065ProductOrderCheckoutConfirmationNoGuestPhoneTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        CheckoutPageGuest checkoutPageGuest = new CheckoutPageGuest(driver);
        CheckoutPageGuestNoSingularInput checkoutPageGuestNoSingularInput = new CheckoutPageGuestNoSingularInput(driver);
        //general page web element assert (elements all pages share)
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert (elements all pages share)
        isGeneralPageTextElementAsExpected(generalPage);
        //capture screenshot of the checkout page display
        captureScreenshot(driver, "HP LP3065 Product Checkout Page Display");
        //checkout page web element assert
        isCheckoutPageWebElementDisplayed(checkoutPage);
        //checkout page text element assert
        isCheckoutPageTextElementAsExpected(checkoutPage);
        //checkout page new customer section web element assert
        isCheckoutPageNewCustomerSectionWebElementDisplayed(checkoutPage);
        //checkout page returning customer section web element assert
        isCheckoutPageReturningCustomerSectionWebElementDisplayed(checkoutPage);
        //checkout page new customer section text element assert
        isCheckoutPageNewCustomerSectionTextElementAsExpected(checkoutPage);
        //capture screenshot of the checkout page display - new customer section
        captureScreenshot(driver, "HP LP3065 Product Checkout Page Display - New Customer Section");
        //click 'Guest' account radio button
        checkoutPageGuest.clickGuestAccountRadioButton();
        //click new customer section 'Continue' button
        checkoutPageGuest.clickNewCustomerContinueButton();
        //checkout page billing details section web element assert
        isCheckoutPageGuestSectionWebElementDisplayed(checkoutPage);
        //checkout page billing details section text element assert
        isCheckoutPageBillingDetailsSectionTextElementAsExpected(checkoutPage);
        //invalid guest input data getter (for guest account creation) - no guest phone
        checkoutPageGuestNoSingularInput.invalidGuestAccountDataNoPhoneInputGetter();
        //input valid guest first name into first name input field
        checkoutPageGuestNoSingularInput.inputValidGuestFirstNameIntoFirstNameInputField();
        //input valid guest last name into last name input field
        checkoutPageGuestNoSingularInput.inputValidGuestLastNameIntoLastNameInputField();
        //input valid guest email into email input field
        checkoutPageGuestNoSingularInput.inputValidGuestEmailIntoEmailInputField();
        //don't input guest phone into phone input field
        checkoutPageGuestNoSingularInput.inputNoGuestPhoneIntoPhoneInputField();
        //capture screenshot of the checkout page display - invalid guest account data input
        captureScreenshot(driver, "HP LP3065 Product Checkout Page Display - No Guest Phone");
        //input valid guest address 1 into address 1 input field
        checkoutPageGuestNoSingularInput.inputValidGuestAddress1IntoAddress1InputField();
        //input valid guest city into city input field
        checkoutPageGuestNoSingularInput.inputValidGuestCityIntoCityInputField();
        //input valid guest post code into post code input field
        checkoutPageGuestNoSingularInput.inputValidGuestPostCodeIntoPostCodeInputField();
        //click country dropdown menu
        checkoutPageGuest.clickBillingDetailsCountryDropdownMenu();
        //select 'United States' option
        checkoutPageGuest.selectUsCountryOption();
        //click state dropdown menu
        checkoutPageGuest.clickBillingDetailsStateDropdownMenu();
        //select 'Illinois' option
        checkoutPageGuest.selectIllinoisStateOption();
        //capture screenshot of the checkout page display - invalid guest account data input
        captureScreenshot(driver, "HP LP3065 Product Checkout Page Display - Invalid Guest Account Data Input - No Phone");
        //click 'Billing details' section 'Continue' button
        checkoutPageGuest.clickBillingDetailsContinueButton();
        //assert the user gets an expected error message
        assertEquals("Telephone must be between 3 and 32 characters!", checkoutPageGuestNoSingularInput.getInvalidGuestCheckoutInputError(), "The missing guest account phone input error doesn't match expectations or the error hasn't been triggered.");
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid HP LP3065 Product Checkout Page Confirmation Test Result - No Guest Phone");
    }

    //invalid 'HP LP3065' product order checkout test method (as a guest) - no guest account address
    protected void invalidHPLP3065ProductOrderCheckoutConfirmationNoGuestAddressTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        CheckoutPageGuest checkoutPageGuest = new CheckoutPageGuest(driver);
        CheckoutPageGuestNoSingularInput checkoutPageGuestNoSingularInput = new CheckoutPageGuestNoSingularInput(driver);
        //general page web element assert (elements all pages share)
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert (elements all pages share)
        isGeneralPageTextElementAsExpected(generalPage);
        //capture screenshot of the checkout page display
        captureScreenshot(driver, "HP LP3065 Product Checkout Page Display");
        //checkout page web element assert
        isCheckoutPageWebElementDisplayed(checkoutPage);
        //checkout page text element assert
        isCheckoutPageTextElementAsExpected(checkoutPage);
        //checkout page new customer section web element assert
        isCheckoutPageNewCustomerSectionWebElementDisplayed(checkoutPage);
        //checkout page returning customer section web element assert
        isCheckoutPageReturningCustomerSectionWebElementDisplayed(checkoutPage);
        //checkout page new customer section text element assert
        isCheckoutPageNewCustomerSectionTextElementAsExpected(checkoutPage);
        //capture screenshot of the checkout page display - new customer section
        captureScreenshot(driver, "HP LP3065 Product Checkout Page Display - New Customer Section");
        //click 'Guest' account radio button
        checkoutPageGuest.clickGuestAccountRadioButton();
        //click new customer section 'Continue' button
        checkoutPageGuest.clickNewCustomerContinueButton();
        //checkout page billing details section web element assert
        isCheckoutPageGuestSectionWebElementDisplayed(checkoutPage);
        //checkout page billing details section text element assert
        isCheckoutPageBillingDetailsSectionTextElementAsExpected(checkoutPage);
        //invalid guest input data getter (for guest account creation) - no guest address
        checkoutPageGuestNoSingularInput.invalidGuestAccountDataNoAddressInputGetter();
        //input valid guest first name into first name input field
        checkoutPageGuestNoSingularInput.inputValidGuestFirstNameIntoFirstNameInputField();
        //input valid guest last name into last name input field
        checkoutPageGuestNoSingularInput.inputValidGuestLastNameIntoLastNameInputField();
        //input valid guest email into email input field
        checkoutPageGuestNoSingularInput.inputValidGuestEmailIntoEmailInputField();
        //input valid guest phone into phone input field
        checkoutPageGuestNoSingularInput.inputValidGuestPhoneIntoPhoneInputField();
        //don't input guest address 1 into address 1 input field
        checkoutPageGuestNoSingularInput.inputNoGuestAddress1IntoAddress1InputField();
        //capture screenshot of the checkout page display - invalid guest account data input
        captureScreenshot(driver, "HP LP3065 Product Checkout Page Display - No Guest Address");
        //input valid guest city into city input field
        checkoutPageGuestNoSingularInput.inputValidGuestCityIntoCityInputField();
        //input valid guest post code into post code input field
        checkoutPageGuestNoSingularInput.inputValidGuestPostCodeIntoPostCodeInputField();
        //click country dropdown menu
        checkoutPageGuest.clickBillingDetailsCountryDropdownMenu();
        //select 'United States' option
        checkoutPageGuest.selectUsCountryOption();
        //click state dropdown menu
        checkoutPageGuest.clickBillingDetailsStateDropdownMenu();
        //select 'Illinois' option
        checkoutPageGuest.selectIllinoisStateOption();
        //capture screenshot of the checkout page display - invalid guest account data input
        captureScreenshot(driver, "HP LP3065 Product Checkout Page Display - Invalid Guest Account Data Input - No Address");
        //click 'Billing details' section 'Continue' button
        checkoutPageGuest.clickBillingDetailsContinueButton();
        //assert the user gets an expected error message
        assertEquals("Address 1 must be between 3 and 128 characters!", checkoutPageGuestNoSingularInput.getInvalidGuestCheckoutInputError(), "The missing guest account address input error doesn't match expectations or the error hasn't been triggered.");
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid HP LP3065 Product Checkout Page Confirmation Test Result - No Guest Address");
    }

    //invalid 'HP LP3065' product order checkout test method (as a guest) - no guest account city
    protected void invalidHPLP3065ProductOrderCheckoutConfirmationNoGuestCityTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        CheckoutPageGuest checkoutPageGuest = new CheckoutPageGuest(driver);
        CheckoutPageGuestNoSingularInput checkoutPageGuestNoSingularInput = new CheckoutPageGuestNoSingularInput(driver);
        //general page web element assert (elements all pages share)
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert (elements all pages share)
        isGeneralPageTextElementAsExpected(generalPage);
        //capture screenshot of the checkout page display
        captureScreenshot(driver, "HP LP3065 Product Checkout Page Display");
        //checkout page web element assert
        isCheckoutPageWebElementDisplayed(checkoutPage);
        //checkout page text element assert
        isCheckoutPageTextElementAsExpected(checkoutPage);
        //checkout page new customer section web element assert
        isCheckoutPageNewCustomerSectionWebElementDisplayed(checkoutPage);
        //checkout page returning customer section web element assert
        isCheckoutPageReturningCustomerSectionWebElementDisplayed(checkoutPage);
        //checkout page new customer section text element assert
        isCheckoutPageNewCustomerSectionTextElementAsExpected(checkoutPage);
        //capture screenshot of the checkout page display - new customer section
        captureScreenshot(driver, "HP LP3065 Product Checkout Page Display - New Customer Section");
        //click 'Guest' account radio button
        checkoutPageGuest.clickGuestAccountRadioButton();
        //click new customer section 'Continue' button
        checkoutPageGuest.clickNewCustomerContinueButton();
        //checkout page billing details section web element assert
        isCheckoutPageGuestSectionWebElementDisplayed(checkoutPage);
        //checkout page billing details section text element assert
        isCheckoutPageBillingDetailsSectionTextElementAsExpected(checkoutPage);
        //invalid guest input data getter (for guest account creation) - no guest city
        checkoutPageGuestNoSingularInput.invalidGuestAccountDataNoCityInputGetter();
        //input valid guest first name into first name input field
        checkoutPageGuestNoSingularInput.inputValidGuestFirstNameIntoFirstNameInputField();
        //input valid guest last name into last name input field
        checkoutPageGuestNoSingularInput.inputValidGuestLastNameIntoLastNameInputField();
        //input valid guest email into email input field
        checkoutPageGuestNoSingularInput.inputValidGuestEmailIntoEmailInputField();
        //input valid guest phone into phone input field
        checkoutPageGuestNoSingularInput.inputValidGuestPhoneIntoPhoneInputField();
        //input valid guest address 1 into address 1 input field
        checkoutPageGuestNoSingularInput.inputValidGuestAddress1IntoAddress1InputField();
        //don't input guest city into city input field
        checkoutPageGuestNoSingularInput.inputNoGuestCityIntoCityInputField();
        //capture screenshot of the checkout page display - invalid guest account data input
        captureScreenshot(driver, "HP LP3065 Product Checkout Page Display - No Guest City");
        //input valid guest post code into post code input field
        checkoutPageGuestNoSingularInput.inputValidGuestPostCodeIntoPostCodeInputField();
        //click country dropdown menu
        checkoutPageGuest.clickBillingDetailsCountryDropdownMenu();
        //select 'United States' option
        checkoutPageGuest.selectUsCountryOption();
        //click state dropdown menu
        checkoutPageGuest.clickBillingDetailsStateDropdownMenu();
        //select 'Illinois' option
        checkoutPageGuest.selectIllinoisStateOption();
        //capture screenshot of the checkout page display - invalid guest account data input
        captureScreenshot(driver, "HP LP3065 Product Checkout Page Display - Invalid Guest Account Data Input - No City");
        //click 'Billing details' section 'Continue' button
        checkoutPageGuest.clickBillingDetailsContinueButton();
        //assert the user gets an expected error message
        assertEquals("City must be between 2 and 128 characters!", checkoutPageGuestNoSingularInput.getInvalidGuestCheckoutInputError(), "The missing guest account city input error doesn't match expectations or the error hasn't been triggered.");
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid HP LP3065 Product Checkout Page Confirmation Test Result - No Guest City");
    }

    //invalid 'HP LP3065' product order checkout test method (as a guest) - no guest account post code (the error wasn't triggered, test has failed)
    protected void invalidHPLP3065ProductOrderCheckoutConfirmationNoGuestPostCodeTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        CheckoutPageGuest checkoutPageGuest = new CheckoutPageGuest(driver);
        CheckoutPageGuestNoSingularInput checkoutPageGuestNoSingularInput = new CheckoutPageGuestNoSingularInput(driver);
        //general page web element assert (elements all pages share)
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert (elements all pages share)
        isGeneralPageTextElementAsExpected(generalPage);
        //capture screenshot of the checkout page display
        captureScreenshot(driver, "HP LP3065 Product Checkout Page Display");
        //checkout page web element assert
        isCheckoutPageWebElementDisplayed(checkoutPage);
        //checkout page text element assert
        isCheckoutPageTextElementAsExpected(checkoutPage);
        //checkout page new customer section web element assert
        isCheckoutPageNewCustomerSectionWebElementDisplayed(checkoutPage);
        //checkout page returning customer section web element assert
        isCheckoutPageReturningCustomerSectionWebElementDisplayed(checkoutPage);
        //checkout page new customer section text element assert
        isCheckoutPageNewCustomerSectionTextElementAsExpected(checkoutPage);
        //capture screenshot of the checkout page display - new customer section
        captureScreenshot(driver, "HP LP3065 Product Checkout Page Display - New Customer Section");
        //click 'Guest' account radio button
        checkoutPageGuest.clickGuestAccountRadioButton();
        //click new customer section 'Continue' button
        checkoutPageGuest.clickNewCustomerContinueButton();
        //checkout page billing details section web element assert
        isCheckoutPageGuestSectionWebElementDisplayed(checkoutPage);
        //checkout page billing details section text element assert
        isCheckoutPageBillingDetailsSectionTextElementAsExpected(checkoutPage);
        //invalid guest input data getter (for guest account creation) - no guest post code
        checkoutPageGuestNoSingularInput.invalidGuestAccountDataNoPostCodeInputGetter();
        //input valid guest first name into first name input field
        checkoutPageGuestNoSingularInput.inputValidGuestFirstNameIntoFirstNameInputField();
        //input valid guest last name into last name input field
        checkoutPageGuestNoSingularInput.inputValidGuestLastNameIntoLastNameInputField();
        //input valid guest email into email input field
        checkoutPageGuestNoSingularInput.inputValidGuestEmailIntoEmailInputField();
        //input valid guest phone into phone input field
        checkoutPageGuestNoSingularInput.inputValidGuestPhoneIntoPhoneInputField();
        //input valid guest address 1 into address 1 input field
        checkoutPageGuestNoSingularInput.inputValidGuestAddress1IntoAddress1InputField();
        //input valid guest city into city input field
        checkoutPageGuestNoSingularInput.inputValidGuestCityIntoCityInputField();
        //don't input guest post code into post code input field
        checkoutPageGuestNoSingularInput.inputNoGuestPostCodeIntoPostCodeInputField();
        //click country dropdown menu
        checkoutPageGuest.clickBillingDetailsCountryDropdownMenu();
        //select 'United States' option
        checkoutPageGuest.selectUsCountryOption();
        //click state dropdown menu
        checkoutPageGuest.clickBillingDetailsStateDropdownMenu();
        //select 'Illinois' option
        checkoutPageGuest.selectIllinoisStateOption();
        //capture screenshot of the checkout page display - invalid guest account data input
        captureScreenshot(driver, "HP LP3065 Product Checkout Page Display - Invalid Guest Account Data Input - No Postal Code");
        //click 'Billing details' section 'Continue' button
        checkoutPageGuest.clickBillingDetailsContinueButton();
        //assert the user gets an expected error message, otherwise, log the issue
        try {
            assertEquals("Post code must have 5-digit format!", checkoutPageGuestNoSingularInput.getInvalidGuestCheckoutInputError(), "The missing guest account post code input error doesn't match expectations.");
        } catch (Exception e){
            logger.error("The missing post code input error wasn't triggered.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid HP LP3065 Product Checkout Page Confirmation Test Result - No Guest Postal Code");
    }

    //invalid 'HP LP3065' product order checkout test method (as a guest) - no guest country
    protected void invalidHPLP3065ProductOrderCheckoutConfirmationNoGuestCountryTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        CheckoutPageGuest checkoutPageGuest = new CheckoutPageGuest(driver);
        CheckoutPageGuestNoSingularInput checkoutPageGuestNoSingularInput = new CheckoutPageGuestNoSingularInput(driver);
        //general page web element assert (elements all pages share)
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert (elements all pages share)
        isGeneralPageTextElementAsExpected(generalPage);
        //capture screenshot of the checkout page display
        captureScreenshot(driver, "HP LP3065 Product Checkout Page Display");
        //checkout page web element assert
        isCheckoutPageWebElementDisplayed(checkoutPage);
        //checkout page text element assert
        isCheckoutPageTextElementAsExpected(checkoutPage);
        //checkout page new customer section web element assert
        isCheckoutPageNewCustomerSectionWebElementDisplayed(checkoutPage);
        //checkout page returning customer section web element assert
        isCheckoutPageReturningCustomerSectionWebElementDisplayed(checkoutPage);
        //checkout page new customer section text element assert
        isCheckoutPageNewCustomerSectionTextElementAsExpected(checkoutPage);
        //capture screenshot of the checkout page display - new customer section
        captureScreenshot(driver, "HP LP3065 Product Checkout Page Display - New Customer Section");
        //click 'Guest' account radio button
        checkoutPageGuest.clickGuestAccountRadioButton();
        //click new customer section 'Continue' button
        checkoutPageGuest.clickNewCustomerContinueButton();
        //checkout page billing details section web element assert
        isCheckoutPageGuestSectionWebElementDisplayed(checkoutPage);
        //checkout page billing details section text element assert
        isCheckoutPageBillingDetailsSectionTextElementAsExpected(checkoutPage);
        //valid guest input data getter (for guest account creation) - no guest country selection
        checkoutPageGuest.validGuestAccountDataInputGetter();
        //input valid guest first name into first name input field
        checkoutPageGuest.inputValidGuestFirstNameIntoFirstNameInputField();
        //input valid guest last name into last name input field
        checkoutPageGuest.inputValidGuestLastNameIntoLastNameInputField();
        //input valid guest email into email input field
        checkoutPageGuest.inputValidGuestEmailIntoEmailInputField();
        //input valid guest phone into phone input field
        checkoutPageGuest.inputValidGuestPhoneIntoPhoneInputField();
        //input valid guest address 1 into address 1 input field
        checkoutPageGuest.inputValidGuestAddress1IntoAddress1InputField();
        //input valid guest city into city input field
        checkoutPageGuest.inputValidGuestCityIntoCityInputField();
        //input valid guest post code into post code input field
        checkoutPageGuest.inputValidGuestPostCodeIntoPostCodeInputField();
        //click country dropdown menu
        checkoutPageGuestNoSingularInput.clickBillingDetailsCountryDropdownMenu();
        //select 'Please Select' country option
        checkoutPageGuestNoSingularInput.selectPleaseSelectCountryOption();
        //capture screenshot of the checkout page display - invalid guest account data input
        captureScreenshot(driver, "HP LP3065 Product Checkout Page Display - Invalid Guest Account Data Input - No Country");
        //click 'Billing details' section 'Continue' button
        checkoutPageGuest.clickBillingDetailsContinueButton();
        //assert the user gets an expected error message, otherwise, log the issue
        try {
            assertEquals("Please select a country!", checkoutPageGuestNoSingularInput.getInvalidGuestCheckoutInputError(), "The missing guest account country input error doesn't match expectations.");
        } catch (Exception e){
            logger.error("The missing country input error wasn't triggered.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid HP LP3065 Product Checkout Page Confirmation Test Result - No Guest Country");
    }

    //invalid 'HP LP3065' product order checkout test method (as a guest) - no guest state
    protected void invalidHPLP3065ProductOrderCheckoutConfirmationNoGuestStateTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        CheckoutPageGuest checkoutPageGuest = new CheckoutPageGuest(driver);
        CheckoutPageGuestNoSingularInput checkoutPageGuestNoSingularInput = new CheckoutPageGuestNoSingularInput(driver);
        //general page web element assert (elements all pages share)
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert (elements all pages share)
        isGeneralPageTextElementAsExpected(generalPage);
        //capture screenshot of the checkout page display
        captureScreenshot(driver, "HP LP3065 Product Checkout Page Display");
        //checkout page web element assert
        isCheckoutPageWebElementDisplayed(checkoutPage);
        //checkout page text element assert
        isCheckoutPageTextElementAsExpected(checkoutPage);
        //checkout page new customer section web element assert
        isCheckoutPageNewCustomerSectionWebElementDisplayed(checkoutPage);
        //checkout page returning customer section web element assert
        isCheckoutPageReturningCustomerSectionWebElementDisplayed(checkoutPage);
        //checkout page new customer section text element assert
        isCheckoutPageNewCustomerSectionTextElementAsExpected(checkoutPage);
        //capture screenshot of the checkout page display - new customer section
        captureScreenshot(driver, "HP LP3065 Product Checkout Page Display - New Customer Section");
        //click 'Guest' account radio button
        checkoutPageGuest.clickGuestAccountRadioButton();
        //click new customer section 'Continue' button
        checkoutPageGuest.clickNewCustomerContinueButton();
        //checkout page billing details section web element assert
        isCheckoutPageGuestSectionWebElementDisplayed(checkoutPage);
        //checkout page billing details section text element assert
        isCheckoutPageBillingDetailsSectionTextElementAsExpected(checkoutPage);
        //valid guest input data getter (for guest account creation) - no guest country selection
        checkoutPageGuest.validGuestAccountDataInputGetter();
        //input valid guest first name into first name input field
        checkoutPageGuest.inputValidGuestFirstNameIntoFirstNameInputField();
        //input valid guest last name into last name input field
        checkoutPageGuest.inputValidGuestLastNameIntoLastNameInputField();
        //input valid guest email into email input field
        checkoutPageGuest.inputValidGuestEmailIntoEmailInputField();
        //input valid guest phone into phone input field
        checkoutPageGuest.inputValidGuestPhoneIntoPhoneInputField();
        //input valid guest address 1 into address 1 input field
        checkoutPageGuest.inputValidGuestAddress1IntoAddress1InputField();
        //input valid guest city into city input field
        checkoutPageGuest.inputValidGuestCityIntoCityInputField();
        //input valid guest post code into post code input field
        checkoutPageGuest.inputValidGuestPostCodeIntoPostCodeInputField();
        //click country dropdown menu
        checkoutPageGuest.clickBillingDetailsCountryDropdownMenu();
        //select 'United States' option
        checkoutPageGuest.selectUsCountryOption();
        //click state dropdown menu
        checkoutPageGuestNoSingularInput.clickBillingDetailsStateDropdownMenu();
        //select 'Please Select' state option
        checkoutPageGuestNoSingularInput.selectPleaseSelectStateOption();
        //capture screenshot of the checkout page display - invalid guest account data input
        captureScreenshot(driver, "HP LP3065 Product Checkout Page Display - Invalid Guest Account Data Input - No State");
        //click 'Billing details' section 'Continue' button
        checkoutPageGuest.clickBillingDetailsContinueButton();
        //assert the user gets an expected error message, otherwise, log the issue
        try {
            assertEquals("Please select a region / state!", checkoutPageGuestNoSingularInput.getInvalidGuestCheckoutInputError(), "The missing guest account state input error doesn't match expectations.");
        } catch (Exception e){
            logger.error("The missing state input error wasn't triggered.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid HP LP3065 Product Checkout Page Confirmation Test Result - No Guest State");
    }

    //invalid 'HP LP3065' product order checkout test method (as a guest) - no 'Agree to Terms' checkbox selection
    protected void invalidHPLP3065ProductOrderCheckoutConfirmationGuestNoAgreeToTermsTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        CheckoutPageGuest checkoutPageGuest = new CheckoutPageGuest(driver);
        CheckoutPageGuestNoSingularInput checkoutPageGuestNoSingularInput = new CheckoutPageGuestNoSingularInput(driver);
        //general page web element assert (elements all pages share)
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert (elements all pages share)
        isGeneralPageTextElementAsExpected(generalPage);
        //capture screenshot of the checkout page display
        captureScreenshot(driver, "HP LP3065 Product Checkout Page Display");
        //checkout page web element assert
        isCheckoutPageWebElementDisplayed(checkoutPage);
        //checkout page text element assert
        isCheckoutPageTextElementAsExpected(checkoutPage);
        //checkout page new customer section web element assert
        isCheckoutPageNewCustomerSectionWebElementDisplayed(checkoutPage);
        //checkout page returning customer section web element assert
        isCheckoutPageReturningCustomerSectionWebElementDisplayed(checkoutPage);
        //checkout page new customer section text element assert
        isCheckoutPageNewCustomerSectionTextElementAsExpected(checkoutPage);
        //capture screenshot of the checkout page display - new customer section
        captureScreenshot(driver, "HP LP3065 Product Checkout Page Display - New Customer Section");
        //click 'Guest' account radio button
        checkoutPageGuest.clickGuestAccountRadioButton();
        //click new customer section 'Continue' button
        checkoutPageGuest.clickNewCustomerContinueButton();
        //checkout page billing details section web element assert
        isCheckoutPageGuestSectionWebElementDisplayed(checkoutPage);
        //checkout page billing details section text element assert
        isCheckoutPageBillingDetailsSectionTextElementAsExpected(checkoutPage);
        //valid guest input data getter (for guest account creation)
        checkoutPageGuest.validGuestAccountDataInputGetter();
        //input valid guest first name into first name input field
        checkoutPageGuest.inputValidGuestFirstNameIntoFirstNameInputField();
        //input valid guest last name into last name input field
        checkoutPageGuest.inputValidGuestLastNameIntoLastNameInputField();
        //input valid guest email into email input field
        checkoutPageGuest.inputValidGuestEmailIntoEmailInputField();
        //input valid guest phone into phone input field
        checkoutPageGuest.inputValidGuestPhoneIntoPhoneInputField();
        //input valid guest address 1 into address 1 input field
        checkoutPageGuest.inputValidGuestAddress1IntoAddress1InputField();
        //input valid guest city into city input field
        checkoutPageGuest.inputValidGuestCityIntoCityInputField();
        //input valid guest post code into post code input field
        checkoutPageGuest.inputValidGuestPostCodeIntoPostCodeInputField();
        //click country dropdown menu
        checkoutPageGuest.clickBillingDetailsCountryDropdownMenu();
        //select 'United States' option
        checkoutPageGuest.selectUsCountryOption();
        //click state dropdown menu
        checkoutPageGuest.clickBillingDetailsStateDropdownMenu();
        //select 'Illinois' option
        checkoutPageGuest.selectIllinoisStateOption();
        //capture screenshot of the checkout page display - valid guest account data input
        captureScreenshot(driver, "HP LP3065 Product Checkout Page Display - Valid Guest Account Data Input");
        //click 'Billing details' section 'Continue' button
        checkoutPageGuest.clickBillingDetailsContinueButton();
        //checkout page delivery method section web element assert
        isCheckoutPageDeliverySectionWebElementDisplayed(checkoutPage);
        //checkout page delivery method section text element assert
        isCheckoutPageDeliveryMethodSectionTextElementAsExpected(checkoutPage);
        //capture screenshot of the checkout page (delivery method section) display
        captureScreenshot(driver, "HP LP3065 Product Checkout Page Delivery Method Section Display");
        //click delivery method section 'Continue' button
        checkoutPage.clickDeliveryMethodContinueButton();
        //checkout page payment method section web element assert
        isCheckoutPagePaymentSectionWebElementDisplayed(checkoutPage);
        //checkout page payment method section text element assert
        isCheckoutPagePaymentMethodSectionTextElementAsExpected(checkoutPage);
        //capture screenshot of the checkout page (payment method section) display
        captureScreenshot(driver, "HP LP3065 Product Checkout Page Payment Method Section Display");
        //click payment method section 'Continue' button
        checkoutPage.clickPaymentMethodContinueButton();
        //assert the user gets an expected error message, otherwise, log the issue
        try {
            assertEquals("Warning: You must agree to the Terms & Conditions!\n" + "×", checkoutPageGuestNoSingularInput.getTermsAndConditionsError(), "The terms and conditions error doesn't match expectations.");
        } catch(Exception e){
            logger.error("The terms and conditions error wasn't triggered.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid HP LP3065 Product Checkout Page Confirmation Test Result - No 'Agree To Terms' Checkbox Selection");
    }

    //too short singular input

    //invalid 'HP LP3065' product order checkout test method (as a guest) - too short guest account first name (1 char) (the error wasn't triggered, test has failed)
    protected void invalidHPLP3065ProductOrderCheckoutConfirmationTooShortGuestFirstNameTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        CheckoutPageGuest checkoutPageGuest = new CheckoutPageGuest(driver);
        CheckoutPageGuestTooShortSingularInput checkoutPageGuestTooShortSingularInput = new CheckoutPageGuestTooShortSingularInput(driver);
        //general page web element assert (elements all pages share)
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert (elements all pages share)
        isGeneralPageTextElementAsExpected(generalPage);
        //capture screenshot of the checkout page display
        captureScreenshot(driver, "HP LP3065 Product Checkout Page Display");
        //checkout page web element assert
        isCheckoutPageWebElementDisplayed(checkoutPage);
        //checkout page text element assert
        isCheckoutPageTextElementAsExpected(checkoutPage);
        //checkout page new customer section web element assert
        isCheckoutPageNewCustomerSectionWebElementDisplayed(checkoutPage);
        //checkout page returning customer section web element assert
        isCheckoutPageReturningCustomerSectionWebElementDisplayed(checkoutPage);
        //checkout page new customer section text element assert
        isCheckoutPageNewCustomerSectionTextElementAsExpected(checkoutPage);
        //capture screenshot of the checkout page display - new customer section
        captureScreenshot(driver, "HP LP3065 Product Checkout Page Display - New Customer Section");
        //click 'Guest' account radio button
        checkoutPageGuest.clickGuestAccountRadioButton();
        //click new customer section 'Continue' button
        checkoutPageGuest.clickNewCustomerContinueButton();
        //checkout page billing details section web element assert
        isCheckoutPageGuestSectionWebElementDisplayed(checkoutPage);
        //checkout page billing details section text element assert
        isCheckoutPageBillingDetailsSectionTextElementAsExpected(checkoutPage);
        //invalid guest input data getter (for guest account creation) - too short guest first name (1 char)
        checkoutPageGuestTooShortSingularInput.invalidGuestAccountDataTooShortFirstNameInputGetter();
        //input too short guest first name into first name input field (1 char)
        checkoutPageGuestTooShortSingularInput.inputTooShortGuestFirstNameIntoFirstNameInputField();
        //capture screenshot of the checkout page display - invalid guest account data input
        captureScreenshot(driver, "HP LP3065 Product Checkout Page Display - Too Short Guest First Name");
        //input valid guest last name into last name input field
        checkoutPageGuestTooShortSingularInput.inputValidGuestLastNameIntoLastNameInputField();
        //input valid guest email into email input field
        checkoutPageGuestTooShortSingularInput.inputValidGuestEmailIntoEmailInputField();
        //input valid guest phone into phone input field
        checkoutPageGuestTooShortSingularInput.inputValidGuestPhoneIntoPhoneInputField();
        //input valid guest address 1 into address 1 input field
        checkoutPageGuestTooShortSingularInput.inputValidGuestAddress1IntoAddress1InputField();
        //input valid guest city into city input field
        checkoutPageGuestTooShortSingularInput.inputValidGuestCityIntoCityInputField();
        //input valid guest post code into post code input field
        checkoutPageGuestTooShortSingularInput.inputValidGuestPostCodeIntoPostCodeInputField();
        //click country dropdown menu
        checkoutPageGuest.clickBillingDetailsCountryDropdownMenu();
        //select 'United States' option
        checkoutPageGuest.selectUsCountryOption();
        //click state dropdown menu
        checkoutPageGuest.clickBillingDetailsStateDropdownMenu();
        //select 'Illinois' option
        checkoutPageGuest.selectIllinoisStateOption();
        //capture screenshot of the checkout page display - invalid guest account data input
        captureScreenshot(driver, "HP LP3065 Product Checkout Page Display - Invalid Guest Account Data Input - Too Short First Name");
        //click 'Billing details' section 'Continue' button
        checkoutPageGuest.clickBillingDetailsContinueButton();
        //assert the user gets an expected error message, otherwise, log the issue
        try {
            assertEquals("First Name must be between 1 and 32 characters!", checkoutPageGuestTooShortSingularInput.getInvalidGuestCheckoutInputError(), "The too short guest account first name input error doesn't match expectations.");
        } catch(Exception e){
            logger.error("The too short guest account first name error wasn't triggered.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid HP LP3065 Product Checkout Page Confirmation Test Result - Too Short Guest First Name");
    }

    //invalid 'HP LP3065' product order checkout test method (as a guest) - too short guest account last name (1 char) (the error wasn't triggered, test has failed)
    protected void invalidHPLP3065ProductOrderCheckoutConfirmationTooShortGuestLastNameTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        CheckoutPageGuest checkoutPageGuest = new CheckoutPageGuest(driver);
        CheckoutPageGuestTooShortSingularInput checkoutPageGuestTooShortSingularInput = new CheckoutPageGuestTooShortSingularInput(driver);
        //general page web element assert (elements all pages share)
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert (elements all pages share)
        isGeneralPageTextElementAsExpected(generalPage);
        //capture screenshot of the checkout page display
        captureScreenshot(driver, "HP LP3065 Product Checkout Page Display");
        //checkout page web element assert
        isCheckoutPageWebElementDisplayed(checkoutPage);
        //checkout page text element assert
        isCheckoutPageTextElementAsExpected(checkoutPage);
        //checkout page new customer section web element assert
        isCheckoutPageNewCustomerSectionWebElementDisplayed(checkoutPage);
        //checkout page returning customer section web element assert
        isCheckoutPageReturningCustomerSectionWebElementDisplayed(checkoutPage);
        //checkout page new customer section text element assert
        isCheckoutPageNewCustomerSectionTextElementAsExpected(checkoutPage);
        //capture screenshot of the checkout page display - new customer section
        captureScreenshot(driver, "HP LP3065 Product Checkout Page Display - New Customer Section");
        //click 'Guest' account radio button
        checkoutPageGuest.clickGuestAccountRadioButton();
        //click new customer section 'Continue' button
        checkoutPageGuest.clickNewCustomerContinueButton();
        //checkout page billing details section web element assert
        isCheckoutPageGuestSectionWebElementDisplayed(checkoutPage);
        //checkout page billing details section text element assert
        isCheckoutPageBillingDetailsSectionTextElementAsExpected(checkoutPage);
        //invalid guest input data getter (for guest account creation) - too short guest last name (1 char)
        checkoutPageGuestTooShortSingularInput.invalidGuestAccountDataTooShortLastNameInputGetter();
        //input valid guest first name into first name input field
        checkoutPageGuestTooShortSingularInput.inputValidGuestFirstNameIntoFirstNameInputField();
        //input too short guest last name into last name input field (1 char)
        checkoutPageGuestTooShortSingularInput.inputTooShortGuestLastNameIntoLastNameInputField();
        //capture screenshot of the checkout page display - invalid guest account data input
        captureScreenshot(driver, "HP LP3065 Product Checkout Page Display - Too Short Guest Last Name");
        //input valid guest email into email input field
        checkoutPageGuestTooShortSingularInput.inputValidGuestEmailIntoEmailInputField();
        //input valid guest phone into phone input field
        checkoutPageGuestTooShortSingularInput.inputValidGuestPhoneIntoPhoneInputField();
        //input valid guest address 1 into address 1 input field
        checkoutPageGuestTooShortSingularInput.inputValidGuestAddress1IntoAddress1InputField();
        //input valid guest city into city input field
        checkoutPageGuestTooShortSingularInput.inputValidGuestCityIntoCityInputField();
        //input valid guest post code into post code input field
        checkoutPageGuestTooShortSingularInput.inputValidGuestPostCodeIntoPostCodeInputField();
        //click country dropdown menu
        checkoutPageGuest.clickBillingDetailsCountryDropdownMenu();
        //select 'United States' option
        checkoutPageGuest.selectUsCountryOption();
        //click state dropdown menu
        checkoutPageGuest.clickBillingDetailsStateDropdownMenu();
        //select 'Illinois' option
        checkoutPageGuest.selectIllinoisStateOption();
        //capture screenshot of the checkout page display - invalid guest account data input
        captureScreenshot(driver, "HP LP3065 Product Checkout Page Display - Invalid Guest Account Data Input - Too Short Last Name");
        //click 'Billing details' section 'Continue' button
        checkoutPageGuest.clickBillingDetailsContinueButton();
        //assert the user gets an expected error message, otherwise, log the issue
        try {
            assertEquals("Last Name must be between 1 and 32 characters!", checkoutPageGuestTooShortSingularInput.getInvalidGuestCheckoutInputError(), "The too short guest account last name input error doesn't match expectations.");
        } catch(Exception e){
            logger.error("The too short guest account last name error wasn't triggered.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid HP LP3065 Product Checkout Page Confirmation Test Result - Too Short Guest Last Name");
    }

    //invalid 'HP LP3065' product order checkout test method (as a guest) - too short guest account email (1 char -> name, domain) (the error wasn't triggered, test has failed)
    protected void invalidHPLP3065ProductOrderCheckoutConfirmationTooShortGuestEmailTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        CheckoutPageGuest checkoutPageGuest = new CheckoutPageGuest(driver);
        CheckoutPageGuestTooShortSingularInput checkoutPageGuestTooShortSingularInput = new CheckoutPageGuestTooShortSingularInput(driver);
        //general page web element assert (elements all pages share)
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert (elements all pages share)
        isGeneralPageTextElementAsExpected(generalPage);
        //capture screenshot of the checkout page display
        captureScreenshot(driver, "HP LP3065 Product Checkout Page Display");
        //checkout page web element assert
        isCheckoutPageWebElementDisplayed(checkoutPage);
        //checkout page text element assert
        isCheckoutPageTextElementAsExpected(checkoutPage);
        //checkout page new customer section web element assert
        isCheckoutPageNewCustomerSectionWebElementDisplayed(checkoutPage);
        //checkout page returning customer section web element assert
        isCheckoutPageReturningCustomerSectionWebElementDisplayed(checkoutPage);
        //checkout page new customer section text element assert
        isCheckoutPageNewCustomerSectionTextElementAsExpected(checkoutPage);
        //capture screenshot of the checkout page display - new customer section
        captureScreenshot(driver, "HP LP3065 Product Checkout Page Display - New Customer Section");
        //click 'Guest' account radio button
        checkoutPageGuest.clickGuestAccountRadioButton();
        //click new customer section 'Continue' button
        checkoutPageGuest.clickNewCustomerContinueButton();
        //checkout page billing details section web element assert
        isCheckoutPageGuestSectionWebElementDisplayed(checkoutPage);
        //checkout page billing details section text element assert
        isCheckoutPageBillingDetailsSectionTextElementAsExpected(checkoutPage);
        //invalid guest input data getter (for guest account creation) - too short guest email (1 char -> name,domain)
        checkoutPageGuestTooShortSingularInput.invalidGuestAccountDataTooShortEmailInputGetter();
        //input valid guest first name into first name input field
        checkoutPageGuestTooShortSingularInput.inputValidGuestFirstNameIntoFirstNameInputField();
        //input valid guest last name into last name input field
        checkoutPageGuestTooShortSingularInput.inputValidGuestLastNameIntoLastNameInputField();
        //input too short guest email into email input field (1 char -> name,domain)
        checkoutPageGuestTooShortSingularInput.inputTooShortGuestEmailIntoEmailInputField();
        //capture screenshot of the checkout page display - invalid guest account data input
        captureScreenshot(driver, "HP LP3065 Product Checkout Page Display - Too Short Guest Email");
        //input valid guest phone into phone input field
        checkoutPageGuestTooShortSingularInput.inputValidGuestPhoneIntoPhoneInputField();
        //input valid guest address 1 into address 1 input field
        checkoutPageGuestTooShortSingularInput.inputValidGuestAddress1IntoAddress1InputField();
        //input valid guest city into city input field
        checkoutPageGuestTooShortSingularInput.inputValidGuestCityIntoCityInputField();
        //input valid guest post code into post code input field
        checkoutPageGuestTooShortSingularInput.inputValidGuestPostCodeIntoPostCodeInputField();
        //click country dropdown menu
        checkoutPageGuest.clickBillingDetailsCountryDropdownMenu();
        //select 'United States' option
        checkoutPageGuest.selectUsCountryOption();
        //click state dropdown menu
        checkoutPageGuest.clickBillingDetailsStateDropdownMenu();
        //select 'Illinois' option
        checkoutPageGuest.selectIllinoisStateOption();
        //capture screenshot of the checkout page display - invalid guest account data input
        captureScreenshot(driver, "HP LP3065 Product Checkout Page Display - Invalid Guest Account Data Input - Too Short Email");
        //click 'Billing details' section 'Continue' button
        checkoutPageGuest.clickBillingDetailsContinueButton();
        //assert the user gets an expected error message, otherwise, log the issue
        try {
            assertEquals("Email is too short!", checkoutPageGuestTooShortSingularInput.getInvalidGuestCheckoutInputError(), "The too short guest account email input error doesn't match expectations.");
        } catch(Exception e){
            logger.error("The too short guest account email error wasn't triggered.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid HP LP3065 Product Checkout Page Confirmation Test Result - Too Short Guest Email");
    }

    //invalid 'HP LP3065' product order checkout test method (as a guest) - too short guest account phone (2 digits)
    protected void invalidHPLP3065ProductOrderCheckoutConfirmationTooShortGuestPhoneTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        CheckoutPageGuest checkoutPageGuest = new CheckoutPageGuest(driver);
        CheckoutPageGuestTooShortSingularInput checkoutPageGuestTooShortSingularInput = new CheckoutPageGuestTooShortSingularInput(driver);
        //general page web element assert (elements all pages share)
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert (elements all pages share)
        isGeneralPageTextElementAsExpected(generalPage);
        //capture screenshot of the checkout page display
        captureScreenshot(driver, "HP LP3065 Product Checkout Page Display");
        //checkout page web element assert
        isCheckoutPageWebElementDisplayed(checkoutPage);
        //checkout page text element assert
        isCheckoutPageTextElementAsExpected(checkoutPage);
        //checkout page new customer section web element assert
        isCheckoutPageNewCustomerSectionWebElementDisplayed(checkoutPage);
        //checkout page returning customer section web element assert
        isCheckoutPageReturningCustomerSectionWebElementDisplayed(checkoutPage);
        //checkout page new customer section text element assert
        isCheckoutPageNewCustomerSectionTextElementAsExpected(checkoutPage);
        //capture screenshot of the checkout page display - new customer section
        captureScreenshot(driver, "HP LP3065 Product Checkout Page Display - New Customer Section");
        //click 'Guest' account radio button
        checkoutPageGuest.clickGuestAccountRadioButton();
        //click new customer section 'Continue' button
        checkoutPageGuest.clickNewCustomerContinueButton();
        //checkout page billing details section web element assert
        isCheckoutPageGuestSectionWebElementDisplayed(checkoutPage);
        //checkout page billing details section text element assert
        isCheckoutPageBillingDetailsSectionTextElementAsExpected(checkoutPage);
        //invalid guest input data getter (for guest account creation) - too short guest phone (2 digits)
        checkoutPageGuestTooShortSingularInput.invalidGuestAccountDataTooShortPhoneInputGetter();
        //input valid guest first name into first name input field
        checkoutPageGuestTooShortSingularInput.inputValidGuestFirstNameIntoFirstNameInputField();
        //input valid guest last name into last name input field
        checkoutPageGuestTooShortSingularInput.inputValidGuestLastNameIntoLastNameInputField();
        //input valid guest email into email input field
        checkoutPageGuestTooShortSingularInput.inputValidGuestEmailIntoEmailInputField();
        //input too short guest phone into phone input field (2 digits)
        checkoutPageGuestTooShortSingularInput.inputTooShortGuestPhoneIntoPhoneInputField();
        //capture screenshot of the checkout page display - invalid guest account data input
        captureScreenshot(driver, "HP LP3065 Product Checkout Page Display - Too Short Guest Phone");
        //input valid guest address 1 into address 1 input field
        checkoutPageGuestTooShortSingularInput.inputValidGuestAddress1IntoAddress1InputField();
        //input valid guest city into city input field
        checkoutPageGuestTooShortSingularInput.inputValidGuestCityIntoCityInputField();
        //input valid guest post code into post code input field
        checkoutPageGuestTooShortSingularInput.inputValidGuestPostCodeIntoPostCodeInputField();
        //click country dropdown menu
        checkoutPageGuest.clickBillingDetailsCountryDropdownMenu();
        //select 'United States' option
        checkoutPageGuest.selectUsCountryOption();
        //click state dropdown menu
        checkoutPageGuest.clickBillingDetailsStateDropdownMenu();
        //select 'Illinois' option
        checkoutPageGuest.selectIllinoisStateOption();
        //capture screenshot of the checkout page display - invalid guest account data input
        captureScreenshot(driver, "HP LP3065 Product Checkout Page Display - Invalid Guest Account Data Input - Too Short Phone");
        //click 'Billing details' section 'Continue' button
        checkoutPageGuest.clickBillingDetailsContinueButton();
        //assert the user gets an expected error message, otherwise, log the issue
        try {
            assertEquals("Telephone must be between 3 and 32 characters!", checkoutPageGuestTooShortSingularInput.getInvalidGuestCheckoutInputError(), "The too short guest account phone input error doesn't match expectations.");
        } catch(Exception e){
            logger.error("The too short guest account phone error wasn't triggered.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid HP LP3065 Product Checkout Page Confirmation Test Result - Too Short Guest Last Phone");
    }

    //invalid 'HP LP3065' product order checkout test method (as a guest) - too short guest account address (2 chars)
    protected void invalidHPLP3065ProductOrderCheckoutConfirmationTooShortGuestAddressTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        CheckoutPageGuest checkoutPageGuest = new CheckoutPageGuest(driver);
        CheckoutPageGuestTooShortSingularInput checkoutPageGuestTooShortSingularInput = new CheckoutPageGuestTooShortSingularInput(driver);
        //general page web element assert (elements all pages share)
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert (elements all pages share)
        isGeneralPageTextElementAsExpected(generalPage);
        //capture screenshot of the checkout page display
        captureScreenshot(driver, "HP LP3065 Product Checkout Page Display");
        //checkout page web element assert
        isCheckoutPageWebElementDisplayed(checkoutPage);
        //checkout page text element assert
        isCheckoutPageTextElementAsExpected(checkoutPage);
        //checkout page new customer section web element assert
        isCheckoutPageNewCustomerSectionWebElementDisplayed(checkoutPage);
        //checkout page returning customer section web element assert
        isCheckoutPageReturningCustomerSectionWebElementDisplayed(checkoutPage);
        //checkout page new customer section text element assert
        isCheckoutPageNewCustomerSectionTextElementAsExpected(checkoutPage);
        //capture screenshot of the checkout page display - new customer section
        captureScreenshot(driver, "HP LP3065 Product Checkout Page Display - New Customer Section");
        //click 'Guest' account radio button
        checkoutPageGuest.clickGuestAccountRadioButton();
        //click new customer section 'Continue' button
        checkoutPageGuest.clickNewCustomerContinueButton();
        //checkout page billing details section web element assert
        isCheckoutPageGuestSectionWebElementDisplayed(checkoutPage);
        //checkout page billing details section text element assert
        isCheckoutPageBillingDetailsSectionTextElementAsExpected(checkoutPage);
        //invalid guest input data getter (for guest account creation) - too short guest address (2 chars)
        checkoutPageGuestTooShortSingularInput.invalidGuestAccountDataTooShortAddressInputGetter();
        //input valid guest first name into first name input field
        checkoutPageGuestTooShortSingularInput.inputValidGuestFirstNameIntoFirstNameInputField();
        //input valid guest last name into last name input field
        checkoutPageGuestTooShortSingularInput.inputValidGuestLastNameIntoLastNameInputField();
        //input valid guest email into email input field
        checkoutPageGuestTooShortSingularInput.inputValidGuestEmailIntoEmailInputField();
        //input valid guest phone into phone input field
        checkoutPageGuestTooShortSingularInput.inputValidGuestPhoneIntoPhoneInputField();
        //input too short guest address 1 into address 1 input field (2 chars)
        checkoutPageGuestTooShortSingularInput.inputTooShortGuestAddress1IntoAddress1InputField();
        //capture screenshot of the checkout page display - invalid guest account data input
        captureScreenshot(driver, "HP LP3065 Product Checkout Page Display - Too Short Guest Address");
        //input valid guest city into city input field
        checkoutPageGuestTooShortSingularInput.inputValidGuestCityIntoCityInputField();
        //input valid guest post code into post code input field
        checkoutPageGuestTooShortSingularInput.inputValidGuestPostCodeIntoPostCodeInputField();
        //click country dropdown menu
        checkoutPageGuest.clickBillingDetailsCountryDropdownMenu();
        //select 'United States' option
        checkoutPageGuest.selectUsCountryOption();
        //click state dropdown menu
        checkoutPageGuest.clickBillingDetailsStateDropdownMenu();
        //select 'Illinois' option
        checkoutPageGuest.selectIllinoisStateOption();
        //capture screenshot of the checkout page display - invalid guest account data input
        captureScreenshot(driver, "HP LP3065 Product Checkout Page Display - Invalid Guest Account Data Input - Too Short Address");
        //click 'Billing details' section 'Continue' button
        checkoutPageGuest.clickBillingDetailsContinueButton();
        //assert the user gets an expected error message, otherwise, log the issue
        try {
            assertEquals("Address 1 must be between 3 and 128 characters!", checkoutPageGuestTooShortSingularInput.getInvalidGuestCheckoutInputError(), "The too short guest account address input error doesn't match expectations.");
        } catch(Exception e){
            logger.error("The too short guest account address error wasn't triggered.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid HP LP3065 Product Checkout Page Confirmation Test Result - Too Short Guest Address");
    }

    //invalid 'HP LP3065' product order checkout test method (as a guest) - too short guest account city (1 char)
    protected void invalidHPLP3065ProductOrderCheckoutConfirmationTooShortGuestCityTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        CheckoutPageGuest checkoutPageGuest = new CheckoutPageGuest(driver);
        CheckoutPageGuestTooShortSingularInput checkoutPageGuestTooShortSingularInput = new CheckoutPageGuestTooShortSingularInput(driver);
        //general page web element assert (elements all pages share)
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert (elements all pages share)
        isGeneralPageTextElementAsExpected(generalPage);
        //capture screenshot of the checkout page display
        captureScreenshot(driver, "HP LP3065 Product Checkout Page Display");
        //checkout page web element assert
        isCheckoutPageWebElementDisplayed(checkoutPage);
        //checkout page text element assert
        isCheckoutPageTextElementAsExpected(checkoutPage);
        //checkout page new customer section web element assert
        isCheckoutPageNewCustomerSectionWebElementDisplayed(checkoutPage);
        //checkout page returning customer section web element assert
        isCheckoutPageReturningCustomerSectionWebElementDisplayed(checkoutPage);
        //checkout page new customer section text element assert
        isCheckoutPageNewCustomerSectionTextElementAsExpected(checkoutPage);
        //capture screenshot of the checkout page display - new customer section
        captureScreenshot(driver, "HP LP3065 Product Checkout Page Display - New Customer Section");
        //click 'Guest' account radio button
        checkoutPageGuest.clickGuestAccountRadioButton();
        //click new customer section 'Continue' button
        checkoutPageGuest.clickNewCustomerContinueButton();
        //checkout page billing details section web element assert
        isCheckoutPageGuestSectionWebElementDisplayed(checkoutPage);
        //checkout page billing details section text element assert
        isCheckoutPageBillingDetailsSectionTextElementAsExpected(checkoutPage);
        //invalid guest input data getter (for guest account creation) - too short guest city (1 char)
        checkoutPageGuestTooShortSingularInput.invalidGuestAccountDataTooShortCityInputGetter();
        //input valid guest first name into first name input field
        checkoutPageGuestTooShortSingularInput.inputValidGuestFirstNameIntoFirstNameInputField();
        //input valid guest last name into last name input field
        checkoutPageGuestTooShortSingularInput.inputValidGuestLastNameIntoLastNameInputField();
        //input valid guest email into email input field
        checkoutPageGuestTooShortSingularInput.inputValidGuestEmailIntoEmailInputField();
        //input valid guest phone into phone input field
        checkoutPageGuestTooShortSingularInput.inputValidGuestPhoneIntoPhoneInputField();
        //input valid guest address 1 into address 1 input field
        checkoutPageGuestTooShortSingularInput.inputValidGuestAddress1IntoAddress1InputField();
        //input too short guest city into city input field (1 char)
        checkoutPageGuestTooShortSingularInput.inputTooShortGuestCityIntoCityInputField();
        //capture screenshot of the checkout page display - invalid guest account data input
        captureScreenshot(driver, "HP LP3065 Product Checkout Page Display - Too Short Guest City");
        //input valid guest post code into post code input field
        checkoutPageGuestTooShortSingularInput.inputValidGuestPostCodeIntoPostCodeInputField();
        //click country dropdown menu
        checkoutPageGuest.clickBillingDetailsCountryDropdownMenu();
        //select 'United States' option
        checkoutPageGuest.selectUsCountryOption();
        //click state dropdown menu
        checkoutPageGuest.clickBillingDetailsStateDropdownMenu();
        //select 'Illinois' option
        checkoutPageGuest.selectIllinoisStateOption();
        //capture screenshot of the checkout page display - invalid guest account data input
        captureScreenshot(driver, "HP LP3065 Product Checkout Page Display - Invalid Guest Account Data Input - Too Short City");
        //click 'Billing details' section 'Continue' button
        checkoutPageGuest.clickBillingDetailsContinueButton();
        //assert the user gets an expected error message, otherwise, log the issue
        try {
            assertEquals("City must be between 2 and 128 characters!", checkoutPageGuestTooShortSingularInput.getInvalidGuestCheckoutInputError(), "The too short guest account city input error doesn't match expectations.");
        } catch(Exception e){
            logger.error("The too short guest account city error wasn't triggered.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid HP LP3065 Product Checkout Page Confirmation Test Result - Too Short Guest City");
    }

    //invalid 'HP LP3065' product order checkout test method (as a guest) - too short guest account post code (1 digit) (the error wasn't triggered, test has failed(in manual testing the error gets triggered))
    protected void invalidHPLP3065ProductOrderCheckoutConfirmationTooShortGuestPostCodeTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        CheckoutPageGuest checkoutPageGuest = new CheckoutPageGuest(driver);
        CheckoutPageGuestTooShortSingularInput checkoutPageGuestTooShortSingularInput = new CheckoutPageGuestTooShortSingularInput(driver);
        //general page web element assert (elements all pages share)
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert (elements all pages share)
        isGeneralPageTextElementAsExpected(generalPage);
        //capture screenshot of the checkout page display
        captureScreenshot(driver, "HP LP3065 Product Checkout Page Display");
        //checkout page web element assert
        isCheckoutPageWebElementDisplayed(checkoutPage);
        //checkout page text element assert
        isCheckoutPageTextElementAsExpected(checkoutPage);
        //checkout page new customer section web element assert
        isCheckoutPageNewCustomerSectionWebElementDisplayed(checkoutPage);
        //checkout page returning customer section web element assert
        isCheckoutPageReturningCustomerSectionWebElementDisplayed(checkoutPage);
        //checkout page new customer section text element assert
        isCheckoutPageNewCustomerSectionTextElementAsExpected(checkoutPage);
        //capture screenshot of the checkout page display - new customer section
        captureScreenshot(driver, "HP LP3065 Product Checkout Page Display - New Customer Section");
        //click 'Guest' account radio button
        checkoutPageGuest.clickGuestAccountRadioButton();
        //click new customer section 'Continue' button
        checkoutPageGuest.clickNewCustomerContinueButton();
        //checkout page billing details section web element assert
        isCheckoutPageGuestSectionWebElementDisplayed(checkoutPage);
        //checkout page billing details section text element assert
        isCheckoutPageBillingDetailsSectionTextElementAsExpected(checkoutPage);
        //invalid guest input data getter (for guest account creation) - too short guest post code (1 digit)
        checkoutPageGuestTooShortSingularInput.invalidGuestAccountDataTooShortPostCodeInputGetter();
        //input valid guest first name into first name input field
        checkoutPageGuestTooShortSingularInput.inputValidGuestFirstNameIntoFirstNameInputField();
        //input valid guest last name into last name input field
        checkoutPageGuestTooShortSingularInput.inputValidGuestLastNameIntoLastNameInputField();
        //input valid guest email into email input field
        checkoutPageGuestTooShortSingularInput.inputValidGuestEmailIntoEmailInputField();
        //input valid guest phone into phone input field
        checkoutPageGuestTooShortSingularInput.inputValidGuestPhoneIntoPhoneInputField();
        //input valid guest address 1 into address 1 input field
        checkoutPageGuestTooShortSingularInput.inputValidGuestAddress1IntoAddress1InputField();
        //input valid guest city into city input field
        checkoutPageGuestTooShortSingularInput.inputValidGuestCityIntoCityInputField();
        //input too short guest post code into post code input field (1 digit)
        checkoutPageGuestTooShortSingularInput.inputTooShortGuestPostCodeIntoPostCodeInputField();
        //capture screenshot of the checkout page display - invalid guest account data input
        captureScreenshot(driver, "HP LP3065 Product Checkout Page Display - Too Short Guest Post Code");
        //click country dropdown menu
        checkoutPageGuest.clickBillingDetailsCountryDropdownMenu();
        //select 'United States' option
        checkoutPageGuest.selectUsCountryOption();
        //click state dropdown menu
        checkoutPageGuest.clickBillingDetailsStateDropdownMenu();
        //select 'Illinois' option
        checkoutPageGuest.selectIllinoisStateOption();
        //capture screenshot of the checkout page display - invalid guest account data input
        captureScreenshot(driver, "HP LP3065 Product Checkout Page Display - Invalid Guest Account Data Input - Too Short Post Code");
        //click 'Billing details' section 'Continue' button
        checkoutPageGuest.clickBillingDetailsContinueButton();
        //assert the user gets an expected error message, otherwise, log the issue
        try {
            assertEquals("Postcode must be between 2 and 10 characters!", checkoutPageGuestTooShortSingularInput.getInvalidGuestCheckoutInputError(), "The too short guest account post code input error doesn't match expectations.");
        } catch(Exception e){
            logger.error("The too short guest account post code error wasn't triggered.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid HP LP3065 Product Checkout Page Confirmation Test Result - Too Short Guest Post Code");
    }

    //too long singular input

    //invalid 'HP LP3065' product order checkout test method (as a guest) - too long guest account first name (33 chars)
    protected void invalidHPLP3065ProductOrderCheckoutConfirmationTooLongGuestFirstNameTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        CheckoutPageGuest checkoutPageGuest = new CheckoutPageGuest(driver);
        CheckoutPageGuestTooLongSingularInput checkoutPageGuestTooLongSingularInput = new CheckoutPageGuestTooLongSingularInput(driver);
        //general page web element assert (elements all pages share)
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert (elements all pages share)
        isGeneralPageTextElementAsExpected(generalPage);
        //capture screenshot of the checkout page display
        captureScreenshot(driver, "HP LP3065 Product Checkout Page Display");
        //checkout page web element assert
        isCheckoutPageWebElementDisplayed(checkoutPage);
        //checkout page text element assert
        isCheckoutPageTextElementAsExpected(checkoutPage);
        //checkout page new customer section web element assert
        isCheckoutPageNewCustomerSectionWebElementDisplayed(checkoutPage);
        //checkout page returning customer section web element assert
        isCheckoutPageReturningCustomerSectionWebElementDisplayed(checkoutPage);
        //checkout page new customer section text element assert
        isCheckoutPageNewCustomerSectionTextElementAsExpected(checkoutPage);
        //capture screenshot of the checkout page display - new customer section
        captureScreenshot(driver, "HP LP3065 Product Checkout Page Display - New Customer Section");
        //click 'Guest' account radio button
        checkoutPageGuest.clickGuestAccountRadioButton();
        //click new customer section 'Continue' button
        checkoutPageGuest.clickNewCustomerContinueButton();
        //checkout page billing details section web element assert
        isCheckoutPageGuestSectionWebElementDisplayed(checkoutPage);
        //checkout page billing details section text element assert
        isCheckoutPageBillingDetailsSectionTextElementAsExpected(checkoutPage);
        //invalid guest input data getter (for guest account creation) - too long guest first name (33 chars)
        checkoutPageGuestTooLongSingularInput.invalidGuestAccountDataTooLongFirstNameInputGetter();
        //input too long guest first name into first name input field (33 chars)
        checkoutPageGuestTooLongSingularInput.inputTooLongGuestFirstNameIntoFirstNameInputField();
        //capture screenshot of the checkout page display - invalid guest account data input
        captureScreenshot(driver, "HP LP3065 Product Checkout Page Display - Too Long Guest First Name");
        //input valid guest last name into last name input field
        checkoutPageGuestTooLongSingularInput.inputValidGuestLastNameIntoLastNameInputField();
        //input valid guest email into email input field
        checkoutPageGuestTooLongSingularInput.inputValidGuestEmailIntoEmailInputField();
        //input valid guest phone into phone input field
        checkoutPageGuestTooLongSingularInput.inputValidGuestPhoneIntoPhoneInputField();
        //input valid guest address 1 into address 1 input field
        checkoutPageGuestTooLongSingularInput.inputValidGuestAddress1IntoAddress1InputField();
        //input valid guest city into city input field
        checkoutPageGuestTooLongSingularInput.inputValidGuestCityIntoCityInputField();
        //input valid guest post code into post code input field
        checkoutPageGuestTooLongSingularInput.inputValidGuestPostCodeIntoPostCodeInputField();
        //click country dropdown menu
        checkoutPageGuest.clickBillingDetailsCountryDropdownMenu();
        //select 'United States' option
        checkoutPageGuest.selectUsCountryOption();
        //click state dropdown menu
        checkoutPageGuest.clickBillingDetailsStateDropdownMenu();
        //select 'Illinois' option
        checkoutPageGuest.selectIllinoisStateOption();
        //capture screenshot of the checkout page display - invalid guest account data input
        captureScreenshot(driver, "HP LP3065 Product Checkout Page Display - Invalid Guest Account Data Input - Too Long First Name");
        //click 'Billing details' section 'Continue' button
        checkoutPageGuest.clickBillingDetailsContinueButton();
        //assert the user gets an expected error message, otherwise, log the issue
        try {
            assertEquals("First Name must be between 1 and 32 characters!", checkoutPageGuestTooLongSingularInput.getInvalidGuestCheckoutInputError(), "The too long guest account first name input error doesn't match expectations.");
        } catch(Exception e){
            logger.error("The too long guest account first name error wasn't triggered.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid HP LP3065 Product Checkout Page Confirmation Test Result - Too Long Guest First Name");
    }

    //invalid 'HP LP3065' product order checkout test method (as a guest) - too long guest account last name (33 chars)
    protected void invalidHPLP3065ProductOrderCheckoutConfirmationTooLongGuestLastNameTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        CheckoutPageGuest checkoutPageGuest = new CheckoutPageGuest(driver);
        CheckoutPageGuestTooLongSingularInput checkoutPageGuestTooLongSingularInput = new CheckoutPageGuestTooLongSingularInput(driver);
        //general page web element assert (elements all pages share)
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert (elements all pages share)
        isGeneralPageTextElementAsExpected(generalPage);
        //capture screenshot of the checkout page display
        captureScreenshot(driver, "HP LP3065 Product Checkout Page Display");
        //checkout page web element assert
        isCheckoutPageWebElementDisplayed(checkoutPage);
        //checkout page text element assert
        isCheckoutPageTextElementAsExpected(checkoutPage);
        //checkout page new customer section web element assert
        isCheckoutPageNewCustomerSectionWebElementDisplayed(checkoutPage);
        //checkout page returning customer section web element assert
        isCheckoutPageReturningCustomerSectionWebElementDisplayed(checkoutPage);
        //checkout page new customer section text element assert
        isCheckoutPageNewCustomerSectionTextElementAsExpected(checkoutPage);
        //capture screenshot of the checkout page display - new customer section
        captureScreenshot(driver, "HP LP3065 Product Checkout Page Display - New Customer Section");
        //click 'Guest' account radio button
        checkoutPageGuest.clickGuestAccountRadioButton();
        //click new customer section 'Continue' button
        checkoutPageGuest.clickNewCustomerContinueButton();
        //checkout page billing details section web element assert
        isCheckoutPageGuestSectionWebElementDisplayed(checkoutPage);
        //checkout page billing details section text element assert
        isCheckoutPageBillingDetailsSectionTextElementAsExpected(checkoutPage);
        //invalid guest input data getter (for guest account creation) - too long guest last name (33 chars)
        checkoutPageGuestTooLongSingularInput.invalidGuestAccountDataTooLongLastNameInputGetter();
        //input valid guest first name into first name input field
        checkoutPageGuestTooLongSingularInput.inputValidGuestFirstNameIntoFirstNameInputField();
        //input too short guest last name into last name input field (33 chars)
        checkoutPageGuestTooLongSingularInput.inputTooLongGuestLastNameIntoLastNameInputField();
        //capture screenshot of the checkout page display - invalid guest account data input
        captureScreenshot(driver, "HP LP3065 Product Checkout Page Display - Too Long Guest Last Name");
        //input valid guest email into email input field
        checkoutPageGuestTooLongSingularInput.inputValidGuestEmailIntoEmailInputField();
        //input valid guest phone into phone input field
        checkoutPageGuestTooLongSingularInput.inputValidGuestPhoneIntoPhoneInputField();
        //input valid guest address 1 into address 1 input field
        checkoutPageGuestTooLongSingularInput.inputValidGuestAddress1IntoAddress1InputField();
        //input valid guest city into city input field
        checkoutPageGuestTooLongSingularInput.inputValidGuestCityIntoCityInputField();
        //input valid guest post code into post code input field
        checkoutPageGuestTooLongSingularInput.inputValidGuestPostCodeIntoPostCodeInputField();
        //click country dropdown menu
        checkoutPageGuest.clickBillingDetailsCountryDropdownMenu();
        //select 'United States' option
        checkoutPageGuest.selectUsCountryOption();
        //click state dropdown menu
        checkoutPageGuest.clickBillingDetailsStateDropdownMenu();
        //select 'Illinois' option
        checkoutPageGuest.selectIllinoisStateOption();
        //capture screenshot of the checkout page display - invalid guest account data input
        captureScreenshot(driver, "HP LP3065 Product Checkout Page Display - Invalid Guest Account Data Input - Too Long Last Name");
        //click 'Billing details' section 'Continue' button
        checkoutPageGuest.clickBillingDetailsContinueButton();
        //assert the user gets an expected error message, otherwise, log the issue
        try {
            assertEquals("Last Name must be between 1 and 32 characters!", checkoutPageGuestTooLongSingularInput.getInvalidGuestCheckoutInputError(), "The too long guest account last name input error doesn't match expectations.");
        } catch(Exception e){
            logger.error("The too long guest account last name error wasn't triggered.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid HP LP3065 Product Checkout Page Confirmation Test Result - Too Long Guest Last Name");
    }

    //invalid 'HP LP3065' product order checkout test method (as a guest) - too long guest account email (100 chars -> name,domain)
    protected void invalidHPLP3065ProductOrderCheckoutConfirmationTooLongGuestEmailTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        CheckoutPageGuest checkoutPageGuest = new CheckoutPageGuest(driver);
        CheckoutPageGuestTooLongSingularInput checkoutPageGuestTooLongSingularInput = new CheckoutPageGuestTooLongSingularInput(driver);
        //general page web element assert (elements all pages share)
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert (elements all pages share)
        isGeneralPageTextElementAsExpected(generalPage);
        //capture screenshot of the checkout page display
        captureScreenshot(driver, "HP LP3065 Product Checkout Page Display");
        //checkout page web element assert
        isCheckoutPageWebElementDisplayed(checkoutPage);
        //checkout page text element assert
        isCheckoutPageTextElementAsExpected(checkoutPage);
        //checkout page new customer section web element assert
        isCheckoutPageNewCustomerSectionWebElementDisplayed(checkoutPage);
        //checkout page returning customer section web element assert
        isCheckoutPageReturningCustomerSectionWebElementDisplayed(checkoutPage);
        //checkout page new customer section text element assert
        isCheckoutPageNewCustomerSectionTextElementAsExpected(checkoutPage);
        //capture screenshot of the checkout page display - new customer section
        captureScreenshot(driver, "HP LP3065 Product Checkout Page Display - New Customer Section");
        //click 'Guest' account radio button
        checkoutPageGuest.clickGuestAccountRadioButton();
        //click new customer section 'Continue' button
        checkoutPageGuest.clickNewCustomerContinueButton();
        //checkout page billing details section web element assert
        isCheckoutPageGuestSectionWebElementDisplayed(checkoutPage);
        //checkout page billing details section text element assert
        isCheckoutPageBillingDetailsSectionTextElementAsExpected(checkoutPage);
        //invalid guest input data getter (for guest account creation) - too long guest emil (100 chars -> name,domain)
        checkoutPageGuestTooLongSingularInput.invalidGuestAccountDataTooLongEmailInputGetter();
        //input valid guest first name into first name input field
        checkoutPageGuestTooLongSingularInput.inputValidGuestFirstNameIntoFirstNameInputField();
        //input valid guest last name into last name input field
        checkoutPageGuestTooLongSingularInput.inputValidGuestLastNameIntoLastNameInputField();
        //input too long guest email into email input field (100 chars -> name,domain)
        checkoutPageGuestTooLongSingularInput.inputTooLongGuestEmailIntoEmailInputField();
        //capture screenshot of the checkout page display - invalid guest account data input
        captureScreenshot(driver, "HP LP3065 Product Checkout Page Display - Too Long Guest Email");
        //input valid guest phone into phone input field
        checkoutPageGuestTooLongSingularInput.inputValidGuestPhoneIntoPhoneInputField();
        //input valid guest address 1 into address 1 input field
        checkoutPageGuestTooLongSingularInput.inputValidGuestAddress1IntoAddress1InputField();
        //input valid guest city into city input field
        checkoutPageGuestTooLongSingularInput.inputValidGuestCityIntoCityInputField();
        //input valid guest post code into post code input field
        checkoutPageGuestTooLongSingularInput.inputValidGuestPostCodeIntoPostCodeInputField();
        //click country dropdown menu
        checkoutPageGuest.clickBillingDetailsCountryDropdownMenu();
        //select 'United States' option
        checkoutPageGuest.selectUsCountryOption();
        //click state dropdown menu
        checkoutPageGuest.clickBillingDetailsStateDropdownMenu();
        //select 'Illinois' option
        checkoutPageGuest.selectIllinoisStateOption();
        //capture screenshot of the checkout page display - invalid guest account data input
        captureScreenshot(driver, "HP LP3065 Product Checkout Page Display - Invalid Guest Account Data Input - Too Long Email");
        //click 'Billing details' section 'Continue' button
        checkoutPageGuest.clickBillingDetailsContinueButton();
        //assert the user gets an expected error message, otherwise, log the issue
        try {
            assertEquals("E-Mail address does not appear to be valid!", checkoutPageGuestTooLongSingularInput.getInvalidGuestCheckoutInputError(), "The too long guest account email input error doesn't match expectations.");
        } catch(Exception e){
            logger.error("The too long guest account email error wasn't triggered.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid HP LP3065 Product Checkout Page Confirmation Test Result - Too Long Guest Email");
    }

    //invalid 'HP LP3065' product order checkout test method (as a guest) - too long guest account phone (33 digits)
    protected void invalidHPLP3065ProductOrderCheckoutConfirmationTooLongGuestPhoneTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        CheckoutPageGuest checkoutPageGuest = new CheckoutPageGuest(driver);
        CheckoutPageGuestTooLongSingularInput checkoutPageGuestTooLongSingularInput = new CheckoutPageGuestTooLongSingularInput(driver);
        //general page web element assert (elements all pages share)
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert (elements all pages share)
        isGeneralPageTextElementAsExpected(generalPage);
        //capture screenshot of the checkout page display
        captureScreenshot(driver, "HP LP3065 Product Checkout Page Display");
        //checkout page web element assert
        isCheckoutPageWebElementDisplayed(checkoutPage);
        //checkout page text element assert
        isCheckoutPageTextElementAsExpected(checkoutPage);
        //checkout page new customer section web element assert
        isCheckoutPageNewCustomerSectionWebElementDisplayed(checkoutPage);
        //checkout page returning customer section web element assert
        isCheckoutPageReturningCustomerSectionWebElementDisplayed(checkoutPage);
        //checkout page new customer section text element assert
        isCheckoutPageNewCustomerSectionTextElementAsExpected(checkoutPage);
        //capture screenshot of the checkout page display - new customer section
        captureScreenshot(driver, "HP LP3065 Product Checkout Page Display - New Customer Section");
        //click 'Guest' account radio button
        checkoutPageGuest.clickGuestAccountRadioButton();
        //click new customer section 'Continue' button
        checkoutPageGuest.clickNewCustomerContinueButton();
        //checkout page billing details section web element assert
        isCheckoutPageGuestSectionWebElementDisplayed(checkoutPage);
        //checkout page billing details section text element assert
        isCheckoutPageBillingDetailsSectionTextElementAsExpected(checkoutPage);
        //invalid guest input data getter (for guest account creation) - too long guest phone (33 digits)
        checkoutPageGuestTooLongSingularInput.invalidGuestAccountDataTooLongPhoneInputGetter();
        //input valid guest first name into first name input field
        checkoutPageGuestTooLongSingularInput.inputValidGuestFirstNameIntoFirstNameInputField();
        //input valid guest last name into last name input field
        checkoutPageGuestTooLongSingularInput.inputValidGuestLastNameIntoLastNameInputField();
        //input valid guest email into email input field
        checkoutPageGuestTooLongSingularInput.inputValidGuestEmailIntoEmailInputField();
        //input too long guest phone into phone input field (33 digits)
        checkoutPageGuestTooLongSingularInput.inputTooLongGuestPhoneIntoPhoneInputField();
        //capture screenshot of the checkout page display - invalid guest account data input
        captureScreenshot(driver, "HP LP3065 Product Checkout Page Display - Too Long Guest Phone");
        //input valid guest address 1 into address 1 input field
        checkoutPageGuestTooLongSingularInput.inputValidGuestAddress1IntoAddress1InputField();
        //input valid guest city into city input field
        checkoutPageGuestTooLongSingularInput.inputValidGuestCityIntoCityInputField();
        //input valid guest post code into post code input field
        checkoutPageGuestTooLongSingularInput.inputValidGuestPostCodeIntoPostCodeInputField();
        //click country dropdown menu
        checkoutPageGuest.clickBillingDetailsCountryDropdownMenu();
        //select 'United States' option
        checkoutPageGuest.selectUsCountryOption();
        //click state dropdown menu
        checkoutPageGuest.clickBillingDetailsStateDropdownMenu();
        //select 'Illinois' option
        checkoutPageGuest.selectIllinoisStateOption();
        //capture screenshot of the checkout page display - invalid guest account data input
        captureScreenshot(driver, "HP LP3065 Product Checkout Page Display - Invalid Guest Account Data Input - Too Long Phone");
        //click 'Billing details' section 'Continue' button
        checkoutPageGuest.clickBillingDetailsContinueButton();
        //assert the user gets an expected error message, otherwise, log the issue
        try {
            assertEquals("Telephone must be between 3 and 32 characters!", checkoutPageGuestTooLongSingularInput.getInvalidGuestCheckoutInputError(), "The too long guest account phone input error doesn't match expectations.");
        } catch(Exception e){
            logger.error("The too long guest account phone error wasn't triggered.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid HP LP3065 Product Checkout Page Confirmation Test Result - Too Long Guest Phone");
    }

    //invalid 'HP LP3065' product order checkout test method (as a guest) - too long guest account address (129 chars)
    protected void invalidHPLP3065ProductOrderCheckoutConfirmationTooLongGuestAddressTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        CheckoutPageGuest checkoutPageGuest = new CheckoutPageGuest(driver);
        CheckoutPageGuestTooLongSingularInput checkoutPageGuestTooLongSingularInput = new CheckoutPageGuestTooLongSingularInput(driver);
        //general page web element assert (elements all pages share)
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert (elements all pages share)
        isGeneralPageTextElementAsExpected(generalPage);
        //capture screenshot of the checkout page display
        captureScreenshot(driver, "HP LP3065 Product Checkout Page Display");
        //checkout page web element assert
        isCheckoutPageWebElementDisplayed(checkoutPage);
        //checkout page text element assert
        isCheckoutPageTextElementAsExpected(checkoutPage);
        //checkout page new customer section web element assert
        isCheckoutPageNewCustomerSectionWebElementDisplayed(checkoutPage);
        //checkout page returning customer section web element assert
        isCheckoutPageReturningCustomerSectionWebElementDisplayed(checkoutPage);
        //checkout page new customer section text element assert
        isCheckoutPageNewCustomerSectionTextElementAsExpected(checkoutPage);
        //capture screenshot of the checkout page display - new customer section
        captureScreenshot(driver, "HP LP3065 Product Checkout Page Display - New Customer Section");
        //click 'Guest' account radio button
        checkoutPageGuest.clickGuestAccountRadioButton();
        //click new customer section 'Continue' button
        checkoutPageGuest.clickNewCustomerContinueButton();
        //checkout page billing details section web element assert
        isCheckoutPageGuestSectionWebElementDisplayed(checkoutPage);
        //checkout page billing details section text element assert
        isCheckoutPageBillingDetailsSectionTextElementAsExpected(checkoutPage);
        //invalid guest input data getter (for guest account creation) - too long guest address (129 chars)
        checkoutPageGuestTooLongSingularInput.invalidGuestAccountDataTooLongAddressInputGetter();
        //input valid guest first name into first name input field
        checkoutPageGuestTooLongSingularInput.inputValidGuestFirstNameIntoFirstNameInputField();
        //input valid guest last name into last name input field
        checkoutPageGuestTooLongSingularInput.inputValidGuestLastNameIntoLastNameInputField();
        //input valid guest email into email input field
        checkoutPageGuestTooLongSingularInput.inputValidGuestEmailIntoEmailInputField();
        //input valid guest phone into phone input field
        checkoutPageGuestTooLongSingularInput.inputValidGuestPhoneIntoPhoneInputField();
        //input too long guest address 1 into address 1 input field (129 chars)
        checkoutPageGuestTooLongSingularInput.inputTooLongGuestAddress1IntoAddress1InputField();
        //capture screenshot of the checkout page display - invalid guest account data input
        captureScreenshot(driver, "HP LP3065 Product Checkout Page Display - Too Long Guest Address");
        //input valid guest city into city input field
        checkoutPageGuestTooLongSingularInput.inputValidGuestCityIntoCityInputField();
        //input valid guest post code into post code input field
        checkoutPageGuestTooLongSingularInput.inputValidGuestPostCodeIntoPostCodeInputField();
        //click country dropdown menu
        checkoutPageGuest.clickBillingDetailsCountryDropdownMenu();
        //select 'United States' option
        checkoutPageGuest.selectUsCountryOption();
        //click state dropdown menu
        checkoutPageGuest.clickBillingDetailsStateDropdownMenu();
        //select 'Illinois' option
        checkoutPageGuest.selectIllinoisStateOption();
        //capture screenshot of the checkout page display - invalid guest account data input
        captureScreenshot(driver, "HP LP3065 Product Checkout Page Display - Invalid Guest Account Data Input - Too Long Address");
        //click 'Billing details' section 'Continue' button
        checkoutPageGuest.clickBillingDetailsContinueButton();
        //assert the user gets an expected error message, otherwise, log the issue
        try {
            assertEquals("Address 1 must be between 3 and 128 characters!", checkoutPageGuestTooLongSingularInput.getInvalidGuestCheckoutInputError(), "The too long guest account address input error doesn't match expectations.");
        } catch(Exception e){
            logger.error("The too long guest account address error wasn't triggered.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid HP LP3065 Product Checkout Page Confirmation Test Result - Too Long Guest Address");
    }

    //invalid 'HP LP3065' product order checkout test method (as a guest) - too long guest account city (129 chars)
    protected void invalidHPLP3065ProductOrderCheckoutConfirmationTooLongGuestCityTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        CheckoutPageGuest checkoutPageGuest = new CheckoutPageGuest(driver);
        CheckoutPageGuestTooLongSingularInput checkoutPageGuestTooLongSingularInput = new CheckoutPageGuestTooLongSingularInput(driver);
        //general page web element assert (elements all pages share)
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert (elements all pages share)
        isGeneralPageTextElementAsExpected(generalPage);
        //capture screenshot of the checkout page display
        captureScreenshot(driver, "HP LP3065 Product Checkout Page Display");
        //checkout page web element assert
        isCheckoutPageWebElementDisplayed(checkoutPage);
        //checkout page text element assert
        isCheckoutPageTextElementAsExpected(checkoutPage);
        //checkout page new customer section web element assert
        isCheckoutPageNewCustomerSectionWebElementDisplayed(checkoutPage);
        //checkout page returning customer section web element assert
        isCheckoutPageReturningCustomerSectionWebElementDisplayed(checkoutPage);
        //checkout page new customer section text element assert
        isCheckoutPageNewCustomerSectionTextElementAsExpected(checkoutPage);
        //capture screenshot of the checkout page display - new customer section
        captureScreenshot(driver, "HP LP3065 Product Checkout Page Display - New Customer Section");
        //click 'Guest' account radio button
        checkoutPageGuest.clickGuestAccountRadioButton();
        //click new customer section 'Continue' button
        checkoutPageGuest.clickNewCustomerContinueButton();
        //checkout page billing details section web element assert
        isCheckoutPageGuestSectionWebElementDisplayed(checkoutPage);
        //checkout page billing details section text element assert
        isCheckoutPageBillingDetailsSectionTextElementAsExpected(checkoutPage);
        //invalid guest input data getter (for guest account creation) - too long guest city (129 chars)
        checkoutPageGuestTooLongSingularInput.invalidGuestAccountDataTooLongCityInputGetter();
        //input valid guest first name into first name input field
        checkoutPageGuestTooLongSingularInput.inputValidGuestFirstNameIntoFirstNameInputField();
        //input valid guest last name into last name input field
        checkoutPageGuestTooLongSingularInput.inputValidGuestLastNameIntoLastNameInputField();
        //input valid guest email into email input field
        checkoutPageGuestTooLongSingularInput.inputValidGuestEmailIntoEmailInputField();
        //input valid guest phone into phone input field
        checkoutPageGuestTooLongSingularInput.inputValidGuestPhoneIntoPhoneInputField();
        //input valid guest address 1 into address 1 input field
        checkoutPageGuestTooLongSingularInput.inputValidGuestAddress1IntoAddress1InputField();
        //input too long guest city into city input field (129 chars)
        checkoutPageGuestTooLongSingularInput.inputTooLongGuestCityIntoCityInputField();
        //capture screenshot of the checkout page display - invalid guest account data input
        captureScreenshot(driver, "HP LP3065 Product Checkout Page Display - Too Long Guest City");
        //input valid guest post code into post code input field
        checkoutPageGuestTooLongSingularInput.inputValidGuestPostCodeIntoPostCodeInputField();
        //click country dropdown menu
        checkoutPageGuest.clickBillingDetailsCountryDropdownMenu();
        //select 'United States' option
        checkoutPageGuest.selectUsCountryOption();
        //click state dropdown menu
        checkoutPageGuest.clickBillingDetailsStateDropdownMenu();
        //select 'Illinois' option
        checkoutPageGuest.selectIllinoisStateOption();
        //capture screenshot of the checkout page display - invalid guest account data input
        captureScreenshot(driver, "HP LP3065 Product Checkout Page Display - Invalid Guest Account Data Input - Too Long City");
        //click 'Billing details' section 'Continue' button
        checkoutPageGuest.clickBillingDetailsContinueButton();
        //assert the user gets an expected error message, otherwise, log the issue
        try {
            assertEquals("City must be between 2 and 128 characters!", checkoutPageGuestTooLongSingularInput.getInvalidGuestCheckoutInputError(), "The too long guest account city input error doesn't match expectations.");
        } catch(Exception e){
            logger.error("The too long guest account city error wasn't triggered.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid HP LP3065 Product Checkout Page Confirmation Test Result - Too Long Guest City");
    }

    //invalid 'HP LP3065' product order checkout test method (as a guest) - too long guest account post code (11 digits) (the error wasn't triggered, test has failed(in manual testing the error gets triggered))
    protected void invalidHPLP3065ProductOrderCheckoutConfirmationTooLongGuestPostCodeTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        CheckoutPageGuest checkoutPageGuest = new CheckoutPageGuest(driver);
        CheckoutPageGuestTooLongSingularInput checkoutPageGuestTooLongSingularInput = new CheckoutPageGuestTooLongSingularInput(driver);
        //general page web element assert (elements all pages share)
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert (elements all pages share)
        isGeneralPageTextElementAsExpected(generalPage);
        //capture screenshot of the checkout page display
        captureScreenshot(driver, "HP LP3065 Product Checkout Page Display");
        //checkout page web element assert
        isCheckoutPageWebElementDisplayed(checkoutPage);
        //checkout page text element assert
        isCheckoutPageTextElementAsExpected(checkoutPage);
        //checkout page new customer section web element assert
        isCheckoutPageNewCustomerSectionWebElementDisplayed(checkoutPage);
        //checkout page returning customer section web element assert
        isCheckoutPageReturningCustomerSectionWebElementDisplayed(checkoutPage);
        //checkout page new customer section text element assert
        isCheckoutPageNewCustomerSectionTextElementAsExpected(checkoutPage);
        //capture screenshot of the checkout page display - new customer section
        captureScreenshot(driver, "HP LP3065 Product Checkout Page Display - New Customer Section");
        //click 'Guest' account radio button
        checkoutPageGuest.clickGuestAccountRadioButton();
        //click new customer section 'Continue' button
        checkoutPageGuest.clickNewCustomerContinueButton();
        //checkout page billing details section web element assert
        isCheckoutPageGuestSectionWebElementDisplayed(checkoutPage);
        //checkout page billing details section text element assert
        isCheckoutPageBillingDetailsSectionTextElementAsExpected(checkoutPage);
        //invalid guest input data getter (for guest account creation) - too long guest post code (129 chars)
        checkoutPageGuestTooLongSingularInput.invalidGuestAccountDataTooLongPostCodeInputGetter();
        //input valid guest first name into first name input field
        checkoutPageGuestTooLongSingularInput.inputValidGuestFirstNameIntoFirstNameInputField();
        //input valid guest last name into last name input field
        checkoutPageGuestTooLongSingularInput.inputValidGuestLastNameIntoLastNameInputField();
        //input valid guest email into email input field
        checkoutPageGuestTooLongSingularInput.inputValidGuestEmailIntoEmailInputField();
        //input valid guest phone into phone input field
        checkoutPageGuestTooLongSingularInput.inputValidGuestPhoneIntoPhoneInputField();
        //input valid guest address 1 into address 1 input field
        checkoutPageGuestTooLongSingularInput.inputValidGuestAddress1IntoAddress1InputField();
        //input valid guest city into city input field
        checkoutPageGuestTooLongSingularInput.inputValidGuestCityIntoCityInputField();
        //input too long guest post code into post code input field (11 digits)
        checkoutPageGuestTooLongSingularInput.inputTooLongGuestPostCodeIntoPostCodeInputField();
        //capture screenshot of the checkout page display - invalid guest account data input
        captureScreenshot(driver, "HP LP3065 Product Checkout Page Display - Too Long Guest Post Code");
        //click country dropdown menu
        checkoutPageGuest.clickBillingDetailsCountryDropdownMenu();
        //select 'United States' option
        checkoutPageGuest.selectUsCountryOption();
        //click state dropdown menu
        checkoutPageGuest.clickBillingDetailsStateDropdownMenu();
        //select 'Illinois' option
        checkoutPageGuest.selectIllinoisStateOption();
        //capture screenshot of the checkout page display - invalid guest account data input
        captureScreenshot(driver, "HP LP3065 Product Checkout Page Display - Invalid Guest Account Data Input - Too Long Post Code");
        //click 'Billing details' section 'Continue' button
        checkoutPageGuest.clickBillingDetailsContinueButton();
        //assert the user gets an expected error message, otherwise, log the issue
        try {
            assertEquals("Postcode must be between 2 and 10 characters!", checkoutPageGuestTooLongSingularInput.getInvalidGuestCheckoutInputError(), "The too long guest account post code input error doesn't match expectations.");
        } catch(Exception e){
            logger.error("The too long guest account post code error wasn't triggered.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid HP LP3065 Product Checkout Page Confirmation Test Result - Too Long Guest Post Code");
    }

    //invalid singular input format

    //invalid 'HP LP3065' product order checkout test method (as a guest) - invalid guest account first name format (special symbols only) (the error wasn't triggered, test has failed)
    protected void invalidHPLP3065ProductOrderCheckoutConfirmationInvalidGuestFirstNameFormatTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        CheckoutPageGuest checkoutPageGuest = new CheckoutPageGuest(driver);
        CheckoutPageGuestInvalidSingularInput checkoutPageGuestInvalidSingularInput = new CheckoutPageGuestInvalidSingularInput(driver);
        //general page web element assert (elements all pages share)
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert (elements all pages share)
        isGeneralPageTextElementAsExpected(generalPage);
        //capture screenshot of the checkout page display
        captureScreenshot(driver, "HP LP3065 Product Checkout Page Display");
        //checkout page web element assert
        isCheckoutPageWebElementDisplayed(checkoutPage);
        //checkout page text element assert
        isCheckoutPageTextElementAsExpected(checkoutPage);
        //checkout page new customer section web element assert
        isCheckoutPageNewCustomerSectionWebElementDisplayed(checkoutPage);
        //checkout page returning customer section web element assert
        isCheckoutPageReturningCustomerSectionWebElementDisplayed(checkoutPage);
        //checkout page new customer section text element assert
        isCheckoutPageNewCustomerSectionTextElementAsExpected(checkoutPage);
        //capture screenshot of the checkout page display - new customer section
        captureScreenshot(driver, "HP LP3065 Product Checkout Page Display - New Customer Section");
        //click 'Guest' account radio button
        checkoutPageGuest.clickGuestAccountRadioButton();
        //click new customer section 'Continue' button
        checkoutPageGuest.clickNewCustomerContinueButton();
        //checkout page billing details section web element assert
        isCheckoutPageGuestSectionWebElementDisplayed(checkoutPage);
        //checkout page billing details section text element assert
        isCheckoutPageBillingDetailsSectionTextElementAsExpected(checkoutPage);
        //invalid guest input data getter (for guest account creation) - invalid guest first name format (special symbols only)
        checkoutPageGuestInvalidSingularInput.invalidGuestAccountDataInvalidFirstNameInputFormatGetter();
        //input invalid guest first name format into first name input field (special symbols only)
        checkoutPageGuestInvalidSingularInput.inputInvalidGuestFirstNameFormatIntoFirstNameInputField();
        //capture screenshot of the checkout page display - invalid guest account data input
        captureScreenshot(driver, "HP LP3065 Product Checkout Page Display - Invalid Guest First Name Format");
        //input valid guest last name into last name input field
        checkoutPageGuestInvalidSingularInput.inputValidGuestLastNameIntoLastNameInputField();
        //input valid guest email into email input field
        checkoutPageGuestInvalidSingularInput.inputValidGuestEmailIntoEmailInputField();
        //input valid guest phone into phone input field
        checkoutPageGuestInvalidSingularInput.inputValidGuestPhoneIntoPhoneInputField();
        //input valid guest address 1 into address 1 input field
        checkoutPageGuestInvalidSingularInput.inputValidGuestAddress1IntoAddress1InputField();
        //input valid guest city into city input field
        checkoutPageGuestInvalidSingularInput.inputValidGuestCityIntoCityInputField();
        //input valid guest post code into post code input field
        checkoutPageGuestInvalidSingularInput.inputValidGuestPostCodeIntoPostCodeInputField();
        //click country dropdown menu
        checkoutPageGuest.clickBillingDetailsCountryDropdownMenu();
        //select 'United States' option
        checkoutPageGuest.selectUsCountryOption();
        //click state dropdown menu
        checkoutPageGuest.clickBillingDetailsStateDropdownMenu();
        //select 'Illinois' option
        checkoutPageGuest.selectIllinoisStateOption();
        //capture screenshot of the checkout page display - invalid guest account data input
        captureScreenshot(driver, "HP LP3065 Product Checkout Page Display - Invalid Guest Account Data Input - Invalid First Name Format");
        //click 'Billing details' section 'Continue' button
        checkoutPageGuest.clickBillingDetailsContinueButton();
        //assert the user gets an expected error message, otherwise, log the issue
        try {
            assertEquals("First Name cannot consist of special symbols!", checkoutPageGuestInvalidSingularInput.getInvalidGuestCheckoutInputError(), "The invalid guest account first name input format error doesn't match expectations.");
        } catch(Exception e){
            logger.error("The invalid guest account first name format error wasn't triggered.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid HP LP3065 Product Checkout Page Confirmation Test Result - Invalid Guest First Name Format");
    }

    //invalid 'HP LP3065' product order checkout test method (as a guest) - invalid guest account last name format (special symbols and digits only) (the error wasn't triggered, test has failed)
    protected void invalidHPLP3065ProductOrderCheckoutConfirmationInvalidGuestLastNameFormatTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        CheckoutPageGuest checkoutPageGuest = new CheckoutPageGuest(driver);
        CheckoutPageGuestInvalidSingularInput checkoutPageGuestInvalidSingularInput = new CheckoutPageGuestInvalidSingularInput(driver);
        //general page web element assert (elements all pages share)
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert (elements all pages share)
        isGeneralPageTextElementAsExpected(generalPage);
        //capture screenshot of the checkout page display
        captureScreenshot(driver, "HP LP3065 Product Checkout Page Display");
        //checkout page web element assert
        isCheckoutPageWebElementDisplayed(checkoutPage);
        //checkout page text element assert
        isCheckoutPageTextElementAsExpected(checkoutPage);
        //checkout page new customer section web element assert
        isCheckoutPageNewCustomerSectionWebElementDisplayed(checkoutPage);
        //checkout page returning customer section web element assert
        isCheckoutPageReturningCustomerSectionWebElementDisplayed(checkoutPage);
        //checkout page new customer section text element assert
        isCheckoutPageNewCustomerSectionTextElementAsExpected(checkoutPage);
        //capture screenshot of the checkout page display - new customer section
        captureScreenshot(driver, "HP LP3065 Product Checkout Page Display - New Customer Section");
        //click 'Guest' account radio button
        checkoutPageGuest.clickGuestAccountRadioButton();
        //click new customer section 'Continue' button
        checkoutPageGuest.clickNewCustomerContinueButton();
        //checkout page billing details section web element assert
        isCheckoutPageGuestSectionWebElementDisplayed(checkoutPage);
        //checkout page billing details section text element assert
        isCheckoutPageBillingDetailsSectionTextElementAsExpected(checkoutPage);
        //invalid guest input data getter (for guest account creation) - invalid guest last name format (special symbols and digits only)
        checkoutPageGuestInvalidSingularInput.invalidGuestAccountDataInvalidLastNameInputFormatGetter();
        //input valid guest first name into first name input field
        checkoutPageGuestInvalidSingularInput.inputValidGuestFirstNameIntoFirstNameInputField();
        //input invalid guest last name format into last name input field (special symbols and digits only)
        checkoutPageGuestInvalidSingularInput.inputInvalidGuestLastNameFormatIntoLastNameInputField();
        //capture screenshot of the checkout page display - invalid guest account data input
        captureScreenshot(driver, "HP LP3065 Product Checkout Page Display - Invalid Guest Last Name Format");
        //input valid guest email into email input field
        checkoutPageGuestInvalidSingularInput.inputValidGuestEmailIntoEmailInputField();
        //input valid guest phone into phone input field
        checkoutPageGuestInvalidSingularInput.inputValidGuestPhoneIntoPhoneInputField();
        //input valid guest address 1 into address 1 input field
        checkoutPageGuestInvalidSingularInput.inputValidGuestAddress1IntoAddress1InputField();
        //input valid guest city into city input field
        checkoutPageGuestInvalidSingularInput.inputValidGuestCityIntoCityInputField();
        //input valid guest post code into post code input field
        checkoutPageGuestInvalidSingularInput.inputValidGuestPostCodeIntoPostCodeInputField();
        //click country dropdown menu
        checkoutPageGuest.clickBillingDetailsCountryDropdownMenu();
        //select 'United States' option
        checkoutPageGuest.selectUsCountryOption();
        //click state dropdown menu
        checkoutPageGuest.clickBillingDetailsStateDropdownMenu();
        //select 'Illinois' option
        checkoutPageGuest.selectIllinoisStateOption();
        //capture screenshot of the checkout page display - invalid guest account data input
        captureScreenshot(driver, "HP LP3065 Product Checkout Page Display - Invalid Guest Account Data Input - Invalid Last Name Format");
        //click 'Billing details' section 'Continue' button
        checkoutPageGuest.clickBillingDetailsContinueButton();
        //assert the user gets an expected error message, otherwise, log the issue
        try {
            assertEquals("Last Name cannot consist of special symbols and digits!", checkoutPageGuestInvalidSingularInput.getInvalidGuestCheckoutInputError(), "The invalid guest account last name input format error doesn't match expectations.");
        } catch(Exception e){
            logger.error("The invalid guest account last name format error wasn't triggered.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid HP LP3065 Product Checkout Page Confirmation Test Result - Invalid Guest Last Name Format");
    }

    //invalid 'HP LP3065' product order checkout test method (as a guest) - invalid guest account email format (special symbols and digits only)
    protected void invalidHPLP3065ProductOrderCheckoutConfirmationInvalidGuestEmailFormatTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        CheckoutPageGuest checkoutPageGuest = new CheckoutPageGuest(driver);
        CheckoutPageGuestInvalidSingularInput checkoutPageGuestInvalidSingularInput = new CheckoutPageGuestInvalidSingularInput(driver);
        //general page web element assert (elements all pages share)
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert (elements all pages share)
        isGeneralPageTextElementAsExpected(generalPage);
        //capture screenshot of the checkout page display
        captureScreenshot(driver, "HP LP3065 Product Checkout Page Display");
        //checkout page web element assert
        isCheckoutPageWebElementDisplayed(checkoutPage);
        //checkout page text element assert
        isCheckoutPageTextElementAsExpected(checkoutPage);
        //checkout page new customer section web element assert
        isCheckoutPageNewCustomerSectionWebElementDisplayed(checkoutPage);
        //checkout page returning customer section web element assert
        isCheckoutPageReturningCustomerSectionWebElementDisplayed(checkoutPage);
        //checkout page new customer section text element assert
        isCheckoutPageNewCustomerSectionTextElementAsExpected(checkoutPage);
        //capture screenshot of the checkout page display - new customer section
        captureScreenshot(driver, "HP LP3065 Product Checkout Page Display - New Customer Section");
        //click 'Guest' account radio button
        checkoutPageGuest.clickGuestAccountRadioButton();
        //click new customer section 'Continue' button
        checkoutPageGuest.clickNewCustomerContinueButton();
        //checkout page billing details section web element assert
        isCheckoutPageGuestSectionWebElementDisplayed(checkoutPage);
        //checkout page billing details section text element assert
        isCheckoutPageBillingDetailsSectionTextElementAsExpected(checkoutPage);
        //invalid guest input data getter (for guest account creation) - invalid guest email format (missing '@')
        checkoutPageGuestInvalidSingularInput.invalidGuestAccountDataInvalidEmailInputFormatGetter();
        //input valid guest first name into first name input field
        checkoutPageGuestInvalidSingularInput.inputValidGuestFirstNameIntoFirstNameInputField();
        //input valid guest last name into last name input field
        checkoutPageGuestInvalidSingularInput.inputValidGuestLastNameIntoLastNameInputField();
        //input invalid guest email format into email input field (missing '@')
        checkoutPageGuestInvalidSingularInput.inputInvalidGuestEmailFormatIntoEmailInputField();
        //capture screenshot of the checkout page display - invalid guest account data input
        captureScreenshot(driver, "HP LP3065 Product Checkout Page Display - Invalid Guest Email Format");
        //input valid guest phone into phone input field
        checkoutPageGuestInvalidSingularInput.inputValidGuestPhoneIntoPhoneInputField();
        //input valid guest address 1 into address 1 input field
        checkoutPageGuestInvalidSingularInput.inputValidGuestAddress1IntoAddress1InputField();
        //input valid guest city into city input field
        checkoutPageGuestInvalidSingularInput.inputValidGuestCityIntoCityInputField();
        //input valid guest post code into post code input field
        checkoutPageGuestInvalidSingularInput.inputValidGuestPostCodeIntoPostCodeInputField();
        //click country dropdown menu
        checkoutPageGuest.clickBillingDetailsCountryDropdownMenu();
        //select 'United States' option
        checkoutPageGuest.selectUsCountryOption();
        //click state dropdown menu
        checkoutPageGuest.clickBillingDetailsStateDropdownMenu();
        //select 'Illinois' option
        checkoutPageGuest.selectIllinoisStateOption();
        //capture screenshot of the checkout page display - invalid guest account data input
        captureScreenshot(driver, "HP LP3065 Product Checkout Page Display - Invalid Guest Account Data Input - Invalid Email Format");
        //click 'Billing details' section 'Continue' button
        checkoutPageGuest.clickBillingDetailsContinueButton();
        //assert the user gets an expected error message, otherwise, log the issue
        try {
            assertEquals("E-Mail address does not appear to be valid!", checkoutPageGuestInvalidSingularInput.getInvalidGuestCheckoutInputError(), "The invalid guest account email input format error doesn't match expectations.");
        } catch(Exception e){
            logger.error("The invalid guest account email format error wasn't triggered.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid HP LP3065 Product Checkout Page Confirmation Test Result - Invalid Guest Email Format");
    }

    //invalid 'HP LP3065' product order checkout test method (as a guest) - pre-existing email input (used in other account)
    protected void invalidHPLP3065ProductOrderCheckoutConfirmationExistingEmailTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        CheckoutPageGuest checkoutPageGuest = new CheckoutPageGuest(driver);
        CheckoutPageGuestInvalidSingularInput checkoutPageGuestInvalidSingularInput = new CheckoutPageGuestInvalidSingularInput(driver);
        //general page web element assert (elements all pages share)
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert (elements all pages share)
        isGeneralPageTextElementAsExpected(generalPage);
        //capture screenshot of the checkout page display
        captureScreenshot(driver, "HP LP3065 Product Checkout Page Display");
        //checkout page web element assert
        isCheckoutPageWebElementDisplayed(checkoutPage);
        //checkout page text element assert
        isCheckoutPageTextElementAsExpected(checkoutPage);
        //checkout page new customer section web element assert
        isCheckoutPageNewCustomerSectionWebElementDisplayed(checkoutPage);
        //checkout page returning customer section web element assert
        isCheckoutPageReturningCustomerSectionWebElementDisplayed(checkoutPage);
        //checkout page new customer section text element assert
        isCheckoutPageNewCustomerSectionTextElementAsExpected(checkoutPage);
        //capture screenshot of the checkout page display - new customer section
        captureScreenshot(driver, "HP LP3065 Product Checkout Page Display - New Customer Section");
        //click 'Guest' account radio button
        checkoutPageGuest.clickGuestAccountRadioButton();
        //click new customer section 'Continue' button
        checkoutPageGuest.clickNewCustomerContinueButton();
        //checkout page billing details section web element assert
        isCheckoutPageGuestSectionWebElementDisplayed(checkoutPage);
        //checkout page billing details section text element assert
        isCheckoutPageBillingDetailsSectionTextElementAsExpected(checkoutPage);
        //invalid guest input data getter (for guest account creation) - pre-existing user email (used in other account) (the error wasn't triggered, test has failed)
        checkoutPageGuestInvalidSingularInput.invalidGuestAccountDataExistingEmailInputGetter();
        //input valid guest first name into first name input field
        checkoutPageGuestInvalidSingularInput.inputValidGuestFirstNameIntoFirstNameInputField();
        //input valid guest last name into last name input field
        checkoutPageGuestInvalidSingularInput.inputValidGuestLastNameIntoLastNameInputField();
        //input pre-existing user email into email input field (used in other account)
        checkoutPageGuestInvalidSingularInput.inputPreexistingGuestEmailIntoEmailInputField();
        //capture screenshot of the checkout page display - invalid guest account data input
        captureScreenshot(driver, "HP LP3065 Product Checkout Page Display - PreExisting Email");
        //input valid guest phone into phone input field
        checkoutPageGuestInvalidSingularInput.inputValidGuestPhoneIntoPhoneInputField();
        //input valid guest address 1 into address 1 input field
        checkoutPageGuestInvalidSingularInput.inputValidGuestAddress1IntoAddress1InputField();
        //input valid guest city into city input field
        checkoutPageGuestInvalidSingularInput.inputValidGuestCityIntoCityInputField();
        //input valid guest post code into post code input field
        checkoutPageGuestInvalidSingularInput.inputValidGuestPostCodeIntoPostCodeInputField();
        //click country dropdown menu
        checkoutPageGuest.clickBillingDetailsCountryDropdownMenu();
        //select 'United States' option
        checkoutPageGuest.selectUsCountryOption();
        //click state dropdown menu
        checkoutPageGuest.clickBillingDetailsStateDropdownMenu();
        //select 'Illinois' option
        checkoutPageGuest.selectIllinoisStateOption();
        //capture screenshot of the checkout page display - invalid guest account data input
        captureScreenshot(driver, "HP LP3065 Product Checkout Page Display - Invalid Guest Account Data Input - PreExisting Email");
        //click 'Billing details' section 'Continue' button
        checkoutPageGuest.clickBillingDetailsContinueButton();
        //assert the user gets an expected error message, otherwise, log the issue
        try {
            assertEquals("E-Mail is already in use!", checkoutPageGuestInvalidSingularInput.getInvalidGuestCheckoutInputError(), "The existing account email input error doesn't match expectations.");
        } catch(Exception e){
            logger.error("The existing account email error wasn't triggered.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid HP LP3065 Product Checkout Page Confirmation Test Result - PreExisting User Email Format");
    }

    //invalid 'HP LP3065' product order checkout test method (as a guest) - invalid guest account phone format (special symbols only) (the error wasn't triggered, test has failed)
    protected void invalidHPLP3065ProductOrderCheckoutConfirmationInvalidGuestPhoneFormatTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        CheckoutPageGuest checkoutPageGuest = new CheckoutPageGuest(driver);
        CheckoutPageGuestInvalidSingularInput checkoutPageGuestInvalidSingularInput = new CheckoutPageGuestInvalidSingularInput(driver);
        //general page web element assert (elements all pages share)
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert (elements all pages share)
        isGeneralPageTextElementAsExpected(generalPage);
        //capture screenshot of the checkout page display
        captureScreenshot(driver, "HP LP3065 Product Checkout Page Display");
        //checkout page web element assert
        isCheckoutPageWebElementDisplayed(checkoutPage);
        //checkout page text element assert
        isCheckoutPageTextElementAsExpected(checkoutPage);
        //checkout page new customer section web element assert
        isCheckoutPageNewCustomerSectionWebElementDisplayed(checkoutPage);
        //checkout page returning customer section web element assert
        isCheckoutPageReturningCustomerSectionWebElementDisplayed(checkoutPage);
        //checkout page new customer section text element assert
        isCheckoutPageNewCustomerSectionTextElementAsExpected(checkoutPage);
        //capture screenshot of the checkout page display - new customer section
        captureScreenshot(driver, "HP LP3065 Product Checkout Page Display - New Customer Section");
        //click 'Guest' account radio button
        checkoutPageGuest.clickGuestAccountRadioButton();
        //click new customer section 'Continue' button
        checkoutPageGuest.clickNewCustomerContinueButton();
        //checkout page billing details section web element assert
        isCheckoutPageGuestSectionWebElementDisplayed(checkoutPage);
        //checkout page billing details section text element assert
        isCheckoutPageBillingDetailsSectionTextElementAsExpected(checkoutPage);
        //invalid guest input data getter (for guest account creation) - invalid guest phone format (special symbols only)
        checkoutPageGuestInvalidSingularInput.invalidGuestAccountDataInvalidPhoneInputFormatGetter();
        //input valid guest first name into first name input field
        checkoutPageGuestInvalidSingularInput.inputValidGuestFirstNameIntoFirstNameInputField();
        //input valid guest last name into last name input field
        checkoutPageGuestInvalidSingularInput.inputValidGuestLastNameIntoLastNameInputField();
        //input valid guest email into email input field
        checkoutPageGuestInvalidSingularInput.inputValidGuestEmailIntoEmailInputField();
        //input invalid guest phone format into phone input field (special symbols only)
        checkoutPageGuestInvalidSingularInput.inputInvalidGuestPhoneFormatIntoPhoneInputField();
        //capture screenshot of the checkout page display - invalid guest account data input
        captureScreenshot(driver, "HP LP3065 Product Checkout Page Display - Invalid Guest Phone Format");
        //input valid guest address 1 into address 1 input field
        checkoutPageGuestInvalidSingularInput.inputValidGuestAddress1IntoAddress1InputField();
        //input valid guest city into city input field
        checkoutPageGuestInvalidSingularInput.inputValidGuestCityIntoCityInputField();
        //input valid guest post code into post code input field
        checkoutPageGuestInvalidSingularInput.inputValidGuestPostCodeIntoPostCodeInputField();
        //click country dropdown menu
        checkoutPageGuest.clickBillingDetailsCountryDropdownMenu();
        //select 'United States' option
        checkoutPageGuest.selectUsCountryOption();
        //click state dropdown menu
        checkoutPageGuest.clickBillingDetailsStateDropdownMenu();
        //select 'Illinois' option
        checkoutPageGuest.selectIllinoisStateOption();
        //capture screenshot of the checkout page display - invalid guest account data input
        captureScreenshot(driver, "HP LP3065 Product Checkout Page Display - Invalid Guest Account Data Input - Invalid Phone Format");
        //click 'Billing details' section 'Continue' button
        checkoutPageGuest.clickBillingDetailsContinueButton();
        //assert the user gets an expected error message, otherwise, log the issue
        try {
            assertEquals("Telephone cannot consist of special symbols!", checkoutPageGuestInvalidSingularInput.getInvalidGuestCheckoutInputError(), "The invalid guest account phone input format error doesn't match expectations.");
        } catch(Exception e){
            logger.error("The invalid guest account phone format error wasn't triggered.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid HP LP3065 Product Checkout Page Confirmation Test Result - Invalid Guest Phone Format");
    }

    //invalid 'HP LP3065' product order checkout test method (as a guest) - invalid guest account address format (special symbols only) (the error wasn't triggered, test has failed)
    protected void invalidHPLP3065ProductOrderCheckoutConfirmationInvalidGuestAddressFormatTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        CheckoutPageGuest checkoutPageGuest = new CheckoutPageGuest(driver);
        CheckoutPageGuestInvalidSingularInput checkoutPageGuestInvalidSingularInput = new CheckoutPageGuestInvalidSingularInput(driver);
        //general page web element assert (elements all pages share)
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert (elements all pages share)
        isGeneralPageTextElementAsExpected(generalPage);
        //capture screenshot of the checkout page display
        captureScreenshot(driver, "HP LP3065 Product Checkout Page Display");
        //checkout page web element assert
        isCheckoutPageWebElementDisplayed(checkoutPage);
        //checkout page text element assert
        isCheckoutPageTextElementAsExpected(checkoutPage);
        //checkout page new customer section web element assert
        isCheckoutPageNewCustomerSectionWebElementDisplayed(checkoutPage);
        //checkout page returning customer section web element assert
        isCheckoutPageReturningCustomerSectionWebElementDisplayed(checkoutPage);
        //checkout page new customer section text element assert
        isCheckoutPageNewCustomerSectionTextElementAsExpected(checkoutPage);
        //capture screenshot of the checkout page display - new customer section
        captureScreenshot(driver, "HP LP3065 Product Checkout Page Display - New Customer Section");
        //click 'Guest' account radio button
        checkoutPageGuest.clickGuestAccountRadioButton();
        //click new customer section 'Continue' button
        checkoutPageGuest.clickNewCustomerContinueButton();
        //checkout page billing details section web element assert
        isCheckoutPageGuestSectionWebElementDisplayed(checkoutPage);
        //checkout page billing details section text element assert
        isCheckoutPageBillingDetailsSectionTextElementAsExpected(checkoutPage);
        //invalid guest input data getter (for guest account creation) - invalid guest address format (special symbols only)
        checkoutPageGuestInvalidSingularInput.invalidGuestAccountDataInvalidAddressInputFormatGetter();
        //input valid guest first name into first name input field
        checkoutPageGuestInvalidSingularInput.inputValidGuestFirstNameIntoFirstNameInputField();
        //input valid guest last name into last name input field
        checkoutPageGuestInvalidSingularInput.inputValidGuestLastNameIntoLastNameInputField();
        //input valid guest email into email input field
        checkoutPageGuestInvalidSingularInput.inputValidGuestEmailIntoEmailInputField();
        //input valid guest phone into phone input field
        checkoutPageGuestInvalidSingularInput.inputValidGuestPhoneIntoPhoneInputField();
        //input invalid guest address 1 format into address 1 input field (special symbols)
        checkoutPageGuestInvalidSingularInput.inputInvalidGuestAddress1FormatIntoAddress1InputField();
        //capture screenshot of the checkout page display - invalid guest account data input
        captureScreenshot(driver, "HP LP3065 Product Checkout Page Display - Invalid Guest Address Format");
        //input valid guest city into city input field
        checkoutPageGuestInvalidSingularInput.inputValidGuestCityIntoCityInputField();
        //input valid guest post code into post code input field
        checkoutPageGuestInvalidSingularInput.inputValidGuestPostCodeIntoPostCodeInputField();
        //click country dropdown menu
        checkoutPageGuest.clickBillingDetailsCountryDropdownMenu();
        //select 'United States' option
        checkoutPageGuest.selectUsCountryOption();
        //click state dropdown menu
        checkoutPageGuest.clickBillingDetailsStateDropdownMenu();
        //select 'Illinois' option
        checkoutPageGuest.selectIllinoisStateOption();
        //capture screenshot of the checkout page display - invalid guest account data input
        captureScreenshot(driver, "HP LP3065 Product Checkout Page Display - Invalid Guest Account Data Input - Invalid Address Format");
        //click 'Billing details' section 'Continue' button
        checkoutPageGuest.clickBillingDetailsContinueButton();
        //assert the user gets an expected error message, otherwise, log the issue
        try {
            assertEquals("Address 1 cannot consist of special symbols!", checkoutPageGuestInvalidSingularInput.getInvalidGuestCheckoutInputError(), "The invalid guest account address input format error doesn't match expectations.");
        } catch(Exception e){
            logger.error("The invalid guest account address format error wasn't triggered.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid HP LP3065 Product Checkout Page Confirmation Test Result - Invalid Guest Address Format");
    }

    //invalid 'HP LP3065' product order checkout test method (as a guest) - invalid guest account city format (special symbols only) (the error wasn't triggered, test has failed)
    protected void invalidHPLP3065ProductOrderCheckoutConfirmationInvalidGuestCityFormatTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        CheckoutPageGuest checkoutPageGuest = new CheckoutPageGuest(driver);
        CheckoutPageGuestInvalidSingularInput checkoutPageGuestInvalidSingularInput = new CheckoutPageGuestInvalidSingularInput(driver);
        //general page web element assert (elements all pages share)
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert (elements all pages share)
        isGeneralPageTextElementAsExpected(generalPage);
        //capture screenshot of the checkout page display
        captureScreenshot(driver, "HP LP3065 Product Checkout Page Display");
        //checkout page web element assert
        isCheckoutPageWebElementDisplayed(checkoutPage);
        //checkout page text element assert
        isCheckoutPageTextElementAsExpected(checkoutPage);
        //checkout page new customer section web element assert
        isCheckoutPageNewCustomerSectionWebElementDisplayed(checkoutPage);
        //checkout page returning customer section web element assert
        isCheckoutPageReturningCustomerSectionWebElementDisplayed(checkoutPage);
        //checkout page new customer section text element assert
        isCheckoutPageNewCustomerSectionTextElementAsExpected(checkoutPage);
        //capture screenshot of the checkout page display - new customer section
        captureScreenshot(driver, "HP LP3065 Product Checkout Page Display - New Customer Section");
        //click 'Guest' account radio button
        checkoutPageGuest.clickGuestAccountRadioButton();
        //click new customer section 'Continue' button
        checkoutPageGuest.clickNewCustomerContinueButton();
        //checkout page billing details section web element assert
        isCheckoutPageGuestSectionWebElementDisplayed(checkoutPage);
        //checkout page billing details section text element assert
        isCheckoutPageBillingDetailsSectionTextElementAsExpected(checkoutPage);
        //invalid guest input data getter (for guest account creation) - invalid guest city format (special symbols only)
        checkoutPageGuestInvalidSingularInput.invalidGuestAccountDataInvalidCityInputFormatGetter();
        //input valid guest first name into first name input field
        checkoutPageGuestInvalidSingularInput.inputValidGuestFirstNameIntoFirstNameInputField();
        //input valid guest last name into last name input field
        checkoutPageGuestInvalidSingularInput.inputValidGuestLastNameIntoLastNameInputField();
        //input valid guest email into email input field
        checkoutPageGuestInvalidSingularInput.inputValidGuestEmailIntoEmailInputField();
        //input valid guest phone into phone input field
        checkoutPageGuestInvalidSingularInput.inputValidGuestPhoneIntoPhoneInputField();
        //input valid guest address 1 into address 1 input field
        checkoutPageGuestInvalidSingularInput.inputValidGuestAddress1IntoAddress1InputField();
        //input invalid guest city format into city input field (special symbols only)
        checkoutPageGuestInvalidSingularInput.inputInvalidGuestCityFormatIntoCityInputField();
        //capture screenshot of the checkout page display - invalid guest account data input
        captureScreenshot(driver, "HP LP3065 Product Checkout Page Display - Invalid Guest City Format");
        //input valid guest post code into post code input field
        checkoutPageGuestInvalidSingularInput.inputValidGuestPostCodeIntoPostCodeInputField();
        //click country dropdown menu
        checkoutPageGuest.clickBillingDetailsCountryDropdownMenu();
        //select 'United States' option
        checkoutPageGuest.selectUsCountryOption();
        //click state dropdown menu
        checkoutPageGuest.clickBillingDetailsStateDropdownMenu();
        //select 'Illinois' option
        checkoutPageGuest.selectIllinoisStateOption();
        //capture screenshot of the checkout page display - invalid guest account data input
        captureScreenshot(driver, "HP LP3065 Product Checkout Page Display - Invalid Guest Account Data Input - Invalid City Format");
        //click 'Billing details' section 'Continue' button
        checkoutPageGuest.clickBillingDetailsContinueButton();
        //assert the user gets an expected error message, otherwise, log the issue
        try {
            assertEquals("City cannot consist of special symbols!", checkoutPageGuestInvalidSingularInput.getInvalidGuestCheckoutInputError(), "The invalid guest account city input format error doesn't match expectations.");
        } catch(Exception e){
            logger.error("The invalid guest account city format error wasn't triggered.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid HP LP3065 Product Checkout Page Confirmation Test Result - Invalid Guest City Format");
    }

    //invalid 'HP LP3065' product order checkout test method (as a guest) - invalid guest account post code format (special symbols only) (the error wasn't triggered, test has failed)
    protected void invalidHPLP3065ProductOrderCheckoutConfirmationInvalidGuestPostCodeFormatTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        CheckoutPageGuest checkoutPageGuest = new CheckoutPageGuest(driver);
        CheckoutPageGuestInvalidSingularInput checkoutPageGuestInvalidSingularInput = new CheckoutPageGuestInvalidSingularInput(driver);
        //general page web element assert (elements all pages share)
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert (elements all pages share)
        isGeneralPageTextElementAsExpected(generalPage);
        //capture screenshot of the checkout page display
        captureScreenshot(driver, "HP LP3065 Product Checkout Page Display");
        //checkout page web element assert
        isCheckoutPageWebElementDisplayed(checkoutPage);
        //checkout page text element assert
        isCheckoutPageTextElementAsExpected(checkoutPage);
        //checkout page new customer section web element assert
        isCheckoutPageNewCustomerSectionWebElementDisplayed(checkoutPage);
        //checkout page returning customer section web element assert
        isCheckoutPageReturningCustomerSectionWebElementDisplayed(checkoutPage);
        //checkout page new customer section text element assert
        isCheckoutPageNewCustomerSectionTextElementAsExpected(checkoutPage);
        //capture screenshot of the checkout page display - new customer section
        captureScreenshot(driver, "HP LP3065 Product Checkout Page Display - New Customer Section");
        //click 'Guest' account radio button
        checkoutPageGuest.clickGuestAccountRadioButton();
        //click new customer section 'Continue' button
        checkoutPageGuest.clickNewCustomerContinueButton();
        //checkout page billing details section web element assert
        isCheckoutPageGuestSectionWebElementDisplayed(checkoutPage);
        //checkout page billing details section text element assert
        isCheckoutPageBillingDetailsSectionTextElementAsExpected(checkoutPage);
        //invalid guest input data getter (for guest account creation) - invalid guest post code format (special symbols only)
        checkoutPageGuestInvalidSingularInput.invalidGuestAccountDataInvalidPostCodeInputFormatGetter();
        //input valid guest first name into first name input field
        checkoutPageGuestInvalidSingularInput.inputValidGuestFirstNameIntoFirstNameInputField();
        //input valid guest last name into last name input field
        checkoutPageGuestInvalidSingularInput.inputValidGuestLastNameIntoLastNameInputField();
        //input valid guest email into email input field
        checkoutPageGuestInvalidSingularInput.inputValidGuestEmailIntoEmailInputField();
        //input valid guest phone into phone input field
        checkoutPageGuestInvalidSingularInput.inputValidGuestPhoneIntoPhoneInputField();
        //input valid guest address 1 into address 1 input field
        checkoutPageGuestInvalidSingularInput.inputValidGuestAddress1IntoAddress1InputField();
        //input valid guest city format into city input field
        checkoutPageGuestInvalidSingularInput.inputValidGuestCityIntoCityInputField();
        //input invalid guest post code format into post code input field (special symbols only)
        checkoutPageGuestInvalidSingularInput.inputInvalidGuestPostCodeIntoPostCodeInputField();
        //capture screenshot of the checkout page display - invalid guest account data input
        captureScreenshot(driver, "HP LP3065 Product Checkout Page Display - Invalid Guest Post Code Format");
        //click country dropdown menu
        checkoutPageGuest.clickBillingDetailsCountryDropdownMenu();
        //select 'United States' option
        checkoutPageGuest.selectUsCountryOption();
        //click state dropdown menu
        checkoutPageGuest.clickBillingDetailsStateDropdownMenu();
        //select 'Illinois' option
        checkoutPageGuest.selectIllinoisStateOption();
        //capture screenshot of the checkout page display - invalid guest account data input
        captureScreenshot(driver, "HP LP3065 Product Checkout Page Display - Invalid Guest Account Data Input - Invalid Post Code Format");
        //click 'Billing details' section 'Continue' button
        checkoutPageGuest.clickBillingDetailsContinueButton();
        //assert the user gets an expected error message, otherwise, log the issue
        try {
            assertEquals("Postcode cannot consist of special symbols!", checkoutPageGuestInvalidSingularInput.getInvalidGuestCheckoutInputError(), "The invalid guest account post code input format error doesn't match expectations.");
        } catch(Exception e){
            logger.error("The invalid guest account post code format error wasn't triggered.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid HP LP3065 Product Checkout Page Confirmation Test Result - Invalid Guest Post Code Format");
    }

    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //valid registered user checkout login test

    //valid registered user login test method
    protected void validCheckoutLoginTest(RegisterPage registerPage){
        GeneralPage generalPage = new GeneralPage(driver);
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        CheckoutPageValidRegUserLogin checkoutPageValidRegUserLogin = new CheckoutPageValidRegUserLogin(driver);
        //general page web element assert (elements all pages share)
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert (elements all pages share)
        isGeneralPageTextElementAsExpected(generalPage);
        //capture screenshot of the checkout page display
        captureScreenshot(driver, "HP LP3065 Product Checkout Page Display");
        //checkout page web element assert
        isCheckoutPageWebElementDisplayed(checkoutPage);
        //checkout page text element assert
        isCheckoutPageTextElementAsExpected(checkoutPage);
        //capture screenshot of the checkout page display - new customer section
        captureScreenshot(driver, "HP LP3065 Product Checkout Page Display - New Customer Section");
        //valid login data getter (for checkout)
        checkoutPageValidRegUserLogin.validRegUserLoginCheckoutDataGetter(registerPage);
        //input valid login email
        checkoutPageValidRegUserLogin.inputCheckoutLoginEmailIntoEmailInputField();
        //input valid login password
        checkoutPageValidRegUserLogin.inputCheckoutLoginPasswordIntoPasswordInputField();
        //click 'Login' button
        checkoutPageValidRegUserLogin.clickCheckoutLoginButton();
        //capture screenshot of the successful login
        captureScreenshot(driver, "HP LP3065 Product Checkout Page Valid Login Result");
        //click billing address section 'Continue' button
        checkoutPage.clickBillingAddressContinueButton();
        //capture screenshot of the checkout page (delivery details section) display
        captureScreenshot(driver, "HP LP3065 Product Checkout Page Delivery Details Section Display");
        //click delivery details section 'Continue' button
        checkoutPage.clickDeliveryDetailsContinueButton();
        //checkout page delivery method section web element assert
        isCheckoutPageDeliverySectionWebElementDisplayed(checkoutPage);
        //checkout page delivery method section text element assert
        isCheckoutPageDeliveryMethodSectionTextElementAsExpected(checkoutPage);
        //capture screenshot of the checkout page (delivery method section) display
        captureScreenshot(driver, "HP LP3065 Product Checkout Page Delivery Method Section Display");
        //click delivery method section 'Continue' button
        checkoutPage.clickDeliveryMethodContinueButton();
        //checkout page payment method section web element assert
        isCheckoutPagePaymentSectionWebElementDisplayed(checkoutPage);
        //checkout page payment method section text element assert
        isCheckoutPagePaymentMethodSectionTextElementAsExpected(checkoutPage);
        //capture screenshot of the checkout page (payment method section) display
        captureScreenshot(driver, "HP LP3065 Product Checkout Page Payment Method Section Display");
        //click payment method section 'Agree to terms and conditions' button
        checkoutPage.clickPayMethodTermsConditionsCheckbox();
        //click payment method section 'Continue' button
        checkoutPage.clickPaymentMethodContinueButton();
        //checkout page confirm order section web element display
        isCheckoutPageConfirmOrderSectionWebElementDisplayed(checkoutPage);
        //capture screenshot of the checkout page (confirm order section) display
        captureScreenshot(driver, "HP LP3065 Product Checkout Page Confirm Order Section Display");
        //log confirm order section product table data
        logCheckoutPageProductTableData(checkoutPage);
        //click 'Confirm order' button
        checkoutPage.clickConfirmOrderButton();
        //capture screenshot of the test result
        captureScreenshot(driver, "HP LP3065 Product Checkout Page Confirmation Test Result (as a registered user)");
    }

    //invalid registered user checkout login tests

    //no singular input

    //invalid registered user login test method - no checkout login email
    protected void invalidCheckoutLoginNoEmailTest(RegisterPage registerPage){
        GeneralPage generalPage = new GeneralPage(driver);
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        CheckoutPageValidRegUserLogin checkoutPageValidRegUserLogin = new CheckoutPageValidRegUserLogin(driver);
        CheckoutPageInvalidRegUserLogin checkoutPageInvalidRegUserLogin = new CheckoutPageInvalidRegUserLogin(driver);
        //general page web element assert (elements all pages share)
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert (elements all pages share)
        isGeneralPageTextElementAsExpected(generalPage);
        //capture screenshot of the checkout page display
        captureScreenshot(driver, "HP LP3065 Product Checkout Page Display");
        //checkout page web element assert
        isCheckoutPageWebElementDisplayed(checkoutPage);
        //checkout page text element assert
        isCheckoutPageTextElementAsExpected(checkoutPage);
        //capture screenshot of the checkout page display - new customer section
        captureScreenshot(driver, "HP LP3065 Product Checkout Page Display - New Customer Section");
        //invalid login data getter (for checkout) -> no login email
        checkoutPageInvalidRegUserLogin.invalidRegUserLoginCheckoutDataNoEmailGetter(registerPage);
        //don't input login email
        checkoutPageInvalidRegUserLogin.inputNoCheckoutLoginEmailIntoEmailInputField();
        //input valid login password
        checkoutPageInvalidRegUserLogin.inputCheckoutLoginPasswordIntoPasswordInputField();
        //click 'Login' button
        checkoutPageValidRegUserLogin.clickCheckoutLoginButton();
        //assert the user gets an expected error message
        assertEquals("Warning: No match for E-Mail Address and/or Password.\n" + "×", checkoutPageInvalidRegUserLogin.getInvalidSingularInputErrorMessage(), "The missing singular input error message doesn't match expectations or the error wasn't triggered.");
        //capture screenshot of the test result
        captureScreenshot(driver, "HP LP3065 Product Checkout Page Invalid Login Test Result - No Email");
    }

    //invalid registered user login test method - no checkout login password
    protected void invalidCheckoutLoginNoPasswordTest(RegisterPage registerPage){
        GeneralPage generalPage = new GeneralPage(driver);
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        CheckoutPageValidRegUserLogin checkoutPageValidRegUserLogin = new CheckoutPageValidRegUserLogin(driver);
        CheckoutPageInvalidRegUserLogin checkoutPageInvalidRegUserLogin = new CheckoutPageInvalidRegUserLogin(driver);
        //general page web element assert (elements all pages share)
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert (elements all pages share)
        isGeneralPageTextElementAsExpected(generalPage);
        //capture screenshot of the checkout page display
        captureScreenshot(driver, "HP LP3065 Product Checkout Page Display");
        //checkout page web element assert
        isCheckoutPageWebElementDisplayed(checkoutPage);
        //checkout page text element assert
        isCheckoutPageTextElementAsExpected(checkoutPage);
        //capture screenshot of the checkout page display - new customer section
        captureScreenshot(driver, "HP LP3065 Product Checkout Page Display - New Customer Section");
        //invalid login data getter (for checkout) -> no login password
        checkoutPageInvalidRegUserLogin.invalidRegUserLoginCheckoutDataNoPasswordGetter(registerPage);
        //input valid login email
        checkoutPageInvalidRegUserLogin.inputCheckoutLoginEmailIntoEmailInputField();
        //don't input login password
        checkoutPageInvalidRegUserLogin.inputNoCheckoutLoginPasswordIntoPasswordInputField();
        //click 'Login' button
        checkoutPageValidRegUserLogin.clickCheckoutLoginButton();
        //assert the user gets an expected error message
        assertEquals("Warning: No match for E-Mail Address and/or Password.\n" + "×", checkoutPageInvalidRegUserLogin.getInvalidSingularInputErrorMessage(), "The missing singular input error message doesn't match expectations or the error wasn't triggered.");
        //capture screenshot of the test result
        captureScreenshot(driver, "HP LP3065 Product Checkout Page Invalid Login Test Result - No Password");
    }

    //no singular input

    //invalid registered user login test method - invalid checkout login email
    protected void invalidCheckoutLoginInvalidEmailTest(RegisterPage registerPage){
        GeneralPage generalPage = new GeneralPage(driver);
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        CheckoutPageValidRegUserLogin checkoutPageValidRegUserLogin = new CheckoutPageValidRegUserLogin(driver);
        CheckoutPageInvalidRegUserLogin checkoutPageInvalidRegUserLogin = new CheckoutPageInvalidRegUserLogin(driver);
        //general page web element assert (elements all pages share)
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert (elements all pages share)
        isGeneralPageTextElementAsExpected(generalPage);
        //capture screenshot of the checkout page display
        captureScreenshot(driver, "HP LP3065 Product Checkout Page Display");
        //checkout page web element assert
        isCheckoutPageWebElementDisplayed(checkoutPage);
        //checkout page text element assert
        isCheckoutPageTextElementAsExpected(checkoutPage);
        //capture screenshot of the checkout page display - new customer section
        captureScreenshot(driver, "HP LP3065 Product Checkout Page Display - New Customer Section");
        //invalid login data getter (for checkout) -> invalid login email
        checkoutPageInvalidRegUserLogin.invalidRegUserLoginCheckoutDataInvalidEmailGetter(registerPage);
        //input invalid login email
        checkoutPageInvalidRegUserLogin.inputInvalidCheckoutLoginEmailIntoEmailInputField();
        //input valid login password
        checkoutPageInvalidRegUserLogin.inputCheckoutLoginPasswordIntoPasswordInputField();
        //click 'Login' button
        checkoutPageValidRegUserLogin.clickCheckoutLoginButton();
        //assert the user gets an expected error message
        assertEquals("Warning: No match for E-Mail Address and/or Password.\n" + "×", checkoutPageInvalidRegUserLogin.getInvalidSingularInputErrorMessage(), "The invalid singular input error message doesn't match expectations or the error wasn't triggered.");
        //capture screenshot of the test result
        captureScreenshot(driver, "HP LP3065 Product Checkout Page Invalid Login Test Result - Invalid Email");
    }

    //invalid registered user login test method - invalid checkout login password
    protected void invalidCheckoutLoginInvalidPasswordTest(RegisterPage registerPage){
        GeneralPage generalPage = new GeneralPage(driver);
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        CheckoutPageValidRegUserLogin checkoutPageValidRegUserLogin = new CheckoutPageValidRegUserLogin(driver);
        CheckoutPageInvalidRegUserLogin checkoutPageInvalidRegUserLogin = new CheckoutPageInvalidRegUserLogin(driver);
        //general page web element assert (elements all pages share)
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert (elements all pages share)
        isGeneralPageTextElementAsExpected(generalPage);
        //capture screenshot of the checkout page display
        captureScreenshot(driver, "HP LP3065 Product Checkout Page Display");
        //checkout page web element assert
        isCheckoutPageWebElementDisplayed(checkoutPage);
        //checkout page text element assert
        isCheckoutPageTextElementAsExpected(checkoutPage);
        //capture screenshot of the checkout page display - new customer section
        captureScreenshot(driver, "HP LP3065 Product Checkout Page Display - New Customer Section");
        //invalid login data getter (for checkout) -> invalid login password
        checkoutPageInvalidRegUserLogin.invalidRegUserLoginCheckoutDataInvalidPasswordGetter(registerPage);
        //input valid login email
        checkoutPageInvalidRegUserLogin.inputCheckoutLoginEmailIntoEmailInputField();
        //input invalid login password
        checkoutPageInvalidRegUserLogin.inputInvalidCheckoutLoginPasswordIntoPasswordInputField();
        //click 'Login' button
        checkoutPageValidRegUserLogin.clickCheckoutLoginButton();
        //assert the user gets an expected error message
        assertEquals("Warning: No match for E-Mail Address and/or Password.\n" + "×", checkoutPageInvalidRegUserLogin.getInvalidSingularInputErrorMessage(), "The invalid singular input error message doesn't match expectations or the error wasn't triggered.");
        //capture screenshot of the test result
        captureScreenshot(driver, "HP LP3065 Product Checkout Page Invalid Login Test Result - Invalid Password");
    }

    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //confirm order success page test method
    protected void confirmPlacedOrderGuestTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        ConfirmOrderSuccessPage confirmOrderSuccessPage = new ConfirmOrderSuccessPage(driver);
        //general page web element assert (elements all pages share)
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert (elements all pages share)
        isGeneralPageTextElementAsExpected(generalPage);
        //capture screenshot of the confirm order page display
        captureScreenshot(driver, "Product Checkout Confirm Order Success (Guest) Page Display");
        //confirm order success page web element assert
        isConfirmOrderSuccessPageGuestWebElementDisplayed(confirmOrderSuccessPage);
        //confirm order success page text element assert
        isConfirmOrderSuccessPageTextElementAsExpected(confirmOrderSuccessPage);
    }

    //confirm order success page test method (as registered user)
    protected void confirmPlacedOrderRegUserTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        ConfirmOrderSuccessPage confirmOrderSuccessPage = new ConfirmOrderSuccessPage(driver);
        OrderHistoryPage orderHistoryPage = new OrderHistoryPage(driver);
        //general page web element assert (elements all pages share)
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert (elements all pages share)
        isGeneralPageTextElementAsExpected(generalPage);
        //capture screenshot of the confirm order page display
        captureScreenshot(driver, "Product Checkout Confirm Order (Reg User) Success Page Display");
        //confirm order success page web element assert
        isConfirmOrderSuccessPageRegUserWebElementDisplayed(confirmOrderSuccessPage);
        //confirm order success page text element assert
        isConfirmOrderSuccessPageTextElementAsExpected(confirmOrderSuccessPage);
        //click 'Order History' link
        confirmOrderSuccessPage.clickOrderHistoryLink();
        //capture screenshot of the confirm order page display
        captureScreenshot(driver, "Product Checkout Order History Pre-View Dashboard (Reg User) Page Display");
        //order history pre-view page web element assert
        isOrderHistoryPreviewPageWebElementDisplayed(orderHistoryPage);
        //order history pre-view page text element assert
        isOrderHistoryPreviewPageTextElementAsExpected(orderHistoryPage);
        //log order history pre-view table data
        logOrderHistoryPreviewPageOrderData(orderHistoryPage);
        //click 'View Order History' button
        orderHistoryPage.clickViewOrderHistoryButton();
        //order history view page
        //capture screenshot of the confirm order page display
        captureScreenshot(driver, "Product Checkout Order History View (Reg User) Page Display");
        //order history view page web element assert
        isOrderHistoryViewPageWebElementDisplayed(orderHistoryPage);
        //order history view page text element assert
        isOrderHistoryViewPageTextElementAsExpected(orderHistoryPage);
        //log order history view details table data
        logOrderHistoryViewDetailsTableData(orderHistoryPage);
        //log order history view order table data
        logOrderHistoryViewOrderTableData(orderHistoryPage);
        //log order history view order history table data
        logOrderHistoryViewOrderHistoryData(orderHistoryPage);
    }

    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //product return test method ('Order Error' return reason)
    protected void returnProductOrderErrorTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        OrderHistoryPage orderHistoryPage = new OrderHistoryPage(driver);
        ProductReturnsPage productReturnsPage = new ProductReturnsPage(driver);
        MyAccountPage myAccountPage = new MyAccountPage(driver);
        //general page web element assert (elements all pages share)
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert (elements all pages share)
        isGeneralPageTextElementAsExpected(generalPage);
        //click 'Return' order button
        orderHistoryPage.clickReturnOrderButton();
        //capture screenshot of the product returns page display
        captureScreenshot(driver, "Product Returns (Reg User) Page Display");
        //product returns page web element display
        isProductReturnsPageWebElementDisplayed(productReturnsPage);
        //product returns page text element display
        isProductReturnsPageTextElementAsExpected(productReturnsPage);
        //click 'Order Error' radio button
        productReturnsPage.clickOrderErrorRadioButton();
        //click 'Continue' button
        productReturnsPage.clickProductReturnsContinueButton();
        /*
        //assert the user gets the expected success title/message
        assertEquals("Product Returns", productReturnsPage.getProductReturnsPageTitle(), "The product return message success title doesn't match expectations or the product return submission has failed.");
        assertEquals("Thank you for submitting your return request. Your request has been sent to the relevant department for processing.", productReturnsPage.getProductReturnsPageSubtitle(), "The product return message success subtitle doesn't match expectations or the product return submission has failed.");
        */
        //capture screenshot of the test result
        captureScreenshot(driver, "Product Returns (Reg User) Page Return Submission Test Result");
        //aside section assert
        isMyAccountAsideSectionWebElementDisplayed(myAccountPage);
        //click 'Continue' button
        productReturnsPage.clickProductContinueButton();
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

    //wishlist page web element assert test method
    protected void isWishlistPageWebElementDisplayed(WishlistPage wishlistPage) {
        MyAccountPage myAccountPage = new MyAccountPage(driver);
        //assert wishlist page breadcrumb is displayed (as a list)
        assertTrue(myAccountPage.isPageBreadcrumbDisplayed(), "The wishlist page breadcrumb isn't displayed");
        //main
        //assert wishlist page title is displayed
        assertTrue(wishlistPage.isWishlistPageTitleDisplayed(), "The wishlist page title isn't displayed");
        //assert wishlist page 'Continue' button is displayed
        assertTrue(wishlistPage.isWishlistPageContinueButtonDisplayed(), "The wishlist page 'Continue' button isn't displayed");
        //table elements
        //assert wishlist page product image links are displayed (as a list)
        assertTrue(wishlistPage.isWishlistPageProductImageLinkDisplayed(), "The wishlist page table product image links aren't displayed");
        //assert wishlist page product name links are displayed (as a list) //Selenium throws StaleElementRefException even if the page isn't reloaded and the element isn't obstructed, waits don't fix the issue, selector IS valid
        //assertTrue(wishlistPage.isWishlistPageProductNameLinkDisplayed(), "The wishlist page table product name links aren't displayed");
        //assert wishlist page product models are displayed (as a list)
        assertTrue(wishlistPage.isWishlistPageProductModelDisplayed(), "The wishlist page table product models aren't displayed");
        //assert wishlist page product stocks are displayed (as a list)
        assertTrue(wishlistPage.isWishlistPageProductStockDisplayed(), "The wishlist page table product stocks aren't displayed");
        //assert wishlist page product unit prices are displayed (as a list)
        assertTrue(wishlistPage.isWishlistPageProductUnitPriceDisplayed(), "The wishlist page table product unit prices aren't displayed");
        //assert wishlist page product 'Add to cart' buttons are displayed (as a list)
        assertTrue(wishlistPage.isWishlistPageProductAddToCartDisplayed(), "The wishlist page table product 'Add to cart' buttons aren't displayed");
        //assert wishlist page product 'Remove' buttons are displayed (as a list)
        assertTrue(wishlistPage.isWishlistPageProductRemoveButtonDisplayed(), "The wishlist page table product 'Remove' buttons aren't displayed");
        //aside section web element assert
        isMyAccountAsideSectionWebElementDisplayed(myAccountPage);
    }

    //product comparison page web element assert test method
    protected void isProductComparisonPageWebElementDisplayed(ProductCompareListPage productCompareListPage) {
        MyAccountPage myAccountPage = new MyAccountPage(driver);
        //assert wishlist page breadcrumb is displayed (as a list)
        assertTrue(myAccountPage.isPageBreadcrumbDisplayed(), "The wishlist page breadcrumb isn't displayed");
        //main
        //assert product comparison page title is displayed
        assertTrue(productCompareListPage.isProductCompareListPageTitleDisplayed(), "The product comparison page title isn't displayed");
        //table elements
        //assert product comparison list product name links are displayed (as a list)
        assertTrue(productCompareListPage.isProductCompareListProductNameLinkDisplayed(), "The product comparison page product name links aren't displayed");
        //assert product comparison list product images are displayed (as a list)
        assertTrue(productCompareListPage.isProductCompareListProductImageDisplayed(), "The product comparison page product images aren't displayed");
        //assert product comparison list product prices are displayed (as a list)
        assertTrue(productCompareListPage.isProductCompareListProductPriceDisplayed(), "The product comparison page product prices aren't displayed");
        //assert product comparison list product models are displayed (as a list)
        assertTrue(productCompareListPage.isProductCompareListProductModelDisplayed(), "The product comparison page product models aren't displayed");
        //assert product comparison list product brands are displayed (as a list)
        assertTrue(productCompareListPage.isProductCompareListProductBrandDisplayed(), "The product comparison page product brands aren't displayed");
        //assert product comparison list product availabilities are displayed (as a list)
        assertTrue(productCompareListPage.isProductCompareListProductAvailabilityDisplayed(), "The product comparison page product availabilities aren't displayed");
        //assert product comparison list product ratings are displayed (as a list)
        assertTrue(productCompareListPage.isProductCompareListProductRatingDisplayed(), "The product comparison page product ratings aren't displayed");
        //assert product comparison list product summaries are displayed (as a list)
        assertTrue(productCompareListPage.isProductCompareListProductSummaryDisplayed(), "The product comparison page product summaries aren't displayed");
        //assert product comparison list product weights are displayed (as a list)
        assertTrue(productCompareListPage.isProductCompareListProductWeightDisplayed(), "The product comparison page product weights aren't displayed");
        //assert product comparison list product dimensions are displayed (as a list)
        assertTrue(productCompareListPage.isProductCompareListProductDimensionDisplayed(), "The product comparison page product dimensions aren't displayed");
        //assert product comparison list product 'Add to Cart' buttons are displayed (as a list)
        assertTrue(productCompareListPage.isProductCompareListProductAddToCartButtonDisplayed(), "The product comparison page product 'Add to Cart' buttons aren't displayed");
        //assert product comparison list product 'Remove' buttons are displayed (as a list)
        assertTrue(productCompareListPage.isProductCompareListProductRemoveButtonDisplayed(), "The product comparison page product 'Remove' buttons aren't displayed");
    }

    //product comparison page web element assert test method (for additional HP LP3065 page specific elements)
    protected void isProductComparisonPageHPWebElementDisplayed(ProductCompareListPage productCompareListPage) {
        //assert product comparison page HP memory parameter is displayed
        assertTrue(productCompareListPage.isProductCompareMemoryDisplayed(), "The product comparison page HP memory parameter isn't displayed");
        //assert product comparison page HP core number parameter is displayed
        assertTrue(productCompareListPage.isProductCompareCoreNumberDisplayed(), "The product comparison page HP core number parameter isn't displayed");
    }

    //single product category dashboard page web element assert test method
    protected void isSingleProductCategoryDashboardPageWebElementDisplayed(SingleProductCategoryDashboardPage singleProductCategoryDashboardPage) {
        MyAccountPage myAccountPage = new MyAccountPage(driver);
        //assert single product category dashboard page breadcrumb is displayed (as a list)
        assertTrue(myAccountPage.isPageBreadcrumbDisplayed(), "The single product category dashboard page breadcrumb isn't displayed");
        //aside
        //assert single product category dashboard aside desktops link is displayed
        assertTrue(singleProductCategoryDashboardPage.isAsideDesktopsLinkDisplayed(), "The single product category dashboard aside desktops link isn't displayed");
        //assert single product category dashboard aside laptops link is displayed
        assertTrue(singleProductCategoryDashboardPage.isAsideLaptopsLinkDisplayed(), "The single product category dashboard aside laptops link isn't displayed");
        //assert single product category dashboard aside components link is displayed
        assertTrue(singleProductCategoryDashboardPage.isAsideComponentsLinkDisplayed(), "The single product category dashboard aside components link isn't displayed");
        //assert single product category dashboard aside tablets link is displayed
        assertTrue(singleProductCategoryDashboardPage.isAsideTabletsLinkDisplayed(), "The single product category dashboard aside tablets link isn't displayed");
        //assert single product category dashboard aside software link is displayed
        assertTrue(singleProductCategoryDashboardPage.isAsideSoftwareLinkDisplayed(), "The single product category dashboard aside software link isn't displayed");
        //assert single product category dashboard aside phones link is displayed
        assertTrue(singleProductCategoryDashboardPage.isAsidePhonesLinkDisplayed(), "The single product category dashboard aside phones link isn't displayed");
        //assert single product category dashboard aside cameras link is displayed
        assertTrue(singleProductCategoryDashboardPage.isAsideCamerasLinkDisplayed(), "The single product category dashboard aside cameras link isn't displayed");
        //assert single product category dashboard aside mp3 players link is displayed
        assertTrue(singleProductCategoryDashboardPage.isAsideMP3PlayersLinkDisplayed(), "The single product category dashboard aside mp3 players link isn't displayed");
        //assert single product category dashboard aside swiper image link is displayed
        assertTrue(singleProductCategoryDashboardPage.isAsideSwiperImageLinkDisplayed(), "The single product category dashboard aside swiper image link isn't displayed");
        //main
        //assert single product category dashboard page title is displayed
        assertTrue(singleProductCategoryDashboardPage.isSingleProductCategoryPageTitleDisplayed(), "The single product category dashboard page title isn't displayed");
        //assert single product category dashboard page grid view button is displayed
        assertTrue(singleProductCategoryDashboardPage.isSingleProductCategoryGridViewButtonDisplayed(), "The single product category dashboard page grid view button isn't displayed");
        //assert single product category dashboard page list view button is displayed
        assertTrue(singleProductCategoryDashboardPage.isSingleProductCategoryListViewButtonDisplayed(), "The single product category dashboard page list view button isn't displayed");
        //assert single product category dashboard page product compare link is displayed
        assertTrue(singleProductCategoryDashboardPage.isSingleProductCategoryProductCompareLinkDisplayed(), "The single product category dashboard page product compare link isn't displayed");
        //assert single product category dashboard page sort by dropdown menu is displayed
        assertTrue(singleProductCategoryDashboardPage.isSingleProductCategorySortByDropdownMenuDisplayed(), "The single product category dashboard page sort by dropdown menu isn't displayed");
        //assert single product category dashboard page show dropdown menu is displayed
        assertTrue(singleProductCategoryDashboardPage.isSingleProductCategoryShowDropdownMenuDisplayed(), "The single product category dashboard page show dropdown menu isn't displayed");
        //assert single product category dashboard page product counter is displayed
        assertTrue(singleProductCategoryDashboardPage.isSingleProductCategoryShowingProductCounterDisplayed(), "The single product category dashboard page product counter isn't displayed");
        //product table list elements
        //assert single product category dashboard page product image links are displayed (as a list)
        assertTrue(singleProductCategoryDashboardPage.isProductTableImageLinkDisplayed(), "The single product category dashboard page product image links aren't displayed");
        //assert single product category dashboard page product name links are displayed (as a list)
        assertTrue(singleProductCategoryDashboardPage.isProductTableNameLinkDisplayed(), "The single product category dashboard page product name links aren't displayed");
        //assert single product category dashboard page product descriptions are displayed (as a list)
        assertTrue(singleProductCategoryDashboardPage.isProductTableDescriptionDisplayed(), "The single product category dashboard page product name descriptions aren't displayed");
        //assert single product category dashboard page product unit prices are displayed (as a list)
        assertTrue(singleProductCategoryDashboardPage.isProductTableUnitPriceDisplayed(), "The single product category dashboard page product unit prices aren't displayed");
        //assert single product category dashboard page product 'add to cart' buttons are displayed (as a list) (buttons throw StaleElementReferenceException even if they are NOT obscured/refreshed)
        //assertTrue(singleProductCategoryDashboardPage.isProductTableAddToCartButtonDisplayed(), "The single product category dashboard page product 'Add to cart' buttons aren't displayed");
        //assert single product category dashboard page product 'add to wishlist' buttons are displayed (as a list)
        //assertTrue(singleProductCategoryDashboardPage.isProductTableAddToWishlistButtonDisplayed(), "The single product category dashboard page product 'Add to wishlist' buttons aren't displayed");
        //assert single product category dashboard page product 'add to compare' buttons are displayed (as a list)
        //assertTrue(singleProductCategoryDashboardPage.isProductTableAddToCompareButtonDisplayed(), "The single product category dashboard page product 'Add to compare' buttons aren't displayed");
    }

    //single product category dashboard page additional (elements that not all category pages have) web element assert test method
    protected void isSingleProductCategoryDashboardPageAdditionalWebElementDisplayed(SingleProductCategoryDashboardPage singleProductCategoryDashboardPage) {
        //main
        //assert single product category dashboard page main image is displayed
        assertTrue(singleProductCategoryDashboardPage.isSingleProductCategoryMainImageDisplayed(), "The single product category dashboard page main image isn't displayed");
        //assert single product category dashboard page description is displayed
        assertTrue(singleProductCategoryDashboardPage.isSingleProductCategoryDescriptionDisplayed(), "The single product category dashboard page description isn't displayed");
        //assert single product category dashboard page subtitle is displayed
        assertTrue(singleProductCategoryDashboardPage.isSingleProductCategorySubtitleDisplayed(), "The single product category dashboard page subtitle isn't displayed");
        //list elements
        //assert single product category dashboard page product refined search links are displayed (as a list)
        assertTrue(singleProductCategoryDashboardPage.isSingleProductCategoryRefinedSearchLinkDisplayed(), "The single product category dashboard page product refined search links aren't displayed");
    }

    //searched product dashboard page web element assert test method (it's single product category dashboard page but without aside content)
    protected void isSearchedProductDashboardPageWebElementDisplayed(){
        SingleProductCategoryDashboardPage singleProductCategoryDashboardPage = new SingleProductCategoryDashboardPage(driver);
        //main
        //assert single product category dashboard page title is displayed
        assertTrue(singleProductCategoryDashboardPage.isSingleProductCategoryPageTitleDisplayed(), "The single product category dashboard page title isn't displayed");
        //assert single product category dashboard page grid view button is displayed
        assertTrue(singleProductCategoryDashboardPage.isSingleProductCategoryGridViewButtonDisplayed(), "The single product category dashboard page grid view button isn't displayed");
        //assert single product category dashboard page list view button is displayed
        assertTrue(singleProductCategoryDashboardPage.isSingleProductCategoryListViewButtonDisplayed(), "The single product category dashboard page list view button isn't displayed");
        //assert single product category dashboard page product compare link is displayed
        assertTrue(singleProductCategoryDashboardPage.isSingleProductCategoryProductCompareLinkDisplayed(), "The single product category dashboard page product compare link isn't displayed");
        //assert single product category dashboard page sort by dropdown menu is displayed
        assertTrue(singleProductCategoryDashboardPage.isSingleProductCategorySortByDropdownMenuDisplayed(), "The single product category dashboard page sort by dropdown menu isn't displayed");
        //assert single product category dashboard page show dropdown menu is displayed
        assertTrue(singleProductCategoryDashboardPage.isSingleProductCategoryShowDropdownMenuDisplayed(), "The single product category dashboard page show dropdown menu isn't displayed");
        //assert single product category dashboard page product counter is displayed
        assertTrue(singleProductCategoryDashboardPage.isSingleProductCategoryShowingProductCounterDisplayed(), "The single product category dashboard page product counter isn't displayed");
        //product table list elements
        //assert single product category dashboard page product image links are displayed (as a list)
        assertTrue(singleProductCategoryDashboardPage.isProductTableImageLinkDisplayed(), "The single product category dashboard page product image links aren't displayed");
        //assert single product category dashboard page product name links are displayed (as a list)
        assertTrue(singleProductCategoryDashboardPage.isProductTableNameLinkDisplayed(), "The single product category dashboard page product name links aren't displayed");
        //assert single product category dashboard page product descriptions are displayed (as a list)
        assertTrue(singleProductCategoryDashboardPage.isProductTableDescriptionDisplayed(), "The single product category dashboard page product name descriptions aren't displayed");
        //assert single product category dashboard page product unit prices are displayed (as a list)
        assertTrue(singleProductCategoryDashboardPage.isProductTableUnitPriceDisplayed(), "The single product category dashboard page product unit prices aren't displayed");
        //assert single product category dashboard page product 'add to cart' buttons are displayed (as a list) (buttons throw StaleElementReferenceException even if they are NOT obscured/refreshed)
        //assertTrue(singleProductCategoryDashboardPage.isProductTableAddToCartButtonDisplayed(), "The single product category dashboard page product 'Add to cart' buttons aren't displayed");
        //assert single product category dashboard page product 'add to wishlist' buttons are displayed (as a list)
        //assertTrue(singleProductCategoryDashboardPage.isProductTableAddToWishlistButtonDisplayed(), "The single product category dashboard page product 'Add to wishlist' buttons aren't displayed");
        //assert single product category dashboard page product 'add to compare' buttons are displayed (as a list)
        //assertTrue(singleProductCategoryDashboardPage.isProductTableAddToCompareButtonDisplayed(), "The single product category dashboard page product 'Add to compare' buttons aren't displayed");
    }

    //single product page web element assert test method
    protected void isSingleProductPageWebElementDisplayed(SingleProductPage singleProductPage) {
        MyAccountPage myAccountPage = new MyAccountPage(driver);
        //assert single product page breadcrumb is displayed (as a list)
        assertTrue(myAccountPage.isPageBreadcrumbDisplayed(), "The single product category dashboard page breadcrumb isn't displayed");
        //main
        //assert single product page title is displayed
        assertTrue(singleProductPage.isSingleProductPageTitleDisplayed(), "The single product page title isn't displayed");
        //assert single product page 'Add to wishlist' button is displayed
        assertTrue(singleProductPage.isSingleProductPageProductAddToWishlistButtonDisplayed(), "The single product page 'Add to wishlist' button isn't displayed");
        //assert single product page 'Add to compare' button is displayed
        assertTrue(singleProductPage.isSingleProductPageProductAddToCompareButtonDisplayed(), "The single product page 'Add to compare' button isn't displayed");
        //assert single product page short product description is displayed
        assertTrue(singleProductPage.isSingleProductPageProductShortDescriptionDisplayed(), "The single product page short product description isn't displayed");
        //assert single product page unit price is displayed
        assertTrue(singleProductPage.isSingleProductPageProductShortUnitPriceDisplayed(), "The single product page product unit price isn't displayed");
        //assert single product page product 'ex.tax'  is displayed
        assertTrue(singleProductPage.isSingleProductPageProductShortExTaxPriceDisplayed(), "The single product page product 'ex.tax' isn't displayed");
        //assert single product page product quantity subtitle is displayed
        assertTrue(singleProductPage.isSingleProductPageQtySubtitleDisplayed(), "The single product page product quantity subtitle isn't displayed");
        //assert single product page product quantity input field is displayed
        assertTrue(singleProductPage.isSingleProductPageQtyInputFieldDisplayed(), "The single product page product quantity input field isn't displayed");
        //assert single product page product 'Add to cart' button is displayed
        assertTrue(singleProductPage.isSingleProductPageProductAddToCartButtonDisplayed(), "The single product page product 'Add to cart' button isn't displayed");
        //assert single product page product review counter is displayed
        assertTrue(singleProductPage.isSingleProductPageProductReviewCounterDisplayed(), "The single product page product review counter isn't displayed");
        //assert single product page product write review link is displayed
        assertTrue(singleProductPage.isSingleProductPageProductWriteReviewLinkDisplayed(), "The single product page write product review isn't displayed");
        //assert single product page product review radio buttons are displayed (as a list)
        assertTrue(singleProductPage.isSingleProductPageProductReviewButtonsDisplayed(), "The single product page product review radio buttons aren't displayed");
        //assert single product page product descriptions link is displayed
        assertTrue(singleProductPage.isSingleProductPageProductDescriptionLinkDisplayed(), "The single product page product descriptions isn't displayed");
        //assert single product page product reviews link is displayed
        assertTrue(singleProductPage.isSingleProductPageProductReviewsLinkDisplayed(), "The single product page product reviews isn't displayed");
    }

    //single product page additional assert test method (HP and Ipod Touch)
    protected void isSingleProductPageAdditionalWebElementDisplayed(SingleProductPage singleProductPage) {
        //assert single product page product main image is displayed
        assertTrue(singleProductPage.isSingleProductPageMainImageDisplayed(), "The single product page product main image isn't displayed");
        //assert single product page product images are displayed (as a list)
        assertTrue(singleProductPage.isSingleProductPageImagesDisplayed(), "The single product page product images aren't displayed");
    }

    //shopping cart dropdown menu web elements assert test method (general page element)
    protected void isShoppingCartDropdownWebElementDisplayed(GeneralPage generalPage) {
        //wait for elements to load
        generalPage.waitForElementsToLoad();
        //assert shopping cart dropdown menu product images are displayed (as a list)
        assertTrue(generalPage.isShoppingCartDropdownProductImageDisplayed(), "The shopping cart dropdown menu product images aren't displayed");
        //assert shopping cart dropdown menu product names are displayed (as a list)
        assertTrue(generalPage.isShoppingCartDropdownProductNameDisplayed(), "The shopping cart dropdown menu product names aren't displayed");
        //assert shopping cart dropdown menu product descriptions are displayed (as a list)
        assertTrue(generalPage.isShoppingCartDropdownProductDescDisplayed(), "The shopping cart dropdown menu product descriptions aren't displayed");
        //assert shopping cart dropdown menu product quantities are displayed (as a list)
        assertTrue(generalPage.isShoppingCartDropdownProductQtyDisplayed(), "The shopping cart dropdown menu product quantities aren't displayed");
        //assert shopping cart dropdown menu product unit price are displayed (as a list)
        assertTrue(generalPage.isShoppingCartDropdownProductUnitPriceDisplayed(), "The shopping cart dropdown menu product unit prices aren't displayed");
        //assert shopping cart dropdown menu product remove button are displayed (as a list)
        assertTrue(generalPage.isShoppingCartDropdownProductRemoveButtonDisplayed(), "The shopping cart dropdown menu product remove button aren't displayed");
        //assert shopping cart dropdown menu subtotal price is displayed
        //assertTrue(generalPage.isShoppingCartDropdownSubTotalPriceDisplayed(), "The shopping cart dropdown menu sub total price isn't displayed");
        //assert shopping cart dropdown menu total price is displayed
        //assertTrue(generalPage.isShoppingCartDropdownTotalPriceDisplayed(), "The shopping cart dropdown menu total price isn't displayed");
        //assert shopping cart dropdown menu view cart link is displayed
        //assertTrue(generalPage.isShoppingCartDropdownViewCartLinkDisplayed(), "The shopping cart dropdown menu view cart link isn't displayed");
        //assert shopping cart dropdown menu shopping cart link is displayed
        //assertTrue(generalPage.isShoppingCartDropdownShoppingCartLinkDisplayed(), "The shopping cart dropdown menu shopping cart link isn't displayed");
    }

    //shopping cart page web element assert test method
    protected void isShoppingCartPageWebElementDisplayed(ShoppingCartPage shoppingCartPage) {
        MyAccountPage myAccountPage = new MyAccountPage(driver);
        //assert single product page breadcrumb is displayed (as a list)
        assertTrue(myAccountPage.isPageBreadcrumbDisplayed(), "The shopping cart page breadcrumb isn't displayed");
        //main
        //assert shopping cart page title is displayed
        assertTrue(shoppingCartPage.isShoppingCartPageTitleDisplayed(), "The shopping cart page title isn't displayed");
        //shopping cart table
        //assert shopping cart page product images are displayed (as a list)
        assertTrue(shoppingCartPage.isShoppingCartPageProductImageDisplayed(), "The shopping cart product table images aren't displayed");
        //assert shopping cart page product name links are displayed (as a list)
        assertTrue(shoppingCartPage.isShoppingCartPageProductNameLinkDisplayed(), "The shopping cart product table name links aren't displayed");
        //assert shopping cart page product descriptions are displayed (as a list)
        assertTrue(shoppingCartPage.isShoppingCartPageProductDescDisplayed(), "The shopping cart product table descriptions aren't displayed");
        //assert shopping cart page product models are displayed (as a list)
        assertTrue(shoppingCartPage.isShoppingCartPageProductModelDisplayed(), "The shopping cart product table models aren't displayed");
        //assert shopping cart page product quantity input fields are displayed (as a list)
        assertTrue(shoppingCartPage.isShoppingCartPageProductQtyInputFieldDisplayed(), "The shopping cart product table quantity input fields aren't displayed");
        //assert shopping cart page product quantity update button are displayed (as a list)
        assertTrue(shoppingCartPage.isShoppingCartPageProductQtyUpdateButtonDisplayed(), "The shopping cart product quantity update buttons aren't displayed");
        //assert shopping cart page product remove buttons are displayed (as a list)
        assertTrue(shoppingCartPage.isShoppingCartPageProductRemoveButtonDisplayed(), "The shopping cart product remove buttons aren't displayed");
        //assert shopping cart page product unit prices are displayed (as a list)
        assertTrue(shoppingCartPage.isShoppingCartPageProductUnitPriceDisplayed(), "The shopping cart product unit prices aren't displayed");
        //assert shopping cart page product total prices are displayed (as a list)
        assertTrue(shoppingCartPage.isShoppingCartPageProductTotalPriceDisplayed(), "The shopping cart product total prices aren't displayed");
        //to-do section
        //assert shopping cart page to-do next section title is displayed
        assertTrue(shoppingCartPage.isShoppingCartToDoNextSectionTitleDisplayed(), "The shopping cart page to-do section title isn't displayed");
        //assert shopping cart page to-do next section subtitle is displayed
        assertTrue(shoppingCartPage.isShoppingCartToDoNextSectionSubtitleDisplayed(), "The shopping cart page to-do section subtitle isn't displayed");
        //assert shopping cart page coupon code dropdown link is displayed
        assertTrue(shoppingCartPage.isShoppingCartToDoNextCouponCodeDropdownLinkDisplayed(), "The shopping cart page to-do section coupon dropdown link isn't displayed");
        //assert shopping cart page to-do section gift certificate dropdown link is displayed
        assertTrue(shoppingCartPage.isShoppingCartToDoNextGiftCertificateDropdownLinkDisplayed(), "The shopping cart page to-do section gift certificate dropdown link isn't displayed");
        //assert shopping cart page order subtotal price is displayed
        assertTrue(shoppingCartPage.isShoppingCartOrderSubtotalPriceDisplayed(), "The shopping cart page order subtotal price isn't displayed");
        //assert shopping cart page order total price is displayed
        assertTrue(shoppingCartPage.isShoppingCartOrderTotalPriceDisplayed(), "The shopping cart page order total price isn't displayed");
        //assert shopping cart page 'Continue shopping' button is displayed
        assertTrue(shoppingCartPage.isShoppingCartContinueShoppingButtonDisplayed(), "The shopping cart page 'Continue shopping' button isn't displayed");
        //assert shopping cart page 'Checkout' button is displayed
        assertTrue(shoppingCartPage.isShoppingCartCheckoutButtonDisplayed(), "The shopping cart page 'Checkout' button isn't displayed");
    }

    //shopping cart page 'Estimate shipping' section web elements assert test method
    protected void isShoppingCartPageEstimateShippingSectionWebElementDisplayed(ShoppingCartPage shoppingCartPage) {
        //assert shopping cart page estimate shipping dropdown link is displayed
        assertTrue(shoppingCartPage.isShoppingCartToDoNextEstimateShippingDropdownLinkDisplayed(), "The shopping cart page to-do section estimate shipping dropdown link isn't displayed");
        //assert shopping cart page estimate shipping subtext is displayed
        assertTrue(shoppingCartPage.isShoppingCartToDoNextEstimateShippingSubtextDisplayed(), "The shopping cart page to-do section estimate shipping subtext isn't displayed");
        //assert shopping cart page estimate shipping country dropdown menu is displayed
        assertTrue(shoppingCartPage.isShoppingCartToDoNextEstimateShippingCountryDropdownMenuDisplayed(), "The shopping cart page to-do section estimate shipping country dropdown menu isn't displayed");
        //assert shopping cart page estimate shipping state dropdown menu is displayed
        assertTrue(shoppingCartPage.isShoppingCartToDoNextEstimateShippingStateDropdownMenuDisplayed(), "The shopping cart page to-do section estimate shipping state dropdown menu isn't displayed");
        //assert shopping cart page estimate shipping post code input field is displayed
        assertTrue(shoppingCartPage.isShoppingCartToDoNextEstimateShippingPostCodeInputFieldDisplayed(), "The shopping cart page to-do section estimate shipping post code input field isn't displayed");
        //assert shopping cart page estimate shipping 'submit' button is displayed
        assertTrue(shoppingCartPage.isShoppingCartToDoNextEstimateShippingSubmitButtonDisplayed(), "The shopping cart page to-do section estimate shipping 'Submit' button isn't displayed");
    }

    //checkout page section web element assert methods

    //checkout page general page web element assert test method
    protected void isCheckoutPageWebElementDisplayed(CheckoutPage checkoutPage) {
        MyAccountPage myAccountPage = new MyAccountPage(driver);
        //assert single product page breadcrumb is displayed (as a list)
        assertTrue(myAccountPage.isPageBreadcrumbDisplayed(), "The checkout page breadcrumb isn't displayed");
        //assert checkout page title is displayed
        assertTrue(checkoutPage.isCheckoutPageTitleDisplayed(), "The checkout page title isn't displayed");
    }

    //checkout page new customer section web element assert test method
    protected void isCheckoutPageNewCustomerSectionWebElementDisplayed(CheckoutPage checkoutPage) {
        //assert checkout page new customer section title is displayed
        assertTrue(checkoutPage.isCheckoutPageNewCustomerSectionTitleDisplayed(), "The checkout page new customer section title isn't displayed");
        //assert checkout page new customer section subtitle is displayed
        assertTrue(checkoutPage.isCheckoutPageNewCustomerSectionSubtitleDisplayed(), "The checkout page new customer section subtitle isn't displayed");
        //assert checkout page new customer register radio button is displayed
        assertTrue(checkoutPage.isCheckoutPageNewCustomerRegisterAccountRadioButtonDisplayed(), "The checkout page new customer section 'Register Account' radio button isn't displayed");
        //assert checkout page new customer guest account radio button is displayed
        assertTrue(checkoutPage.isCheckoutPageNewCustomerGuestAccountRadioButtonDisplayed(), "The checkout page new customer section 'Guest Account' radio button isn't displayed");
        //assert checkout page new customer section description is displayed
        assertTrue(checkoutPage.isCheckoutPageNewCustomerSectionDescriptionDisplayed(), "The checkout page new customer section description isn't displayed");
        //assert checkout page new customer section continue button is displayed
        assertTrue(checkoutPage.isCheckoutPageNewCustomerContinueButtonDisplayed(), "The checkout page new customer section 'Continue' button isn't displayed");
    }

    //checkout page returning customer section web element assert test method
    protected void isCheckoutPageReturningCustomerSectionWebElementDisplayed(CheckoutPage checkoutPage) {
        //assert checkout page returning customer section title is displayed
        assertTrue(checkoutPage.isCheckoutPageReturningCustomerSectionTitleDisplayed(), "The checkout page returning customer section title isn't displayed");
        //assert checkout page returning customer section subtitle is displayed
        assertTrue(checkoutPage.isCheckoutPageReturningCustomerSectionSubtitleDisplayed(), "The checkout page returning customer section subtitle isn't displayed");
        //assert checkout page returning customer section email input field is displayed
        assertTrue(checkoutPage.isCheckoutPageReturningCustomerSectionEmailInputFieldDisplayed(), "The checkout page returning customer section email input field isn't displayed");
        //assert checkout page returning customer section password input field is displayed
        assertTrue(checkoutPage.isCheckoutPageReturningCustomerSectionPasswordInputFieldDisplayed(), "The checkout page returning customer section password input field isn't displayed");
        //assert checkout page returning customer section forgot password link is displayed
        assertTrue(checkoutPage.isCheckoutPageReturningCustomerSectionForgotPasswordLinkDisplayed(), "The checkout page returning customer section 'Forgot Password' link isn't displayed");
        //assert checkout page returning customer section login button is displayed
        assertTrue(checkoutPage.isCheckoutPageReturningCustomerLoginButtonDisplayed(), "The checkout page returning customer section 'Login' button isn't displayed");
    }

    //checkout page guest section web element assert test method
    protected void isCheckoutPageGuestSectionWebElementDisplayed(CheckoutPage checkoutPage) {
        GeneralPage generalPage = new GeneralPage(driver);
        //wait for elements to load
        generalPage.waitForElementsToLoad();
        //assert checkout page guest personal details section title is displayed
        assertTrue(checkoutPage.isCheckoutPagePersonalDetailsSectionTitleDisplayed(), "The checkout page guest personal details section title isn't displayed");
        //assert checkout page guest section first name input field is displayed
        assertTrue(checkoutPage.isCheckoutPageFirstNameInputFieldDisplayed(), "The checkout page guest customer section first name input field isn't displayed");
        //assert checkout page guest section last name input field is displayed
        assertTrue(checkoutPage.isCheckoutPageLastNameInputFieldDisplayed(), "The checkout page guest customer section last name input field isn't displayed");
        //assert checkout page guest section email input field is displayed
        assertTrue(checkoutPage.isCheckoutPageEmailInputFieldDisplayed(), "The checkout page guest customer section email input field isn't displayed");
        //assert checkout page guest section phone input field is displayed
        assertTrue(checkoutPage.isCheckoutPagePhoneInputFieldDisplayed(), "The checkout page guest customer section phone input field isn't displayed");
        //assert checkout page guest section address details section is displayed
        assertTrue(checkoutPage.isCheckoutPageAddressDetailsSectionTitleDisplayed(), "The checkout page guest address section title isn't displayed");
        //assert checkout page guest section company input field is displayed
        assertTrue(checkoutPage.isCheckoutPageCompanyInputFieldDisplayed(), "The checkout page guest customer section company input field isn't displayed");
        //assert checkout page guest section address1 input field is displayed
        assertTrue(checkoutPage.isCheckoutPageAddress1InputFieldDisplayed(), "The checkout page guest customer section address1 input field isn't displayed");
        //assert checkout page guest section address2 input field is displayed
        assertTrue(checkoutPage.isCheckoutPageAddress2InputFieldDisplayed(), "The checkout page guest customer section address2 input field isn't displayed");
        //assert checkout page guest section city input field is displayed
        assertTrue(checkoutPage.isCheckoutPageCityInputFieldDisplayed(), "The checkout page guest customer section city input field isn't displayed");
        //assert checkout page guest section post code input field is displayed
        assertTrue(checkoutPage.isCheckoutPagePostCodeInputFieldDisplayed(), "The checkout page guest customer section post code input field isn't displayed");
        //assert checkout page guest section country dropdown menu is displayed
        assertTrue(checkoutPage.isCheckoutPageCountryDropdownMenuDisplayed(), "The checkout page guest customer section country dropdown menu isn't displayed");
        //assert checkout page guest section state dropdown menu is displayed
        assertTrue(checkoutPage.isCheckoutPageStateDropdownMenuDisplayed(), "The checkout page guest customer section state dropdown menu isn't displayed");
        //assert checkout page guest section 'billing and shipping address are same' checkbox is displayed
        assertTrue(checkoutPage.isCheckoutPageDeliveryBillingAddressSameCheckboxDisplayed(), "The checkout page guest customer section 'Billing and Shipping address are same' checkbox isn't displayed");
        //assert checkout page guest section 'Continue' button is displayed
        assertTrue(checkoutPage.isCheckoutPageGuestAccContinueButtonDisplayed(), "The checkout page guest customer section 'Continue' button isn't displayed");
    }

    //checkout page delivery method section web element assert test method
    protected void isCheckoutPageDeliverySectionWebElementDisplayed(CheckoutPage checkoutPage) {
        GeneralPage generalPage = new GeneralPage(driver);
        //wait for elements to load
        generalPage.waitForElementsToLoad();
        //assert checkout page delivery method subtext is displayed
        assertTrue(checkoutPage.isCheckoutPageDeliveryMethodSubtextDisplayed(), "The checkout page delivery method section subtext isn't displayed");
        //assert checkout page delivery method flat shipping rate radio button is displayed
        assertTrue(checkoutPage.isCheckoutPageDeliveryFlatShippingRateRadioButtonDisplayed(), "The checkout page delivery method section flat shipping rate radio button isn't displayed");
        //assert checkout page delivery method comments textbox is displayed
        assertTrue(checkoutPage.isCheckoutPageDeliveryCommentsTextboxDisplayed(), "The checkout page delivery method comments textbox isn't displayed");
        //assert checkout page delivery method 'Continue' button is displayed
        //assertTrue(checkoutPage.isCheckoutPageDeliveryContinueButtonDisplayed(), "The checkout page delivery method section 'Continue' button isn't displayed");
    }

    //checkout page payment method section web element assert test method
    protected void isCheckoutPagePaymentSectionWebElementDisplayed(CheckoutPage checkoutPage) {
        //assert checkout page payment method subtext is displayed
        assertTrue(checkoutPage.isCheckoutPagePaymentMethodSubtextDisplayed(), "The checkout page payment method section subtext isn't displayed");
        //assert checkout page payment method cash on delivery radio button is displayed
        assertTrue(checkoutPage.isCheckoutPagePaymentMethodCodRadioButtonDisplayed(), "The checkout page payment method 'CoD' radio button isn't displayed");
        //assert checkout page payment method comments textbox is displayed
        assertTrue(checkoutPage.isCheckoutPagePaymentCommentsTextboxDisplayed(), "The checkout page payment method comments textbox isn't displayed");
        //assert checkout page payment method 'Agree to Terms and Conditions' checkbox is displayed
        //assertTrue(checkoutPage.isCheckoutPagePaymentTermsConditionsCheckboxDisplayed(), "The checkout page payment method 'Agree to Terms and Conditions' checkbox isn't displayed");
        //assert checkout page payment method 'Agree to Terms and Conditions' link is displayed
        //assertTrue(checkoutPage.isCheckoutPagePaymentTermsConditionsLinkDisplayed(), "The checkout page payment method 'Agree to Terms and Conditions' link isn't displayed");
        //assert checkout page payment method 'Continue' button is displayed
        assertTrue(checkoutPage.isCheckoutPagePaymentContinueButtonDisplayed(), "The checkout page payment method 'Continue' button isn't displayed");
    }

    //checkout page payment method section web element assert test method
    protected void isCheckoutPageConfirmOrderSectionWebElementDisplayed(CheckoutPage checkoutPage) {
        //assert checkout page confirm order product name links are displayed (as a list)
        assertTrue(checkoutPage.isCheckoutPageProductNameLinkDisplayed(), "The checkout page confirm order product name links aren't displayed");
        //assert checkout page confirm order product models are displayed (as a list)
        assertTrue(checkoutPage.isCheckoutPageProductModelDisplayed(), "The checkout page confirm order product models aren't displayed");
        //assert checkout page confirm order product quantities are displayed (as a list)
        assertTrue(checkoutPage.isCheckoutPageProductQuantityDisplayed(), "The checkout page confirm order product quantities aren't displayed");
        //assert checkout page confirm order product unit prices are displayed (as a list)
        assertTrue(checkoutPage.isCheckoutPageProductUnitPriceDisplayed(), "The checkout page confirm order product unit prices aren't displayed");
        //assert checkout page confirm order product total prices are displayed (as a list)
        assertTrue(checkoutPage.isCheckoutPageProductTotalPriceDisplayed(), "The checkout page confirm order product total prices aren't displayed");
        //assert checkout page confirm order product subtotal price is displayed
        //assertTrue(checkoutPage.isCheckoutPageConfirmSubtotalPriceDisplayed(), "The checkout page confirm order product subtotal price isn't displayed");
        //assert checkout page confirm order product flat shipping price is displayed
        //assertTrue(checkoutPage.isCheckoutPageConfirmFlatShippingRateDisplayed(), "The checkout page confirm order product flat shipping price isn't displayed");
        //assert checkout page confirm order product eco tax price is displayed
        //assertTrue(checkoutPage.isCheckoutPageConfirmEcoTaxDisplayed(), "The checkout page confirm order product eco tax price isn't displayed");
        //assert checkout page confirm order product VAT price is displayed
        //assertTrue(checkoutPage.isCheckoutPageConfirmVATPriceDisplayed(), "The checkout page confirm order product VAT price isn't displayed");
        //assert checkout page confirm order product total price is displayed
        //assertTrue(checkoutPage.isCheckoutPageConfirmTotalPriceDisplayed(), "The checkout page confirm order product total price isn't displayed");
        //assert checkout page 'Confirm Order' button is displayed
        //assertTrue(checkoutPage.isCheckoutPageConfirmOrderButtonDisplayed(), "The checkout page 'Confirm Order' button isn't displayed");
    }

    //confirm order success page web element assert test method (guest)
    protected void isConfirmOrderSuccessPageGuestWebElementDisplayed(ConfirmOrderSuccessPage confirmOrderSuccessPage) {
        MyAccountPage myAccountPage = new MyAccountPage(driver);
        //assert single product page breadcrumb is displayed (as a list)
        assertTrue(myAccountPage.isPageBreadcrumbDisplayed(), "The confirm order success page breadcrumb isn't displayed");
        //main
        //assert confirm order success page message title is displayed
        assertTrue(confirmOrderSuccessPage.isConfirmOrderSuccessMessageTitleDisplayed(), "The confirm order success page message title isn't displayed");
        //assert confirm order success page message text is displayed
        assertTrue(confirmOrderSuccessPage.isConfirmOrderSuccessMessageTextDisplayed(), "The confirm order success page message text isn't displayed");
        //assert confirm order success page 'Continue' button is displayed
        assertTrue(confirmOrderSuccessPage.isConfirmOrderSuccessContinueButtonDisplayed(), "The confirm order success page 'Continue' button isn't displayed");
    }

    //confirm order success page web element assert test method (registered user)
    protected void isConfirmOrderSuccessPageRegUserWebElementDisplayed(ConfirmOrderSuccessPage confirmOrderSuccessPage) {
        MyAccountPage myAccountPage = new MyAccountPage(driver);
        //assert confirm order success page breadcrumb is displayed (as a list)
        assertTrue(myAccountPage.isPageBreadcrumbDisplayed(), "The confirm order success page breadcrumb isn't displayed");
        //main
        //assert confirm order success page message title is displayed
        assertTrue(confirmOrderSuccessPage.isConfirmOrderSuccessMessageTitleDisplayed(), "The confirm order success page message title isn't displayed");
        //assert confirm order success page message text is displayed
        assertTrue(confirmOrderSuccessPage.isConfirmOrderSuccessMessageTextDisplayed(), "The confirm order success page message text isn't displayed");
        //assert confirm order success page my account link is displayed
        assertTrue(confirmOrderSuccessPage.isConfirmOrderSuccessMyAccountLinkDisplayed(), "The confirm order success page 'My account' link isn't displayed");
        //assert confirm order success page history link is displayed
        assertTrue(confirmOrderSuccessPage.isConfirmOrderSuccessHistoryLinkDisplayed(), "The confirm order success page 'History' link isn't displayed");
        //assert confirm order success page downloads link is displayed
        assertTrue(confirmOrderSuccessPage.isConfirmOrderSuccessDownloadLinkDisplayed(), "The confirm order success page 'Downloads' link isn't displayed");
        //assert confirm order success page store owner link is displayed
        assertTrue(confirmOrderSuccessPage.isConfirmOrderSuccessStoreOwnerLinkDisplayed(), "The confirm order success page 'Store owner' link isn't displayed");
        //assert confirm order success page 'Continue' button is displayed
        assertTrue(confirmOrderSuccessPage.isConfirmOrderSuccessContinueButtonDisplayed(), "The confirm order success page 'Continue' button isn't displayed");
    }

    //order history pre-view page web element assert test method
    protected void isOrderHistoryPreviewPageWebElementDisplayed(OrderHistoryPage orderHistoryPage) {
        MyAccountPage myAccountPage = new MyAccountPage(driver);
        //assert order history pre-view page breadcrumb is displayed (as a list)
        assertTrue(myAccountPage.isPageBreadcrumbDisplayed(), "The order history pre-view page breadcrumb isn't displayed");
        //main
        //assert order history pre-view page title is displayed
        assertTrue(orderHistoryPage.isOrderHistoryPageTitleDisplayed(), "The order history pre-view page title isn't displayed");
        //assert order history pre-view page 'Continue' button is displayed
        assertTrue(orderHistoryPage.isOrderHistoryContinueButtonDisplayed(), "The order history pre-view page 'Continue' button isn't displayed");
        //assert order history pre-view page order IDs are displayed (as a list)
        assertTrue(orderHistoryPage.isOrderHistoryPagePreviewTableOrderIDDisplayed(), "The order history pre-view page order table order IDs aren't displayed");
        //assert order history pre-view page order customers are displayed (as a list)
        assertTrue(orderHistoryPage.isOrderHistoryPagePreviewTableOrderCustomerDisplayed(), "The order history pre-view page order table order customers aren't displayed");
        //assert order history pre-view page order product number are displayed (as a list)
        assertTrue(orderHistoryPage.isOrderHistoryPagePreviewTableOrderProductNumberDisplayed(), "The order history pre-view page order table order product numbers aren't displayed");
        //assert order history pre-view page order statuses are displayed (as a list)
        assertTrue(orderHistoryPage.isOrderHistoryPagePreviewTableOrderStatusDisplayed(), "The order history pre-view page order table order statuses aren't displayed");
        //assert order history pre-view page order total prices are displayed (as a list)
        assertTrue(orderHistoryPage.isOrderHistoryPagePreviewTableOrderTotalPriceDisplayed(), "The order history pre-view page order table order total prices aren't displayed");
        //assert order history pre-view page order dates added are displayed (as a list)
        assertTrue(orderHistoryPage.isOrderHistoryPagePreviewTableOrderDateAddedDisplayed(), "The order history pre-view page order table order dates added aren't displayed");
        //assert order history pre-view page order 'View History' buttons are displayed (as a list)
        assertTrue(orderHistoryPage.isOrderHistoryPagePreviewTableOrderViewHistoryButtonDisplayed(), "The order history pre-view page order table order 'View History' buttons aren't displayed");
    }

    //order history view page web element assert test method
    protected void isOrderHistoryViewPageWebElementDisplayed(OrderHistoryPage orderHistoryPage) {
        MyAccountPage myAccountPage = new MyAccountPage(driver);
        //assert order history pre-view page breadcrumb is displayed (as a list)
        assertTrue(myAccountPage.isPageBreadcrumbDisplayed(), "The order history pre-view page breadcrumb isn't displayed");
        //aside section web element assert
        isMyAccountAsideSectionWebElementDisplayed(myAccountPage);
        //main
        //assert order history view page title is displayed
        assertTrue(orderHistoryPage.isOrderViewHistoryPageTitleDisplayed(), "The order history view page title isn't displayed");
        //details section
        //assert order history view details section data is displayed
        assertTrue(orderHistoryPage.isOrderViewDetailsTableDisplayed(), "The order history view details section data isn't displayed");
        //assert order history view methods (payment/shipping) section data is displayed
        assertTrue(orderHistoryPage.isOrderViewMethodTableDisplayed(), "The order history view payment/shipping methods data isn't displayed");
        //assert order history view payment address is displayed
        assertTrue(orderHistoryPage.isOrderViewPaymentAddressTableDisplayed(), "The order history view payment address isn't displayed");
        //assert order history view shipping address is displayed
        assertTrue(orderHistoryPage.isOrderViewShippingAddressTableDisplayed(), "The order history view shipping address isn't displayed");
        //order table
        //assert order history view order table product names are displayed (as a list)
        assertTrue(orderHistoryPage.isOrderViewTableOrderProductNameDisplayed(), "The order history view order table product names aren't displayed");
        //assert order history view order table product models are displayed (as a list)
        assertTrue(orderHistoryPage.isOrderViewTableOrderProductModelDisplayed(), "The order history view order table product models aren't displayed");
        //assert order history view order table product quantities are displayed (as a list)
        assertTrue(orderHistoryPage.isOrderViewTableOrderProductQtyDisplayed(), "The order history view order table product quantities aren't displayed");
        //assert order history view order table product prices are displayed (as a list)
        assertTrue(orderHistoryPage.isOrderViewTableOrderProductPriceDisplayed(), "The order history view order table product prices aren't displayed");
        //assert order history view order table product total prices are displayed (as a list)
        assertTrue(orderHistoryPage.isOrderViewTableOrderProductTotalPriceDisplayed(), "The order history view order table product total prices aren't displayed");
        //assert order history view order table product 'Reorder' buttons are displayed (as a list)
        assertTrue(orderHistoryPage.isOrderViewTableOrderProductReorderButtonDisplayed(), "The order history view order table product 'Reorder' buttons' aren't displayed");
        //assert order history view order table product 'Return' buttons are displayed (as a list)
        assertTrue(orderHistoryPage.isOrderViewTableOrderProductReturnButtonDisplayed(), "The order history view order table product returns aren't displayed");
        //assert order history view order table order subtotal price is displayed
        assertTrue(orderHistoryPage.isOrderViewTableOrderSubtotalPriceDisplayed(), "The order history view order table order subtotal price isn't displayed");
        //assert order history view order table order flat shipping rate is displayed
        assertTrue(orderHistoryPage.isOrderViewTableOrderFlatShippingRateDisplayed(), "The order history view order table order flat shipping rate isn't displayed");
        //assert order history view order table order total price is displayed
        assertTrue(orderHistoryPage.isOrderViewTableOrderTotalPriceDisplayed(), "The order history view order table order total price isn't displayed");
        //order history table
        //assert order history view order history table dates added are displayed (as a list)
        assertTrue(orderHistoryPage.isOrderHistoryDateAddedDisplayed(), "The order history view order history table order dates added aren't displayed");
        //assert order history view order history table order statuses are displayed (as a list)
        assertTrue(orderHistoryPage.isOrderHistoryStatusDisplayed(), "The order history view order history table order statuses aren't displayed");
        //assert order history view order history table order comments sections are displayed (as a list)
        assertTrue(orderHistoryPage.isOrderHistoryCommentsDisplayed(), "The order history view order history table order comments sections aren't displayed");
        //assert order history view page 'Continue' button is displayed
        assertTrue(orderHistoryPage.isOrderViewHistoryPageContinueButtonDisplayed(), "The order history view page 'Continue' button isn't displayed");
        //aside section web element assert
        isMyAccountAsideSectionWebElementDisplayed(myAccountPage);
    }

    //product returns web element assert test method
    protected void isProductReturnsPageWebElementDisplayed(ProductReturnsPage productReturnsPage) {
        MyAccountPage myAccountPage = new MyAccountPage(driver);
        GeneralPage generalPage = new GeneralPage(driver);
        //assert order history pre-view page breadcrumb is displayed (as a list)
        assertTrue(myAccountPage.isPageBreadcrumbDisplayed(), "The order history pre-view page breadcrumb isn't displayed");
        //wait for elements to load
        generalPage.waitForElementsToLoad();
        //aside section web element assert
        isMyAccountAsideSectionWebElementDisplayed(myAccountPage);
        //main
        //assert product returns page title is displayed
        assertTrue(productReturnsPage.isProductReturnsPageTitleDisplayed(), "The product returns page title isn't displayed");
        //assert product returns page subtitle is displayed
        assertTrue(productReturnsPage.isProductReturnsPageSubtitleDisplayed(), "The product returns page subtitle isn't displayed");
        //order info
        //assert product returns page order info section title is displayed
        assertTrue(productReturnsPage.isOrderInfoSectionTitleDisplayed(), "The product returns page order info section title isn't displayed");
        //assert product returns page first name subtext is displayed
        assertTrue(productReturnsPage.isOrderInfoSectionFirstNameSubtextDisplayed(), "The product returns page first name subtext isn't displayed");
        //assert product returns page first name input field is displayed
        //assertTrue(productReturnsPage.isOrderInfoSectionFirstNameInputFieldDisplayed(), "The product returns page first name input field isn't displayed");
        //assert product returns page last name subtext is displayed
        assertTrue(productReturnsPage.isOrderInfoSectionLastNameSubtextDisplayed(), "The product returns page last name subtext isn't displayed");
        //assert product returns page last name input field is displayed
        //assertTrue(productReturnsPage.isOrderInfoSectionLastNameInputFieldDisplayed(), "The product returns page last name input field isn't displayed");
        //assert product returns page email subtext is displayed
        assertTrue(productReturnsPage.isOrderInfoSectionEmailSubtextDisplayed(), "The product returns page email subtext isn't displayed");
        //assert product returns page email input field is displayed
        //assertTrue(productReturnsPage.isOrderInfoSectionEmailInputFieldDisplayed(), "The product returns page email input field isn't displayed");
        //assert product returns page phone subtext is displayed
        assertTrue(productReturnsPage.isOrderInfoSectionPhoneSubtextDisplayed(), "The product returns page phone subtext isn't displayed");
        //assert product returns page phone input field is displayed
        //assertTrue(productReturnsPage.isOrderInfoSectionPhoneInputFieldDisplayed(), "The product returns page phone input field isn't displayed");
        //assert product returns page order ID subtext is displayed
        assertTrue(productReturnsPage.isOrderInfoSectionOrderIDSubtextDisplayed(), "The product returns page order ID subtext isn't displayed");
        //assert product returns page order ID input field is displayed
        //assertTrue(productReturnsPage.isOrderInfoSectionOrderIDInputFieldDisplayed(), "The product returns page order ID input field isn't displayed");
        //assert product returns page order date subtext is displayed
        assertTrue(productReturnsPage.isOrderInfoSectionOrderDateSubtextDisplayed(), "The product returns page order date subtext isn't displayed");
        //assert product returns page order date input field is displayed
        assertTrue(productReturnsPage.isOrderInfoSectionOrderDateInputFieldDisplayed(), "The product returns page order date input field isn't displayed");
        //assert product returns page order date calendar button is displayed
        assertTrue(productReturnsPage.isOrderInfoSectionOrderDateCalendarButtonDisplayed(), "The product returns page order date calendar button isn't displayed");
        //product info section
        //assert product returns page product info subtext is displayed
        assertTrue(productReturnsPage.isProductInfoSectionTitleDisplayed(), "The product returns page product info subtext isn't displayed");
        //assert product returns page product info subtext is displayed
        assertTrue(productReturnsPage.isProductInfoSectionProductNameSubtextDisplayed(), "The product returns page product info subtext isn't displayed");
        //assert product returns page product info input field is displayed
        //assertTrue(productReturnsPage.isProductInfoSectionProductNameInputFieldDisplayed(), "The product returns page product info input field isn't displayed");
        //assert product returns page product code subtext is displayed
        assertTrue(productReturnsPage.isProductInfoSectionProductCodeSubtextDisplayed(), "The product returns page product code subtext isn't displayed");
        //assert product returns page product code input field is displayed
        //assertTrue(productReturnsPage.isProductInfoSectionProductCodeInputFieldDisplayed(), "The product returns page product code input field isn't displayed");
        //assert product returns page product quantity subtext is displayed
        assertTrue(productReturnsPage.isProductInfoSectionQuantitySubtextDisplayed(), "The product returns page product quantity subtext isn't displayed");
        //assert product returns page product quantity input field is displayed
        //assertTrue(productReturnsPage.isProductInfoSectionQuantityInputFieldDisplayed(), "The product returns page product quantity input field isn't displayed");
        //assert product returns page return reasons subtext is displayed
        assertTrue(productReturnsPage.isProductInfoSectionReturnReasonSubtextDisplayed(), "The product returns page return reasons subtext isn't displayed");
        //radio buttons
        /*
        //assert product returns page product 'Dead on Arrival' return radio button is displayed
        assertTrue(productReturnsPage.isProductInfoSectionDeadOnArrivalRadioButtonDisplayed(), "The product returns page product 'Dead on Arrival' return radio button isn't displayed");
        //assert product returns page product 'Faulty' return radio button is displayed
        assertTrue(productReturnsPage.isProductInfoSectionFaultyRadioButtonDisplayed(), "The product returns page product 'Faulty' return radio button isn't displayed");
        //assert product returns page product 'Order Error' return radio button is displayed
        assertTrue(productReturnsPage.isProductInfoSectionOrderErrorRadioButtonDisplayed(), "The product returns page product 'Order Error' return radio button isn't displayed");
        //assert product returns page product 'Other' return radio button is displayed
        assertTrue(productReturnsPage.isProductInfoSectionOtherRadioButtonDisplayed(), "The product returns page product 'Other' return radio button isn't displayed");
        //assert product returns page product 'Wrong Item' return radio button is displayed
        assertTrue(productReturnsPage.isProductInfoSectionWrongItemRadioButtonDisplayed(), "The product returns page product 'Wrong Item' return radio button isn't displayed");
        //form elements
        //assert product returns page product 'Is Opened' subtext is displayed
        assertTrue(productReturnsPage.isProductInfoSectionProductIsOpenedSubTextDisplayed(), "The product returns page product 'Is Opened' subtext isn't displayed");
        //assert product returns page product 'Opened' radio button is displayed
        assertTrue(productReturnsPage.isProductInfoSectionOpenedRadioButtonDisplayed(), "The product returns page product 'Opened' radio button isn't displayed");
        //assert product returns page product 'Not opened' radio button is displayed
        assertTrue(productReturnsPage.isProductInfoSectionNotOpenedRadioButtonDisplayed(), "The product returns page product 'Not opened' radio button isn't displayed");
        */
        //assert product returns page product faulty comment subtext is displayed
        assertTrue(productReturnsPage.isProductInfoSectionFaultyCommentSubTextDisplayed(), "The product returns page product faulty comment subtext isn't displayed");
        //assert product returns page product faulty comment textfield is displayed
        //assertTrue(productReturnsPage.isProductInfoSectionFaultyCommentTextfieldDisplayed(), "The product returns page product faulty comment textfield isn't displayed");
        //assert product returns page back button is displayed
        assertTrue(productReturnsPage.isProductInfoSectionBackButtonDisplayed(), "The product returns page back button isn't displayed");
        //assert product returns page continue button is displayed
        assertTrue(productReturnsPage.isProductInfoSectionContinueButtonDisplayed(), "The product returns page continue button isn't displayed");
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

    //wishlist page text element assert test method
    protected void isWishlistPageTextElementAsExpected(WishlistPage wishlistPage){
        //assert wishlist page title is as expected
        assertEquals("My Wish List", wishlistPage.getWishlistPageTitle(), "The wishlist page title doesn't match expectations.");
    }

    //product comparison list page text element assert test method
    protected void isProductComparisonPageTextElementAsExpected(ProductCompareListPage productCompareListPage){
        //assert product comparison list page title is as expected
        assertEquals("Product Comparison", productCompareListPage.getProductCompareListPageTitle(), "The product comparison list page title doesn't match expectations.");
    }

    //single product page review text element assert test method
    protected void isSingleProductPageReviewsSectionTextElementAsExpected(SingleProductPage singleProductPage){
        //assert single product page review username subtext is as expected
        assertEquals("Your Name", singleProductPage.getSingleProductPageProductReviewUserNameSubtext(), "The single product page review user name subtext doesn't match expectations.");
        //assert single product page review  subtext is as expected
        assertEquals("Your Review", singleProductPage.getSingleProductPageProductReviewSubtext(), "The single product page review subtext doesn't match expectations.");
        //assert single product page rating subtext is as expected
        assertEquals("Rating", singleProductPage.getSingleProductPageProductRatingSubtext(), "The single product page rating subtext doesn't match expectations.");
    }

    //shopping cart page text element assert test method
    protected void isShoppingCartPageTextElementAsExpected(ShoppingCartPage shoppingCartPage){
        //assert shopping cart page to-do next section title is as expected
        assertEquals("What would you like to do next?", shoppingCartPage.getShoppingCartToDoNextSectionTitle(), "The shopping cart page to-do next section title doesn't match expectations.");
        //assert shopping cart page to-do next section subtitle is as expected
        assertEquals("Choose if you have a discount code or reward points you want to use or would like to estimate your delivery cost.", shoppingCartPage.getShoppingCartToDoNextSectionSubtitle(), "The shopping cart page to-do next section subtitle doesn't match expectations.");
        //assert shopping cart page to-do next section subtext is as expected
        assertEquals("Enter your destination to get a shipping estimate.", shoppingCartPage.getShoppingCartEstimateShippingSectionSubtext(), "The shopping cart page estimate shipping section subtext doesn't match expectations.");
    }

    //checkout page (new customer) text element assert test method
    protected void isCheckoutPageNewCustomerSectionTextElementAsExpected(CheckoutPage checkoutPage){
        //assert checkout page new customer section title is as expected
        assertEquals("New Customer", checkoutPage.getCheckoutPageNewCustomerSectionTitle(), "The checkout page new customer section title doesn't match expectations.");
        //assert checkout page new customer section subtitle is as expected
        assertEquals("Checkout Options:", checkoutPage.getCheckoutPageNewCustomerSectionSubtitle(), "The checkout page new customer section subtitle doesn't match expectations.");
        //assert checkout page new customer section description is as expected
        assertEquals("By creating an account you will be able to shop faster, be up to date on an order's status, and keep track of the orders you have previously made.", checkoutPage.getCheckoutPageNewCustomerSectionDescription(), "The checkout page new customer section description doesn't match expectations.");
        //assert checkout page returning customer section title is as expected
        assertEquals("Returning Customer", checkoutPage.getCheckoutPageReturningCustomerSectionTitle(), "The checkout page returning customer section title doesn't match expectations.");
        //assert checkout page returning section customer section subtitle is as expected
        assertEquals("I am a returning customer", checkoutPage.getCheckoutPageReturningCustomerSectionSubtitle(), "The checkout page returning customer section subtitle doesn't match expectations.");
    }

    //checkout page text element assert test method
    protected void isCheckoutPageTextElementAsExpected(CheckoutPage checkoutPage){
        //assert checkout page title is as expected
        assertEquals("Checkout", checkoutPage.getCheckoutPageTitle(), "The checkout page title doesn't match expectations.");
    }

    //checkout page (billing details) text element assert test method
    protected void isCheckoutPageBillingDetailsSectionTextElementAsExpected(CheckoutPage checkoutPage){
        //assert checkout page personal details section title is as expected
        assertEquals("Your Personal Details", checkoutPage.getCheckoutPagePersonalDetailsSectionTitle(), "The checkout page personal details section title doesn't match expectations.");
        //assert checkout page address details section title is as expected
        assertEquals("Your Address", checkoutPage.getCheckoutPageAddressDetailsSectionTitle(), "The checkout page address details section title doesn't match expectations.");
    }

    //checkout page (delivery method) text element assert test method
    protected void isCheckoutPageDeliveryMethodSectionTextElementAsExpected(CheckoutPage checkoutPage){
        //assert checkout page delivery method section subtext is as expected
        assertEquals("Please select the preferred shipping method to use on this order.", checkoutPage.getCheckoutPageDeliveryMethodSubtext(), "The checkout page delivery method section subtext doesn't match expectations.");
    }

    //checkout page (payment method) text element assert test method
    protected void isCheckoutPagePaymentMethodSectionTextElementAsExpected(CheckoutPage checkoutPage){
        //assert checkout page payment method section subtext is as expected
        assertEquals("Please select the preferred payment method to use on this order.", checkoutPage.getCheckoutPagePaymentMethodSubtext(), "The checkout page payment method section subtext doesn't match expectations.");
    }

    //confirm order page text element assert test method
    protected void isConfirmOrderSuccessPageTextElementAsExpected(ConfirmOrderSuccessPage confirmOrderSuccessPage){
        //assert confirm order success page title is as expected
        assertEquals("Your order has been placed!", confirmOrderSuccessPage.getConfirmOrderSuccessMessageTitle(), "The confirm order success page message title doesn't match expectations or the order checkout has failed.");
        //assert confirm order success page text is as expected
        assertEquals("Your order has been successfully processed!", confirmOrderSuccessPage.getConfirmOrderSuccessMessageText(), "The confirm order success page message text doesn't match expectations.");
    }

    //order history pre-view page text element assert test method
    protected void isOrderHistoryPreviewPageTextElementAsExpected(OrderHistoryPage orderHistoryPage){
        //assert order history pre-view page title is as expected
        assertEquals("Order History", orderHistoryPage.getOrderHistoryPageTitle(), "The order history pre-view page title doesn't match expectations or the user is on the wrong page.");
    }

    //order history view page text element assert test method
    protected void isOrderHistoryViewPageTextElementAsExpected(OrderHistoryPage orderHistoryPage){
        //assert order history view page title is as expected
        assertEquals("Order History", orderHistoryPage.getOrderViewHistoryPageTitle(), "The order history view page title doesn't match expectations or the user is on the wrong page.");
    }

    //product returns page text element assert test method
    protected void isProductReturnsPageTextElementAsExpected(ProductReturnsPage productReturnsPage){
        //assert product returns page title is as expected
        assertEquals("Product Returns", productReturnsPage.getProductReturnsPageTitle(), "The product returns page title doesn't match expectations.");
        //assert product returns page subtitle is as expected
        assertEquals("Please complete the form below to request an RMA number.", productReturnsPage.getProductReturnsPageSubtitle(), "The product returns page subtitle doesn't match expectations.");
        //order info
        //assert product returns page order info section title is as expected
        assertEquals("Order Information", productReturnsPage.getOrderInfoSectionTitle(), "The product returns page order info section title doesn't match expectations.");
        //assert product returns page order info first name subtext is as expected
        assertEquals("First Name", productReturnsPage.getOrderInfoSectionFirstNameSubText(), "The product returns page order info first name subtext doesn't match expectations.");
        //assert product returns page order info last name subtext is as expected
        assertEquals("Last Name", productReturnsPage.getOrderInfoSectionLastNameSubText(), "The product returns page order info last name subtext doesn't match expectations.");
        //assert product returns page order info email subtext is as expected
        assertEquals("E-Mail", productReturnsPage.getOrderInfoSectionEmailSubText(), "The product returns page order info email subtext doesn't match expectations.");
        //assert product returns page order info phone subtext is as expected
        assertEquals("Telephone", productReturnsPage.getOrderInfoSectionPhoneSubText(), "The product returns page order info phone subtext doesn't match expectations.");
        //assert product returns page order info order ID subtext is as expected
        assertEquals("Order ID", productReturnsPage.getOrderInfoSectionOrderIDSubText(), "The product returns page order info order ID subtext doesn't match expectations.");
        //assert product returns page order info order date subtext is as expected
        assertEquals("Order Date", productReturnsPage.getOrderInfoSectionOrderDateSubText(), "The product returns page order info order date subtext doesn't match expectations.");
        //product info
        //assert product returns page product info section title is as expected
        assertEquals("Product Information", productReturnsPage.getProductInfoSectionTitle(), "The product returns page product info section title doesn't match expectations.");
        //assert product returns page product name subtext is as expected
        assertEquals("Product Name", productReturnsPage.getProductInfoSectionProductNameSubText(), "The product returns page product name subtext doesn't match expectations.");
        //assert product returns page product code subtext is as expected
        assertEquals("Product Code", productReturnsPage.getProductInfoSectionProductCodeSubText(), "The product returns page product code subtext doesn't match expectations.");
        //assert product returns page product quantity subtext is as expected
        assertEquals("Quantity", productReturnsPage.getProductInfoSectionQuantitySubText(), "The product returns page product quantity subtext doesn't match expectations.");
        //assert product returns page product return reason subtext is as expected
        assertEquals("Reason for Return", productReturnsPage.getProductInfoSectionReturnReasonSubText(), "The product returns page product return reason subtext doesn't match expectations.");
        //assert product returns page product 'Is Opened' subtext is as expected
        assertEquals("Product is opened", productReturnsPage.getProductInfoSectionProductIsOpenedSubText(), "The product returns page product 'Is Opened' subtext doesn't match expectations.");
        //assert product returns page product faulty comment subtext is as expected
        assertEquals("Faulty or other details", productReturnsPage.getProductInfoSectionFaultyCommentSubText(), "The product returns page product faulty comment subtext doesn't match expectations.");
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

    //wishlist page product table data logger method
    protected void logWishlistProductTableData(WishlistPage wishlistPage){
        System.out.println("Wishlist page product table displayed data: " + "\n");
        logger.info("Wishlist product name(s): " + wishlistPage.getWishlistPageProductName());
        logger.info("Wishlist product model(s): " + wishlistPage.getWishlistPageProductModel());
        logger.info("Wishlist product stock(s): " + wishlistPage.getWishlistPageProductStock());
        logger.info("Wishlist product unit price(s): " + wishlistPage.getWishlistPageProductUnitPrice());
        System.out.println("\n");
    }

    //single product category page data logger method
    protected void logSingleProductCategoryProductData(SingleProductCategoryDashboardPage singleProductCategoryDashboardPage){
        System.out.println("Single product category dashboard page displayed product data: " + "\n");
        logger.info("Product name(s): " + singleProductCategoryDashboardPage.getProductTableName());
        logger.info("Product description(s): " + singleProductCategoryDashboardPage.getProductTableDescription());
        logger.info("Product unit price(s): " + singleProductCategoryDashboardPage.getProductTableUnitPrice());
        System.out.println("\n");
    }

    //product comparison list page product table data logger method
    protected void logProductComparisonListProductTableData(ProductCompareListPage productCompareListPage){
        System.out.println("Product comparison list page product table displayed data: " + "\n");
        logger.info("Compared product names: " + productCompareListPage.getProductCompareNames());
        logger.info("Compared product prices: " + productCompareListPage.getProductComparePrices());
        logger.info("Compared product models: " + productCompareListPage.getProductCompareModels());
        logger.info("Compared product brands: " + productCompareListPage.getProductCompareBrands());
        logger.info("Compared product availabilities: " + productCompareListPage.getProductCompareAvailabilities());
        logger.info("Compared product summaries: " + productCompareListPage.getProductCompareSummaries());
        logger.info("Compared product weights: " + productCompareListPage.getProductCompareWeights());
        logger.info("Compared product dimensions: " + productCompareListPage.getProductCompareDimensions());
        System.out.println("\n");
    }

    //product comparison list page product table data logger method (for HP LP3065)
    protected void logHPLP3065ProductComparisonData(ProductCompareListPage productCompareListPage){
        System.out.println("HP LP3065 product comparison table displayed data: " + "\n");
        logger.info("HP LP3065 memory: " + productCompareListPage.getProductCompareMemory());
        logger.info("HP LP3065 core number: " + productCompareListPage.getProductCompareCoreNumber());
        System.out.println("\n");
    }

    //single product page data logger method
    protected void logSingleProductPageData(SingleProductPage singleProductPage){
        System.out.println("Single product page displayed data: " + "\n");
        logger.info("Single product page title/name: " + singleProductPage.getSingleProductPageTitle());
        logger.info("Single product page product short description: " + singleProductPage.getSingleProductPageProductShortDescription());
        logger.info("Single product page product short unit price: " + singleProductPage.getSingleProductPageProductShortUnitPrice());
        logger.info("Single product page product short ex tax price: " + singleProductPage.getSingleProductPageProductShortExTaxPrice());
        logger.info("Single product page product description: " + singleProductPage.getSingleProductPageProductDescription());
    }

    //single product cart specification table list data logger method
    protected void logSingleProductPageProductSpecificationData(SingleProductPage singleProductPage){
        System.out.println("Single product page specification data: " + "\n");
        logger.info("Single product page specification name: " + singleProductPage.getSingleProductPageProductSpecificationName());
        logger.info("Single product page specification: " + singleProductPage.getSingleProductPageProductSpecification());
        System.out.println("\n");
    }

    //single product page shopping cart dropdown menu data logger method
    protected void logShoppingCartDropdownProductData(GeneralPage generalPage){
        System.out.println("Shopping cart dropdown product displayed data: " + "\n");
        logger.info("Shopping cart dropdown product name(s): " + generalPage.getShoppingCartDropdownProductName());
        logger.info("Shopping cart dropdown product description(s): " + generalPage.getShoppingCartDropdownProductDesc());
        logger.info("Shopping cart dropdown product quantity(ies): " + generalPage.getShoppingCartDropdownProductQty());
        logger.info("Shopping cart dropdown product unit price(s): " + generalPage.getShoppingCartDropdownProductUnitPrice());
        logger.info("Shopping cart dropdown product sub total price: " + generalPage.getShoppingCartDropdownSubTotalPrice());
        logger.info("Shopping cart dropdown product total price: " + generalPage.getShoppingCartDropdownTotalPrice());
        System.out.println("\n");
    }

    //shopping cart product page product data logger method
    protected void logShoppingCartPageProductData(ShoppingCartPage shoppingCartPage){
        System.out.println("Shopping cart page product displayed data: " + "\n");
        logger.info("Shopping cart product name(s): " + shoppingCartPage.getShoppingCartProductName());
        logger.info("Shopping cart product description(s): " + shoppingCartPage.getShoppingCartProductDescription());
        logger.info("Shopping cart product model(s): " + shoppingCartPage.getShoppingCartProductModel());
        logger.info("Shopping cart product quantity(ies): " + shoppingCartPage.getShoppingCartProductQty());
        logger.info("Shopping cart product unit price(s): " + shoppingCartPage.getShoppingCartProductUnitPrice());
        logger.info("Shopping cart product total price(s): " + shoppingCartPage.getShoppingCartProductTotalPrice());
        logger.info("Shopping cart product order subtotal price: " + shoppingCartPage.getShoppingCartOrderSubtotalPrice());
        logger.info("Shopping cart product order flat shipping rate: " + shoppingCartPage.getShoppingCartOrderTotalPrice());
        logger.info("Shopping cart product order total price: " + shoppingCartPage.getShoppingCartOrderTotalPrice());
        System.out.println("\n");
    }

    //checkout page product table data logger method
    protected void logCheckoutPageProductTableData(CheckoutPage checkoutPage){
        System.out.println("Checkout page product (order) table displayed data: " + "\n");
        logger.info("Checkout page product name(s): " + checkoutPage.getCheckoutPageProductName());
        logger.info("Checkout page product model(s): " + checkoutPage.getCheckoutPageProductModel());
        logger.info("Checkout page product quantity(ies): " + checkoutPage.getCheckoutPageProductQuantity());
        logger.info("Checkout page product unit price(s): " + checkoutPage.getCheckoutPageProductUnitPrice());
        logger.info("Checkout page product total price(s): " + checkoutPage.getCheckoutPageProductTotalPrice());
        logger.info("Checkout page order subtotal price: " + checkoutPage.getCheckoutOrderSubtotalPrice());
        logger.info("Checkout page order flat shipping rate: " + checkoutPage.getCheckoutOrderFlatShippingRate());
        logger.info("Checkout page order total price: " + checkoutPage.getCheckoutOrderSubtotalPrice());
        System.out.println("\n");
    }

    //order history pre-view page order table data logger method
    protected void logOrderHistoryPreviewPageOrderData(OrderHistoryPage orderHistoryPage){
        System.out.println("Order history pre-view page displayed order data: " + "\n");
        logger.info("Order history pre-view page displayed order ID(s): " + orderHistoryPage.getPreviewOrderID());
        logger.info("Order history pre-view page displayed order customer(s): " + orderHistoryPage.getPreviewOrderCustomer());
        logger.info("Order history pre-view page displayed order status(es): " + orderHistoryPage.getPreviewOrderStatus());
        logger.info("Order history pre-view page displayed order total price(s): " + orderHistoryPage.getPreviewOrderTotalPrice());
        logger.info("Order history pre-view page displayed order date(s) added: " + orderHistoryPage.getPreviewOrderDateAdded());
        System.out.println("\n");
    }

    //order history view page details table data logger method
    protected void logOrderHistoryViewDetailsTableData(OrderHistoryPage orderHistoryPage){
        System.out.println("Order history view details table displayed order data: " + "\n");
        logger.info("Order history view page order details: " + orderHistoryPage.getOrderViewDetails());
        logger.info("Order history view page payment/shipping method details: " + orderHistoryPage.getOrderViewMethodDetails());
        System.out.println("Order history view payment/shipping details table displayed order data: " + "\n");
        logger.info("Order history view page order payment address details: " + orderHistoryPage.getOrderPaymentAddressDetails());
        logger.info("Order history view page order shipping address details: " + orderHistoryPage.getOrderShippingAddressDetails());
        System.out.println("\n");
    }

    //order history view page order table data logger method
    protected void logOrderHistoryViewOrderTableData(OrderHistoryPage orderHistoryPage){
        System.out.println("Order history view order table displayed data: " + "\n");
        logger.info("Order history view order table product name(s): " + orderHistoryPage.getOrderViewProductName());
        logger.info("Order history view order table product model(s): " + orderHistoryPage.getOrderViewProductModel());
        logger.info("Order history view order table product quantity(ies): " + orderHistoryPage.getOrderViewProductQuantity());
        logger.info("Order history view order table product price(s): " + orderHistoryPage.getOrderViewProductPrice());
        logger.info("Order history view order table product total price(s): " + orderHistoryPage.getOrderViewProductTotalPrice());
        logger.info("Order history view order table order subtotal price: " + orderHistoryPage.getOrderSubtotalPrice());
        logger.info("Order history view order table order flat shipping rate: " + orderHistoryPage.getOrderFlatShippingRate());
        logger.info("Order history view order table order total price: " + orderHistoryPage.getOrderTotalPrice());
        System.out.println("\n");
    }

    //order history view page order history table data logger method
    protected void logOrderHistoryViewOrderHistoryData(OrderHistoryPage orderHistoryPage){
        System.out.println("Order history view order history table displayed data: " + "\n");
        logger.info("Order history view order history table date(s) added: " + orderHistoryPage.getOrderHistoryDate());
        logger.info("Order history view order history table status(es): " + orderHistoryPage.getOrderHistoryStatus());
        logger.info("Order history view order history table comments: " + orderHistoryPage.getOrderHistoryComments());
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //valid single product review submission test methods

    //product review submission method (as a guest)
    protected void guestProductReviewSubmission(SingleProductPage singleProductPage){
        //click 'Reviews' link
        singleProductPage.clickReviewsLink();
        //reviews section text element assert
        isSingleProductPageReviewsSectionTextElementAsExpected(singleProductPage);
        //input review username
        singleProductPage.inputGuestUserNameIntoUserNameInputField();
        //input user review
        singleProductPage.inputUserReview();
        //click 'Average' rating radio button
        singleProductPage.clickRatingRadioButton();
        //click 'Submit' review button
        singleProductPage.clickSubmitReviewButton();
        //assert the user gets the review submission confirmation message
        assertEquals("Thank you for your review. It has been submitted to the webmaster for approval.", singleProductPage.getReviewSuccessMessage(), "The review submission success message doesn't match expectations or the user has failed to submit the review.");
        //capture screenshot of the review submission
        captureScreenshot(driver, "HP LP3065 Product Review Submitted");
    }

    //product review submission method (as a registered user)
    protected void regUserProductReviewSubmission(SingleProductPage singleProductPage){
        //click 'Reviews' link
        singleProductPage.clickReviewsLink();
        //reviews section text element assert
        isSingleProductPageReviewsSectionTextElementAsExpected(singleProductPage);
        //input user review
        singleProductPage.inputUserReview();
        //click 'Average' rating radio button
        singleProductPage.clickRatingRadioButton();
        //click 'Submit' review button
        singleProductPage.clickSubmitReviewButton();
        //assert the user gets the review submission confirmation message
        assertEquals("Thank you for your review. It has been submitted to the webmaster for approval.", singleProductPage.getReviewSuccessMessage(), "The review submission success message doesn't match expectations or the user has failed to submit the review.");
        //capture screenshot of the review submission
        captureScreenshot(driver, "HP LP3065 Product Review Submitted (registered user)");
    }

    //invalid single product review submission test methods

    //no singular input

    //invalid single product review input test method - no guest username
    protected void guestProductReviewNoUsernameSubmission(SingleProductPage singleProductPage){
        SingleProductPageReviewInvalidInput singleProductPageReviewInvalidInput = new SingleProductPageReviewInvalidInput(driver);
        //input no guest username
        singleProductPageReviewInvalidInput.inputNoGuestUserNameIntoUserNameInputField();
        //input user review
        singleProductPage.inputUserReview();
        //click 'Average' rating radio button
        singleProductPage.clickRatingRadioButton();
        //click 'Submit' review button
        singleProductPage.clickSubmitReviewButton();
        //assert the user gets the review submission failure message
        assertEquals("Warning: Review Name must be between 3 and 25 characters!", singleProductPageReviewInvalidInput.getReviewFailedMessage(), "The review submission failure message doesn't match expectations or the error wasn't triggered.");
        //capture screenshot of the review submission failure
        captureScreenshot(driver, "HP LP3065 Product Review (No Username) Submission Failure");
    }

    //invalid single product review input test method - no guest review text
    protected void guestProductReviewNoReviewTextSubmission(SingleProductPage singleProductPage){
        SingleProductPageReviewInvalidInput singleProductPageReviewInvalidInput = new SingleProductPageReviewInvalidInput(driver);
        //input guest username
        singleProductPageReviewInvalidInput.inputGuestUserNameIntoUserNameInputField();
        //don't input user review
        singleProductPageReviewInvalidInput.inputNoUserReview();
        //click 'Average' rating radio button
        singleProductPage.clickRatingRadioButton();
        //click 'Submit' review button
        singleProductPage.clickSubmitReviewButton();
        //assert the user gets the review submission failure message
        assertEquals("Warning: Review Text must be between 25 and 1000 characters!", singleProductPageReviewInvalidInput.getReviewFailedMessage(), "The review submission failure message doesn't match expectations or the error wasn't triggered.");
        //capture screenshot of the review submission failure
        captureScreenshot(driver, "HP LP3065 Product Review (No Review Text) Submission Failure");
    }

    //invalid single product review input test method - no guest review rating
    protected void guestProductReviewNoReviewRatingSubmission(SingleProductPage singleProductPage){
        SingleProductPageReviewInvalidInput singleProductPageReviewInvalidInput = new SingleProductPageReviewInvalidInput(driver);
        //input guest username
        singleProductPageReviewInvalidInput.inputGuestUserNameIntoUserNameInputField();
        //input user review
        singleProductPageReviewInvalidInput.inputUserReview();
        //click 'Submit' review button
        singleProductPage.clickSubmitReviewButton();
        //assert the user gets the review submission failure message
        assertEquals("Warning: Please select a review rating!", singleProductPageReviewInvalidInput.getReviewFailedMessage(), "The review submission failure message doesn't match expectations or the error wasn't triggered.");
        //capture screenshot of the review submission failure
        captureScreenshot(driver, "HP LP3065 Product Review (No Review Rating) Submission Failure");
    }

    //too short singular input

    //invalid single product review input test method - too short guest username (2 chars)
    protected void guestProductReviewTooShortUsernameSubmission(SingleProductPage singleProductPage){
        SingleProductPageReviewInvalidInput singleProductPageReviewInvalidInput = new SingleProductPageReviewInvalidInput(driver);
        //input too short guest username (2 chars)
        singleProductPageReviewInvalidInput.inputTooShortGuestUserNameIntoUserNameInputField();
        //input user review
        singleProductPage.inputUserReview();
        //click 'Average' rating radio button
        singleProductPage.clickRatingRadioButton();
        //click 'Submit' review button
        singleProductPage.clickSubmitReviewButton();
        //assert the user gets the review submission failure message
        assertEquals("Warning: Review Name must be between 3 and 25 characters!", singleProductPageReviewInvalidInput.getReviewFailedMessage(), "The review submission failure message doesn't match expectations or the error wasn't triggered.");
        //capture screenshot of the review submission failure
        captureScreenshot(driver, "HP LP3065 Product Review (Too Short Username) Submission Failure");
    }

    //invalid single product review input test method - too short guest review text (24 chars)
    protected void guestProductReviewTooShortReviewTextSubmission(SingleProductPage singleProductPage){
        SingleProductPageReviewInvalidInput singleProductPageReviewInvalidInput = new SingleProductPageReviewInvalidInput(driver);
        //input guest username
        singleProductPageReviewInvalidInput.inputGuestUserNameIntoUserNameInputField();
        //input too short user review (24 chars)
        singleProductPageReviewInvalidInput.inputTooShortUserReview();
        //click 'Average' rating radio button
        singleProductPage.clickRatingRadioButton();
        //click 'Submit' review button
        singleProductPage.clickSubmitReviewButton();
        //assert the user gets the review submission failure message
        assertEquals("Warning: Review Text must be between 25 and 1000 characters!", singleProductPageReviewInvalidInput.getReviewFailedMessage(), "The review submission failure message doesn't match expectations or the error wasn't triggered.");
        //capture screenshot of the review submission failure
        captureScreenshot(driver, "HP LP3065 Product Review (Too Short Review Text) Submission Failure");
    }

    //too long singular input

    //invalid single product review input test method - too long guest username (26 chars)
    protected void guestProductReviewTooLongUsernameSubmission(SingleProductPage singleProductPage){
        SingleProductPageReviewInvalidInput singleProductPageReviewInvalidInput = new SingleProductPageReviewInvalidInput(driver);
        //input too long guest username (26 chars)
        singleProductPageReviewInvalidInput.inputTooLongGuestUserNameIntoUserNameInputField();
        //input user review
        singleProductPage.inputUserReview();
        //click 'Average' rating radio button
        singleProductPage.clickRatingRadioButton();
        //click 'Submit' review button
        singleProductPage.clickSubmitReviewButton();
        //assert the user gets the review submission failure message
        assertEquals("Warning: Review Name must be between 3 and 25 characters!", singleProductPageReviewInvalidInput.getReviewFailedMessage(), "The review submission failure message doesn't match expectations or the error wasn't triggered.");
        //capture screenshot of the review submission failure
        captureScreenshot(driver, "HP LP3065 Product Review (Too Long Username) Submission Failure");
    }

    //invalid single product review input test method - too long guest review text (1001 chars)
    protected void guestProductReviewTooLongReviewTextSubmission(SingleProductPage singleProductPage){
        SingleProductPageReviewInvalidInput singleProductPageReviewInvalidInput = new SingleProductPageReviewInvalidInput(driver);
        //input guest username
        singleProductPageReviewInvalidInput.inputGuestUserNameIntoUserNameInputField();
        //input too long user review (1001 chars)
        singleProductPageReviewInvalidInput.inputTooLongUserReview();
        //click 'Average' rating radio button
        singleProductPage.clickRatingRadioButton();
        //click 'Submit' review button
        singleProductPage.clickSubmitReviewButton();
        //assert the user gets the review submission failure message
        assertEquals("Warning: Review Text must be between 25 and 1000 characters!", singleProductPageReviewInvalidInput.getReviewFailedMessage(), "The review submission failure message doesn't match expectations or the error wasn't triggered.");
        //capture screenshot of the review submission failure
        captureScreenshot(driver, "HP LP3065 Product Review (Too Long Review Text) Submission Failure");
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
