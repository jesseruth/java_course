package cp510.assignments.geo_shape;

import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test GeoShape by implementing an inner class ShapeTester.
 *
 * @author Jesse Ruth
 */
class GeoShapeTest {
    private final double    epsilon = .0001;
    /**
     * Test that GeoShape toString works with basic object construction.
     */
    @Test
    void testToString() {

        // Create GeoShape with no color, defaults to null
        GeoPoint geoPoint = new GeoPoint();
        ShapeTester shapeTester = new ShapeTester(geoPoint, null);
        String expected = "origin=(0.0000,0.0000),color=null,edgeColor=#0000ff,edgeWidth=1.0000";
        assertEquals(expected, shapeTester.toString());

        // Update color to black
        shapeTester.setColor(Color.black);
        expected = "origin=(0.0000,0.0000),color=#000000,edgeColor=#0000ff,edgeWidth=1.0000";
        assertEquals(expected, shapeTester.toString());

        // Update color to gray
        shapeTester.setColor(Color.LIGHT_GRAY);
        shapeTester.setEdgeColor(null);
        expected = "origin=(0.0000,0.0000),color=#c0c0c0,edgeColor=null,edgeWidth=1.0000";
        assertEquals(expected, shapeTester.toString());
    }

    @Test
    public void testDoubleEquals() {
        // Create GeoShape with no color, defaults to null
        GeoPoint geoPoint = new GeoPoint();
        ShapeTester shapeTester = new ShapeTester(geoPoint, null);

        assertTrue(shapeTester.equals(1.0,1.0, epsilon));
        assertTrue(shapeTester.equals(1.00000001,1.0, epsilon));
    }

    @Test
    public void testEquality() {
        // Create GeoShape with no color, defaults to null
        GeoPoint geoPoint = new GeoPoint();
        ShapeTester shapeTester1 = new ShapeTester(geoPoint, null);
        ShapeTester shapeTester2 = new ShapeTester(geoPoint, null);
        assertTrue(shapeTester1.equals(shapeTester1, epsilon));
        assertTrue(shapeTester2.equals(shapeTester1, epsilon));

        shapeTester2.setEdgeWidth(100.00);
        assertFalse(shapeTester2.equals(shapeTester1, epsilon));

        shapeTester2.setEdgeWidth(shapeTester1.getEdgeWidth());
        assertTrue(shapeTester2.equals(shapeTester1, epsilon));

        shapeTester2.setEdgeColor(Color.YELLOW);
        assertFalse(shapeTester2.equals(shapeTester1, epsilon));
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
        assertEquals("(0.0000,0.0000)", shapeTester.getOrigin().toString());
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