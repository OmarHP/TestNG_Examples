package com.ohp.testng;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;


/**
 * Created by Omar on 02/05/2017.
 */
public class TestGroup {

    @BeforeGroups("database")
    public void setupDB(){
        System.out.println("setupBD()");
    }

    @AfterGroups("database")
    public void cleanDB(){
        System.out.println("cleanDB()");
    }

    @Test(groups="selenium-test")
    public void runSelenium(){
        System.out.println("runSelenium()");
    }

    @Test(groups="selenium-test")
    public void runSelenium1(){
        System.out.println("runSelenium1()");
    }

    @Test(groups="database")
    public void testConnectOracle(){
        System.out.println("testConnectOracle");
    }

    //A test method can belong to multiple groups
    @Test(groups={"mysql", "database"})
    public void testConnectMsSQL(){
        System.out.println("testConnectMsSSQL");
    }

    @Test(dependsOnGroups = {"database","selenium-test"})
    public void runFinal(){
        System.out.println("runFinal()");
    }


}
