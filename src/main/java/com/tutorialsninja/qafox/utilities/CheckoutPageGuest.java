package com.tutorialsninja.qafox.utilities;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;

public class CheckoutPageGuest extends BasePage{

    //checkout page guest relevant web elements
    //new customer section
    @FindBy(xpath = "//div[@id='collapse-checkout-option']//div[@class='col-sm-6'][1]//input[@value='guest']")
    private WebElement checkoutPageNewCustomerGuestAccountRadioButton;
    @FindBy(xpath = "//div[@id='collapse-checkout-option']//div[@class='col-sm-6'][1]/input")
    private WebElement checkoutPageNewCustomerContinueButton;
    //billing details section
    @FindBy(xpath = "//div[@id='collapse-payment-address']//div[@class='col-sm-6'][1]//input[@id='input-payment-firstname']")
    private WebElement checkoutPageFirstNameInputField;
    @FindBy(xpath = "//div[@id='collapse-payment-address']//div[@class='col-sm-6'][1]//input[@id='input-payment-lastname']")
    private WebElement checkoutPageLastNameInputField;
    @FindBy(xpath = "//div[@id='collapse-payment-address']//div[@class='col-sm-6'][1]//input[@id='input-payment-email']")
    private WebElement checkoutPageEmailInputField;
    @FindBy(xpath = "//div[@id='collapse-payment-address']//div[@class='col-sm-6'][1]//input[@id='input-payment-telephone']")
    private WebElement checkoutPagePhoneInputField;
    @FindBy(xpath = "//div[@id='collapse-payment-address']//div[@class='col-sm-6'][2]/fieldset/legend")
    private WebElement checkoutPageAddressDetailsSectionTitle;
    @FindBy(xpath = "//div[@id='collapse-payment-address']//div[@class='col-sm-6'][2]//input[@id='input-payment-company']")
    private WebElement checkoutPageCompanyInputField;
    @FindBy(xpath = "//div[@id='collapse-payment-address']//div[@class='col-sm-6'][2]//input[@id='input-payment-address-1']")
    private WebElement checkoutPageAddress1InputField;
    @FindBy(xpath = "//div[@id='collapse-payment-address']//div[@class='col-sm-6'][2]//input[@id='input-payment-address-2']")
    private WebElement checkoutPageAddress2InputField;
    @FindBy(xpath = "//div[@id='collapse-payment-address']//div[@class='col-sm-6'][2]//input[@id='input-payment-city']")
    private WebElement checkoutPageCityInputField;
    @FindBy(xpath = "//div[@id='collapse-payment-address']//div[@class='col-sm-6'][2]//input[@id='input-payment-postcode']")
    private WebElement checkoutPagePostCodeInputField;
    @FindBy(xpath = "//div[@id='collapse-payment-address']//div[@class='col-sm-6'][2]//select[@id='input-payment-country']")
    private WebElement checkoutPageCountryDropdownMenu;
    @FindBy(xpath = "//select[@id='input-payment-country']/option[@value='223']")
    private WebElement checkoutPageUsCountryOption;
    @FindBy(xpath = "//div[@id='collapse-payment-address']//div[@class='col-sm-6'][2]//select[@id='input-payment-zone']")
    private WebElement checkoutPageStateDropdownMenu;
    @FindBy(xpath = "//select[@id='input-payment-zone']/option[@value='3635']")
    private WebElement checkoutPageIllinoisStateOption;
    @FindBy(xpath = "//div[@id='collapse-payment-address']//input[@name='shipping_address']")
    private WebElement checkoutPageDeliveryBillingAddressSameCheckbox;
    @FindBy(xpath = "//div[@id='collapse-payment-address']//input[@id='button-guest']")
    private WebElement checkoutPageGuestAccContinueButton;

    //valid guest input data
    private String validGuestFirstName;
    private String validGuestLastName;
    private String validGuestEmail;
    private String validGuestPhone;
    private String validGuestAddress;
    private String validGuestCity;
    private int validGuestPostCode;

    public CheckoutPageGuest(WebDriver driver) {super(driver);}

