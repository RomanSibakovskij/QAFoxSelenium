package com.tutorialsninja.qafox.utilities;

import org.junit.jupiter.api.*;

public class CheckoutPageTooShortGuestInputTest extends TestMethods{

    //too short singular input

    //Test 016n -> invalid single product (HP LP3065) check out confirmation test (as a guest) - too short guest first name (1 char) (the error wasn't triggered, test has failed)
    @Test
    @DisplayName("Invalid Single Product (HP LP3065) Checkout Confirmation Test - Too Short Guest First Name")
    @Tag("Invalid_Single_Product_Checkout")
    @Tag("Test_As_A_Guest")
    @Tag("Too_Short_Singular_Input")
    void invalidSingleProductCheckoutConfirmationAsGuestTooShortFirstNameTest() {
        //navigate to 'Desktops' category page test (as a guest)
        navigateToDesktopsCategoryDashboardPageTest();
        //single product (HP LP3065) addition to cart page test (as a guest)
        addHPLP3065ToCartTest();
        //single product (HP LP3065) addition to check out page test (as a guest)
        addHPLP3065ProductToCheckoutGuestTest();
        //invalid single product (HP LP3065) check out confirmation test (as a guest) - too short guest first name (1 char)
        invalidHPLP3065ProductOrderCheckoutConfirmationTooShortGuestFirstNameTest();
    }

    //Test 016o -> invalid single product (HP LP3065) check out confirmation test (as a guest) - too short guest last name (1 char) (the error wasn't triggered, test has failed)
    @Test
    @DisplayName("Invalid Single Product (HP LP3065) Checkout Confirmation Test - Too Short Guest Last Name")
    @Tag("Invalid_Single_Product_Checkout")
    @Tag("Test_As_A_Guest")
    @Tag("Too_Short_Singular_Input")
    void invalidSingleProductCheckoutConfirmationAsGuestTooShortLastNameTest() {
        //navigate to 'Desktops' category page test (as a guest)
        navigateToDesktopsCategoryDashboardPageTest();
        //single product (HP LP3065) addition to cart page test (as a guest)
        addHPLP3065ToCartTest();
        //single product (HP LP3065) addition to check out page test (as a guest)
        addHPLP3065ProductToCheckoutGuestTest();
        //invalid single product (HP LP3065) check out confirmation test (as a guest) - too short guest last name (1 char)
        invalidHPLP3065ProductOrderCheckoutConfirmationTooShortGuestLastNameTest();
    }

    //Test 016p -> invalid single product (HP LP3065) check out confirmation test (as a guest) - too short guest email (1 char -> name, domain) (the error wasn't triggered, test has failed)
    @Test
    @DisplayName("Invalid Single Product (HP LP3065) Checkout Confirmation Test - Too Short Guest Email")
    @Tag("Invalid_Single_Product_Checkout")
    @Tag("Test_As_A_Guest")
    @Tag("Too_Short_Singular_Input")
    void invalidSingleProductCheckoutConfirmationAsGuestTooShortEmailTest() {
        //navigate to 'Desktops' category page test (as a guest)
        navigateToDesktopsCategoryDashboardPageTest();
        //single product (HP LP3065) addition to cart page test (as a guest)
        addHPLP3065ToCartTest();
        //single product (HP LP3065) addition to check out page test (as a guest)
        addHPLP3065ProductToCheckoutGuestTest();
        //invalid single product (HP LP3065) check out confirmation test (as a guest) - too short guest email (1 char -> name,domain)
        invalidHPLP3065ProductOrderCheckoutConfirmationTooShortGuestEmailTest();
    }

    //Test 016q -> invalid single product (HP LP3065) check out confirmation test (as a guest) - too short guest phone (2 digits)
    @Test
    @DisplayName("Invalid Single Product (HP LP3065) Checkout Confirmation Test - Too Short Guest Phone")
    @Tag("Invalid_Single_Product_Checkout")
    @Tag("Test_As_A_Guest")
    @Tag("Too_Short_Singular_Input")
    void invalidSingleProductCheckoutConfirmationAsGuestTooShortPhoneTest() {
        //navigate to 'Desktops' category page test (as a guest)
        navigateToDesktopsCategoryDashboardPageTest();
        //single product (HP LP3065) addition to cart page test (as a guest)
        addHPLP3065ToCartTest();
        //single product (HP LP3065) addition to check out page test (as a guest)
        addHPLP3065ProductToCheckoutGuestTest();
        //invalid single product (HP LP3065) check out confirmation test (as a guest) - too short guest phone (2 digits)
        invalidHPLP3065ProductOrderCheckoutConfirmationTooShortGuestPhoneTest();
    }

    //Test 016r -> invalid single product (HP LP3065) check out confirmation test (as a guest) - too short guest address (2 chars)
    @Test
    @DisplayName("Invalid Single Product (HP LP3065) Checkout Confirmation Test - Too Short Guest Address")
    @Tag("Invalid_Single_Product_Checkout")
    @Tag("Test_As_A_Guest")
    @Tag("Too_Short_Singular_Input")
    void invalidSingleProductCheckoutConfirmationAsGuestTooShortAddressTest() {
        //navigate to 'Desktops' category page test (as a guest)
        navigateToDesktopsCategoryDashboardPageTest();
        //single product (HP LP3065) addition to cart page test (as a guest)
        addHPLP3065ToCartTest();
        //single product (HP LP3065) addition to check out page test (as a guest)
        addHPLP3065ProductToCheckoutGuestTest();
        //invalid single product (HP LP3065) check out confirmation test (as a guest) - too short guest address (2 chars)
        invalidHPLP3065ProductOrderCheckoutConfirmationTooShortGuestAddressTest();
    }

}
