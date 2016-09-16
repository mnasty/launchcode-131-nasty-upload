package exercises2;

import cse131.ArgsProcessor;

public class InClassMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArgsProcessor ap = new ArgsProcessor(args);
		
		int x = ap.nextInt();
		int y = ap.nextInt();
		
		
	    if (x > y)
	    {
	    	System.out.println(x);
	    }
	    else
	    {
	    	System.out.println(y);
	    }
		

	}

}
