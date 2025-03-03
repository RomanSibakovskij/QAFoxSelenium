package com.tutorialsninja.qafox.utilities;

import com.tutorialsninja.qafox.AddAddressPage;
import com.tutorialsninja.qafox.RegisterPage;
import org.junit.jupiter.api.*;

public class CheckoutPageRegUserLoginTest extends TestMethods{

    //valid check out confirmation with valid checkout login test

    //Test 017 -> single product (HP LP3065) check out confirmation with valid checkout login test (as a registered user)
    @Test
    @DisplayName("Single Product (HP LP3065) Checkout Confirmation With Valid Checkout Login Test (as a registered user)")
    @Tag("Single_Product_Checkout")
    @Tag("Valid_Checkout_Login")
    @Tag("Test_As_A_Reg_User")
    void singleProductCheckoutConfirmationWithLoginAsRegUserTest() {
        RegisterPage registerPage = new RegisterPage(driver);
        AddAddressPage addAddressPage = new AddAddressPage(driver);
        //user navigation to 'Register' page test
        userNavigationToRegisterPageTest();
        //valid user account creation
        validUserAccountCreationTest(registerPage);
        //valid user address addition test
        validUserSingleMainAddressAdditionTest(addAddressPage);
        //valid user logout test
        userLogOutForCheckoutTest();
        //navigate to 'Desktops' category page test
        navigateToDesktopsCategoryDashboardPageTest();
        //single product (HP LP3065) addition to cart page test
        addHPLP3065ToCartTest();
        //single product (HP LP3065) addition to check out page test
        addHPLP3065ProductToCheckoutGuestTest();
        //single product (HP LP3065) check out confirmation with valid checkout login test (as a registered user)
        validCheckoutLoginTest(registerPage);
    }

    //invalid check out confirmation with invalid checkout login tests

    //no singular input

    //Test 017a -> single product (HP LP3065) check out confirmation with invalid checkout login test - no email (as a registered user)
    @Test
    @DisplayName("Single Product (HP LP3065) Checkout Confirmation With Invalid Checkout Login Test - No Email (as a registered user)")
    @Tag("Single_Product_Checkout")
    @Tag("Invalid_Checkout_Login")
    @Tag("Test_As_A_Reg_User")
    @Tag("No_Singular_Input")
    void singleProductCheckoutConfirmationInvalidLoginNoEmailRegUserTest() {
        RegisterPage registerPage = new RegisterPage(driver);
        AddAddressPage addAddressPage = new AddAddressPage(driver);
        //user navigation to 'Register' page test
        userNavigationToRegisterPageTest();
        //valid user account creation
        validUserAccountCreationTest(registerPage);
        //valid user address addition test
        validUserSingleMainAddressAdditionTest(addAddressPage);
        //valid user logout test
        userLogOutForCheckoutTest();
        //navigate to 'Desktops' category page test
        navigateToDesktopsCategoryDashboardPageTest();
        //single product (HP LP3065) addition to cart page test
        addHPLP3065ToCartTest();
        //single product (HP LP3065) addition to check out page test
        addHPLP3065ProductToCheckoutGuestTest();
        //single product (HP LP3065) check out confirmation with invalid checkout login test - no login email (as a registered user)
        invalidCheckoutLoginNoEmailTest(registerPage);
    }

    //Test 017b -> single product (HP LP3065) check out confirmation with invalid checkout login test - no password (as a registered user)
    @Test
    @DisplayName("Single Product (HP LP3065) Checkout Confirmation With Invalid Checkout Login Test - No Password (as a registered user)")
    @Tag("Single_Product_Checkout")
    @Tag("Invalid_Checkout_Login")
    @Tag("Test_As_A_Reg_User")
    @Tag("No_Singular_Input")
    void singleProductCheckoutConfirmationInvalidLoginNoPasswordRegUserTest() {
        RegisterPage registerPage = new RegisterPage(driver);
        AddAddressPage addAddressPage = new AddAddressPage(driver);
        //user navigation to 'Register' page test
        userNavigationToRegisterPageTest();
        //valid user account creation
        validUserAccountCreationTest(registerPage);
        //valid user address addition test
        validUserSingleMainAddressAdditionTest(addAddressPage);
        //valid user logout test
        userLogOutForCheckoutTest();
        //navigate to 'Desktops' category page test
        navigateToDesktopsCategoryDashboardPageTest();
        //single product (HP LP3065) addition to cart page test
        addHPLP3065ToCartTest();
        //single product (HP LP3065) addition to check out page test
        addHPLP3065ProductToCheckoutGuestTest();
        //single product (HP LP3065) check out confirmation with invalid checkout login test - no login password (as a registered user)
        invalidCheckoutLoginNoPasswordTest(registerPage);
    }

}
