@Register
Feature: Register
  As a new user
  I want to register
  So that I can login

  Scenario: Open Register Page
    When I open register page
    Then register page is displayed

  Scenario: Register with new email
    Given I open register page
    When I input full name
    And I input new email
    And I input password
    And I click register
    Then I am redirected to main page

  Scenario Outline: Register with username and email
    Given I open register page
    When I insert "<fullname>" as full name
    And I insert "<email>" as email
    And I insert "<password>" as password
    And I click register
    Then I get "<error>" error

    Examples:
      | fullname | email | password | error |
      |        | simail@mail.com| mmail | fullname |
      | Sisimail |               | mmail |   email  |
      | Sisimail | simail@mail.com |      | password |
      | Thaur Noh | thaur@mail.com | thaurn | failed |
      |        |                |      | empty |