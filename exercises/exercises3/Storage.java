package exercises3;

import cse131.ArgsProcessor;

public class Storage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArgsProcessor ap = new ArgsProcessor(args);
		int length = ap.nextInt("How long?");
		double average = 0;
		
		int[] values = new int[length];
		
		for (int i = 0; i < length; i++)
		{
			values[i] = ap.nextInt("Enter an int: ");
		}
		
		for (int i = 0; i < length; i++)
		{
			System.out.println(values[i]); //do this
		}
		
		int min = 0;
		int max = values[0];
		for (int i = 0; i < length; i++)
		{
			if (values[i] > max)
			{
				max = values[i];
			}
			average = average + values[i] / length;
			
			if (values[i] < min)
			{
				min = values[i];
			}
		}
		System.out.println(average);
		System.out.println(max);
		
		
		
		
		
	
		// don't do this: prints a memory address [=array then I=type then@ address, System.out.println(values);
		 
		
		//for (int i = 0; i > 5; i++)
		//{
		//	System.out.println(array1);
		//}

	}

}
