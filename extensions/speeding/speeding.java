package speeding;

import cse131.ArgsProcessor;

public class speeding {
	public static void main(String[] args) {
	ArgsProcessor ap = new ArgsProcessor(args);
    int actualSpeed = ap.nextInt("What was the speed of the offending driver?");
    int speedLimit = ap.nextInt("What was the speed limit in the offending area?");
    int diffCalc = actualSpeed - speedLimit;
    
    int costCalc = (diffCalc >= 10) ? 50 + 10 * (diffCalc - 10) : 0;
    		
    System.out.println("For any offense 10mph over the speed limit, the base fine is automatically $50");
    System.out.println("You reported the speed of the offending driver as " + actualSpeed + ", while the speed limit was " + speedLimit + "");
    System.out.println("The offending driver went a total of " + diffCalc + " MPH over the speed limit. The total fine is " + costCalc + "");
    
	
	
	}

}