package org.example;

import org.openqa.selenium.By;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Utils extends BasePage {
    public static void clickOnElement(By by){
        driver.findElement(by).click();
    }
    public static void typeIn(By by, String txt){
        driver.findElement(by).sendKeys(txt);
    }
    public static String getTxtFromElement(By by){
        return driver.findElement(by).getText();

    }
    public static String random(){
        DateFormat dateFormat = new SimpleDateFormat("yyyyddmmhhms");
        Date date = new Date();
        return dateFormat.format(date);
    }

}
