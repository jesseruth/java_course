package uw.cp510.lectures.lecture6;

public class MutualFund extends ShareAsset implements Asset {
    private double totalShares;

    public MutualFund(String symbol, double currentPrice) {
        super(symbol, currentPrice);
        totalShares = 0.0;
    }

    @Override
    public double getMarketValue() {
        return getTotalShares() * getCurrentPrice();
    }

    public double getTotalShares() {
        return totalShares;
    }

    public void setTotalShares(double totalShares) {
        this.totalShares = totalShares;
    }
}
