package studio3;

import cse131.ArgsProcessor;

public class Sievething {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArgsProcessor ap = new ArgsProcessor(args);
		int arraySize = ap.nextInt("Enter the size of the array:");
		int[] n = new int [arraySize];


		for (int i = 0; i < arraySize; i++) //initiate values
		{
			n[i] = i + 2;
		}

		for (int i = 0; i < arraySize; i++)
		{   	

			//System.out.println(n[i]);

			if (n[i] != 0){
				for (int j = 0; j < arraySize; j++)
				{

					if(n[j] % n[i] == 0 && n[j] != n[i])
					{
						n[j] = 0;
					}


				}
			}

		}// end outer for loop


		for (int i = 0; i < arraySize; i++)
		{
			//if (n[i] != 0)
			//{
			System.out.println(n[i]);
			//}
		}





		/*   
    for (int i = 2; i > length; i++)


	if (store % 2 == 0 && store != 2)	
	{		

		 */
	}

}
