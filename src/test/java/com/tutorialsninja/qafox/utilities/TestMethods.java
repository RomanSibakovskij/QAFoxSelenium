package com.tutorialsninja.qafox.utilities;

import com.tutorialsninja.qafox.*;
import org.slf4j.*;
import static org.junit.jupiter.api.Assertions.*;
import org.openqa.selenium.*;
import java.io.File;
import java.nio.file.*;

public class TestMethods extends BaseTest{

    protected static final Logger logger = LoggerFactory.getLogger(TestMethods.class);

    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //general page web elements assert test method (elements all pages possess)
    protected void isGeneralPageWebElementDisplayed(GeneralPage generalPage){
        //top navbar
        //assert currency dropdown menu is displayed
        assertTrue(generalPage.isCurrencyDropdownMenuDisplayed(), "The currency dropdown menu isn't displayed");
        //assert phone contact icon link is displayed
        assertTrue(generalPage.isPhoneContactIconLinkDisplayed(), "The phone contact icon link isn't displayed");
        //assert account dropdown menu is displayed
        assertTrue(generalPage.isAccountDropdownMenuDisplayed(), "The account dropdown menu isn't displayed");
        //assert wishlist icon link is displayed
        assertTrue(generalPage.isWishlistIconLinkDisplayed(), "The wishlist icon link isn't displayed");
        //assert shopping cart icon link is displayed
        assertTrue(generalPage.isShoppingCartIconLinkDisplayed(), "The shopping cart icon link isn't displayed");
        //assert checkout icon link is displayed
        assertTrue(generalPage.isCheckoutIconLinkDisplayed(), "The checkout icon link isn't displayed");
        //header
        //assert search bar input field is displayed
        assertTrue(generalPage.isSearchBarInputFieldDisplayed(), "The search bar input field isn't displayed");
        //assert search button is displayed
        assertTrue(generalPage.isSearchButtonDisplayed(), "The search button isn't displayed");
        //assert shopping cart button is displayed
        assertTrue(generalPage.isShoppingCartButtonDisplayed(), "The shopping cart button isn't displayed");
        //assert home page logo link is displayed
        assertTrue(generalPage.isHomePageLogoLinkDisplayed(), "The home page logo link isn't displayed");
        //header navbar
        //assert desktops nav link is displayed
        assertTrue(generalPage.isDesktopsNavLinkDisplayed(), "The desktops nav link isn't displayed");
        //assert laptops and notebooks nav link is displayed
        assertTrue(generalPage.isLaptopsNavLinkDisplayed(), "The laptops and notebooks nav link isn't displayed");
        //assert components nav link is displayed
        assertTrue(generalPage.isComponentsNavLinkDisplayed(), "The components nav link isn't displayed");
        //assert tablets nav link is displayed
        assertTrue(generalPage.isTabletsNavLinkDisplayed(), "The tablets nav link isn't displayed");
        //assert software nav link is displayed
        assertTrue(generalPage.isSoftwareNavLinkDisplayed(), "The software nav link isn't displayed");
        //assert phones nav link is displayed
        assertTrue(generalPage.isPhonesNavLinkDisplayed(), "The phones nav link isn't displayed");
        //assert cameras nav link is displayed
        assertTrue(generalPage.isCamerasNavLinkDisplayed(), "The cameras nav link isn't displayed");
        //assert mp3 players nav link is displayed
        assertTrue(generalPage.isMP3PlayersNavLinkDisplayed(), "The mp3 players nav link isn't displayed");
        //footer
        //assert footer information section title is displayed
        assertTrue(generalPage.isFooterInformationSectionTitleDisplayed(), "The footer information section title isn't displayed");
        //assert footer information 'About us' link is displayed
        assertTrue(generalPage.isFooterInfoAboutUsLinkDisplayed(), "The footer information section 'About us' link isn't displayed");
        //assert footer information 'Delivery information' link is displayed
        assertTrue(generalPage.isFooterInfoDeliveryInfoLinkDisplayed(), "The footer information section 'Delivery information' link isn't displayed");
        //assert footer information 'Privacy Policy' link is displayed
        assertTrue(generalPage.isFooterInfoPrivacyPolicyLinkDisplayed(), "The footer information section 'Privacy Policy' link isn't displayed");
        //assert footer information 'Terms and Conditions' link is displayed
        assertTrue(generalPage.isFooterInfoTermsAndConditionsLinkDisplayed(), "The footer information section 'Terms and Conditions' link isn't displayed");
        //assert footer customer service section title is displayed
        assertTrue(generalPage.isFooterCustomerServiceSectionTitleDisplayed(), "The footer customer service section title isn't displayed");
        //assert footer customer service 'Contact us' link is displayed
        assertTrue(generalPage.isFooterCustServiceContactUsLinkDisplayed(), "The footer customer service section 'Contact us' link isn't displayed");
        //assert footer customer service 'Returns' link is displayed
        assertTrue(generalPage.isFooterCustServiceReturnsLinkDisplayed(), "The footer customer service section 'Returns' link isn't displayed");
        //assert footer customer service 'Site Map' link is displayed
        assertTrue(generalPage.isFooterCustServiceSiteMapLinkDisplayed(), "The footer customer service section 'Site Map' link isn't displayed");
        //assert footer extras section title is displayed
        assertTrue(generalPage.isFooterExtrasSectionTitleDisplayed(), "The footer extras section title isn't displayed");
        //assert footer extras 'Brands' link is displayed
        assertTrue(generalPage.isFooterExtrasBrandsLinkDisplayed(), "The footer extras section 'Brands' link isn't displayed");
        //assert footer extras 'Gift Certificates' link is displayed
        assertTrue(generalPage.isFooterExtrasGiftCertificatesLinkDisplayed(), "The footer extras section 'Gift Certificates' link isn't displayed");
        //assert footer extras 'Affiliates' link is displayed
        assertTrue(generalPage.isFooterExtrasAffiliatesLinkDisplayed(), "The footer extras section 'Affiliates' link isn't displayed");
        //assert footer extras 'Specials' link is displayed
        assertTrue(generalPage.isFooterExtrasSpecialsLinkDisplayed(), "The footer extras section 'Specials' link isn't displayed");
        //assert footer my account section title is displayed
        assertTrue(generalPage.isFooterMyAccountSectionTitleDisplayed(), "The footer my account section title isn't displayed");
        //assert footer my account link is displayed
        assertTrue(generalPage.isFooterMyAccountLinkDisplayed(), "The footer 'My account' link isn't displayed");
        //assert footer my account order history link is displayed
        assertTrue(generalPage.isFooterMyAccountOrderHistoryLinkDisplayed(), "The footer my account section 'Order history' link isn't displayed");
        //assert footer my account wishlist link is displayed
        assertTrue(generalPage.isFooterMyAccountWishListLinkDisplayed(), "The footer my account section 'Wishlist' link isn't displayed");
        //assert footer my account newsletter link is displayed
        assertTrue(generalPage.isFooterMyAccountNewsletterLinkDisplayed(), "The footer my account section 'Newsletter' link isn't displayed");
        //assert footer copyright text is displayed
        assertTrue(generalPage.isFooterCopyrightTextDisplayed(), "The footer copyright text isn't displayed");
        //assert footer opencart link is displayed
        assertTrue(generalPage.isFooterOpenCartLinkDisplayed(), "The footer Opencart link isn't displayed");
    }

