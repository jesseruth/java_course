package cp510.assignments.geo_shape;


import java.awt.*;

/**
 * Oval implementation of the GeoRectangle.
 *
 * @author Jesse Ruth
 */
public class GeoOval extends GeoRectangle {

    /**
     * Create a GeoOval. Throws NullPointerException if origin is null.
     * Color can be null.
     * @param origin
     * @param color
     * @throws NullPointerException
     */
    public GeoOval(GeoPoint origin, Color color) throws NullPointerException {
        super(origin, color);
    }

    /**
     * Create a GeoOval. Throws NullPointerException if origin is null.
     * This constructor sets default origin and color properties.
     * @param width
     * @param height
     */
    public GeoOval( double width, double height ) {
        this( DEFAULT_ORIGIN, DEFAULT_COLOR, width, height );
    }

    /**
     * Create a GeoOval. Throws NullPointerException if origin is null.
     * Color can be null.
     * @param origin
     * @param width
     * @param height
     * @throws NullPointerException
     */
    public GeoOval( GeoPoint origin, double width, double height ) throws NullPointerException {
        this( origin, DEFAULT_COLOR, width, height );
    }

    /**
     * Create a GeoOval. Throws NullPointerException if origin is null.
     * Color can be null.
     * @param origin
     * @param color
     * @param width
     * @param height
     * @throws NullPointerException
     */
    public GeoOval( GeoPoint origin, Color color, double width, double height ) throws NullPointerException {
        super(origin, color, width, height);
    }

    /**
     * Draw an oval.
     *
     * @param gtx Graphics2D context
     */
    @Override
    public void draw(Graphics2D gtx) {
        System.out.println("Drawing oval: " + this.toString());
    }
}
