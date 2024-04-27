package org.example;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.Select;
import java.io.File;
import java.io.IOException;
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
        //LocalDateTime localDateTime= LocalDateTime.from(LocalTime.now());
        DateFormat dateFormat = new SimpleDateFormat("yyyyddmmhhmmss");
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
    public void screenShot(String filename){
        //Convert web driver object to TakeScreenshot
        TakesScreenshot scrShot =((TakesScreenshot)driver);
        //Call getScreenshotAs method to create image file
        File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
        //Move image file to new destination
       // File DestFile=new File("src\\Screenshots\\"+filename+random()+".png");
        //Copy file at destination
        try {
            FileUtils.copyFile(SrcFile, new File("src/ScreenShot/"+filename+random()+".png"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }



}
