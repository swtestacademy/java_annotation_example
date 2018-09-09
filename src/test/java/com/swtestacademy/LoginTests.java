package com.swtestacademy;

import org.testng.Assert;
import org.testng.annotations.Test;

@Module(module = "login")
public class LoginTests extends BaseTest {


    @Test
    @TestInfo(risk=TestInfo.Risk.HIGH)
    public void validLogin(){

        Assert.assertTrue(true);
    }
    @Test
    @TestInfo(risk=TestInfo.Risk.HIGH)
    public void invalidLoginWithEmptyUserName(){
        Assert.assertTrue(false);
    }
    @Test
    @TestInfo(risk=TestInfo.Risk.HIGH)
    public void invalidLoginWithEmptyPassword(){
        Assert.assertTrue(false);
    }
    @Test
    @TestInfo(risk=TestInfo.Risk.MEDIUM)
    public void invalidLoginWithFieldEmpty(){
        Assert.assertTrue(true);
    }


}
