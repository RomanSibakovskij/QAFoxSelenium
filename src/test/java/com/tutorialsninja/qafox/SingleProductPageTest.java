package com.tutorialsninja.qafox;

import com.tutorialsninja.qafox.utilities.TestMethods;
import org.junit.jupiter.api.*;

public class SingleProductPageTest extends TestMethods{

    //single product page invalid review submission tests (only guest branch is tested since both guest and registered user will have the same output) (they don't impact the addition to cart process, the review simple fails to be added)

    //Test 012 -> single product (HP LP3065) addition to cart page without review username test
    @Test
    @DisplayName("Add Single Product (HP LP3065) To Cart Without Review Username Test")
    @Tag("Single_Product_Addition_To_Cart")
    @Tag("Invalid_Review_Test")
    void singleProductAdditionToCartNoReviewUsernameTest() {
        //navigate to 'Desktops' category page test (as a guest)
        navigateToDesktopsCategoryDashboardPageTest();
        //single product (HP LP3065) addition to cart page without review username test
        addHPLP3065ToCartWithoutReviewUserNameTest();
    }

}
