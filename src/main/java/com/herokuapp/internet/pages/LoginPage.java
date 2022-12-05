package com.herokuapp.internet.pages;

import com.herokuapp.internet.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {
    By emailField = By.id("username");
    By passwordField = By.id("password");
    By loginField = By.xpath("//i[contains(text(),'Login')]");
     By verifyText = By.xpath("//h4[@class='subheader']");
     By errorText = By.xpath("//div[contains(text(),'Your username is invalid!')]");
     By errorPassword = By.xpath("//div[contains(text(),'Your password is invalid!')]");
    public void enterUserName(String name){
        sendTextToElement(emailField,name);
    }
    public void enterPassword(String password){
        sendTextToElement(passwordField,password);
    }
    public void clickOnLogin(){
        clickOnElement(loginField);
    }
    public String getTextToVerify(){
        return getTextFromElement(verifyText);
    }
    public String getErrorMessage(){
        return getTextFromElement(errorText);
    }
    public String getErrorPasswordMessage(){
        return getTextFromElement(errorPassword);
    }
}
