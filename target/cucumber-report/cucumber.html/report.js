$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("computertest.feature");
formatter.feature({
  "line": 1,
  "name": "Computer Test",
  "description": "\r\nAs user I am on home page of nop commerce website and test ComputerPage\r\nGiven I am on homepage",
  "id": "computer-test",
  "keyword": "Feature"
});
formatter.before({
  "duration": 5250962200,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "verify Product Arrange In AlphaBatical Order",
  "description": "",
  "id": "computer-test;verify-product-arrange-in-alphabatical-order",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 6,
      "name": "@Sanity"
    },
    {
      "line": 6,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "I click on \"Computers\" menu",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I click on desktop",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I select sort by position Name: Z to A",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I verify product display in Z to A order",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Computers",
      "offset": 12
    }
  ],
  "location": "ComputerTestSteps.iClickOnMenu(String)"
});
formatter.result({
  "duration": 324065900,
  "status": "passed"
});
formatter.match({
  "location": "ComputerTestSteps.iClickOnDesktop()"
});
formatter.result({
  "duration": 1942074100,
  "status": "passed"
});
formatter.match({
  "location": "ComputerTestSteps.iSelectSortByPositionNameZToA()"
});
formatter.result({
  "duration": 1112439400,
  "status": "passed"
});
formatter.match({
  "location": "ComputerTestSteps.iVerifyProductDisplayInZToAOrder()"
});
formatter.result({
  "duration": 1363482900,
  "status": "passed"
});
formatter.after({
  "duration": 196200,
  "status": "passed"
});
formatter.before({
  "duration": 2658857500,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "verify Product Added To Shopping Cart SuccessFully",
  "description": "",
  "id": "computer-test;verify-product-added-to-shopping-cart-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 14,
      "name": "@Smoke"
    },
    {
      "line": 14,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 16,
  "name": "I click on \"Computers\" menu",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "I click on desktop",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I select sort by position  Name: A to Z",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I click on Add to cart of Build your own computer",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "I verify the text Build your own computer",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "I select all mendotary field for computer",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "I verify Total price on page",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "I click on add to cart button",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "I verify text The product has been added to your shopping cart on Top green bar",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "click on cross button on top",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "I click on Shopping cart",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "I verify the message shopping cart",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "I chaange qty to \"2\" and update shopping cart",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "I verify the total of updating cart",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "I checkbox I agree with the terms of service",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "I click on Checkout",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "I verify the text welcome ,please sign in",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "I click on checkout as guest",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "I fill the all mandatory field",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "I click on continue",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "I click on radio button Next Day Air",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "I click on continue button",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "I select radio button credit card",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "click on continue Field",
  "keyword": "And "
});
formatter.step({
  "line": 40,
  "name": "I fill all the detail",
  "keyword": "And "
});
formatter.step({
  "line": 41,
  "name": "I click on cont Tab",
  "keyword": "And "
});
formatter.step({
  "line": 42,
  "name": "I verify Payment method,Shipping method and Total Amount",
  "keyword": "Then "
});
formatter.step({
  "line": 43,
  "name": "I clikc on confirm button",
  "keyword": "And "
});
formatter.step({
  "line": 44,
  "name": "I verify text Thank You and message Order Successfully Processed",
  "keyword": "Then "
});
formatter.step({
  "line": 45,
  "name": "I click on Continue Tab",
  "keyword": "And "
});
formatter.step({
  "line": 46,
  "name": "I verify the text Welcome To Our store",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Computers",
      "offset": 12
    }
  ],
  "location": "ComputerTestSteps.iClickOnMenu(String)"
});
formatter.result({
  "duration": 192122900,
  "status": "passed"
});
formatter.match({
  "location": "ComputerTestSteps.iClickOnDesktop()"
});
formatter.result({
  "duration": 1992925000,
  "status": "passed"
});
formatter.match({
  "location": "ComputerTestSteps.iSelectSortByPositionNameAToZ()"
});
formatter.result({
  "duration": 96898400,
  "status": "passed"
});
formatter.match({
  "location": "ComputerTestSteps.iClickOnAddToCartOfBuildYourOwnComputer()"
});
formatter.result({
  "duration": 234508400,
  "status": "passed"
});
formatter.match({
  "location": "ComputerTestSteps.iVerifyTheTextBuildYourOwnComputer()"
});
formatter.result({
  "duration": 1019463900,
  "status": "passed"
});
formatter.match({
  "location": "ComputerTestSteps.iSelectAllMendotaryFieldForComputer()"
});
formatter.result({
  "duration": 1500814800,
  "status": "passed"
});
formatter.match({
  "location": "ComputerTestSteps.iVerifyTotalPriceOnPage()"
});
formatter.result({
  "duration": 1039774800,
  "status": "passed"
});
formatter.match({
  "location": "ComputerTestSteps.iClickOnAddToCartButton()"
});
formatter.result({
  "duration": 1198270700,
  "status": "passed"
});
formatter.match({
  "location": "ComputerTestSteps.iVerifyTextTheProductHasBeenAddedToYourShoppingCartOnTopGreenBar()"
});
formatter.result({
  "duration": 1037781000,
  "status": "passed"
});
formatter.match({
  "location": "ComputerTestSteps.clickOnCrossButtonOnTop()"
});
formatter.result({
  "duration": 149242600,
  "status": "passed"
});
formatter.match({
  "location": "ComputerTestSteps.iClickOnShoppingCart()"
});
formatter.result({
  "duration": 526725200,
  "status": "passed"
});
formatter.match({
  "location": "ComputerTestSteps.iVerifyTheMessageShoppingCart()"
});
formatter.result({
  "duration": 1047961100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 18
    }
  ],
  "location": "ComputerTestSteps.iChaangeQtyToAndUpdateShoppingCart(String)"
});
formatter.result({
  "duration": 645932900,
  "status": "passed"
});
formatter.match({
  "location": "ComputerTestSteps.iVerifyTheTotalOfUpdatingCart()"
});
formatter.result({
  "duration": 1074189200,
  "status": "passed"
});
formatter.match({
  "location": "ComputerTestSteps.iCheckboxIAgreeWithTheTermsOfService()"
});
formatter.result({
  "duration": 57116600,
  "status": "passed"
});
formatter.match({
  "location": "ComputerTestSteps.iClickOnCheckout()"
});
formatter.result({
  "duration": 1593624200,
  "status": "passed"
});
formatter.match({
  "location": "ComputerTestSteps.iVerifyTheTextWelcomePleaseSignIn()"
});
formatter.result({
  "duration": 1056863100,
  "status": "passed"
});
formatter.match({
  "location": "ComputerTestSteps.iClickOnCheckoutAsGuest()"
});
formatter.result({
  "duration": 634116800,
  "status": "passed"
});
formatter.match({
  "location": "ComputerTestSteps.iFillTheAllMandatoryField()"
});
formatter.result({
  "duration": 2834004200,
  "status": "passed"
});
formatter.match({
  "location": "ComputerTestSteps.iClickOnContinue()"
});
formatter.result({
  "duration": 157751500,
  "status": "passed"
});
formatter.match({
  "location": "ComputerTestSteps.iClickOnRadioButtonNextDayAir()"
});
formatter.result({
  "duration": 1270253700,
  "status": "passed"
});
formatter.match({
  "location": "ComputerTestSteps.iClickOnContinueButton()"
});
formatter.result({
  "duration": 65418400,
  "status": "passed"
});
formatter.match({
  "location": "ComputerTestSteps.iSelectRadioButtonCreditCard()"
});
formatter.result({
  "duration": 1271416000,
  "status": "passed"
});
formatter.match({
  "location": "ComputerTestSteps.clickOnContinueField()"
});
formatter.result({
  "duration": 64586700,
  "status": "passed"
});
formatter.match({
  "location": "ComputerTestSteps.iFillAllTheDetail()"
});
formatter.result({
  "duration": 1780772900,
  "status": "passed"
});
formatter.match({
  "location": "ComputerTestSteps.iClickOnContTab()"
});
formatter.result({
  "duration": 1166589400,
  "status": "passed"
});
formatter.match({
  "location": "ComputerTestSteps.iVerifyPaymentMethodShippingMethodAndTotalAmount()"
});
formatter.result({
  "duration": 1121960200,
  "status": "passed"
});
formatter.match({
  "location": "ComputerTestSteps.iClikcOnConfirmButton()"
});
formatter.result({
  "duration": 180835500,
  "status": "passed"
});
formatter.match({
  "location": "ComputerTestSteps.iVerifyTextThankYouAndMessageOrderSuccessfullyProcessed()"
});
formatter.result({
  "duration": 2111759400,
  "status": "passed"
});
formatter.match({
  "location": "ComputerTestSteps.iClickOnContinueTab()"
});
formatter.result({
  "duration": 1465782500,
  "status": "passed"
});
formatter.match({
  "location": "ComputerTestSteps.iVerifyTheTextWelcomeToOurStore()"
});
formatter.result({
  "duration": 38674600,
  "status": "passed"
});
formatter.after({
  "duration": 97300,
  "status": "passed"
});
formatter.uri("electronics.feature");
formatter.feature({
  "line": 1,
  "name": "Electronics Test",
  "description": "As a User I am on home page of nop commerce site and verifying electronic test\r\nGiven I am on Home page",
  "id": "electronics-test",
  "keyword": "Feature"
});
formatter.before({
  "duration": 3225211500,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "verify User Should Navigate To CellPhones Page Successfully",
  "description": "",
  "id": "electronics-test;verify-user-should-navigate-to-cellphones-page-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@Sanity"
    },
    {
      "line": 5,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "I click on \"Electronics\" tab",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I Click on Cell phones",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I Verify the text Cell phones",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Electronics",
      "offset": 12
    }
  ],
  "location": "ElectronicTestSteps.iClickOnTab(String)"
});
formatter.result({
  "duration": 1207178600,
  "status": "passed"
});
formatter.match({
  "location": "ElectronicTestSteps.iClickOnCellPhones()"
});
formatter.result({
  "duration": 2005968800,
  "status": "passed"
});
formatter.match({
  "location": "ElectronicTestSteps.iVerifyTheTextCellPhones()"
});
formatter.result({
  "duration": 1052599700,
  "status": "passed"
});
formatter.after({
  "duration": 26600,
  "status": "passed"
});
formatter.before({
  "duration": 3354782900,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "verify That The Product Added Successfully And Place Order Successfully",
  "description": "",
  "id": "electronics-test;verify-that-the-product-added-successfully-and-place-order-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 11,
      "name": "@Smoke"
    },
    {
      "line": 11,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "I click on \"Electronics\" tab",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "I Click on Cell phones",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I Verify the text Cell phones",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I click on list view tab",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I click on product name Nokia Lumia",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I verify text Nokia Lumia And the Price",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "I change quantity to \"2\"",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "click on Add To cart",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "I verify text The product has been added",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "I close the window",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "I click on Shopping cart link",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "I verify shopping cart message,qty and total price",
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "I click on terms and service",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "I click on checkout",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "I verify text welcome please sign in",
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "I click on Register Tab",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "I filled all mandatory tab",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "I click on Register link",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "verify message your registration completed",
  "keyword": "Then "
});
formatter.step({
  "line": 32,
  "name": "I click on continue link",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "Electronics",
      "offset": 12
    }
  ],
  "location": "ElectronicTestSteps.iClickOnTab(String)"
});
formatter.result({
  "duration": 1174331300,
  "status": "passed"
});
formatter.match({
  "location": "ElectronicTestSteps.iClickOnCellPhones()"
});
formatter.result({
  "duration": 1994710800,
  "status": "passed"
});
formatter.match({
  "location": "ElectronicTestSteps.iVerifyTheTextCellPhones()"
});
formatter.result({
  "duration": 1044719100,
  "status": "passed"
});
formatter.match({
  "location": "ElectronicTestSteps.iClickOnListViewTab()"
});
formatter.result({
  "duration": 1178164900,
  "status": "passed"
});
formatter.match({
  "location": "ElectronicTestSteps.iClickOnProductNameNokiaLumia()"
});
formatter.result({
  "duration": 1930847700,
  "status": "passed"
});
formatter.match({
  "location": "ElectronicTestSteps.iVerifyTextNokiaLumiaAndThePrice()"
});
formatter.result({
  "duration": 1109116500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 22
    }
  ],
  "location": "ElectronicTestSteps.iChangeQuantityTo(String)"
});
formatter.result({
  "duration": 20205187800,
  "status": "passed"
});
formatter.match({
  "location": "ElectronicTestSteps.clickOnAddToCart()"
});
formatter.result({
  "duration": 1185424600,
  "status": "passed"
});
formatter.match({
  "location": "ElectronicTestSteps.iVerifyTextTheProductHasBeenAdded()"
});
formatter.result({
  "duration": 1035236800,
  "status": "passed"
});
formatter.match({
  "location": "ElectronicTestSteps.iCloseTheWindow()"
});
formatter.result({
  "duration": 143512000,
  "status": "passed"
});
formatter.match({
  "location": "ElectronicTestSteps.iClickOnShoppingCartLink()"
});
formatter.result({
  "duration": 1566830500,
  "status": "passed"
});
formatter.match({
  "location": "ElectronicTestSteps.iVerifyShoppingCartMessageQtyAndTotalPrice()"
});
formatter.result({
  "duration": 1086105100,
  "status": "passed"
});
formatter.match({
  "location": "ElectronicTestSteps.iClickOnTermsAndService()"
});
formatter.result({
  "duration": 76215500,
  "status": "passed"
});
formatter.match({
  "location": "ElectronicTestSteps.iClickOnCheckout()"
});
formatter.result({
  "duration": 658966500,
  "status": "passed"
});
formatter.match({
  "location": "ElectronicTestSteps.iVerifyTextWelcomePleaseSignIn()"
});
formatter.result({
  "duration": 1047460300,
  "status": "passed"
});
formatter.match({
  "location": "ElectronicTestSteps.iClickOnRegisterTab()"
});
formatter.result({
  "duration": 446269200,
  "status": "passed"
});
formatter.match({
  "location": "ElectronicTestSteps.iFilledAllMandatoryTab()"
});
formatter.result({
  "duration": 511608700,
  "status": "passed"
});
formatter.match({
  "location": "ElectronicTestSteps.iClickOnRegisterLink()"
});
formatter.result({
  "duration": 717353900,
  "status": "passed"
});
formatter.match({
  "location": "ElectronicTestSteps.verifyMessageYourRegistrationCompleted()"
});
formatter.result({
  "duration": 50624300,
  "status": "passed"
});
formatter.match({
  "location": "ElectronicTestSteps.iClickOnContinueLink()"
});
formatter.result({
  "duration": 451123000,
  "status": "passed"
});
formatter.after({
  "duration": 34200,
  "status": "passed"
});
});