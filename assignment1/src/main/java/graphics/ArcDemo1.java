package graphics;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class ArcDemo1 implements Runnable
{
    private JFrame      frame   = new JFrame( "Swing Frame Demo 3" );
      
    public static void main( String[] args )
    {
        ArcDemo1    demo    = new ArcDemo1();
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
            
            int xco     = 100;
            int yco     = 100;
            int width   = 100;
            int height  = 150;
            int start   = 90;
            int extent  = 100;
            
            gtx.setColor(  Color.RED );
            gtx.setStroke(  arcStroke );
            gtx.drawArc( xco, yco, width, height, start, extent );
            gtx.setStroke( rectStroke );
            gtx.drawRect( xco,  yco,  width, height );
            
            start = 0;
            extent = 270;
            xco += width + margin;
            gtx.setStroke(  arcStroke );
            gtx.drawArc( xco, yco, width, height, start, extent );
            gtx.setStroke( rectStroke );
            gtx.drawRect( xco,  yco,  width, height );
            
            yco += height + margin;
            start = 0;
            extent = 360;
            gtx.setStroke(  arcStroke );
            gtx.drawArc( xco, yco, width, height, start, extent );
            gtx.setStroke( rectStroke );
            gtx.drawRect( xco,  yco,  width, height );
            
            xco -= width + margin;
            start = 90;
            extent = 330;
            gtx.setStroke( arcStroke );
            gtx.drawArc( xco, yco, width, height, start, extent );
            gtx.setStroke( rectStroke );
            gtx.drawRect( xco,  yco,  width, height );
        }
    }
}
