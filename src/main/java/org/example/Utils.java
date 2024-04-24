package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Utils extends BasePage {
    String email = "abc"+random()+"@gmail.com";
    String password="Test123";
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
    public static void selectByVisibleText(By by, String txt){
        Select select = new Select(driver.findElement(by));
        select.selectByVisibleText(txt);
    }

    public static void selectByValue(By by, String txt){
        Select select = new Select(driver.findElement(by));
        select.selectByValue(txt);

    }



}
