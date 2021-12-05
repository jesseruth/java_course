package cp510.assignments.geo_shape;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.awt.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GeoRectangleTest {

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
    void testDraw() {
        Color black = Color.black;
        Double width = 2.2;
        Double height = 1.2;
        GeoPoint geoPoint = new GeoPoint();
        GeoRectangle geoRectangle = new GeoRectangle(geoPoint, null);
        geoRectangle.setColor(black);
        geoRectangle.setHeight(height);
        geoRectangle.setWidth(width);
        geoRectangle.setOrigin(new GeoPoint(1, 1));

        geoRectangle.draw(null);
        String actual = outputStreamCaptor.toString().trim();
        String expected = "Drawing rectangle: origin=(1.0000,1.0000),color=#000000,width=2.2000,height=1.2000";
        assertEquals(expected, actual);
        assertEquals(height, geoRectangle.getHeight());
        assertEquals(width, geoRectangle.getWidth());
    }

    @Test
    public void testConstructors() {
        GeoRectangle widthHeight = new GeoRectangle(1.1, 2.2);
        assertEquals(1.1, widthHeight.getWidth());
        assertEquals(2.2, widthHeight.getHeight());

        GeoRectangle widthHeightOrigin = new GeoRectangle(new GeoPoint(6, 7), 1.1, 2.2);
        assertEquals(6, widthHeightOrigin.getOrigin().getXco());
        assertEquals(7, widthHeightOrigin.getOrigin().getYco());

        GeoRectangle fullShebang = new GeoRectangle(new GeoPoint(6, 7), Color.LIGHT_GRAY, 1.1, 2.2);
        assertEquals(Color.LIGHT_GRAY, fullShebang.getColor());

    }

    @Test
    public void testToString() {
        GeoRectangle stringTester = new GeoRectangle(1.1, 2.2);
        String expected = "origin=(.0000,.0000),color=#0000ff,width=1.1000,height=2.2000";
        assertEquals(expected, stringTester.toString());

        stringTester.setHeight(2.00009);
        expected = "origin=(.0000,.0000),color=#0000ff,width=1.1000,height=2.0001";
        assertEquals(expected, stringTester.toString());

        stringTester = new GeoRectangle(new GeoPoint(3.1, 2), Color.YELLOW, 4.52937, 6);
        expected = "origin=(3.1000,2.0000),color=#ffff00,width=4.5294,height=6.0000";
        assertEquals(expected, stringTester.toString());

        stringTester = new GeoRectangle(new GeoPoint(5.1, 3), Color.RED, 10, 20.3);
        expected = "origin=(5.1000,3.0000),color=#ff0000,width=10.0000,height=20.3000";
        assertEquals(expected, stringTester.toString());

        stringTester = new GeoRectangle(new GeoPoint(2, 7), null, 40, 50);
        expected = "origin=(2.0000,7.0000),color=null,width=40.0000,height=50.0000";
        assertEquals(expected, stringTester.toString());
    }

    @Test
    public void testArea() {
        GeoRectangle geoRectangle = new GeoRectangle(11,1);
        Double expectedArea = 11.0;
        assertEquals(expectedArea, geoRectangle.area());
        geoRectangle.setHeight(37.8902447);
        expectedArea = 416.7926917;
        assertEquals(expectedArea, geoRectangle.area());
    }
    @Test
    public void testPerimeter() {
        GeoRectangle geoRectangle = new GeoRectangle(11,1);
        Double expectedPerimeter = 24.0;
        assertEquals(expectedPerimeter, geoRectangle.perimeter());
        geoRectangle.setHeight(37.8902447);
        expectedPerimeter = 97.7804894;
        assertEquals(expectedPerimeter, geoRectangle.perimeter());
    }
}