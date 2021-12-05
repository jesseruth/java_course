package cp510.assignments.geo_shape;

import java.awt.*;
import java.text.DecimalFormat;

/**
 * GeoRectangle extend GeoShape and adds height and width properties.
 *
 * @author Jesse Ruth
 */
public class GeoRectangle extends GeoShape {
    /**
     * Height.
     */
    private double height;
    /**
     * Width of rectangle.
     */
    private double width;

    public GeoRectangle(GeoPoint origin, Color color) throws NullPointerException {
        super(origin, color);
    }

    public GeoRectangle( double width, double height ) {
        this(DEFAULT_ORIGIN, DEFAULT_COLOR, width, height);
    }

    public GeoRectangle( GeoPoint origin, double width, double height ) throws NullPointerException {
        this(origin, DEFAULT_COLOR, width, height);
    }

    public GeoRectangle( GeoPoint origin, Color color, double width, double height ) throws NullPointerException {
        this(origin, color);
        this.width = width;
        this.height = height;
    }

    /**
     * Returns the rectangle area.
     * @return Double area
     */
    public double area() {
        return width * height;
    }

    /**
     * Rectangle perimeter
     * @return Double perimeter
     */
    public double perimeter() {
        return (2 * getHeight()) + (2 * getWidth());
    }


    /**
     * Rectangle height.
     *
     * @return height
     */
    public double getHeight() {
        return height;
    }

    /**
     * Update rectangle height.
     *
     * @param height Height
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * Get width.
     *
     * @return width
     */
    public double getWidth() {
        return width;
    }

    /**
     * Update rectangle width.
     *
     * @param width Width
     */
    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public String toString() {
        DecimalFormat formatter = new DecimalFormat("#.0000");
        return String.format("%s,width=%s,height=%s",super.toString(), formatter.format(width), formatter.format(height));
    }

    /**
     * Rectangle specific implementation of draw.
     *
     * @param gtx Graphics2D context
     */
    @Override
    public void draw(Graphics2D gtx) {
        System.out.println("Drawing rectangle: " + this.toString());
    }
}
