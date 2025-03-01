package com.tutorialsninja.qafox;

import com.tutorialsninja.qafox.utilities.TestMethods;
import org.junit.jupiter.api.*;

public class ProductComparisonPageTest extends TestMethods{

    //tests as a guest

    //Test 010 -> add set products (HP LP3065, Iphone, Canon EOS 5ED) to product compare page test (as a guest)
    @Test
    @DisplayName("Add Set Products (HP LP3065, Iphone, Canon EOS 5ED) To Compare Page Test (as a guest)")
    @Tag("Add_Products_To_Comparison_Page")
    @Tag("Test_As_A_Guest")
    void addProductsToCompareListAsGuestTest() {
        //navigate to 'Desktops' category page test (as a guest)
        navigateToDesktopsCategoryDashboardPageRegUserTest();
        //add products (HP LP3065, Iphone, Canon EOS 5ED) to compare list (as a guest)
        addProductsToCompareListTest();
    }

    //Test 010a -> add set product (HP LP3065) to cart from product compare page test (as a guest)
    @Test
    @DisplayName("Add Set Product (HP LP3065) To Cart From Compare Page Test (as a guest)")
    @Tag("Add_Product_To_Cart_From_Comparison_Page")
    @Tag("Test_As_A_Guest")
    void addProductsToCartFromCompareListAsGuestTest() {
        //navigate to 'Desktops' category page test (as a guest)
        navigateToDesktopsCategoryDashboardPageRegUserTest();
        //add product (HP LP3065) to cart from compare list (as a guest)
        addProductsToCartFromCompareListTest();
    }

    //Test 010b -> remove set products (HP LP3065, Iphone, Canon EOS 5ED) from product compare page test (as a guest)
    @Test
    @DisplayName("Remove Set Products (HP LP3065, Iphone, Canon EOS 5ED) From Compare Page Test (as a guest)")
    @Tag("Remove_Products_From_Comparison_Page")
    @Tag("Test_As_A_Guest")
    void removeProductsFromCompareListAsGuestTest() {
        //navigate to 'Desktops' category page test (as a guest)
        navigateToDesktopsCategoryDashboardPageRegUserTest();
        //remove products (HP LP3065, Iphone, Canon EOS 5ED) from compare list (as a guest)
        removeProductsFromCompareListTest();
    }

    //tests as a registered user

    //Test 010c -> add set products (HP LP3065, Iphone, Canon EOS 5ED) to product compare page test (as a registered user)
    @Test
    @DisplayName("Add Set Products (HP LP3065, Iphone, Canon EOS 5ED) To Compare Page Test (as a registered user)")
    @Tag("Add_Products_To_Comparison_Page")
    @Tag("Test_As_A_Reg_User")
    void addProductToCompareListAsRegUserTest() {
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
        //add products (HP LP3065, Iphone, Canon EOS 5ED) to compare list (as a registered user)
        addProductsToCompareListTest();
    }

    //Test 010d -> add set product (HP LP3065) to cart from product compare page test (as a registered user)
    @Test
    @DisplayName("Add Set Product (HP LP3065) To Cart From Compare Page Test (as a registered user)")
    @Tag("Add_Product_To_Cart_From_Comparison_Page")
    @Tag("Test_As_A_Reg_User")
    void addProductToCartFromCompareListAsRegUserTest() {
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
        //add products (HP LP3065) to cart from compare list (as a registered user)
        addProductsToCartFromCompareListTest();
    }

}
