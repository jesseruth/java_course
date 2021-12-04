package uw.cp510.assignments.geo_shape;

import java.awt.*;

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
     * Rectangle specific implementation of draw.
     *
     * @param gtx Graphics2D context
     */
    @Override
    public void draw(Graphics2D gtx) {
        System.out.println("Drawing rectangle");
    }
}
