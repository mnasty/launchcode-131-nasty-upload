package lab3;

import java.util.Arrays;

import cse131.ArgsProcessor;

public class Dice3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArgsProcessor ap = new ArgsProcessor(args);
		int d = ap.nextInt("How many dice will you hold?");
		int t = ap.nextInt("How many times will you throw the dice?");
		int[] diceNumber = new int [d];
		int[] sums = new int [d * 6 + 1];
		int f = 0;
		int a = 0;
		int same = -1;
		int allSame = 0;


		while (t > a)
		{//open  

			a = a + 1; //count the number of actual iterations (a)

			for (int j = 0; j < d; j++)
			{
				double randP1 = Math.random()*6;

				if (randP1 <= 1)
				{
					diceNumber[j] = 1;
				}
				else if (randP1 > 1 && randP1 <= 2)
				{
					diceNumber[j] = 2;
				}
				else if (randP1 > 2 && randP1 <= 3)
				{
					diceNumber[j] = 3;
				}
				else if (randP1 > 3 && randP1 <= 4)
				{
					diceNumber[j] = 4;
				}
				else if (randP1 > 4 && randP1 <= 5)
				{
					diceNumber[j] = 5;
				}
				else if (randP1 > 5 && randP1 <= 6)	
				{
					diceNumber[j] = 6;
				}	
				else
				{
					System.out.println("Error?");
				}

				if (diceNumber[0] == diceNumber[j]) //count the number of times values are identical
				{
					f = f + 1;
				}
				/*if (f == d)
				{
				 */

				//}
			}

			for (int i = 0; i < d; i++) //correct!
			{
				System.out.println(diceNumber[i]); //print individual dice values to the console
			}
			//control for when dice are the same
			for (int i = 0; i < d; i++)
			{
				if (diceNumber[i] == diceNumber[0])
				{
					same = same + 1;
				}

				if (same == d)
				{
					allSame = allSame + 1;	
				}
				else
				{
					break;
				}

			}

			int sum = 0;
			///------------ begin loop 4
			for (int i = 0; i < d; i++) //loop for sums
			{
				sum += diceNumber[i]; //calculate the sum of all values in the dice array
			}
			///---------- end loop 4
			System.out.println("The sum of the dice is: " + sum + ""); //print sum	


           /*
			for (int i = 0; i < 1; i++)
			{
				sums[sum] = sums[sum] + 1;    

				sum = 0;

				for (int j = 0; j < d; j++)
				{
					if (sums[sum] >= 1)
					{
						System.out.println("The sum " + sum + " was rolled:"+ sums[sum] + "times.");
					}
				}
			}	
			*/		

		}//close

		// Printed Output for Same Values
		double sameCountPercent = Math.round((double)allSame/(double)t * 100.0) *10.0 / 10.0;
		
		System.out.println("Same Count # is: "+allSame);
		System.out.println("Same Count % is: "+sameCountPercent+"%");
		System.out.println("");
		//System.out.println("Face\tFrequency");
        
		//print array values
		for (int i = 0; i < sums.length; ++i)
		{
			System.out.println((i+1) + " "+diceNumber[i]);
		}


		/*

		if (allSame == 0) //fraction
		{
			System.out.println("The fraction of times that all of the dice values are the same is: " + allSame + "");
		}
		else
		{
			System.out.println("The fraction of times that all of the dice values are the same is: " + allSame + "/" + a +"");	
		}	
		 */


	}


}
