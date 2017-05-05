package com.ohp.testng;

import org.testng.annotations.Test;


/**
 * Created by Omar on 02/05/2017.
 */
public class TestTimeout {

    @Test(timeOut = 2000)
    public void testThisShouldPass() throws InterruptedException {
        Thread.sleep(1000);
    }

    @Test(timeOut = 2000)
    public void testThisShouldFail() {
        int a=0;
        while (true){
            a++;
        }
    }


}
