package com.ohp.testng;

import org.testng.annotations.Test;

/**
 * Created by INE on 02/05/2017.
 */
public class TestDBConnection {

    @Test
    public void runOtherTest1(){
        System.out.println("@Test - runOtherTest1");
    }

    @Test()
    public void runOtherTest2(){
        System.out.println("@Test - runOtherTest2");
    }
}
