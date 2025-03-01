package com.tutorialsninja.qafox.utilities;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SingleProductPageReviewInvalidInput extends BasePage{

    //reviews section
    @FindBy(xpath = "//input[@id='input-name']")
    private WebElement singleProductPageProductReviewUserNameInputField;
    @FindBy(xpath = "//textarea[@id='input-review']")
    private WebElement singleProductPageProductReviewInputField;
    @FindBy(xpath = "//input[@name='rating'][3]")
    private WebElement singleProductPageProductAvgRatingRadioButton;
    @FindBy(xpath = "//div[@class='alert alert-danger alert-dismissible']")
    private WebElement singleProductPageProductReviewFailMessage;

    //valid review input data
    private String guestUserName;
    private String userReview;

    //missing singular input data
    private String noGuestUserName;
    private String noReview;

    //too short singular input data
    private String tooShortGuestUserName;
    private String tooShortReview;

    public SingleProductPageReviewInvalidInput(WebDriver driver) {super(driver);}

    //valid review input methods (for remaining inputs)

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

    //invalid review input methods - no singular input

    //add no guest username method (guest)
    public void inputNoGuestUserNameIntoUserNameInputField(){
        noGuestUserName = "";
        singleProductPageProductReviewUserNameInputField.sendKeys(noGuestUserName);
    }

    //add no review text method
    public void inputNoUserReview(){
        noReview = "";
        singleProductPageProductReviewInputField.sendKeys(noReview);
    }

    //invalid review input methods - too short singular input

    //add too short guest username method (guest) (2 chars)
    public void inputTooShortGuestUserNameIntoUserNameInputField(){
        tooShortGuestUserName = "Dk";
        logger.info("Too short guest user name: " + tooShortGuestUserName);
        singleProductPageProductReviewUserNameInputField.sendKeys(tooShortGuestUserName);
    }

    //add too short review text method (24 chars)
    public void inputTooShortUserReview(){
        tooShortReview = "I wonder it's too short?";
        logger.info("Too short guest user review: " + tooShortReview);
        singleProductPageProductReviewInputField.sendKeys(tooShortReview);
    }

    //rate the product radio button click
    public void clickRatingRadioButton(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(800));
        wait.until(ExpectedConditions.elementToBeClickable(singleProductPageProductAvgRatingRadioButton));
        singleProductPageProductAvgRatingRadioButton.click();
    }

    //review submission failure message text getter
    public String getReviewFailedMessage(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(1100));
        wait.until(ExpectedConditions.visibilityOf(singleProductPageProductReviewFailMessage));
        return singleProductPageProductReviewFailMessage.getText();
    }

}
