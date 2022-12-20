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

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DesktopPage extends Utility {
    private static final Logger log = LogManager.getLogger(DesktopPage.class.getName());
  //  1.3 Select Sort By position "Name: Z to A"
    @CacheLookup
     @FindBy(id ="products-orderby" )
    WebElement nameZtoA ;
    public void clickOnNameZtoA (){
        Reporter.log("click on name Z to A" + nameZtoA.toString());
        clickOnElement(nameZtoA);

    }


   //2.3 Select Sort By position "Name: A to Z"
   @CacheLookup
   @FindBy(id ="products-orderby" )
   WebElement nameAtoZ ;

    public void clickOnNameAtoZ (){

        clickOnElement(nameAtoZ);
        log.info("click on name A to Z" + nameAtoZ.toString());
    }

    //2.4 Click on "Add To Cart"
    @CacheLookup
    @FindBy(xpath ="//div[@data-productid='1']/div[2]/div[3]/div[2]/button[1]" )
    WebElement addTocart ;


    public void clickOnAddTocart(){

        mouseHoverToElementAndClick(addTocart);
        log.info("click on add to cart" + addTocart.toString());
    }
    //verify z-a order
    @CacheLookup
    @FindBy(xpath = "//h2/a" )
    List< WebElement> allProductName;

    By sortOutZToA = By.id("products-orderby");

    public ArrayList<String> verifyProductZToA() {
        // Get all the products name and stored into array list
        List<WebElement> products = allProductName;
        ArrayList<String> originalProductsName = new ArrayList<>();
        for (WebElement e : products) {
            originalProductsName.add(e.getText());
        }
        System.out.println(originalProductsName);
        // Sort By Reverse order//
        Collections.reverse(originalProductsName);

        // Select sort by Name Z - A//
        selectByVisibleTextFromDropDown(sortOutZToA, "Name: Z to A");
        // After filter Z -A Get all the products name and stored into array list
        products = (allProductName);
        ArrayList<String> afterSortByZToAProductsName = new ArrayList<>();
        for (WebElement e : products) {
            afterSortByZToAProductsName.add(e.getText());

        }
        return afterSortByZToAProductsName;
    }







}
