package com.nopcommerce.demo.cucumber.steps;

import com.nopcommerce.demo.pages.*;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.poi.ss.formula.functions.T;
import org.junit.Assert;

import java.util.Collections;
import java.util.List;

public class ComputerTestSteps {
    @When("^I click on \"([^\"]*)\" menu$")
    public void iClickOnMenu(String menu)  {
        new HomePage().clickOnComputerMenu();

    }


    @And("^I click on desktop$")
    public void iClickOnDesktop() throws InterruptedException {
        new HomePage().clickOndesktop();
        Thread.sleep(1000);
    }
    @And("^I select sort by position Name: Z to A$")
    public void iSelectSortByPositionNameZToA() throws InterruptedException {
        new DesktopPage().clickOnNameZtoA();
        Thread.sleep(1000);
    }
    @Then("^I verify product display in Z to A order$")
    public void iVerifyProductDisplayInZToAOrder() throws InterruptedException {

            DesktopPage desktopsPage = new DesktopPage();
            List<String> expText  = desktopsPage.verifyProductZToA();
            List<String> actText  = desktopsPage.verifyProductZToA();
            System.out.println("Expected list " + expText );
            Assert.assertEquals(Collections.singleton(actText),Collections.singleton(expText));
            System.out.println("Actual List " + actText);
        Thread.sleep(1000);
    }

    @And("^I select sort by position  Name: A to Z$")
    public void iSelectSortByPositionNameAToZ() {
        new DesktopPage().clickOnNameAtoZ();
    }

    @And("^I click on Add to cart of Build your own computer$")
    public void iClickOnAddToCartOfBuildYourOwnComputer() {
        new DesktopPage().clickOnAddTocart();
    }


    @And("^I verify the text Build your own computer$")
    public void iVerifyTheTextBuildYourOwnComputer() {
        Assert.assertEquals("Build your own computer",new BuildOwnComputerPage().verifyBuildYourCompText());
    }

    @And("^I select all mendotary field for computer$")
    public void iSelectAllMendotaryFieldForComputer()  throws InterruptedException{
        new BuildOwnComputerPage().selectIntelPlatinum("2.2 GHz Intel Pentium Dual-Core E2200");
        new BuildOwnComputerPage().selectRam("8GB [+$60.00]");
        new BuildOwnComputerPage().selectHDDTab();
        new BuildOwnComputerPage().selectVistaFieldTab();
        new BuildOwnComputerPage().clickOnCommander();
        Thread.sleep(1000);
    }
    @And("^I verify Total price on page$")
    public void iVerifyTotalPriceOnPage()  throws InterruptedException{
        Assert.assertEquals("$1,475.00",new BuildOwnComputerPage().verifyPrice());
        Thread.sleep(1000);
    }



    @And("^I click on add to cart button$")
    public void iClickOnAddToCartButton() throws InterruptedException {
        new BuildOwnComputerPage().clickOnAddTocart();
        Thread.sleep(1000);
    }
    @And("^I verify text The product has been added to your shopping cart on Top green bar$")
    public void iVerifyTextTheProductHasBeenAddedToYourShoppingCartOnTopGreenBar() throws InterruptedException {
        Assert.assertTrue(new BuildOwnComputerPage().verifyProductAddTocart().contains("The product has been added to your "));
        Thread.sleep(1000);
    }


    @And("^click on cross button on top$")
    public void clickOnCrossButtonOnTop() {
        new BuildOwnComputerPage().closeGreenBar();

    }

    @And("^I click on Shopping cart$")
    public void iClickOnShoppingCart() {
        new BuildOwnComputerPage().clickOnShoppingCart();
    }

    @And("^I verify the message shopping cart$")
    public void iVerifyTheMessageShoppingCart()throws InterruptedException {
        Assert.assertEquals("Shopping cart",new ShoppingCartPage().verifyShoppingCart());
        Thread.sleep(1000);
    }

    @And("^I chaange qty to \"([^\"]*)\" and update shopping cart$")
    public void iChaangeQtyToAndUpdateShoppingCart(String qty){
        new ShoppingCartPage().newQtychange(qty);
        new ShoppingCartPage().updateShoppingCart();

    }

    @And("^I verify the total of updating cart$")
    public void iVerifyTheTotalOfUpdatingCart()throws InterruptedException {
        Assert.assertEquals("$2,950.00",new ShoppingCartPage().verifyTotalPrice());
        Thread.sleep(1000);
    }

    @And("^I checkbox I agree with the terms of service$")
    public void iCheckboxIAgreeWithTheTermsOfService() {
        new ShoppingCartPage().clickOnTermsAndService();
    }

    @And("^I click on Checkout$")
    public void iClickOnCheckout() throws InterruptedException{
        new ShoppingCartPage().clickOnCheckoutButton();
        Thread.sleep(1000);
    }

