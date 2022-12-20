package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class BuildOwnComputerPage extends Utility {
    private static final Logger log = LogManager.getLogger(BuildOwnComputerPage.class.getName());

   // 2.5 Verify the Text "Build your own computer"
    @CacheLookup
     @FindBy ( xpath = "//h1[contains(text(),'Build your own computer')]")
    WebElement buildcomputerVerify ;
   // 2.6 Select "2.2 GHz Intel Pentium Dual-Core E2200" using Select class
   @CacheLookup
   @FindBy(xpath="//select[@id='product_attribute_1']")
    WebElement intelPlatinumField ;
   //2.7.Select "8GB [+$60.00]" using Select class.
    @CacheLookup
    @FindBy(xpath="//select[@id='product_attribute_2']")
    WebElement ramField;
    // 2.8 Select HDD radio "400 GB [+$100.00]"
    @CacheLookup
    @FindBy(xpath="//input[@id='product_attribute_3_7']")
    WebElement hDDField;
    // 2.9 Select OS radio "Vista Premium [+$60.00]"
    @CacheLookup
    @FindBy(id="product_attribute_4_9")
    WebElement VistaField;

    //  2.10 Check Two Check boxes "Microsoft Office [+$50.00]" and "Total Commander [+$5.00]"
    @CacheLookup
    @FindBy(id="product_attribute_5_12")
    WebElement commander;


  //  2.11 Verify the price "$1,475.00"
  @CacheLookup
  @FindBy(xpath="//span[@id='price-value-1']")
  WebElement priceverify;


  //2.12 Click on "ADD TO CARD" Button.
  @CacheLookup
  @FindBy(xpath="//button[@id='add-to-cart-button-1']")
  WebElement addToCart;


    //verify massage
    @CacheLookup
    @FindBy(xpath="//body/div[@id='bar-notification']/div[1]")
    WebElement verifyProductAdd;

    //2.14 Then MouseHover on "Shopping cart" and Click on "GO TO CART" button
    @CacheLookup
    @FindBy(xpath="//a[contains(text(),'shopping cart')]")
    WebElement shoppingCart;



//-------------------------------methods-----------------//
public String verifyBuildYourCompText (){
    log.info("BuildYourComputer" + buildcomputerVerify.toString());

    return getTextFromElement(buildcomputerVerify);
}
    public void selectIntelPlatinum(String text ){
        log.info(" intel platinum" + text+ "is selected" + intelPlatinumField.toString());
        selectByVisibleTextFromDropDown(intelPlatinumField,text);

    }
    public void selectRam(String text ){
        log.info("selection of RAM" + text + "is " + ramField.toString());
        selectByVisibleTextFromDropDown(ramField,text);

    }
    public void selectHDDTab(){
        log.info("selection of HDD" +  hDDField.toString());
        clickOnElement(hDDField);

    }
    public void selectVistaFieldTab( ){
        log.info("Select vista field tab " + VistaField.toString());
        clickOnElement(VistaField);

    }
    public void clickOnCommander(){
        log.info("click on commander" +commander.toString());
    clickOnElement(commander);

    }
    public String verifyPrice(){
        log.info("verify price  " + priceverify.toString());

    return getTextFromElement(priceverify);
    }
    public void clickOnAddTocart() {
        log.info("click on add to cart" + addToCart.toString());
        mouseHoverToElementAndClick(addToCart);
    }
    public String verifyProductAddTocart(){
        log.info("poduct add to cart" + verifyProductAdd.toString());

        return getTextFromElement(verifyProductAdd);
    }
    public void clickOnShoppingCart(){
        log.info("click on shopping cart" + shoppingCart.toString());
        mouseHoverToElementAndClick(shoppingCart);

    }
    public void closeGreenBar(){
    mouseHoverToElementAndClick(verifyProductAdd);
    }




}
