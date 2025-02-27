package com.tutorialsninja.qafox;

import com.tutorialsninja.qafox.utilities.*;
import org.junit.jupiter.api.*;

public class EditPasswordPageTest extends TestMethods{

    //invalid user password edit tests

    //no singular input

    //Test 006 -> invalid user password edit test - no password / confirm password
    @Test
    @DisplayName("Invalid User Password Edit Test - No Password")
    @Tag("Invalid_User_Password_Edit")
    @Tag("No_Singular_Input")
    void invalidAccountNoPasswordEditTest(){
        RegisterPage registerPage = new RegisterPage(driver);
        //user navigation to 'Register' page test
        userNavigationToRegisterPageTest();
        //valid user account creation
        validUserAccountCreationTest(registerPage);
        //invalid user password edit test - no password/ confirm password
        invalidEditNoPasswordTest();
    }


}
