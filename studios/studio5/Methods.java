package studio5;

public class Methods {
	
	/**
	 * Implemented correctly
	 * @param x one thing to add
	 * @param y the other thing to add
	 * @return the sum
	 */
	public static int sum(int x, int y) {
		if(x < 0 && y < 0)
		{
			return Math.abs(x + y);
		}
		if (x < 0)
		{
			return y - x;
		}
		if (y < 0)
		{
			return x - y;
		}
		return x + y;
		
	}
	
	/**
	 * 
	 * @param x one factor
	 * @param y another factor
	 * @return the product of the factors
	 */
	public static int mpy(int x, int y) {
		int z = x * y;
		return z;
	}
	
	/**
	 * @param a one number
	 * @param b one number
	 * @param c one number
	 * @param y sum of numbers
	 * @param z computes and stores the average of the 3 #'s
	 */
    public static int avg3(int a, int b, int c)
    {
    	int y = a + b + c;
    	int z = y / 3;
    	return z;
    }
    
    
    
    /**
     * 
     */
    public static double sumArray(double[] array1)
    {
    	double sum = 0.0;
    	for (int i = 0; i < array1.length; i++)
    	{
    		sum = sum + array1[i];
    	}
    	return sum;
    }
    
    /**
     * 
     */
    public static double average(double[] array1)
    {
    	double x = sumArray(array1) / array1.length;
    	return x;
    }
    
    /**
     * 
     */
    public static String compliment(String name)
    {
    	if (name == "Mick" || name == "TJ" || name == "Ji")
    	{
    		return "Nice code";
    	}
    	else
    	{
    		return "Have a good day.";
    	}
    }
    
    /**
     * 
     */
    public static String pig(String s)
    {
    	String first = s.substring(0,1);
    	return s.substring(1) + first + "ay";
    	
    	
    }
    
    

}
