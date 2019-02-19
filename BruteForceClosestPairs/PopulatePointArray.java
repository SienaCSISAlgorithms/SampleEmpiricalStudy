/**
   Static methods to populate an array of points in 2 dimensions

   @author Jim Teresco
*/


import java.awt.geom.Point2D;
import java.util.Arrays;
import java.util.Random;

public class PopulatePointArray {

    public static Random r = new Random();
    
    /**
       Fill the given array with random points in the range of -d to +d.

       @param a the array to populate with points
       @param d the maximum distance from the origin in each dimension
    */
    public static void randomPoints(Point2D.Double a[], double d) {

	for (int i = 0; i < a.length; i++) {
	    a[i] = new Point2D.Double(r.nextDouble() * 2 * d - d,
				      r.nextDouble() * 2 * d - d);
	}
    }

    /**
       simple test main method

       @param args not used
    */
    public static void main(String args[]) {

	Point2D.Double a1[] = new Point2D.Double[10];
	randomPoints(a1, 10);
	System.out.println("a1: " + Arrays.toString(a1));

    	Point2D.Double a2[] = new Point2D.Double[20];
	randomPoints(a2, 1.0);
	System.out.println("a2: " + Arrays.toString(a2));
    }
}
