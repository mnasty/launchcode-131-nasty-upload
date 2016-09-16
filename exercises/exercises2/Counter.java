package exercises2;


public class Counter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		int x = 0;
		
		
		for(int i = x; x <= 100; x++);
		{
			if (x % 15 == 0)
			{
			    System.out.println("fizzbuzz");
			}    
			else if (x % 3 == 0)
			{
				System.out.println("fizz");
			}
			else if (x % 5 == 0)
			{
				System.out.println("buzz");
			}
			else
			{
				System.out.println(x);
			}
		
			
	    }
		
		
				
	
	}

}
