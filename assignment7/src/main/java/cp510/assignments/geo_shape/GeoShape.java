package cp510.assignments.geo_shape;

import java.awt.*;

/**
 * Abstract class for all shapes.
 *
 * @author Jesse Ruth
 */
public abstract class GeoShape {
    public static final GeoPoint DEFAULT_ORIGIN = new GeoPoint(0, 0);
    public static final Color DEFAULT_COLOR = Color.BLUE;

    /**
     * Origin of the shape.
     */
    private GeoPoint origin = new GeoPoint(0, 0);
    /**
     * Color of the shape.
     */
    private Color color = null;

    /**
     * Default constructor for all shapes.
     * @param origin Origin of shape. Is required.
     * @param color Color or shape. Can be null.
     * @throws NullPointerException if origin is null
     */
    public GeoShape( GeoPoint origin, Color color ) throws NullPointerException {
        if (origin == null) throw new NullPointerException();
        this.origin = origin;
        this.color = color;
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
     * origin=(xco,yco),color=#cccccc
     * @return String
     */
    public String toString() {
        String color;
        if (this.getColor() == null) {
            color = "null";
        } else {
            String hex = "#"+Integer.toHexString(this.getColor().getRGB()).substring(2);
            color = hex;
        }

        return String.format("origin=%s,color=%s", this.getOrigin().toString(), color);
    }
}
