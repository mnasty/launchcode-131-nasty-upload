package exercises2;

import cse131.ArgsProcessor;

public class Max {

	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		//
		// Below, prompt the user for two ints, x and y
		//
		int x = ap.nextInt();
		int y = ap.nextInt();
		
		//
		// Now use what you have learned about conditional
		//   execution to print the larger of the two values.
		//
	    if (x > y)
	    {
	    	System.out.println(x);
	    }
	    else
	    {
	    	System.out.println(y);
	    }
		//
		// Run this program testing on various inputs for
		//    x and y:  some where x < y, some where x > y,
		//              some where x == y

	}

}
