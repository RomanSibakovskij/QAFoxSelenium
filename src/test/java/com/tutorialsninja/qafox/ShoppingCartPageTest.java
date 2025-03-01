package com.tutorialsninja.qafox;

import com.tutorialsninja.qafox.utilities.TestMethods;
import org.junit.jupiter.api.*;

public class ShoppingCartPageTest extends TestMethods{

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
}
