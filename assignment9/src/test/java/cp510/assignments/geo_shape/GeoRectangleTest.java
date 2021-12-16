package cp510.assignments.geo_shape;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.awt.*;
import java.awt.font.FontRenderContext;
import java.awt.font.GlyphVector;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.awt.image.BufferedImageOp;
import java.awt.image.ImageObserver;
import java.awt.image.RenderedImage;
import java.awt.image.renderable.RenderableImage;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.text.AttributedCharacterIterator;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test the GeoRectangle class.
 *
 * @author Jesse Ruth
 */
class GeoRectangleTest {
    private final double epsilon = .0001;
    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    private Graphics2D graphics2D = new Graphics2D() {
        @Override
        public void draw(Shape shape) {

        }

        @Override
        public boolean drawImage(Image image, AffineTransform affineTransform, ImageObserver imageObserver) {
            return false;
        }

        @Override
        public void drawImage(BufferedImage bufferedImage, BufferedImageOp bufferedImageOp, int i, int i1) {

        }

        @Override
        public void drawRenderedImage(RenderedImage renderedImage, AffineTransform affineTransform) {

        }

        @Override
        public void drawRenderableImage(RenderableImage renderableImage, AffineTransform affineTransform) {

        }

        @Override
        public void drawString(String s, int i, int i1) {

        }

        @Override
        public void drawString(String s, float v, float v1) {

        }

        @Override
        public void drawString(AttributedCharacterIterator attributedCharacterIterator, int i, int i1) {

        }

        @Override
        public void drawString(AttributedCharacterIterator attributedCharacterIterator, float v, float v1) {

        }

        @Override
        public void drawGlyphVector(GlyphVector glyphVector, float v, float v1) {

        }

        @Override
        public void fill(Shape shape) {

        }

        @Override
        public boolean hit(Rectangle rectangle, Shape shape, boolean b) {
            return false;
        }

        @Override
        public GraphicsConfiguration getDeviceConfiguration() {
            return null;
        }

        @Override
        public void setRenderingHint(RenderingHints.Key key, Object o) {

        }

        @Override
        public Object getRenderingHint(RenderingHints.Key key) {
            return null;
        }

        @Override
        public void addRenderingHints(Map<?, ?> map) {

        }

        @Override
        public RenderingHints getRenderingHints() {
            return null;
        }

        @Override
        public void setRenderingHints(Map<?, ?> map) {

        }

        @Override
        public void translate(int i, int i1) {

        }

        @Override
        public void translate(double v, double v1) {

        }

        @Override
        public void rotate(double v) {

        }

        @Override
        public void rotate(double v, double v1, double v2) {

        }

        @Override
        public void scale(double v, double v1) {

        }

        @Override
        public void shear(double v, double v1) {

        }

        @Override
        public void transform(AffineTransform affineTransform) {

        }

        @Override
        public AffineTransform getTransform() {
            return null;
        }

        @Override
        public void setTransform(AffineTransform affineTransform) {

        }

        @Override
        public Paint getPaint() {
            return null;
        }

        @Override
        public void setPaint(Paint paint) {

        }

        @Override
        public Composite getComposite() {
            return null;
        }

        @Override
        public void setComposite(Composite composite) {

        }

        @Override
        public Color getBackground() {
            return null;
        }

        @Override
        public void setBackground(Color color) {

        }

        @Override
        public Stroke getStroke() {
            return null;
        }

        @Override
        public void setStroke(Stroke stroke) {

        }

        @Override
        public void clip(Shape shape) {

        }

        @Override
        public FontRenderContext getFontRenderContext() {
            return null;
        }

        @Override
        public Graphics create() {
            return null;
        }

        @Override
        public Color getColor() {
            return null;
        }

        @Override
        public void setColor(Color color) {

        }

        @Override
        public void setPaintMode() {

        }

        @Override
        public void setXORMode(Color color) {

        }

        @Override
        public Font getFont() {
            return null;
        }

        @Override
        public void setFont(Font font) {

        }

        @Override
        public FontMetrics getFontMetrics(Font font) {
            return null;
        }

        @Override
        public Rectangle getClipBounds() {
            return null;
        }

        @Override
        public void clipRect(int i, int i1, int i2, int i3) {

        }

        @Override
        public void setClip(int i, int i1, int i2, int i3) {

        }

        @Override
        public Shape getClip() {
            return null;
        }

        @Override
        public void setClip(Shape shape) {

        }

        @Override
        public void copyArea(int i, int i1, int i2, int i3, int i4, int i5) {

        }

        @Override
        public void drawLine(int i, int i1, int i2, int i3) {

        }

        @Override
        public void fillRect(int i, int i1, int i2, int i3) {

        }

        @Override
        public void clearRect(int i, int i1, int i2, int i3) {

        }

        @Override
        public void drawRoundRect(int i, int i1, int i2, int i3, int i4, int i5) {

        }

        @Override
        public void fillRoundRect(int i, int i1, int i2, int i3, int i4, int i5) {

        }

        @Override
        public void drawOval(int i, int i1, int i2, int i3) {

        }

        @Override
        public void fillOval(int i, int i1, int i2, int i3) {

        }

        @Override
        public void drawArc(int i, int i1, int i2, int i3, int i4, int i5) {

        }

        @Override
        public void fillArc(int i, int i1, int i2, int i3, int i4, int i5) {

        }

        @Override
        public void drawPolyline(int[] ints, int[] ints1, int i) {

        }

        @Override
        public void drawPolygon(int[] ints, int[] ints1, int i) {

        }

        @Override
        public void fillPolygon(int[] ints, int[] ints1, int i) {

        }

        @Override
        public boolean drawImage(Image image, int i, int i1, ImageObserver imageObserver) {
            return false;
        }

        @Override
        public boolean drawImage(Image image, int i, int i1, int i2, int i3, ImageObserver imageObserver) {
            return false;
        }

        @Override
        public boolean drawImage(Image image, int i, int i1, Color color, ImageObserver imageObserver) {
            return false;
        }

        @Override
        public boolean drawImage(Image image, int i, int i1, int i2, int i3, Color color, ImageObserver imageObserver) {
            return false;
        }

        @Override
        public boolean drawImage(Image image, int i, int i1, int i2, int i3, int i4, int i5, int i6, int i7, ImageObserver imageObserver) {
            return false;
        }

        @Override
        public boolean drawImage(Image image, int i, int i1, int i2, int i3, int i4, int i5, int i6, int i7, Color color, ImageObserver imageObserver) {
            return false;
        }

        @Override
        public void dispose() {

        }
    };


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
        geoRectangle.draw(graphics2D);
        String actual = outputStreamCaptor.toString().trim();
        String expected = "Drawing rectangle: origin=(1.0000,1.0000),color=#000000,edgeColor=#0000ff,edgeWidth=1.0000,width=2.2000,height=1.2000";
        assertEquals(expected, actual);
        assertEquals(height, geoRectangle.getHeight());
        assertEquals(width, geoRectangle.getWidth());

