package com.tutorialsninja.qafox;

import com.tutorialsninja.qafox.utilities.TestMethods;
import org.junit.jupiter.api.*;

public class CheckoutPageTest extends TestMethods{

    //valid check out confirmation tests

    //Test 016 -> single product (HP LP3065) check out confirmation test (as a guest)
    @Test
    @DisplayName("Single Product (HP LP3065) Checkout Confirmation Test (as a guest)")
    @Tag("Single_Product_Checkout")
    @Tag("Test_As_A_Guest")
    void singleProductCheckoutConfirmationAsGuestTest() {
        //navigate to 'Desktops' category page test (as a guest)
        navigateToDesktopsCategoryDashboardPageTest();
        //single product (HP LP3065) addition to cart page test (as a guest)
        addHPLP3065ToCartTest();
        //single product (HP LP3065) addition to check out page test (as a guest)
        addHPLP3065ProductToCheckoutGuestTest();
        //single product (HP LP3065) check out confirmation test (as a guest)
        validHPLP3065ProductOrderCheckoutConfirmationGuestTest();
    }

    //Test 016a -> single product (HP LP3065) addition to check out page test (as a registered user)
    @Test
    @DisplayName("Add Single Product (HP LP3065) To Checkout Test (as a registered user)")
    @Tag("Single_Product_Checkout")
    @Tag("Test_As_A_Reg_User")
    void singleProductCheckoutConfirmationAsRegUserTest() {
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
        //single product (HP LP3065) addition to cart page test (as a registered user)
        addHPLP3065ToCartTest();
        //single product (HP LP3065) addition to check out page test (as a registered user)
        addHPLP3065ProductToCheckoutRegUserTest();
        //single product (HP LP3065) check out confirmation test (as a registered user)
        validHPLP3065ProductOrderCheckoutConfirmationRegUserTest();
    }

    //invalid check out confirmation tests (as a guest) -> only guest branch is being tested since few negative scenarios registered user has, are similar to the guest

    //Test 016b -> invalid single product (HP LP3065) check out confirmation test (as a guest) - no guest first name
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

    //Test 016c -> invalid single product (HP LP3065) check out confirmation test (as a guest) - no guest last name
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

    //Test 016d -> invalid single product (HP LP3065) check out confirmation test (as a guest) - no guest email
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

    //Test 016e -> invalid single product (HP LP3065) check out confirmation test (as a guest) - no guest phone
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

}
