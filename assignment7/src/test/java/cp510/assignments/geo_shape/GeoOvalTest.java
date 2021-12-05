package cp510.assignments.geo_shape;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.awt.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class GeoOvalTest {
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
    void draw() {

        Color black = Color.black;
        GeoPoint geoPoint = new GeoPoint();
        GeoOval geoOval = new GeoOval(geoPoint, null);
        geoOval.setColor(black);
        geoOval.setHeight(2.2);
        geoOval.setWidth(1.1);
        geoOval.setOrigin(new GeoPoint(1,2));

        geoOval.draw(null);
        String actual = outputStreamCaptor.toString().trim();
        assertEquals("Drawing oval: origin=(1.0000,2.0000),color=#000000,width=1.1000,height=2.2000", actual);

        assertEquals(1, geoOval.getOrigin().getXco());
        assertEquals(2, geoOval.getOrigin().getYco());
        assertEquals(Color.black, geoOval.getColor());
    }

    @Test
    public void testConstructors() {
        Color black = Color.black;
        GeoPoint geoPoint = new GeoPoint();
        GeoOval widthHeight = new GeoOval(11.1, 12.2);
        GeoOval originWidthHeight = new GeoOval(geoPoint,11.1, 12.2);
        GeoOval originColorWidthHeight = new GeoOval(geoPoint, black, 11.1, 12.2);

        assertEquals(black, originColorWidthHeight.getColor());
        assertEquals(widthHeight.getHeight(), originWidthHeight.getHeight());
    }
}