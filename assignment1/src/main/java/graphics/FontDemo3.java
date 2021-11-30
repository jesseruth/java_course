package graphics;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.font.TextAttribute;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class FontDemo3 implements Runnable
{
    private JFrame      frame   = new JFrame( "Swing Frame Demo 3" );
      
    public static void main( String[] args )
    {
        FontDemo3 demo    = new FontDemo3();
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
            
            int     xco     = 50;
            int     yco     = 100;            
            Font    font    = gtx.getFont();
            int     size    = font.getSize() * 2;
            Map<TextAttribute, Object>  textMap     = new HashMap<>();
            
            textMap.put( TextAttribute.SIZE, size );
            font = font.deriveFont(  textMap );
            gtx.setFont(  font );            
            gtx.setColor(  Color.BLACK );
            gtx.drawString(  "The sun was shining on the sea", xco, yco );
            
            yco += margin;
            textMap.put( TextAttribute.WEIGHT, TextAttribute.WEIGHT_BOLD );
            font = font.deriveFont( textMap );
            gtx.setFont( font );
            gtx.setColor(  Color.RED );
            gtx.drawString( "Shining with all his might", xco, yco );
            
            yco += margin;
            textMap.put(  TextAttribute.STRIKETHROUGH, true );
            font = font.deriveFont( textMap );
            gtx.setFont( font );
            gtx.setColor(  Color.BLUE );
            gtx.drawString( "He did his very best to make", xco, yco );
            
            yco += margin;
            textMap.put(  TextAttribute.STRIKETHROUGH, false );
            float   widthStyle  = TextAttribute.WIDTH_SEMI_EXTENDED;
            textMap.put(  TextAttribute.WIDTH, widthStyle );
            font = font.deriveFont( textMap );
            gtx.setFont( font );
            gtx.setColor(  Color.BLUE );
            gtx.drawString( "The billows smooth and bright", xco, yco );
            
            yco += margin;
            textMap.put(  TextAttribute.WIDTH, TextAttribute.WIDTH_REGULAR );
            textMap.put(  TextAttribute.SIZE, size );
            int underStyle  = TextAttribute.UNDERLINE_LOW_TWO_PIXEL;
            textMap.put( TextAttribute.UNDERLINE, underStyle );
            font = font.deriveFont( textMap );
            gtx.setFont( font );
            gtx.setColor( Color.ORANGE );
            gtx.drawString( "And this was odd because it was", xco, yco );
            
            yco += margin;
            textMap.put( TextAttribute.UNDERLINE, -1 );
            textMap.put( TextAttribute.POSTURE, TextAttribute.POSTURE_OBLIQUE );
            font = font.deriveFont( textMap );
            gtx.setFont( font );
            gtx.setColor( Color.MAGENTA );
            gtx.drawString( "The middle of the night", xco, yco );
        }
    }
}
