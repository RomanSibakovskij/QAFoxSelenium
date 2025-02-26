package com.tutorialsninja.qafox;

import com.tutorialsninja.qafox.utilities.BasePage;
import org.openqa.selenium.*;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;

public class AddressBookEntriesPage extends BasePage{

    @FindBy(xpath = "//h2")
    private WebElement addressBookEntriesPageTitle;
    @FindBy(xpath = "//div[@id='content']/p")
    private WebElement addressBookEntriesPageNoAddressMessage;
    @FindBy(xpath = "//div[@class='buttons clearfix']//a[@class='btn btn-default']")
    private WebElement addressBookEntriesPageBackButton;
    @FindBy(xpath = "//div[@class='buttons clearfix']//a[@class='btn btn-primary']")
    private WebElement addressBookEntriesPageNewAddressButton;

    public AddressBookEntriesPage(WebDriver driver) {super(driver);}

    //address book entries text element getters
    public String getAddressBookEntriesPageTitle() {return addressBookEntriesPageTitle.getText();}
    public String getAddressBookEntriesPageNoAddressMessage() {return addressBookEntriesPageNoAddressMessage.getText();}

    //address book entries web element assert methods
    public boolean isAddressBookEntriesPageTitleDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(1300));
        wait.until(ExpectedConditions.visibilityOf(addressBookEntriesPageTitle));
        return addressBookEntriesPageTitle.isDisplayed();
    }
    public boolean isAddressBookEntriesPageBackButtonDisplayed() {return addressBookEntriesPageBackButton.isDisplayed();}
    public boolean isAddressBookEntriesPageNewAddressButtonDisplayed() {return addressBookEntriesPageNewAddressButton.isDisplayed();}

}
