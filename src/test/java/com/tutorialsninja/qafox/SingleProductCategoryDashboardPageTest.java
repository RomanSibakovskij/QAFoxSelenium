package com.tutorialsninja.qafox;

import com.tutorialsninja.qafox.utilities.TestMethods;
import org.junit.jupiter.api.*;

public class SingleProductCategoryDashboardPageTest extends TestMethods{

    //single product addition to cart tests

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

}
