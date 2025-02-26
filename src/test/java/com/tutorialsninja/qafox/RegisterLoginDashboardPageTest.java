package com.tutorialsninja.qafox;

import com.tutorialsninja.qafox.utilities.TestMethods;
import org.junit.jupiter.api.*;

public class RegisterLoginDashboardPageTest extends TestMethods{

    //valid user logout test

    //Test 003 -> valid user logout test
    @Test
    @DisplayName("Valid User Logout Test")
    @Tag("Valid_User_Logout")
    void validAccountLogoutTest(){
        RegisterPage registerPage = new RegisterPage(driver);
        //user navigation to 'Register' page test
        userNavigationToRegisterPageTest();
        //valid user account creation
        validUserAccountCreationTest(registerPage);
        //valid user logout test
        userLogOutTest();
    }

    //valid user login test

    //Test 004 -> valid user login test
    @Test
    @DisplayName("Valid User Login Test")
    @Tag("Valid_User_Login")
    void validAccountLoginTest(){
        RegisterPage registerPage = new RegisterPage(driver);
        //user navigation to 'Register' page test
        userNavigationToRegisterPageTest();
        //valid user account creation
        validUserAccountCreationTest(registerPage);
        //valid user logout test
        userLogOutTest();
        //valid user login test
        validUserLoginTest(registerPage);
    }

    //invalid user login tests

    //no singular input

    //Test 004a -> invalid user login test - no login email
    @Test
    @DisplayName("Invalid User Login Test - No Login Email")
    @Tag("Invalid_User_Login")
    @Tag("No_Singular_Input")
    void invalidAccountLoginNoEmailTest(){
        RegisterPage registerPage = new RegisterPage(driver);
        //user navigation to 'Register' page test
        userNavigationToRegisterPageTest();
        //valid user account creation
        validUserAccountCreationTest(registerPage);
        //valid user logout test
        userLogOutTest();
        //invalid user login test - no login email
        invalidUserLoginNoEmailTest(registerPage);
    }

    //Test 004b -> invalid user login test - no login password
    @Test
    @DisplayName("Invalid User Login Test - No Login Password")
    @Tag("Invalid_User_Login")
    @Tag("No_Singular_Input")
    void invalidAccountLoginNoPasswordTest(){
        RegisterPage registerPage = new RegisterPage(driver);
        //user navigation to 'Register' page test
        userNavigationToRegisterPageTest();
        //valid user account creation
        validUserAccountCreationTest(registerPage);
        //valid user logout test
        userLogOutTest();
        //invalid user login test - no login password
        invalidUserLoginNoPaaswordTest(registerPage);
    }

    //invalid singular input

    //Test 004c -> invalid user login test - invalid login email
    @Test
    @DisplayName("Invalid User Login Test - Invalid Login Email")
    @Tag("Invalid_User_Login")
    @Tag("Invalid_Singular_Input")
    void invalidAccountLoginInvalidEmailTest(){
        RegisterPage registerPage = new RegisterPage(driver);
        //user navigation to 'Register' page test
        userNavigationToRegisterPageTest();
        //valid user account creation
        validUserAccountCreationTest(registerPage);
        //valid user logout test
        userLogOutTest();
        //invalid user login test - invalid login email
        invalidUserLoginInvalidEmailTest(registerPage);
    }
}
