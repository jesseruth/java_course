package cp510.assignments.geo_shape;

import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GeoShapeTest {
    @Test
    void testToString() {
        GeoPoint geoPoint = new GeoPoint();
        ShapeTester shapeTester = new ShapeTester(geoPoint, null);
        String expected = "origin=(.0000,.0000),color=null";
        assertEquals(expected, shapeTester.toString());
        shapeTester.setColor(Color.black);
        expected = "origin=(.0000,.0000),color=#000000";
        assertEquals(expected, shapeTester.toString());
        shapeTester.setColor(Color.LIGHT_GRAY);
        expected = "origin=(.0000,.0000),color=#c0c0c0";
        assertEquals(expected, shapeTester.toString());
    }

    @Test
    void testConstructorThrowsError() {
        try {
            ShapeTester shapeTester = new ShapeTester(null, null);
        } catch (NullPointerException e) {
            assertEquals("java.lang.NullPointerException", e.toString());
        }
    }

    @Test
    void setOriginThrowsError() {
        GeoPoint geoPoint = new GeoPoint();
        ShapeTester shapeTester = new ShapeTester(geoPoint, null);
        try {
            shapeTester.setOrigin(null);
        } catch (NullPointerException e) {
            assertEquals("java.lang.NullPointerException", e.toString());
        }
        assertEquals("(.0000,.0000)", shapeTester.getOrigin().toString());
    }

    private class ShapeTester extends GeoShape {
        public ShapeTester(GeoPoint origin, Color color) throws NullPointerException {
            super(origin, color);
        }

        @Override
        public void draw(Graphics2D gtx) {
        }
    }
}