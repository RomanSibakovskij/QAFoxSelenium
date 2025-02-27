package com.tutorialsninja.qafox;

import com.tutorialsninja.qafox.utilities.TestMethods;
import org.junit.jupiter.api.*;

public class AddAddressPageTest extends TestMethods{

    //valid single address addition test

    //Test 007 -> valid user address addition test
    @Test
    @DisplayName("Valid User Address Addition Test")
    @Tag("Valid_Singular_Address_Addition")
    void validAccountAddressAdditionTest(){
        RegisterPage registerPage = new RegisterPage(driver);
        AddAddressPage addAddressPage = new AddAddressPage(driver);
        //user navigation to 'Register' page test
        userNavigationToRegisterPageTest();
        //valid user account creation
        validUserAccountCreationTest(registerPage);
        //valid user address addition test
        validUserSingleMainAddressAdditionTest(addAddressPage);
    }

    //valid multiple addresses addition test

    //Test 007a -> valid multiple addresses addition test
    @Test
    @DisplayName("Valid Multiple Addresses Addition Test")
    @Tag("Valid_Multiple_Addresses_Addition")
    void validAccountMultipleAddressesAdditionTest(){
        RegisterPage registerPage = new RegisterPage(driver);
        AddAddressPage addAddressPage = new AddAddressPage(driver);
        //user navigation to 'Register' page test
        userNavigationToRegisterPageTest();
        //valid user account creation
        validUserAccountCreationTest(registerPage);
        //valid user multiple addresses addition test
        validUserMultipleAddressesAdditionTest(addAddressPage);
    }

}
