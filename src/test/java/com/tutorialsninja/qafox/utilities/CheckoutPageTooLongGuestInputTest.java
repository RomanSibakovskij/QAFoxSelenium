package com.tutorialsninja.qafox.utilities;

import org.junit.jupiter.api.*;

public class CheckoutPageTooLongGuestInputTest extends TestMethods{

    //too long singular input

    //Test 016u -> invalid single product (HP LP3065) check out confirmation test (as a guest) - too long guest first name (33 chars) (the error wasn't triggered, test has failed)
    @Test
    @DisplayName("Invalid Single Product (HP LP3065) Checkout Confirmation Test - Too Long Guest First Name")
    @Tag("Invalid_Single_Product_Checkout")
    @Tag("Test_As_A_Guest")
    @Tag("Too_Long_Singular_Input")
    void invalidSingleProductCheckoutConfirmationAsGuestTooLongFirstNameTest() {
        //navigate to 'Desktops' category page test (as a guest)
        navigateToDesktopsCategoryDashboardPageTest();
        //single product (HP LP3065) addition to cart page test (as a guest)
        addHPLP3065ToCartTest();
        //single product (HP LP3065) addition to check out page test (as a guest)
        addHPLP3065ProductToCheckoutGuestTest();
        //invalid single product (HP LP3065) check out confirmation test (as a guest) - too long guest first name (33 chars)
        invalidHPLP3065ProductOrderCheckoutConfirmationTooLongGuestFirstNameTest();
    }


}
