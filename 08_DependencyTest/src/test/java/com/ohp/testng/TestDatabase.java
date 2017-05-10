package com.ohp.testng;

import org.testng.annotations.Test;

/**
 * Created by INE on 09/05/2017.
 */
public class TestDatabase {

    //belong to "db" group,
    //Run if all methods from "deploy" group are passed.
    @Test(groups="db", dependsOnGroups = "deploy")
    public void initDB(){
        System.out.println("This is initDB()");
        throw new RuntimeException();
    }

    //belong to "db" group
    //Run if "initDB" method is passed
    @Test(dependsOnMethods = {"initDB"}, groups="db")
    public void testConnection(){
        System.out.println("This is testConnection()");
    }


}