package assignment2_TP;

import junit.framework.Assert;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by student on 2016/03/07.
 */
public class walletTest_Pass {

    @Test
    public void testWalletObject() throws Exception
    {
        Wallet wallet1 = new Wallet(8, 50);
        Wallet wallet2 = new Wallet(8, 50);

        ArrayList wallets =  new ArrayList();
        wallets.add(0, wallet1);
        wallets.add(1, wallet2);
        wallets.add(2, wallets.get(0));

        ArrayList nullifier = wallets;
        nullifier = null;

        //tests for object identity AND tests for Arraylist content
        Assert.assertSame(wallets.get(0), wallets.get(2));
        //tests for object equality
        Assert.assertEquals(wallet1.toString(), wallet2.toString());
        //checks for if NULL
        Assert.assertNull(nullifier);
        //checks for if NOT NULL
        Assert.assertNotNull(wallet1);
    }

}
