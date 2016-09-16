package exercises2;

import cse131.ArgsProcessor;

public class fibbonachi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArgsProcessor ap = new ArgsProcessor(args);
		
    //int uno = 1 + 1;
  
    //int ending = 0;
    
    
    //if (uno < 50)
    //{
    	//(uno + uno);
    //}
		
	int x = 0;
	int y = 1;
	int n = ap.nextInt("How many digits to print out?");
	
	
	
	for(int i = 0; i < (n - 2); i++);
	{
	    	x += y;
	    	y += x;	
	    	System.out.println(x);
	    	System.out.println(y);
	
	}
    
	}
	
}
