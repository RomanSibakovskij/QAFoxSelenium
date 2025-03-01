package com.tutorialsninja.qafox;

import com.tutorialsninja.qafox.utilities.TestMethods;
import org.junit.jupiter.api.*;

public class SingleProductPageTest extends TestMethods{

    //single product page invalid review submission tests (only guest branch is tested since both guest and registered user will have the same output) (they don't impact the addition to cart process, the review simple fails to be added)

    //no singular input

    //Test 012 -> single product (HP LP3065) addition to cart page without review username test
    @Test
    @DisplayName("Add Single Product (HP LP3065) To Cart Without Review Username Test")
    @Tag("Single_Product_Addition_To_Cart")
    @Tag("Invalid_Review_Test")
    @Tag("No_Singular_Input")
    void singleProductAdditionToCartNoReviewUsernameTest() {
        //navigate to 'Desktops' category page test (as a guest)
        navigateToDesktopsCategoryDashboardPageTest();
        //single product (HP LP3065) addition to cart page without review username test
        addHPLP3065ToCartWithoutReviewUserNameTest();
    }

    //Test 012a -> single product (HP LP3065) addition to cart page without review text test
    @Test
    @DisplayName("Add Single Product (HP LP3065) To Cart Without Review Text Test")
    @Tag("Single_Product_Addition_To_Cart")
    @Tag("Invalid_Review_Test")
    @Tag("No_Singular_Input")
    void singleProductAdditionToCartNoReviewTextTest() {
        //navigate to 'Desktops' category page test (as a guest)
        navigateToDesktopsCategoryDashboardPageTest();
        //single product (HP LP3065) addition to cart page without review text test
        addHPLP3065ToCartWithoutReviewTextTest();
    }

    //Test 012b -> single product (HP LP3065) addition to cart page without review rating test
    @Test
    @DisplayName("Add Single Product (HP LP3065) To Cart Without Review Rating Test")
    @Tag("Single_Product_Addition_To_Cart")
    @Tag("Invalid_Review_Test")
    @Tag("No_Singular_Input")
    void singleProductAdditionToCartNoReviewRatingTest() {
        //navigate to 'Desktops' category page test (as a guest)
        navigateToDesktopsCategoryDashboardPageTest();
        //single product (HP LP3065) addition to cart page without review rating test
        addHPLP3065ToCartWithoutReviewRatingTest();
    }

    //too short singular input

    //Test 012c -> single product (HP LP3065) addition to cart page with too short review username test (2 chars)
    @Test
    @DisplayName("Add Single Product (HP LP3065) To Cart With Too Short Review Username Test")
    @Tag("Single_Product_Addition_To_Cart")
    @Tag("Invalid_Review_Test")
    @Tag("Too_Short_Singular_Input")
    void singleProductAdditionToCartTooShortReviewUsernameTest() {
        //navigate to 'Desktops' category page test (as a guest)
        navigateToDesktopsCategoryDashboardPageTest();
        //single product (HP LP3065) addition to cart page with too short review username test (2 chars)
        addHPLP3065ToCartWithTooShortReviewUserNameTest();
    }

    //Test 012d -> single product (HP LP3065) addition to cart page with too short review text test (24 chars)
    @Test
    @DisplayName("Add Single Product (HP LP3065) To Cart With Too Short Review Text Test")
    @Tag("Single_Product_Addition_To_Cart")
    @Tag("Invalid_Review_Test")
    @Tag("Too_Short_Singular_Input")
    void singleProductAdditionToCartTooShortReviewTextTest() {
        //navigate to 'Desktops' category page test (as a guest)
        navigateToDesktopsCategoryDashboardPageTest();
        //single product (HP LP3065) addition to cart page with too short review text test (24 chars)
        addHPLP3065ToCartWithTooShortReviewTextTest();
    }

    //too long singular input

    //Test 012e -> single product (HP LP3065) addition to cart page with too long review username test (26 chars)
    @Test
    @DisplayName("Add Single Product (HP LP3065) To Cart With Too Long Review Username Test")
    @Tag("Single_Product_Addition_To_Cart")
    @Tag("Invalid_Review_Test")
    @Tag("Too_Long_Singular_Input")
    void singleProductAdditionToCartTooLongReviewUsernameTest() {
        //navigate to 'Desktops' category page test (as a guest)
        navigateToDesktopsCategoryDashboardPageTest();
        //single product (HP LP3065) addition to cart page with too long review username test (26 chars)
        addHPLP3065ToCartWithTooLongReviewUserNameTest();
    }

    //Test 012f -> single product (HP LP3065) addition to cart page with too long review text test (1001 chars)
    @Test
    @DisplayName("Add Single Product (HP LP3065) To Cart With Too Long Review Text Test")
    @Tag("Single_Product_Addition_To_Cart")
    @Tag("Invalid_Review_Test")
    @Tag("Too_Long_Singular_Input")
    void singleProductAdditionToCartTooLongReviewTextTest() {
        //navigate to 'Desktops' category page test (as a guest)
        navigateToDesktopsCategoryDashboardPageTest();
        //single product (HP LP3065) addition to cart page with too long review text test (1001 chars)
        addHPLP3065ToCartWithTooLongReviewTextTest();
    }

    //single product page invalid delivery date submission tests (only guest branch is tested since both guest and registered user will have the same output)

    //Test 013 -> single product (HP LP3065) addition to cart page without delivery date test
    @Test
    @DisplayName("Add Single Product (HP LP3065) To Cart With No Delivery Date Test")
    @Tag("Single_Product_Addition_To_Cart")
    @Tag("Invalid_Delivery_Date_Test")
    @Tag("No_Singular_Input")
    void singleProductAdditionToCartNoDeliveryDateTest() {
        //navigate to 'Desktops' category page test (as a guest)
        navigateToDesktopsCategoryDashboardPageTest();
        //single product (HP LP3065) addition to cart page without delivery date test
        invalidAddHPLP3065ToCartNoDeliveryDateTest();
    }

    //Test 013a -> single product (HP LP3065) addition to cart page with reversed delivery date test
    @Test
    @DisplayName("Add Single Product (HP LP3065) To Cart With Reversed Delivery Date Test")
    @Tag("Single_Product_Addition_To_Cart")
    @Tag("Invalid_Delivery_Date_Test")
    @Tag("Reversed_Singular_Input")
    void singleProductAdditionToCartReversedDeliveryDateTest() {
        //navigate to 'Desktops' category page test (as a guest)
        navigateToDesktopsCategoryDashboardPageTest();
        //single product (HP LP3065) addition to cart page with reversed delivery date test
        invalidAddHPLP3065ToCartReversedDeliveryDateTest();
    }

}
