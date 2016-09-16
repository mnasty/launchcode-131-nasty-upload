package exercises3;

public class twoD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] [] nums = new double [3] [3]; //row major order: rows always first in a 2D array

		double random = Math.random();
		int size = nums.length;
		for(int i = 0; i <= nums.length; i++) //rows
		{	
			for(int j = 0; j <= nums.length; j++) //columns
			{	
				nums [i][j] = Math.random();
			} 
		}
		double[] sums = (0, 0, 0);

		for(int i = 0; i <= nums.length; i++) //rows
		{	
			for(int j = 0; j <= nums.length; j++) //columns
			{	
				sums[j] += nums[i][j];
			} 
			for(int i = 0; i <= nums.length; i++) //rows
			{	
				for(int j = 0; j <= nums.length; j++) //columns
				{	
					System.out.println("");
				} 



			}
