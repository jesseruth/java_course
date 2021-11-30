package graphics;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class SwingFrameDemo1 implements Runnable
{
    private JFrame  frame   = new JFrame( "Swing Frame Demo 1" );    
    public static void main( String[] args )
    {
        SwingFrameDemo1 demo    = new SwingFrameDemo1();
        SwingUtilities.invokeLater( demo );
        try
        {
            Thread.sleep( 2000 );
        }
        catch ( InterruptedException exc )
        {
        }
        demo.execute();
    }
    
    public void run()
    {
        int closeOp = JFrame.EXIT_ON_CLOSE;
        frame.setDefaultCloseOperation( closeOp );
        frame.setContentPane(  new DrawingSurface() );
        frame.pack();
        frame.setVisible( true );
    }
    
    public void execute()
    {
        Component   drawingSurface  = frame.getContentPane();
        Graphics2D  gtx             = (Graphics2D)drawingSurface.getGraphics();
        gtx.setColor( Color.RED );
        gtx.fillOval(  100, 100, 150, 150 );
    }
    
    @SuppressWarnings( "serial" )
    private class DrawingSurface extends JPanel
    {
        public DrawingSurface()
        {
            Dimension   size    = new Dimension( 500, 500 );
            setPreferredSize( size );
        }
    }
}
