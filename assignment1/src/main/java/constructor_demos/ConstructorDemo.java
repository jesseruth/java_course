package constructor_demos;

public class ConstructorDemo
{
    private long    creationTime;

    public ConstructorDemo()
    {
        creationTime = System.currentTimeMillis();
    }
    
    public long getRuntime()
    {
        long    runTime = System.currentTimeMillis() - creationTime;
        return runTime;
    }
}
