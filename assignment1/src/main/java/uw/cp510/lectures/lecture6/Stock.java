package uw.cp510.lectures.lecture6;

public class Stock extends ShareAsset {
    private int totalShares;

    public Stock(String symbol, double currentPrice) {
        super(symbol, currentPrice);
        totalShares = 0;
    }

    @Override
    public double getMarketValue() {
        return getTotalShares() * getCurrentPrice();
    }

    public int getTotalShares() {
        return totalShares;
    }

    public void setTotalShares(int totalShares) {
        this.totalShares = totalShares;
    }

}

