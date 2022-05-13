Feature:
  Background:
    #Given user is navigated to OpenCart website
    #When User successfully logged in
    #And  User clicks on Your Store
    #Then User searches for MacBook
    #And  User clicks on search button
    #And  User selects MacBook Air
    #And User clicks on Add to cart button
    #Then User successfully added items to Cart
  @buy
  Scenario: User purchases item
    When User clicks on View cart
    And User changes quantity to two
    And User clicks on the Checkout button
    Then User get Not In Stock message

