package com.ohp.testng;

import org.testng.annotations.*;

/**
 * Created by INE on 02/05/2017.
 */
public class DBConfig {

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("@BeforeSuite");
    }

    @AfterSuite()
    public void afterSuite(){
        System.out.println("@AfterSuite");
    }

    @BeforeTest()
    public void beforeTest(){
        System.out.println("@BeforeTest");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("@AfterTest");
    }

}
