package cp510.assignments.geo_shape;

import cp510.assignments.geo_shape.GeoOval;
import cp510.assignments.geo_shape.GeoPlane;
import cp510.assignments.geo_shape.GeoRectangle;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class GeoPlaneTest {
    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @AfterEach
    public void tearDown() {
        System.setOut(standardOut);
    }

    @Test
    void redrawAdd() {
        GeoPoint geoPoint = new GeoPoint();
        GeoRectangle geoRectangle = new GeoRectangle(geoPoint, null);
        GeoOval geoOval = new GeoOval(geoPoint, null);
        GeoOval geoOval2 = new GeoOval(geoPoint, null);
        GeoOval geoOval3_not_in_list = new GeoOval(geoPoint, null);

        GeoPlane geoPlane = new GeoPlane();
        geoPlane.addShape(geoRectangle);
        geoPlane.addShape(geoOval);
        assertEquals(2, geoPlane.getSize());

        geoPlane.addShape(geoOval2);
        assertEquals(3, geoPlane.getSize());

        Boolean isRemoved = geoPlane.removeShape(geoOval2);
        Boolean isRemoved2 = geoPlane.removeShape(geoOval3_not_in_list);
        assertEquals(true,isRemoved);
        assertEquals(false, isRemoved2);
        assertEquals(2, geoPlane.getSize());

        geoPlane.redraw();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals("Drawing rectangle: origin=(.0000,.0000),color=null,width=.0000,height=.0000\n" +
                "Drawing oval", actual);
    }

}