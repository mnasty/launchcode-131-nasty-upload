package lab5;

public class Lab5Methods {

	public static int sumDownBy2(int n)
	{
		if (n >= 0)
		{
			int x = n;
			int y = n;

			while (x > 1)
			{
				x = x - 2;
				y = y + x;
			}
			return y;
		}
		else
		{
			return 0;
		}
	}


	public static double harmonicSum(int n)
	{	
		double sum = 0;
		while (n > 0)
		{
			sum = sum + (1.0 / n);
			n--;
		}
		return sum;
	}

	///
	public static double geometricSum(int k)
	{	
		double sum = 0;
		while (k >= 0)
		{
			sum += (1 / Math.pow(2, k));
			k--;
		}
		return sum;
	}


	public static int multPos(int j, int k)
	{
		int x = j;
		int y = k;

		int sum = 0;

		int i = 0;

		while (i < x)
		{
			sum += y;
			i = i + 1;
		}

		return sum;
	}

	public static int mult(int j, int k)
	{
		int x = multPos(Math.abs(j), Math.abs(k));

		if (j < 0 && k < 0)
		{
			return Math.abs(x);
		}
		else if (j < 0 || k < 0)
		{
			x = x - multPos(x, 2);
			return x;
		}
		else
		{
			return x;
		}
	}

	public static int expt(int n, int k)
	{

		if (k < 1)
		{	
			return 1;	
		}
		else
		{
		    return n * expt(n, k - 1);	
		}


	}

}



