package com.tutorialsninja.qafox;

import com.tutorialsninja.qafox.utilities.*;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;
import java.util.*;

public class ProductReturnsPage extends BasePage{

    //product returns page web elements
    @FindBy(xpath = "//div[@id='content']/h1")
    private WebElement productReturnsPageTitle;
    @FindBy(xpath = "//div[@id='content']/p")
    private WebElement productReturnsPageSubtitle;
    //order information section
    @FindBy(xpath = "//fieldset[1]/legend")
    private WebElement orderInfoSectionTitle;
    @FindBy(xpath = "//label[@for='input-firstname']")
    private WebElement orderInfoSectionFirstNameSubText;
    @FindBy(xpath = "//input[@id='input-firstname']")
    private WebElement orderInfoSectionFirstNameInputField;
    @FindBy(xpath = "//label[@for='input-lastname']")
    private WebElement orderInfoSectionLastNameSubText;
    @FindBy(xpath = "//input[@id='input-lastname']")
    private WebElement orderInfoSectionLastNameInputField;
    @FindBy(xpath = "//label[@for='input-email']")
    private WebElement orderInfoSectionEmailSubText;
    @FindBy(xpath = "//input[@id='input-email']")
    private WebElement orderInfoSectionEmailInputField;
    @FindBy(xpath = "//label[@for='input-telephone']")
    private WebElement orderInfoSectionPhoneSubText;
    @FindBy(xpath = "//input[@id='input-telephone']")
    private WebElement orderInfoSectionPhoneInputField;
    @FindBy(xpath = "//label[@for='input-order-id']")
    private WebElement orderInfoSectionOrderIDSubText;
    @FindBy(xpath = "//input[@id='input-order-id']")
    private WebElement orderInfoSectionOrderIDInputField;
    @FindBy(xpath = "//label[@for='input-date-ordered']")
    private WebElement orderInfoSectionOrderDateSubText;
    @FindBy(xpath = "//input[@id='input-date-ordered']")
    private WebElement orderInfoSectionOrderDateInputField;
    @FindBy(xpath = "//button[@class='btn btn-default']")
    private WebElement orderInfoSectionOrderDateCalendarButton;
    //product information section
    @FindBy(xpath = "//fieldset[2]/legend")
    private WebElement productInfoSectionTitle;
    @FindBy(xpath = "//label[@for='input-product']")
    private WebElement productInfoSectionProductNameSubText;
    @FindBy(xpath = "")
    private WebElement productInfoSectionProductNameInputField;
    @FindBy(xpath = "//label[@for='input-model']")
    private WebElement productInfoSectionProductCodeSubText;
    @FindBy(xpath = "")
    private WebElement productInfoSectionProductCodeInputField;
    @FindBy(xpath = "//label[@for='input-quantity']")
    private WebElement productInfoSectionQuantitySubText;
    @FindBy(xpath = "")
    private WebElement productInfoSectionQuantityInputField;
    @FindBy(xpath = "//fieldset[2]/div[4]/label[@class='col-sm-2 control-label']")
    private WebElement productInfoSectionReturnReasonSubText;
    //radio buttons
    @FindBy(xpath = "//fieldset[2]/div[4]/div[@class='col-sm-10']//input[@value='1']")
    private WebElement productInfoSectionDeadOnArrivalRadioButton;
    @FindBy(xpath = "//fieldset[2]/div[4]/div[@class='col-sm-10']//input[@value='2']")
    private WebElement productInfoSectionFaultyRadioButton;
    @FindBy(xpath = "//fieldset[2]/div[4]/div[@class='col-sm-10']//input[@value='3']")
    private WebElement productInfoSectionOrderErrorRadioButton;
    @FindBy(xpath = "//fieldset[2]/div[4]/div[@class='col-sm-10']//input[@value='4']")
    private WebElement productInfoSectionOtherRadioButton;
    @FindBy(xpath = "//fieldset[2]/div[4]/div[@class='col-sm-10']//input[@value='5']")
    private WebElement productInfoSectionWrongItemRadioButton;
    //form elements
    @FindBy(xpath = "//fieldset[2]/div[5]/label[@class='col-sm-2 control-label']")
    private WebElement productInfoSectionProductIsOpenedSubText;
    @FindBy(xpath = "//fieldset[2]/div[5]//input[@value='1']")
    private WebElement productInfoSectionOpenedRadioButton;
    @FindBy(xpath = "//fieldset[2]/div[5]//input[@value='2']")
    private WebElement productInfoSectionNotOpenedRadioButton;
    @FindBy(xpath = "//label[@for='input-comment']")
    private WebElement productInfoSectionFaultyCommentSubText;
    @FindBy(xpath = "//textarea")
    private WebElement productInfoSectionFaultyCommentTextfield;
    //buttons
    @FindBy(xpath = "//div[@class='buttons clearfix']//a")
    private WebElement productReturnsPageSectionBackButton;
    @FindBy(xpath = "//div[@class='buttons clearfix']//input")
    private WebElement productReturnsPageSectionContinueButton;
    @FindBy(xpath = "//div[@class='buttons']//a")
    private WebElement productReturnsContinueButton;

