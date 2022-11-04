package com.example.steps;

import com.example.app.pages.RegisterPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

import java.util.Random;

public class RegisterStepDefinitions {
    @Steps
    RegisterPage registerPage;

    @When("I open register page")
    public void iOpenRegisterPage() {
        registerPage.clickLoginIcon();
        registerPage.clickRegisterLink();
    }

    @Then("register page is displayed")
    public void registerPageIsDisplayed() {
        registerPage.displayed();
    }

    @When("I input full name")
    public void iInputFullName() {
        registerPage.fillFullname("Fuller Neam");
    }

    @And("I input new email")
    public void iInputNewEmail() {
        Random rand = new Random();
        registerPage.fillEmail("fuller" + rand.nextInt() + "@mail.com");
    }

    @And("I input password")
    public void iInputPassword() {
        registerPage.fillPassword("password");
    }

    @And("I click register")
    public void iClickRegister() {
        registerPage.clickRegisterBtn();
    }

    @Then("I am redirected to main page")
    public void iAmRedirectedToMainPage() {
        registerPage.mainPagedisplayed();
    }

    @When("I insert {string} as full name")
    public void iInsertAsFullName(String arg0) {
        registerPage.fillFullname(arg0);
    }

    @And("I insert {string} as email")
    public void iInsertAsEmail(String arg0) {
        registerPage.fillEmail(arg0);
    }

    @And("I insert {string} as password")
    public void iInsertAsPassword(String arg0) {
        registerPage.fillPassword(arg0);
    }

    @Then("I get {string} error")
    public void iGetError(String arg0) {
        if (arg0.equals("fullname")) {
            registerPage.fullnameEmptyError();
        } else if (arg0.equals("email")) {
            registerPage.emailEmptyError();
        } else if (arg0.equals("password")) {
            registerPage.passwordEmptyError();
        } else if (arg0.equals("failed")) {
            registerPage.failedError();
        } else {//empty form
            registerPage.fullnameEmptyError();
            registerPage.emailEmptyError();
            registerPage.passwordEmptyError();
        }
    }

}
