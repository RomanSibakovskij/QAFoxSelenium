package com.tutorialsninja.qafox;

import com.tutorialsninja.qafox.utilities.*;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;
import java.util.*;
import java.util.stream.Collectors;

public class ShoppingCartPage extends BasePage{

    //shopping cart page web elements
    @FindBy(xpath = "//div[@id='content']/h1")
    private WebElement shoppingCartPageTitle;
    //shopping cart table list elements
    private List<WebElement> shoppingCartTableProductImageElements = driver.findElements(By.xpath("//div[@class='table-responsive']//tbody/tr/td[1]/a"));
    private List<WebElement> shoppingCartTableProductNameLinkElements = driver.findElements(By.xpath("//div[@class='table-responsive']//tbody/tr/td[2]/a"));
    @FindBy(xpath = "//div[@class='table-responsive']//tbody/tr/td[2]/small")
    private List<WebElement> shoppingCartTableProductDescElements;
    @FindBy(xpath = "//div[@class='table-responsive']//tbody/tr/td[3]")
    private List<WebElement> shoppingCartTableProductModelElements;
    @FindBy(xpath = "//div[@class='table-responsive']//tbody/tr/td[4]//input")
    private List<WebElement> shoppingCartTableProductQtyInputFieldElements;
    @FindBy(xpath = "//div[@class='table-responsive']//tbody/tr/td[4]//button[1]")
    private List<WebElement> shoppingCartTableProductQtyUpdateButtonElements;
    @FindBy(xpath = "//div[@class='table-responsive']//tbody/tr/td[4]//button[2]")
    private List<WebElement> shoppingCartTableProductRemoveButtonElements;
    @FindBy(xpath = "//div[@class='table-responsive']//tbody/tr/td[5]")
    private List<WebElement> shoppingCartTableProductUnitPriceElements;
    @FindBy(xpath = "//div[@class='table-responsive']//tbody/tr/td[6]")
    private List<WebElement> shoppingCartTableProductTotalPriceElements;
    //to-do next section elements
    @FindBy(xpath = "//div[@id='content']/h2")
    private WebElement shoppingCartToDoNextSectionTitle;
    @FindBy(xpath = "//div[@id='content']/p")
    private WebElement shoppingCartToDoNextSectionSubtitle;
    @FindBy(xpath = "//div[@id='accordion']//a[@href='#collapse-coupon']")
    private WebElement shoppingCartToDoNextCouponCodeDropdownLink;
    @FindBy(xpath = "//div[@id='accordion']//a[@href='#collapse-shipping']")
    private WebElement shoppingCartToDoNextEstimateShippingDropdownLink;
    //estimate shipping dropdown link elements
    @FindBy(xpath = "//div[@id='collapse-shipping']//p")
    private WebElement shoppingCartToDoNextEstimateShippingSubtext;
    @FindBy(xpath = "//div[@id='collapse-shipping']//select[@id='input-country']")
    private WebElement shoppingCartToDoNextEstimateShippingCountryDropdownMenu;
    @FindBy(xpath = "//select[@id='input-country']/option[@value='223']")
    private WebElement shoppingCartToDoNextEstimateShippingUsCountryOption;
    @FindBy(xpath = "//div[@id='collapse-shipping']//select[@id='input-zone']")
    private WebElement shoppingCartToDoNextEstimateShippingStateDropdownMenu;
    @FindBy(xpath = "//select[@id='input-zone']/option[@value='3635']")
    private WebElement shoppingCartToDoNextEstimateShippingIllinoisOption;
    @FindBy(xpath = "//div[@id='collapse-shipping']//input")
    private WebElement shoppingCartToDoNextEstimateShippingPostCodeInputField;
    @FindBy(xpath = "//button[@id='button-quote']")
    private WebElement shoppingCartToDoNextEstimateShippingGetQuotesButton;
    @FindBy(xpath = "//div[@class='modal-content']//input[@name='shipping_method']")
    private WebElement shoppingCartFlatShippingRadioButton;
    @FindBy(xpath = "//div[@class='modal-content']//input[@id='button-shipping']")
    private WebElement shoppingCartApplyShippingButton;
    @FindBy(xpath = "//div[@id='accordion']//a[@href='#collapse-voucher']")
    private WebElement shoppingCartToDoNextGiftCertificateDropdownLink;
    //order subtotal table elements
    @FindBy(xpath = "//div[@class='col-sm-4 col-sm-offset-8']//tbody/tr[1]/td[2]")
    private WebElement shoppingCartOrderSubtotalPrice;
    @FindBy(xpath = "//div[@class='col-sm-4 col-sm-offset-8']//tbody/tr[2]/td[2]")
    private WebElement shoppingCartOrderTotalPrice;
    //buttons
    @FindBy(xpath = "//div[@class='buttons clearfix']//a[@class='btn btn-default']")
    private WebElement shoppingCartContinueShoppingButton;
    @FindBy(xpath = "//div[@class='buttons clearfix']//a[@class='btn btn-primary']")
    private WebElement shoppingCartCheckoutButton;
    //shipping rate application success message element
    @FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
    private WebElement shoppingCartShippingAppliedSuccessMessage;
    //shopping cart warning message element
    @FindBy(xpath = "//div[@class='alert alert-danger alert-dismissible']")
    private WebElement shoppingCartWarningMessage;
    //cart is empty message element
    @FindBy(xpath = "//div[@id='content']/p[.='Your shopping cart is empty!']")
    private WebElement shoppingCartEmptyMessage;

