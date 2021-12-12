package cp510.assignments.geo_shape;

import java.text.DecimalFormat;

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
        this.xco = 0;
        this.yco = 0;
    }

    public boolean equals(GeoPoint other, Double epsilon) {
        if (this == other) return true;
        if( other == null) return false;
        return (Math.abs(other.getXco() - getXco()) < epsilon) &&
                (Math.abs(other.getYco() - getYco()) < epsilon);
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

    /**
     * (xco,yco)
     * @return string
     */
    public String toString() {
        DecimalFormat formatter = new DecimalFormat("#.0000");
        return String.format("(%s,%s)" , formatter.format(getXco()), formatter.format(getYco()));
    }

    /**
     * Calculate the distance between 2 points.
     * @param other point
     * @return distance between 2 points.
     */
    public double distance(GeoPoint other) {
        Double distance = Math.pow((other.getXco() - this.getXco()), 2) +  Math.pow((other.getYco() - this.getYco()), 2);
        return Math.sqrt(distance);
    }
}
