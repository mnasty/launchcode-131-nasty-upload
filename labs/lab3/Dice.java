package lab3;

import cse131.ArgsProcessor;

public class Dice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArgsProcessor ap = new ArgsProcessor(args);
		int d = ap.nextInt("How many dice will you use?");
		int t = ap.nextInt("How many times will you throw the dice?");
		int a = 0; //declare actual iterations variable
		int f = 0; //declare identical values fraction counter variable
		int[] diceNumber = new int [d]; // correct
		//---------------------- start loop 1

		for (int i = 0; i < t; i++); //run the program while t (times thrown) is greater than a (actual iterations)
		{
			for (int i = 0; i < d; i++) //initiate values
			{
				diceNumber[i] = i + 1;
			}
			//---------------------- end for loop 1

			for(int i = 0; i < d; i++)
			{   	
				double j = Math.random(); //create a random value
				double k = Math.round(j); //round it to 0.0 or 1.0 at a 50% chance rate
				//System.out.println("" + j + " this is the random double"); //for test purposes -math.rand refuses 
				//System.out.println("" + k + " this is the random number rounded");// to output any value over .5?

				if (k == 0.0) //change values randomly
				{
					diceNumber[i] = i + 1; //increment

					if (diceNumber[i] < 0) //check for valid output
					{
						diceNumber[i] = i - (i - 0) + 1; //adjust invalid output	
					}
					else if (diceNumber[i] == 0)
					{
						diceNumber[i] = i + 1;
					}
					else if (diceNumber[i] > 6)
					{
						diceNumber[i] = i - i + 6;
					}


				}
				else  //change values randomly
				{
					diceNumber[i] = i - 1; //decrement

					if (diceNumber[i] < 0) //check for valid output
					{
						diceNumber[i] = i - (i - 0) + 1; //adjust invalid output	
					}
					else if (diceNumber[i] == 0)
					{
						diceNumber[i] = i + 1;
					}
					else if (diceNumber[i] > 6)
					{
						diceNumber[i] = i - i + 6;
					}
				}

				if (diceNumber[i] == diceNumber[i]) //count the number of times values are identical
				{
					f = f + 1;
				}

				a = a + 1; //count the number of actual iterations (a)	

			}
			///-------------- end for loop 2

			for (int i = 0; i < d; i++) //correct!
			{
				System.out.println(diceNumber[i]); //print individual dice values to the console
			}
			///------------ end for loop 3

			double p = f / t; //determine the overall percentage of identical throws compared to total dice
			System.out.println("Out of a total of " + t + " throws, the dice values were the same " + p +"% of the time"); //print findings
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

}
