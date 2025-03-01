package com.tutorialsninja.qafox;

import com.tutorialsninja.qafox.utilities.BasePage;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;
import java.util.*;
import java.util.stream.Collectors;

public class SingleProductCategoryDashboardPage extends BasePage {

    //single category dashboard page web elements
    //aside //these are main links (subcategory links might take the locators of the main category links)
    @FindBy(xpath = "//div[@class='list-group']/a[text()='Desktops (13)']")
    private WebElement asideDesktopsLink;
    @FindBy(xpath = "//div[@class='list-group']/a[text()='Laptops & Notebooks (5)']")
    private WebElement asideLaptopsLink;
    @FindBy(xpath = "//div[@class='list-group']/a[text()='Components (2)']")
    private WebElement asideComponentsLink;
    @FindBy(xpath = "//div[@class='list-group']/a[text()='Tablets (1)']")
    private WebElement asideTabletsLink;
    @FindBy(xpath = "//div[@class='list-group']/a[text()='Software (0)']")
    private WebElement asideSoftwareLink;
    @FindBy(xpath = "//div[@class='list-group']/a[text()='Phones & PDAs (3)']")
    private WebElement asidePhonesLink;
    @FindBy(xpath = "//div[@class='list-group']/a[text()='Cameras (2)']")
    private WebElement asideCamerasLink;
    @FindBy(xpath = "//div[@class='list-group']/a[text()='MP3 Players (4)']")
    private WebElement asideMP3PlayersLink;
    @FindBy(xpath = "//div[@class='swiper-wrapper']//a")
    private WebElement asideSwiperImageLink;
    //main
    @FindBy(xpath = "//div[@id='content']/h2")
    private WebElement singleProductCategoryPageTitle;
    @FindBy(xpath = "//div[@id='content']/div[@class='row'][1]//img")
    private WebElement singleProductCategoryMainImage;
    @FindBy(xpath = "//div[@id='content']/div[@class='row'][1]//p")
    private WebElement singleProductCategoryDescription;
    @FindBy(xpath = "//div[@id='content']/h3")
    private WebElement singleProductCategorySubtitle;
    //refined search link list
    private List<WebElement> singleProductCategoryRefinedSearchLinkElements = driver.findElements(By.xpath("//div[@class='row'][2]//a"));
    //singular elements
    @FindBy(xpath = "//button[@id='grid-view']")
    private WebElement singleProductCategoryGridViewButton;
    @FindBy(xpath = "//button[@id='list-view']")
    private WebElement singleProductCategoryListViewButton;
    @FindBy(xpath = "//a[@id='compare-total']")
    private WebElement singleProductCategoryProductCompareLink;
    @FindBy(xpath = "//select[@id='input-sort']")
    private WebElement singleProductCategorySortByDropdownMenu;
    @FindBy(xpath = "//select[@id='input-limit']")
    private WebElement singleProductCategoryShowDropdownMenu;
    //product table list elements
    private List<WebElement> productTableImageLinkElements = driver.findElements(By.xpath("//div[@class='product-thumb']/div[@class='image']/a"));
    @FindBy(xpath = "//div[@class='product-thumb']//h4/a")
    private List<WebElement> productTableNameLinkElements;
    @FindBy(xpath = "//div[@class='product-thumb']//p[1]")
    private List<WebElement> productTableDescriptionElements;
    @FindBy(xpath = "//div[@class='product-thumb']//p[2]")
    private List<WebElement> productTableUnitPriceElements;
    private List<WebElement> productTableAddToCartButtonElements = driver.findElements(By.xpath("//div[@class='button-group']/button[1]"));
    @FindBy(xpath = "//div[@class='button-group']/button[2]")
    private List<WebElement> productTableAddToWishlistButtonElements;
    private List<WebElement> productTableAddToCompareButtonElements = driver.findElements(By.xpath("//div[@class='button-group']/button[3]"));
    //singular element
    @FindBy(xpath = "//div[@class='col-sm-6 text-right']")
    private WebElement singleProductCategoryShowingProductCounter;

    public SingleProductCategoryDashboardPage(WebDriver driver) {super(driver);}

