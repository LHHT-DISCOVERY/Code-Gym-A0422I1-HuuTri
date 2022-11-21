package Money.bean;

public class Money {
    private double usd ;

    public Money() {
    }

    public Money(double usd) {
        this.usd = usd;
    }

    public double getUsd() {
        return usd;
    }

    public void setUsd(double usd) {
        this.usd = usd;
    }
}
