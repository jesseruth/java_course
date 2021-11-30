package graphics;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class FontDemo1 implements Runnable
{
    private JFrame      frame   = new JFrame( "Swing Frame Demo 3" );
      
    public static void main( String[] args )
    {
        FontDemo1 demo    = new FontDemo1();
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
            final int   margin  = 35;
            
            Graphics2D  gtx = (Graphics2D)graphics.create();
            
            int xco         = 100;
            int yco         = 100;
            
            Font    font    = gtx.getFont();
            float   size    = font.getSize() * 2;
            font = font.deriveFont( size );
            gtx.setFont(  font );
            
            gtx.setColor(  Color.BLACK );
            gtx.drawString(  "The sun was shining on the sea", xco, yco );
            
            yco += margin;
            font = font.deriveFont( Font.BOLD, size );
            gtx.setFont( font );
            gtx.setColor(  Color.RED );
            gtx.drawString( "Shining with all his might", xco, yco );
            
            yco += margin;
            font = font.deriveFont( Font.ITALIC, size );
            gtx.setFont( font );
            gtx.setColor(  Color.BLUE );
            gtx.drawString( "He did his very best to make", xco, yco );
            
            yco += margin;
            font = font.deriveFont( Font.PLAIN, size );
            gtx.setFont( font );
            gtx.setColor(  Color.DARK_GRAY );
            gtx.drawString( "The billows smooth and bright", xco, yco );
            
            int style   = Font.BOLD | Font.ITALIC;
            font = font.deriveFont(  style, size );
            yco += margin;
            gtx.setFont( font );
            gtx.setColor( Color.ORANGE );
            gtx.drawString( "And this was odd because it was", xco, yco );
            
            yco += margin;
            font = font.deriveFont( Font.PLAIN, size );
            gtx.setFont( font );
            gtx.setColor( Color.MAGENTA );
            gtx.drawString( "The middle of the night", xco, yco );
        }
    }
}
