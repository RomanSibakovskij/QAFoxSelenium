package com.tutorialsninja.qafox;

import com.tutorialsninja.qafox.utilities.*;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;

public class AddAddressPage extends BasePage{

    //add address page web elements
    @FindBy(xpath = "//div[@id='content']/h2")
    private WebElement addAddressPageTitle;
    @FindBy(xpath = "//label[@for='input-firstname']")
    private WebElement addAddressFirstNameSubtext;
    @FindBy(xpath = "//input[@id='input-firstname']")
    private WebElement addAddressFirstNameInputField;
    @FindBy(xpath = "//label[@for='input-lastname']")
    private WebElement addAddressLastNameSubtext;
    @FindBy(xpath = "//input[@id='input-lastname']")
    private WebElement addAddressLastNameInputField;
    @FindBy(xpath = "//label[@for='input-company']")
    private WebElement addAddressCompanySubtext;
    @FindBy(xpath = "//input[@id='input-company']")
    private WebElement addAddressCompanyInputField;
    @FindBy(xpath = "//label[@for='input-address-1']")
    private WebElement addAddressAddress1Subtext;
    @FindBy(xpath = "//input[@id='input-address-1']")
    private WebElement addAddressAddress1InputField;
    @FindBy(xpath = "//label[@for='input-address-2']")
    private WebElement addAddressAddress2Subtext;
    @FindBy(xpath = "//input[@id='input-address-2']")
    private WebElement addAddressAddress2InputField;
    @FindBy(xpath = "//label[@for='input-city']")
    private WebElement addAddressCitySubtext;
    @FindBy(xpath = "//input[@id='input-city']")
    private WebElement addAddressCityInputField;
    @FindBy(xpath = "//label[@for='input-postcode']")
    private WebElement addAddressPostCodeSubtext;
    @FindBy(xpath = "//input[@id='input-postcode']")
    private WebElement addAddressPostCodeInputField;
    @FindBy(xpath = "//label[@for='input-country']")
    private WebElement addAddressCountrySubtext;
    @FindBy(xpath = "//select[@id='input-country']")
    private WebElement addAddressCountryDropdownMenu;
    @FindBy(xpath = "//select[@id='input-country']/option[@value='223']")
    private WebElement addAddressUSCountryOption;
    @FindBy(xpath = "//label[@for='input-zone']")
    private WebElement addAddressStateSubtext;
    @FindBy(xpath = "//select[@id='input-zone']")
    private WebElement addAddressStateDropdownMenu;
    @FindBy(xpath = "//select[@id='input-zone']/option[.='Alabama']")
    private WebElement addAddressAlabamaStateOption;
    @FindBy(xpath = "//select[@id='input-zone']/option[.='Illinois']")
    private WebElement addAddressIllinoisStateOption;
    @FindBy(xpath = "//label[.='Default Address']")
    private WebElement addAddressDefaultAddressSubtext;
    @FindBy(xpath = "//input[@value='1']")
    private WebElement addAddressDefaultAddressYesRadioButton;
    @FindBy(xpath = "//input[@value='0']")
    private WebElement addAddressDefaultAddressNoRadioButton;
    @FindBy(xpath = "//div[@class='buttons clearfix']//a")
    private WebElement addAddressBackButton;
    @FindBy(xpath = "//div[@class='buttons clearfix']//input")
    private WebElement addAddressContinueButton;

    //valid user address data
    private String addressFirstName;
    private String addressLastName;
    private String address1;
    private String city;
    private int postCode;

    public AddAddressPage(WebDriver driver) {super(driver);}

    //valid user address data getter
    public void validUserAddressDataGetter(RegisterPage registerPage) {

        addressFirstName = registerPage.getUserFirstName();
        addressLastName = registerPage.getUserLastName();
        address1 = TestDataGenerator.generateRandomAddress(8);
        city = TestDataGenerator.getRandomCity();
        postCode = TestDataGenerator.getRandomPostalCode();

        System.out.println("Valid generated user address data: " + "\n");
        logger.info("Valid user first name: " + addressFirstName);
        logger.info("Valid user last name: " + addressLastName);
        logger.info("Valid user address 1: " + address1);
        logger.info("Valid user city: " + city);
        logger.info("Valid user post code: " + postCode);
        System.out.println("\n");
    }

    //valid user data input methods
    public void inputValidFirstNameIntoFirstNameInputField(){addAddressFirstNameInputField.sendKeys(addressFirstName);}
    public void inputValidLastNameIntoLastNameInputField(){addAddressLastNameInputField.sendKeys(addressLastName);}
    public void inputValidAddress1IntoAddress1InputField(){addAddressAddress1InputField.sendKeys(address1);}
    public void inputValidCityIntoCityInputField(){addAddressCityInputField.sendKeys(city);}
    public void inputValidPostCodeIntoPostCodeInputField(){addAddressPostCodeInputField.sendKeys(String.valueOf(postCode));}

    //click country dropdown menu
    public void clickCountryDropdownMenu(){
        Actions actions = new Actions(driver);
        actions.moveToElement(addAddressCountryDropdownMenu).click().perform();
    }

    //select 'United States' option
    public void selectUsCountryOption(){addAddressUSCountryOption.click();}

