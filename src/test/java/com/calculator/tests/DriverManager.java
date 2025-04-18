package com.calculator.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class DriverManager {

    private static DriverManager instance= null;
    private WebDriver driver;

    private  DriverManager(){
        String browser = System.getProperty("browser", "chrome");

        if(browser.equalsIgnoreCase("chrome")){
            WebDriverManager.chromedriver().setup();
            driver=new ChromeDriver();
        } else if(browser.equalsIgnoreCase("firefox")) {
            WebDriverManager.chromedriver().setup();
            driver = new FirefoxDriver();
        } else {
            System.out.print("Please enter right browser name");
        }

        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    public static DriverManager getInstance(){
        if(instance==null){
            synchronized (DriverManager.class){
                if(instance==null){
                    instance=new DriverManager();
                }
            }
        }
        return instance;
    }

    public WebDriver getDriver(){
        return driver;
    }

    public void quiteDriver(){
        if(driver!=null){
            driver.quit();
            driver=null;
            instance=null;
        }
    }
}
