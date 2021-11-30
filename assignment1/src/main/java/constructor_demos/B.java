package constructor_demos;

public class B extends A
{
    public B( double param )
    {
        super( (int)(param + .5) );
    }
}
