package com.nopcommerce.demo.cucumber.steps;

import com.nopcommerce.demo.pages.*;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class ElectronicTestSteps {
    @When("^I click on \"([^\"]*)\" tab$")
    public void iClickOnTab(String menu) throws InterruptedException {
        new HomePage().mousehoverToElectronics();
        Thread.sleep(1000);
    }
    @And("^I Click on Cell phones$")
    public void iClickOnCellPhones()throws InterruptedException {
        new HomePage().clickOnCellPhone();
        Thread.sleep(1000);
    }




    @Then("^I Verify the text Cell phones$")
    public void iVerifyTheTextCellPhones() throws InterruptedException{
        Assert.assertEquals("Cell phones", new HomePage().verifyTextCellPhone());
        Thread.sleep(1000);
    }


    @And("^I click on list view tab$")
    public void iClickOnListViewTab() throws InterruptedException {
        new CellPhonePage().mouseHoverandClickOnListView();
        Thread.sleep(1000);
    }

    @And("^I click on product name Nokia Lumia$")
    public void iClickOnProductNameNokiaLumia() throws InterruptedException {
        new CellPhonePage().clickOnNokiaLumiaProduct();
        Thread.sleep(1000);
    }

    @Then("^I verify text Nokia Lumia And the Price$")
    public void iVerifyTextNokiaLumiaAndThePrice() throws InterruptedException {
        Assert.assertEquals("Nokia Lumia 1020",new CellPhonePage().verifyProductNokiaLumia());
        Assert.assertEquals("$349.00",new CellPhonePage().verifyProductPriceOfNokia());
        Thread.sleep(1000);

    }

    @And("^I change quantity to \"([^\"]*)\"$")
    public void iChangeQuantityTo(String qty) {
       new CellPhonePage().clearQtyAndChangeQtyOfProuduct(qty);
    }

    @And("^click on Add To cart$")
    public void clickOnAddToCart()  throws InterruptedException{
        new CellPhonePage().clickOnAddTocartButton();
        Thread.sleep(1000);
    }

    @Then("^I verify text The product has been added$")
    public void iVerifyTextTheProductHasBeenAdded() throws InterruptedException {
        Assert.assertTrue(new CellPhonePage().verifymassageProductAddTocart().contains("The product has been added to your"));
        Thread.sleep(1000);
    }

    @And("^I close the window$")
    public void iCloseTheWindow() {
        new CellPhonePage().clickOnCrossButton();
    }

    @And("^I click on Shopping cart link$")
    public void iClickOnShoppingCartLink() throws InterruptedException {
        new BuildOwnComputerPage().clickOnShoppingCart();

        Thread.sleep(1000);
    }

    @Then("^I verify shopping cart message,qty and total price$")
    public void iVerifyShoppingCartMessageQtyAndTotalPrice()  throws InterruptedException{
        Assert.assertEquals("Shopping cart",new ShoppingCartPage().verifyShoppingCart());
        Assert.assertEquals("$698.00",new ShoppingCartPage().verifyTotalprice());
        Thread.sleep(1000);
    }

    @And("^I click on terms and service$")
    public void iClickOnTermsAndService() {
        new ShoppingCartPage().clickOnTermsAndService();
    }

    @And("^I click on checkout$")
    public void iClickOnCheckout() {
        new ShoppingCartPage().clickOnCheckoutButton();
    }

    @Then("^I verify text welcome please sign in$")
    public void iVerifyTextWelcomePleaseSignIn() throws InterruptedException {
        Assert.assertEquals("Welcome, Please Sign In!",new CheckOutGuestLoginPage().verifyWelcomeSignIn());
        Thread.sleep(1000);
    }

    @And("^I click on Register Tab$")
    public void iClickOnRegisterTab() {
        new CheckOutGuestLoginPage().clickOnRegister();
    }


    @And("^I filled all mandatory tab$")
    public void iFilledAllMandatoryTab() {
        new RegisterPage().enterFirstName("Siddh");
        new RegisterPage().enterLastName("Thak");
        new RegisterPage().enterEmail("Siddh.thak");
        new RegisterPage().enterPasswordField("Siddhthak12");
        new RegisterPage().enterConfirmpasswordField("Siddhthak12");

    }


    @And("^I click on Register link$")
    public void iClickOnRegisterLink()  throws InterruptedException{
        new RegisterPage().clickOnRegeisterButton();
    }

    @Then("^verify message your registration completed$")
    public void verifyMessageYourRegistrationCompleted() {
        Assert.assertEquals("Your registration completed",new RegisterPage().verifyYourRegCompleted());
    }

    @And("^I click on continue link$")
    public void iClickOnContinueLink() {
        new RegisterPage().clickOnContinuetab();
    }

    @And("^I verify Shopping cart Text$")
    public void iVerifyShoppingCartText() {
        Assert.assertEquals("Shopping cart", new ShoppingCartPage().verifyShoppingCart());
    }

    @And("^I click on Terms of Service$")
    public void iClickOnTermsOfService() {
        new ShoppingCartPage().clickOnTermsAndService();
    }

    @And("^I click On Checkout link$")
    public void iClickOnCheckoutLink() {
        new ShoppingCartPage().clickOnCheckoutButton();
    }


    @And("^I filled all required field$")
    public void iFilledAllRequiredField() throws InterruptedException{
        new CheckoutProductsPage().enterFirstName("Siddh");
        new CheckoutProductsPage().enterLastName("Thak");
        new CheckoutProductsPage().enterCountryName("United States");
        Thread.sleep(1000);
        new CheckoutProductsPage().enterStateName("Alaska");
        new CheckoutProductsPage().enterCityName("naple");
        new CheckoutProductsPage().enterAddress1("123 cordin view");
        new CheckoutProductsPage().enterZipCode("1528");
        new CheckoutProductsPage().enterPhoneNo("4585812");
        Thread.sleep(1000);

    }

    @And("^I click on Continue field$")
    public void iClickOnContinueField() {
        new CheckoutProductsPage().clickOnContinue();
    }

    @And("^I click on radio button second Day Air$")
    public void iClickOnRadioButtonSecondDayAir() {
        new CheckoutProductsPage().clickOnNextDay();
    }

    @And("^I fill mendatory card details$")
    public void iFillMendatoryCardDetails()throws InterruptedException {
        new CheckoutProductsPage().selectMasterCard("Master card");
        new CheckoutProductsPage().enterName("J.H.Mun");
        new CheckoutProductsPage().enterCardNo("4111111111111111");
        new CheckoutProductsPage().selectMonth("01");
        new CheckoutProductsPage().selectYear("2025");
        new CheckoutProductsPage().enterCardCode("123");
        Thread.sleep(1000);

    }

    @And("^I verify Payment method,Shipping option and Total Amount$")
    public void iVerifyPaymentMethodShippingOptionAndTotalAmount() {
        Assert.assertEquals("Credit Card",new CheckoutProductsPage().verifyCreditcadText());
        Assert.assertEquals("2nd Day Air",new CheckoutProductsPage().verifyShippingText());
        Assert.assertEquals("$698.00",new CheckoutProductsPage().verifyTotalText());
    }

    @Then("^I click on logout$")
    public void iClickOnLogout() {
        new HomePage().clickOnlogoutfield();
    }
}
