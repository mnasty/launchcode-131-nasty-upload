package exercises2;

import cse131.ArgsProcessor;

public class CoinFlip {

	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		//
		// Use the random number generator
		//    (Math.random())
		// so that this program prints
		// heads or tails,
		// each with probability 0.5
		//
		// This program does not prompt the user
		//   for any input.  It simply prints
		// heads or tails
		//
    
	  boolean coinFlip = Math.random() >= 0.5;
	
		
	if (coinFlip = true)
	{
	    System.out.println("heads");
	}
	else
	{
		System.out.println("tails");
	}	
			
	}

}
