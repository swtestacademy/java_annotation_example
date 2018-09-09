package com.swtestacademy;

import org.testng.Assert;
import org.testng.annotations.Test;

@Module(module = "payment")
public class PaymentTests {

    @Test
    @TestInfo(risk=TestInfo.Risk.HIGH)
    public void visaPayment(){

        Assert.assertTrue(true);
    }
    @Test
    @TestInfo(risk=TestInfo.Risk.HIGH)
    public void masterCardPayment(){
        Assert.assertTrue(false);
    }


    @Test
    @TestInfo(risk=TestInfo.Risk.MEDIUM)
    public void debitPayment(){
        Assert.assertTrue(false);
    }


    @Test
    @TestInfo(risk=TestInfo.Risk.LOW)
    public void dinnersClubPayment(){
        Assert.assertTrue(true);
    }


}
