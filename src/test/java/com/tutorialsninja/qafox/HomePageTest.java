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

    //Test 009 -> navigate to 'Desktops' category page test (as a guest)
    @Test
    @DisplayName("Navigate to 'Desktops' Category Dashboard Page Test (as a guest)")
    @Tag("Navigate_To_Desktops_Category_Dashboard_Page")
    @Tag("Test_As_A_Guest")
    void navigateToDesktopsCategoryPageAsGuestTest() {
        navigateToDesktopsCategoryDashboardPageTest();
    }

}
