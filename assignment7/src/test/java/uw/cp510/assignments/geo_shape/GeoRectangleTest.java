package uw.cp510.assignments.geo_shape;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.awt.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

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
        GeoRectangle geoRectangle = new GeoRectangle();
        geoRectangle.setColor(black);
        geoRectangle.setHeight(height);
        geoRectangle.setWidth(width);
        geoRectangle.setOrigin(new GeoPoint(1,1));

        geoRectangle.draw(null);
        String actual = outputStreamCaptor.toString().trim();
        String expected = "Drawing rectangle";
        assertEquals(expected, actual);
        assertEquals(height, geoRectangle.getHeight());
        assertEquals(width, geoRectangle.getWidth());
    }
}