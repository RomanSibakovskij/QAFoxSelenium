package com.tutorialsninja.qafox;

import com.tutorialsninja.qafox.utilities.BasePage;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.*;

public class GeneralPage extends BasePage {

    //general page web elements
    //top navbar
    @FindBy(xpath = "//nav[@id='top']//button[@data-toggle='dropdown']")
    private WebElement currencyDropdownMenu;
    @FindBy(xpath = "//div[@id='top-links']/ul/li[1]/a")
    private WebElement phoneContactIconLink;
    @FindBy(xpath = "//div[@id='top-links']/ul/li[2]/a")
    private WebElement accountDropdownMenu;
    @FindBy(xpath = "//ul[@class='dropdown-menu dropdown-menu-right']/li[1]/a")
    private WebElement registerLinkOption;
    @FindBy(xpath = "//ul[@class='dropdown-menu dropdown-menu-right']/li[2]/a")
    private WebElement loginLinkOption;
    @FindBy(xpath = "//div[@id='top-links']/ul/li[3]/a")
    private WebElement wishlistIconLink;
    @FindBy(xpath = "//div[@id='top-links']/ul/li[4]/a")
    private WebElement shoppingCartIconLink;
    @FindBy(xpath = "//div[@id='top-links']/ul/li[5]/a")
    private WebElement checkoutIconLink;
    //header
    @FindBy(xpath = "//header//input")
    private WebElement searchBarInputField;
    @FindBy(xpath = "//div[@id='search']//button")
    private WebElement searchButton;
    @FindBy(xpath = "//div[@id='cart']/button")
    private WebElement shoppingCartButton;
    @FindBy(xpath = "//div[@id='logo']//a")
    private WebElement homePageLogoLink;
    //shopping cart dropdown menu elements
    private List<WebElement> shoppingCartDropdownProductImageElements = driver.findElements(By.xpath("//table[@class='table table-striped']//tr/td[1]/a"));
    @FindBy(xpath = "//table[@class='table table-striped']//tr/td[2]/a")
    private List<WebElement> shoppingCartDropdownProductNameElements;
    @FindBy(xpath = "//table[@class='table table-striped']//tr/td[2]/small")
    private List<WebElement> shoppingCartDropdownProductDescElements;
    @FindBy(xpath = "//table[@class='table table-striped']//tr/td[3]")
    private List<WebElement> shoppingCartDropdownProductQtyElements;
    @FindBy(xpath = "//table[@class='table table-striped']//tr/td[4]")
    private List<WebElement> shoppingCartDropdownProductUnitPriceElements;
    private List<WebElement> shoppingCartDropdownProductRemoveButtonElements = driver.findElements(By.xpath("//table[@class='table table-striped']//tr/td[5]/button"));
    @FindBy(xpath = "//ul[@class='dropdown-menu pull-right']//table[@class='table table-bordered']/tbody/tr[1]/td[2]")
    private WebElement shoppingCartSubTotalPrice;
    @FindBy(xpath = "//ul[@class='dropdown-menu pull-right']//table[@class='table table-bordered']/tbody/tr[2]/td[2]")
    private WebElement shoppingCartTotalPrice;
    @FindBy(xpath = "//p[@class='text-right']/a[1]")
    private WebElement shoppingCartViewCartLink;
    @FindBy(xpath = "//p[@class='text-right']/a[2]")
    private WebElement shoppingCartShoppingCartLink;

