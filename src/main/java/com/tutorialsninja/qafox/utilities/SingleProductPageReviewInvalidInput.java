package com.tutorialsninja.qafox.utilities;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

public class SingleProductPageReviewInvalidInput extends BasePage{

    //reviews section
    @FindBy(xpath = "//input[@id='input-name']")
    private WebElement singleProductPageProductReviewUserNameInputField;
    @FindBy(xpath = "//textarea[@id='input-review']")
    private WebElement singleProductPageProductReviewInputField;
    @FindBy(xpath = "//input[@name='rating'][3]")
    private WebElement singleProductPageProductAvgRatingRadioButton;
    @FindBy(xpath = "//button[@id='button-review']")
    private WebElement singleProductPageProductSubmitReviewButton;
    @FindBy(xpath = "//div[@class='alert alert-danger alert-dismissible']")
    private WebElement singleProductPageProductReviewFailMessage;

    public SingleProductPageReviewInvalidInput(WebDriver driver) {super(driver);}


}
