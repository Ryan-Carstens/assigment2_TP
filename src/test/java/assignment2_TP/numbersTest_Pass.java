package assignment2_TP;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by student on 2016/03/07.
 */
public class numbersTest_Pass {

    @Test
    public void testAddNumbers() throws Exception
    {
        int a = 3;
        int b = 5;
        float af = 3.1f;
        float bf = 5.1f;

        int actualInt = Numbers.addInteger(a, b);
        float actualFloat = Numbers.addFloats(a, b);

        //Tests for Integer
        Assert.assertEquals(8, actualInt);
        //Tests for Floating Point
        Assert.assertEquals(8f, actualFloat, 0.2);

    }

}
