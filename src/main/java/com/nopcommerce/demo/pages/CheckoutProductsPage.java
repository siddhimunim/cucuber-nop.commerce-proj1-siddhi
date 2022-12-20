package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class CheckoutProductsPage extends Utility {
    private static final Logger log = LogManager.getLogger(CheckoutProductsPage.class.getName());
    //-------checkout as guest reg form-----------------
    //fill all mendotary field for billing address for all product purchase///
    @CacheLookup
    @FindBy(id = "BillingNewAddress_FirstName")
    WebElement firstName;
    @CacheLookup
    @FindBy(id = "BillingNewAddress_LastName")
    WebElement lastName;
    @CacheLookup
    @FindBy(id = "BillingNewAddress_Email")
    WebElement email;
    @CacheLookup
    @FindBy(id = "BillingNewAddress_CountryId")
    WebElement country;
    @CacheLookup
    @FindBy(id = "BillingNewAddress_StateProvinceId")
    WebElement stateField;
    @CacheLookup
    @FindBy(id = "BillingNewAddress_City")
    WebElement city;
    @CacheLookup
    @FindBy(id = "BillingNewAddress_Address1")
    WebElement address1;
    @CacheLookup
    @FindBy(id = "BillingNewAddress_ZipPostalCode")
    WebElement zip;
    @CacheLookup
    @FindBy(id = "BillingNewAddress_PhoneNumber")
    WebElement phoneNo;
    //click on continue
    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[1]/div[2]/div[1]/button[4]")
    WebElement countinue;

    public void enterFirstName(String text) {
        log.info("first name " + text + firstName.toString());
        sendTextToElement(firstName, text);

    }

    public void enterLastName(String text) {
        log.info("last name " + text + lastName.toString());
        sendTextToElement(lastName, text);

    }

    public void enterEmail(String text) {
        log.info("Email ID is " + text + email.toString());
        sendTextToElement(email, text);

    }

    public void enterCountryName(String text) {
        log.info("Country name is  " + text + country.toString());
        sendTextToElement(country, text);

    }

    public void enterStateName(String text) {
        log.info("State name is  " + text + stateField.toString());
        sendTextToElement(stateField, text);

    }

    public void enterCityName(String text) {
        log.info(" City name is  " + text + city.toString());
        sendTextToElement(city, text);

    }

    public void enterAddress1(String text) {
        log.info("Address 1 is  " + text + address1.toString());
        sendTextToElement(address1, text);

    }

    public void enterZipCode(String text) {
        log.info("Zip code is " + text + zip.toString());
        sendTextToElement(zip, text);

    }

    public void enterPhoneNo(String text) {
        log.info("Phone No is  " + text + phoneNo.toString());
        sendTextToElement(phoneNo, text);
    }

    public void clickOnContinue() {
        log.info("Click on continue" + countinue.toString());
        mouseHoverToElementAndClick(countinue);

    }
    //-----------------------form finish go to finish shopping for desktop  -----------------------------------------------

    //-----------for desktop product all checkout procedure steps--------------

    //  2.24 Click on Radio Button “Next Day Air($0.00)”
    @CacheLookup
    @FindBy(id = "shippingoption_1")
    WebElement nextDayAir;


    // 2.25 Click on “CONTINUE”
    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[3]/div[2]/form[1]/div[2]/button[1]")
    WebElement countClick;

    //2.26 Select Radio Button “Credit Card and countinue”
    @CacheLookup
    @FindBy(id = "paymentmethod_1")
    WebElement paymethod;
    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[4]/div[2]/div[1]/button[1]")
    WebElement nextTab;
    // 2.27 Select “Master card” From Select credit card dropdown
    @CacheLookup
    @FindBy(xpath = "//select[@id='CreditCardType']")
    WebElement masterCard;

    public void clickOnNextDay() {
        log.info("click on next day delivary" + nextDayAir.toString());
        clickOnElement(nextDayAir);

    }

    public void clickOnCountinueTab() {
        log.info("click on countinue tab " + countClick.toString());
        clickOnElement(countClick);

    }

    public void clickOnPaymentmethod() {
        log.info("click on paymentmethod" + paymethod.toString());
        clickOnElement(paymethod);

    }

    public void clickOnLink() {
        log.info("click on continue " + nextTab.toString());
        clickOnElement(nextTab);

    }

    public void selectMasterCard(String text) {
        log.info("mastercard " + text + "is selected" + masterCard.toString());
        selectByVisibleTextFromDropDown(masterCard, text);

    }

    //2.28----------------- Fill all the details for payments----------------------------------//
    @CacheLookup
    @FindBy(xpath = "//input[@id='CardholderName']")
    WebElement cardHoldername;
    @CacheLookup
    @FindBy(xpath = "//input[@id='CardNumber']")
    WebElement cardNo;
    @CacheLookup
    @FindBy(xpath = "//select[@id='ExpireMonth']")
    WebElement month;
    @CacheLookup
    @FindBy(xpath = "//select[@id='ExpireYear']")
    WebElement year;
    @CacheLookup
    @FindBy(xpath = "//input[@id='CardCode']")
    WebElement cardcode;


    public void enterName(String text) {
        log.info("Enter name   " + text + cardHoldername.toString());
        sendTextToElement(cardHoldername, text);

    }

    public void enterCardNo(String text) {
        log.info("Card No is  " + text + cardNo.toString());
        sendTextToElement(cardNo, text);

    }

    public void selectMonth(String text) {
        log.info("Enter Month is  " + text + month.toString());
        selectByVisibleTextFromDropDown(month, text);

    }

    public void selectYear(String text) {
        log.info("Enter year is  " + text + year.toString());
        selectByVisibleTextFromDropDown(year, text);

    }

    public void enterCardCode(String text) {
        log.info("Enter card code is  " + text + cardcode.toString());
        sendTextToElement(cardcode, text);

    }

    //2.29 Click on “CONTINUE
    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[5]/div[2]/div[1]/button[1]")
    WebElement clickcontinue;

    //  2.30 Verify “Payment Method” is “Credit Card”
    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Credit Card')]")
    WebElement verifyCreditCard;
    //  2.32 Verify “Shipping Method” is “Next Day Air”
    @CacheLookup
    @FindBy(xpath = "//div[@class='order-summary-content']/div/div[2]/div[2]/ul/li/span[2]")
    WebElement verifyShipping;


    //  2.33 Verify Total is “$2,950.00”
    @CacheLookup
    @FindBy(xpath = "//tr[@class='order-total']/td[2]/span")
    WebElement verifyTotal;

    //  2.34 Click on “CONFIRM”
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Confirm')]")
    WebElement confirm;

    //  2.35 Verify the Text “Thank You”
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Thank you')]")
    WebElement verifythankYou;

    //  2.36 Verify the message “Your order has been successfully processed!”
    @CacheLookup
    @FindBy(xpath = "//strong[contains(text(),'Your order has been successfully processed!')]")
    WebElement verifyOrderSuccess;

    //  2.37 Click on “CONTINUE”
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement tabContinue;



    public void clickOnContinueField() {

        mouseHoverToElementAndClick(clickcontinue);
        log.info("click on continue " + clickcontinue.toString());
    }
    public String verifyCreditcadText() {
        log.info("verify payment method is credit card " + verifyCreditCard.toString());

        return getTextFromElement(verifyCreditCard);
    }
    public String verifyShippingText() {
        log.info("verify Shipping method is next day delivary" + verifyShipping.toString());

        return getTextFromElement(verifyShipping);
    }
    public String verifyTotalText() {
        log.info("verify Total is $2950" + verifyTotal.toString());

        return getTextFromElement(verifyTotal);
    }
    public void clickOnConfirm() {

        mouseHoverToElementAndClick(confirm);
        log.info("click on continue " + confirm.toString());

    }
    public String verifyThankYouText() {
        log.info("verify text Thank You " + verifythankYou.toString());

        return getTextFromElement(verifythankYou);
    }
    public String verifyOrderSuccessText() {
        log.info("Your order has been successfully processed!" + verifyOrderSuccess.toString());

        return getTextFromElement(verifyOrderSuccess);
    }
    public void clickOnTabContinue() {

        mouseHoverToElementAndClick(tabContinue);
        log.info("click on continue " + tabContinue.toString());

    }

    //-------------------for cellphone product checkout scenario test---------------------------

    // for click on 2nd day air option
    @CacheLookup
    @FindBy(css = "#shippingoption_2")
    WebElement check2dayOption;
    @CacheLookup
    //@FindBy(xpath = "//div[@class='order-summary-content']/div/div[2]/div[2]/ul/li/span[2]")
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[6]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/ul[1]/li[1]/span[2]")
    WebElement verifyShippingmethod;

    public void clickOn2ndOption() {

        clickOnElement(check2dayOption);
        log.info("click on 2nd day option" + check2dayOption.toString());
    }
    //verify next day air
    public String verifyShippingmethodText() {
        log.info("verify shipping method is 2nd day " + verifyShippingmethod.toString());

        return getTextFromElement(verifyShippingmethod);
    }


}