    //header navbar
    @FindBy(xpath = "//nav[@id='menu']//ul[@class='nav navbar-nav']/li[1]/a")
    private WebElement desktopsNavLink;
    @FindBy(xpath = "//nav[@id='menu']//ul[@class='nav navbar-nav']/li[1]/div/a")
    private WebElement showAllDesktopsDropdownLink;
    @FindBy(xpath = "//nav[@id='menu']//ul[@class='nav navbar-nav']/li[2]/a")
    private WebElement laptopsNavLink;
    @FindBy(xpath = "//nav[@id='menu']//ul[@class='nav navbar-nav']/li[3]/a")
    private WebElement componentsNavLink;
    @FindBy(xpath = "//nav[@id='menu']//ul[@class='nav navbar-nav']/li[4]/a")
    private WebElement tabletsNavLink;
    @FindBy(xpath = "//nav[@id='menu']//ul[@class='nav navbar-nav']/li[5]/a")
    private WebElement softwareNavLink;
    @FindBy(xpath = "//nav[@id='menu']//ul[@class='nav navbar-nav']/li[6]/a")
    private WebElement phonesNavLink;
    @FindBy(xpath = "//nav[@id='menu']//ul[@class='nav navbar-nav']/li[7]/a")
    private WebElement camerasNavLink;
    @FindBy(xpath = "//nav[@id='menu']//ul[@class='nav navbar-nav']/li[8]/a")
    private WebElement mp3PlayersNavLink;
    //footer
    @FindBy(xpath = "//footer//div[@class='col-sm-3'][1]/h5")
    private WebElement footerInformationSectionTitle;
    @FindBy(xpath = "//footer//div[@class='col-sm-3'][1]/ul/li[1]/a")
    private WebElement footerInfoAboutUsLink;
    @FindBy(xpath = "//footer//div[@class='col-sm-3'][1]/ul/li[2]/a")
    private WebElement footerInfoDeliveryInfoLink;
    @FindBy(xpath = "//footer//div[@class='col-sm-3'][1]/ul/li[3]/a")
    private WebElement footerInfoPrivacyPolicyLink;
    @FindBy(xpath = "//footer//div[@class='col-sm-3'][1]/ul/li[4]/a")
    private WebElement footerInfoTermsAndConditionsLink;
    @FindBy(xpath = "//footer//div[@class='col-sm-3'][2]/h5")
    private WebElement footerCustomerServiceSectionTitle;
    @FindBy(xpath = "//footer//div[@class='col-sm-3'][2]/ul/li[1]/a")
    private WebElement footerCustServiceContactUsLink;
    @FindBy(xpath = "//footer//div[@class='col-sm-3'][2]/ul/li[2]/a")
    private WebElement footerCustServiceReturnsLink;
    @FindBy(xpath = "//footer//div[@class='col-sm-3'][2]/ul/li[3]/a")
    private WebElement footerCustServiceSiteMapLink;
    @FindBy(xpath = "//footer//div[@class='col-sm-3'][3]/h5")
    private WebElement footerExtrasSectionTitle;
    @FindBy(xpath = "//footer//div[@class='col-sm-3'][3]/ul/li[1]/a")
    private WebElement footerExtrasBrandsLink;
    @FindBy(xpath = "//footer//div[@class='col-sm-3'][3]/ul/li[2]/a")
    private WebElement footerExtrasGiftCertificatesLink;
    @FindBy(xpath = "//footer//div[@class='col-sm-3'][3]/ul/li[3]/a")
    private WebElement footerExtrasAffiliatesLink;
    @FindBy(xpath = "//footer//div[@class='col-sm-3'][3]/ul/li[4]/a")
    private WebElement footerExtrasSpecialsLink;
    @FindBy(xpath = "//footer//div[@class='col-sm-3'][4]/h5")
    private WebElement footerMyAccountSectionTitle;
    @FindBy(xpath = "//footer//div[@class='col-sm-3'][4]/ul/li[1]/a")
    private WebElement footerMyAccountLink;
    @FindBy(xpath = "//footer//div[@class='col-sm-3'][4]/ul/li[2]/a")
    private WebElement footerMyAccountOrderHistoryLink;
    @FindBy(xpath = "//footer//div[@class='col-sm-3'][4]/ul/li[3]/a")
    private WebElement footerMyAccountWishListLink;
    @FindBy(xpath = "//footer//div[@class='col-sm-3'][4]/ul/li[4]/a")
    private WebElement footerMyAccountNewsletterLink;
    @FindBy(xpath = "//footer//p")
    private WebElement footerCopyrightText;
    @FindBy(xpath = "//footer//p/a")
    private WebElement footerOpenCartLink;

