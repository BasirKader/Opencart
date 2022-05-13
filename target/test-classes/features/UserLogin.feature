Feature: User Login
  Background:
    #Given user is navigated to OpenCart website
    @login
  Scenario: //Login to the OpenCart
    User login with valid credential
    When User clicks on My Account
    And User on clicks to Login
    And User enters valid credentials
    And User clicks on login button
    Then User successfully logged in