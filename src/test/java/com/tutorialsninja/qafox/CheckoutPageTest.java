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
    void singleProductAdditionToCheckoutAsGuestTest() {
        //navigate to 'Desktops' category page test (as a guest)
        navigateToDesktopsCategoryDashboardPageTest();
        //single product (HP LP3065) addition to cart page test (as a guest)
        addHPLP3065ToCartTest();
        //single product (HP LP3065) addition to check out page test (as a guest)
        addHPLP3065ProductToCheckoutGuestTest();
        //single product (HP LP3065) check out confirmation test (as a guest)
        validHPLP3065ProductOrderCheckoutConfirmationGuestTest();
    }

}
