package com.ohp.testng;

import org.testng.annotations.Test;

/**
 * Created by Omar on 08/05/2017.
 */
public class TestDatabase {

    @Test(groups="db")
    public void testConnectOracle(){
        System.out.println("testConnectOracle()");
    }

    @Test(groups="db")
    public void testConnectMsSQL(){
        System.out.println("testConnectMsSQL()");
    }

    @Test(groups="db-nosql")
    public void testConnectMongoDB(){
        System.out.println("testConnectMongoDB()");
    }

    @Test(groups={"db", "brokenTests"})
    public void testConnectMySQL(){
        System.out.println("testConnectMySQL()");
    }
}
