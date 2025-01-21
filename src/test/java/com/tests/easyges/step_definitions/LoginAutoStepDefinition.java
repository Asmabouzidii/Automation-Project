package com.tests.easyges.step_definitions;

import com.tests.easyges.actions.SeleniumUtils;
import com.tests.easyges.page_objects.LoginAutoPage;
import com.tests.easyges.utils.ConfigFileReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginAutoStepDefinition {

    private final SeleniumUtils seleniumUtils;
    private final ConfigFileReader configFileReader;

    public LoginAutoStepDefinition() {
    LoginAutoPage loginPageAuto = new LoginAutoPage();
    seleniumUtils = new SeleniumUtils();
    configFileReader = new ConfigFileReader();

    }

    @Given("I log in to the Automation Exercise application")
    public void iLogInToTheAutomationExerciseApplication() throws InterruptedException {
        seleniumUtils.get(configFileReader.getProperty("home.a"));
        Thread.sleep(5000);
    }
    @When("I click on the Signup\\/Login button")
    public void iClickCnTheSignupLoginButton() {
        seleniumUtils.click(LoginAutoPage.getBtnSignup());
    }
    @When("I enter the email address {string}")
    public void iEnterTheEmailAddress(String email) {
        seleniumUtils.writeText(LoginAutoPage.getEmail(), email);
    }
    @When("I enter the password {string}")
    public void iEnterThePassword(String psswd) {
        seleniumUtils.writeText(LoginAutoPage.getPassword(), psswd);
    }
    @When("I click on the Login button")
    public void iClickOnTheLoginButton() {
        seleniumUtils.click(LoginAutoPage.getBtnLoginAuto());
    }
    @Then("I am redirected to the home page and {string} is displayed")
    public void iAmRedirectedToTheHomePageAndIsDisplayed(String string) {
        Assert.assertTrue(LoginAutoPage.getVerifPage().contains(string));
    }

}

