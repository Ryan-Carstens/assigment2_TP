package assignment2_TP;

/**
 * Created by student on 2016/03/07.
 */
public class Wallet {
    private int rands;
    private int cents;

    public Wallet()
    {

    }

    public Wallet(int rands, int cents)
    {
        this.rands = rands;
        this.cents = cents;
    }

    public int getRands() {
        return rands;
    }

    public void setRands(int rands) {
        this.rands = rands;
    }

    public int getCents() {
        return cents;
    }

    public void setCents(int cents) {
        this.cents = cents;
    }

    @Override
    public String toString() {
        return "Wallet{" +
                "rands=" + rands +
                ", cents=" + cents +
                '}';
    }
}
