package com.tutorialsninja.qafox;

import com.tutorialsninja.qafox.utilities.TestMethods;
import org.junit.jupiter.api.*;

public class OrderHistoryPageTest extends TestMethods{

    //checked out order history tests

    //Test 017 -> single product (HP LP3065) order history confirmation test (as a guest)
    @Test
    @DisplayName("Single Product (HP LP3065) Order History Confirmation Test (as a guest)")
    @Tag("Single_Product_Order_Confirmation")
    @Tag("Test_As_A_Guest")
    void singleProductCheckedOutOrderConfirmationAsGuestTest() {
        //navigate to 'Desktops' category page test (as a guest)
        navigateToDesktopsCategoryDashboardPageTest();
        //single product (HP LP3065) addition to cart page test (as a guest)
        addHPLP3065ToCartTest();
        //single product (HP LP3065) addition to check out page test (as a guest)
        addHPLP3065ProductToCheckoutGuestTest();
        //single product (HP LP3065) check out confirmation test (as a guest)
        validHPLP3065ProductOrderCheckoutConfirmationGuestTest();
        //single product (HP LP3065) order history confirmation test (as a guest)
        confirmPlacedOrderGuestTest();
    }

    //Test 017a -> single product (HP LP3065) order history confirmation test (as a registered user)
    @Test
    @DisplayName("Add Single Product (HP LP3065) Order History Confirmation Test (as a registered user)")
    @Tag("Single_Product_Order_Confirmation")
    @Tag("Test_As_A_Reg_User")
    void singleProductCheckedOutOrderConfirmationAsRegUserTest() {
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
        //single product (HP LP3065) order history confirmation test (as a registered user)
        confirmPlacedOrderRegUserTest();
    }

}
