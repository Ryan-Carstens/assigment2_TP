package assignment2_TP;

import junit.framework.Assert;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by sanXion on 2016/03/07.
 */
public class oddEvenTest_Pass {

    @Test
    public void testWalletObject() throws Exception
    {
        int number1 = 864;
        int number2 = 865;

        boolean actual1 = OddEven.evenNum(864);
        boolean actual2 = OddEven.evenNum(865);

        //Tests for true
        Assert.assertTrue(actual1);
        //Tests for false
        Assert.assertFalse(actual2);
    }


}
