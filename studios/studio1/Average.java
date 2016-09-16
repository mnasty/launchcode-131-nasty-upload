package studio1;

import cse131.ArgsProcessor;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ArgsProcessor ap = new ArgsProcessor(args);
     int n1 = ap.nextInt("Value for your first number?");
     int n2 = ap.nextInt("Value for your second number?");
     
     double result = (n1 + n2) / 2.0;
     System.out.println(result);
		
	}

}
