package com.tutorialsninja.qafox.utilities;

import org.junit.jupiter.api.*;

public class CheckoutPageTooLongGuestInputTest extends TestMethods{

    //too long singular input

    //Test 016u -> invalid single product (HP LP3065) check out confirmation test (as a guest) - too long guest first name (33 chars)
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

    //Test 016v -> invalid single product (HP LP3065) check out confirmation test (as a guest) - too long guest last name (33 chars)
    @Test
    @DisplayName("Invalid Single Product (HP LP3065) Checkout Confirmation Test - Too Long Guest Last Name")
    @Tag("Invalid_Single_Product_Checkout")
    @Tag("Test_As_A_Guest")
    @Tag("Too_Long_Singular_Input")
    void invalidSingleProductCheckoutConfirmationAsGuestTooLongLastNameTest() {
        //navigate to 'Desktops' category page test (as a guest)
        navigateToDesktopsCategoryDashboardPageTest();
        //single product (HP LP3065) addition to cart page test (as a guest)
        addHPLP3065ToCartTest();
        //single product (HP LP3065) addition to check out page test (as a guest)
        addHPLP3065ProductToCheckoutGuestTest();
        //invalid single product (HP LP3065) check out confirmation test (as a guest) - too long guest last name (33 chars)
        invalidHPLP3065ProductOrderCheckoutConfirmationTooLongGuestLastNameTest();
    }

    //Test 016w -> invalid single product (HP LP3065) check out confirmation test (as a guest) - too long guest email (100 chars -> name, domain)
    @Test
    @DisplayName("Invalid Single Product (HP LP3065) Checkout Confirmation Test - Too Long Guest Email")
    @Tag("Invalid_Single_Product_Checkout")
    @Tag("Test_As_A_Guest")
    @Tag("Too_Long_Singular_Input")
    void invalidSingleProductCheckoutConfirmationAsGuestTooLongEmailTest() {
        //navigate to 'Desktops' category page test (as a guest)
        navigateToDesktopsCategoryDashboardPageTest();
        //single product (HP LP3065) addition to cart page test (as a guest)
        addHPLP3065ToCartTest();
        //single product (HP LP3065) addition to check out page test (as a guest)
        addHPLP3065ProductToCheckoutGuestTest();
        //invalid single product (HP LP3065) check out confirmation test (as a guest) - too long guest email (100 chars -> name, domain)
        invalidHPLP3065ProductOrderCheckoutConfirmationTooLongGuestEmailTest();
    }

    //Test 016x -> invalid single product (HP LP3065) check out confirmation test (as a guest) - too long guest phone (33 digits)
    @Test
    @DisplayName("Invalid Single Product (HP LP3065) Checkout Confirmation Test - Too Long Guest Phone")
    @Tag("Invalid_Single_Product_Checkout")
    @Tag("Test_As_A_Guest")
    @Tag("Too_Long_Singular_Input")
    void invalidSingleProductCheckoutConfirmationAsGuestTooLongPhoneTest() {
        //navigate to 'Desktops' category page test (as a guest)
        navigateToDesktopsCategoryDashboardPageTest();
        //single product (HP LP3065) addition to cart page test (as a guest)
        addHPLP3065ToCartTest();
        //single product (HP LP3065) addition to check out page test (as a guest)
        addHPLP3065ProductToCheckoutGuestTest();
        //invalid single product (HP LP3065) check out confirmation test (as a guest) - too long guest phone (33 digits)
        invalidHPLP3065ProductOrderCheckoutConfirmationTooLongGuestPhoneTest();
    }

    //Test 016y -> invalid single product (HP LP3065) check out confirmation test (as a guest) - too long guest address (129 chars)
    @Test
    @DisplayName("Invalid Single Product (HP LP3065) Checkout Confirmation Test - Too Long Guest Address")
    @Tag("Invalid_Single_Product_Checkout")
    @Tag("Test_As_A_Guest")
    @Tag("Too_Long_Singular_Input")
    void invalidSingleProductCheckoutConfirmationAsGuestTooLongAddressTest() {
        //navigate to 'Desktops' category page test (as a guest)
        navigateToDesktopsCategoryDashboardPageTest();
        //single product (HP LP3065) addition to cart page test (as a guest)
        addHPLP3065ToCartTest();
        //single product (HP LP3065) addition to check out page test (as a guest)
        addHPLP3065ProductToCheckoutGuestTest();
        //invalid single product (HP LP3065) check out confirmation test (as a guest) - too long guest address (129 chars)
        invalidHPLP3065ProductOrderCheckoutConfirmationTooLongGuestAddressTest();
    }

    //Test 016z -> invalid single product (HP LP3065) check out confirmation test (as a guest) - too long guest city (129 chars)
    @Test
    @DisplayName("Invalid Single Product (HP LP3065) Checkout Confirmation Test - Too Long Guest City")
    @Tag("Invalid_Single_Product_Checkout")
    @Tag("Test_As_A_Guest")
    @Tag("Too_Long_Singular_Input")
    void invalidSingleProductCheckoutConfirmationAsGuestTooLongCityTest() {
        //navigate to 'Desktops' category page test (as a guest)
        navigateToDesktopsCategoryDashboardPageTest();
        //single product (HP LP3065) addition to cart page test (as a guest)
        addHPLP3065ToCartTest();
        //single product (HP LP3065) addition to check out page test (as a guest)
        addHPLP3065ProductToCheckoutGuestTest();
        //invalid single product (HP LP3065) check out confirmation test (as a guest) - too long guest city (129 chars)
        invalidHPLP3065ProductOrderCheckoutConfirmationTooLongGuestCityTest();
    }

}
