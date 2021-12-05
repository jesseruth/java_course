package cp510.assignments.geo_shape;


import java.awt.*;

/**
 * Oval implementation of the GeoRectangle.
 *
 * @author Jesse Ruth
 */
public class GeoOval extends GeoRectangle {

    public GeoOval(GeoPoint origin, Color color) throws NullPointerException {
        super(origin, color);
    }

    public GeoOval( double width, double height ) {
        this( DEFAULT_ORIGIN, DEFAULT_COLOR, width, height );
    }

    public GeoOval( GeoPoint origin, double width, double height ) throws NullPointerException {
        this( origin, DEFAULT_COLOR, width, height );
    }

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
