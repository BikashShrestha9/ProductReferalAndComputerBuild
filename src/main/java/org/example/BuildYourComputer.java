package org.example;

import org.openqa.selenium.By;

public class BuildYourComputer extends Utils {
    public void selectComputerParts(){
        //selecting processor for the computer
        selectByValue(By.id("product_attribute_1"), "2");
        //selecting RAM for the computer
        selectByValue(By.id("product_attribute_2"), "4");
        //selecting HDD for the computer
        clickOnElement(By.id("product_attribute_3_7"));
        //selecting OS for the computer
        clickOnElement(By.id("product_attribute_4_9"));
        //deselecting first item
        clickOnElement(By.id("product_attribute_5_10"));
        //selecting software for the computer
        clickOnElement(By.id("product_attribute_5_11"));

        //adding to the cart
        clickOnElement(By.id("add-to-cart-button-1"));
        //navigating to the cart page
        clickOnElement(By.className(("cart-label")));

    }
}
