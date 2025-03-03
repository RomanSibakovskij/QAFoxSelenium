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

    //Test 016ad -> invalid single product (HP LP3065) check out confirmation test (as a guest) - invalid guest email format (special symbols and digits only)
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

    //Test 016ae -> invalid single product (HP LP3065) check out confirmation test (as a guest) - pre-existing user email (used in other account) (the error wasn't triggered, test has failed)
    @Test
    @DisplayName("Invalid Single Product (HP LP3065) Checkout Confirmation Test - Pre-Existing Email")
    @Tag("Invalid_Single_Product_Checkout")
    @Tag("Test_As_A_Guest")
    @Tag("Invalid_Singular_Input_Format")
    void invalidSingleProductCheckoutConfirmationAsGuestExistingEmailTest() {
        //navigate to 'Desktops' category page test (as a guest)
        navigateToDesktopsCategoryDashboardPageTest();
        //single product (HP LP3065) addition to cart page test (as a guest)
        addHPLP3065ToCartTest();
        //single product (HP LP3065) addition to check out page test (as a guest)
        addHPLP3065ProductToCheckoutGuestTest();
        //invalid single product (HP LP3065) check out confirmation test (as a guest) - pre-existing user email format (used in other account)
        invalidHPLP3065ProductOrderCheckoutConfirmationExistingEmailTest();
    }

    //Test 016af -> invalid single product (HP LP3065) check out confirmation test (as a guest) - invalid guest phone format (special symbols only) (the error wasn't triggered, test has failed)
    @Test
    @DisplayName("Invalid Single Product (HP LP3065) Checkout Confirmation Test - Invalid Guest Phone Format")
    @Tag("Invalid_Single_Product_Checkout")
    @Tag("Test_As_A_Guest")
    @Tag("Invalid_Singular_Input_Format")
    void invalidSingleProductCheckoutConfirmationAsGuestInvalidPhoneFormatTest() {
        //navigate to 'Desktops' category page test (as a guest)
        navigateToDesktopsCategoryDashboardPageTest();
        //single product (HP LP3065) addition to cart page test (as a guest)
        addHPLP3065ToCartTest();
        //single product (HP LP3065) addition to check out page test (as a guest)
        addHPLP3065ProductToCheckoutGuestTest();
        //invalid single product (HP LP3065) check out confirmation test (as a guest) - invalid guest phone format (special symbols only)
        invalidHPLP3065ProductOrderCheckoutConfirmationInvalidGuestPhoneFormatTest();
    }

    //Test 016ag -> invalid single product (HP LP3065) check out confirmation test (as a guest) - invalid guest address format (special symbols only) (the error wasn't triggered, test has failed)
    @Test
    @DisplayName("Invalid Single Product (HP LP3065) Checkout Confirmation Test - Invalid Guest Address Format")
    @Tag("Invalid_Single_Product_Checkout")
    @Tag("Test_As_A_Guest")
    @Tag("Invalid_Singular_Input_Format")
    void invalidSingleProductCheckoutConfirmationAsGuestInvalidAddressFormatTest() {
        //navigate to 'Desktops' category page test (as a guest)
        navigateToDesktopsCategoryDashboardPageTest();
        //single product (HP LP3065) addition to cart page test (as a guest)
        addHPLP3065ToCartTest();
        //single product (HP LP3065) addition to check out page test (as a guest)
        addHPLP3065ProductToCheckoutGuestTest();
        //invalid single product (HP LP3065) check out confirmation test (as a guest) - invalid guest address format (special symbols only)
        invalidHPLP3065ProductOrderCheckoutConfirmationInvalidGuestAddressFormatTest();
    }

    //Test 016ah -> invalid single product (HP LP3065) check out confirmation test (as a guest) - invalid guest city format (special symbols only) (the error wasn't triggered, test has failed)
    @Test
    @DisplayName("Invalid Single Product (HP LP3065) Checkout Confirmation Test - Invalid Guest City Format")
    @Tag("Invalid_Single_Product_Checkout")
    @Tag("Test_As_A_Guest")
    @Tag("Invalid_Singular_Input_Format")
    void invalidSingleProductCheckoutConfirmationAsGuestInvalidCityFormatTest() {
        //navigate to 'Desktops' category page test (as a guest)
        navigateToDesktopsCategoryDashboardPageTest();
        //single product (HP LP3065) addition to cart page test (as a guest)
        addHPLP3065ToCartTest();
        //single product (HP LP3065) addition to check out page test (as a guest)
        addHPLP3065ProductToCheckoutGuestTest();
        //invalid single product (HP LP3065) check out confirmation test (as a guest) - invalid guest city format (special symbols only)
        invalidHPLP3065ProductOrderCheckoutConfirmationInvalidGuestCityFormatTest();
    }

    //Test 016ai -> invalid single product (HP LP3065) check out confirmation test (as a guest) - invalid guest post code format (special symbols only) (the error wasn't triggered, test has failed)
    @Test
    @DisplayName("Invalid Single Product (HP LP3065) Checkout Confirmation Test - Invalid Guest Post Code Format")
    @Tag("Invalid_Single_Product_Checkout")
    @Tag("Test_As_A_Guest")
    @Tag("Invalid_Singular_Input_Format")
    void invalidSingleProductCheckoutConfirmationAsGuestInvalidPostCodeFormatTest() {
        //navigate to 'Desktops' category page test (as a guest)
        navigateToDesktopsCategoryDashboardPageTest();
        //single product (HP LP3065) addition to cart page test (as a guest)
        addHPLP3065ToCartTest();
        //single product (HP LP3065) addition to check out page test (as a guest)
        addHPLP3065ProductToCheckoutGuestTest();
        //invalid single product (HP LP3065) check out confirmation test (as a guest) - invalid guest post code format (special symbols only)
        invalidHPLP3065ProductOrderCheckoutConfirmationInvalidGuestPostCodeFormatTest();
    }

}
