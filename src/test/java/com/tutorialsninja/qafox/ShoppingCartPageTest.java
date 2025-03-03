package com.tutorialsninja.qafox;

import com.tutorialsninja.qafox.utilities.TestMethods;
import org.junit.jupiter.api.*;

public class ShoppingCartPageTest extends TestMethods{

    //single product addition to check out tests

    //Test 014 -> single product (HP LP3065) addition to check out page test (as a guest)
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

    //Test 014a -> single product (HP LP3065) addition to check out page test (as a registered user)
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

    //Test 014b -> multiple products (HP LP3065) addition to check out page test (as a guest)
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

    //Test 014c -> multiple products (HP LP3065) addition to check out page test (as a registered user)
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

    //Test 014d -> product quantity update during (HP LP3065) addition to check out page test
    @Test
    @DisplayName("Product Quantity Update During Addition (HP LP3065) To Checkout Test")
    @Tag("Products_Qty_Update_During_Addition_To_Checkout")
    @Tag("Test_As_A_Guest")
    void productQtyUpdateDuringAdditionToCheckoutTest() {
        //navigate to 'Desktops' category page test (as a guest)
        navigateToDesktopsCategoryDashboardPageTest();
        //single product (HP LP3065) addition to cart page test (as a guest)
        addHPLP3065ToCartTest();
        //product quantity update (HP LP3065) during addition to check out page test (as a guest)
        updateHPLP3065ProductQtyToCheckoutTest();
    }

    //product remove from shopping cart test (guest and registered user will have the same output, guest branch only is tested)

    //Test 014e -> product remove (HP LP3065) from shopping cart test
    @Test
    @DisplayName("Product Remove (HP LP3065) From Shopping Cart Test")
    @Tag("Product_Remove_From_Shopping_Cart")
    @Tag("Test_As_A_Guest")
    void removeProductFromShoppingCartTest() {
        //navigate to 'Desktops' category page test (as a guest)
        navigateToDesktopsCategoryDashboardPageTest();
        //single product (HP LP3065) addition to cart page test (as a guest)
        addHPLP3065ToCartTest();
        //product remove (HP LP3065) from shopping cart test (as a guest)
        removeHPLP3065ProductFromShoppingCartTest();
    }

    //update product quantity during addition to check out test (guest and registered user will have the same output, guest branch only is tested)

    //Test 014f -> single product (HP LP3065) addition to check out (without shipping country and state) page test
    @Test
    @DisplayName("Add Single Product (HP LP3065) To Checkout Without Shipping Country And State Test")
    @Tag("Single_Product_Addition_To_Checkout")
    @Tag("Product_Addition_Without_Shipping_Country_State")
    @Tag("Test_As_A_Guest")
    void addProductToCheckoutWithoutShipCountryStateTest() {
        //navigate to 'Desktops' category page test (as a guest)
        navigateToDesktopsCategoryDashboardPageTest();
        //single product (HP LP3065) addition to cart page test (as a guest)
        addHPLP3065ToCartTest();
        //single product (HP LP3065) addition to check out (without shipping country and state) page test (as a guest)
        addHPLP3065ProductToCheckoutWithoutShippingCountryStateTest();
    }

}
