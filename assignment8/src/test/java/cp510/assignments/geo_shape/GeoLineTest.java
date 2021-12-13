package cp510.assignments.geo_shape;

import org.junit.jupiter.api.Test;

import java.awt.*;

import static cp510.assignments.geo_shape.GeoShape.DEFAULT_EDGE_COLOR;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Basic tests for GeoLine Class.
 * @author Jesse Ruth
 */
public class GeoLineTest {

    /**
     * Can construct a geoline with all the constructors.
     */
    @Test
    public void constructGeoLine() {
        GeoPoint start = new GeoPoint(12,10);
        GeoPoint end = new GeoPoint(23,2);
        Double width = 10.2;
        Color color = Color.black;
        GeoLine geoLine1 = new GeoLine(start, end);
        GeoLine geoLine2 = new GeoLine(start, color, end);
        GeoLine geoLine3 = new GeoLine(start, color, end, width);

        assertEquals( DEFAULT_EDGE_COLOR, geoLine1.getEdgeColor() );

        // Ends should equal
        assertTrue(geoLine1.getEnd().equals(geoLine2.getEnd()));
        assertTrue(geoLine1.getEnd().equals(geoLine3.getEnd()));

        assertEquals(null, geoLine2.getColor());
        assertEquals(color, geoLine2.getEdgeColor());

        // Start should be the same
        assertTrue(geoLine2.getStart().equals(geoLine1.getStart()));
        assertTrue(geoLine2.getStart().equals(geoLine3.getStart()));

    }

    /**
     * trying to set null for end results in error.
     */
    @Test
    public void settingEndNullThrowsError() {
        GeoPoint start = new GeoPoint(12,10);
        GeoPoint end = new GeoPoint(23,2);
        GeoLine geoLine1 = new GeoLine(start, end);
        try {
            geoLine1.setEnd(null);
        } catch (NullPointerException e) {
            assertEquals("java.lang.NullPointerException", e.toString());
        }
    }

    /**
     * Test the length method.
     */
    @Test
    public void testGetLength() {
        GeoPoint start = new GeoPoint(12,10);
        GeoPoint end = new GeoPoint(23,2);
        GeoLine geoLine1 = new GeoLine(start, end);
        Double length = geoLine1.length();
        Double expected = 13.601470508735444;
        assertEquals(expected, length);
    }

}
