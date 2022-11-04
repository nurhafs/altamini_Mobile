package com.example.steps;

import com.example.app.pages.ProductPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class ProductStepDefinitions {
    @Steps
    ProductPage productPage;

    @Given("I am in main page")
    public void iHaveOpenedTheMainPage() {
        productPage.displayed();
    }

    @When("I click buy on one of the products")
    public void iClickBuyOnOneOfTheProducts() {
        productPage.clickBuy();
    }

    @Then("My cart is filled")
    public void myCartIsFilled() {
        productPage.checkCartQty(1);
    }
}
