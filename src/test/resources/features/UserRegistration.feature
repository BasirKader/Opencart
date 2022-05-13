Feature: New user registration

  Background:
    #Given user is navigated to OpenCart website

  @test
  Scenario: User navigation to registration page

    When User clicks on My Account
    And User clicks on Register
    And User enters "hello" "hello" "hello@gmail.com" "hello" "hello" and "hello"
    And User selects on subscribe button
    And User clicks on checkbox
    Then User clicks on continue tab
    And User has Successfully Registered
