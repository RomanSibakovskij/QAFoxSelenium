package com.tutorialsninja.qafox;

import com.tutorialsninja.qafox.utilities.BasePage;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;
import java.util.*;
import java.util.stream.Collectors;

public class WishlistPage extends BasePage{

    //wishlist page web elements
    @FindBy(xpath = "//div[@id='content']/h2")
    private WebElement wishlistPageTitle;
    //wishlist product table list elements
    private List<WebElement> wishlistPageProductImageLinkElements = driver.findElements(By.xpath("//table/tbody/tr/td[1]//a"));
    private List<WebElement> wishlistPageProductNameLinkElements = driver.findElements(By.xpath("//table/tbody/tr/td[2]//a"));
    @FindBy(xpath = "//table/tbody/tr/td[3]")
    private List<WebElement> wishlistPageProductModelElements;
    @FindBy(xpath = "//table/tbody/tr/td[4]")
    private List<WebElement> wishlistPageProductStockElements;
    @FindBy(xpath = "//table/tbody/tr/td[5]")
    private List<WebElement> wishlistPageProductUnitPriceElements;
    private List<WebElement> wishlistPageProductAddToCartButtonElements = driver.findElements(By.xpath("//table/tbody/tr/td[6]/button"));;
    private List<WebElement> wishlistPageProductRemoveButtonElements = driver.findElements(By.xpath("//table/tbody/tr/td[6]/a"));;
    //button
    @FindBy(xpath = "//div[@class='buttons clearfix']//a")
    private WebElement wishlistPageContinueButtonElements;

    public WishlistPage(WebDriver driver) {super(driver);}

    //wishlist page text element getter
    public String getWishlistPageTitle() {return wishlistPageTitle.getText();}

    //wishlist page table data getters
    public List<String> getWishlistPageProductName() {return wishlistPageProductNameLinkElements.stream().map(WebElement::getText).collect(Collectors.toList());}
    public List<String> getWishlistPageProductModel() {return wishlistPageProductModelElements.stream().map(WebElement::getText).collect(Collectors.toList());}
    public List<String> getWishlistPageProductStock() {return wishlistPageProductStockElements.stream().map(WebElement::getText).collect(Collectors.toList());}
    public List<String> getWishlistPageProductUnitPrice() {return wishlistPageProductUnitPriceElements.stream().map(WebElement::getText).collect(Collectors.toList());}

    //wishlist page web element assert methods
    public boolean isWishlistPageTitleDisplayed() {return wishlistPageTitle.isDisplayed();}
    public boolean isWishlistPageContinueButtonDisplayed() {return wishlistPageContinueButtonElements.isDisplayed();}
    //table list elements
    public boolean isWishlistPageProductImageLinkDisplayed() {
        return wishlistPageProductImageLinkElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isWishlistPageProductNameLinkDisplayed() {
        return wishlistPageProductNameLinkElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isWishlistPageProductModelDisplayed() {
        return wishlistPageProductModelElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isWishlistPageProductStockDisplayed() {
        return wishlistPageProductStockElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isWishlistPageProductUnitPriceDisplayed() {
        return wishlistPageProductUnitPriceElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isWishlistPageProductAddToCartDisplayed() {
        return wishlistPageProductAddToCartButtonElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isWishlistPageProductRemoveButtonDisplayed() {
        return wishlistPageProductRemoveButtonElements.stream()
                .allMatch(WebElement::isDisplayed);
    }

}
