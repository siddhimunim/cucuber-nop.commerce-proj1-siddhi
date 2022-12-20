package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import java.util.List;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    By mainMenuList = By.xpath("//div[@class = 'header-menu']/ul/li");

    public void selectMenu(String menu) {
        List<WebElement> myProductList = driver.findElements(mainMenuList);
        try {
            for (WebElement option1 : myProductList) {
                System.out.println(option1.getText());
                if (option1.getText().equals(menu)) {
                    option1.click();
                    break;
                }
            }

        } catch (StaleElementReferenceException e) {
            myProductList = driver.findElements(mainMenuList);
        }

    }

    //  1.1 Click on Computer Menu.
    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[2]/ul[1]/li[1]/a[1]")
    WebElement computerMenu;
    @CacheLookup
    @FindBy(css = "div.page-title")
    WebElement pageTitle;

    // 1.2 Click on Desktop
    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]")
    WebElement desktop;

    // 2.37 verify welcome to our store
    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Welcome to our store')]")
    WebElement welcometext;


    //--------------------------electronic product------------------------------
    // 1.1 Mouse Hover on “Electronics” Tab
    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[2]/ul[1]/li[2]/a[1]")
    WebElement elecTab;

    //1.2 Mouse Hover on “Cell phones” and click
    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[2]/ul[1]/li[2]/ul[1]/li[2]/a[1]")
    WebElement cellphoneField;


    //1.3 Verify the text “Cell phones
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Cell phones')]")
    WebElement verifyCellPhone;



    //-------logout field
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Log out')]")
    WebElement logout;


    public void clickOnComputerMenu() {

        mouseHoverToElement(computerMenu);
        log.info("click on Computer Menu" + computerMenu.toString());
    }

    public String getTitleOfPage() {
        Reporter.log("verify title of the page" + pageTitle.toString());

        return getTextFromElement(pageTitle);

    }

    public void clickOndesktop() {

        mouseHoverToElementAndClick(desktop);
        log.info("click on Desktop" + desktop.toString());
    }

    public String verifyWelcomeStore() {
        Reporter.log("welcome to our store" + welcometext.toString());

        return getTextFromElement(welcometext);
    }

    public void mousehoverToElectronics() {

        mouseHoverToElement(elecTab);
        log.info("on Electronics tab" + elecTab.toString());
    }

    public void clickOnCellPhone() {

 mouseHoverToElementAndClick(cellphoneField);
        log.info("click on Cell Phone" + cellphoneField.toString());
    }

    public String verifyTextCellPhone() {
        Reporter.log("verify text Cell Phone" + verifyCellPhone.toString());

        return getTextFromElement(verifyCellPhone);
    }

    public void clickOnlogoutfield() {

        clickOnElement(logout);
        log.info("click on log out " + logout.toString());
    }


}
