package com.tutorialsninja.qafox;

import com.tutorialsninja.qafox.utilities.BasePage;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;
import java.util.*;


public class MyAccountPage extends BasePage {

    //my account page web elements
    //main
    @FindBy(xpath = "//ul[@class='breadcrumb']/li")
    private List<WebElement> pageBreadcrumbElements;
    //my account section
    @FindBy(xpath = "//div[@id='content']/h2[1]")
    private WebElement myAccountPageMyAccountSectionTitle;
    @FindBy(xpath = "//div[@id='content']/ul[1]/li[1]/a")
    private WebElement myAccountPageEditAccountInfoLink;
    @FindBy(xpath = "//div[@id='content']/ul[1]/li[2]/a")
    private WebElement myAccountPageChangePasswordLink;
    @FindBy(xpath = "//div[@id='content']/ul[1]/li[3]/a")
    private WebElement myAccountPageModifyAddressBookLink;
    @FindBy(xpath = "//div[@id='content']/ul[1]/li[4]/a")
    private WebElement myAccountPageModifyWishlistLink;
    //my orders section
    @FindBy(xpath = "//div[@id='content']/h2[2]")
    private WebElement myAccountPageMyOrdersSectionTitle;
    @FindBy(xpath = "//div[@id='content']/ul[2]/li[1]/a")
    private WebElement myAccountPageViewOrderHistoryLink;
    @FindBy(xpath = "//div[@id='content']/ul[2]/li[2]/a")
    private WebElement myAccountPageDownloadsLink;
    @FindBy(xpath = "//div[@id='content']/ul[2]/li[3]/a")
    private WebElement myAccountPageRewardPointsLink;
    @FindBy(xpath = "//div[@id='content']/ul[2]/li[4]/a")
    private WebElement myAccountPageReturnRequestsLink;
    @FindBy(xpath = "//div[@id='content']/ul[2]/li[5]")
    private WebElement myAccountPageTransactionsLink;
    @FindBy(xpath = "//div[@id='content']/ul[2]/li[6]")
    private WebElement myAccountPagePaymentsLink;
    //my affiliate account section
    @FindBy(xpath = "//div[@id='content']/h2[3]")
    private WebElement myAccountPageMyAffiliateAccountSectionTitle;
    @FindBy(xpath = "//div[@id='content']/ul[3]/li/a")
    private WebElement myAccountPageRegisterAffiliateAccountLink;
    //newsletter section
    @FindBy(xpath = "//div[@id='content']/h2[4]")
    private WebElement myAccountPageNewsletterSectionTitle;
    @FindBy(xpath = "//div[@id='content']/ul[4]/li/a")
    private WebElement myAccountPageSubscribeNewsletterLink;
    //aside section
    @FindBy(xpath = "//aside//a[1]")
    private WebElement asideMyAccountLink;
    @FindBy(xpath = "//aside//a[2]")
    private WebElement asideEditAccountLink;
    @FindBy(xpath = "//aside//a[3]")
    private WebElement asidePasswordLink;
    @FindBy(xpath = "//aside//a[4]")
    private WebElement asideAddressBookLink;
    @FindBy(xpath = "//aside//a[5]")
    private WebElement asideWishlistLink;
    @FindBy(xpath = "//aside//a[6]")
    private WebElement asideOrderHistoryLink;
    @FindBy(xpath = "//aside//a[7]")
    private WebElement asideDownloadsLink;
    @FindBy(xpath = "//aside//a[8]")
    private WebElement asideRecurringPaymentsLink;
    @FindBy(xpath = "//aside//a[9]")
    private WebElement asideRewardPointsLink;
    @FindBy(xpath = "//aside//a[10]")
    private WebElement asideReturnsLink;
    @FindBy(xpath = "//aside//a[11]")
    private WebElement asideTransactionsLink;
    @FindBy(xpath = "//aside//a[12]")
    private WebElement asideNewsletterLink;
    @FindBy(xpath = "//aside//a[13]")
    private WebElement asideLogoutLink;
    //account creation success elements
    @FindBy(xpath = "//div[@id='content']/h1")
    private WebElement successMessageTitle;
    @FindBy(xpath = "//div[@id='content']/p[1]")
    private WebElement successMessageOne;
    @FindBy(xpath = "//div[@id='content']/p[2]")
    private WebElement successMessageTwo;
    @FindBy(xpath = "//div[@id='content']/p[3]")
    private WebElement successMessageThree;
    @FindBy(xpath = "//div[@id='content']/p[4]")
    private WebElement successMessageFour;
    @FindBy(xpath = "//div[@class='pull-right']/a")
    private WebElement accountCreationSuccessContinueButton;
    //success message element
    @FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
    private WebElement successMessage;


