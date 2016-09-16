package lab4;

import java.awt.Color;

import cse131.ArgsProcessor;
import sedgewick.StdDraw;

public class BumpingBalls {

	public static void main(String[] args) {

		ArgsProcessor ap = new ArgsProcessor(args);
		int totalBalls = ap.nextInt("How many balls for the simulation?");
		int iterations = ap.nextInt("How many times do you want to run this simulation?");

		// set the scale of the coordinate system
		StdDraw.setXscale(-1.0, 1.0);
		StdDraw.setYscale(-1.0, 1.0);

		//create array here to store the ball initial values individually
		double[] ballPositionx = new double[totalBalls];
		double [] ballPositiony = new double [totalBalls];
		double[] ballVelocityx = new double [totalBalls]; 
		double [] ballVelocityy = new double [totalBalls];

		double radius = 0.05;  // radius

		//set array initial values loop
		for (int i = 0; i < totalBalls; ++i)
		{
			// random values generate
			double rx = Math.random(), ry = Math.random();     // position
			double vx = Math.random() / 20, vy = Math.random() / 20;     // velocity   
			
			// random values assign
			ballPositionx[i] = rx;
			ballPositiony[i] = ry;
			ballVelocityx[i] = vx;
			ballVelocityy[i] = vy;
		}
		
		// main animation loop
		for (int j = 0; j < iterations; j++) 
		{ //OPEN 
			
			// clear the background
			StdDraw.clear();
			StdDraw.setPenColor(StdDraw.GRAY);
			StdDraw.filledSquare(0, 0, 1.0);
			

			for (int k = 0; k < totalBalls; k++)
			{
				// bounce off wall
				if (Math.abs(ballPositionx[k] + ballVelocityx[k]) > 1.0 - radius) ballVelocityx[k] = -ballVelocityx[k];
				if (Math.abs(ballPositiony[k] + ballVelocityy[k]) > 1.0 - radius) ballVelocityy[k] = -ballVelocityy[k];

				// update position
				ballPositionx[k] = ballPositionx[k] + ballVelocityx[k]; 
				ballPositiony[k] = ballPositiony[k] + ballVelocityy[k]; 

				// draw ball on the screen (only once)
				StdDraw.setPenColor(StdDraw.CYAN); 
				StdDraw.filledCircle(ballPositionx[k], ballPositiony[k], radius);
				
				//collision
				for (int l = 0; l < totalBalls; l++)
				{
					double distance = 0;
					distance = Math.sqrt(Math.pow(ballPositionx[l] - ballPositionx[k], 2) + Math.pow(ballPositiony[l] - ballPositiony[k], 2));
					
					if (distance <= 2 * radius)
					{
						ballVelocityx[k] = -ballVelocityx[k];
						ballVelocityy[k] = -ballVelocityy[k];
						ballVelocityx[l] = -ballVelocityx[l];
						ballVelocityy[l] = -ballVelocityy[l];
						
					}
				}
	
			}
			
			//display and pause for 10 ms
		    StdDraw.show(10);
		
		} //CLOSE
		
		
		
		//my modifications
		/* if (rx <= .500 && ry <= .500)
            {
            	StdDraw.setPenColor(Color.CYAN);
            	StdDraw.filledCircle(rx, ry, radius);	
            }
            else if (rx >= .399 && ry >= .399)
            {
            	StdDraw.setPenColor(Color.GREEN);
            	StdDraw.filledRectangle(rx, ry, radius, radius);	
            }
            else if (rx >= .225 && ry >= .125) //*
            {
            	//add ratchet diamond shape from stddraw
            	StdDraw.setPenRadius();
        		StdDraw.setPenColor(StdDraw.BOOK_BLUE);
        		double[] x = { .1, .2, .3, .2 };
        		double[] y = { .2, .3, .2, .1 };
        		StdDraw.filledPolygon(x, y);
            }
		 */



	} 
} 






