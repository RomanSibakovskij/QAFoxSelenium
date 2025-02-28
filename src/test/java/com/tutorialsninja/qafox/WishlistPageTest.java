package com.tutorialsninja.qafox;

import com.tutorialsninja.qafox.utilities.TestMethods;
import org.junit.jupiter.api.*;

public class WishlistPageTest extends TestMethods{

    //valid product addition to wishlist tests - the result is similar for all categories (only registered users have this feature)

    //Test 008 -> valid featured product (MacBook) addition to wishlist test
    @Test
    @DisplayName("Valid Featured Product (MacBook) Addition To Wishlist Test")
    @Tag("Featured_Single_Product_Add_To_Wishlist")
    @Tag("Reg_User_Tests")
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

    //Test 008a -> valid multiple featured products (MacBook, Iphone, Apple Cinema 30'') addition to wishlist test
    @Test
    @DisplayName("Valid Multiple Featured Products (MacBook, Iphone, Apple Cinema 30'') Addition To Wishlist Test")
    @Tag("Featured_Multiple_Products_Add_To_Wishlist")
    @Tag("Reg_User_Tests")
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

}
