package com.tutorialsninja.qafox;

import com.tutorialsninja.qafox.utilities.TestMethods;
import org.junit.jupiter.api.*;

public class WishlistPageTest extends TestMethods{

    //valid product addition to wishlist tests - the result is similar for all categories (only registered users have this feature)

    //Test 008 -> valid featured product (MacBook) addition to wishlist test
    @Test
    @DisplayName("Valid Featured Product (MacBook) Addition To Wishlist Test")
    @Tag("Featured_Single_Product_Add_To_Wishlist")
    @Tag("Test_As_A_Reg_User")
    void singleFeaturedProductAddToWishlistTest(){
        RegisterPage registerPage = new RegisterPage(driver);
        AddAddressPage addAddressPage = new AddAddressPage(driver);
        //user navigation to 'Register' page test
        userNavigationToRegisterPageTest();
        //valid user account creation
        validUserAccountCreationTest(registerPage);
        //valid user address addition test
        validUserSingleMainAddressAdditionTest(addAddressPage);
        //single featured product (MacBook) addition to wishlist test
        addFeaturedProductToWishlistTest();
    }

    //Test 008a -> single available product (HP LP3065) addition to cart from wishlist test (multiple would have the same output)
    @Test
    @DisplayName("Single Available Product (HP LP3065) Addition To Cart From Wishlist Test")
    @Tag("Single_Available_Product_Add_To_Cart_From_Wishlist")
    @Tag("Test_As_A_Reg_User")
    void singleProductAddToCartFromWishlistTest(){
        RegisterPage registerPage = new RegisterPage(driver);
        AddAddressPage addAddressPage = new AddAddressPage(driver);
        //user navigation to 'Register' page test
        userNavigationToRegisterPageTest();
        //valid user account creation
        validUserAccountCreationTest(registerPage);
        //valid user address addition test
        validUserSingleMainAddressAdditionTest(addAddressPage);
        //single available product (HP LP3065) addition to cart from wishlist test
        addAvailableProductToCartFromWishlistTest();
    }

    //Test 008b -> valid multiple featured products (MacBook, Iphone, Apple Cinema 30'') addition to wishlist test
    @Test
    @DisplayName("Valid Multiple Featured Products (MacBook, Iphone, Apple Cinema 30'') Addition To Wishlist Test")
    @Tag("Featured_Multiple_Products_Add_To_Wishlist")
    @Tag("Test_As_A_Reg_User")
    void multipleFeaturedProductAddToWishlistTest(){
        RegisterPage registerPage = new RegisterPage(driver);
        AddAddressPage addAddressPage = new AddAddressPage(driver);
        //user navigation to 'Register' page test
        userNavigationToRegisterPageTest();
        //valid user account creation
        validUserAccountCreationTest(registerPage);
        //valid user address addition test
        validUserSingleMainAddressAdditionTest(addAddressPage);
        //multiple featured products (MacBook, Iphone, Apple Cinema 30'') addition to wishlist test
        addMultipleFeaturedProductsToWishlistTest();
    }

    //remove product from wishlist test - the result is similar for all categories / product quantities (only registered users have this feature)

    //Test 008c -> valid featured product (MacBook) removal to wishlist test
    @Test
    @DisplayName("Valid Featured Product (MacBook) Removal To Wishlist Test")
    @Tag("Featured_Single_Product_Remove_From_Wishlist")
    @Tag("Test_As_A_Reg_User")
    void singleFeaturedProductRemoveFromWishlistTest(){
        RegisterPage registerPage = new RegisterPage(driver);
        AddAddressPage addAddressPage = new AddAddressPage(driver);
        //user navigation to 'Register' page test
        userNavigationToRegisterPageTest();
        //valid user account creation
        validUserAccountCreationTest(registerPage);
        //valid user address addition test
        validUserSingleMainAddressAdditionTest(addAddressPage);
        //single featured product (MacBook) removal from wishlist test
        removeFeaturedProductFromWishlistTest();
    }
}
