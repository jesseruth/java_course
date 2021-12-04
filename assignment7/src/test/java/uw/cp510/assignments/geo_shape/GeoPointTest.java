package uw.cp510.assignments.geo_shape;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GeoPointTest {

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
}