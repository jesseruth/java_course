package uw.cp510.lectures.lecture6;

public class Cash implements Asset {
    private double amount;

    public Cash(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public double getMarketValue()
    {
        return getAmount();
    }

    @Override
    public double getProfit() {
        return 0.0;
    }
}
