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

    //Test 007e -> invalid user address addition test - no city
    @Test
    @DisplayName("Invalid User Address Addition Test - No City")
    @Tag("Invalid_Singular_Address_Addition")
    @Tag("No_Singular_Input")
    void invalidUserAddressAdditionNoCityTest(){
        RegisterPage registerPage = new RegisterPage(driver);
        AddAddressPage addAddressPage = new AddAddressPage(driver);
        //user navigation to 'Register' page test
        userNavigationToRegisterPageTest();
        //valid user account creation
        validUserAccountCreationTest(registerPage);
        //invalid user address addition test - no city
        invalidUserSingleAddressAdditionNoCityTest(addAddressPage);
    }

    //Test 007f -> invalid user address addition test - no country
    @Test
    @DisplayName("Invalid User Address Addition Test - No Country")
    @Tag("Invalid_Singular_Address_Addition")
    @Tag("No_Singular_Input")
    void invalidUserAddressAdditionNoCountryTest(){
        RegisterPage registerPage = new RegisterPage(driver);
        AddAddressPage addAddressPage = new AddAddressPage(driver);
        //user navigation to 'Register' page test
        userNavigationToRegisterPageTest();
        //valid user account creation
        validUserAccountCreationTest(registerPage);
        //invalid user address addition test - no country
        invalidUserSingleAddressAdditionNoCountryTest(addAddressPage);
    }

    //Test 007g -> invalid user address addition test - no state
    @Test
    @DisplayName("Invalid User Address Addition Test - No State")
    @Tag("Invalid_Singular_Address_Addition")
    @Tag("No_Singular_Input")
    void invalidUserAddressAdditionNoStateTest(){
        RegisterPage registerPage = new RegisterPage(driver);
        AddAddressPage addAddressPage = new AddAddressPage(driver);
        //user navigation to 'Register' page test
        userNavigationToRegisterPageTest();
        //valid user account creation
        validUserAccountCreationTest(registerPage);
        //invalid user address addition test - no state
        invalidUserSingleAddressAdditionNoStateTest(addAddressPage);
    }

    //too short singular input

    //Test 007h -> invalid user address addition test - too short first name  (1 char) (the user address gets added, test has failed)
    @Test
    @DisplayName("Invalid User Address Addition Test - Too Short First Name")
    @Tag("Invalid_Singular_Address_Addition")
    @Tag("Too_Short_Singular_Input")
    void invalidUserAddressAdditionTooShortFirstNameTest(){
        RegisterPage registerPage = new RegisterPage(driver);
        AddAddressPage addAddressPage = new AddAddressPage(driver);
        //user navigation to 'Register' page test
        userNavigationToRegisterPageTest();
        //valid user account creation
        validUserAccountCreationTest(registerPage);
        //invalid user address addition test - too short first name (1 char)
        invalidUserSingleAddressAdditionTooShortFirstNameTest(addAddressPage);
    }

    //Test 007i -> invalid user address addition test - too short last name  (1 char) (the user address gets added, test has failed)
    @Test
    @DisplayName("Invalid User Address Addition Test - Too Short Last Name")
    @Tag("Invalid_Singular_Address_Addition")
    @Tag("Too_Short_Singular_Input")
    void invalidUserAddressAdditionTooShortLastNameTest(){
        RegisterPage registerPage = new RegisterPage(driver);
        AddAddressPage addAddressPage = new AddAddressPage(driver);
        //user navigation to 'Register' page test
        userNavigationToRegisterPageTest();
        //valid user account creation
        validUserAccountCreationTest(registerPage);
        //invalid user address addition test - too short last name (1 char)
        invalidUserSingleAddressAdditionTooShortLastNameTest(addAddressPage);
    }

    //Test 007j -> invalid user address addition test - too short address  (2 chars)
    @Test
    @DisplayName("Invalid User Address Addition Test - Too Short Address")
    @Tag("Invalid_Singular_Address_Addition")
    @Tag("Too_Short_Singular_Input")
    void invalidUserAddressAdditionTooShortAddressTest(){
        RegisterPage registerPage = new RegisterPage(driver);
        AddAddressPage addAddressPage = new AddAddressPage(driver);
        //user navigation to 'Register' page test
        userNavigationToRegisterPageTest();
        //valid user account creation
        validUserAccountCreationTest(registerPage);
        //invalid user address addition test - too short address (2 chars)
        invalidUserSingleAddressAdditionTooShortAddress1Test(addAddressPage);
    }

    //Test 007k -> invalid user address addition test - too short city  (1 char)
    @Test
    @DisplayName("Invalid User Address Addition Test - Too Short City")
    @Tag("Invalid_Singular_Address_Addition")
    @Tag("Too_Short_Singular_Input")
    void invalidUserAddressAdditionTooShortCityTest(){
        RegisterPage registerPage = new RegisterPage(driver);
        AddAddressPage addAddressPage = new AddAddressPage(driver);
        //user navigation to 'Register' page test
        userNavigationToRegisterPageTest();
        //valid user account creation
        validUserAccountCreationTest(registerPage);
        //invalid user address addition test - too short city (1 char)
        invalidUserSingleAddressAdditionTooShortCityTest(addAddressPage);
    }

    //too long singular input

    //Test 007l -> invalid user address addition test - too long first name  (33 chars)
    @Test
    @DisplayName("Invalid User Address Addition Test - Too Long First Name")
    @Tag("Invalid_Singular_Address_Addition")
    @Tag("Too_Long_Singular_Input")
    void invalidUserAddressAdditionTooLongFirstNameTest(){
        RegisterPage registerPage = new RegisterPage(driver);
        AddAddressPage addAddressPage = new AddAddressPage(driver);
        //user navigation to 'Register' page test
        userNavigationToRegisterPageTest();
        //valid user account creation
        validUserAccountCreationTest(registerPage);
        //invalid user address addition test - too long first name (33 chars)
        invalidUserSingleAddressAdditionTooLongFirstNameTest(addAddressPage);
    }

    //Test 007m -> invalid user address addition test - too long last name  (33 chars)
    @Test
    @DisplayName("Invalid User Address Addition Test - Too Long Last Name")
    @Tag("Invalid_Singular_Address_Addition")
    @Tag("Too_Long_Singular_Input")
    void invalidUserAddressAdditionTooLongLastNameTest(){
        RegisterPage registerPage = new RegisterPage(driver);
        AddAddressPage addAddressPage = new AddAddressPage(driver);
        //user navigation to 'Register' page test
        userNavigationToRegisterPageTest();
        //valid user account creation
        validUserAccountCreationTest(registerPage);
        //invalid user address addition test - too long last name (33 chars)
        invalidUserSingleAddressAdditionTooLongLastNameTest(addAddressPage);
    }

    //Test 007n -> invalid user address addition test - too long address  (129 chars)
    @Test
    @DisplayName("Invalid User Address Addition Test - Too Long Address")
    @Tag("Invalid_Singular_Address_Addition")
    @Tag("Too_Long_Singular_Input")
    void invalidUserAddressAdditionTooLongAddressTest(){
        RegisterPage registerPage = new RegisterPage(driver);
        AddAddressPage addAddressPage = new AddAddressPage(driver);
        //user navigation to 'Register' page test
        userNavigationToRegisterPageTest();
        //valid user account creation
        validUserAccountCreationTest(registerPage);
        //invalid user address addition test - too long address (129 chars)
        invalidUserSingleAddressAdditionTooLongAddressTest(addAddressPage);
    }

}
