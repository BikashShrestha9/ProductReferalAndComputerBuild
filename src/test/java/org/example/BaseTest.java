package org.example;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends Utils{
    BrowserManagerPage browserManager= new BrowserManagerPage();

    @BeforeMethod
    public void setup(){
        browserManager.openBrowser();
    }
    @AfterMethod
    public void tearDown(){
        browserManager.closeBrowser();
    }
}
