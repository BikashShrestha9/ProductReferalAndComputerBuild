package org.example;

import org.openqa.selenium.By;

public class HomePage extends Utils {
    public void clickOnRegister(){
        clickOnElement(By.linkText("Register"));

    }
    public void clickBuildYourComputer(){
        clickOnElement(By.xpath("//button[@class='button-2 product-box-add-to-cart-button']"));
    }
}
