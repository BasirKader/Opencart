Feature: User Add Items to Checkout
  Background: #Given user is navigated to OpenCart website
  @add
  Scenario: User Add Items to the Cart

    When User successfully logged in
    And  User clicks on Your Store
    Then User searches for MacBook
    And  User clicks on search button
    And  User selects MacBook Air
    And User clicks on Add to cart button
    Then User successfully added items to Cart










