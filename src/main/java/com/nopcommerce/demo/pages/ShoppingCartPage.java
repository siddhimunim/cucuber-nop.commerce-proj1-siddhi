package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class ShoppingCartPage extends Utility {
    private static final Logger log = LogManager.getLogger(ShoppingCartPage.class.getName());
    //--------------for desktop product shopping cart secanrios------------------
    // 2.15 Verify the message "Shopping cart"
    @CacheLookup
     @FindBy(xpath = "//h1[contains(text(),'Shopping cart')]")
     WebElement verifyCart;

    //  2.16 Change the Qty to "2" and Click on "Update shopping cart"
    @CacheLookup
    @FindBy(xpath = "//td[@class='quantity']/input")
    WebElement changeQty;
    @CacheLookup
    @FindBy(id= "updatecart")
    WebElement updatecart;
    // 2.17 Verify the Total"$2,950.00"
    @CacheLookup
    @FindBy(xpath = "//tr[@class='order-total']/td[2]/span/strong")
    WebElement verifyPrice;


    // 2.18 click on checkbox “I agree with the terms of service”
    @CacheLookup
    @FindBy(id= "termsofservice")
    WebElement termscondition1;


    // 2.19 Click on “CHECKOUT
    @CacheLookup
    @FindBy(id= "checkout")
    WebElement checkout;
    @CacheLookup
    @FindBy(id= "termsofservice")
    WebElement termscondition;



    //-----------------all methods----------------------------------//
    public String verifyShoppingCart() {
       log.info("verify text ShoppingCart" + verifyCart.toString());

        return getTextFromElement(verifyCart);

    }
  /*  public void clearQty() {
        Reporter.log("click on continue " + checkout.toString());
        WebElement changeqty = driver.findElement(By.xpath("//td[@class='quantity']/input"));
        changeqty.clear();
        CustomListeners.test.log(Status.PASS, "click on continue");
    }*/
    public void newQtychange(String text) {

        WebElement changeqty = driver.findElement(By.xpath("//td[@class='quantity']/input"));
        changeqty.clear();
        sendTextToElement(changeQty, text);
        log.info("change quantity to " + text + changeQty.toString());
    }
    public void updateShoppingCart() {

        mouseHoverToElementAndClick(updatecart);
        log.info(" update shopping cart " + updatecart.toString());
    }
    public String verifyTotalprice() {
        log.info("Total price $2,950.00 " + verifyPrice.toString());

        return getTextFromElement(verifyPrice);
    }
    public void clickTermsAndService() {

        clickOnElement(termscondition1);
        log.info("click on terms and condition " + termscondition1.toString());
    }
    public void clickOnCheckoutButton() {

        mouseHoverToElementAndClick(checkout);
        log.info("click on checkout  " + checkout.toString());

    }
    public void clickOnTermsAndService() {

        clickOnElement(termscondition);
        log.info("click on terms and condition " + termscondition.toString());
    }



    //-----------------for cellphone product test secanario ------------------------
    // 2.13 Verify the quantity is 2
    // WebElement text = driver.findElement(By.xpath("//input[@class='qty-input']"));
    // String expText5 = "2";
    // String actText5 = text.getAttribute("value");
    @CacheLookup
    @FindBy(xpath="//input[@class='qty-input']")
    WebElement verifyQty;


    public String verifyQtyOfLumiaMobile(String value1) {
 log.info("Total Qty " + verifyQty.toString());

        WebElement text1 = driver.findElement(By.xpath("//input[@class='qty-input']"));
        text1.getAttribute("value");
        return getTextFromElement(verifyQty);

    }

    //2.14 Verify the Total $698.00
    @CacheLookup
    @FindBy(xpath="//tr[@class='order-total']/td[2]/span")
    WebElement verifytotalPrice;


    public String verifyTotalPrice() {
        log.info("Total price $698 " + verifytotalPrice.toString());

        return getTextFromElement(verifytotalPrice);

    }
    //click on checkout
    @CacheLookup
    @FindBy(id= "checkout")
    WebElement checkout1;
    public void clickCheckoutButton() {

        mouseHoverToElementAndClick(checkout1);

        log.info("click on checkout  " + checkout1.toString());
    }
}
