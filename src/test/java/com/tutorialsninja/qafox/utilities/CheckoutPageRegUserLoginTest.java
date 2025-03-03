package com.tutorialsninja.qafox.utilities;

import com.tutorialsninja.qafox.AddAddressPage;
import com.tutorialsninja.qafox.RegisterPage;
import org.junit.jupiter.api.*;

public class CheckoutPageRegUserLoginTest extends TestMethods{

    //valid check out confirmation tests

    //Test 017 -> single product (HP LP3065) check out confirmation with valid checkout login test
    @Test
    @DisplayName("Single Product (HP LP3065) Checkout Confirmation With Valid Checkout Login Test (as a registered user)")
    @Tag("Single_Product_Checkout")
    @Tag("Valid_Checkout_Login")
    @Tag("Test_As_A_Reg_User")
    void singleProductCheckoutConfirmationAsGuestTest() {
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

}
