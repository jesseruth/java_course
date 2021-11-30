package constructor_demos;

public class A
{
    private int field;
    
    public A( int param )
    {
        field = param;
    }
    
    public A( String param )
    {
        field = Integer.parseInt( param );
    }
}
