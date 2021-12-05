package cp510.assignments.geo_shape;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GeoPointTest {
    final double    epsilon = .0001;

    @Test
    void testGeoPoint() {
        double xco = 2.2;
        double yco = 3.3;
        GeoPoint geoPoint1 = new GeoPoint();
        geoPoint1.setXco(xco);
        geoPoint1.setYco(yco);
        GeoPoint geoPoint2 = new GeoPoint(xco,yco);

        assertEquals(geoPoint1.getXco(), geoPoint2.getXco());
        assertEquals(geoPoint1.getYco(), geoPoint2.getYco());
    }

    @Test
    void testEquality() {
        GeoPoint geoPoint1 = new GeoPoint();
        GeoPoint geoPoint2 = new GeoPoint();
        assertTrue(geoPoint1.equals(geoPoint2, epsilon));
        assertFalse(geoPoint1.equals(null, epsilon));
        assertFalse(geoPoint1.equals("HELLO", epsilon));
        geoPoint1.setXco(1);
        assertFalse(geoPoint1.equals(geoPoint2, epsilon));
        geoPoint2.setXco(1);
        assertTrue(geoPoint1.equals(geoPoint2, epsilon));
        geoPoint1.setXco(0);
        geoPoint2.setXco(0.000000000001);
        assertTrue(geoPoint1.equals(geoPoint2, epsilon));
        // Equals itself
        assertTrue(geoPoint1.equals(geoPoint1, epsilon));

        geoPoint1.setYco(1);
        assertFalse(geoPoint1.equals(geoPoint2, epsilon));
    }

    @Test
    void toStringWorks() {
        double xco = 2.2;
        double yco = 3.3;
        GeoPoint geoPoint1 = new GeoPoint(xco, yco);
        String expected = "(2.2000,3.3000)";
        assertEquals(expected, geoPoint1.toString());
        geoPoint1.setXco(454.22234234234234);
        geoPoint1.setYco(.11122234234234234);
        expected = "(454.2223,.1112)";
        assertEquals(expected, geoPoint1.toString());
    }

    @Test
    void testDefaultConstructor() {
        GeoPoint geoPoint1 = new GeoPoint();
        assertEquals(0, geoPoint1.getXco());
        assertEquals(0, geoPoint1.getYco());
        assertEquals("(.0000,.0000)", geoPoint1.toString());
    }
}