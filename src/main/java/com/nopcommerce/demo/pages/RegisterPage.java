package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class RegisterPage extends Utility {
    private static final Logger log = LogManager.getLogger(RegisterPage.class.getName());
   //---------registration testcases for register form-----------
   // --------for cellphone product test -------------
   //filled all mendotary field
    @CacheLookup
    @FindBy(id = "FirstName")
    WebElement firstName;
    @CacheLookup
    @FindBy(id = "LastName")
    WebElement lastName;
    @CacheLookup
    @FindBy(id = "Email")
    WebElement emailField;
    @CacheLookup
    @FindBy(id = "Password")
    WebElement password;
    @CacheLookup
    @FindBy(xpath="//input[@id='ConfirmPassword']")
    WebElement confirmPassword;



    public void enterFirstName(String text){

        sendTextToElement(firstName, text);
        log.info("first name " + text + firstName.toString());
    }


    public void enterLastName(String text){

        sendTextToElement(lastName,text);
        log.info("Last name " + text + lastName.toString());

    }
    public void enterEmail(String text){

        sendTextToElement(emailField,text + getRandomString(2)+ "@gmail.com");
        log.info("Email is " + text + emailField.toString());
    }

    public void enterPasswordField(String text){

        sendTextToElement(password,text);
        log.info("Password is  " + text + password.toString());
    }
    public void enterConfirmpasswordField (String text){

        sendTextToElement(confirmPassword,text);
        log.info("Confirm password is  " + text + confirmPassword.toString());
    }
    //click on register
    @CacheLookup
    @FindBy(xpath="//button[@id='register-button']")
    WebElement register;

    public void clickOnRegeisterButton(){
        log.info("click on Register " + register.toString());
        mouseHoverToElementAndClick(register);


    }
    //2.22 Verify the message “Your registration completed”
    @CacheLookup
    @FindBy(xpath="//div[contains(text(),'Your registration completed')]")
    WebElement verifyRegisterText;

    public String verifyYourRegCompleted(){
        log.info("Your registration completed " + verifyRegisterText.toString());

        return getTextFromElement(verifyRegisterText);

    }
    //2.23 Click on “CONTINUE” tab
    @CacheLookup
    @FindBy(xpath="//a[contains(text(),'Continue')]")
    WebElement clickContinue;

    public void clickOnContinuetab(){

        mouseHoverToElementAndClick(clickContinue);
        log.info("click on continue " + clickContinue.toString());
    }
}
