Feature:  Electronics Test
  As a User I am on home page of nop commerce site and verifying electronic test
  Given I am on Home page

  @Sanity @Regression
  Scenario: verify User Should Navigate To CellPhones Page Successfully
    When I click on "Electronics" tab
    And I Click on Cell phones
    Then I Verify the text Cell phones

  @Smoke @Regression
  Scenario: verify That The Product Added Successfully And Place Order Successfully
    When I click on "Electronics" tab
    And I Click on Cell phones
    And I Verify the text Cell phones
    And I click on list view tab
    And I click on product name Nokia Lumia
    Then I verify text Nokia Lumia And the Price
    And I change quantity to "2"
    And click on Add To cart
    Then I verify text The product has been added
    And I close the window
    And I click on Shopping cart link
    Then I verify shopping cart message,qty and total price
    And I click on terms and service
    And I click on checkout
    Then I verify text welcome please sign in
    And I click on Register Tab
    And I filled all mandatory tab
    And I click on Register link
    Then verify message your registration completed
    And I click on continue link
#    And I verify Shopping cart Text
#    And I click on Terms of Service
#    And I click On Checkout link
#    And I filled all required field
#    And I click on Continue field
#    And I click on radio button second Day Air
#    And I click on continue button
#    And I select radio button credit card
#    And I click on Continue field
#    And I fill mendatory card details
#    And I click on cont Tab
#    And I verify Payment method,Shipping option and Total Amount
#    And I clikc on confirm button
#    And I verify text Thank You and message Order Successfully Processed
#    And I click on Continue Tab
#    And I verify the text Welcome To Our store
#    Then I click on logout











