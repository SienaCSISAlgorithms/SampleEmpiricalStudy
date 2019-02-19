/**
   Program to perform an empirical analysis of a brute-force closest
   pairs (in 2D space) algorithm.

   @author Jim Teresco

*/

import java.awt.geom.Point2D.Double;

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
							
	
    }
}
