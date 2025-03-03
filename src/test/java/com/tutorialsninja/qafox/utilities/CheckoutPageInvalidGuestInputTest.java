package com.tutorialsninja.qafox.utilities;

import org.junit.jupiter.api.*;

public class CheckoutPageInvalidGuestInputTest extends TestMethods{

    //invalid singular input format

    //Test 016ab -> invalid single product (HP LP3065) check out confirmation test (as a guest) - invalid guest first name (special symbols only) (the error wasn't triggered, test has failed)
    @Test
    @DisplayName("Invalid Single Product (HP LP3065) Checkout Confirmation Test - Invalid Guest First Name Format")
    @Tag("Invalid_Single_Product_Checkout")
    @Tag("Test_As_A_Guest")
    @Tag("Invalid_Singular_Input_Format")
    void invalidSingleProductCheckoutConfirmationAsGuestInvalidFirstNameFormatTest() {
        //navigate to 'Desktops' category page test (as a guest)
        navigateToDesktopsCategoryDashboardPageTest();
        //single product (HP LP3065) addition to cart page test (as a guest)
        addHPLP3065ToCartTest();
        //single product (HP LP3065) addition to check out page test (as a guest)
        addHPLP3065ProductToCheckoutGuestTest();
        //invalid single product (HP LP3065) check out confirmation test (as a guest) - invalid guest first name format (special symbols only)
        invalidHPLP3065ProductOrderCheckoutConfirmationInvalidGuestFirstNameFormatTest();
    }

    //Test 016ac -> invalid single product (HP LP3065) check out confirmation test (as a guest) - invalid guest last name (special symbols and digits only) (the error wasn't triggered, test has failed)
    @Test
    @DisplayName("Invalid Single Product (HP LP3065) Checkout Confirmation Test - Invalid Guest Last Name Format")
    @Tag("Invalid_Single_Product_Checkout")
    @Tag("Test_As_A_Guest")
    @Tag("Invalid_Singular_Input_Format")
    void invalidSingleProductCheckoutConfirmationAsGuestInvalidLastNameFormatTest() {
        //navigate to 'Desktops' category page test (as a guest)
        navigateToDesktopsCategoryDashboardPageTest();
        //single product (HP LP3065) addition to cart page test (as a guest)
        addHPLP3065ToCartTest();
        //single product (HP LP3065) addition to check out page test (as a guest)
        addHPLP3065ProductToCheckoutGuestTest();
        //invalid single product (HP LP3065) check out confirmation test (as a guest) - invalid guest last name format (special symbols and digits only)
        invalidHPLP3065ProductOrderCheckoutConfirmationInvalidGuestLastNameFormatTest();
    }

    //Test 016ad -> invalid single product (HP LP3065) check out confirmation test (as a guest) - invalid guest email (special symbols and digits only)
    @Test
    @DisplayName("Invalid Single Product (HP LP3065) Checkout Confirmation Test - Invalid Guest Email Format")
    @Tag("Invalid_Single_Product_Checkout")
    @Tag("Test_As_A_Guest")
    @Tag("Invalid_Singular_Input_Format")
    void invalidSingleProductCheckoutConfirmationAsGuestInvalidEmailFormatTest() {
        //navigate to 'Desktops' category page test (as a guest)
        navigateToDesktopsCategoryDashboardPageTest();
        //single product (HP LP3065) addition to cart page test (as a guest)
        addHPLP3065ToCartTest();
        //single product (HP LP3065) addition to check out page test (as a guest)
        addHPLP3065ProductToCheckoutGuestTest();
        //invalid single product (HP LP3065) check out confirmation test (as a guest) - invalid guest email format (missing '@')
        invalidHPLP3065ProductOrderCheckoutConfirmationInvalidGuestEmailFormatTest();
    }

}
