package com.tutorialsninja.qafox;

import com.tutorialsninja.qafox.utilities.TestMethods;
import org.junit.jupiter.api.*;

public class CheckoutPageTest extends TestMethods{

    //valid check out confirmation tests

    //Test 015 -> single product (HP LP3065) check out confirmation test (as a guest)
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

    //Test 015a -> single product (HP LP3065) check out confirmation test (as a registered user)
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

    //multiple products tests

    //Test 015b -> multiple products (HP LP3065) check out confirmation test (as a guest)
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

    //Test 015c ->  multiple products (HP LP3065) check out confirmation test (as a registered user)
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

}
