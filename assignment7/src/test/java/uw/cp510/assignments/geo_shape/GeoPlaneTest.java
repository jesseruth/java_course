package uw.cp510.assignments.geo_shape;

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
        GeoRectangle geoRectangle = new GeoRectangle();
        GeoOval geoOval = new GeoOval();
        GeoOval geoOval2 = new GeoOval();
        GeoOval geoOval3_not_in_list = new GeoOval();

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
        assertEquals("Drawing rectangle\n" +
                "Drawing oval", actual);
    }

}