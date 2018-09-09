package com.swtestacademy;

import org.testng.annotations.AfterSuite;

public class BaseTest {

    static int countHigh = 0;
    static int countMedium = 0;
    static int countLow = 0;


    @AfterSuite
    public void afterSuite(){
        System.out.println("Failed count of High Priority Test Cases " + countHigh);
        System.out.println("Failed count of Medium Priority Test Cases " + countMedium);
        System.out.println("Failed count of Low Priority Test Cases " + countLow);
    }

}
