package uw.cp510.assignments.assignment1;

/**
 * CP510 Assignment 1
 *
 * 1. Create a Maven project
 * 2. Import the project into your IDEa
 * 3. Add this file to your project
 * 4. Complete the methods rectPerimeter, rectArea, circPerimeter and circArea.
 * 5. For an extra 10 points, complete rectPerimeterDiag and rectAreaDiag.
 */
public class Figures
{
    /**
     * Entry point.
     *
     * @param args command-line arguments, not used.
     */
    public static void main(String[] args)
    {
        double[][]  rects   = { { 5, 10 }, { 15, 6 }, { 7, 19 } };
        String      fmt     = "\tside1: %10.5f, side2: %10.5f, "
                + "peri = %10.5f, area = %10.5f%n";
        System.out.println( "Rectangles" );
        for ( double[] rect : rects )
        {
            double  side1   = rect[0];
            double  side2   = rect[1];
            double  peri    = rectPerimeter( side1, side2 );
            double  area    = rectArea( side1, side2 );
            System.out.printf( fmt, side1, side2, peri, area );
        }

        double[]    circs   = { 5, 10, 15 };
        fmt = "\tradius: %10.5f, peri = %10.5f, area = %10.5f%n";
        System.out.println( "Circles" );
        for ( double radius : circs )
        {
            double   peri    = circPerimeter( radius );
            double   area    = circArea( radius );
            System.out.printf( fmt, radius, peri, area );
        }
    }

    /**
     * Given two adjacent sides of a rectangle, compute the perimeter
     *
     * @param side1 the first side; must be greater than 0
     * @param side2 the adjacent side; must be greater than 0
     * @return the perimeter of the rectangle, or Double.NaN
     *         if either parameter is invalid
     */
    public static double rectPerimeter( double side1, double side2 )
    {
        double  peri = 0; // replace the 0 with the perimeter.
        return peri;
    }

    /**
     * Given two adjacent sides of a rectangle, computer the area
     *
     * @param side1 the first side; must be greater than 0
     * @param side2 the adjacent side; must be greater than 0
     * @return the area of the rectangle, or Double.NaN
     *         if either parameter is invalid
     */
    public static double rectArea( double side1, double side2 )
    {
        double area =  0; // replace the 0 with the area.
        return area;
    }

    /**
     * Given the radius of a circle, calculate the perimeter of the circle.
     *
     * @param radius    the given radius
     * @return the perimeter of the circle
     *
     * @param radius the radius; must be greater than 0
     * @return the perimeter of the circle, or Double.NaN
     *         if the parameter is invalid
     */
    public static double circPerimeter( double radius )
    {
        double  peri = 0; // replace the 0 with the perimeter.
        return peri;
    }

    /**
     * Given the radius of a circle, calculate the area of the circle.
     *
     * @param radius the radius of the circle; must be greater than 0
     * @return the area of the circle, or Double.NaN
     *         if the parameter is invalid
     */
    public static double circArea( double radius )
    {
        double area =  0; // replace the 0 with the area.
        return area;
    }

    ///////////////////////////////////////////////////////////////////////
    // Bonus: for an extra 10 points, complete the following methods.
    ///////////////////////////////////////////////////////////////////////

    /**
     * Given the length and slope of the diagonal of a rectangle,
     * compute the perimeter of the rectangle.
     *
     * @param diag the given length; must be greater than 0
     * @param slope the given slope; must be greater than 0
     * @return the perimeter of the rectangle, or Double.NaN
     *         if either parameter is invalid
     */
    public static double rectPerimeterDiag( double diag, double slope )
    {
        double peri  =  0; // replace the 0 with the perimeter.
        return peri;
    }

    /**
     * Given the length and slope of the diagonal of a rectangle,
     * compute the area of the rectangle.
     *
     * @param diag the given length
     * @param slope the given slope
     * @return the area of the rectangle
     */
    // Bonus: for an extra 10 points, complete the following methods.
    public static double rectAreaDiag( double diag, double slope )
    {
        double area     =  0; // replace the 0 with the area.
        return area;
    }
}