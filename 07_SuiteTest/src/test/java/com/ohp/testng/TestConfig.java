package com.ohp.testng;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

/**
 * Created by Omar on 08/05/2017.
 */
public class TestConfig {
    @BeforeSuite
    public void testBeforeSuite(){
        System.out.println("testBeforeSuite()");
    }

    @AfterSuite
    public void testAfterSuite(){
        System.out.println("testAfterSuite()");
    }

    @BeforeTest
    public void testBeforeTest(){
        System.out.println("testBeforeTest()");
    }

    @AfterTest
    public void testAfterTest(){
        System.out.println("testAfterTest()");
    }
}
