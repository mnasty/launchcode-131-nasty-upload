package studio2;

import cse131.ArgsProcessor;

public class gamblersRuin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArgsProcessor ap = new ArgsProcessor(args);
		double startAmount = ap.nextDouble("How much money do you have to start?");
		double winChance = ap.nextDouble("What is the probablity of winning?");
		double winAmount = ap.nextDouble("What is the amount of money you need to win?");
		double totalPlays = ap.nextInt("What are the total number of plays?");
		
		double loseCount = 0.0;
		
		for (int i = 0; i < totalPlays; i++)
		{
			double gameAmount = startAmount;
			int numPlays = 0;
			
		while(gameAmount !=0.0 && gameAmount != winAmount)
		{
			
			
	        
			if (Math.random() < winChance)
	        {
	        	gameAmount = gameAmount + 1;
	        }
	        else
	        {
	        	gameAmount -= 1;
	        }
	        numPlays = numPlays + 1;
			
			}
		
		boolean didWin;
		if (gameAmount == 0)
		{
			System.out.println("LOSE");
			loseCount = loseCount + 1;
		}
		else
		{
			System.out.println("WIN");
		}
		
		
		System.out.println("Simulation " + i + "");
		System.out.println("Rounds: " + numPlays + "");
		}
		
		double lossChance = 1 - winChance;
		double expectLose = lossChance / winChance;
		double expectedRate = 
				if (lossChance != winChance) {
			Ruin = (Math.pow(expectLose, startAmount) - )startAmount) - (lossChance/winChance)winAmount)) / (1 - (lossChance/winChance)winAmount
				}
					if (lossChance == winChance)
					Ruin = 1 - startAmount / winAmount;
		double ruin = (1.0 *loseCount / totalPlays);
		
		
		System.out.println("Simulations:" + totalPlays + "");
		System.out.println("Losses:" + loseCount + "");
		System.out.println("Actual Ruin Rate: " + ruin + " Expected Ruin Rate: "++");
		
		        
	}

}
