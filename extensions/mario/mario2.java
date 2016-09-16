package mario;

import cse131.ArgsProcessor;

public class mario2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArgsProcessor ap = new ArgsProcessor(args);
		
		int a = ap.nextInt("How many total rows? (max = 5)");
		int b = ap.nextInt("How many total columns? (max = 5");
		
		int r = ap.nextInt("How many blocks in a row? (max = 5)");
		int c = ap.nextInt("How many blocks in a column? (max = 5)");
		
		String one = "#";
		String two = "##";
		String three = "###";
		String four = "####";
		String five = "#####";
		
		
		if (a == 1 && b == 1 && r == 1 && c == 1)
		{
		System.out.println(one);
		}
		else if (a == 1 && b == 1 && r == 1 && c == 2)
		{
			System.out.println(two);
		}
		else if (a == 1 && b == 1 && r == 1 && c == 3)
		{
			System.out.println(three);
		}
		else if (a == 1 && b == 1 && r == 1 && c == 4)
		{
			System.out.println(four);
		}
		else if (a == 1 && b == 1 && r == 1 && c == 5)
		{
			System.out.println(five);
		}
		else if (a == 2 && b == 2 && r == 2 && c == 1)
		{
			System.out.println(one);
			System.out.println(two);
		}
		else if (a == 2 && r == 2 && c == 2)
		{
			
		}
			
		
		
		
		
	}	
		
}
