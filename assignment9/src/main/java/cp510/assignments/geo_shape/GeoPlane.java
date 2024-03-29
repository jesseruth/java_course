package cp510.assignments.geo_shape;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;


/**
 * Represents a graphical portrayal of shapes from the GeoShape library.
 * Shapes to draw on the plane are stored in a list. The shapes will be drawn
 * every time one of the following occurs:
 * <ol>
 * <li>The plane is made visible (i.e., the user calls the show method)</li>
 * <li>The plane is visible and needs to be refreshed due to operator
 *     activity</li>
 * <li>The plane is visible and the user calls the <em>redraw</em> method</li>
 * </ol>
 * @see #addShape(GeoShape)
 * @see #redraw()
 */
public class GeoPlane
        implements Runnable
{
    /** A list of all shapes to be drawn on the plane. */
    private final List<GeoShape>    allShapes   = new ArrayList<>();

    /** The color of the plane. */
    private final   Color           color;

    /** The panel to use for drawing. */
    private final   Panel           panel;

    /* (non-Javadoc)
     * @see java.lang.Runnable#run()
     */
    public void run()
    {
        JFrame  frame   = new JFrame( "GeoPlane" );
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        frame.setContentPane( panel );
        frame.pack();
        frame.setVisible( true );
    }

    /**
     * Instantiates a new GeoPlane.
     */
    public GeoPlane()
    {
        this( new Color( .5f, .5f, .5f ) );
    }

    /**
     * Instantiates a new GeoPlane with a background of the given color.
     *
     * @param color the given background color
     */
    public GeoPlane( Color color )
    {
        this.color = color;
        panel = new Panel();
    }

    /**
     * Displays the plane. Any shapes stored in the list of shapes to draw
     * will immediately be drawn. If part or all of the plane requires
     * redrawing due to operator activity, the shapes will automatically
     * be redrawn.
     *
     *  @see #addShape(GeoShape)
     */
    public void show()
    {
        //new Thread( this, "GeoPlane Thread" ).start();
        SwingUtilities.invokeLater( this );
    }

    /**
     * Adds a shape to the list of shapes to be drawn on the plane.
     * Note that the shape is not immediately drawn; to draw the shape
     * immediately, call the redraw() method.
     *
     * @param shape     the shape to add to the list
     *
     * @see #redraw()
     */
    public void addShape( GeoShape shape )
    {
        allShapes.add( shape );
    }

    /**
     * Removes a shape from the list of shapes to be drawn on the plane.
     * Note that the plane is not immediately redrawn; to redraw the plane
     * immediately, call the redraw() method.
     *
     * @param shape the shape to remove from the list
     * @return true, if shape is found and removed; false, otherwise
     */
    public boolean removeShape( GeoShape shape )
    {
        boolean found   = allShapes.remove( shape );

        return found;
    }

    /**
     * Explicitly draws the shapes in the list of shapes. Calling this method
     * has no effect if the plane is not visible.
     */
    public void redraw()
    {
        panel.repaint();
    }

    /**
     * A simple panel for drawing.
     */
    public class Panel extends JPanel
    {
        /** The Constant serialVersionUID. */
        private static final long serialVersionUID = -7413434451145995808L;

        /**
         * Instantiates a new panel.
         */
        public Panel()
        {
            setPreferredSize( new Dimension( 500, 500 ) );
        }

        /* (non-Javadoc)
         * @see javax.swing.JComponent#paintComponent(java.awt.Graphics)
         */
        @Override
        public void paintComponent( Graphics graphics )
        {
            Graphics2D  gtx = (Graphics2D)graphics.create();
            gtx.setColor( color );
            gtx.fillRect( 0, 0, getWidth(), getHeight() );

            for ( GeoShape shape : allShapes )
                shape.draw( gtx );
        }
    }

    /**
     * Returns the list of shapes maintained by this GeoPlane.
     * @return list of shapes maintained by this GeoPlane.
     */
    public List<GeoShape> getShapes(){
        return allShapes;
    }
}