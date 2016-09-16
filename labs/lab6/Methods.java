package lab6;

public class Methods {

	//
	// In this class, implement the f and g functions described on the lab page
	//

	/**
	 * @param args
	 */
	public static int descending(int n)
	{
		return	n = n / n;
	}


	public static String beer(int n)
	{

		if (n == 0)
		{
			return n + " bottles of beer on the wall!";
		}
		else
		{
			return  n + " bottles of beer on the wall, " + n + " bottles of beer, take one down and pass it around"  + '\n' + beer(n-1);
			
			
			//return " "+beer(n - 1)+" "+n+""+s+"";
		}


	}
	
	public static int f(int x)
	{
		if (x > 100)
		{
			return x = x - 10;
		}
		else if (x <= 100)
		{
			return f(f(x+11));
		}
		return 999;
	}

	public static int g(int x, int y)
	{
		if (x == 0)
		{
			return y = y + 1;
		}
		else if (x > 0 && y == 0)
		{
			return g(x - 1, 1);
		}
		else if (x > 0 && y > 0)
		{
			return g(x-1, g(x, y-1));
		}
		return 999;
	}


	public static void main(String[] args) {

		//
		// from here, call f or g with the appropriate parameters
		//

		System.out.println(beer(10));
		System.out.println("");
		System.out.println(f(3));
		System.out.println("");
		System.out.println(g(4, 0)); 

	}

}
