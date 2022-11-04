package com.example.steps;

import com.example.app.pages.LoginPage;
import com.example.app.pages.ProductPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class LogoutStepDefinitions {
    @Steps
    LoginPage loginPage;

    @Given("I am logged in to the website")
    public void iAmLoggedInToTheWebsite() {
        loginPage.clickLogIcon();
        loginPage.fillEmail("thaur@mail.com");
        loginPage.fillPassword("thaurn");
        loginPage.clickLoginBtn();
        loginPage.mainPageDisplayed();
    }

    @When("I click logout button")
    public void iClickLogoutButton() {
        loginPage.clickLogIcon();
    }

    @Then("I am logged out")
    public void iAmLoggedOut() {
        loginPage.mainPageDisplayed();
    }
}
