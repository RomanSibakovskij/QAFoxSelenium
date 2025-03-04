package com.tutorialsninja.qafox;

import com.tutorialsninja.qafox.utilities.*;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;
import java.util.*;


public class ConfirmOrderSuccessPage extends BasePage {

    //order success message elements
    @FindBy(xpath = "//div[@id='content']/h1")
    private WebElement confirmOrderSuccessMessageTitle;
    @FindBy(xpath = "//div[@id='content']/p")
    private WebElement confirmOrderSuccessMessageText;
    @FindBy(xpath = "//div[@id='content']/p[2]/a[1]")
    private WebElement confirmOrderSuccessMyAccountLink;
    @FindBy(xpath = "//div[@id='content']/p[2]/a[2]")
    private WebElement confirmOrderSuccessHistoryLink;
    @FindBy(xpath = "//div[@id='content']/p[3]/a")
    private WebElement confirmOrderSuccessDownloadsLink;
    @FindBy(xpath = "//div[@id='content']/p[4]/a")
    private WebElement confirmOrderSuccessStoreOwnerLink;
    @FindBy(xpath = "//div[@id='content']//a[@class='btn btn-primary']")
    private WebElement confirmOrderSuccessContinueButton;

    public ConfirmOrderSuccessPage(WebDriver driver) {super(driver);}

    //click 'Order History' link
    public void clickOrderHistoryLink(){
        Actions action = new Actions(driver);
        action.moveToElement(confirmOrderSuccessHistoryLink).click().perform();
    }

    //confirm order success page text getters
    public String getConfirmOrderSuccessMessageTitle() {return confirmOrderSuccessMessageTitle.getText();}
    public String getConfirmOrderSuccessMessageText() {return confirmOrderSuccessMessageText.getText();}

    //confirm order success page web element assert methods
    public boolean isConfirmOrderSuccessMessageTitleDisplayed() {return confirmOrderSuccessMessageTitle.isDisplayed();}
    public boolean isConfirmOrderSuccessMessageTextDisplayed() {return confirmOrderSuccessMessageText.isDisplayed();}
    public boolean isConfirmOrderSuccessMyAccountLinkDisplayed() {return confirmOrderSuccessMyAccountLink.isDisplayed();}
    public boolean isConfirmOrderSuccessHistoryLinkDisplayed() {return confirmOrderSuccessHistoryLink.isDisplayed();}
    public boolean isConfirmOrderSuccessDownloadLinkDisplayed() {return confirmOrderSuccessDownloadsLink.isDisplayed();}
    public boolean isConfirmOrderSuccessStoreOwnerLinkDisplayed() {return confirmOrderSuccessStoreOwnerLink.isDisplayed();}
    public boolean isConfirmOrderSuccessContinueButtonDisplayed() {return confirmOrderSuccessContinueButton.isDisplayed();}

}
