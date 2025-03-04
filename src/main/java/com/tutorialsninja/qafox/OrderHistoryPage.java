package com.tutorialsninja.qafox;

import com.tutorialsninja.qafox.utilities.BasePage;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.*;

import java.util.*;
import java.util.stream.Collectors;

public class OrderHistoryPage extends BasePage {

    //order history page web elements
    @FindBy(xpath = "//div[@id='content']/h1")
    private WebElement orderHistoryPageTitle;
    @FindBy(xpath = "//div[@id='content']//a[@class='btn btn-primary']")
    private WebElement orderHistoryContinueButton;
    //order history pre-view table list elements
    @FindBy(xpath = "//table//tbody/tr/td[1]")
    private List<WebElement> orderIDElements;
    @FindBy(xpath = "//table//tbody/tr/td[2]")
    private List<WebElement> orderCustomerElements;
    @FindBy(xpath = "//table//tbody/tr/td[3]")
    private List<WebElement> orderNoOfProductsElements;
    @FindBy(xpath = "//table//tbody/tr/td[4]")
    private List<WebElement> orderStatusElements;
    @FindBy(xpath = "//table//tbody/tr/td[5]")
    private List<WebElement> orderTotalPriceElements;
    @FindBy(xpath = "//table//tbody/tr/td[6]")
    private List<WebElement> orderDateAddedElements;
    private List<WebElement> orderViewHistoryButtonElements = driver.findElements(By.xpath("//table//tbody/tr/td[7]/a"));
    //singular button
    @FindBy(xpath = "//table//tbody/tr/td[7]/a")
    private WebElement orderViewHistoryButton;

    //order history view page elements
    @FindBy(xpath = "//div[@id='content']/h2")
    private WebElement orderViewHistoryTitle;
    @FindBy(xpath = "//div[@class='buttons clearfix']//a[@class='btn btn-primary']")
    private WebElement orderViewHistoryContinueButton;
    //order details section
    @FindBy(xpath = "//div[@id='content']/table[1]//tbody/tr/td[1]")
    private WebElement orderViewDetails;
    @FindBy(xpath = "//div[@id='content']/table[1]//tbody/tr/td[2]")
    private WebElement orderViewMethodDetails;
    //payment address section
    @FindBy(xpath = "//div[@id='content']/table[2]//tbody/tr/td[1]")
    private WebElement orderPaymentAddressDetails;
    //shipping address section
    @FindBy(xpath = "//div[@id='content']/table[2]//tbody/tr/td[2]")
    private WebElement orderShippingAddressDetails;
    //order history view order table list elements
    @FindBy(xpath = "//div[@class='table-responsive']//tbody/tr/td[1]")
    private List<WebElement> orderViewProductNameElements;
    @FindBy(xpath = "//div[@class='table-responsive']//tbody/tr/td[2]")
    private List<WebElement> orderViewProductModelElements;
    @FindBy(xpath = "//div[@class='table-responsive']//tbody/tr/td[3]")
    private List<WebElement> orderViewProductQuantityElements;
    @FindBy(xpath = "//div[@class='table-responsive']//tbody/tr/td[4]")
    private List<WebElement> orderViewProductPriceElements;
    @FindBy(xpath = "//div[@class='table-responsive']//tbody/tr/td[5]")
    private List<WebElement> orderViewProductTotalPriceElements;
    private List<WebElement> orderViewProductReorderButtonElements = driver.findElements(By.xpath("//div[@class='table-responsive']//tbody/tr/td[6]/a[1]"));
    private List<WebElement> orderViewProductReturnButtonElements = driver.findElements(By.xpath("//div[@class='table-responsive']//tbody/tr/td[6]/a[2]"));
    //singular elements
    @FindBy(xpath = "//div[@class='table-responsive']//tbody/tr/td[6]/a[2]")
    private WebElement orderViewProductReturnButton;
    @FindBy(xpath = "//div[@class='table-responsive']//tfoot/tr[1]/td[3]")
    private WebElement orderSubtotalPrice;
    @FindBy(xpath = "//div[@class='table-responsive']//tfoot/tr[2]/td[3]")
    private WebElement orderFlatShippingRate;
    @FindBy(xpath = "//div[@class='table-responsive']//tfoot/tr[3]/td[3]")
    private WebElement orderTotalPrice;
    //order history table list elements
    @FindBy(xpath = "//div[@id='content']/table[3]//tbody/tr/td[1]")
    private List<WebElement> orderHistoryDateAddedElements;
    @FindBy(xpath = "//div[@id='content']/table[3]//tbody/tr/td[2]")
    private List<WebElement> orderHistoryStatusElements;
    @FindBy(xpath = "//div[@id='content']/table[3]//tbody/tr/td[3]")
    private List<WebElement> orderHistoryCommentsElements;

    public OrderHistoryPage(WebDriver driver) {super(driver);}

    //click 'View' order history button method
    public void clickViewOrderHistoryButton(){
        orderViewHistoryButton.click();
    }

    //click 'Return' order button method
    public void clickReturnOrderButton(){
        Actions action = new Actions(driver);
        action.moveToElement(orderViewProductReturnButton).click().perform();
    }

    //order history pre-view page text getters
    public String getOrderHistoryPageTitle() {return orderHistoryPageTitle.getText();}
    //order history pre-view page text getters
    public String getOrderViewHistoryPageTitle() {return orderViewHistoryTitle.getText();}

