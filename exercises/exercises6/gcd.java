package exercises6;

public class gcd {
	
	public static int gcd(int m, int n)
	{
		if (m < n)
		{
			int temp = n;
			n = m;
			m = temp;
		}
		if (m % n == 0)
		{
			return n;
		}
		else
		{
			return gcd(n, m % n);
		}
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(gcd(8, 12));
		
		
	}

}
