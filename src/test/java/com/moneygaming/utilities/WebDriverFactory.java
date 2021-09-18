package com.moneygaming.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverFactory {

    /*
    Task:
    write a static method that takes a string parameter name : browserType
    Based on the value of parameter it will setup the browser and
    the methode will return chromedriver or frifoxdriver object.
    name of the method : getDriver
     */

    public static WebDriver getDriver(String browserType){

        WebDriver driver = null;

        switch (browserType.toLowerCase()){
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver=new ChromeDriver();
                break;

            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver=new FirefoxDriver();
                break;

        }
        driver.manage().window().maximize();
        return driver;
    }



}
