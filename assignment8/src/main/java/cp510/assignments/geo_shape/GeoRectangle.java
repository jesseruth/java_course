package cp510.assignments.geo_shape;

import java.awt.*;
import java.awt.geom.Rectangle2D;

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

    /**
     * Create a rectangle.
     * Throws NullPointerException if origin is null.
     *
     * @param origin
     * @param color
     * @throws NullPointerException
     */
    public GeoRectangle(GeoPoint origin, Color color) throws NullPointerException {
        super(origin, color);
    }

    /**
     * Create a rectangle.
     * Throws NullPointerException if origin is null.
     *
     * @param width
     * @param height
     */
    public GeoRectangle(double width, double height) {
        this(DEFAULT_ORIGIN, DEFAULT_COLOR, width, height);
    }

    /**
     * Create a rectangle.
     * Throws NullPointerException if origin is null.
     *
     * @param origin
     * @param width
     * @param height
     * @throws NullPointerException
     */
    public GeoRectangle(GeoPoint origin, double width, double height) throws NullPointerException {
        this(origin, DEFAULT_COLOR, width, height);
    }

    /**
     * Create a rectangle.
     * Throws NullPointerException if origin is null.
     *
     * @param origin
     * @param color
     * @param width
     * @param height
     * @throws NullPointerException
     */
    public GeoRectangle(GeoPoint origin, Color color, double width, double height) throws NullPointerException {
        this(origin, color);
        this.width = width;
        this.height = height;
    }

    /**
     * Returns the rectangle area.
     *
     * @return Double area
     */
    public double area() {
        return width * height;
    }

    /**
     * Rectangle perimeter
     *
     * @return Double perimeter
     */
    public double perimeter() {
        return (2 * getHeight()) + (2 * getWidth());
    }


    /**
     * Validates one GeoShape is a GeoRectangle.
     * @param other GeoShape
     * @param epsilon Double tolerance
     * @return boolean
     */
    public boolean equals(GeoShape other, double epsilon) {
        GeoRectangle geoRectangle = (GeoRectangle) other;
        return super.equals(other, epsilon) &&
                equals(geoRectangle.getHeight(), getHeight(), epsilon) &&
                equals(geoRectangle.getWidth(), getWidth(), epsilon);
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

    /**
     * String representation.
     *
     * @return Rectangle string.
     */
    @Override
    public String toString() {
        return String.format("%s,width=%.4f,height=%.4f", super.toString(), width, height);
    }

    /**
     * Rectangle specific implementation of draw.
     *
     * @param gtx Graphics2D context
     */
    @Override
    public void draw(Graphics2D gtx) {
        Rectangle2D.Double rectangle = new Rectangle2D.Double(
                getOrigin().getXco(),
                getOrigin().getYco(),
                getWidth(),
                getHeight()
        );
        if (getColor() != null) {
            gtx.setColor(getColor());
            gtx.fill(rectangle);
        }
        if (getEdgeColor() != null && getEdgeWidth() > 0) {
            BasicStroke stroke = new BasicStroke((float) getEdgeWidth());
            gtx.setStroke(stroke);
            gtx.setColor(getEdgeColor());
        }
        gtx.draw(rectangle);
        System.out.println("Drawing rectangle: " + this.toString());
    }
}
