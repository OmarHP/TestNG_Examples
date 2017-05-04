package com.ohp.testng;

import org.testng.annotations.Test;

/**
 * Created by Omar on 03/05/2017.
 */
public class TestRuntime {

    @Test(expectedExceptions = ArithmeticException.class)
    public void divisionWithException(){
        int i= 1/0;
    }
}
