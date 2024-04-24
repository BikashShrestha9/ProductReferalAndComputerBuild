package org.example;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BrowserManagerPage extends Utils {
    public void openBrowser (){
        driver=new ChromeDriver();
        //clickOnElement(By.linkText("Register"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://demo.nopcommerce.com");
    }

    public void closeBrowser(){
        //driver.quit();

    }

}
