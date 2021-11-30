package uw.cp510.assignments.geo_shape;

import java.awt.*;

public class GeoRectangle extends GeoShape {
    private double height;
    private double width;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public void draw(Graphics2D gtx) {
        System.out.println("Drawing rectangle");
    }
}
