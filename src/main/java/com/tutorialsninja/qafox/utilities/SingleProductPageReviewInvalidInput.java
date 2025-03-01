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

    //too long singular input data
    private String tooLongGuestUserName;
    private String tooLongReview;

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
        logger.info("Too short guest user name: " + tooShortGuestUserName + "\n");
        singleProductPageProductReviewUserNameInputField.sendKeys(tooShortGuestUserName);
    }

    //add too short review text method (24 chars)
    public void inputTooShortUserReview(){
        tooShortReview = "I wonder it's too short?";
        logger.info("Too short guest user review: " + tooShortReview + "\n");
        singleProductPageProductReviewInputField.sendKeys(tooShortReview);
    }

    //invalid review input methods - too long singular input

    //add too long guest username method (guest) (26 chars)
    public void inputTooLongGuestUserNameIntoUserNameInputField(){
        tooLongGuestUserName = "Ffgdfdsfbfgjhjhfgcxxcvcxbc";
        logger.info("Too long guest user name: " + tooLongGuestUserName + "\n");
        singleProductPageProductReviewUserNameInputField.sendKeys(tooLongGuestUserName);
    }

    //add too long review text method (1001 chars)
    public void inputTooLongUserReview(){
        tooLongReview = "I've been using the HP LP3065 for about three months now, and I'm really impressed with the overall package. The 15.6\" screen is bright with excellent color accuracy - perfect for both work and streaming content. Battery life has been consistently 8-9 hours with moderate use, which is a significant improvement over my previous laptop.\n" +
                "Performance-wise, it handles everything I throw at it without breaking a sweat. The 12th gen processor paired with 16GB RAM makes multitasking smooth, and I can even do light video editing and gaming without major slowdowns.\n" +
                "Build quality is excellent with the aluminum chassis, though it does pick up fingerprints easily. The keyboard has good travel and is backlit, making night work comfortable. The trackpad is responsive but occasionally registers phantom touches near the edges.\n" +
                "My main complaints are the limited port selection (only 2 USB-C ports) and the webcam quality, which is mediocre at best. The speakers are decent but lack bass or stereo.\n" +
                "Good price. ";
        logger.info("Too long guest user review: " + tooLongReview + "\n");
        singleProductPageProductReviewInputField.sendKeys(tooLongReview);
    }

    //review submission failure message text getter
    public String getReviewFailedMessage(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(1100));
        wait.until(ExpectedConditions.visibilityOf(singleProductPageProductReviewFailMessage));
        return singleProductPageProductReviewFailMessage.getText();
    }

}
