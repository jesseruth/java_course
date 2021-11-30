package graphics;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class RRectDemo1 implements Runnable
{
    private JFrame      frame   = new JFrame( "Swing Frame Demo 3" );
      
    public static void main( String[] args )
    {
        RRectDemo1  demo    = new RRectDemo1();
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
            Graphics2D  gtx = (Graphics2D)graphics.create();
            
            int xco         = 100;
            int yco         = 100;
            int width       = 150;
            int height      = 150;
            int arcWidth    = 50;
            int arcHeight   = 50;
            
            gtx.setColor(  Color.RED );
            gtx.fillRoundRect( xco, yco, width, height, arcWidth, arcHeight );
            
            gtx.setStroke(  new BasicStroke( 3.5f ) );
            gtx.setColor(  Color.BLACK );
            gtx.drawRoundRect( xco, yco, width, height, arcWidth, arcHeight );
        }
    }
}
