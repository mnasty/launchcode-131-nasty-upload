package lab6;

import java.awt.Color;

import sedgewick.StdDraw;

public class Triangles3 {
	  
	public static void triangle(double llx, double lly, double size)
	{
		double[] x = {llx, llx + size, llx + size / 2};
 		double[] y = {lly , lly, lly + size};
	
		
		if (size < 0.02)
		{
			return;
		}
		
		StdDraw.setPenColor(Color.CYAN);
		
		StdDraw.line(llx, lly, llx + size / 2, lly + size);
		StdDraw.line(llx + size / 2, lly + size , llx + size , lly);
        StdDraw.line(llx, lly, llx + size, lly);
        
        StdDraw.pause(100);
        
        if (size < 0.05)
        {
        	
        	StdDraw.filledPolygon(x, y);
        }
        
        triangle(llx, lly, size / 2);
        triangle(llx + size / 4, lly + size / 2, size / 2);
        triangle(llx + size / 2, lly, size / 2);
        
        
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		triangle(0, 0, 1);
		

	}

}
