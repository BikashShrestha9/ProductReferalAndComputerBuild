package org.example;

import org.openqa.selenium.By;

public class BuildYourOwnComputerPage extends Utils {
    public void clickBuildYourComputer(){

        clickOnElement(By.xpath("//div[@class='product-grid home-page-product-grid']/div[2]/div[1]//div[2]/div[3]/div[2]//button[@class='button-2 product-box-add-to-cart-button']"));
        //clickOnElement(RelativeLocator.with(By.className("product-grid home-page-product-grid")).below(k));
    }
}