    //home page web element assert test method
    protected void isHomePageWebElementDisplayed(HomePage homePage) {
        //main
        //assert home page product image carousel is displayed
        assertTrue(homePage.isHomePageProductImgCarouselDisplayed(), "The home page product image carousel isn't displayed");
        //assert home page product image carousel dot left button is displayed
        assertTrue(homePage.isHomePageProductImgCarouselDotLeftButtonDisplayed(), "The home page product image carousel dot left button isn't displayed");
        //assert home page product image carousel dot right button is displayed
        assertTrue(homePage.isHomePageProductImgCarouselDotRightButtonDisplayed(), "The home page product image carousel dot right button isn't displayed");
        //assert home page featured product section title is displayed
        assertTrue(homePage.isHomePageFeaturedProductSectionTitleDisplayed(), "The home page featured product section title isn't displayed");
        //assert home page featured product image links are displayed (as a list)
        assertTrue(homePage.isHomePageFeaturedProductImgLinkDisplayed(), "The home page featured product image links aren't displayed");
        //assert home page featured product name links are displayed (as a list)
        assertTrue(homePage.isHomePageFeaturedProductNameLinkDisplayed(), "The home page featured product name links aren't displayed");
        //assert home page featured product descriptions are displayed (as a list)
        assertTrue(homePage.isHomePageFeaturedProductDescDisplayed(), "The home page featured product descriptions aren't displayed");
        //assert home page featured product unit price are displayed (as a list)
        assertTrue(homePage.isHomePageFeaturedProductUnitPriceDisplayed(), "The home page featured product unit prices aren't displayed");
        //assert home page featured product 'Add to cart' buttons are displayed (as a list)
        assertTrue(homePage.isHomePageFeaturedProductAddToCartButtonDisplayed(), "The home page featured product 'Add to cart' buttons aren't displayed");
        //assert home page featured product 'Add to wishlist' buttons are displayed (as a list)
        assertTrue(homePage.isHomePageFeaturedProductAddToWishlistButtonDisplayed(), "The home page featured product 'Add to wishlist' buttons aren't displayed");
        //assert home page featured product 'Add to compare' buttons are displayed (as a list)
        assertTrue(homePage.isHomePageFeaturedProductAddToCompareButtonDisplayed(), "The home page featured product 'Add to compare' buttons aren't displayed");
        //assert home page brands image carousel is displayed
        assertTrue(homePage.isHomePageBrandsImageCarouselDisplayed(), "The home page brands image carousel isn't displayed");
        //assert home page brands image carousel dot buttons are displayed (as a list)
        assertTrue(homePage.isHomePageBrandsImageCarouselDotButtonDisplayed(), "The home page brands image carousel dot buttons aren't displayed");
    }

