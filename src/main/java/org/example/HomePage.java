package org.example;

import org.openqa.selenium.By;

public class HomePage extends Utils {
    public void clickOnRegister(){
        clickOnElement(By.linkText("Register"));

    }
}
