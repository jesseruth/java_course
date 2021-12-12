package cp510.assignments.geo_shape;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.awt.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests the GeoPlane class.
 *
 * @author Jesse Ruth
 */
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
        GeoPlane geoPlane = new GeoPlane();
        geoPlane.show();
        // Create a GeoShape and add it to the plane
        GeoPoint        origin  = new GeoPoint( 50, 50 );
        GeoRectangle    rect    =
                new GeoRectangle( origin, Color.BLUE, 100, 100 );

        // If you want an edge, add an edge color and edge width
        rect.setEdgeColor( Color.GREEN );
        rect.setEdgeWidth( 5 );

        // Add the shape to the plane
        geoPlane.addShape( rect );
        geoPlane.redraw();

        GeoPoint geoPoint = new GeoPoint();
        GeoRectangle geoRectangle = new GeoRectangle(geoPoint, Color.RED);
        GeoOval geoOval = new GeoOval(geoPoint, Color.RED);
        GeoOval geoOval2 = new GeoOval(geoPoint, Color.RED);
        GeoOval geoOval3_not_in_list = new GeoOval(geoPoint, Color.GREEN);



        geoPlane.addShape(geoRectangle);
        geoPlane.addShape(geoOval);
        assertEquals(3, geoPlane.getSize());

        geoPlane.addShape(geoOval2);
        assertEquals(4, geoPlane.getSize());

        Boolean isRemoved = geoPlane.removeShape(geoOval2);
        Boolean isRemoved2 = geoPlane.removeShape(geoOval3_not_in_list);
        assertEquals(true,isRemoved);
        assertEquals(false, isRemoved2);
        assertEquals(3, geoPlane.getSize());

        geoPlane.redraw();
//        String actual = outputStreamCaptor.toString().trim();
//        assertEquals("Drawing rectangle: origin=(.0000,.0000),color=null,width=.0000,height=.0000\n" +
//                "Drawing oval: origin=(.0000,.0000),color=null,width=.0000,height=.0000", actual);
    }

}