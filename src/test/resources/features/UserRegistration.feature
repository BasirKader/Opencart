Feature: New user registration

  Background:
    #Given user is navigated to OpenCart website

  @test
  Scenario: User navigation to registration page

    When user clicks on My Account
    And user clicks on Register
    And user enters "hello" "hello" "hello@gmail.com" "hello" "hello" and "hello"
    And user selects on subscribe button
    And user clicks on checkbox
    Then user clicks on continue tab