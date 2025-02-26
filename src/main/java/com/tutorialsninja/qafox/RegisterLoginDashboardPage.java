package com.tutorialsninja.qafox;

import com.tutorialsninja.qafox.utilities.*;
import com.tutorialsninja.qafox.*;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.*;

public class RegisterLoginDashboardPage extends BasePage{

    //register/login dashboard page web elements
    //register section
    @FindBy(xpath = "//div[1]/div[@class='well']/h2")
    private WebElement newCustomerSectionTitle;
    @FindBy(xpath = "//div[1]/div[@class='well']/p[1]")
    private WebElement newCustomerSectionSubtitle;
    @FindBy(xpath = "//div[1]/div[@class='well']/p[2]")
    private WebElement newCustomerSectionDescription;
    @FindBy(xpath = "//div[1]/div[@class='well']/a")
    private WebElement newCustomerContinueButton;
    //login section
    @FindBy(xpath = "//div[2]/div[@class='well']/h2")
    private WebElement returningCustomerSectionTitle;
    @FindBy(xpath = "//div[2]/div[@class='well']/p")
    private WebElement returningCustomerSectionSubtitle;
    @FindBy(xpath = "//div[2]/div[@class='well']//label[@for='input-email']")
    private WebElement loginEmailSubtitle;
    @FindBy(xpath = "//div[2]/div[@class='well']//input[@id='input-email']")
    private WebElement loginEmailInputField;
    @FindBy(xpath = "//div[2]/div[@class='well']//label[@for='input-password']")
    private WebElement loginPasswordSubtitle;
    @FindBy(xpath = "//div[2]/div[@class='well']//input[@id='input-password']")
    private WebElement loginPasswordInputField;
    @FindBy(xpath = "//div[2]/div[@class='well']//a")
    private WebElement loginForgottenPasswordLink;
    @FindBy(xpath = "//div[2]/div[@class='well']//input[@type='submit']")
    private WebElement loginButton;
    //singular input error element
    @FindBy(xpath = "//div[@class='alert alert-danger alert-dismissible']")
    private WebElement loginSingularInputError;


    //valid user login input data
    private String loginUserEmail;
    private String loginUserPassword;

    //no singular input data
    private String noLoginEmail;
    private String noLoginPassword;

    public RegisterLoginDashboardPage(WebDriver driver) {super(driver);}

    //valid user login data getter
    public void validUserLoginDataGetter(RegisterPage registerPage) {

        loginUserEmail = registerPage.getUserEmail();
        loginUserPassword = registerPage.getUserPassword();

        System.out.println("Valid user login data: " + "\n");
        logger.info("Valid user login email: " + loginUserEmail);
        logger.info("Valid user password: " + loginUserPassword);
        System.out.println("\n");

    }

    //valid user login input data methods
    public void inputValidUserLoginEmailIntoEmailInputField() {loginEmailInputField.sendKeys(loginUserEmail);}
    public void inputValidUserLoginPasswordIntoPasswordInputField() {loginPasswordInputField.sendKeys(loginUserPassword);}

    //no singular input data getters

    //invalid user login data getter - no login email
    public void invalidUserLoginNoEmailGetter(RegisterPage registerPage) {

        noLoginEmail = "";
        loginUserPassword = registerPage.getUserPassword();

        System.out.println("Invalid user login data (no login email): " + "\n");
        logger.info("No user login email: " + noLoginEmail);
        logger.info("Valid user password (no login email): " + loginUserPassword);
        System.out.println("\n");

    }

    public void invalidUserLoginNoPasswordGetter(RegisterPage registerPage) {

        loginUserEmail = registerPage.getUserEmail();
        noLoginPassword = "";

        System.out.println("Invalid user login data (no login password): " + "\n");
        logger.info("Valid user login email (no login password): " + loginUserEmail);
        logger.info("No user password: " + noLoginPassword);
        System.out.println("\n");

    }

    //invalid user login input data methods - no singular input
    public void inputNoLoginEmailIntoEmailInputField() {loginEmailInputField.sendKeys(noLoginEmail);}
    public void inputNoLoginPasswordIntoPasswordInputField() {loginPasswordInputField.sendKeys(noLoginPassword);}

    //click 'Login' button
    public void clickLoginButton() {
        Actions actions = new Actions(driver);
        actions.click(loginButton).click().perform();
    }

    //singular input error message getter
    public String getLoginSingularInputError() {return loginSingularInputError.getText();}

    //register/login dashboard page text element getters
    public String getNewCustomerSectionTitle() {return newCustomerSectionTitle.getText();}
    public String getNewCustomerSectionSubtitle() {return newCustomerSectionSubtitle.getText();}
    public String getNewCustomerSectionDescription() {return newCustomerSectionDescription.getText();}
    public String getReturningCustomerSectionTitle() {return returningCustomerSectionTitle.getText();}
    public String getReturningCustomerSectionSubtitle() {return returningCustomerSectionSubtitle.getText();}
    public String getLoginEmailSubtitle() {return loginEmailSubtitle.getText();}
    public String getLoginPasswordSubtitle() {return loginPasswordSubtitle.getText();}

    //register/login dashboard page web elements assert methods
    //new customer section
    public boolean isNewCustomerSectionTitleDisplayed() {return newCustomerSectionTitle.isDisplayed();}
    public boolean isNewCustomerSectionSubtitleDisplayed() {return newCustomerSectionSubtitle.isDisplayed();}
    public boolean isNewCustomerSectionDescriptionDisplayed() {return newCustomerSectionDescription.isDisplayed();}
    public boolean isNewCustomerContinueButtonDisplayed() {return newCustomerContinueButton.isDisplayed();}
    //login section
    public boolean isReturningCustomerSectionTitleDisplayed() {return returningCustomerSectionTitle.isDisplayed();}
    public boolean isReturningCustomerSectionSubtitleDisplayed() {return returningCustomerSectionSubtitle.isDisplayed();}
    public boolean isLoginEmailSubtitleDisplayed() {return loginEmailSubtitle.isDisplayed();}
    public boolean isLoginEmailInputFieldDisplayed() {return loginEmailInputField.isDisplayed();}
    public boolean isLoginPasswordSubtitleDisplayed() {return loginPasswordSubtitle.isDisplayed();}
    public boolean isLoginPasswordInputFieldDisplayed() {return loginPasswordInputField.isDisplayed();}
    public boolean isLoginForgottenPasswordLinkDisplayed() {return loginForgottenPasswordLink.isDisplayed();}
    public boolean isLoginButtonDisplayed() {return loginButton.isDisplayed();}

}
