package org.example;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestSuits extends BaseTest{
    HomePage homePage= new HomePage();
    RegisterPage registerPage= new RegisterPage();
    RegistrationVerifyPage resultVerifyPage= new RegistrationVerifyPage();
    @Test
    //open the registration page
    public void verifyUserShouldAbleToRegisterSuccessfully(){
        homePage.clickOnRegister();
        registerPage.enterRegistrationDetails();
        clickOnElement(By.id("register-button"));
        resultVerifyPage.verifySuccessfulRegistration();

    }

    public void verifyRegisteredUserShouldLogin(){

    }
    public void verifyRegisterUserShouldReferAProduct(){

    }
}
