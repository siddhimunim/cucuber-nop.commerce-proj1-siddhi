package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class CheckOutGuestLoginPage extends Utility {
    private static final Logger log = LogManager.getLogger(CheckOutGuestLoginPage.class.getName());
    // 2.20 Verify the Text “Welcome, Please Sign In!”
    @CacheLookup
    @FindBy(xpath ="//h1[contains(text(),'Welcome, Please Sign In!')]" )
    WebElement verifyWelcometext;
    public String verifyWelcomeSignIn(){
        log.info("verify welcome text on page" + verifyWelcometext.toString());

        return getTextFromElement(verifyWelcometext);
    }
    // 2.21Click on “CHECKOUT AS GUEST” Tab
    @CacheLookup
    @FindBy(xpath ="//button[contains(text(),'Checkout as Guest')]" )
    WebElement checkoutGuest;

    public void clickOnCheckoutasGuest() {
        log.info("click on checkout guest button" + checkoutGuest.toString());
        clickOnElement(checkoutGuest);

    }
    //--------------for cellphone product checkout register on site---------
    @CacheLookup
    @FindBy(xpath ="//button[contains(text(),'Register')]" )
    WebElement register;

    public void clickOnRegister(){
        log.info("click on register button" + register.toString());
        mouseHoverToElementAndClick(register);

    }


}
