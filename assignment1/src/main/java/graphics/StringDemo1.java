package graphics;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class StringDemo1 implements Runnable
{
    private JFrame      frame   = new JFrame( "Swing Frame Demo 3" );
      
    public static void main( String[] args )
    {
        StringDemo1 demo    = new StringDemo1();
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
            final int   margin  = 25;
            
            Graphics2D  gtx = (Graphics2D)graphics.create();
            gtx.setStroke( new BasicStroke( 3.5f ) );
            
            int xco         = 100;
            int yco         = 100;
            
            gtx.setColor(  Color.BLACK );
            gtx.drawString(  "The sun was shining on the sea", xco, yco );
            yco += margin;
            gtx.setColor(  Color.RED );
            gtx.drawString(  "Shining with all his might", xco, yco );
            yco += margin;
            gtx.setColor(  Color.BLUE );
            gtx.drawString(  "He did his very best to make", xco, yco );
            yco += margin;
            gtx.setColor(  Color.DARK_GRAY );
            gtx.drawString(  "The billows smooth and bright", xco, yco );
            yco += margin;
            gtx.setColor(  Color.ORANGE );
            gtx.drawString(  "And this was odd because it was", xco, yco );
            yco += margin;
            gtx.setColor(  Color.MAGENTA );
            gtx.drawString(  "The middle of the night", xco, yco );
        }
    }
}
