package uw.cp510.assignments.geo_shape;

import java.awt.*;

/**
 * Abstract class for all shapes.
 *
 * @author Jesse Ruth
 */
public abstract class GeoShape {
    /**
     * Origin of the shape.
     */
    private GeoPoint origin = new GeoPoint(0, 0);
    /**
     * Color of the shape.
     */
    private Color color = null;

    /**
     * Draws a shape.
     *
     * @param gtx Graphics2D context
     */
    public abstract void draw(Graphics2D gtx);

    /**
     * Get the shape's origin.
     *
     * @return GeoPoint Origin of shape
     */
    public GeoPoint getOrigin() {
        return origin;
    }

    /**
     * Set the shape's origin.
     *
     * @param origin GeoPoint origin of shape.
     * @throws NullPointerException
     */
    public void setOrigin(GeoPoint origin) throws NullPointerException {
        this.origin = origin;
    }

    /**
     * Get the current shape color.
     *
     * @return Color Shape color
     */
    public Color getColor() {
        return color;
    }

    /**
     * Update the shape color.
     *
     * @param color Shape color
     */
    public void setColor(Color color) {
        this.color = color;
    }
}