    @And("^I verify the text welcome ,please sign in$")
    public void iVerifyTheTextWelcomePleaseSignIn() throws InterruptedException{
        Assert.assertEquals("Welcome, Please Sign In!",new CheckOutGuestLoginPage().verifyWelcomeSignIn());
        Thread.sleep(1000);
    }

    @And("^I click on checkout as guest$")
    public void iClickOnCheckoutAsGuest() {
        new CheckOutGuestLoginPage().clickOnCheckoutasGuest();
    }

    @And("^I fill the all mandatory field$")
    public void iFillTheAllMandatoryField()throws InterruptedException {
        new CheckoutProductsPage().enterFirstName("Jenna");
        new CheckoutProductsPage().enterLastName("Munim");
        new CheckoutProductsPage().enterEmail("Jennamun12@gmail.com");
        new CheckoutProductsPage().enterCountryName("United States");
        Thread.sleep(1000);
        new CheckoutProductsPage().enterStateName("Alaska");
        new CheckoutProductsPage().enterCityName("naple");
        new CheckoutProductsPage().enterAddress1("123 cordin view");
        new CheckoutProductsPage().enterZipCode("1528");
        new CheckoutProductsPage().enterPhoneNo("4585812");
        Thread.sleep(1000);

    }

    @And("^I click on continue$")
    public void iClickOnContinue() {
        new CheckoutProductsPage().clickOnContinue();
    }

    @And("^I click on radio button Next Day Air$")
    public void iClickOnRadioButtonNextDayAir()throws InterruptedException {
        new CheckoutProductsPage().clickOnNextDay();
        Thread.sleep(1000);
    }

    @And("^I click on continue button$")
    public void iClickOnContinueButton() {
        new CheckoutProductsPage().clickOnCountinueTab();
    }

    @And("^I select radio button credit card$")
    public void iSelectRadioButtonCreditCard()throws InterruptedException {
        new CheckoutProductsPage().clickOnPaymentmethod();
        Thread.sleep(1000);
    }


    @And("^click on continue Field$")
    public void clickOnContinueField() {
        new CheckoutProductsPage().clickOnLink();
    }

    @And("^I fill all the detail$")
    public void iFillAllTheDetail() throws InterruptedException{
        new CheckoutProductsPage().selectMasterCard("Master card");
        new CheckoutProductsPage().enterName("J.H.Mun");
        new CheckoutProductsPage().enterCardNo("5555555555554444");
        new CheckoutProductsPage().selectMonth("01");
        new CheckoutProductsPage().selectYear("2025");
        new CheckoutProductsPage().enterCardCode("123");
        Thread.sleep(1000);

    }
    @And("^I click on cont Tab$")
    public void iClickOnContTab()throws InterruptedException {
        new CheckoutProductsPage().clickOnContinueField();
        Thread.sleep(1000);
    }



    @Then("^I verify Payment method,Shipping method and Total Amount$")
    public void iVerifyPaymentMethodShippingMethodAndTotalAmount()throws InterruptedException {
        Assert.assertEquals("Credit Card",new CheckoutProductsPage().verifyCreditcadText());
        Assert.assertEquals("Next Day Air",new CheckoutProductsPage().verifyShippingText());
        Assert.assertEquals("$2,950.00",new CheckoutProductsPage().verifyTotalText());
        Thread.sleep(1000);
    }

    @And("^I clikc on confirm button$")
    public void iClikcOnConfirmButton() {
        new CheckoutProductsPage().clickOnConfirm();
    }

    @Then("^I verify text Thank You and message Order Successfully Processed$")
    public void iVerifyTextThankYouAndMessageOrderSuccessfullyProcessed()throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertEquals("Thank you",new CheckoutProductsPage().verifyThankYouText());
        Assert.assertEquals("Your order has been successfully processed!",new CheckoutProductsPage().verifyOrderSuccessText());
        Thread.sleep(1000);
    }
    @And("^I click on Continue Tab$")
    public void iClickOnContinueTab()throws InterruptedException {
        new CheckoutProductsPage().clickOnTabContinue();
        Thread.sleep(1000);
    }




    @Then("^I verify the text Welcome To Our store$")
    public void iVerifyTheTextWelcomeToOurStore() {
        Assert.assertEquals("Welcome to our store",new HomePage().verifyWelcomeStore());
    }


















   /* @Then("^I verify product display in Z to A order$")
    public void iVerifyProductDisplayInZToAOrder() {
        DesktopPage desktopsPage = new DesktopPage();
        List<String> expText  = desktopsPage.verifyProductZToA();
        List<String> actText  = desktopsPage.verifyProductZToA();
        System.out.println("Expected list " + expText );
        Assert.assertEquals(Collections.singleton(actText),Collections.singleton(expText));
        System.out.println("Actual List " + actText);
    }*/


}
