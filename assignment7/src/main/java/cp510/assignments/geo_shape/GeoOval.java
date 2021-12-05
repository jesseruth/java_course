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

    /**
     * Draw an oval.
     *
     * @param gtx Graphics2D context
     */
    @Override
    public void draw(Graphics2D gtx) {
        System.out.println("Drawing oval");
    }
}
