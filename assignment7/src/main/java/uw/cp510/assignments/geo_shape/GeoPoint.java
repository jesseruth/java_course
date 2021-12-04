package uw.cp510.assignments.geo_shape;

/**
 * A point that consists of an x-coordinate and a y-coordinate represented as xco and yco
 * respectively.
 *
 * @author Jesse Ruth
 */
public class GeoPoint {
    /**
     * x-coordinate
     */
    private double xco;
    /**
     * y-coordinate
     */
    private double yco;

    /**
     * Create a new GeoPoint.
     */
    public GeoPoint() {
    }

    /**
     * Create a new GeoPoint and provide x and y.
     *
     * @param xco x-coordinate
     * @param yco y-coordinate
     */
    public GeoPoint(double xco, double yco) {
        this.xco = xco;
        this.yco = yco;
    }

    /**
     * Get the x-coordinate.
     *
     * @return x-coordinate
     */
    public double getXco() {
        return xco;
    }

    /**
     * Set the x-coordinate.
     *
     * @param xco x-coordinate
     */
    public void setXco(double xco) {
        this.xco = xco;
    }

    /**
     * Get the y-coordinate.
     *
     * @return y-coordinate
     */
    public double getYco() {
        return yco;
    }

    /**
     * Set the y-coordinate.
     *
     * @param yco y-coordinate
     */
    public void setYco(double yco) {
        this.yco = yco;
    }
}
