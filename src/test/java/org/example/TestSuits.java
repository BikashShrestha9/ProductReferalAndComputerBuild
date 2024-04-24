package org.example;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestSuits extends BaseTest{
    HomePage homePage= new HomePage();
    RegisterPage registerPage= new RegisterPage();
    RegistrationVerifyPage resultVerifyPage= new RegistrationVerifyPage();
    LogInPage logInPage= new LogInPage();
    BuildYourComputer buildYourComputer=new BuildYourComputer();
    ShoppingCartVerificationPage shoppingCartVerificationPage= new ShoppingCartVerificationPage();

    @Test
    //open the registration page
    public void verifyUserShouldAbleToRegisterSuccessfully(){
        //click on register button
        homePage.clickOnRegister();
        //passing registration details
        registerPage.enterRegistrationDetails();
        // click on register button after the passing the register details
        clickOnElement(By.id("register-button"));
        //verifying users registered successfully
        resultVerifyPage.verifySuccessfulRegistration();

    }
    @Test
    public void verifyRegisteredUserShouldBeAbleToBuildComp(){
        //click on register button
        homePage.clickOnRegister();
        //passing registration details
        registerPage.enterRegistrationDetails();
        // click on register button after the passing the register details
        clickOnElement(By.id("register-button"));
        //verifying users registered successfully
        resultVerifyPage.verifySuccessfulRegistration();

        //logging back with register credentials from the login page
        logInPage.login();
        // navigating to the build your own computer page
        homePage.clickBuildYourComputer();
        //selecting parts for the computer
        buildYourComputer.selectComputerParts();
        // verifying that item added in the shopping cart
        shoppingCartVerificationPage.verifyShoppingItem();


    }

}
