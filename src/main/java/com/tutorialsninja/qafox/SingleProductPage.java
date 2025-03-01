package com.tutorialsninja.qafox;

import com.tutorialsninja.qafox.utilities.*;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;
import java.util.*;

public class SingleProductPage extends BasePage{

    //single product page web elements
    @FindBy(xpath = "//ul[@class='thumbnails']/li[1]//img")
    private WebElement singleProductPageMainImage;
    //images list
    private List<WebElement> singleProductPageImageElements = driver.findElements(By.xpath("//ul[@class='thumbnails']/li[@class='image-additional']//img"));
    //singular elements
    @FindBy(xpath = "//button[@data-original-title='Add to Wish List']")
    private WebElement singleProductPageAddToWishlistButton;
    @FindBy(xpath = "//button[@data-original-title='Compare this Product']")
    private WebElement singleProductPageAddToCompareButton;
    @FindBy(xpath = "//div[@class='col-sm-4']/h1")
    private WebElement singleProductPageTitle;
    @FindBy(xpath = "//div[@class='col-sm-4']/ul[@class='list-unstyled'][1]/li")
    private WebElement singleProductPageProductShortDescription;
    @FindBy(xpath = "//div[@class='col-sm-4']/ul[@class='list-unstyled'][2]//h2")
    private WebElement singleProductPageProductShortUnitPrice;
    @FindBy(xpath = "//div[@class='col-sm-4']/ul[@class='list-unstyled'][2]/li[2]")
    private WebElement singleProductPageProductShortExTaxPrice;
    //description section
    @FindBy(xpath = "//ul[@class='nav nav-tabs']/li[1]/a")
    private WebElement singleProductPageProductDescriptionLink;
    @FindBy(xpath = "//div[@class='tab-content']")
    private WebElement singleProductPageProductDescription;
    //specification section
    @FindBy(xpath = "//ul[@class='nav nav-tabs']/li[2]/a")
    private WebElement singleProductPageProductSpecificationLink;
    //table list elements
    @FindBy(xpath = "//table[@class='table table-bordered']/tbody/tr/td[1]")
    private WebElement singleProductPageProductSpecificationTableName;
    @FindBy(xpath = "//table[@class='table table-bordered']/tbody/tr/td[2]")
    private WebElement singleProductPageProductSpecificationTableSpec;
    //singular elements
    //reviews section
    @FindBy(xpath = "//ul[@class='nav nav-tabs']/li[3]/a")
    private WebElement singleProductPageProductReviewsLink;
    @FindBy(xpath = "//label[@for='input-name']")
    private WebElement singleProductPageProductReviewUserNameSubtext;
    @FindBy(xpath = "//input[@id='input-name']")
    private WebElement singleProductPageProductReviewUserNameInputField;
    @FindBy(xpath = "//label[@for='input-review']")
    private WebElement singleProductPageProductReviewSubtext;
    @FindBy(xpath = "//textarea[@id='input-review']")
    private WebElement singleProductPageProductReviewInputField;
    @FindBy(xpath = "//label[text()='Rating']")
    private WebElement singleProductPageProductRatingSubtext;
    @FindBy(xpath = "//input[@name='rating'][3]")
    private WebElement singleProductPageProductAvgRatingRadioButton;
    @FindBy(xpath = "//button[@id='button-review']")
    private WebElement singleProductPageProductSubmitReviewButton;
    @FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
    private WebElement singleProductPageProductReviewSuccessMessage;
    @FindBy(xpath = "//div[@class='text-danger']")
    private WebElement singleProductPageDeliveryDateErrorMessage;
    @FindBy(xpath = "//div[@id='product-product']/div[@class='alert alert-success alert-dismissible']")
    private WebElement singleProductPageAdditionToCartSuccessMessage;
    //radio buttons list
    private List<WebElement> singleProductPageProductReviewRadioButtonElements = driver.findElements(By.xpath("//input[@name='rating']"));
    //add to cart section
    @FindBy(xpath = "//label[@for='input-option225']")
    private WebElement singleProductPageProductDeliveryDateSubtext;
    @FindBy(xpath = "//input[@id='input-option225']")
    private WebElement singleProductPageProductDeliveryDateInputField;
    @FindBy(xpath = "//div[@class='input-group date']//button")
    private WebElement singleProductPageProductDeliveryDateCalendar;
    @FindBy(xpath = "//label[@for='input-quantity']")
    private WebElement singleProductPageProductQtySubtitle;
    @FindBy(xpath = "//input[@id='input-quantity']")
    private WebElement singleProductPageProductQtyInputField;
    @FindBy(xpath = "//button[@id='button-cart']")
    private WebElement singleProductPageProductAddToCartButton;
    @FindBy(xpath = "//div[@class='rating']/p/span")
    private List<WebElement> singleProductPageProductReviewStarElements;
    @FindBy(xpath = "//div[@class='rating']/p/a[1]")
    private WebElement singleProductPageProductReviewCounter;
    @FindBy(xpath = "//div[@class='rating']/p/a[2]")
    private WebElement singleProductPageProductWriteReviewLink;