    //click state dropdown menu
    public void clickStateDropdownMenu(){
        Actions actions = new Actions(driver);
        actions.moveToElement(addAddressStateDropdownMenu).click().perform();
    }

    //select 'Illinois' option
    public void selectIllinoisStateOption(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(900));
        wait.until(ExpectedConditions.elementToBeClickable(addAddressIllinoisStateOption));
        addAddressIllinoisStateOption.click();
    }

    //select 'Alabama' option
    public void selectAlabamaStateOption(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(900));
        wait.until(ExpectedConditions.elementToBeClickable(addAddressAlabamaStateOption));
        addAddressAlabamaStateOption.click();
    }

    //click 'Yes' default address radio button method (default selected is 'No')
    public void clickYesDefaultAddressRadioButton(){
        Actions actions = new Actions(driver);
        actions.click(addAddressDefaultAddressYesRadioButton).click().perform();
    }

    //click 'Continue' button
    public void clickAddressContinueButton(){
        Actions actions = new Actions(driver);
        actions.click(addAddressContinueButton).click().perform();
    }

    //add address page text element getters
    public String getAddAddressPageTitle() {return addAddressPageTitle.getText();}
    public String getAddAddressFirstNameSubtext() {return addAddressFirstNameSubtext.getText();}
    public String getAddAddressLastNameSubtext() {return addAddressLastNameSubtext.getText();}
    public String getAddAddressCompanySubtext() {return addAddressCompanySubtext.getText();}
    public String getAddAddressPageAddress1Subtext() {return addAddressAddress1Subtext.getText();}
    public String getAddAddressPageAddress2Subtext() {return addAddressAddress2Subtext.getText();}
    public String getAddAddressCitySubtext() {return addAddressCitySubtext.getText();}
    public String getAddAddressPostCodeSubtext() {return addAddressPostCodeSubtext.getText();}
    public String getAddAddressCountrySubtext() {return addAddressCountrySubtext.getText();}
    public String getAddAddressStateSubtext() {return addAddressStateSubtext.getText();}
    public String getAddAddressDefaultAddressSubtext() {return addAddressDefaultAddressSubtext.getText();}

    //add address page web element assert methods
    public boolean isAddAddressPageTitleDisplayed() {return addAddressPageTitle.isDisplayed();}
    public boolean isAddAddressFirstNameSubtextDisplayed() {return addAddressFirstNameSubtext.isDisplayed();}
    public boolean isAddAddressFirstNameInputFieldDisplayed() {return addAddressFirstNameInputField.isDisplayed();}
    public boolean isAddAddressLastNameSubtextDisplayed() {return addAddressLastNameSubtext.isDisplayed();}
    public boolean isAddAddressLastNameInputFieldDisplayed() {return addAddressLastNameInputField.isDisplayed();}
    public boolean isAddAddressCompanySubtextDisplayed() {return addAddressCompanySubtext.isDisplayed();}
    public boolean isAddAddressCompanyInputFieldDisplayed() {return addAddressCompanyInputField.isDisplayed();}
    public boolean isAddAddressPageAddress1SubtextDisplayed() {return addAddressAddress1Subtext.isDisplayed();}
    public boolean isAddAddressPageAddress1InputFieldDisplayed() {return addAddressAddress1InputField.isDisplayed();}
    public boolean isAddAddressPageAddress2SubtextDisplayed() {return addAddressAddress2Subtext.isDisplayed();}
    public boolean isAddAddressPageAddress2InputFieldDisplayed() {return addAddressAddress2InputField.isDisplayed();}
    public boolean isAddAddressCitySubtextDisplayed() {return addAddressCitySubtext.isDisplayed();}
    public boolean isAddAddressCityInputFieldDisplayed() {return addAddressCityInputField.isDisplayed();}
    public boolean isAddAddressPostCodeSubtextDisplayed() {return addAddressPostCodeSubtext.isDisplayed();}
    public boolean isAddAddressPostCodeInputFieldDisplayed() {return addAddressPostCodeInputField.isDisplayed();}
    public boolean isAddAddressCountrySubtextDisplayed() {return addAddressCountrySubtext.isDisplayed();}
    public boolean isAddAddressCountryDropdownMenuDisplayed() {return addAddressCountryDropdownMenu.isDisplayed();}
    public boolean isAddAddressStateSubtextDisplayed() {return addAddressStateSubtext.isDisplayed();}
    public boolean isAddAddressStateDropdownMenuDisplayed() {return addAddressStateDropdownMenu.isDisplayed();}
    public boolean isAddAddressDefaultAddressSubtextDisplayed() {return addAddressDefaultAddressSubtext.isDisplayed();}
    public boolean isAddAddressDefaultAddressYesRadioButtonDisplayed() {return addAddressDefaultAddressYesRadioButton.isDisplayed();}
    public boolean isAddAddressDefaultAddressNoRadioButtonDisplayed() {return addAddressDefaultAddressNoRadioButton.isDisplayed();}
    public boolean isAddAddressBackButtonDisplayed() {return addAddressBackButton.isDisplayed();}
    public boolean isAddAddressContinueButtonDisplayed() {return addAddressContinueButton.isDisplayed();}

}
