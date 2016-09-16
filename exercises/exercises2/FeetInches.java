package exercises2;

import cse131.ArgsProcessor;

public class FeetInches {
  
	public static void main(String[] args) {
    ArgsProcessor ap = new ArgsProcessor(args);
		//
		// Prompt the user for a number of inches
		//
		// Convert that into feet and inches
		//   BUT
		// Be sure to use the singular "foot" or "inch"
		//   where appropriate, as discussed in
		//   the introductory video
		//
		// For example, 61 inches would produce
		//    the output
		//   5 feet and 1 inch
		//
    int numberInches = ap.nextInt();
    
    int numberFeet = (numberInches / 12);
    int leftInches = (numberFeet * 12 - numberInches);
    
    
    
	}

}
