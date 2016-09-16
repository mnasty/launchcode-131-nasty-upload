package lab3;

import cse131.ArgsProcessor;

public class Dice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArgsProcessor ap = new ArgsProcessor(args);
		int d = ap.nextInt("How many dice will you use?");
		int t = ap.nextInt("How many times will you throw the dice?");
		int a = 0; //declare actual iterations variable
		int f = 0; //declare identical values fraction counter variable
		int[] diceNumber = new int [d]; // correct
		//---------------------- start loop 1

		for (int i = 0; i < t; i++) //run the program while t (times thrown) is greater than a (actual iterations)
		{
			for (int j = 0; j < d; j++) //initiate values
			{
				diceNumber[j] = j + 1;
			}
		
			//---------------------- end for loop 1

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
                if (f == d)
                {
                	a = a + 1; //count the number of actual iterations (a)	
                }
				
			}
		}
		
		///-------------- end for loop 2

		for (int i = 0; i < d; i++) //correct!
		{
			System.out.println(diceNumber[i]); //print individual dice values to the console
		}
		///------------ end for loop 3
		
		System.out.println("Out of a total of " + t + " throws, the dice values were the same " + f +"% of the time"); //print findings
		System.out.println("Total iterations: " + a + ""); //total iterations for my reference

		int sum = 0;
		///------------ begin loop 4
		for (int i = 0; i < d; i++) //loop for sums
		{
			sum += diceNumber[i]; //calculate the sum of all values in the dice array
		}
		///---------- end loop 4
		System.out.println("The sum of the dice is: " + sum + ""); //print sum	

	}


}	


