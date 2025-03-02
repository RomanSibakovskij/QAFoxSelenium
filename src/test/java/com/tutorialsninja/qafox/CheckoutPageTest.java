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

    //Test 016a -> single product (HP LP3065) check out confirmation test (as a registered user)
    @Test
    @DisplayName("Single Product (HP LP3065) Checkout Confirmation Test (as a registered user)")
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

    //Test 016b -> multiple products (HP LP3065) check out confirmation test (as a guest)
    @Test
    @DisplayName("Multiple Products (HP LP3065) Checkout Confirmation Test (as a guest)")
    @Tag("Multiple_Products_Checkout")
    @Tag("Test_As_A_Guest")
    void multipleProductCheckoutConfirmationAsGuestTest() {
        //navigate to 'Desktops' category page test (as a guest)
        navigateToDesktopsCategoryDashboardPageTest();
        //multiple products (HP LP3065) addition to cart page test (as a guest)
        addMultipleHPLP3065ProductsToCartGuestTest();
        //multiple products (HP LP3065) addition to check out page test (as a guest)
        addHPLP3065ProductToCheckoutGuestTest();
        //multiple products (HP LP3065) check out confirmation test (as a guest)
        validHPLP3065ProductOrderCheckoutConfirmationGuestTest();
    }

    //Test 016c ->  multiple products (HP LP3065) check out confirmation test (as a registered user)
    @Test
    @DisplayName("Multiple Products (HP LP3065) Checkout Confirmation Test (as a registered user)")
    @Tag("Multiple_Product_Checkout")
    @Tag("Test_As_A_Reg_User")
    void multipleProductCheckoutConfirmationAsRegUserTest() {
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
        //multiple products (HP LP3065) addition to cart page test (as a registered user)
        addMultipleHPLP3065ProductsToCartRegUserTest();
        //multiple products (HP LP3065) addition to check out page test (as a registered user)
        addHPLP3065ProductToCheckoutRegUserTest();
        //multiple products (HP LP3065) check out confirmation test (as a registered user)
        validHPLP3065ProductOrderCheckoutConfirmationRegUserTest();
    }

    //invalid check out confirmation tests (as a guest) -> only guest branch is being tested since few negative scenarios registered user has, are similar to the guest

    //Test 016d -> invalid single product (HP LP3065) check out confirmation test (as a guest) - no guest first name
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

    //Test 016e -> invalid single product (HP LP3065) check out confirmation test (as a guest) - no guest last name
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

    //Test 016f -> invalid single product (HP LP3065) check out confirmation test (as a guest) - no guest email
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

    //Test 016g -> invalid single product (HP LP3065) check out confirmation test (as a guest) - no guest phone
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

    //Test 016h -> invalid single product (HP LP3065) check out confirmation test (as a guest) - no guest address
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

    //Test 016i -> invalid single product (HP LP3065) check out confirmation test (as a guest) - no guest city
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

    //Test 016j -> invalid single product (HP LP3065) check out confirmation test (as a guest) - no guest post code (the error wasn't triggered, test has failed)
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

    //Test 016k -> invalid single product (HP LP3065) check out confirmation test (as a guest) - no guest country
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

}
