package com.tutorialsninja.qafox;

import com.tutorialsninja.qafox.utilities.TestMethods;
import org.junit.jupiter.api.*;

public class HomePageTest extends TestMethods {

    //navigate to 'Register' page test

    //Test 001 -> user navigation to 'Register' page test
    @Test
    @DisplayName("User Navigation To Register Page Test")
    @Tag("User_Navigation_To_Register_Page")
    void navigateToRegisterAccountPageTest(){
        userNavigationToRegisterPageTest();
    }

    //user navigation to single category page tests

    //Test 009 -> navigate to 'Desktops' category page test (as a guest)
    @Test
    @DisplayName("Navigate to 'Desktops' Category Dashboard Page Test (as a guest)")
    @Tag("Navigate_To_Desktops_Category_Dashboard_Page")
    @Tag("Test_As_A_Guest")
    void navigateToDesktopsCategoryPageAsGuestTest() {
        navigateToDesktopsCategoryDashboardPageTest();
    }

    //Test 009a -> navigate to 'Desktops' category page test (as a registered user)
    @Test
    @DisplayName("Navigate to 'Desktops' Category Dashboard Page Test (as a registered user)")
    @Tag("Navigate_To_Desktops_Category_Dashboard_Page")
    @Tag("Test_As_A_Reg_User")
    void navigateToDesktopsCategoryPageAsRegUserTest() {
        RegisterPage registerPage = new RegisterPage(driver);
        AddAddressPage addAddressPage = new AddAddressPage(driver);
        //user navigation to 'Register' page test
        userNavigationToRegisterPageTest();
        //valid user account creation
        validUserAccountCreationTest(registerPage);
        //valid user address addition test
        validUserSingleMainAddressAdditionTest(addAddressPage);
        //navigate to 'Desktops' category page test (as a registered user)
        navigateToDesktopsCategoryDashboardPageRegUserTest();
    }

}
