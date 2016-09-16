package lab6;

import java.awt.Color;

import sedgewick.StdDraw;

public class Triangles {

	//function to draw and calculate new triangle
	public static double tlines(double x0, double y0, double x1, double y1)
	{
		StdDraw.setXscale(0.0, 1.0);
		StdDraw.setYscale(0.0, 1.0);

		StdDraw.setPenColor(Color.BLACK);
        
		//triangle side x
		StdDraw.line(x0, y0, x1, y1);
		
		if (x0 == 0.0)
		{
			x0 = 0.0;
		}
		else
		{
			x0 = x0 - .02;
		}
		//////call 2
		if (y0 == 0.0)
		{
			y0 = 0.0;
		}
		else
		{
			y0 = y0 - .02;
		}
		/////call 3
		if (x1 == 0.0)
		{
			x1 = 0.0;
		}
		else
		{
			x1 = x1 - .02;
		}
		////// call 4
		if (y1 == 0.0)
		{
			y1 = 0.0;
		}
		else
		{
			y1 = y1 - .02;
		}

		//recursive call
		return tlines(x0, y0, x1, y1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StdDraw.setXscale(0.0, 1.0);
		StdDraw.setYscale(0.0, 1.0);

		StdDraw.setPenColor(Color.BLACK);
		
		//tlines(0.0, 0.0, 1.0, 0.0);
		tlines(1.0, 0.0, 0.5, 1.0);
		tlines(0.5, 1.0, 0.0, 0.0);
		
	

	}
	//double t = Math.sqrt(3.0) / 2.0;
	//StdDraw.point(0.5, t/3.0);
	
	
	/*
	 * 
	 * 	//triangle 1
		double onetlinesx0 = 0.0;
		double onetlinesy0 = 0.0;
		double onetlinesx1 = 1.0;
		double onetlinesy1 = 0.0;
		
		double twotlinesx0 = 1.0;
		double twotlinesy0 = 0.0;
		double twotlinesx1 = 0.5;
		double twotlinesy1 = 1.0;
		
		double threetlinesx0 = 0.5;
		double threetlinesy0 = 1.0;
		double threetlinesx1 = 0.0;
		double threetlinesy1 = 0.0;
		
	tlines(0.0, 0.0, onetlinesx1, 0.0);
		tlines(twotlinesx0, 0.0, twotlinesx1, twotlinesy1);
		tlines(threetlinesx0, threetlinesy0, 0.0, 0.0);
		
			int x = 0;
		//triangle 1 draw
		while (x < 20)
		{
		
		
		onetlinesx1 = onetlinesx1 / 2;
		twotlinesx0 = twotlinesx0 / 2;
		twotlinesx1 = twotlinesx1 / 2;
		twotlinesy1 = twotlinesy1 / 2;
		threetlinesx0 = threetlinesx0 / 2;
		threetlinesy0 = threetlinesy0 / 2;
		
		x = x + 1;
		}
*/
}
