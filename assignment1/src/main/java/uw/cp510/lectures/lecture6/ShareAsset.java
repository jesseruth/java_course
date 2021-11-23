package uw.cp510.lectures.lecture6;

public abstract class ShareAsset implements Asset {
    private double totalCost;
    private double currentPrice;
    private String symbol;

    public ShareAsset(String symbol, double currentPrice) {
        this.symbol =symbol;
        this.currentPrice = currentPrice;
        totalCost = 0.0;
    }

    @Override
    public abstract double getMarketValue();

    @Override
    public double getProfit() {
        return getMarketValue() - getTotalCost();
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }
}
