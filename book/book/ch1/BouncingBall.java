package book.ch1;
import java.awt.Color;

import cse131.ArgsProcessor;
import sedgewick.*;
/*************************************************************************
 *  Compilation:  javac BouncingBall.java
 *  Execution:    java BouncingBall
 *  Dependencies: StdDraw.java
 *
 *  Implementation of a 2-d bouncing ball in the box from (-1, -1) to (1, 1).
 *
 *  % java BouncingBall
 *
 *************************************************************************/

public class BouncingBall { 
    public static void main(String[] args) {
    	
    	ArgsProcessor ap = new ArgsProcessor(args);
    	int pause = ap.nextInt("Enter pause time:");

        // set the scale of the coordinate system
        StdDraw.setXscale(-1.0, 1.0);
        StdDraw.setYscale(-1.0, 1.0);

        // initial values
        double rx = 0.480, ry = 0.860;     // position
        double vx = 0.015, vy = 0.023;     // velocity
        double radius = 0.05;              // radius

        // main animation loop
        while (true)  { 

            // bounce off wall according to law of elastic collision
            if (Math.abs(rx + vx) > 1.0 - radius) vx = -vx;
            if (Math.abs(ry + vy) > 1.0 - radius) vy = -vy;

            // update position
            rx = rx + vx; 
            ry = ry + vy; 

            // clear the background
            StdDraw.setPenColor(StdDraw.GRAY);
            StdDraw.filledSquare(0, 0, 1.0);

            // draw ball on the screen
            StdDraw.setPenColor(StdDraw.BLACK); 
            StdDraw.filledCircle(rx, ry, radius);
            if (rx <= .500 && ry <= .500)
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
            	StdDraw.setPenRadius();
        		StdDraw.setPenColor(StdDraw.BOOK_BLUE);
        		double[] x = { .1, .2, .3, .2 };
        		double[] y = { .2, .3, .2, .1 };
        		StdDraw.filledPolygon(x, y);
            }
            
           
            
            // display and pause for 20 ms
            StdDraw.show(pause); 
        } 
    } 
} 
