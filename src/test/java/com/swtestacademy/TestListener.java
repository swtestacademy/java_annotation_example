package com.swtestacademy;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.lang.annotation.Annotation;


public class TestListener extends BaseTest implements ITestListener {



    @Override
    public void onTestStart(ITestResult iTestResult) {

    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {

    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {
        Annotation testInfoAnnotation = getAnnotation(iTestResult,TestInfo.class);

        TestInfo.Risk risk;
        if (testInfoAnnotation != null) {
            TestInfo testInfo = (TestInfo) testInfoAnnotation;
            risk = testInfo.risk();
            if(risk == TestInfo.Risk.HIGH)
                countHigh++;
            else if(risk == TestInfo.Risk.MEDIUM)
                countMedium++;
            else if(risk == TestInfo.Risk.LOW)
                countLow++;

        }

    }

    private Annotation getAnnotation(ITestResult iTestResult,Class T){
        return iTestResult.getMethod().getConstructorOrMethod().getMethod().getAnnotation(T);
    }


    @Override
    public void onTestSkipped(ITestResult iTestResult) {

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    @Override
    public void onStart(ITestContext iTestContext) {

    }

    @Override
    public void onFinish(ITestContext iTestContext) {

    }



}