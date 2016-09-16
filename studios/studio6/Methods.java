package studio6;

public class Methods {
	
	// Your methods go below this line
	
	public static int sum(int a, int b)
	{
		if (b < 1)
		{
			return a;
		}
		else
		{
			return sum(a + 1, b - 1);
		}
		
	}
	
	public static int fact(int n)
	{
		if (n <= 1)
		{
			return 1;
		}
		else
		{
			return n * fact(n - 1);	
		}

	}
	
	public static int fib(int n)
	{
		if (n <= 0)
		{
			return 0;
		}
		else if (n == 1)
		{
			return 1;
		}
		else
		{
			return fib(n - 1) + fib(n - 2);
		}
	}
	
	public static boolean isOdd(double n)
	{
		if (n == 0)
		{
			return false;
		}
		else if (n == 1)
		{
			return true;
		}
		else
		{
			return !isOdd(n-1);	
		}
		
		/*
		if (n % 2 == 0)
		{
			return false;
		}
		else
		{
			return true;
		}
		*/
		
	}

	public static int SumDownBy2(int n)
	{
		if (n >= 0)
		{
			int x = n;
			int y = n;
		}
		else
		{
			SumDownBy2();
		}
		
		
		
	}

	
	
	
	
}
