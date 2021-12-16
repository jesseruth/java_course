package cp510.assignments.geo_shape;

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
import java.text.AttributedCharacterIterator;
import java.util.Map;

import static cp510.assignments.geo_shape.GeoShape.DEFAULT_EDGE_COLOR;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Basic tests for GeoLine Class.
 * @author Jesse Ruth
 */
public class GeoLineTest {
    /**
     * Utility method for testing.
     */
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

    /**
     * Validate string functions works
     */
    @Test
    public void testToStringFunction() {
        GeoPoint start = new GeoPoint(12,10);
        GeoPoint end = new GeoPoint(23,2);
        GeoLine geoLine1 = new GeoLine(start, end);
        String expected = "origin=(12.0000,10.0000),color=null,edgeColor=#0000ff,edgeWidth=1.0000,end=(23.0000,2.0000)";
        assertEquals(expected, geoLine1.toString());
    }

    /**
     * Validate the slop
     */
    @Test
    public void testSlope() {
        GeoPoint start = new GeoPoint(0,0);
        GeoPoint end = new GeoPoint(23,2);
        GeoLine geoLine1 = new GeoLine(start, end);
        Double expected = 0.08695652173913043;
        assertEquals(expected, geoLine1.slope());

        start.setXco(0);
        start.setXco(0);
        end.setXco(1);
        end.setXco(1);
        assertEquals(2.0, geoLine1.slope());

        geoLine1.setStart(new GeoPoint(3,3));
        assertEquals(0.5, geoLine1.slope());
    }

    @Test
    public void testDraw () {
        GeoPoint start = new GeoPoint(0,0);
        GeoPoint end = new GeoPoint(23,2);
        GeoLine geoLine1 = new GeoLine(start, end);
        geoLine1.draw(graphics2D);

        geoLine1.setEdgeColor(null);
        geoLine1.draw(graphics2D);

        geoLine1.setEdgeWidth(0);
        geoLine1.draw(graphics2D);

        geoLine1.setEdgeColor(Color.YELLOW);
        geoLine1.draw(graphics2D);
    }
}