    public GeneralPage(WebDriver driver) {super(driver);}

    //click 'Account' dropdown menu link method
    public void clickAccountDropdownMenuLink(){
        Actions actions = new Actions(driver);
        actions.moveToElement(accountDropdownMenu).click().perform();
    }

    //click 'Register' option link method
    public void clickRegisterOptionLink(){registerLinkOption.click();}
    //click 'Login' option link method
    public void clickLoginOptionLink(){loginLinkOption.click();}

    //click homepage logo link method
    public void clickHomePageLogoLink(){
        Actions action = new Actions(driver);
        action.moveToElement(homePageLogoLink).click().perform();
    }

    //click wishlist header icon nav link method
    public void clickWishlistIconLinkButton(){
        Actions action = new Actions(driver);
        action.moveToElement(wishlistIconLink).click().perform();
    }

    //element wait load method (so that Selenium would stop skipping test methods during run)
    public void waitForElementsToLoad() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(2500));
        //wait for the document to be fully loaded
        wait.until(webDriver -> Objects.equals(((JavascriptExecutor) webDriver)
                .executeScript("return document.readyState"), "complete"));

        //assert at least one visible element is present
        wait.until(ExpectedConditions.presenceOfElementLocated(By.tagName("body")));
    }

    //general page footer text element getters
    public String getFooterInformationSectionTitle() {return footerInformationSectionTitle.getText();}
    public String getFooterCustomerServiceSectionTitle() {return footerCustomerServiceSectionTitle.getText();}
    public String getFooterExtrasSectionTitle() {return footerExtrasSectionTitle.getText();}
    public String getFooterMyAccountSectionTitle() {return footerMyAccountSectionTitle.getText();}
    public String getFooterCopyrightText() {return footerCopyrightText.getText();}

    //general page web element assert methods
    //top navbar
    public boolean isCurrencyDropdownMenuDisplayed() {return currencyDropdownMenu.isDisplayed();}
    public boolean isPhoneContactIconLinkDisplayed() {return phoneContactIconLink.isDisplayed();}
    public boolean isAccountDropdownMenuDisplayed() {return accountDropdownMenu.isDisplayed();}
    public boolean isWishlistIconLinkDisplayed() {return wishlistIconLink.isDisplayed();}
    public boolean isShoppingCartIconLinkDisplayed() {return shoppingCartIconLink.isDisplayed();}
    public boolean isCheckoutIconLinkDisplayed() {return checkoutIconLink.isDisplayed();}
    //header
    public boolean isSearchBarInputFieldDisplayed() {return searchBarInputField.isDisplayed();}
    public boolean isSearchButtonDisplayed() {return searchButton.isDisplayed();}
    public boolean isShoppingCartButtonDisplayed() {return shoppingCartButton.isDisplayed();}
    public boolean isHomePageLogoLinkDisplayed() {return homePageLogoLink.isDisplayed();}
    //header navbar
    public boolean isDesktopsNavLinkDisplayed() {return desktopsNavLink.isDisplayed();}
    public boolean isLaptopsNavLinkDisplayed() {return laptopsNavLink.isDisplayed();}
    public boolean isComponentsNavLinkDisplayed() {return componentsNavLink.isDisplayed();}
    public boolean isTabletsNavLinkDisplayed() {return tabletsNavLink.isDisplayed();}
    public boolean isSoftwareNavLinkDisplayed() {return softwareNavLink.isDisplayed();}
    public boolean isPhonesNavLinkDisplayed() {return phonesNavLink.isDisplayed();}
    public boolean isCamerasNavLinkDisplayed() {return camerasNavLink.isDisplayed();}
    public boolean isMP3PlayersNavLinkDisplayed() {return mp3PlayersNavLink.isDisplayed();}
    //footer
    public boolean isFooterInformationSectionTitleDisplayed() {return footerInformationSectionTitle.isDisplayed();}
    public boolean isFooterInfoAboutUsLinkDisplayed() {return footerInfoAboutUsLink.isDisplayed();}
    public boolean isFooterInfoDeliveryInfoLinkDisplayed() {return footerInfoDeliveryInfoLink.isDisplayed();}
    public boolean isFooterInfoPrivacyPolicyLinkDisplayed() {return footerInfoPrivacyPolicyLink.isDisplayed();}
    public boolean isFooterInfoTermsAndConditionsLinkDisplayed() {return footerInfoTermsAndConditionsLink.isDisplayed();}
    public boolean isFooterCustomerServiceSectionTitleDisplayed() {return footerCustomerServiceSectionTitle.isDisplayed();}
    public boolean isFooterCustServiceContactUsLinkDisplayed() {return footerCustServiceContactUsLink.isDisplayed();}
    public boolean isFooterCustServiceReturnsLinkDisplayed() {return footerCustServiceReturnsLink.isDisplayed();}
    public boolean isFooterCustServiceSiteMapLinkDisplayed() {return footerCustServiceSiteMapLink.isDisplayed();}
    public boolean isFooterExtrasSectionTitleDisplayed() {return footerExtrasSectionTitle.isDisplayed();}
    public boolean isFooterExtrasBrandsLinkDisplayed() {return footerExtrasBrandsLink.isDisplayed();}
    public boolean isFooterExtrasGiftCertificatesLinkDisplayed() {return footerExtrasGiftCertificatesLink.isDisplayed();}
    public boolean isFooterExtrasAffiliatesLinkDisplayed() {return footerExtrasAffiliatesLink.isDisplayed();}
    public boolean isFooterExtrasSpecialsLinkDisplayed() {return footerExtrasSpecialsLink.isDisplayed();}
    public boolean isFooterMyAccountSectionTitleDisplayed() {return footerMyAccountSectionTitle.isDisplayed();}
    public boolean isFooterMyAccountLinkDisplayed() {return footerMyAccountLink.isDisplayed();}
    public boolean isFooterMyAccountOrderHistoryLinkDisplayed() {return footerMyAccountOrderHistoryLink.isDisplayed();}
    public boolean isFooterMyAccountWishListLinkDisplayed() {return footerMyAccountWishListLink.isDisplayed();}
    public boolean isFooterMyAccountNewsletterLinkDisplayed() {return footerMyAccountNewsletterLink.isDisplayed();}
    public boolean isFooterCopyrightTextDisplayed(){return footerCopyrightText.isDisplayed();}
    public boolean isFooterOpenCartLinkDisplayed() {return footerOpenCartLink.isDisplayed();}

    //shopping cart dropdown menu web elements assert methods
    //list elements
    public boolean isShoppingCartDropdownProductImageDisplayed(){
        return shoppingCartDropdownProductImageElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isShoppingCartDropdownProductNameDisplayed(){
        return shoppingCartDropdownProductNameElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isShoppingCartDropdownProductDescDisplayed(){
        return shoppingCartDropdownProductDescElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isShoppingCartDropdownProductQtyDisplayed(){
        return shoppingCartDropdownProductQtyElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isShoppingCartDropdownProductUnitPriceDisplayed(){
        return shoppingCartDropdownProductUnitPriceElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isShoppingCartDropdownProductRemoveButtonDisplayed(){
        return shoppingCartDropdownProductRemoveButtonElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    //singular elements
    public boolean isShoppingCartDropdownSubTotalPriceDisplayed(){return shoppingCartSubTotalPrice.isDisplayed();}
    public boolean isShoppingCartDropdownTotalPriceDisplayed(){return shoppingCartTotalPrice.isDisplayed();}
    public boolean isShoppingCartDropdownViewCartLinkDisplayed(){return shoppingCartViewCartLink.isDisplayed();}
    public boolean isShoppingCartDropdownShoppingCartLinkDisplayed(){return shoppingCartShoppingCartLink.isDisplayed();}


}
