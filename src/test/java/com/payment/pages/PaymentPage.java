package com.payment.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PaymentPage {
  private  WebDriver driver;

  private   By cardNumber = By.name("card_nmuber");
  private   By month = By.name("month");
  private   By year = By.name("year");
  private   By cvv = By.name("cvv_code");
  private   By payButton = By.name("submit");


    public PaymentPage(WebDriver driver) {
        this.driver = driver; 
    }

    public void enterCardDetails(String number, String monthValue, String yearValue, String cvvValue) {
        driver.findElement(cardNumber).sendKeys(number);
        driver.findElement(month).sendKeys(monthValue);
        driver.findElement(year).sendKeys(yearValue);
        driver.findElement(cvv).sendKeys(cvvValue);
    }

    public void clickPay() {
        driver.findElement(payButton).click();
    }
}
