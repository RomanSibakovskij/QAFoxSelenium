package com.tutorialsninja.qafox;

import com.tutorialsninja.qafox.utilities.*;
import org.junit.jupiter.api.*;

public class EditAccountInfoPageTest extends TestMethods{

    //valid user account information edit tests

    //Test 005 -> valid user first name edit test
    @Test
    @DisplayName("Valid User First Name Editing Test")
    @Tag("Valid_User_Account_Information_Edit")
    void validAccountFirstNameEditTest(){
        RegisterPage registerPage = new RegisterPage(driver);
        //user navigation to 'Register' page test
        userNavigationToRegisterPageTest();
        //valid user account creation
        validUserAccountCreationTest(registerPage);
        //valid user account information first name edit
        validEditFirstNameTest();
    }



}
