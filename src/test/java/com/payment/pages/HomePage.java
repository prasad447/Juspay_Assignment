package com.payment.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
  private WebDriver driver;

  private  By quantityDropdown = By.name("quantity");
  private  By buyButton = By.xpath("//input[@value='Buy Now']");


    public HomePage(WebDriver driver) {
        this.driver = driver; 
    }

    public void selectQuantity(String qty) {
        driver.findElement(quantityDropdown).sendKeys(qty);
    }

    public void clickBuyNow() {
        driver.findElement(buyButton).click();
    }
}
