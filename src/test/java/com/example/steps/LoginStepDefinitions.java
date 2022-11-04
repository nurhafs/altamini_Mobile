package com.example.steps;

import com.example.app.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class LoginStepDefinitions {
    @Steps
    LoginPage loginPage;

    @When("I open login page")
    public void iOpenLoginPage() {
        loginPage.clickLogIcon();
    }

    @Then("login page id displayed")
    public void loginPageIdDisplayed() {
        loginPage.displayed();
    }

    @Given("I am in login page")
    public void iAmInLoginPage() {
        loginPage.clickLogIcon();
    }

    @When("I input {string} email")
    public void iInputEmail(String arg0) {
        loginPage.fillEmail(arg0);
    }

    @And("I input {string} password")
    public void iInputPassword(String arg0) {
        loginPage.fillPassword(arg0);
    }

    @And("I click login button")
    public void iClickLoginButton() {
        loginPage.clickLoginBtn();
    }

    @Then("I get {string}")
    public void iGet(String arg0) {
        if (arg0.equals("logged in")) {
            loginPage.mainPageDisplayed();
        } else if (arg0.equals("invalid error")){
            loginPage.invalidError();
        } else if (arg0.equals("password error")) {
            loginPage.passwordEmptyError();
        } else if (arg0.equals("email error")) {
            loginPage.emailEmptyError();
        } else { //all empty error
            loginPage.emailEmptyError();
            loginPage.passwordEmptyError();
        }
    }
}
