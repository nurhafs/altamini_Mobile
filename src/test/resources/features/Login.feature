Feature: Login
  As a User
  I want to login
  So I can use the website

  Scenario: Open Login Page
    Given I am in main page
    When I open login page
    Then login page id displayed

  Scenario Outline: Login with username and password
    Given I am in login page
    When I input "<email>" email
    And I input "<password>" password
    And I click login button
    Then I get "<result>"

    Examples:
      | email | password | result |
      |  thaur@mail.com | thaurn | logged in |
      |  thaur@mail.com | pinto | invalid error |
      |  user@mail.com  |       | password error   |
      |                 | nxxxae | email error |
      | naevis@mail.com | pass | invalid error |
      |                 |      | all error |