    public ProductReturnsPage(WebDriver driver) {super(driver);}

    //click 'Order Error' radio button method
    public void clickOrderErrorRadioButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(900));
        wait.until(ExpectedConditions.visibilityOf(productInfoSectionOrderErrorRadioButton));
        productInfoSectionOrderErrorRadioButton.click();
    }

    //click 'Continue' button method
    public void clickProductReturnsContinueButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(1100));
        wait.until(ExpectedConditions.elementToBeClickable(productReturnsPageSectionContinueButton));
        productReturnsPageSectionContinueButton.click();
    }

    //click 'Continue' button method (after product returns page)
    public void clickProductContinueButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(1100));
        wait.until(ExpectedConditions.elementToBeClickable(productReturnsContinueButton));
        productReturnsContinueButton.click();
    }

    //product returns page text element getters
    public String getProductReturnsPageTitle() {return productReturnsPageTitle.getText();}
    public String getProductReturnsPageSubtitle() {return productReturnsPageSubtitle.getText();}
    //order info section
    public String getOrderInfoSectionTitle() {return orderInfoSectionTitle.getText();}
    public String getOrderInfoSectionFirstNameSubText() {return orderInfoSectionFirstNameSubText.getText();}
    public String getOrderInfoSectionLastNameSubText() {return orderInfoSectionLastNameSubText.getText();}
    public String getOrderInfoSectionEmailSubText() {return orderInfoSectionEmailSubText.getText();}
    public String getOrderInfoSectionPhoneSubText() {return orderInfoSectionPhoneSubText.getText();}
    public String getOrderInfoSectionOrderIDSubText() {return orderInfoSectionOrderIDSubText.getText();}
    public String getOrderInfoSectionOrderDateSubText() {return orderInfoSectionOrderDateSubText.getText();}
    //product info section
    public String getProductInfoSectionTitle() {return productInfoSectionTitle.getText();}
    public String getProductInfoSectionProductNameSubText() {return productInfoSectionProductNameSubText.getText();}
    public String getProductInfoSectionProductCodeSubText() {return productInfoSectionProductCodeSubText.getText();}
    public String getProductInfoSectionQuantitySubText() {return productInfoSectionQuantitySubText.getText();}
    public String getProductInfoSectionReturnReasonSubText() {return productInfoSectionReturnReasonSubText.getText();}
    public String getProductInfoSectionProductIsOpenedSubText() {return productInfoSectionProductIsOpenedSubText.getText();}
    public String getProductInfoSectionFaultyCommentSubText() {return productInfoSectionFaultyCommentSubText.getText();}

    //product returns page web element assert methods
    public boolean isProductReturnsPageTitleDisplayed() {return productReturnsPageTitle.isDisplayed();}
    public boolean isProductReturnsPageSubtitleDisplayed() {return productReturnsPageSubtitle.isDisplayed();}
    //order information
    public boolean isOrderInfoSectionTitleDisplayed() {return orderInfoSectionTitle.isDisplayed();}
    public boolean isOrderInfoSectionFirstNameSubtextDisplayed() {return orderInfoSectionFirstNameSubText.isDisplayed();}
    public boolean isOrderInfoSectionFirstNameInputFieldDisplayed() {return orderInfoSectionFirstNameInputField.isDisplayed();}
    public boolean isOrderInfoSectionLastNameSubtextDisplayed() {return orderInfoSectionLastNameSubText.isDisplayed();}
    public boolean isOrderInfoSectionLastNameInputFieldDisplayed() {return orderInfoSectionLastNameInputField.isDisplayed();}
    public boolean isOrderInfoSectionEmailSubtextDisplayed() {return orderInfoSectionEmailSubText.isDisplayed();}
    public boolean isOrderInfoSectionEmailInputFieldDisplayed() {return orderInfoSectionEmailInputField.isDisplayed();}
    public boolean isOrderInfoSectionPhoneSubtextDisplayed() {return orderInfoSectionPhoneSubText.isDisplayed();}
    public boolean isOrderInfoSectionPhoneInputFieldDisplayed() {return orderInfoSectionPhoneInputField.isDisplayed();}
    public boolean isOrderInfoSectionOrderIDSubtextDisplayed() {return orderInfoSectionOrderIDSubText.isDisplayed();}
    public boolean isOrderInfoSectionOrderIDInputFieldDisplayed() {return orderInfoSectionOrderIDInputField.isDisplayed();}
    public boolean isOrderInfoSectionOrderDateSubtextDisplayed() {return orderInfoSectionOrderDateSubText.isDisplayed();}
    public boolean isOrderInfoSectionOrderDateInputFieldDisplayed() {return orderInfoSectionOrderDateInputField.isDisplayed();}
    public boolean isOrderInfoSectionOrderDateCalendarButtonDisplayed() {return orderInfoSectionOrderDateCalendarButton.isDisplayed();}
    //product information section
    public boolean isProductInfoSectionTitleDisplayed() {return productInfoSectionTitle.isDisplayed();}
    public boolean isProductInfoSectionProductNameSubtextDisplayed() {return productInfoSectionProductNameSubText.isDisplayed();}
    public boolean isProductInfoSectionProductNameInputFieldDisplayed() {return productInfoSectionProductNameInputField.isDisplayed();}
    public boolean isProductInfoSectionProductCodeSubtextDisplayed() {return productInfoSectionProductCodeSubText.isDisplayed();}
    public boolean isProductInfoSectionProductCodeInputFieldDisplayed() {return productInfoSectionProductCodeInputField.isDisplayed();}
    public boolean isProductInfoSectionQuantitySubtextDisplayed() {return productInfoSectionQuantitySubText.isDisplayed();}
    public boolean isProductInfoSectionQuantityInputFieldDisplayed() {return productInfoSectionQuantityInputField.isDisplayed();}
    public boolean isProductInfoSectionReturnReasonSubtextDisplayed() {return productInfoSectionReturnReasonSubText.isDisplayed();}
    //radio buttons
    public boolean isProductInfoSectionDeadOnArrivalRadioButtonDisplayed() {return productInfoSectionDeadOnArrivalRadioButton.isDisplayed();}
    public boolean isProductInfoSectionFaultyRadioButtonDisplayed() {return productInfoSectionFaultyRadioButton.isDisplayed();}
    public boolean isProductInfoSectionOrderErrorRadioButtonDisplayed() {return productInfoSectionOrderErrorRadioButton.isDisplayed();}
    public boolean isProductInfoSectionOtherRadioButtonDisplayed() {return productInfoSectionOtherRadioButton.isDisplayed();}
    public boolean isProductInfoSectionWrongItemRadioButtonDisplayed() {return productInfoSectionWrongItemRadioButton.isDisplayed();}
    //form elements
    public boolean isProductInfoSectionProductIsOpenedSubTextDisplayed() {return productInfoSectionProductIsOpenedSubText.isDisplayed();}
    public boolean isProductInfoSectionOpenedRadioButtonDisplayed() {return productInfoSectionOpenedRadioButton.isDisplayed();}
    public boolean isProductInfoSectionNotOpenedRadioButtonDisplayed() {return productInfoSectionNotOpenedRadioButton.isDisplayed();}
    public boolean isProductInfoSectionFaultyCommentSubTextDisplayed() {return productInfoSectionFaultyCommentSubText.isDisplayed();}
    public boolean isProductInfoSectionFaultyCommentTextfieldDisplayed() {return productInfoSectionFaultyCommentTextfield.isDisplayed();}
    public boolean isProductInfoSectionBackButtonDisplayed() {return productReturnsPageSectionBackButton.isDisplayed();}
    public boolean isProductInfoSectionContinueButtonDisplayed() {return productReturnsPageSectionContinueButton.isDisplayed();}

}
