package com.tutorialsninja.qafox;

import com.tutorialsninja.qafox.utilities.TestMethods;
import org.junit.jupiter.api.*;

public class SingleProductCategoryDashboardPageTest extends TestMethods{

    //single (specific category) product addition to cart tests

    //Test 011 -> single product (HP LP3065) addition to cart page test (as a guest)
    @Test
    @DisplayName("Add Single Product (HP LP3065) To Cart Test (as a guest)")
    @Tag("Single_Product_Addition_To_Cart")
    @Tag("Test_As_A_Guest")
    void singleProductAdditionToCartAsGuestTest() {
        //navigate to 'Desktops' category page test (as a guest)
        navigateToDesktopsCategoryDashboardPageTest();
        //single product (HP LP3065) addition to cart page test (as a guest)
        addHPLP3065ToCartTest();
    }

    //Test 011a -> single product (HP LP3065) addition to cart page test (as a registered user)
    @Test
    @DisplayName("Add Single Product (HP LP3065) To Cart Test (as a registered user)")
    @Tag("Single_Product_Addition_To_Cart")
    @Tag("Test_As_A_Reg_User")
    void singleProductAdditionToCartAsRegUserTest() {
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
        addHPLP3065RegUserToCartTest();
    }

    //single (specific category) product removal from shopping cart dropdown menu test

    //Test 011b -> single product (HP LP3065) removal from shopping cart dropdown menu test (guest and registered user will have the same output)
    @Test
    @DisplayName("Remove Single Product (HP LP3065) From Shopping Cart Dropdown Menu Test (as a guest)")
    @Tag("Single_Product_Removal_From_Dropdown_Cart")
    @Tag("Test_As_A_Guest")
    void singleProductRemovalFromDropdownCartAsGuestTest() {
        //navigate to 'Desktops' category page test (as a guest)
        navigateToDesktopsCategoryDashboardPageTest();
        //single product (HP LP3065) removal from shopping cart dropdown menu test (as a guest)
        removeHPLP3065ProductFromShoppingCartDropdownMenuTest();
    }

    //single (specific category) product addition to cart tests

    //Test 011c -> single searched product (Ipod Touch) addition to cart page test (as a guest) (it's not currently in stock)
    @Test
    @DisplayName("Add Single Searched Product (Ipod Touch) To Cart Test (as a guest)")
    @Tag("Single_Searched_Product_Addition_To_Cart")
    @Tag("Test_As_A_Guest")
    void singleSearchedProductAdditionToCartAsGuestTest() {
        //single searched product (Ipod Touch) addition to cart page test (as a guest)
        addSearchedIpodTouchToCartTest();
    }

    //Test 011d -> single searched product (Ipod Touch) addition to cart page test (as a registered user) (it's not currently in stock)
    @Test
    @DisplayName("Add Single Searched Product (Ipod Touch) To Cart Test (as a registered user)")
    @Tag("Single_Searched_Product_Addition_To_Cart")
    @Tag("Test_As_A_Reg_User")
    void singleSearchedProductAdditionToCartAsRegUserTest() {
        RegisterPage registerPage = new RegisterPage(driver);
        AddAddressPage addAddressPage = new AddAddressPage(driver);
        //user navigation to 'Register' page test
        userNavigationToRegisterPageTest();
        //valid user account creation
        validUserAccountCreationTest(registerPage);
        //valid user address addition test
        validUserSingleMainAddressAdditionTest(addAddressPage);
        //single searched product (Ipod Touch) addition to cart page test (as a registered user)
        addSearchedIpodTouchToCartTest();
    }

}
