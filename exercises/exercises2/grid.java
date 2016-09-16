package exercises2;

import cse131.ArgsProcessor;

public class grid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArgsProcessor ap = new ArgsProcessor(args);
		
		//int gridWidth = ap.nextInt("Please enter the width of the grid you want to create:");
		//int gridLength = ap.nextInt("Please enter the length of the grid you want to create:");
		
		//for (gridMathone = gridWidth; ) 
				
				//for every grid length print one *
		
		int length = ap.nextInt("What length?");
		int width = ap.nextInt("What width");
		
		
		
		for (int i = 0; i < length; i++)
		{
			for (int j = 0; j < width; j++){
				System.out.println("*");
			}
			System.out.println("");
		}
		
		
		
		//System.out.println("******");
		//System.out.println("******");
		//System.out.println("******");
		//System.out.println("******");
		
		
		
	}

}
