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

    //invalid user address addition tests

    //no singular input

    //Test 007b -> invalid user address addition test - no first name
    @Test
    @DisplayName("Invalid User Address Addition Test - No First Name")
    @Tag("Invalid_Singular_Address_Addition")
    @Tag("No_Singular_Input")
    void invalidUserAddressAdditionNoFirstNameTest(){
        RegisterPage registerPage = new RegisterPage(driver);
        AddAddressPage addAddressPage = new AddAddressPage(driver);
        //user navigation to 'Register' page test
        userNavigationToRegisterPageTest();
        //valid user account creation
        validUserAccountCreationTest(registerPage);
        //invalid user address addition test - no first name
        invalidUserSingleAddressAdditionNoFirstNameTest(addAddressPage);
    }

    //Test 007c -> invalid user address addition test - no last name
    @Test
    @DisplayName("Invalid User Address Addition Test - No Last Name")
    @Tag("Invalid_Singular_Address_Addition")
    @Tag("No_Singular_Input")
    void invalidUserAddressAdditionNoLastNameTest(){
        RegisterPage registerPage = new RegisterPage(driver);
        AddAddressPage addAddressPage = new AddAddressPage(driver);
        //user navigation to 'Register' page test
        userNavigationToRegisterPageTest();
        //valid user account creation
        validUserAccountCreationTest(registerPage);
        //invalid user address addition test - no last name
        invalidUserSingleAddressAdditionNoLastNameTest(addAddressPage);
    }

    //Test 007d -> invalid user address addition test - no address (address 1)
    @Test
    @DisplayName("Invalid User Address Addition Test - No Address")
    @Tag("Invalid_Singular_Address_Addition")
    @Tag("No_Singular_Input")
    void invalidUserAddressAdditionNoAddressTest(){
        RegisterPage registerPage = new RegisterPage(driver);
        AddAddressPage addAddressPage = new AddAddressPage(driver);
        //user navigation to 'Register' page test
        userNavigationToRegisterPageTest();
        //valid user account creation
        validUserAccountCreationTest(registerPage);
        //invalid user address addition test - no address (address 1)
        invalidUserSingleAddressAdditionNoAddress1Test(addAddressPage);
    }

}
