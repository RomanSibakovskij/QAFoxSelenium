package com.tutorialsninja.qafox;

import com.tutorialsninja.qafox.utilities.TestMethods;
import org.junit.jupiter.api.*;

public class HomePageTest extends TestMethods {

    //Test 001 -> user navigation to 'Register' page test
    @Test
    @DisplayName("User Navigation To Register Page Test")
    @Tag("User_Navigation_To_Register_Page")
    void navigateToRegisterAccountPageTest(){
        userNavigationToRegisterPageTest();
    }

}