    public ShoppingCartPage(WebDriver driver) {super(driver);}

    //click 'Estimate shipping' dropdown link method
    public void clickEstimateShippingDropdownLink(){shoppingCartToDoNextEstimateShippingDropdownLink.click();}

    //click 'Estimate shipping' country dropdown menu method
    public void clickShippingCountryDropdownMenu(){
        Actions actions = new Actions(driver);
        actions.moveToElement(shoppingCartToDoNextEstimateShippingCountryDropdownMenu).click().perform();
    }

    //select 'United States' option
    public void selectUsCountryOption(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(1100));
        wait.until(ExpectedConditions.elementToBeClickable(shoppingCartToDoNextEstimateShippingUsCountryOption));
        shoppingCartToDoNextEstimateShippingUsCountryOption.click();
    }

    //click 'Estimate shipping' state dropdown menu method
    public void clickShippingStateDropdownMenu(){
        Actions actions = new Actions(driver);
        actions.moveToElement(shoppingCartToDoNextEstimateShippingStateDropdownMenu).click().perform();
    }

    //select 'Illinois' option
    public void selectIllinoisStateOption(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(1100));
        wait.until(ExpectedConditions.elementToBeClickable(shoppingCartToDoNextEstimateShippingIllinoisOption));
        shoppingCartToDoNextEstimateShippingIllinoisOption.click();
    }

    //click 'Get quotes' button method
    public void clickGetQuotesButton(){
        Actions actions = new Actions(driver);
        actions.moveToElement(shoppingCartToDoNextEstimateShippingGetQuotesButton).click().perform();
    }

    //click 'Flat shipping' radio button method
    public void clickFlatShippingRadioButton(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(1100));
        wait.until(ExpectedConditions.elementToBeClickable(shoppingCartFlatShippingRadioButton));
        shoppingCartFlatShippingRadioButton.click();
    }

    //click 'Apply shipping' button method
    public void clickApplyShippingButton(){
        Actions actions = new Actions(driver);
        actions.moveToElement(shoppingCartApplyShippingButton).click().perform();
    }

    //update product quantity method
    public void inputProductQtyIntoQtyInputField(int index){
        shoppingCartTableProductQtyInputFieldElements.get(index).clear();
        shoppingCartTableProductQtyInputFieldElements.get(index).sendKeys("5");
    }

    //click 'Update product quantity' button method
    public void clickUpdateQuantityButton(int index){shoppingCartTableProductQtyUpdateButtonElements.get(index).click();}

    //click 'Remove product' button method
    public void clickRemoveProductButton(int index){shoppingCartTableProductRemoveButtonElements.get(index).click();}

    //click 'Checkout' button method
    public void clickCheckoutButton(){
        Actions actions = new Actions(driver);
        actions.moveToElement(shoppingCartCheckoutButton).click().perform();
    }

    //shopping cart text element getters
    public String getShoppingCartPageTitle() {return shoppingCartPageTitle.getText();}
    public String getShoppingCartToDoNextSectionTitle(){return shoppingCartToDoNextSectionTitle.getText();}
    public String getShoppingCartToDoNextSectionSubtitle(){return shoppingCartToDoNextSectionSubtitle.getText();}
    public String getShoppingCartEstimateShippingSectionSubtext(){return shoppingCartToDoNextEstimateShippingSubtext.getText();}

    //shopping cart shipping rate application success message getter
    public String getShippingRateApplicationSuccessMessage(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(900));
        wait.until(ExpectedConditions.visibilityOf(shoppingCartShippingAppliedSuccessMessage));
        return shoppingCartShippingAppliedSuccessMessage.getText();
    }

    //shopping cart warning message getter
    public String getShoppingCartWarningMessage(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(900));
        wait.until(ExpectedConditions.visibilityOf(shoppingCartWarningMessage));
        return shoppingCartWarningMessage.getText();
    }

    //shopping cart empty message getter
    public String getShoppingCartEmptyMessage(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(1700));
        wait.until(ExpectedConditions.visibilityOf(shoppingCartEmptyMessage));
        return shoppingCartEmptyMessage.getText();
    }

    //shopping cart product table list getters
    public List<String> getShoppingCartProductName(){return shoppingCartTableProductNameLinkElements.stream().map(WebElement::getText).collect(Collectors.toList());}
    public List<String> getShoppingCartProductDescription(){return shoppingCartTableProductDescElements.stream().map(WebElement::getText).collect(Collectors.toList());}
    public List<String> getShoppingCartProductModel(){return shoppingCartTableProductModelElements.stream().map(WebElement::getText).collect(Collectors.toList());}
    public List<String> getShoppingCartProductQty() {return shoppingCartTableProductQtyInputFieldElements.stream().map(element -> element.getDomAttribute("value")).collect(Collectors.toList());}
    public List<String> getShoppingCartProductUnitPrice(){return shoppingCartTableProductUnitPriceElements.stream().map(WebElement::getText).collect(Collectors.toList());}
    public List<String> getShoppingCartProductTotalPrice(){return shoppingCartTableProductTotalPriceElements.stream().map(WebElement::getText).collect(Collectors.toList());}

    //order summary getters
    public String getShoppingCartOrderSubtotalPrice(){return shoppingCartOrderSubtotalPrice.getText();}
    public String getShoppingCartOrderTotalPrice(){return shoppingCartOrderTotalPrice.getText();}

    //shopping cart page web element assert methods
    public boolean isShoppingCartPageTitleDisplayed() {return shoppingCartPageTitle.isDisplayed();}
    //shopping cart table list elements
    public boolean isShoppingCartPageProductImageDisplayed() {
        return shoppingCartTableProductImageElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isShoppingCartPageProductNameLinkDisplayed() {
        return shoppingCartTableProductNameLinkElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isShoppingCartPageProductDescDisplayed() {
        return shoppingCartTableProductDescElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isShoppingCartPageProductModelDisplayed() {
        return shoppingCartTableProductModelElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isShoppingCartPageProductQtyInputFieldDisplayed() {
        return shoppingCartTableProductQtyInputFieldElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isShoppingCartPageProductQtyUpdateButtonDisplayed() {
        return shoppingCartTableProductQtyUpdateButtonElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isShoppingCartPageProductRemoveButtonDisplayed() {
        return shoppingCartTableProductRemoveButtonElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isShoppingCartPageProductUnitPriceDisplayed() {
        return shoppingCartTableProductUnitPriceElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isShoppingCartPageProductTotalPriceDisplayed() {
        return shoppingCartTableProductTotalPriceElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    //to-do next section
    public boolean isShoppingCartToDoNextSectionTitleDisplayed(){return shoppingCartToDoNextSectionTitle.isDisplayed();}
    public boolean isShoppingCartToDoNextSectionSubtitleDisplayed(){return shoppingCartToDoNextSectionSubtitle.isDisplayed();}
    public boolean isShoppingCartToDoNextCouponCodeDropdownLinkDisplayed(){return shoppingCartToDoNextCouponCodeDropdownLink.isDisplayed();}
    public boolean isShoppingCartToDoNextEstimateShippingDropdownLinkDisplayed(){return shoppingCartToDoNextEstimateShippingDropdownLink.isDisplayed();}
    public boolean isShoppingCartToDoNextEstimateShippingSubtextDisplayed(){return shoppingCartToDoNextEstimateShippingSubtext.isDisplayed();}
    public boolean isShoppingCartToDoNextGiftCertificateDropdownLinkDisplayed(){return shoppingCartToDoNextGiftCertificateDropdownLink.isDisplayed();}
    public boolean isShoppingCartToDoNextEstimateShippingCountryDropdownMenuDisplayed(){return shoppingCartToDoNextEstimateShippingCountryDropdownMenu.isDisplayed();}
    public boolean isShoppingCartToDoNextEstimateShippingStateDropdownMenuDisplayed(){return shoppingCartToDoNextEstimateShippingStateDropdownMenu.isDisplayed();}
    public boolean isShoppingCartToDoNextEstimateShippingPostCodeInputFieldDisplayed(){return shoppingCartToDoNextEstimateShippingPostCodeInputField.isDisplayed();}
    public boolean isShoppingCartToDoNextEstimateShippingSubmitButtonDisplayed(){return shoppingCartToDoNextEstimateShippingGetQuotesButton.isDisplayed();}
    public boolean isShoppingCartOrderSubtotalPriceDisplayed() {return shoppingCartOrderSubtotalPrice.isDisplayed();}
    public boolean isShoppingCartOrderTotalPriceDisplayed() {return shoppingCartOrderTotalPrice.isDisplayed();}
    public boolean isShoppingCartContinueShoppingButtonDisplayed() {return shoppingCartContinueShoppingButton.isDisplayed();}
    public boolean isShoppingCartCheckoutButtonDisplayed() {return shoppingCartCheckoutButton.isDisplayed();}

    //warning message display assert
    public boolean isShoppingCartWarningMessageDisplayed() {return shoppingCartWarningMessage.isDisplayed();}

}
