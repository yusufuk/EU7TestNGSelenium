package com.cybertek.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.opera.OperaDriver;

import java.util.Locale;

public class WebDriverFactory {
    public static WebDriver getDriver (String browserType){
        WebDriver driver = null;

        // Chrome, CHROME, ChrOme
        switch (browserType.toLowerCase()){
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver= new ChromeDriver();
                break;
            case "opera":
                WebDriverManager.operadriver().setup();
                driver= new OperaDriver();
                break;
        }

        return driver;
    }
}