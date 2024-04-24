package org.example;
import org.testng.Assert;
import org.openqa.selenium.By;

public class RegistrationVerifyPage extends Utils {
    //expected message storing in the variable
    String expectedMsg="Your registration completed";

    public void verifySuccessfulRegistration(){
        //actual message storing in the local variable
        String actualMsg=getTxtFromElement(By.xpath("//div[@class='result']"));
        //comparing expected and actual message
        Assert.assertEquals(expectedMsg,actualMsg, "You are not Register successfully");
    }


}
