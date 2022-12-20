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

public class CellPhonePage extends Utility {
    private static final Logger log = LogManager.getLogger(CellPhonePage.class.getName());
    //test scenario for  verifyThatTheProductAddedSuccessfullyAndPlaceOrderSuccessfully method
    //  2.4 Click on List View Tab
    @CacheLookup
    @FindBy(xpath="//a[contains(text(),'List')]")
    WebElement listView;

 //2.5 Click on product name “Nokia Lumia 1020” link
 @CacheLookup
 @FindBy(xpath="//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[3]/div[1]/div[2]/h2[1]/a[1]")
 WebElement nokiaLumiaText;

   //2.6 Verify the text “Nokia Lumia 1020
   @CacheLookup
   @FindBy(xpath="//h1[contains(text(),'Nokia Lumia 1020')]")
   WebElement verifyNokiaLumia ;

    //2.7 Verify the price “$349.00”
    @CacheLookup
    @FindBy(xpath="//span[@id='price-value-20']")
    WebElement verifyPrice ;

    // 2.8 Change quantity to 2
    @CacheLookup
    @FindBy(xpath="//input[@id='product_enteredQuantity_20']")
    WebElement QtyField ;

    // 2.9 Click on “ADD TO CART” tab
    @CacheLookup
    @FindBy(xpath = "//button[@id='add-to-cart-button-20']")
    WebElement addTocart ;

//    2.10 Verify the Message "The product has been added to your shopping cart" on Top green bar,
//    After that close the bar clicking on the cross button.//
     @CacheLookup
     @FindBy (xpath = "//body/div[@id='bar-notification']/div[1]/p[1]")
     WebElement verifymassageSucess ;
    @CacheLookup
    @FindBy (xpath = "//body/div[@id='bar-notification']/div[1]/span[1]")
    WebElement clickOncrossButtton;

    //  2.11 Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.
    @CacheLookup
    @FindBy (xpath = "//span[contains(text(),'Shopping cart')]")
    WebElement shopCart;
    @CacheLookup
    @FindBy (xpath = "//button[contains(text(),'Go to cart')]")
    WebElement clickOnGocart;





    //----------------------------------------methods-------------------------------//

    public void mouseHoverandClickOnListView(){
        log.info("clikc on listview of cellphone" + listView.toString());
        mouseHoverToElementAndClick(listView);

    }
    public void clickOnNokiaLumiaProduct(){
        log.info("click on nokia lumia product" + nokiaLumiaText.toString());
        mouseHoverToElementAndClick(nokiaLumiaText);

    }
    public String verifyProductNokiaLumia(){
        log.info("verifying nokia lumia product" + verifyNokiaLumia.toString());

        return  getTextFromElement(verifyNokiaLumia);
    }
    public String verifyProductPriceOfNokia(){
        log.info("verifying product price of  nokia lumia product" + verifyPrice.toString());

        return  getTextFromElement(verifyPrice);
    }
    public void clearQtyAndChangeQtyOfProuduct(String text){
        log.info("changing Quantity of product" + text + "for" + nokiaLumiaText.toString());
        WebElement changeqty =   driver.findElement(By.xpath("//input[@id='product_enteredQuantity_20']"));
        changeqty.clear();
        sendTextToElement(QtyField,text);

    }
    public void clickOnAddTocartButton(){
        log.info("click on add to cart" + addTocart.toString());
        mouseHoverToElementAndClick(addTocart);

    }
    public String verifymassageProductAddTocart(){
        log.info("verify massage product add to cart" + verifymassageSucess.toString());

        return getTextFromElement(verifymassageSucess);

    }
    public void clickOnCrossButton(){
        log.info("click on cross button" + clickOncrossButtton.toString());
        mouseHoverToElementAndClick(clickOncrossButtton);

    }
    public void mouseHoverToShoppingcart(){
        log.info("mousehoover to shopping cart" + shopCart.toString());
        mouseHoverToElement(shopCart);

    }
    public void goTocart(){
        log.info("click on go to cart" + clickOnGocart.toString());
        clickOnElement(clickOnGocart);

    }





}