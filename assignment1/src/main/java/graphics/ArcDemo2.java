package graphics;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Arc2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class ArcDemo2 implements Runnable
{
    private JFrame      frame   = new JFrame( "Swing Frame Demo 3" );
    
    public static void main( String[] args )
    {
        ArcDemo2    demo    = new ArcDemo2();
        SwingUtilities.invokeLater( demo );
    }
    
    public void run()
    {
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        frame.setContentPane(  new DrawingSurface() );
        frame.pack();
        frame.setVisible( true );
    }
    
    @SuppressWarnings( "serial" )
    private class DrawingSurface extends JPanel
    {
        public DrawingSurface()
        {
            Dimension   size    = new Dimension( 500, 500 );
            setPreferredSize( size );
        }
        
        @Override
        public void paintComponent( Graphics graphics )
        {
            final int       margin  = 10;
            final float[]   dashes  = { 5f, 3f };
            Graphics2D  gtx = (Graphics2D)graphics.create();
            
            BasicStroke arcStroke   = new BasicStroke( 3.5f );
            BasicStroke rectStroke  = 
                new BasicStroke(
                    1f,
                    BasicStroke.CAP_SQUARE,
                    BasicStroke.JOIN_MITER,
                    10f,
                    dashes,
                    0
                );
            
            double      xco     = 100;
            double      yco     = 100;
            double      width   = 100;
            double      height  = 150;
            double      start   = 0;
            double      extent  = 225;
            int         type    = Arc2D.CHORD;
            Rectangle2D rect    =
                new Rectangle2D.Double( xco, yco, width, height );
            Arc2D   arc     = new Arc2D.Double(
                xco, 
                yco, 
                width, 
                height, 
                start, 
                extent, 
                type
            );
            
            gtx.setColor(  Color.RED );
            gtx.setStroke( arcStroke );
            gtx.draw( arc );
            gtx.setStroke( rectStroke );
            gtx.draw( rect );
            
            xco += width + margin;
            type = Arc2D.OPEN;
            arc.setArc( xco, yco, width, height, start, extent, type );
            gtx.setStroke( arcStroke );
            gtx.draw( arc );
            gtx.setStroke( rectStroke );
            rect.setRect( xco, yco, width, height );
            gtx.draw( rect );
            
            yco += height + margin;
            type = Arc2D.PIE;
            arc.setArc( xco, yco, width, height, start, extent, type );
            gtx.setStroke( arcStroke );
            gtx.draw(  arc  );
            gtx.setStroke( rectStroke );
            rect.setRect( xco, yco, width, height );
            gtx.draw( rect );
        }
    }
}
