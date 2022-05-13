Feature: User Login
  Background:
    #Given user is navigated to OpenCart website
    @login
  Scenario: //Login to the OpenCart
    User login with valid credential
    When user clicks on My Account
    And user on clicks to Login
    And user enters valid credentials
    And user clicks on login button
    Then user successfully logged in