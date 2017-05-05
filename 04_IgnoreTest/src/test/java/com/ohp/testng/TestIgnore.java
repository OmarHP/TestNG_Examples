package com.ohp.testng;

import org.testng.Assert;
import org.testng.annotations.Test;


/**
 * Created by Omar on 02/05/2017.
 */
public class TestIgnore {

    @Test //default enable=true
    public void test1(){
        Assert.assertEquals(true, true);
    }

    @Test(enabled = true)
    public void test2(){
        Assert.assertEquals(true, true);
    }

    @Test(enabled = false)
    public void test3(){
        Assert.assertEquals(true, true);
    }

}
