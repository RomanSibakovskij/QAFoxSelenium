package com.tutorialsninja.qafox;

import com.tutorialsninja.qafox.utilities.BasePage;
import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

import java.util.*;
import java.util.stream.Collectors;

public class HomePage extends BasePage {

    //homepage web elements
    //main section
    @FindBy(xpath = "//div[@id='content']//div[@id='slideshow0']")
    private WebElement homePageProductImgCarousel;
    @FindBy(xpath = "//div[@class='swiper-pagination slideshow0 swiper-pagination-clickable swiper-pagination-bullets']/span[1]")
    private WebElement homePageProductImgCarouselDotLeftButton;
    @FindBy(xpath = "//div[@class='swiper-pagination slideshow0 swiper-pagination-clickable swiper-pagination-bullets']/span[2]")
    private WebElement homePageProductImgCarouselDotRightButton;
    @FindBy(xpath = "//div[@id='content']/h3")
    private WebElement homePageFeaturedProductSectionTitle;
    //featured product list elements
    private List<WebElement> homePageFeaturedProductImgLinkElements = driver.findElements(By.xpath("//div[@id='content']/div[@class='row']/div//div[@class='image']/a"));
    private List<WebElement> homePageFeaturedProductNameLinkElements = driver.findElements(By.xpath("//div[@id='content']/div[@class='row']/div//h4/a"));
    @FindBy(xpath = "//div[@id='content']/div[@class='row']/div//p[1]")
    private List<WebElement> homePageFeaturedProductDescElements;
    @FindBy(xpath = "//div[@id='content']/div[@class='row']/div//p[2]")
    private List<WebElement> homePageFeaturedProductUnitPriceElements;
    @FindBy(xpath = "//div[@id='content']/div[@class='row']/div//button[1]")
    private List<WebElement> homePageFeaturedProductAddToCartButtonElements;
    @FindBy(xpath = "//div[@id='content']/div[@class='row']/div//button[2]")
    private List<WebElement> homePageFeaturedProductAddToWishlistButtonElements;
    @FindBy(xpath = "//div[@id='content']/div[@class='row']/div//button[3]")
    private List<WebElement> homePageFeaturedProductAddToCompareButtonElements;
    //singular elements
    @FindBy(xpath = "//div[@id='carousel0']/div")
    private WebElement homePageBrandsImageCarousel;
    //dot buttons list elements
    private List<WebElement> homePageBrandsImageCarouselDotButtonElements = driver.findElements(By.xpath("//div[@class='swiper-pagination carousel0 swiper-pagination-clickable swiper-pagination-bullets']/span"));

    public HomePage(WebDriver driver) {super(driver);}

    //home page text element getter
    public String getHomePageFeaturedProductSectionTitle() {return homePageFeaturedProductSectionTitle.getText();}

    //home page featured product data getters (as a list)
    public List<String> getFeaturedProductNames() {return homePageFeaturedProductNameLinkElements.stream().map(WebElement::getText).collect(Collectors.toList());}

    public List<String> getFeaturedProductDescriptions() {return homePageFeaturedProductDescElements.stream().map(WebElement::getText).collect(Collectors.toList());}

    public List<String> getFeaturedProductUnitPrices() {return homePageFeaturedProductUnitPriceElements.stream().map(WebElement::getText).collect(Collectors.toList());}




    //home page web elements assert methods
    //main
    public boolean isHomePageProductImgCarouselDisplayed(){return homePageProductImgCarousel.isDisplayed();}
    public boolean isHomePageProductImgCarouselDotLeftButtonDisplayed() {return homePageProductImgCarouselDotLeftButton.isDisplayed();}
    public boolean isHomePageProductImgCarouselDotRightButtonDisplayed() {return homePageProductImgCarouselDotRightButton.isDisplayed();}
    public boolean isHomePageFeaturedProductSectionTitleDisplayed() {return homePageFeaturedProductSectionTitle.isDisplayed();}
    public boolean isHomePageBrandsImageCarouselDisplayed() {return homePageBrandsImageCarousel.isDisplayed();}
    //featured product list elements (as a list)
    public boolean isHomePageFeaturedProductImgLinkDisplayed() {
        return homePageFeaturedProductImgLinkElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isHomePageFeaturedProductNameLinkDisplayed() {
        return homePageFeaturedProductNameLinkElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isHomePageFeaturedProductDescDisplayed() {
        return homePageFeaturedProductDescElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isHomePageFeaturedProductUnitPriceDisplayed() {
        return homePageFeaturedProductUnitPriceElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isHomePageFeaturedProductAddToCartButtonDisplayed() {
        return homePageFeaturedProductAddToCartButtonElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isHomePageFeaturedProductAddToWishlistButtonDisplayed() {
        return homePageFeaturedProductAddToWishlistButtonElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isHomePageFeaturedProductAddToCompareButtonDisplayed() {
        return homePageFeaturedProductAddToCompareButtonElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    //brand image carousel dot button elements
    public boolean isHomePageBrandsImageCarouselDotButtonDisplayed() {
        return homePageBrandsImageCarouselDotButtonElements.stream()
                .allMatch(WebElement::isDisplayed);
    }

}
