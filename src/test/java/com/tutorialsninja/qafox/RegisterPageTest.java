package com.tutorialsninja.qafox;

import com.tutorialsninja.qafox.utilities.RegisterPageNoSingularInput;
import com.tutorialsninja.qafox.utilities.TestMethods;
import org.junit.jupiter.api.*;

public class RegisterPageTest extends TestMethods {

    //Test 002 -> valid user account creation test
    @Test
    @DisplayName("Valid User Account Creation Test")
    @Tag("Valid_User_Account_Creation")
    void validAccountCreationTest(){
        RegisterPage registerPage = new RegisterPage(driver);
        //user navigation to 'Register' page test
        userNavigationToRegisterPageTest();
        //valid user account creation
        validUserAccountCreationTest(registerPage);
    }

    //invalid user account creation tests

    //no singular input

    //Test 002a -> invalid user account creation test - no user first name
    @Test
    @DisplayName("Invalid User Account Creation Test - No First Name")
    @Tag("Invalid_User_Account_Creation")
    @Tag("No_Singular_Input")
    void invalidAccCreationNoFirstNameTest(){
        RegisterPageNoSingularInput registerPageNoSingularInput = new RegisterPageNoSingularInput(driver);
        //user navigation to 'Register' page test
        userNavigationToRegisterPageTest();
        //invalid user account creation - no user first name
        invalidAccountCreationNoFirstNameTest(registerPageNoSingularInput);
    }

    //Test 002b -> invalid user account creation test - no user last name
    @Test
    @DisplayName("Invalid User Account Creation Test - No Last Name")
    @Tag("Invalid_User_Account_Creation")
    @Tag("No_Singular_Input")
    void invalidAccCreationNoLastNameTest(){
        RegisterPageNoSingularInput registerPageNoSingularInput = new RegisterPageNoSingularInput(driver);
        //user navigation to 'Register' page test
        userNavigationToRegisterPageTest();
        //invalid user account creation - no user last name
        invalidAccountCreationNoLastNameTest(registerPageNoSingularInput);
    }

    //Test 002c -> invalid user account creation test - no user email address
    @Test
    @DisplayName("Invalid User Account Creation Test - No Email")
    @Tag("Invalid_User_Account_Creation")
    @Tag("No_Singular_Input")
    void invalidAccCreationNoEmailTest(){
        RegisterPageNoSingularInput registerPageNoSingularInput = new RegisterPageNoSingularInput(driver);
        //user navigation to 'Register' page test
        userNavigationToRegisterPageTest();
        //invalid user account creation - no user email address
        invalidAccountCreationNoEmailTest(registerPageNoSingularInput);
    }

    //Test 002d -> invalid user account creation test - no user phone number
    @Test
    @DisplayName("Invalid User Account Creation Test - No Phone")
    @Tag("Invalid_User_Account_Creation")
    @Tag("No_Singular_Input")
    void invalidAccCreationNoPhoneTest(){
        RegisterPageNoSingularInput registerPageNoSingularInput = new RegisterPageNoSingularInput(driver);
        //user navigation to 'Register' page test
        userNavigationToRegisterPageTest();
        //invalid user account creation - no user phone
        invalidAccountCreationNoPhoneTest(registerPageNoSingularInput);
    }

    //Test 002e -> invalid user account creation test - no user password
    @Test
    @DisplayName("Invalid User Account Creation Test - No Password")
    @Tag("Invalid_User_Account_Creation")
    @Tag("No_Singular_Input")
    void invalidAccCreationNoPasswordTest(){
        RegisterPageNoSingularInput registerPageNoSingularInput = new RegisterPageNoSingularInput(driver);
        //user navigation to 'Register' page test
        userNavigationToRegisterPageTest();
        //invalid user account creation - no user password
        invalidAccountCreationNoPasswordTest(registerPageNoSingularInput);
    }

    //Test 002f -> invalid user account creation test - no user confirm password (the output will be the same as mismatching passwords)
    @Test
    @DisplayName("Invalid User Account Creation Test - No Confirm Password")
    @Tag("Invalid_User_Account_Creation")
    @Tag("No_Singular_Input")
    void invalidAccCreationNoConfirmPasswordTest(){
        RegisterPageNoSingularInput registerPageNoSingularInput = new RegisterPageNoSingularInput(driver);
        //user navigation to 'Register' page test
        userNavigationToRegisterPageTest();
        //invalid user account creation - no user confirm password
        invalidAccountCreationNoConfirmPasswordTest(registerPageNoSingularInput);
    }

}
