package com.ohp.testng;

import org.testng.Assert;
import org.testng.annotations.Test;


/**
 * Created by INE on 02/05/2017.
 */
public class TestHelloWorld {

    @Test
    public void testEmailGenerator(){
        RandomEmailGenerator obj = new RandomEmailGenerator();
        String email = obj.generate();
        Assert.assertNotNull(email);
        Assert.assertEquals(email, "feedback@yoursite.com");
        System.out.println("@Test - testEmailGenerator");
    }

}
