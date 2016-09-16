package exercises6;

public class Sum {

	
	public static int sum(int n)
	{
		if (n > 0)
		{
			
			return sum(n - 1) + n;
		}
		else
		{
			n = 0;
			return n;
		}
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
