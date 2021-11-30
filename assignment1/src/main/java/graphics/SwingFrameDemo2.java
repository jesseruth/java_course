package graphics;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class SwingFrameDemo2 implements Runnable
{
    private JFrame      frame   = new JFrame( "Swing Frame Demo 2" );
    private static int  iterNum = 0;
      
    public static void main( String[] args )
    {
        SwingFrameDemo2 demo    = new SwingFrameDemo2();
        SwingUtilities.invokeLater( demo );
    }
    
    public void run()
    {
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        frame.setContentPane( new DrawingSurface() );
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
            Graphics2D  gtx = (Graphics2D)graphics;//.create();
            gtx.setColor(  Color.RED );
            gtx.fillOval( 100, 100, 150, 150 );
            gtx.setColor(  Color.BLACK );
            gtx.drawOval( 100, 100, 150, 150 );
            
            gtx.drawString(  "Iteration #" + ++iterNum, 150, 270 );
        }
    }
}
