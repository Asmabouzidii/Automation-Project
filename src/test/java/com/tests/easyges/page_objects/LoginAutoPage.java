package com.tests.easyges.page_objects;

import com.tests.easyges.base.BasePage;
import com.tests.easyges.hooks.Setup;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginAutoPage extends BasePage {

    /* Retrieve Web Element */
    @FindBy(how = How.XPATH, using = "//a[normalize-space()='Signup / Login']")
    private static WebElement btnSignup;
    @FindBy(how = How.XPATH, using = "//input[@data-qa='login-email']")
    private static WebElement emailField;
    @FindBy(how = How.XPATH, using = "//input[@placeholder='Password']")
    private static WebElement passwordField;
    @FindBy(how = How.XPATH, using = "//button[normalize-space()='Login']")
    private static WebElement btnLogin;
    @FindBy(how = How.XPATH, using = "//li[10]")
    private static WebElement verifPageAuto;

    public LoginAutoPage() {
        super(Setup.getDriver());
    }

    /* Create methods */
    public static WebElement getBtnSignup() {
        waitForElementToBeClickable(btnSignup);
        return btnSignup;
    }

    public static WebElement getEmail() {
        waitForElementToBeVisible(emailField);
        return emailField;
    }
    public static WebElement getPassword() {
        waitForElementToBeVisible(passwordField);
        return passwordField;
    }
    public static WebElement getBtnLoginAuto() {
        waitForElementToBeClickable(btnLogin);
        return btnLogin;
    }

    public static String getVerifPage() {
        waitForElementToBeVisible(verifPageAuto);
        String txt =verifPageAuto.getText();
        return txt;
    }


}
