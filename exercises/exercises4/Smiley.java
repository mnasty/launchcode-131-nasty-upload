package exercises4;

import java.awt.Color;

import sedgewick.StdDraw;


public class Smiley {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//face
		StdDraw.setPenColor(Color.YELLOW);
		StdDraw.filledCircle(0.5, 0.5, 0.5);
		//border
		StdDraw.setPenColor(Color.BLACK);
		StdDraw.circle(0.5, 0.5, 0.5);
		//eyes
		StdDraw.filledCircle(0.25, 0.75, 0.1);
		StdDraw.filledCircle(0.75, 0.75, 0.1);
		//smile
		StdDraw.arc(0.5, 0.5, 0.25, 275, 315);
		//StdDraw.arc(0.5, 0.5, 0.25, 180, 0); happy smile
		StdDraw.filledCircle(0.5, 0.3, 0.2);
		//point
		StdDraw.point(0, 0);
		while (!StdDraw.mousePressed())
		{
			StdDraw.pause(100); //1000ms = 1s;
		}
		if (StdDraw.mousePressed())
		{
			//clear(Color.YELLOW);
			//face
			StdDraw.setPenColor(Color.ORANGE);
			StdDraw.filledCircle(0.5, 0.5, 0.5);
			//eyes
			StdDraw.setPenColor(Color.BLACK);
			StdDraw.filledCircle(0.25, 0.75, 0.1);
			StdDraw.filledCircle(0.75, 0.75, 0.1);
			//smile
			StdDraw.arc(0.5, 0.5, 0.25, 275, 315);
			//StdDraw.arc(0.5, 0.5, 0.25, 180, 0); happy smile
			StdDraw.filledCircle(0.5, 0.3, 0.2);
		}






	}

}
