package exercises5;

public class inClass5 {

	public static int factorial(int a)
	{
		int x = 0;
		int y = a;

		if (a <= 0)
		{
			return 0;
		}
		if (a == 1)
		{
			return a;	                                                                                             
		}
		else
		{
			for (int i = 0; i < y ; i++)
			{
				x = a * a - 1;
				a = a - 1;
			}
			System.out.println(x);
			return x;
		}

	}
		public static void main(String[] args) 
		{
         System.out.println(factorial(4));
			

		}
	}





