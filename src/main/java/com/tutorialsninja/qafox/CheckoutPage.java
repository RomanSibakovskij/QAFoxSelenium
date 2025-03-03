package com.tutorialsninja.qafox;

import com.tutorialsninja.qafox.utilities.*;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;
import java.util.*;
import java.util.stream.Collectors;

public class CheckoutPage extends BasePage {

    //checkout page web elements
    @FindBy(xpath = "//div[@id='content']/h1")
    private WebElement checkoutPageTitle;
    //customer section (for guest)
    @FindBy(xpath = "//div[@id='accordion']/div[1]//a[@data-parent='#accordion']")
    private WebElement checkoutPageCheckoutOptionsDropdownLink;
    @FindBy(xpath = "//div[@id='collapse-checkout-option']//div[@class='col-sm-6'][1]/h2")
    private WebElement checkoutPageNewCustomerSectionTitle;
    @FindBy(xpath = "//div[@id='collapse-checkout-option']//div[@class='col-sm-6'][1]/p[1]")
    private WebElement checkoutPageNewCustomerSectionSubtitle;
    @FindBy(xpath = "//div[@id='collapse-checkout-option']//div[@class='col-sm-6'][1]//input[@value='register']")
    private WebElement checkoutPageNewCustomerRegisterAccountRadioButton;
    @FindBy(xpath = "//div[@id='collapse-checkout-option']//div[@class='col-sm-6'][1]//input[@value='guest']")
    private WebElement checkoutPageNewCustomerGuestAccountRadioButton;
    @FindBy(xpath = "//div[@id='collapse-checkout-option']//div[@class='col-sm-6'][1]/p[2]")
    private WebElement checkoutPageNewCustomerSectionDescription;
    @FindBy(xpath = "//div[@id='collapse-checkout-option']//div[@class='col-sm-6'][1]/input")
    private WebElement checkoutPageNewCustomerContinueButton;
    @FindBy(xpath = "//div[@id='collapse-checkout-option']//div[@class='col-sm-6'][2]/h2")
    private WebElement checkoutPageReturningCustomerSectionTitle;
    @FindBy(xpath = "//div[@id='collapse-checkout-option']//div[@class='col-sm-6'][2]/p")
    private WebElement checkoutPageReturningCustomerSectionSubtitle;
    @FindBy(xpath = "//div[@id='collapse-checkout-option']//div[@class='col-sm-6'][2]//input[@id='input-email']")
    private WebElement checkoutPageReturningCustomerSectionEmailInputField;
    @FindBy(xpath = "//div[@id='collapse-checkout-option']//div[@class='col-sm-6'][2]//input[@id='input-password']")
    private WebElement checkoutPageReturningCustomerSectionPasswordInputField;
    @FindBy(xpath = "//div[@id='collapse-checkout-option']//div[@class='col-sm-6'][2]//a")
    private WebElement checkoutPageReturningCustomerSectionForgotPasswordLink;
    @FindBy(xpath = "//div[@id='collapse-checkout-option']//div[@class='col-sm-6'][2]/input")
    private WebElement checkoutPageReturningCustomerLoginButton;
    //guest account data input elements (billing details)
    @FindBy(xpath = "//div[@id='accordion']/div[2]//a[@data-parent='#accordion']")
    private WebElement checkoutPageBillingDetailsDropdownLink;
    @FindBy(xpath = "//div[@id='collapse-payment-address']//div[@class='col-sm-6'][1]/fieldset/legend")
    private WebElement checkoutPagePersonalDetailsSectionTitle;
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
    @FindBy(xpath = "//div[@id='collapse-payment-address']//div[@class='col-sm-6'][2]//select[@id='input-payment-zone']")
    private WebElement checkoutPageStateDropdownMenu;
    @FindBy(xpath = "//div[@id='collapse-payment-address']//input[@name='shipping_address']")
    private WebElement checkoutPageDeliveryBillingAddressSameCheckbox;
    @FindBy(xpath = "//div[@id='collapse-payment-address']//input[@id='button-guest']")
    private WebElement checkoutPageGuestAccContinueButton;
    @FindBy(xpath = "//input[@id='button-payment-address']")
    private WebElement checkoutPageBillingAddressContinueButton;
    //delivery address
    @FindBy(xpath = "//input[@id='button-shipping-address']")
    private WebElement checkoutPageDeliveryAddressContinueButton;
    //delivery method
    @FindBy(xpath = "//div[@id='collapse-shipping-method']//p[1]")
    private WebElement checkoutPageDeliveryMethodSubtext;
    @FindBy(xpath = "//div[@id='collapse-shipping-method']//input[@value='flat.flat']")
    private WebElement checkoutPageDeliveryFlatShippingRateRadioButton;
    @FindBy(xpath = "//div[@id='collapse-shipping-method']//textarea")
    private WebElement checkoutPageDeliveryCommentsTextbox;
    @FindBy(xpath = "//div[@id='collapse-shipping-method']//input[@id='button-shipping-method']")
    private WebElement checkoutPageDeliveryContinueButton;
    //payment method
    @FindBy(xpath = "//div[@id='collapse-payment-method']//p[1]")
    private WebElement checkoutPagePaymentMethodSubtext;
    @FindBy(xpath = "//div[@id='collapse-payment-method']//input[@value='cod']")
    private WebElement checkoutPagePaymentMethodCodRadioButton;
    @FindBy(xpath = "//div[@id='collapse-payment-method']//textarea")
    private WebElement checkoutPagePaymentCommentsTextbox;
    @FindBy(xpath = "//div[@id='collapse-payment-method']//input[@name='agree']")
    private WebElement checkoutPagePaymentTermsConditionsCheckbox;
    @FindBy(xpath = "//div[@id='collapse-payment-method']//a")
    private WebElement checkoutPagePaymentTermsConditionsLink;
    @FindBy(xpath = "//div[@id='collapse-payment-method']//input[@id='button-payment-method']")
    private WebElement checkoutPagePaymentContinueButton;
    //confirm order section
    //table list elements
    @FindBy(xpath = "//div[@id='collapse-checkout-confirm']//tbody/tr/td[1]/a")
    private List<WebElement> checkoutPageConfirmOrderProductNameLinkElements;
    @FindBy(xpath = "//div[@id='collapse-checkout-confirm']//tbody/tr/td[2]")
    private List<WebElement> checkoutPageConfirmOrderProductModelElements;
    @FindBy(xpath = "//div[@id='collapse-checkout-confirm']//tbody/tr/td[3]")
    private List<WebElement> checkoutPageConfirmOrderProductQuantityElements;
    @FindBy(xpath = "//div[@id='collapse-checkout-confirm']//tbody/tr/td[4]")
    private List<WebElement> checkoutPageConfirmOrderProductUnitPriceElements;
    @FindBy(xpath = "//div[@id='collapse-checkout-confirm']//tbody/tr/td[5]")
    private List<WebElement> checkoutPageConfirmOrderProductTotalPriceElements;
    //singular elements
    @FindBy(xpath = "//div[@id='collapse-checkout-confirm']//tfoot/tr[1]/td[2]")
    private WebElement checkoutPageConfirmSubtotalPrice;
    @FindBy(xpath = "//div[@id='collapse-checkout-confirm']//tfoot/tr[2]/td[2]")
    private WebElement checkoutPageConfirmFlatShippingRate;
    @FindBy(xpath = "//div[@id='collapse-checkout-confirm']//tfoot/tr[3]/td[2]")
    private WebElement checkoutPageConfirmEcoTax;
    @FindBy(xpath = "//div[@id='collapse-checkout-confirm']//table/tfoot/tr[4]/td[2]")
    private WebElement checkoutPageConfirmVATPrice;
    @FindBy(xpath = "//div[@id='collapse-checkout-confirm']//tfoot/tr[5]/td[2]")
    private WebElement checkoutPageConfirmTotalPrice;
    @FindBy(xpath = "//div[@id='collapse-checkout-confirm']//input")
    private WebElement checkoutPageConfirmOrderButton;

