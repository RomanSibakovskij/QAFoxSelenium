package com.tutorialsninja.qafox;

import com.tutorialsninja.qafox.utilities.BasePage;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;
import java.util.*;
import java.util.stream.Collectors;

public class ProductCompareListPage extends BasePage {

    //product compare list page web elements
    @FindBy(xpath = "//div[@id='content']/h1")
    private WebElement productCompareListPageTitle;
    //comparison list table elements
    @FindBy(xpath = "//table/tbody[1]/tr[1]/td/a")
    private List<WebElement> productCompareNameLinkElements;
    @FindBy(xpath = "//table/tbody[1]/tr[2]//img")
    private List<WebElement> productCompareImageElements;
    @FindBy(xpath = "//table/tbody[1]/tr[3]/td[position() > 1]")
    private List<WebElement> productComparePriceElements;
    @FindBy(xpath = "//table/tbody[1]/tr[4]/td[position() > 1]")
    private List<WebElement> productCompareModelElements;
    @FindBy(xpath = "//table/tbody[1]/tr[5]/td[position() > 1]")
    private List<WebElement> productCompareBrandElements;
    @FindBy(xpath = "//table/tbody[1]/tr[6]/td[position() > 1]")
    private List<WebElement> productCompareAvailabilityElements;
    @FindBy(xpath = "//table/tbody[1]/tr[7]/td[position() > 1]")
    private List<WebElement> productCompareRatingElements;
    @FindBy(xpath = "//table/tbody[1]/tr[8]/td[position() > 1]")
    private List<WebElement> productCompareSummaryElements;
    @FindBy(xpath = "//table/tbody[1]/tr[9]/td[position() > 1]")
    private List<WebElement> productCompareWeightElements;
    @FindBy(xpath = "//table/tbody[1]/tr[10]/td[position() > 1]")
    private List<WebElement> productCompareDimensionElements;
    //memory section
    @FindBy(xpath = "//table/tbody[2]//td[2]")
    private WebElement productCompareMemory;
    //processor section
    @FindBy(xpath = "//table/tbody[3]//td[2]")
    private WebElement productCompareCoreNumber;
    //button list elements
    @FindBy(xpath = "//input[@value='Add to Cart']")
    private List<WebElement> productCompareAddToCartButtonElements;
    @FindBy(xpath = "//a[@class='btn btn-danger btn-block']")
    private List<WebElement> productCompareRemoveButtonElements;

    public ProductCompareListPage(WebDriver driver) {super(driver);}

    //product compare list page text element getter
    public String getProductCompareListPageTitle() {return productCompareListPageTitle.getText();}

    //product compare list page comparison list table data getters
    public List<String> getProductCompareNames() {return productCompareNameLinkElements.stream().map(WebElement::getText).collect(Collectors.toList());}
    public List<String> getProductComparePrices() {return productComparePriceElements.stream().map(WebElement::getText).collect(Collectors.toList());}
    public List<String> getProductCompareModels() {return productCompareModelElements.stream().map(WebElement::getText).collect(Collectors.toList());}
    public List<String> getProductCompareBrands() {return productCompareBrandElements.stream().map(WebElement::getText).collect(Collectors.toList());}
    public List<String> getProductCompareAvailabilities() {return productCompareAvailabilityElements.stream().map(WebElement::getText).collect(Collectors.toList());}
    public List<String> getProductCompareSummaries() {return productCompareSummaryElements.stream().map(WebElement::getText).collect(Collectors.toList());}
    public List<String> getProductCompareWeights() {return productCompareWeightElements.stream().map(WebElement::getText).collect(Collectors.toList());}
    public List<String> getProductCompareDimensions() {return productCompareDimensionElements.stream().map(WebElement::getText).collect(Collectors.toList());}
    //singular elements
    public String getProductCompareMemory() {return productCompareMemory.getText();}
    public String getProductCompareCoreNumber() {return productCompareCoreNumber.getText();}

    //product compare list page web element assert methods
    public boolean isProductCompareListPageTitleDisplayed() {return productCompareListPageTitle.isDisplayed();}
    public boolean isProductCompareMemoryDisplayed() {return productCompareMemory.isDisplayed();}
    public boolean isProductCompareCoreNumberDisplayed() {return productCompareCoreNumber.isDisplayed();}
    //compare table list elements
    public boolean isProductCompareListProductNameLinkDisplayed() {
        return productCompareNameLinkElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isProductCompareListProductImageDisplayed() {
        return productCompareImageElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isProductCompareListProductPriceDisplayed() {
        return productComparePriceElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isProductCompareListProductModelDisplayed() {
        return productCompareModelElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isProductCompareListProductBrandDisplayed() {
        return productCompareBrandElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isProductCompareListProductAvailabilityDisplayed() {
        return productCompareAvailabilityElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isProductCompareListProductRatingDisplayed() {
        return productCompareRatingElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isProductCompareListProductSummaryDisplayed() {
        return productCompareSummaryElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isProductCompareListProductWeightDisplayed() {
        return productCompareWeightElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isProductCompareListProductDimensionDisplayed() {
        return productCompareDimensionElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isProductCompareListProductAddToCartButtonDisplayed() {
        return productCompareAddToCartButtonElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isProductCompareListProductRemoveButtonDisplayed() {
        return productCompareRemoveButtonElements.stream()
                .allMatch(WebElement::isDisplayed);
    }

}