    //order history pre-view page order table data getters
    public List<String> getPreviewOrderID() {return orderIDElements.stream().map(WebElement::getText).collect(Collectors.toList());}
    public List<String> getPreviewOrderCustomer() {return orderCustomerElements.stream().map(WebElement::getText).collect(Collectors.toList());}
    public List<String> getPreviewOrderStatus() {return orderStatusElements.stream().map(WebElement::getText).collect(Collectors.toList());}
    public List<String> getPreviewOrderTotalPrice() {return orderTotalPriceElements.stream().map(WebElement::getText).collect(Collectors.toList());}
    public List<String> getPreviewOrderDateAdded() {return orderDateAddedElements.stream().map(WebElement::getText).collect(Collectors.toList());}

    //order history view page text element getters
    public String getOrderViewDetails() {return orderViewDetails.getText();}
    public String getOrderViewMethodDetails() {return orderViewMethodDetails.getText();}
    public String getOrderPaymentAddressDetails() {return orderPaymentAddressDetails.getText();}
    public String getOrderShippingAddressDetails() {return orderShippingAddressDetails.getText();}

    //order history view page order table data getters
    public List<String> getOrderViewProductName(){return orderViewProductNameElements.stream().map(WebElement::getText).collect(Collectors.toList());}
    public List<String> getOrderViewProductModel(){return orderViewProductModelElements.stream().map(WebElement::getText).collect(Collectors.toList());}
    public List<String> getOrderViewProductQuantity(){return orderViewProductQuantityElements.stream().map(WebElement::getText).collect(Collectors.toList());}
    public List<String> getOrderViewProductPrice(){return orderViewProductPriceElements.stream().map(WebElement::getText).collect(Collectors.toList());}
    public List<String> getOrderViewProductTotalPrice(){return orderViewProductTotalPriceElements.stream().map(WebElement::getText).collect(Collectors.toList());}
    public String getOrderSubtotalPrice() {return orderSubtotalPrice.getText();}
    public String getOrderFlatShippingRate() {return orderFlatShippingRate.getText();}
    public String getOrderTotalPrice() {return orderTotalPrice.getText();}

    //order history table data getters
    public List<String> getOrderHistoryDate() {return orderHistoryDateAddedElements.stream().map(WebElement::getText).collect(Collectors.toList());}
    public List<String> getOrderHistoryStatus() {return orderHistoryStatusElements.stream().map(WebElement::getText).collect(Collectors.toList());}
    public List<String> getOrderHistoryComments() {return orderHistoryCommentsElements.stream().map(WebElement::getText).collect(Collectors.toList());}

    //order history pre-view page web element assert methods
    public boolean isOrderHistoryPageTitleDisplayed() {return orderHistoryPageTitle.isDisplayed();}
    public boolean isOrderHistoryContinueButtonDisplayed() {return orderHistoryContinueButton.isDisplayed();}
    //table list elements
    public boolean isOrderHistoryPagePreviewTableOrderIDDisplayed() {
        return orderIDElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isOrderHistoryPagePreviewTableOrderCustomerDisplayed() {
        return orderCustomerElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isOrderHistoryPagePreviewTableOrderProductNumberDisplayed() {
        return orderNoOfProductsElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isOrderHistoryPagePreviewTableOrderStatusDisplayed() {
        return orderStatusElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isOrderHistoryPagePreviewTableOrderTotalPriceDisplayed() {
        return orderTotalPriceElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isOrderHistoryPagePreviewTableOrderDateAddedDisplayed() {
        return orderDateAddedElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isOrderHistoryPagePreviewTableOrderViewHistoryButtonDisplayed() {
        return orderViewHistoryButtonElements.stream()
                .allMatch(WebElement::isDisplayed);
    }

    //order history view page web element assert methods
    public boolean isOrderViewHistoryPageTitleDisplayed() {return orderViewHistoryTitle.isDisplayed();}
    public boolean isOrderViewHistoryPageContinueButtonDisplayed() {return orderViewHistoryContinueButton.isDisplayed();}
    public boolean isOrderViewDetailsTableDisplayed() {return orderViewDetails.isDisplayed();}
    public boolean isOrderViewMethodTableDisplayed() {return orderViewMethodDetails.isDisplayed();}
    public boolean isOrderViewPaymentAddressTableDisplayed() {return orderPaymentAddressDetails.isDisplayed();}
    public boolean isOrderViewShippingAddressTableDisplayed() {return orderShippingAddressDetails.isDisplayed();}
    //order table list elements
    public boolean isOrderViewTableOrderProductNameDisplayed() {
        return orderViewProductNameElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isOrderViewTableOrderProductModelDisplayed() {
        return orderViewProductModelElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isOrderViewTableOrderProductQtyDisplayed() {
        return orderViewProductQuantityElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isOrderViewTableOrderProductPriceDisplayed() {
        return orderViewProductPriceElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isOrderViewTableOrderProductTotalPriceDisplayed() {
        return orderViewProductTotalPriceElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isOrderViewTableOrderProductReorderButtonDisplayed() {
        return orderViewProductReorderButtonElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isOrderViewTableOrderProductReturnButtonDisplayed() {
        return orderViewProductReturnButtonElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isOrderViewTableOrderSubtotalPriceDisplayed() {return orderSubtotalPrice.isDisplayed();}
    public boolean isOrderViewTableOrderFlatShippingRateDisplayed() {return orderFlatShippingRate.isDisplayed();}
    public boolean isOrderViewTableOrderTotalPriceDisplayed() {return orderTotalPrice.isDisplayed();}
    //order history table list
    public boolean isOrderHistoryDateAddedDisplayed() {
        return orderHistoryDateAddedElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isOrderHistoryStatusDisplayed() {
        return orderHistoryStatusElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isOrderHistoryCommentsDisplayed() {
        return orderHistoryCommentsElements.stream()
                .allMatch(WebElement::isDisplayed);
    }

}
