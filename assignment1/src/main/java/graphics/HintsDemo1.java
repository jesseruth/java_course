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

import java.awt.RenderingHints;

public class HintsDemo1 implements Runnable
{
    private JFrame      frame   = new JFrame( "Swing Frame Demo 3" );
    
    public static void main( String[] args )
    {
        HintsDemo1  demo    = new HintsDemo1();
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
            Dimension   size    = new Dimension( 700, 700 );
            setPreferredSize( size );
        }
        
        @Override
        public void paintComponent( Graphics graphics )
        {
            final int       margin  = 25;
            Graphics2D  gtx = (Graphics2D)graphics.create();
            
            gtx.setStroke(  new BasicStroke( 3.5f ) );
            
            int     xco     = 100;
            int     yco     = 100;
            int     width   = 150;
            int     height  = 200;
            
            gtx.setColor(  Color.RED );
            gtx.drawOval( xco, yco, width, height );
            gtx.drawLine(  xco - 20,  yco + height, xco + width + 20, yco );
            
            gtx.setRenderingHint(
                RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON
            );
            xco += width + margin;
            gtx.drawOval( xco, yco, width, height );
            gtx.drawLine(  xco - 20,  yco + height, xco + width + 20, yco );
        }
    }
}
