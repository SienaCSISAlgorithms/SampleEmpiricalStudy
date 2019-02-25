/**
   Program to perform an empirical analysis of a brute-force closest
   pairs (in 2D space) algorithm.

   @author Jim Teresco

*/

import java.awt.geom.Point2D;

public class BruteForceClosestPairs {


    /**
       main method to run the empirical study

       @param args command-line parameters
       
       args[0] the number of points
       args[1] coordinate value range d (x and y will range from -d to d)
    */
    public static void main(String args[]) {

	if (args.length != 2) {
	    System.err.println("Usage: java BruteForceClosestPairs numPoints coordRange");
	    System.exit(1);
	}

	int numPoints = 0;
	try {
	    numPoints = Integer.parseInt(args[0]);
	}
	catch (NumberFormatException e) {
	    System.err.println("Could not parse " + args[0] + " as integer.");
	    System.exit(1);
	}

	double range = 0.0;
	try {
	    range = Double.parseDouble(args[1]);
	}
	catch (NumberFormatException e) {
	    System.err.println("Could not parse " + args[1] + " as double.");
	    System.exit(1);
	}
							
	// set up the array
	Point2D.Double a[] = new Point2D.Double[numPoints];
	PopulatePointArray.randomPoints(a, range);

	// perform the closest pairs search, measuring the time taken
	double closest = Double.MAX_VALUE;
	int closest_i = -1;
	int closest_j = -1;
	long dCount = 0;
	double start = System.currentTimeMillis();
	for (int i = 0; i < a.length - 1; i++) {
	    for (int j = i+1; j < a.length; j++) {
		// could use distanceSq but this is more expensive and
		// will allow meaningful timings for smaller array
		// sizes
		double d = a[i].distance(a[j]);
		dCount++;
		if (d < closest) {
		    closest = d;
		    closest_i = i;
		    closest_j = j;
		}
	    }
	}

	double elapsed = System.currentTimeMillis() - start;
	System.out.println("BFCP " + numPoints + " " + range + " " +
			   elapsed + " " + dCount + " (" +
			   closest_i + "," + closest_j + ") " + closest);
    }
}
