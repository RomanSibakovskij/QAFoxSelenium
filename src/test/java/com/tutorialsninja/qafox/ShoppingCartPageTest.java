package com.tutorialsninja.qafox;

import com.tutorialsninja.qafox.utilities.TestMethods;
import org.junit.jupiter.api.*;

public class ShoppingCartPageTest extends TestMethods{

    //single product addition to check out tests

    //Test 015 -> single product (HP LP3065) addition to check out page test (as a guest)
    @Test
    @DisplayName("Add Single Product (HP LP3065) To Checkout Test (as a guest)")
    @Tag("Single_Product_Addition_To_Checkout")
    @Tag("Test_As_A_Guest")
    void singleProductAdditionToCheckoutAsGuestTest() {
        //navigate to 'Desktops' category page test (as a guest)
        navigateToDesktopsCategoryDashboardPageTest();
        //single product (HP LP3065) addition to cart page test (as a guest)
        addHPLP3065ToCartTest();
        //single product (HP LP3065) addition to check out page test (as a guest)
        addHPLP3065ProductToCheckoutGuestTest();
    }

    //Test 015a -> single product (HP LP3065) addition to check out page test (as a registered user)
    @Test
    @DisplayName("Add Single Product (HP LP3065) To Checkout Test (as a registered user)")
    @Tag("Single_Product_Addition_To_Checkout")
    @Tag("Test_As_A_Reg_User")
    void singleProductAdditionToCheckoutAsRegUserTest() {
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
    }

    //multiple product addition to check out tests

    //Test 015b -> multiple products (HP LP3065) addition to check out page test (as a guest)
    @Test
    @DisplayName("Add Multiple Products (HP LP3065) To Checkout Test (as a guest)")
    @Tag("Multiple_Products_Addition_To_Checkout")
    @Tag("Test_As_A_Guest")
    void multipleProductsAdditionToCheckoutAsGuestTest() {
        //navigate to 'Desktops' category page test (as a guest)
        navigateToDesktopsCategoryDashboardPageTest();
        //multiple products (HP LP3065) addition to cart page test (as a guest)
        addMultipleHPLP3065ProductsToCartGuestTest();
        //multiple products (HP LP3065) addition to check out page test (as a guest)
        addHPLP3065ProductToCheckoutGuestTest();
    }

    //Test 015c -> multiple products (HP LP3065) addition to check out page test (as a registered user)
    @Test
    @DisplayName("Add Multiple Products (HP LP3065) To Checkout Test (as a registered user)")
    @Tag("Multiple_Products_Addition_To_Checkout")
    @Tag("Test_As_A_Reg_User")
    void multipleProductsAdditionToCheckoutAsRegUserTest() {
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
    }

    //update product quantity during addition to check out test (guest and registered user will have the same output, guest branch only is tested)

    //Test 015d -> product quantity update during (HP LP3065) addition to check out page test (as a guest)
    @Test
    @DisplayName("Product Quantity Update During Addition (HP LP3065) To Checkout Test (as a guest)")
    @Tag("Products_Qty_Update_During_Addition_To_Checkout")
    @Tag("Test_As_A_Guest")
    void productQtyUpdateDuringAdditionToCheckoutTest() {
        //navigate to 'Desktops' category page test (as a guest)
        navigateToDesktopsCategoryDashboardPageTest();
        //single product (HP LP3065) addition to cart page test (as a guest)
        addHPLP3065ToCartTest();
        //product quantity update (HP LP3065) during addition to check out page test (as a guest)
        updateHPLP3065ProductQtyToCheckoutGuestTest();
    }
}
