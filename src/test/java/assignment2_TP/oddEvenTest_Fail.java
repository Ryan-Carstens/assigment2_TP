package assignment2_TP;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by sanXion on 2016/03/07.
 */
public class oddEvenTest_Fail {

    @Test
    public void testWalletObject_FAIL() throws Exception
    {
        int number1 = 11;
        int number2 = 12;

        boolean actual1 = OddEven.evenNum(number1);
        boolean actual2 = OddEven.evenNum(number2);

        //Tests for true - EXPECTED FAIL
        Assert.assertTrue(actual1);
        //Tests for false - EXPECTED FAIL
        Assert.assertFalse(actual2);
    }
}
