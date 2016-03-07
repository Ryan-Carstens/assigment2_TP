package assignment2_TP;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by sanXion on 2016/03/07.
 */
public class numbersTest_Fail {

    @Test
    public void testAddNumbers_FAIL() throws Exception
    {
        int a = 3;
        int b = 5;
        float af = 3.1f;
        float bf = 5.1f;

        int actualInt = Numbers.addInteger(a, b);
        float actualFloat = Numbers.addFloats(a, b);

        //Tests for Integer - EXPECTED FAIL
        Assert.assertEquals(9, actualInt);
        //Tests for Floating Point - EXPECTED FAIL
        Assert.assertEquals(9f, actualFloat, 0.2);

    }
}