    //user name input data
    private String guestUserName;
    //valid review text input
    private String userReview;
    //no singular input
    private String noDeliveryDate;
    //invalid singular input (date)
    private String reversedDeliveryDateFormat;
    private String pastDeliveryDate;
    //changed quantity
    private String threeProductQuantity;

    public SingleProductPage(WebDriver driver) {super(driver);}

    //single product page delivery date addition method
    public void addDeliveryDate(){
        singleProductPageProductDeliveryDateInputField.clear();
        singleProductPageProductDeliveryDateInputField.sendKeys("2025-03-20");
    }

    //single product page invalid delivery date addition methods
    public void addNoDeliveryDate(){
        singleProductPageProductDeliveryDateInputField.clear();
        noDeliveryDate = "";
        logger.info("No delivery date: " + noDeliveryDate + "\n");
        singleProductPageProductDeliveryDateInputField.sendKeys(noDeliveryDate);
    }
    public void addReversedDeliveryDate(){
        singleProductPageProductDeliveryDateInputField.clear();
        reversedDeliveryDateFormat = "20-03-2025";
        logger.info("Reversed delivery date: " + reversedDeliveryDateFormat + "\n");
        singleProductPageProductDeliveryDateInputField.sendKeys(reversedDeliveryDateFormat);
    }
    public void addPastDeliveryDate(){
        singleProductPageProductDeliveryDateInputField.clear();
        pastDeliveryDate = "2000-01-01";
        logger.info("Past delivery date: " + pastDeliveryDate + "\n");
        singleProductPageProductDeliveryDateInputField.sendKeys(pastDeliveryDate);
    }

    //reviews link click method
    public void clickReviewsLink(){singleProductPageProductReviewsLink.click();}

    //add username method (guest)
    public void inputGuestUserNameIntoUserNameInputField(){
        guestUserName = TestDataGenerator.getRandomFirstName();
        singleProductPageProductReviewUserNameInputField.sendKeys(guestUserName);
    }

    //input review text method
    public void inputUserReview(){
        userReview = TestDataGenerator.getRandomReviewText();
        singleProductPageProductReviewInputField.sendKeys(userReview);
    }

