
public class modulousInclass {
	
	public static int modulous(int a, int b)
	{
		int goesInto = a / b;
		int goesIntoValue = goesInto * b;
		return a - goesIntoValue;	
	}


	public static boolean isEven(int a)
	{
		if (modulous(a, 2) == 0)
		{
			return true; 
		}
		else
		{
			return false;
		}
	}


	public static boolean arrayLength(double[] array1 , double[] array2)
	{
		if (array1.length == array2.length)
		{
			for (int i = 0; i < array1.length; i++)
			{
				if (array1[i] == array2[i])
				{
					return true;
				}
				else
				{
					return false;
				}
			}
		}
		
		return false;
	}

	
	public static int letterDup(String s, char c)
	{
		int count = 0;
		
		for (int i = 0; i < s.length(); i++)
		{
			 
			if (s.charAt(i) == c)
			{
				count = count + 1;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(modulous(8, 3));
		System.out.println(isEven(4));
		System.out.println(letterDup("google", 'g'));
		/*
		int rem = a;
		if (a > b)
		{
			do
			{
				rem -= b;
			} while (rem > b);

         return rem;
		}
		 */

	}


}
