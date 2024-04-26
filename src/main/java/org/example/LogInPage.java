package org.example;

import org.openqa.selenium.By;

public class LogInPage extends Utils{
    public void login(){
        clickOnElement(By.xpath("//a[@class='ico-login']"));
        typeIn(By.id("Email"), email);
        typeIn(By.id("Password"), password);
        clickOnElement(By.xpath("//button[@class ='button-1 login-button']"));
    }
}