    //register/login dashboard page web element assert test method
    protected void isRegisterLoginDashboardPageWebElementDisplayed(RegisterLoginDashboardPage registerLoginDashboardPage) {
        //new customer section
        //assert register/login dashboard page new customer section title is displayed
        assertTrue(registerLoginDashboardPage.isNewCustomerSectionTitleDisplayed(), "The register/login dashboard page new customer section title isn't displayed");
        //assert register/login dashboard page new customer section subtitle is displayed
        assertTrue(registerLoginDashboardPage.isNewCustomerSectionSubtitleDisplayed(), "The register/login dashboard page new customer section subtitle isn't displayed");
        //assert register/login dashboard page new customer section description is displayed
        assertTrue(registerLoginDashboardPage.isNewCustomerSectionDescriptionDisplayed(), "The register/login dashboard page new customer section description isn't displayed");
        //assert register/login dashboard page new customer continue button is displayed
        assertTrue(registerLoginDashboardPage.isNewCustomerContinueButtonDisplayed(), "The register/login dashboard page new customer section continue button isn't displayed");
        //login section
        //assert register/login dashboard page returning customer section title is displayed
        assertTrue(registerLoginDashboardPage.isReturningCustomerSectionTitleDisplayed(), "The register/login dashboard page returning customer section title isn't displayed");
        //assert register/login dashboard page returning customer section subtitle is displayed
        assertTrue(registerLoginDashboardPage.isReturningCustomerSectionSubtitleDisplayed(), "The register/login dashboard page returning customer section subtitle isn't displayed");
        //assert register/login dashboard page login email subtitle is displayed
        assertTrue(registerLoginDashboardPage.isLoginEmailSubtitleDisplayed(), "The register/login dashboard page login email subtitle isn't displayed");
        //assert register/login dashboard page login email input field is displayed
        assertTrue(registerLoginDashboardPage.isLoginEmailInputFieldDisplayed(), "The register/login dashboard page login email input field isn't displayed");
        //assert register/login dashboard page login password subtitle is displayed
        assertTrue(registerLoginDashboardPage.isLoginPasswordSubtitleDisplayed(), "The register/login dashboard page login password subtitle isn't displayed");
        //assert register/login dashboard page login password input field is displayed
        assertTrue(registerLoginDashboardPage.isLoginPasswordInputFieldDisplayed(), "The register/login dashboard page login password input field isn't displayed");
        //assert register/login dashboard page login forgotten password link is displayed
        assertTrue(registerLoginDashboardPage.isLoginForgottenPasswordLinkDisplayed(), "The register/login dashboard page login forgotten password link isn't displayed");
        //assert register/login dashboard page login button is displayed
        assertTrue(registerLoginDashboardPage.isLoginButtonDisplayed(), "The register/login dashboard page login button isn't displayed");
    }

    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //general page text element assert test method (elements all pages share)
    protected void isGeneralPageTextElementAsExpected(GeneralPage generalPage){
        //footer
        //assert footer information section title is as expected
        assertEquals("Information", generalPage.getFooterInformationSectionTitle(), "The footer information section title doesn't match expectations.");
        //assert footer customer service section title is as expected
        assertEquals("Customer Service", generalPage.getFooterCustomerServiceSectionTitle(), "The footer customer service section title doesn't match expectations.");
        //assert footer extras section title is as expected
        assertEquals("Extras", generalPage.getFooterExtrasSectionTitle(), "The footer extras section title doesn't match expectations.");
        //assert footer my account section title is as expected
        assertEquals("My Account", generalPage.getFooterMyAccountSectionTitle(), "The footer my account section title doesn't match expectations.");
        //assert footer copyright text is as expected
        assertEquals("Powered By OpenCart\n" + "Qafox.com © 2025", generalPage.getFooterCopyrightText(), "The footer copyright text doesn't match expectations.");
    }

