package cp510.assignments.geo_shape;

import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test GeoShape by implementing an inner class ShapeTester.
 */
class GeoShapeTest {
    /**
     * Test that GeoShape toString works with basic object construction.
     */
    @Test
    void testToString() {

        // Create GeoShape with no color, defaults to null
        GeoPoint geoPoint = new GeoPoint();
        ShapeTester shapeTester = new ShapeTester(geoPoint, null);
        String expected = "origin=(.0000,.0000),color=null";
        assertEquals(expected, shapeTester.toString());

        // Update color to black
        shapeTester.setColor(Color.black);
        expected = "origin=(.0000,.0000),color=#000000";
        assertEquals(expected, shapeTester.toString());

        // Update color to gray
        shapeTester.setColor(Color.LIGHT_GRAY);
        expected = "origin=(.0000,.0000),color=#c0c0c0";
        assertEquals(expected, shapeTester.toString());
    }

    /**
     * Validate that constructing the object with null on the origin value throws error.
     */
    @Test
    void testConstructorThrowsError() {
        try {
            ShapeTester shapeTester = new ShapeTester(null, null);
        } catch (NullPointerException e) {
            assertEquals("java.lang.NullPointerException", e.toString());
        }
    }

    /**
     * Test updating origin with null throws NullPointerException.
     */
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

    /**
     * Private class to test GeoShape.
     */
    private class ShapeTester extends GeoShape {
        public ShapeTester(GeoPoint origin, Color color) throws NullPointerException {
            super(origin, color);
        }

        @Override
        public void draw(Graphics2D gtx) {
        }
    }
}