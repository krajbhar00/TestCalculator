package com.calculator.tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseTest {
    protected String baseUrl;
    protected  DriverManager driverManager;

    @Parameters({"baseUrl"})
    @BeforeClass
    public void setUp(String url){
        baseUrl = url;
        System.out.println("Launching browser with URL: " + baseUrl);
        driverManager = DriverManager.getInstance();
        driverManager.getDriver().get(baseUrl);
    }

    @AfterClass
    public void tearDown(){
        System.out.println("Closing the browser");
        if (driverManager != null) {
            driverManager.quiteDriver(); // fixed typo
        }
    }
}
