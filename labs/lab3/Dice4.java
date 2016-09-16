package lab3;

import cse131.ArgsProcessor;

public class Dice4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArgsProcessor ap = new ArgsProcessor(args);
		int dice = ap.nextInt("Enter the number of dice to use:");
		int times = ap.nextInt("Enter how many times to roll: ");

		System.out.println("Total number of dice: "+dice);
		System.out.println("Total iterations: "+times);
		System.out.println("");

		int sameCount = 0; 

		int sumTotal = 0;

		int[] arrayTotal = new int[dice * 6];


		for (int j = 0; j < times; ++j)
		{
			System.out.println("Index Array "+(j));
			System.out.println("");

			int[] arrayDice = new int[dice];
			int value = 0;

			for (int i = 0; i < dice; ++i)
			{
				value = (int) ((Math.random() * 6) + 1); 
				arrayDice[i] = value;  

				System.out.println("Dice Values: "+arrayDice[i]+ "  ");
			} 

			int numCount = 0;
			for (int i = 0; i < dice; ++i)
			{
				if (arrayDice[0] == arrayDice[i])
				{
					numCount++;
				}
				if (numCount == dice)
				{
					sameCount++;
				}
			}

			sumTotal = 0;
			for (int i = 0; i < dice; ++i)
			{
				sumTotal += arrayDice[i];	
			}

			System.out.println("The sum of the die roll is " + sumTotal);
			System.out.println("");
			arrayTotal[sumTotal-1]++;
		} 

		double sameCountPercent = Math.round((double)sameCount/(double)times * 100.0) *10.0 / 10.0;

		System.out.println("Same Count # is: "+sameCount);
		System.out.println("Same Count % is: "+sameCountPercent+"%");
		System.out.println();
		System.out.println("Sum / Frequency");

		for (int i = 0; i < arrayTotal.length; ++i) 
		{
			System.out.println((i+01) +"        "+ arrayTotal[i]);
		}

	}

}