    //click 'Add to cart' button list method
    public void clickAddToCartButton(int index){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(870));
        wait.until(ExpectedConditions.elementToBeClickable(productTableAddToCartButtonElements.get(index)));
        productTableAddToCartButtonElements.get(index).click();
    }

    //click 'List' view button list method
    public void clickListViewButton(){
        Actions actions = new Actions(driver);
        actions.moveToElement(singleProductCategoryListViewButton).click().perform();
    }

    //click 'Add to wishlist' button list method
    public void clickAddToWishlistButton(int index){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(870));
        wait.until(ExpectedConditions.elementToBeClickable(productTableAddToWishlistButtonElements.get(index)));
        productTableAddToWishlistButtonElements.get(index).click();
    }

    //click 'Add to compare' button list method
    public void clickAddToCompareButton(int index){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(870));
        wait.until(ExpectedConditions.elementToBeClickable(productTableAddToCompareButtonElements.get(index)));
        productTableAddToCompareButtonElements.get(index).click();
    }

    //click 'Product Compare' link method
    public void clickProductCompareLink(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(950));
        wait.until(ExpectedConditions.elementToBeClickable(singleProductCategoryProductCompareLink));
        singleProductCategoryProductCompareLink.click();
    }

    //product table data getters
    public List<String> getProductTableName(){return productTableNameLinkElements.stream().map(WebElement::getText).collect(Collectors.toList());}
    public List<String> getProductTableDescription(){return productTableDescriptionElements.stream().map(WebElement::getText).collect(Collectors.toList());}
    public List<String> getProductTableUnitPrice(){return productTableUnitPriceElements.stream().map(WebElement::getText).collect(Collectors.toList());}

    //single product category dashboard page text getters
    public String getSingleProductCategoryDashboardPageTitle(){return singleProductCategoryPageTitle.getText();}

    //single product category dashboard page web element assert methods
    //aside
    public boolean isAsideDesktopsLinkDisplayed() {return asideDesktopsLink.isDisplayed();}
    public boolean isAsideLaptopsLinkDisplayed() {return asideLaptopsLink.isDisplayed();}
    public boolean isAsideComponentsLinkDisplayed() {return asideComponentsLink.isDisplayed();}
    public boolean isAsideTabletsLinkDisplayed() {return asideTabletsLink.isDisplayed();}
    public boolean isAsideSoftwareLinkDisplayed() {return asideSoftwareLink.isDisplayed();}
    public boolean isAsidePhonesLinkDisplayed() {return asidePhonesLink.isDisplayed();}
    public boolean isAsideCamerasLinkDisplayed() {return asideCamerasLink.isDisplayed();}
    public boolean isAsideMP3PlayersLinkDisplayed() {return asideMP3PlayersLink.isDisplayed();}
    public boolean isAsideSwiperImageLinkDisplayed() {return asideSwiperImageLink.isDisplayed();}
    //main
    public boolean isSingleProductCategoryPageTitleDisplayed() {return singleProductCategoryPageTitle.isDisplayed();}
    public boolean isSingleProductCategoryMainImageDisplayed() {return singleProductCategoryMainImage.isDisplayed();}
    public boolean isSingleProductCategoryDescriptionDisplayed() {return singleProductCategoryDescription.isDisplayed();}
    public boolean isSingleProductCategorySubtitleDisplayed() {return singleProductCategorySubtitle.isDisplayed();}
    public boolean isSingleProductCategoryShowingProductCounterDisplayed() {return singleProductCategoryShowingProductCounter.isDisplayed();}
    public boolean isSingleProductCategoryGridViewButtonDisplayed() {return singleProductCategoryGridViewButton.isDisplayed();}
    public boolean isSingleProductCategoryListViewButtonDisplayed() {return singleProductCategoryListViewButton.isDisplayed();}
    public boolean isSingleProductCategoryProductCompareLinkDisplayed() {return singleProductCategoryProductCompareLink.isDisplayed();}
    public boolean isSingleProductCategorySortByDropdownMenuDisplayed() {return singleProductCategorySortByDropdownMenu.isDisplayed();}
    public boolean isSingleProductCategoryShowDropdownMenuDisplayed() {return singleProductCategoryShowDropdownMenu.isDisplayed();}
    //list elements
    public boolean isSingleProductCategoryRefinedSearchLinkDisplayed() {
        return singleProductCategoryRefinedSearchLinkElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    //product table elements
    public boolean isProductTableImageLinkDisplayed() {
        return productTableImageLinkElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isProductTableNameLinkDisplayed() {
        return productTableNameLinkElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isProductTableDescriptionDisplayed() {
        return productTableDescriptionElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isProductTableUnitPriceDisplayed() {
        return productTableUnitPriceElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isProductTableAddToCartButtonDisplayed() {
        return productTableAddToCartButtonElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isProductTableAddToWishlistButtonDisplayed() {
        return productTableAddToWishlistButtonElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isProductTableAddToCompareButtonDisplayed() {
        return productTableAddToCompareButtonElements.stream()
                .allMatch(WebElement::isDisplayed);
    }

}
