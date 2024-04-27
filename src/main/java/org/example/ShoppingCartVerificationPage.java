package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class ShoppingCartVerificationPage extends Utils {

    //storing expected message in the local variable
    String expectedMsg= "Build your own computerABC";
    public void verifyShoppingItem(){
        //checking expected message with actual message
        Assert.assertEquals(getTxtFromElement(By.className("product-name")), expectedMsg, "Message did not match therefore test failed");

    }
}
