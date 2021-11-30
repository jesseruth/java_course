package uw.cp510.assignments.geo_shape;

public class GeoPoint {
    private double xco;
    private double yco;

    public GeoPoint() {
    }

    public GeoPoint(double xco, double yco) {
        this.xco = xco;
        this.yco = yco;
    }

    public double getXco() {
        return xco;
    }

    public void setXco(double xco) {
        this.xco = xco;
    }

    public double getYco() {
        return yco;
    }

    public void setYco(double yco) {
        this.yco = yco;
    }
}
