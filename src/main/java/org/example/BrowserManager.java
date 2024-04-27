package org.example;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.util.concurrent.TimeUnit;

public class BrowserManager extends Utils {
    LoadProp loadProp= new LoadProp();
    String browser= "chrome";
    //String browser = System.getProperty("browser");
    public void openBrowser (){
        //driver=new ChromeDriver();
        if(browser.equalsIgnoreCase("Chrome")){
            System.out.println("Your browser is Chrome");
            driver=new ChromeDriver();
        }
        else if(browser.equalsIgnoreCase("Safari")){
            System.out.println("Your browser is Safari");
            driver= new SafariDriver();
        }
        if(browser.equalsIgnoreCase("Firefox")){
            System.out.println("Your browser is Firefox");
            driver=new FirefoxDriver();
        }
        else{
            System.out.println("Your browser is wrong"+browser);
        }
        //clickOnElement(By.linkText("Register"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get(loadProp.getProperty("url"));
    }

    public void closeBrowser(){
        //add takeScreenshot method here

            driver.quit();

    }

}
