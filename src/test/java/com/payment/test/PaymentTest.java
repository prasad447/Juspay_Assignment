package com.payment.test;

import org.testng.annotations.Test;

import com.payment.Base.BaseClass;
import com.payment.pages.HomePage;
import com.payment.pages.PaymentPage;

public class PaymentTest extends BaseClass {

    @Test
    public void paymentTest() {
        
        HomePage home = new HomePage(driver);
        PaymentPage payment = new PaymentPage(driver);

        home.selectQuantity("2");
        home.clickBuyNow();

        payment.enterCardDetails("4567434567654354", "12", "2025", "123");
        payment.clickPay();

        System.out.println("Reached Confirmation/OTP Page: " + driver.getTitle());
    }
}