    //click 'Guest' radio button
    public void clickGuestAccountRadioButton() {
        Actions action = new Actions(driver);
        action.moveToElement(checkoutPageNewCustomerGuestAccountRadioButton).click().perform();
    }

    //click new customer section 'Continue' button
    public void clickNewCustomerContinueButton() {
        Actions action = new Actions(driver);
        action.moveToElement(checkoutPageNewCustomerContinueButton).click().perform();
    }

    //click 'Billing details' section country dropdown menu method
    public void clickBillingDetailsCountryDropdownMenu(){
        Actions actions = new Actions(driver);
        actions.moveToElement(checkoutPageCountryDropdownMenu).click().perform();
    }

    //select 'United States' option
    public void selectUsCountryOption(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(1100));
        wait.until(ExpectedConditions.elementToBeClickable(checkoutPageUsCountryOption));
        checkoutPageUsCountryOption.click();
    }

    //valid guest user data input getter
    public void validGuestAccountDataInputGetter(){

        validGuestFirstName = TestDataGenerator.getRandomFirstName();
        validGuestLastName = TestDataGenerator.getRandomLastName();
        validGuestEmail = TestDataGenerator.generateRandomEmailAddress(11);
        validGuestPhone = TestDataGenerator.generatePhoneNumber(7);
        validGuestAddress = TestDataGenerator.generateRandomAddress(8);
        validGuestCity = TestDataGenerator.getRandomCity();
        validGuestPostCode = TestDataGenerator.getRandomPostalCode();

        System.out.println("Valid guest user input generated data: " + "\n");
        logger.info("Valid guest user first name: " + validGuestFirstName);
        logger.info("Valid guest user last name: " + validGuestLastName);
        logger.info("Valid guest user email: " + validGuestEmail);
        logger.info("Valid guest user phone number: " + validGuestPhone);
        logger.info("Valid guest user address: " + validGuestAddress);
        logger.info("Valid guest user city: " + validGuestCity);
        logger.info("Valid guest user post code: " + validGuestPostCode);
        System.out.println("\n");

    }

    //valid guest user data input methods
    public void inputValidGuestFirstNameIntoFirstNameInputField(){checkoutPageFirstNameInputField.sendKeys(validGuestFirstName);}
    public void inputValidGuestLastNameIntoLastNameInputField(){checkoutPageLastNameInputField.sendKeys(validGuestLastName);}
    public void inputValidGuestEmailIntoEmailInputField(){checkoutPageEmailInputField.sendKeys(validGuestEmail);}
    public void inputValidGuestPhoneIntoPhoneInputField(){checkoutPagePhoneInputField.sendKeys(validGuestPhone);}
    public void inputValidGuestAddress1IntoAddress1InputField(){checkoutPageAddress1InputField.sendKeys(validGuestAddress);}
    public void inputValidGuestCityIntoCityInputField(){checkoutPageCityInputField.sendKeys(validGuestCity);}
    public void inputValidGuestPostCodeIntoPostCodeInputField(){checkoutPagePostCodeInputField.sendKeys(String.valueOf(validGuestPostCode));}

    //click 'Billing details' section state dropdown menu method
    public void clickBillingDetailsStateDropdownMenu(){
        Actions actions = new Actions(driver);
        actions.moveToElement(checkoutPageStateDropdownMenu).click().perform();
    }

    //select 'Illinois' option
    public void selectIllinoisStateOption(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(1100));
        wait.until(ExpectedConditions.elementToBeClickable(checkoutPageIllinoisStateOption));
        checkoutPageIllinoisStateOption.click();
    }

    //click 'Delivery and Billing addresses are same' checkbox method
    public void clickDeliveryBillingAddressSameCheckbox(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(900));
        wait.until(ExpectedConditions.elementToBeClickable(checkoutPageDeliveryBillingAddressSameCheckbox));
        checkoutPageDeliveryBillingAddressSameCheckbox.click();
    }

    //click 'Delivery and Billing addresses are same' checkbox method
    public void clickBillingDetailsContinueButton(){
        Actions action = new Actions(driver);
        action.moveToElement(checkoutPageGuestAccContinueButton).click().perform();
    }

}