        geoRectangle.setColor(null);
        geoRectangle.setEdgeColor(null);
        geoRectangle.draw(graphics2D);

        geoRectangle.setEdgeWidth(0);
        geoRectangle.draw(graphics2D);

        geoRectangle.setEdgeColor(Color.YELLOW);
        geoRectangle.draw(graphics2D);
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
        String expected = "origin=(0.0000,0.0000),color=#0000ff,edgeColor=#0000ff,edgeWidth=1.0000,width=1.1000,height=2.2000";
        assertEquals(expected, stringTester.toString());

        stringTester.setHeight(2.00009);
        expected = "origin=(0.0000,0.0000),color=#0000ff,edgeColor=#0000ff,edgeWidth=1.0000,width=1.1000,height=2.0001";
        assertEquals(expected, stringTester.toString());

        stringTester = new GeoRectangle(new GeoPoint(3.1, 2), Color.YELLOW, 4.52937, 6);
        expected = "origin=(3.1000,2.0000),color=#ffff00,edgeColor=#0000ff,edgeWidth=1.0000,width=4.5294,height=6.0000";
        assertEquals(expected, stringTester.toString());

        stringTester = new GeoRectangle(new GeoPoint(5.1, 3), Color.RED, 10, 20.3);
        expected = "origin=(5.1000,3.0000),color=#ff0000,edgeColor=#0000ff,edgeWidth=1.0000,width=10.0000,height=20.3000";
        assertEquals(expected, stringTester.toString());

        stringTester = new GeoRectangle(new GeoPoint(2, 7), null, 40, 50);
        expected = "origin=(2.0000,7.0000),color=null,edgeColor=#0000ff,edgeWidth=1.0000,width=40.0000,height=50.0000";
        assertEquals(expected, stringTester.toString());
    }

    @Test
    public void testArea() {
        GeoRectangle geoRectangle = new GeoRectangle(11, 1);
        Double expectedArea = 11.0;
        assertEquals(expectedArea, geoRectangle.area());
        geoRectangle.setHeight(37.8902447);
        expectedArea = 416.7926917;
        assertEquals(expectedArea, geoRectangle.area());
    }

    @Test
    public void testPerimeter() {
        GeoRectangle geoRectangle = new GeoRectangle(11, 1);
        Double expectedPerimeter = 24.0;
        assertEquals(expectedPerimeter, geoRectangle.perimeter());
        geoRectangle.setHeight(37.8902447);
        expectedPerimeter = 97.7804894;
        assertEquals(expectedPerimeter, geoRectangle.perimeter());
    }

    @Test
    public void testEquality() {
        GeoRectangle geoRectangle1 = new GeoRectangle(new GeoPoint(5.1, 3), Color.RED, 10, 20.3);
        GeoRectangle geoRectangle2 = new GeoRectangle(new GeoPoint(2, 7), Color.BLUE, 40, 50);
        // They don't equal each other
        assertFalse(geoRectangle1.equals(geoRectangle2, epsilon));
        // They are equal to themselves
        assertTrue(geoRectangle1.equals(geoRectangle1, epsilon));
        assertTrue(geoRectangle2.equals(geoRectangle2, epsilon));

        geoRectangle1.setHeight(geoRectangle2.getHeight());
        assertFalse(geoRectangle1.equals(geoRectangle2, epsilon));
        geoRectangle1.setWidth(geoRectangle2.getWidth());
        assertFalse(geoRectangle1.equals(geoRectangle2, epsilon));
        geoRectangle1.setOrigin(geoRectangle2.getOrigin());
        assertFalse(geoRectangle1.equals(geoRectangle2, epsilon));
        geoRectangle1.setColor(geoRectangle2.getColor());
        assertTrue(geoRectangle1.equals(geoRectangle2, epsilon));
    }

    @Test
    public void simpleEqualityTest() {
        GeoPoint geoPoint = new GeoPoint(5.1, 3);
        GeoRectangle geoRectangle1 = new GeoRectangle(geoPoint, Color.RED, 10, 10);
        GeoRectangle geoRectangle2 = new GeoRectangle(geoPoint, Color.RED, 10, 10);
        assertTrue(geoRectangle1.equals(geoRectangle2, epsilon));

        geoRectangle1.setWidth(20);
        assertFalse(geoRectangle1.equals(geoRectangle2, epsilon));

        geoRectangle1.setHeight(20);
        assertFalse(geoRectangle1.equals(geoRectangle2, epsilon));
    }
}