    public CheckoutPage(WebDriver driver) {super(driver);}

    //click delivery method section 'Continue' button
    public void clickDeliveryMethodContinueButton() {
        Actions action = new Actions(driver);
        action.moveToElement(checkoutPageDeliveryContinueButton).click().perform();
    }

    //click payment method section 'Terms and Conditions' checkbox method
    public void clickPayMethodTermsConditionsCheckbox(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(900));
        wait.until(ExpectedConditions.elementToBeClickable(checkoutPagePaymentTermsConditionsCheckbox));
        checkoutPagePaymentTermsConditionsCheckbox.click();
    }

    //click payment method section 'Continue' button
    public void clickPaymentMethodContinueButton() {
        Actions action = new Actions(driver);
        action.moveToElement(checkoutPagePaymentContinueButton).click().perform();
    }

    //click 'Confirm order' button method
    public void clickConfirmOrderButton() {
        Actions action = new Actions(driver);
        action.moveToElement(checkoutPageConfirmOrderButton).click().perform();
    }

    //registered user path

    //click billing address section 'Continue' button
    public void clickBillingAddressContinueButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(1500));
        wait.until(ExpectedConditions.elementToBeClickable(checkoutPageBillingAddressContinueButton));
        Actions action = new Actions(driver);
        action.moveToElement(checkoutPageBillingAddressContinueButton).click().perform();
    }

    //click delivery details section 'Continue' button
    public void clickDeliveryDetailsContinueButton() {
        Actions action = new Actions(driver);
        action.moveToElement(checkoutPageDeliveryAddressContinueButton).click().perform();
    }

    //checkout page text element getters
    public String getCheckoutPageTitle() {return checkoutPageTitle.getText();}
    //new customer section
    public String getCheckoutPageNewCustomerSectionTitle() {return checkoutPageNewCustomerSectionTitle.getText();}
    public String getCheckoutPageNewCustomerSectionSubtitle() {return checkoutPageNewCustomerSectionSubtitle.getText();}
    public String getCheckoutPageNewCustomerSectionDescription() {return checkoutPageNewCustomerSectionDescription.getText();}
    public String getCheckoutPageReturningCustomerSectionTitle() {return checkoutPageReturningCustomerSectionTitle.getText();}
    public String getCheckoutPageReturningCustomerSectionSubtitle() {return checkoutPageReturningCustomerSectionSubtitle.getText();}
    //billing details section
    public String getCheckoutPagePersonalDetailsSectionTitle() {return checkoutPagePersonalDetailsSectionTitle.getText();}
    public String getCheckoutPageAddressDetailsSectionTitle() {return checkoutPageAddressDetailsSectionTitle.getText();}
    //delivery method section
    public String getCheckoutPageDeliveryMethodSubtext() {return checkoutPageDeliveryMethodSubtext.getText();}
    //payment method section
    public String getCheckoutPagePaymentMethodSubtext() {return checkoutPagePaymentMethodSubtext.getText();}

    //checkout page product table data getters
    public List<String> getCheckoutPageProductName(){return checkoutPageConfirmOrderProductNameLinkElements.stream().map(WebElement::getText).collect(Collectors.toList());}
    public List<String> getCheckoutPageProductModel(){return checkoutPageConfirmOrderProductModelElements.stream().map(WebElement::getText).collect(Collectors.toList());}
    public List<String> getCheckoutPageProductQuantity(){return checkoutPageConfirmOrderProductQuantityElements.stream().map(WebElement::getText).collect(Collectors.toList());}
    public List<String> getCheckoutPageProductUnitPrice(){return checkoutPageConfirmOrderProductUnitPriceElements.stream().map(WebElement::getText).collect(Collectors.toList());}
    public List<String> getCheckoutPageProductTotalPrice(){return checkoutPageConfirmOrderProductTotalPriceElements.stream().map(WebElement::getText).collect(Collectors.toList());}

    //singular elements
    public String getCheckoutOrderSubtotalPrice(){return checkoutPageConfirmSubtotalPrice.getText();}
    public String getCheckoutOrderFlatShippingRate(){return checkoutPageConfirmFlatShippingRate.getText();}
    public String getCheckoutOrderEcoTax(){return checkoutPageConfirmEcoTax.getText();}
    public String getCheckoutOrderVATPrice(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(800));
        wait.until(ExpectedConditions.visibilityOf(checkoutPageConfirmVATPrice));
        return checkoutPageConfirmVATPrice.getText();
    }

    //checkout page web element assert methods
    public boolean isCheckoutPageTitleDisplayed() {return checkoutPageTitle.isDisplayed();}
    public boolean isCheckoutPageCheckoutOptionsDropdownLinkDisplayed() {return checkoutPageCheckoutOptionsDropdownLink.isDisplayed();}
    //new customer section
    public boolean isCheckoutPageNewCustomerSectionTitleDisplayed() {return checkoutPageNewCustomerSectionTitle.isDisplayed();}
    public boolean isCheckoutPageNewCustomerSectionSubtitleDisplayed() {return checkoutPageNewCustomerSectionSubtitle.isDisplayed();}
    public boolean isCheckoutPageNewCustomerRegisterAccountRadioButtonDisplayed() {return checkoutPageNewCustomerRegisterAccountRadioButton.isDisplayed();}
    public boolean isCheckoutPageNewCustomerGuestAccountRadioButtonDisplayed() {return checkoutPageNewCustomerGuestAccountRadioButton.isDisplayed();}
    public boolean isCheckoutPageNewCustomerSectionDescriptionDisplayed() {return checkoutPageNewCustomerSectionDescription.isDisplayed();}
    public boolean isCheckoutPageNewCustomerContinueButtonDisplayed() {return checkoutPageNewCustomerContinueButton.isDisplayed();}
    //returning customer section
    public boolean isCheckoutPageReturningCustomerSectionTitleDisplayed() {return checkoutPageReturningCustomerSectionTitle.isDisplayed();}
    public boolean isCheckoutPageReturningCustomerSectionSubtitleDisplayed() {return checkoutPageReturningCustomerSectionSubtitle.isDisplayed();}
    public boolean isCheckoutPageReturningCustomerSectionEmailInputFieldDisplayed() {return checkoutPageReturningCustomerSectionEmailInputField.isDisplayed();}
    public boolean isCheckoutPageReturningCustomerSectionPasswordInputFieldDisplayed() {return checkoutPageReturningCustomerSectionPasswordInputField.isDisplayed();}
    public boolean isCheckoutPageReturningCustomerSectionForgotPasswordLinkDisplayed() {return checkoutPageReturningCustomerSectionForgotPasswordLink.isDisplayed();}
    public boolean isCheckoutPageReturningCustomerLoginButtonDisplayed() {return checkoutPageReturningCustomerLoginButton.isDisplayed();}
    //guest account section
    public boolean isCheckoutPageBillingDetailsDropdownLinkDisplayed() {return checkoutPageBillingDetailsDropdownLink.isDisplayed();}
    public boolean isCheckoutPagePersonalDetailsSectionTitleDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(1000));
        wait.until(ExpectedConditions.visibilityOf(checkoutPagePersonalDetailsSectionTitle));
        return checkoutPagePersonalDetailsSectionTitle.isDisplayed();
    }
    public boolean isCheckoutPageFirstNameInputFieldDisplayed() {return checkoutPageFirstNameInputField.isDisplayed();}
    public boolean isCheckoutPageLastNameInputFieldDisplayed() {return checkoutPageLastNameInputField.isDisplayed();}
    public boolean isCheckoutPageEmailInputFieldDisplayed() {return checkoutPageEmailInputField.isDisplayed();}
    public boolean isCheckoutPagePhoneInputFieldDisplayed() {return checkoutPagePhoneInputField.isDisplayed();}
    public boolean isCheckoutPageAddressDetailsSectionTitleDisplayed() {return checkoutPageAddressDetailsSectionTitle.isDisplayed();}
    public boolean isCheckoutPageCompanyInputFieldDisplayed() {return checkoutPageCompanyInputField.isDisplayed();}
    public boolean isCheckoutPageAddress1InputFieldDisplayed() {return checkoutPageAddress1InputField.isDisplayed();}
    public boolean isCheckoutPageAddress2InputFieldDisplayed() {return checkoutPageAddress2InputField.isDisplayed();}
    public boolean isCheckoutPageCityInputFieldDisplayed() {return checkoutPageCityInputField.isDisplayed();}
    public boolean isCheckoutPagePostCodeInputFieldDisplayed() {return checkoutPagePostCodeInputField.isDisplayed();}
    public boolean isCheckoutPageCountryDropdownMenuDisplayed() {return checkoutPageCountryDropdownMenu.isDisplayed();}
    public boolean isCheckoutPageStateDropdownMenuDisplayed() {return checkoutPageStateDropdownMenu.isDisplayed();}
    public boolean isCheckoutPageDeliveryBillingAddressSameCheckboxDisplayed() {return checkoutPageDeliveryBillingAddressSameCheckbox.isDisplayed();}
    public boolean isCheckoutPageGuestAccContinueButtonDisplayed() {return checkoutPageGuestAccContinueButton.isDisplayed();}
    //delivery method section
    public boolean isCheckoutPageDeliveryMethodSubtextDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(1000));
        wait.until(ExpectedConditions.visibilityOf(checkoutPageDeliveryMethodSubtext));
        return checkoutPageDeliveryMethodSubtext.isDisplayed();
    }
    public boolean isCheckoutPageDeliveryFlatShippingRateRadioButtonDisplayed() {return checkoutPageDeliveryFlatShippingRateRadioButton.isDisplayed();}
    public boolean isCheckoutPageDeliveryCommentsTextboxDisplayed() {return checkoutPageDeliveryCommentsTextbox.isDisplayed();}
    public boolean isCheckoutPageDeliveryContinueButtonDisplayed() {return checkoutPageDeliveryContinueButton.isDisplayed();}
    //payment method section
    public boolean isCheckoutPagePaymentMethodSubtextDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(1000));
        wait.until(ExpectedConditions.visibilityOf(checkoutPagePaymentMethodSubtext));
        return checkoutPagePaymentMethodSubtext.isDisplayed();
    }
    public boolean isCheckoutPagePaymentMethodCodRadioButtonDisplayed() {return checkoutPagePaymentMethodCodRadioButton.isDisplayed();}
    public boolean isCheckoutPagePaymentCommentsTextboxDisplayed() {return checkoutPagePaymentCommentsTextbox.isDisplayed();}
    public boolean isCheckoutPagePaymentTermsConditionsCheckboxDisplayed() {return checkoutPagePaymentTermsConditionsCheckbox.isDisplayed();}
    public boolean isCheckoutPagePaymentTermsConditionsLinkDisplayed() {return checkoutPagePaymentTermsConditionsLink.isDisplayed();}
    public boolean isCheckoutPagePaymentContinueButtonDisplayed() {return checkoutPagePaymentContinueButton.isDisplayed();}
    //confirm order section
    //table list elements
    public boolean isCheckoutPageProductNameLinkDisplayed() {
        return checkoutPageConfirmOrderProductNameLinkElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isCheckoutPageProductModelDisplayed() {
        return checkoutPageConfirmOrderProductModelElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isCheckoutPageProductQuantityDisplayed() {
        return checkoutPageConfirmOrderProductQuantityElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isCheckoutPageProductUnitPriceDisplayed() {
        return checkoutPageConfirmOrderProductUnitPriceElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isCheckoutPageProductTotalPriceDisplayed() {
        return checkoutPageConfirmOrderProductTotalPriceElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    //singular elements
    public boolean isCheckoutPageConfirmSubtotalPriceDisplayed() {return checkoutPageConfirmSubtotalPrice.isDisplayed();}
    public boolean isCheckoutPageConfirmFlatShippingRateDisplayed() {return checkoutPageConfirmFlatShippingRate.isDisplayed();}
    public boolean isCheckoutPageConfirmEcoTaxDisplayed() {return checkoutPageConfirmEcoTax.isDisplayed();}
    public boolean isCheckoutPageConfirmVATPriceDisplayed() {return checkoutPageConfirmVATPrice.isDisplayed();}
    public boolean isCheckoutPageConfirmTotalPriceDisplayed() {return checkoutPageConfirmTotalPrice.isDisplayed();}
    public boolean isCheckoutPageConfirmOrderButtonDisplayed() {return checkoutPageConfirmOrderButton.isDisplayed();}

}
