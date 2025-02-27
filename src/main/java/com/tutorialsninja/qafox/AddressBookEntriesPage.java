package com.tutorialsninja.qafox;

import com.tutorialsninja.qafox.utilities.BasePage;
import org.openqa.selenium.*;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

public class AddressBookEntriesPage extends BasePage{

    @FindBy(xpath = "//h2")
    private WebElement addressBookEntriesPageTitle;
    @FindBy(xpath = "//div[@id='content']/p")
    private WebElement addressBookEntriesPageNoAddressMessage;
    @FindBy(xpath = "//div[@class='buttons clearfix']//a[@class='btn btn-default']")
    private WebElement addressBookEntriesPageBackButton;
    @FindBy(xpath = "//div[@class='buttons clearfix']//a[@class='btn btn-primary']")
    private WebElement addressBookEntriesPageNewAddressButton;
    //address book list elements
    @FindBy(xpath = "//table//tr/td[1]")
    private List<WebElement> addressBookEntryDataElements;
    private List<WebElement> addressBookEntryEditButtonElements = driver.findElements(By.xpath("//table//tr/td[2]/a[1]"));
    private List<WebElement> addressBookEntryDeleteButtonElements = driver.findElements(By.xpath("//table//tr/td[2]/a[2]"));
    //success message element
    @FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
    private WebElement addressSuccessMessage;

    public AddressBookEntriesPage(WebDriver driver) {super(driver);}

    //address book entries data getter
    public List<String> getAddressBookEntryData(){return addressBookEntryDataElements.stream().map(WebElement::getText).collect(Collectors.toList());}

    //click 'New Address' button method
    public void clickNewAddressButton(){addressBookEntriesPageNewAddressButton.click();}

    //address book entries text element getters
    public String getAddressBookEntriesPageTitle() {return addressBookEntriesPageTitle.getText();}
    public String getAddressBookEntriesPageNoAddressMessage() {return addressBookEntriesPageNoAddressMessage.getText();}

    //address addition success message getter
    public String getAddressAdditionSuccessMessage() {return addressSuccessMessage.getText();}

    //address book entries web element assert methods
    public boolean isAddressBookEntriesPageTitleDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(1300));
        wait.until(ExpectedConditions.visibilityOf(addressBookEntriesPageTitle));
        return addressBookEntriesPageTitle.isDisplayed();
    }
    public boolean isAddressBookEntriesPageBackButtonDisplayed() {return addressBookEntriesPageBackButton.isDisplayed();}
    public boolean isAddressBookEntriesPageNewAddressButtonDisplayed() {return addressBookEntriesPageNewAddressButton.isDisplayed();}

}
