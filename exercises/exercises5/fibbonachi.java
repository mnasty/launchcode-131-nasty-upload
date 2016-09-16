package exercises5;

import java.util.Arrays;

public class fibbonachi {

	public static int[] fibbonachi(int a)
	{
		int x = 1;
		int y = 1;
		int[] fibo = new int [a];
		
		if (a > 0)
		{
			fibo[0] = 1;
		}
		if (a > 1)
		{
			fibo[1] = 1;
		}
		
		
		for (int i = 2; i < a; i++)
		{
		fibo[i] = fibo[i - 1] + fibo[i - 2];
		}
		return fibo;
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] result = (fibbonachi(9));
        System.out.println(Arrays.toString(result));
		
		
		
	}

}
