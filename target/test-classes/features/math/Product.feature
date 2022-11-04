@Product
Feature: Add Product to Cart
  As a user
  I want to add product to cart
  So I can buy the product

  Scenario: Add Product to Cart
    Given I am in main page
    When I click buy on one of the products
    Then My cart is filled