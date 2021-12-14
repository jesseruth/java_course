package cp510.assignments.geo_shape;

import java.awt.*;
import java.text.DecimalFormat;

/**
 * Abstract class for all shapes.
 *
 * @author Jesse Ruth
 */
public abstract class GeoShape {
    /**
     * Set to 0,0.
     */
    public static final GeoPoint DEFAULT_ORIGIN = new GeoPoint(0, 0);
    /**
     * Set to Blue.
     */
    public static final Color DEFAULT_COLOR = Color.BLUE;
    /**
     * Edge color defaults to blue
     */
    public static final Color DEFAULT_EDGE_COLOR = Color.BLUE;

    /**
     * Default edge width is 1.
     */
    public static final double DEFAULT_EDGE_WIDTH = 1;

    /**
     * The edge width.
     */
    private double edgeWidth = DEFAULT_EDGE_WIDTH;

    /**
     * The color of the edge.
     */
    private Color edgeColor = DEFAULT_EDGE_COLOR;
    /**
     * Origin of the shape.
     */
    private GeoPoint origin;
    /**
     * Color of the shape.
     */
    private Color color;

    /**
     * Default constructor for all shapes.
     *
     * @param origin Origin of shape. Is required.
     * @param color  Color or shape. Can be null.
     * @throws NullPointerException if origin is null
     */
    public GeoShape(GeoPoint origin, Color color) throws NullPointerException {
        if (origin == null) throw new NullPointerException();
        this.origin = origin;
        this.color = color;
    }

    /**
     * Get the edge width.
     *
     * @return width
     */
    public double getEdgeWidth() {
        return edgeWidth;
    }

    /**
     * Set the edge width.
     *
     * @param edgeWidth
     */
    public void setEdgeWidth(double edgeWidth) {
        this.edgeWidth = edgeWidth;
    }

    /**
     * Get the edge color.
     *
     * @return edge color
     */
    public Color getEdgeColor() {
        return edgeColor;
    }

    /**
     * Set the edge color.
     *
     * @param edgeColor
     */
    public void setEdgeColor(Color edgeColor) {
        this.edgeColor = edgeColor;
    }

    /**
     * Set the edge properties.
     *
     * @param color Color of edge.
     * @param width Width of edge.
     * @return
     */
    public void setEdge(Color color, double width) {
        this.setEdgeColor(color);
        this.setEdgeWidth(width);
    }

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
     * @throws NullPointerException if origin is null.
     */
    public void setOrigin(GeoPoint origin) throws NullPointerException {
        if (origin == null) throw new NullPointerException();
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

    /**
     * A string describing this object.
     * origin=(10.0200,10.0300),color=#ffff00,edgeColor=#ffff00,edgeWidth=2.1000
     *
     * @return String
     */
    public String toString() {
        String color;
        if (this.getColor() == null) {
            color = "null";
        } else {
            String hex = "#" + Integer.toHexString(this.getColor().getRGB()).substring(2);
            color = hex;
        }
        String edgeColor;
        if (this.getEdgeColor() == null) {
            edgeColor = "null";
        } else {
            String hex = "#" + Integer.toHexString(this.getEdgeColor().getRGB()).substring(2);
            edgeColor = hex;
        }

        return String.format("origin=%s,color=%s,edgeColor=%s,edgeWidth=%.4f", this.getOrigin().toString(), color, edgeColor, getEdgeWidth());
    }

    /**
     * Returns true if this shape is equal to a given shape. The two shapes are equal if all of
     * their properties are equal:
     * origin, color, edgeColor, edgeWidth
     *
     * @param shape GeoShape
     * @param epsilon Double tolerance
     * @return boolean true id equal
     */
    public boolean equals(GeoShape shape, double epsilon) {
        if (this == shape) return true;
        return  equals(shape.getEdgeWidth(),getEdgeWidth(), epsilon) &&
                shape.getEdgeColor() == getEdgeColor() &&
                shape.getOrigin().equals(getOrigin()) &&
                shape.getColor() == getColor();
    }

    /**
     * Returns true if two given double values are equal according to the epsilon test.
     * This is mainly a convenience method for use by subclasses.
     * @param num1  The first given value to compare.
     * @param num2  The second given value to compare.
     * @param epsilon  Value to use when comparing doubles.
     * @return  True if the given values are equal according to the epsilon test.
     */
    public boolean equals(double num1, double num2, double epsilon) {
        return (Math.abs(num1 - num2) < epsilon);
    }
}


