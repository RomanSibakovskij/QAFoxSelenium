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
        //assert the user gets the expected account creation success message elements (these are general 'My Account' page elements - their content is different on each page)
        assertEquals("Your Account Has Been Created!", myAccountPage.getSuccessMessageTitle(), "The account creation success message title doesn't match expectations or the user account creation has failed.");
        assertEquals("Congratulations! Your new account has been successfully created!", myAccountPage.successMessageOne(), "The account creation success message part one doesn't match expectations or the user account creation has failed.");
        assertEquals("You can now take advantage of member privileges to enhance your online shopping experience with us.", myAccountPage.getSuccessMessageTwo(), "The account creation success message part two doesn't match expectations or the user account creation has failed.");
        assertEquals("If you have ANY questions about the operation of this online shop, please e-mail the store owner.", myAccountPage.getSuccessMessageThree(), "The account creation success message part three doesn't match expectations or the user account creation has failed.");
        assertEquals("A confirmation has been sent to the provided e-mail address. If you have not received it within the hour, please contact us.", myAccountPage.getSuccessMessageFour(), "The account creation success message part four doesn't match expectations or the user account creation has failed.");
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
        //invalid register data getter - invalid last name input format (missing '@')
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

    //valid user login test
    protected void validUserLoginTest(RegisterPage registerPage) {
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
        //capture screenshot of the page before valid user login data input
        captureScreenshot(driver, "Register and Login Dashboard Page Display Before Valid User Login Data Input");
        //register/login dashboard page web element assert
        isRegisterLoginDashboardPageWebElementDisplayed(registerLoginDashboardPage);
        //register/login dashboard page text element assert
        isRegisterLoginDashboardPageTextElementAsExpected(registerLoginDashboardPage);
        //valid user login data getter
        registerLoginDashboardPage.validUserLoginDataGetter(registerPage);
        //input valid user login email into email input field
        registerLoginDashboardPage.inputValidUserLoginEmailIntoEmailInputField(registerPage);
        //input valid user login password into password input field
        registerLoginDashboardPage.inputValidUserLoginPasswordIntoPasswordInputField(registerPage);
        //capture screenshot of the valid user login data input
        captureScreenshot(driver, "Register and Login Dashboard Page Valid User Login Data Input");
        //click 'Login' button
        registerLoginDashboardPage.clickLoginButton();
        //capture screenshot of the test data result
        captureScreenshot(driver, "Valid User Login Test Result");
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

    //address book entries page text element assert test method
    protected void isAddressBookEntriesPageTextElementAsExpected(AddressBookEntriesPage addressBookEntriesPage){
        //assert address book entries page title is as expected
        assertEquals("Address Book Entries", addressBookEntriesPage.getAddressBookEntriesPageTitle(), "The address book entries page title doesn't match expectations.");
    }

    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

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
