package com.herokuapp.internet.testsuite;

import com.herokuapp.internet.pages.LoginPage;
import com.herokuapp.internet.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    LoginPage loginPage = new LoginPage();
    @Test
    public void UserShouldLoginSuccessfullyWithValidCredentials(){
        loginPage.enterUserName("tomsmith");
        loginPage.enterPassword("SuperSecretPassword!");
        loginPage.clickOnLogin();
        Assert.assertEquals(loginPage.getTextToVerify(),"Welcome to the Secure Area. When you are done click logout below.","not verify");
    }
    @Test
    public void verifyTheUsernameErrorMessage(){
        loginPage.enterUserName("tomsmith1");
        loginPage.enterPassword("SuperSecretPassword!");
        loginPage.clickOnLogin();
        Assert.assertEquals(loginPage.getErrorMessage(),"Your username is invalid!\n" +
                "×","not verify");

    }
    @Test
    public void verifyThePasswordErrorMessage(){
        loginPage.enterUserName("tomsmith");
        loginPage.enterPassword("SuperSecretPassword");
        loginPage.clickOnLogin();
        Assert.assertEquals(loginPage.getErrorPasswordMessage(),"Your password is invalid!\n" +
                "×","not verify");

    }

}
