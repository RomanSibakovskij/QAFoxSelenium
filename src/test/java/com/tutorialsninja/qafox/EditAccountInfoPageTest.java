package com.tutorialsninja.qafox;

import com.tutorialsninja.qafox.utilities.*;
import org.junit.jupiter.api.*;

public class EditAccountInfoPageTest extends TestMethods{

    //valid user account information edit tests

    //Test 005 -> valid user first name edit test
    @Test
    @DisplayName("Valid User First Name Edit Test")
    @Tag("Valid_User_Account_Information_Edit")
    void validAccountFirstNameEditTest(){
        RegisterPage registerPage = new RegisterPage(driver);
        //user navigation to 'Register' page test
        userNavigationToRegisterPageTest();
        //valid user account creation
        validUserAccountCreationTest(registerPage);
        //valid user account information first name edit test
        validEditFirstNameTest();
    }

    //Test 005a -> valid user last name edit test
    @Test
    @DisplayName("Valid User Last Name Edit Test")
    @Tag("Valid_User_Account_Information_Edit")
    void validAccountLastNameEditTest(){
        RegisterPage registerPage = new RegisterPage(driver);
        //user navigation to 'Register' page test
        userNavigationToRegisterPageTest();
        //valid user account creation
        validUserAccountCreationTest(registerPage);
        //valid user account information last name edit test
        validEditLastNameTest();
    }

    //Test 005b -> valid user email edit test
    @Test
    @DisplayName("Valid User Email Edit Test")
    @Tag("Valid_User_Account_Information_Edit")
    void validAccountEmailEditTest(){
        RegisterPage registerPage = new RegisterPage(driver);
        //user navigation to 'Register' page test
        userNavigationToRegisterPageTest();
        //valid user account creation
        validUserAccountCreationTest(registerPage);
        //valid user account information email edit test
        validEditEmailTest();
    }

    //Test 005c -> valid user phone edit test
    @Test
    @DisplayName("Valid User Phone Edit Test")
    @Tag("Valid_User_Account_Information_Edit")
    void validAccountPhoneEditTest(){
        RegisterPage registerPage = new RegisterPage(driver);
        //user navigation to 'Register' page test
        userNavigationToRegisterPageTest();
        //valid user account creation
        validUserAccountCreationTest(registerPage);
        //valid user account information phone edit test
        validEditPhoneTest();
    }

    //invalid user account information edit tests

    //no singular input

    //Test 005d -> invalid user account information edit test - no first name
    @Test
    @DisplayName("Invalid User Account Info Edit Test - No First Name")
    @Tag("Invalid_User_Account_Information_Edit")
    @Tag("No_Singular_Input")
    void invalidAccountNoFirstNameEditTest(){
        RegisterPage registerPage = new RegisterPage(driver);
        //user navigation to 'Register' page test
        userNavigationToRegisterPageTest();
        //valid user account creation
        validUserAccountCreationTest(registerPage);
        //invalid user account information edit test - no first name
        invalidEditNoFirstNameTest();
    }

    //Test 005e -> invalid user account information edit test - no last name
    @Test
    @DisplayName("Invalid User Account Info Edit Test - No Last Name")
    @Tag("Invalid_User_Account_Information_Edit")
    @Tag("No_Singular_Input")
    void invalidAccountNoLastNameEditTest(){
        RegisterPage registerPage = new RegisterPage(driver);
        //user navigation to 'Register' page test
        userNavigationToRegisterPageTest();
        //valid user account creation
        validUserAccountCreationTest(registerPage);
        //invalid user account information edit test - no last name
        invalidEditNoLastNameTest();
    }

    //Test 005f -> invalid user account information edit test - no email
    @Test
    @DisplayName("Invalid User Account Info Edit Test - No Email")
    @Tag("Invalid_User_Account_Information_Edit")
    @Tag("No_Singular_Input")
    void invalidAccountNoEmailEditTest(){
        RegisterPage registerPage = new RegisterPage(driver);
        //user navigation to 'Register' page test
        userNavigationToRegisterPageTest();
        //valid user account creation
        validUserAccountCreationTest(registerPage);
        //invalid user account information edit test - no email
        invalidEditNoEmailTest();
    }

    //Test 005g -> invalid user account information edit test - no phone
    @Test
    @DisplayName("Invalid User Account Info Edit Test - No Phone")
    @Tag("Invalid_User_Account_Information_Edit")
    @Tag("No_Singular_Input")
    void invalidAccountNoPhoneEditTest(){
        RegisterPage registerPage = new RegisterPage(driver);
        //user navigation to 'Register' page test
        userNavigationToRegisterPageTest();
        //valid user account creation
        validUserAccountCreationTest(registerPage);
        //invalid user account information edit test - no phone
        invalidEditNoPhoneTest();
    }

    //too singular singular input

    //Test 005h -> invalid user account information edit test - too short first name (1 char) (first name edit hasn't been aborted, test has failed)
    @Test
    @DisplayName("Invalid User Account Info Edit Test - Too Short First Name")
    @Tag("Invalid_User_Account_Information_Edit")
    @Tag("Too_Short_Singular_Input")
    void invalidAccountTooShortFirstNameEditTest(){
        RegisterPage registerPage = new RegisterPage(driver);
        //user navigation to 'Register' page test
        userNavigationToRegisterPageTest();
        //valid user account creation
        validUserAccountCreationTest(registerPage);
        //invalid user account information edit test - too short first name (1 char)
        invalidEditTooShortFirstNameTest();
    }

    //Test 005i -> invalid user account information edit test - too short last name (1 char) (last name edit hasn't been aborted, test has failed)
    @Test
    @DisplayName("Invalid User Account Info Edit Test - Too Short Last Name")
    @Tag("Invalid_User_Account_Information_Edit")
    @Tag("Too_Short_Singular_Input")
    void invalidAccountTooShortLastNameEditTest(){
        RegisterPage registerPage = new RegisterPage(driver);
        //user navigation to 'Register' page test
        userNavigationToRegisterPageTest();
        //valid user account creation
        validUserAccountCreationTest(registerPage);
        //invalid user account information edit test - too short last name (1 char)
        invalidEditTooShortLastNameTest();
    }

    //Test 005j -> invalid user account information edit test - too short email (1 char -> name,domain) (email edit hasn't been aborted, test has failed)
    @Test
    @DisplayName("Invalid User Account Info Edit Test - Too Short Email")
    @Tag("Invalid_User_Account_Information_Edit")
    @Tag("Too_Short_Singular_Input")
    void invalidAccountTooShortEmailEditTest(){
        RegisterPage registerPage = new RegisterPage(driver);
        //user navigation to 'Register' page test
        userNavigationToRegisterPageTest();
        //valid user account creation
        validUserAccountCreationTest(registerPage);
        //invalid user account information edit test - too short email (1 char -> name,domain)
        invalidEditTooShortEmailTest();
    }

}
