package exercises4;

import cse131.ArgsProcessor;

import sedgewick.StdDraw;

public class SineWave {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArgsProcessor ap = new ArgsProcessor(args);
		
		StdDraw.setXscale(0, 2 * Math.PI);
		StdDraw.setYscale(-1.0, 1.0);
		
		double points = ap.nextInt("How many points?");
		
		double xDistance = 2 * Math.PI / points;
		
		for (int i = 0; i < points; i++)
		{
			double xvalue = 2 * Math.PI * i / points;
			double yvalue = Math.sin(xvalue);
			StdDraw.point(xvalue, yvalue);
		}
		
		

	}

}
