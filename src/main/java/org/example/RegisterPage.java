package org.example;

import org.openqa.selenium.By;

public class RegisterPage extends Utils {
    public void enterRegistrationDetails(){
        clickOnElement(By.className("ico-register"));
        typeIn(By.id("FirstName"), "abcde");
        typeIn(By.id("LastName"), "zef)");
        typeIn(By.id("Email"),"abc"+random()+"@gmail.com");
        typeIn(By.id("Password"), "Test123" );
        typeIn(By.id("ConfirmPassword"), "Test123");
    }
}
