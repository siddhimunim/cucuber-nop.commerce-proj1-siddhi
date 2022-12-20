Feature: Computer Test

  As user I am on home page of nop commerce website and test ComputerPage
  Given I am on homepage

  @Sanity @Regression
  Scenario: verify Product Arrange In AlphaBatical Order

    When I click on "Computers" menu
    And  I click on desktop
    And  I select sort by position Name: Z to A
    Then I verify product display in Z to A order

  @Smoke @Regression
  Scenario: verify Product Added To Shopping Cart SuccessFully
    When I click on "Computers" menu
    And  I click on desktop
    And I select sort by position  Name: A to Z
    And I click on Add to cart of Build your own computer
    And  I verify the text Build your own computer
    And I select all mendotary field for computer
    And I verify Total price on page
    And I click on add to cart button
    And I verify text The product has been added to your shopping cart on Top green bar
    And click on cross button on top
    And  I click on Shopping cart
    And I verify the message shopping cart
    And I chaange qty to "2" and update shopping cart
    And I verify the total of updating cart
    And I checkbox I agree with the terms of service
    And I click on Checkout
    And I verify the text welcome ,please sign in
    And I click on checkout as guest
    And I fill the all mandatory field
    And I click on continue
    And I click on radio button Next Day Air
    And I click on continue button
    And I select radio button credit card
    And click on continue Field
    And I fill all the detail
    And I click on cont Tab
    Then I verify Payment method,Shipping method and Total Amount
    And I clikc on confirm button
    Then I verify text Thank You and message Order Successfully Processed
    And I click on Continue Tab
    Then I verify the text Welcome To Our store