    //home page text element assert test method
    protected void isHomePageTextElementAsExpected(HomePage homePage){
        //assert home page featured product section title is as expected
        assertEquals("Featured", homePage.getHomePageFeaturedProductSectionTitle(), "The home page featured section title doesn't match expectations.");
    }

    //register/login dashboard page text element assert
    protected void isRegisterLoginDashboardPageTextElementAsExpected(RegisterLoginDashboardPage registerLoginDashboardPage){
        //assert register/login dashboard page 'New Customer' section title is as expected
        assertEquals("New Customer", registerLoginDashboardPage.getNewCustomerSectionTitle(), "The register/login dashboard page 'New Customer' section title doesn't match expectations.");
        //assert register/login dashboard page 'New Customer' section subtitle is as expected
        assertEquals("Register Account", registerLoginDashboardPage.getNewCustomerSectionSubtitle(), "The register/login dashboard page 'New Customer' section subtitle doesn't match expectations.");
        //assert register/login dashboard page 'New Customer' section description is as expected
        assertEquals("By creating an account you will be able to shop faster, be up to date on an order's status, and keep track of the orders you have previously made.", registerLoginDashboardPage.getNewCustomerSectionDescription(), "The register/login dashboard page 'New Customer' section description doesn't match expectations.");
        //assert register/login dashboard page 'Returning Customer' section title is as expected
        assertEquals("Returning Customer", registerLoginDashboardPage.getReturningCustomerSectionTitle(), "The register/login dashboard page 'Returning Customer' section title doesn't match expectations.");
        //assert register/login dashboard page 'Returning Customer' section subtitle is as expected
        assertEquals("I am a returning customer", registerLoginDashboardPage.getReturningCustomerSectionSubtitle(), "The register/login dashboard page 'Returning Customer' section subtitle doesn't match expectations.");
        //assert register/login dashboard page login email subtitle is as expected
        assertEquals("E-Mail Address", registerLoginDashboardPage.getLoginEmailSubtitle(), "The register/login dashboard page login email title doesn't match expectations.");
        //assert register/login dashboard page 'Returning Customer' login password subtitle is as expected
        assertEquals("Password", registerLoginDashboardPage.getLoginPasswordSubtitle(), "The register/login dashboard page login password subtitle doesn't match expectations.");
    }

    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //home page featured product data logger method
    protected void logHomePageFeaturedProductData(HomePage homePage){
        System.out.println("Home page featured product displayed data: " + "\n");
        logger.info("Home page featured product name(s): " + homePage.getFeaturedProductNames());
        logger.info("Home page featured product description(s): " + homePage.getFeaturedProductDescriptions());
        logger.info("Home page featured product unit price(s): " + homePage.getFeaturedProductUnitPrices() + "\n");
        System.out.println("\n");
    }

    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //test result screenshot method
    public void captureScreenshot(WebDriver driver, String fileName) {
        try {
            Thread.sleep(1500);//apply wait time for the right time to get the screenshot (WebDriverWait doesn't work here)
            File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            File destination = new File("E:\\IntelliAqua Selenium projects\\QAFoxSelenium\\src\\test\\resources\\" + " " +  fileName + ".png");
            Files.copy(screenshot.toPath(), destination.toPath(), StandardCopyOption.REPLACE_EXISTING);
            logger.info("Screenshot saved at: " + destination.getAbsolutePath());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }



}
