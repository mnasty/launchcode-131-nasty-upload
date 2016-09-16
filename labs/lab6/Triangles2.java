package lab6;

import sedgewick.StdDraw;

public class Triangles2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//triangle 1 location coordinate definitions for lines
		//done like this so they can be recursively divided later
		//any coordinates that were 0.0 are left out and explicitly defined, because they will always be 0.0

		//triangle 1 coordinates
		//{
		double onetlinesx1 = 1.0;

		double twotlinesx0 = 1.0;
		double twotlinesx1 = 0.5;
		double twotlinesy1 = 1.0;

		double threetlinesx0 = 0.5;
		double threetlinesy0 = 1.0;
		//}

		//triangle 2 coordinates
		//{
		double oneleftdivx0 = 0.5;
		double oneleftdivx1 = 0.25;
		double oneleftdivy1 = 0.5;

		double twoleftdivx0 = 0.25;
		double twoleftdivy0 = 0.5;
		double twoleftdivx1 = 0.75;
		double twoleftdivy1 = 0.5;

		double onerightdivx0 = 0.75;
		double onerightdivy0 = 0.5;
		double onerightdivx1 = 0.5;
		//}

		//triangle 3 (and related coordinates
		//{
        double onetrithreex0 = 0.5;
        double onetrithreey0 = 1.0;
        double onetrithreex1 = 0.75;
        double onetrithreey1 = 0.5;

        double twotrithreex0 = 0.5;
        double twotrithreey0 = 1.0;
        double twotrithreex1 = 0.25;
        double twotrithreey1 = 0.5;
        
        double threetrithreex0 = 0.375;
        double threetrithreey0 = 0.75;
        double threetrithreex1 = 0.625;
        double threetrithreey1 = 0.75;
        
        double fourmidthreex0 = 0.375;
        double fourmidthreey0 = 0.75;
        double fourmidthreex1 = 0.5;
        double fourmidthreey1 = 0.5;
        
        double fivemidthreex0 = 0.5;
        double fivemidthreey0 = 0.5;
        double fivemidthreex1 = 0.625;
        double fivemidthreey1 = 0.75;
		//}
        
        //triangle 4
        //{
        double onefourx0 = 0.625;
        double onefoury0 = 0.25;
        double onefourx1 = 0.875;
        double onefoury1 = 0.25;
        
        double twofourx0 = 0.75;
        double twofourx1 = 0.625;
        double twofoury1 = 0.25;
        
        double threefourx0 = 0.75;
        double threefourx1 = 0.875;
        double threefoury1 = 0.25;
        //}

		int x = 0;

		//triangle 1 draw
		while (x < 6)
		{
			//triangle 1 (outside)
			StdDraw.line(0.0, 0.0, onetlinesx1, 0.0);
			StdDraw.line(twotlinesx0, 0.0, twotlinesx1, twotlinesy1);
			StdDraw.line(threetlinesx0, threetlinesy0, 0.0, 0.0);

			//triangle 2 (middle one)
			//dividing lines left side
			StdDraw.line(oneleftdivx0, 0.0, oneleftdivx1, oneleftdivy1);
			StdDraw.line(twoleftdivx0, twoleftdivy0, twoleftdivx1, twoleftdivy1);
			//dividing line right side
			StdDraw.line(onerightdivx0, onerightdivy0, onerightdivx1, 0);

			//triangle 3 (top triangle)
			//StdDraw.line(onetrithreex0, onetrithreey0, onetrithreex1, onetrithreey1);
			//StdDraw.line(twotrithreex0, twotrithreey0, twotrithreex1, twotrithreey1);
			//middle within top
			StdDraw.line(threetrithreex0, threetrithreey0, threetrithreex1, threetrithreey1);
			StdDraw.line(fourmidthreex0, fourmidthreey0, fourmidthreex1, fourmidthreey1);
			StdDraw.line(fivemidthreex0, fivemidthreey0, fivemidthreex1, fivemidthreey1);
			
			//triangle 4 (bottom right side)
			StdDraw.line(onefourx0, onefoury0, onefourx1, onefoury1);
			StdDraw.line(twofourx0, 0.0, twofourx1, twofoury1);
			StdDraw.line(threefourx0, 0.0, threefourx1, threefoury1);
			
			//triangle 5 (inside top top)
			StdDraw.line(0.5, 0.8, 0.6, 0.8);

			//divide all non 0.0 variables by 2 to recursively create triangles within themselves
			onetlinesx1 = onetlinesx1 / 2;

			twotlinesx0 = twotlinesx0 / 2;
			twotlinesx1 = twotlinesx1 / 2;
			twotlinesy1 = twotlinesy1 / 2;

			threetlinesx0 = threetlinesx0 / 2;
			threetlinesy0 = threetlinesy0 / 2;

			oneleftdivx0 = oneleftdivx0 / 2;
			oneleftdivx1 = oneleftdivx1 / 2;
			oneleftdivy1 = oneleftdivy1 / 2;

			twoleftdivx0 = twoleftdivx0 / 2;
			twoleftdivy0 = twoleftdivy0 / 2;
			twoleftdivx1 = twoleftdivx1 / 2;
			twoleftdivy1 = twoleftdivy1 / 2;

			onerightdivx0 = onerightdivx0 / 2;
			onerightdivy0 = onerightdivy0 / 2;
			onerightdivx1 = onerightdivx1 / 2;
			
			onetrithreex0 = onetrithreex0 / 2;
	        onetrithreey0 = onetrithreey0 / 2;
	        onetrithreex1 = onetrithreex1 / 2;
	        onetrithreey1 = onetrithreey1 / 2;

	        twotrithreex0 = twotrithreex0 / 2;
	        twotrithreey0 = twotrithreey0 / 2;
	        twotrithreex1 = twotrithreex1 / 2;
	        twotrithreey1 = twotrithreey1 / 2;
	        
	        threetrithreex0 = threetrithreex0 / 2;
	        threetrithreey0 = threetrithreey0 / 2;
	        threetrithreex1 = threetrithreex1 / 2;
	        threetrithreey1 = threetrithreey1 / 2;
	        
	        fourmidthreex0 = fourmidthreex0 / 2;
	        fourmidthreey0 = fourmidthreey0 / 2;
	        fourmidthreex1 = fourmidthreex1 / 2;
	        fourmidthreey1 = fourmidthreey1 / 2;
	        
	        fivemidthreex0 = fivemidthreex0 / 2;
	        fivemidthreey0 = fivemidthreey0 / 2;
	        fivemidthreex1 = fivemidthreex1 / 2;
	        fivemidthreey1 = fivemidthreey1 / 2;
	        
	        onefourx0 = onefourx0 / 2;
	        onefoury0 = onefoury0 / 2;
	        onefourx1 = onefourx1 / 2;
	        onefoury1 = onefoury1 / 2;
	        
	        twofourx0 = twofourx0 / 2;
	        twofourx1 = twofourx1 / 2;
	        twofoury1 = twofoury1 / 2;
	        
	        threefourx0 = threefourx0 / 2;
	        threefourx1 = threefourx1 / 2;
	        threefoury1 = threefoury1 / 2;

			//count the number of times to run the loop to determine stopping point (base case)
			x = x + 1;
		}

		/*
		 *  onetlinesx1 = onetlinesx1 * 4;

			twotlinesx0 = twotlinesx0 * 4;
			twotlinesx1 = twotlinesx1 * 4;
			twotlinesy1 = twotlinesy1 * 4;

			threetlinesx0 = threetlinesx0 * 4;
			threetlinesy0 = threetlinesy0 * 4;

			oneleftdivx0 = oneleftdivx0 * 4;
			oneleftdivx1 = oneleftdivx1 * 4;
			oneleftdivy1 = oneleftdivy1 * 4;

			twoleftdivx0 = twoleftdivx0 * 4;
			twoleftdivy0 = twoleftdivy0 * 4;
			twoleftdivx1 = twoleftdivx1 * 4;
			twoleftdivy1 = twoleftdivy1 * 4;

			onerightdivx0 = onerightdivx0 * 4;
			onerightdivy0 = onerightdivy0 * 4;
			onerightdivx1 = onerightdivx1 * 4;
			
			onetrithreex0 = onetrithreex0 * 4;
	        onetrithreey0 = onetrithreey0 * 4;
	        onetrithreex1 = onetrithreex1 * 4;
	        onetrithreey1 = onetrithreey1 * 4;

	        twotrithreex0 = twotrithreex0 * 4;
	        twotrithreey0 = twotrithreey0 * 4;
	        twotrithreex1 = twotrithreex1 * 4;
	        twotrithreey1 = twotrithreey1 * 4;
	        
	        threetrithreex0 = threetrithreex0 * 4;
	        threetrithreey0 = threetrithreey0 * 4;
	        threetrithreex1 = threetrithreex1 * 4;
	        threetrithreey1 = threetrithreey1 * 4;
	        
	        fourmidthreex0 = fourmidthreex0 * 4;
	        fourmidthreey0 = fourmidthreey0 * 4;
	        fourmidthreex1 = fourmidthreex1 * 4;
	        fourmidthreey1 = fourmidthreey1 * 4;
	        
	        fivemidthreex0 = fivemidthreex0 * 4;
	        fivemidthreey0 = fivemidthreey0 * 4;
	        fivemidthreex1 = fivemidthreex1 * 4;
	        fivemidthreey1 = fivemidthreey1 * 4;
		 */
	}

}