    public MyAccountPage(WebDriver driver) {super(driver);}

    //click 'Logout' link method
    public void clickLogoutLink(){
        Actions actions = new Actions(driver);
        actions.moveToElement(asideLogoutLink).click().perform();
    }

    //my account page text element getters
    public String getMyAccountSectionTitle() {return myAccountPageMyAccountSectionTitle.getText();}
    public String getMyOrdersSectionTitle() {return myAccountPageMyOrdersSectionTitle.getText();}
    public String getMyAffiliateAccountSectionTitle() {return myAccountPageMyAffiliateAccountSectionTitle.getText();}
    public String getMyAccountPageNewsletterSectionTitle() {return myAccountPageNewsletterSectionTitle.getText();}

    //success message text getters
    public String getSuccessMessageTitle(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(2300));
        wait.until(ExpectedConditions.visibilityOf(successMessageTitle));
        return successMessageTitle.getText();
    }
    public String successMessageOne(){return successMessageOne.getText();}
    public String getSuccessMessageTwo(){return successMessageTwo.getText();}
    public String getSuccessMessageThree(){return successMessageThree.getText();}
    public String getSuccessMessageFour(){return successMessageFour.getText();}

    //click 'Continue' button
    public void clickContinueButton(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(1100));
        wait.until(ExpectedConditions.elementToBeClickable(accountCreationSuccessContinueButton));
        accountCreationSuccessContinueButton.click();
    }

    //click aside 'Edit account information' link method
    public void clickAsideEditAccountInfoLink(){
        Actions actions = new Actions(driver);
        actions.moveToElement(asideEditAccountLink).click().perform();
    }

    //click 'Edit account information' link method
    public void clickEditAccountInfoLink(){
        Actions actions = new Actions(driver);
        actions.moveToElement(myAccountPageEditAccountInfoLink).click().perform();
    }

    //click aside 'Edit account information' link method
    public void clickAsidePasswordLink(){
        Actions actions = new Actions(driver);
        actions.moveToElement(asidePasswordLink).click().perform();
    }

    //click 'Change your password' link method
    public void clickChangePasswordInfoLink(){
        Actions actions = new Actions(driver);
        actions.moveToElement(myAccountPageChangePasswordLink).click().perform();
    }

    //click 'Modify Address Book Entries' link method
    public void clickModifyAddressBookEntriesLink(){
        Actions actions = new Actions(driver);
        actions.moveToElement(myAccountPageModifyAddressBookLink).click().perform();
    }

    //click aside 'Address Book' link method
    public void clickAsideAddressBookLink(){
        Actions actions = new Actions(driver);
        actions.moveToElement(asideAddressBookLink).click().perform();
    }

    //my account page success message getter
    public String getSuccessMessage(){return successMessage.getText();}

    //my account page web element assert methods
    public boolean isPageBreadcrumbDisplayed() {
        return pageBreadcrumbElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    //main (singular elements)
    //my account section
    public boolean isMyAccountPageMyAccountSectionTitleDisplayed() {return myAccountPageMyAccountSectionTitle.isDisplayed();}
    public boolean isMyAccountPageEditAccountInfoLinkDisplayed() {return myAccountPageEditAccountInfoLink.isDisplayed();}
    public boolean isMyAccountPageChangePasswordLinkDisplayed() {return myAccountPageChangePasswordLink.isDisplayed();}
    public boolean isMyAccountPageModifyAddressBookLinkDisplayed() {return myAccountPageModifyAddressBookLink.isDisplayed();}
    public boolean isMyAccountPageModifyWishlistLinkDisplayed() {return myAccountPageModifyWishlistLink.isDisplayed();}
    //my orders section
    public boolean isMyAccountPageMyOrdersSectionTitleDisplayed() {return myAccountPageMyOrdersSectionTitle.isDisplayed();}
    public boolean isMyAccountPageViewOrderHistoryLinkDisplayed() {return myAccountPageViewOrderHistoryLink.isDisplayed();}
    public boolean isMyAccountPageDownloadsLinkDisplayed() {return myAccountPageDownloadsLink.isDisplayed();}
    public boolean isMyAccountPageRewardPointsLinkDisplayed() {return myAccountPageRewardPointsLink.isDisplayed();}
    public boolean isMyAccountPageReturnRequestsLinkDisplayed() {return myAccountPageReturnRequestsLink.isDisplayed();}
    public boolean isMyAccountPageTransactionsLinkDisplayed() {return myAccountPageTransactionsLink.isDisplayed();}
    public boolean isMyAccountPagePaymentsLinkDisplayed() {return myAccountPagePaymentsLink.isDisplayed();}
    //my affiliate account section
    public boolean isMyAccountPageMyAffiliateAccountSectionTitleDisplayed() {return myAccountPageMyAffiliateAccountSectionTitle.isDisplayed();}
    public boolean isMyAccountPageRegisterAffiliateAccountLinkDisplayed() {return myAccountPageRegisterAffiliateAccountLink.isDisplayed();}
    //newsletter section
    public boolean isMyAccountPageNewsletterSectionTitleDisplayed() {return myAccountPageNewsletterSectionTitle.isDisplayed();}
    public boolean isMyAccountPageSubscribeNewsletterLinkDisplayed() {return myAccountPageSubscribeNewsletterLink.isDisplayed();}
    //aside section
    public boolean isMyAccountPageAsideMyAccountLinkDisplayed() {return asideMyAccountLink.isDisplayed();}
    public boolean isMyAccountPageAsideEditAccountLinkDisplayed() {return asideEditAccountLink.isDisplayed();}
    public boolean isMyAccountPageAsidePasswordLinkDisplayed() {return asidePasswordLink.isDisplayed();}
    public boolean isMyAccountPageAsideAddressBookLinkDisplayed() {return asideAddressBookLink.isDisplayed();}
    public boolean isMyAccountPageAsideWishlistLinkDisplayed() {return asideWishlistLink.isDisplayed();}
    public boolean isMyAccountPageAsideOrderHistoryLinkDisplayed() {return asideOrderHistoryLink.isDisplayed();}
    public boolean isMyAccountPageAsideDownloadsLinkDisplayed() {return asideDownloadsLink.isDisplayed();}
    public boolean isMyAccountPageAsideRecurringPaymentsLinkDisplayed() {return asideRecurringPaymentsLink.isDisplayed();}
    public boolean isMyAccountPageAsideRewardPointsLinkDisplayed() {return asideRewardPointsLink.isDisplayed();}
    public boolean isMyAccountPageAsideReturnsLinkDisplayed() {return asideReturnsLink.isDisplayed();}
    public boolean isMyAccountPageAsideTransactionsLinkDisplayed() {return asideTransactionsLink.isDisplayed();}
    public boolean isMyAccountPageAsideNewsletterLinkDisplayed() {return asideNewsletterLink.isDisplayed();}
    public boolean isMyAccountPageAsideLogoutLinkDisplayed() {return asideLogoutLink.isDisplayed();}

}
