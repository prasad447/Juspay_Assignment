package com.payment.Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {

    protected WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();   
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/payment-gateway/index.php "); 
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
