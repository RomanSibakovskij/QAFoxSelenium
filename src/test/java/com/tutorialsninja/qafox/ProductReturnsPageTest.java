package com.tutorialsninja.qafox;

import com.tutorialsninja.qafox.utilities.TestMethods;
import org.junit.jupiter.api.*;

public class ProductReturnsPageTest extends TestMethods{

    //product return test

    //Test 018 -> single product return (HP LP3065) test (as a registered user) ('Order Error')
    @Test
    @DisplayName("Single Product (HP LP3065) Return Test - Order Error (as a registered user)")
    @Tag("Single_Product_Return")
    @Tag("Test_As_A_Reg_User")
    void singleProductReturnAsRegUserTest() {
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
        //single product (HP LP3065) return test (as a registered user) ('Order Error')
        returnProductOrderErrorTest();
    }

}
