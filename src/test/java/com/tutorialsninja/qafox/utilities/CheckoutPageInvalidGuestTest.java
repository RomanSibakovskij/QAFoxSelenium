package com.tutorialsninja.qafox.utilities;

import org.junit.jupiter.api.*;

public class CheckoutPageInvalidGuestTest extends TestMethods{

    //invalid check out confirmation tests (as a guest) -> only guest branch is being tested since few negative scenarios registered user has, are similar to the guest

    //no singular input

    //Test 015d -> invalid single product (HP LP3065) check out confirmation test (as a guest) - no guest first name
    @Test
    @DisplayName("Invalid Single Product (HP LP3065) Checkout Confirmation Test - No Guest First Name")
    @Tag("Invalid_Single_Product_Checkout")
    @Tag("Test_As_A_Guest")
    @Tag("No_Singular_Input")
    void invalidSingleProductCheckoutConfirmationAsGuestNoFirstNameTest() {
        //navigate to 'Desktops' category page test (as a guest)
        navigateToDesktopsCategoryDashboardPageTest();
        //single product (HP LP3065) addition to cart page test (as a guest)
        addHPLP3065ToCartTest();
        //single product (HP LP3065) addition to check out page test (as a guest)
        addHPLP3065ProductToCheckoutGuestTest();
        //invalid single product (HP LP3065) check out confirmation test (as a guest) - no guest first name
        invalidHPLP3065ProductOrderCheckoutConfirmationNoGuestFirstNameTest();
    }

    //Test 015e -> invalid single product (HP LP3065) check out confirmation test (as a guest) - no guest last name
    @Test
    @DisplayName("Invalid Single Product (HP LP3065) Checkout Confirmation Test - No Guest Last Name")
    @Tag("Invalid_Single_Product_Checkout")
    @Tag("Test_As_A_Guest")
    @Tag("No_Singular_Input")
    void invalidSingleProductCheckoutConfirmationAsGuestNoLastNameTest() {
        //navigate to 'Desktops' category page test (as a guest)
        navigateToDesktopsCategoryDashboardPageTest();
        //single product (HP LP3065) addition to cart page test (as a guest)
        addHPLP3065ToCartTest();
        //single product (HP LP3065) addition to check out page test (as a guest)
        addHPLP3065ProductToCheckoutGuestTest();
        //invalid single product (HP LP3065) check out confirmation test (as a guest) - no guest last name
        invalidHPLP3065ProductOrderCheckoutConfirmationNoGuestLastNameTest();
    }

    //Test 015f -> invalid single product (HP LP3065) check out confirmation test (as a guest) - no guest email
    @Test
    @DisplayName("Invalid Single Product (HP LP3065) Checkout Confirmation Test - No Guest Email")
    @Tag("Invalid_Single_Product_Checkout")
    @Tag("Test_As_A_Guest")
    @Tag("No_Singular_Input")
    void invalidSingleProductCheckoutConfirmationAsGuestNoEmailTest() {
        //navigate to 'Desktops' category page test (as a guest)
        navigateToDesktopsCategoryDashboardPageTest();
        //single product (HP LP3065) addition to cart page test (as a guest)
        addHPLP3065ToCartTest();
        //single product (HP LP3065) addition to check out page test (as a guest)
        addHPLP3065ProductToCheckoutGuestTest();
        //invalid single product (HP LP3065) check out confirmation test (as a guest) - no guest email
        invalidHPLP3065ProductOrderCheckoutConfirmationNoGuestEmailTest();
    }

    //Test 015g -> invalid single product (HP LP3065) check out confirmation test (as a guest) - no guest phone
    @Test
    @DisplayName("Invalid Single Product (HP LP3065) Checkout Confirmation Test - No Guest Phone")
    @Tag("Invalid_Single_Product_Checkout")
    @Tag("Test_As_A_Guest")
    @Tag("No_Singular_Input")
    void invalidSingleProductCheckoutConfirmationAsGuestNoPhoneTest() {
        //navigate to 'Desktops' category page test (as a guest)
        navigateToDesktopsCategoryDashboardPageTest();
        //single product (HP LP3065) addition to cart page test (as a guest)
        addHPLP3065ToCartTest();
        //single product (HP LP3065) addition to check out page test (as a guest)
        addHPLP3065ProductToCheckoutGuestTest();
        //invalid single product (HP LP3065) check out confirmation test (as a guest) - no guest phone
        invalidHPLP3065ProductOrderCheckoutConfirmationNoGuestPhoneTest();
    }

    //Test 015h -> invalid single product (HP LP3065) check out confirmation test (as a guest) - no guest address
    @Test
    @DisplayName("Invalid Single Product (HP LP3065) Checkout Confirmation Test - No Guest Address")
    @Tag("Invalid_Single_Product_Checkout")
    @Tag("Test_As_A_Guest")
    @Tag("No_Singular_Input")
    void invalidSingleProductCheckoutConfirmationAsGuestNoAddressTest() {
        //navigate to 'Desktops' category page test (as a guest)
        navigateToDesktopsCategoryDashboardPageTest();
        //single product (HP LP3065) addition to cart page test (as a guest)
        addHPLP3065ToCartTest();
        //single product (HP LP3065) addition to check out page test (as a guest)
        addHPLP3065ProductToCheckoutGuestTest();
        //invalid single product (HP LP3065) check out confirmation test (as a guest) - no guest address
        invalidHPLP3065ProductOrderCheckoutConfirmationNoGuestAddressTest();
    }

