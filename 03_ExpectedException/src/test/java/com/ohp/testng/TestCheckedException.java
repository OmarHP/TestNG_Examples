package com.ohp.testng;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Created by Omar on 03/05/2017.
 */
public class TestCheckedException {

    OrderBo orderBO;
    Order data;

    @BeforeTest
    void setup() {
        orderBO = new OrderBo();

        data= new Order();
        data.setId(1);
        data.setCreatedBy("ohp");
    }

    @Test(expectedExceptions = OrderSaveException.class)
    public void throwIfOrderIsNull() throws OrderSaveException{
        orderBO.save(null);
    }

    /*
     * Test is success if either of the exceptions is thrown
     */
    @Test(expectedExceptions = {OrderUpdateException.class, OrderNotFoundException.class})
    public void throwIfOrderIsNotExist()throws OrderUpdateException, OrderNotFoundException{
        orderBO.update(data);
    }

}
