package uw.cp510.assignments.geo_shape;

import java.awt.*;

public abstract class GeoShape {
    private GeoPoint origin = new GeoPoint(0,0);
    private Color color = null;
    public abstract void draw( Graphics2D gtx );

    public GeoPoint getOrigin() {
        return origin;
    }

    public void setOrigin(GeoPoint origin) throws NullPointerException {
        this.origin = origin;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
