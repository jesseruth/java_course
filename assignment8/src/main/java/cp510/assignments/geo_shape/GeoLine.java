package cp510.assignments.geo_shape;

import java.awt.*;
import java.awt.geom.Line2D;

/**
 * GeoLine instance class encapsulates a line. It inherits edgeWidth and edgeColor
 * from its superclass; GeoLine does not use the color property. It adds one additional
 * property call end that is a GeoPoint and cannot be null.
 *
 * @author Jesse Ruth
 */
public class GeoLine extends GeoShape {
    /**
     * GeoPoint end of line. Cannot be null with the NullPointerException.
     */
    private GeoPoint end;

    /**
     * Create a GeoLine by providing a start and end. Both required.
     * Width will be DEFAULT_EDGE_WIDTH and color will be DEFAULT_EDGE_COLOR.
     * @param start GeoPoint
     * @param end GeoPoint
     * @throws NullPointerException  When start or end is null.
     */
    public GeoLine(GeoPoint start, GeoPoint end) throws NullPointerException {
        this(start, DEFAULT_EDGE_COLOR, end, DEFAULT_EDGE_WIDTH);
    }

    /**
     * Create a GeoLine by providing a start and end. Both required.
     * Color can be null.
     * Width will be DEFAULT_EDGE_WIDTH.
     * @param start GeoPoint
     * @param color Color
     * @param end GeoPoint
     * @throws NullPointerException When start or end is null.
     */
    public GeoLine(GeoPoint start, Color color, GeoPoint end) throws NullPointerException {
        this(start, color, end, DEFAULT_EDGE_WIDTH);
    }

    /**
     * Create a GeoLine by providing a start and end. Both required.
     * Color can be null.
     * @param start GeoPoint
     * @param color Color
     * @param end GeoPoint
     * @param width
     * @throws NullPointerException  When start or end is null.
     */
    public GeoLine(GeoPoint start, Color color, GeoPoint end, double width) throws NullPointerException {
        super(start, null);
        this.setEnd(end);
        this.setEdge(color, width);
    }

    /**
     * The end of the line.
     * @return GeoPoint end.
     */
    public GeoPoint getEnd() {
        return end;
    }

    /**
     * Update the end of the line. Throws NullPointerException.
     * @param end
     * @throws NullPointerException
     */
    public void setEnd(GeoPoint end) throws NullPointerException {
        if (end == null) throw new NullPointerException();
        this.end = end;
    }

    /**
     * Get the start of the line, stored in origin of GeoShape.
     * @return
     */
    public GeoPoint getStart() {
        return getOrigin();
    }

    /**
     * Length is the distance between the start and the end.
     * @return length.
     */
    public double length() {
        return this.getStart().distance(this.getEnd());
    }

    /**
     * Calculate the slope between the start and end points.
     * @return Slope
     */
    public double slope() {
        return (getEnd().getYco() - getStart().getYco()) / (getEnd().getXco() - getStart().getXco());
    }

    /**
     * Draws a shape.
     *
     * @param gtx Graphics2D context
     */
    @Override
    public void draw(Graphics2D gtx) {
        Line2D.Double newLine = new Line2D.Double(
                getOrigin().getXco(),
                getOrigin().getYco(),
                getEnd().getXco(),
                getEnd().getYco()
        );
        if (getEdgeColor() != null && getEdgeWidth() > 0) {
            BasicStroke basicStroke = new BasicStroke((float) getEdgeWidth());
            gtx.setStroke(basicStroke);
            gtx.setColor(getEdgeColor());
        }
        gtx.draw(newLine);
    }

    /**
     * origin=(5.5000,6.6000),color=null,edgeColor=#0000ff,edgeWidth=1.0000,end=(15.2000,31.6000)
     * @return String representation.
     */
    @Override
    public String toString() {
        return super.toString() + getEnd().toString();
    }
}
