package exercises4;

import cse131.ArgsProcessor;

import sedgewick.StdDraw;

public class Sinewavemotion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArgsProcessor ap = new ArgsProcessor(args);

		StdDraw.setXscale(0, 2 * Math.PI);
		StdDraw.setYscale(-1.0, 1.0);
		
		double points = ap.nextInt("How many points?");
		double xDistance = 2 * Math.PI / points;
		double[] pointsArray = new double [(int)points];
		int startingPos = 0;
		
		for (int i = 0; i < points; i++)
		{
			
		}
		
		while (true)
		{//OPEN
			
			//clear
			StdDraw.clear();
			
			for (int i = 0; i < points; i++)
		{
			StdDraw.point(xDistance * i, pointsArray[startingPos]);	
			double xvalue = 2 * Math.PI * i / points;
			double yvalue = Math.sin(xvalue);
			StdDraw.point(xvalue, yvalue);
			
			if (i == points)
			{
				i = 0;
			}
			
		}

		
		}//CLOSE


	}

}