    //rate the product radio button click
    public void clickRatingRadioButton(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(800));
        wait.until(ExpectedConditions.elementToBeClickable(singleProductPageProductAvgRatingRadioButton));
        singleProductPageProductAvgRatingRadioButton.click();
    }

    //submit review button click method
    public void clickSubmitReviewButton(){singleProductPageProductSubmitReviewButton.click();}

    //specifications link click method
    public void clickSpecificationsLink(){singleProductPageProductSpecificationLink.click();}

    //change product quantity
    public void changeProductQuantity(){
        singleProductPageProductQtyInputField.clear();
        threeProductQuantity = "3";
        logger.info("Changed product quantity in single product page: " + threeProductQuantity + "\n");
        singleProductPageProductQtyInputField.sendKeys(threeProductQuantity);
    }

    //click 'Add to Cart' button method
    public void clickAddToCartButton(){
        Actions actions = new Actions(driver);
        actions.moveToElement(singleProductPageProductAddToCartButton).click().perform();
    }

    //review success submission text getter
    public String getReviewSuccessMessage(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(1100));
        wait.until(ExpectedConditions.visibilityOf(singleProductPageProductReviewSuccessMessage));
        return singleProductPageProductReviewSuccessMessage.getText();
    }

    //addition to cart success message getter
    public String getAdditionToCartSuccessMessage(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(1100));
        wait.until(ExpectedConditions.visibilityOf(singleProductPageAdditionToCartSuccessMessage));
        return singleProductPageAdditionToCartSuccessMessage.getText();
    }

    //delivery date input error message getter
    public String getDeliveryDateErrorMessage(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(1100));
        wait.until(ExpectedConditions.visibilityOf(singleProductPageDeliveryDateErrorMessage));
        return singleProductPageDeliveryDateErrorMessage.getText();
    }

    //single product page text element getters
    public String getSingleProductPageTitle() {return singleProductPageTitle.getText();}
    public String getSingleProductPageProductShortDescription() {return singleProductPageProductShortDescription.getText();}
    public String getSingleProductPageProductShortUnitPrice() {return singleProductPageProductShortUnitPrice.getText();}
    public String getSingleProductPageProductShortExTaxPrice() {return singleProductPageProductShortExTaxPrice.getText();}
    public String getSingleProductPageProductDescription() {return singleProductPageProductDescription.getText();}

    //specification table list data getters
    public String getSingleProductPageProductSpecificationName() {return singleProductPageProductSpecificationTableName.getText();}
    public String getSingleProductPageProductSpecification() {return singleProductPageProductSpecificationTableSpec.getText();}

    //review section
    public String getSingleProductPageProductReviewUserNameSubtext() {return singleProductPageProductReviewUserNameSubtext.getText();}
    public String getSingleProductPageProductReviewSubtext() {return singleProductPageProductReviewSubtext.getText();}
    public String getSingleProductPageProductRatingSubtext() {return singleProductPageProductRatingSubtext.getText();}

    //single product page web element assert methods
    public boolean isSingleProductPageMainImageDisplayed() {return singleProductPageMainImage.isDisplayed();}
    public boolean isSingleProductPageProductAddToWishlistButtonDisplayed() {return singleProductPageAddToWishlistButton.isDisplayed();}
    public boolean isSingleProductPageProductAddToCompareButtonDisplayed() {return singleProductPageAddToCompareButton.isDisplayed();}
    public boolean isSingleProductPageTitleDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(1100));
        wait.until(ExpectedConditions.visibilityOf(singleProductPageTitle));
        return singleProductPageTitle.isDisplayed();
    }
    public boolean isSingleProductPageProductShortDescriptionDisplayed() {return singleProductPageProductShortDescription.isDisplayed();}
    public boolean isSingleProductPageProductShortUnitPriceDisplayed() {return singleProductPageProductShortUnitPrice.isDisplayed();}
    public boolean isSingleProductPageProductShortExTaxPriceDisplayed() {return singleProductPageProductShortExTaxPrice.isDisplayed();}
    public boolean isSingleProductPageProductDescriptionLinkDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(1100));
        wait.until(ExpectedConditions.visibilityOf(singleProductPageProductDescriptionLink));
        return singleProductPageProductDescriptionLink.isDisplayed();
    }
    public boolean isSingleProductPageSpecificationLinkDisplayed() {return singleProductPageProductSpecificationLink.isDisplayed();}
    public boolean isSingleProductPageProductReviewsLinkDisplayed() {return singleProductPageProductReviewsLink.isDisplayed();}
    public boolean isSingleProductPageProductDeliveryDateSubtextDisplayed() {return singleProductPageProductDeliveryDateSubtext.isDisplayed();}
    public boolean isSingleProductPageProductDeliveryDateInputFieldDisplayed() {return singleProductPageProductDeliveryDateInputField.isDisplayed();}
    public boolean isSingleProductPageDeliveryDateCalendarDisplayed() {return singleProductPageProductDeliveryDateCalendar.isDisplayed();}
    public boolean isSingleProductPageQtySubtitleDisplayed() {return singleProductPageProductQtySubtitle.isDisplayed();}
    public boolean isSingleProductPageQtyInputFieldDisplayed() {return singleProductPageProductQtyInputField.isDisplayed();}
    public boolean isSingleProductPageProductAddToCartButtonDisplayed() {return singleProductPageProductAddToCartButton.isDisplayed();}
    public boolean isSingleProductPageProductReviewCounterDisplayed() {return singleProductPageProductReviewCounter.isDisplayed();}
    public boolean isSingleProductPageProductWriteReviewLinkDisplayed() {return singleProductPageProductWriteReviewLink.isDisplayed();}
    //list elements
    public boolean isSingleProductPageImagesDisplayed() {
        return singleProductPageImageElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isSingleProductPageProductReviewButtonsDisplayed() {
        return singleProductPageProductReviewRadioButtonElements.stream()
                .allMatch(WebElement::isDisplayed);
    }

}