    //Test 015i -> invalid single product (HP LP3065) check out confirmation test (as a guest) - no guest city
    @Test
    @DisplayName("Invalid Single Product (HP LP3065) Checkout Confirmation Test - No Guest City")
    @Tag("Invalid_Single_Product_Checkout")
    @Tag("Test_As_A_Guest")
    @Tag("No_Singular_Input")
    void invalidSingleProductCheckoutConfirmationAsGuestNoCityTest() {
        //navigate to 'Desktops' category page test (as a guest)
        navigateToDesktopsCategoryDashboardPageTest();
        //single product (HP LP3065) addition to cart page test (as a guest)
        addHPLP3065ToCartTest();
        //single product (HP LP3065) addition to check out page test (as a guest)
        addHPLP3065ProductToCheckoutGuestTest();
        //invalid single product (HP LP3065) check out confirmation test (as a guest) - no guest city
        invalidHPLP3065ProductOrderCheckoutConfirmationNoGuestCityTest();
    }

    //Test 015j -> invalid single product (HP LP3065) check out confirmation test (as a guest) - no guest post code (the error wasn't triggered, test has failed)
    @Test
    @DisplayName("Invalid Single Product (HP LP3065) Checkout Confirmation Test - No Guest Post Code")
    @Tag("Invalid_Single_Product_Checkout")
    @Tag("Test_As_A_Guest")
    @Tag("No_Singular_Input")
    void invalidSingleProductCheckoutConfirmationAsGuestNoPostCodeTest() {
        //navigate to 'Desktops' category page test (as a guest)
        navigateToDesktopsCategoryDashboardPageTest();
        //single product (HP LP3065) addition to cart page test (as a guest)
        addHPLP3065ToCartTest();
        //single product (HP LP3065) addition to check out page test (as a guest)
        addHPLP3065ProductToCheckoutGuestTest();
        //invalid single product (HP LP3065) check out confirmation test (as a guest) - no guest post code
        invalidHPLP3065ProductOrderCheckoutConfirmationNoGuestPostCodeTest();
    }

    //Test 015k -> invalid single product (HP LP3065) check out confirmation test (as a guest) - no guest country
    @Test
    @DisplayName("Invalid Single Product (HP LP3065) Checkout Confirmation Test - No Guest Country")
    @Tag("Invalid_Single_Product_Checkout")
    @Tag("Test_As_A_Guest")
    @Tag("No_Singular_Input")
    void invalidSingleProductCheckoutConfirmationAsGuestNoCountryTest() {
        //navigate to 'Desktops' category page test (as a guest)
        navigateToDesktopsCategoryDashboardPageTest();
        //single product (HP LP3065) addition to cart page test (as a guest)
        addHPLP3065ToCartTest();
        //single product (HP LP3065) addition to check out page test (as a guest)
        addHPLP3065ProductToCheckoutGuestTest();
        //invalid single product (HP LP3065) check out confirmation test (as a guest) - no guest country
        invalidHPLP3065ProductOrderCheckoutConfirmationNoGuestCountryTest();
    }

    //Test 015l -> invalid single product (HP LP3065) check out confirmation test (as a guest) - no guest state
    @Test
    @DisplayName("Invalid Single Product (HP LP3065) Checkout Confirmation Test - No Guest State")
    @Tag("Invalid_Single_Product_Checkout")
    @Tag("Test_As_A_Guest")
    @Tag("No_Singular_Input")
    void invalidSingleProductCheckoutConfirmationAsGuestNoStateTest() {
        //navigate to 'Desktops' category page test (as a guest)
        navigateToDesktopsCategoryDashboardPageTest();
        //single product (HP LP3065) addition to cart page test (as a guest)
        addHPLP3065ToCartTest();
        //single product (HP LP3065) addition to check out page test (as a guest)
        addHPLP3065ProductToCheckoutGuestTest();
        //invalid single product (HP LP3065) check out confirmation test (as a guest) - no guest state
        invalidHPLP3065ProductOrderCheckoutConfirmationNoGuestStateTest();
    }

    //Test 015m -> invalid single product (HP LP3065) check out confirmation test (as a guest) - no guest 'Agree to Terms' checkbox selection
    @Test
    @DisplayName("Invalid Single Product (HP LP3065) Checkout Confirmation Test - No Guest 'Agree To Terms'")
    @Tag("Invalid_Single_Product_Checkout")
    @Tag("Test_As_A_Guest")
    @Tag("No_Singular_Input")
    void invalidSingleProductCheckoutConfirmationAsGuestNoAgreeToTermsTest() {
        //navigate to 'Desktops' category page test (as a guest)
        navigateToDesktopsCategoryDashboardPageTest();
        //single product (HP LP3065) addition to cart page test (as a guest)
        addHPLP3065ToCartTest();
        //single product (HP LP3065) addition to check out page test (as a guest)
        addHPLP3065ProductToCheckoutGuestTest();
        //invalid single product (HP LP3065) check out confirmation test (as a guest) - no "Agree To Terms' checkbox selection
        invalidHPLP3065ProductOrderCheckoutConfirmationGuestNoAgreeToTermsTest();
    }

}
