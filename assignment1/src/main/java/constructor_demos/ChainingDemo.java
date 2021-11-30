package constructor_demos;

import java.awt.Color;

public class ChainingDemo
{
    private Color   color;
    private double  length;
    private double  height;
    
    public ChainingDemo( double length, double height )
    {
        this( Color.BLACK, length, height );
    }
    
    public ChainingDemo( Color color, double side )
    {
        this( color, side, side );
    }
    
    public ChainingDemo( Color color, double length, double height )
    {
        this.color = color;
        this.length = length;
        this.height = height;
    }
}
