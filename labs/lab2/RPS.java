package lab2;

import cse131.ArgsProcessor;

public class RPS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArgsProcessor ap = new ArgsProcessor(args);
        //
		//For making the game interactive with a real user...
		//String namePlayer1 = ap.nextString("What's your name (Player 1)?");
		//int RPS = ap.nextInt("Enter 1 for Rock, 2 for Paper, or 3 for Scissors:");
		
		//Captures needed input from the user
		int roundsNum = ap.nextInt("How many rounds are you playing?");
		int roundsEntered = roundsNum;
		//Stores the number of actual rounds progressed in memory
		int roundsActual = 0;
		//stores the current moves for P1 and P2 in memory
		int player1 = 0;                  
		int player2 = 0; 		
		int player1Move = player1;
		int player2Move = player2;
		//stores the last move of P2 in a separate variable so that the P2 last move calculator can function independently
		double lastMovep2 = player2Move;
		//stores number of wins/ties for P1 & P2
		int winsP1 = 0;
		int winsP2 = 0;
		int ties = 0;
		
		do //do/while loop for program function
		{	
			
		////////Random number generator for P1 from 3 #'s
			
			//math.random operation for Random Number generator
			double randP1 = Math.random();
			
			if (randP1 <= 0.33)
			{
				player1Move = 1; //Rock
			}
			else if (randP1 > 0.33 && randP1 <= 0.66)
			{
				player1Move = 2; //Paper
			}
			else if (randP1 > 0.66)
			{
				player1Move = 3; //Scissors
			}
			
            /////Print function for P1 Choice
			
			if ((int)player1Move == 1)
			{
				System.out.println("P1 Chose: Rock");
			}
			else if ((int)player1Move == 2)
			{ 
				System.out.println("P1 Chose: Paper");
			}
			else if ((int)player1Move == 3)
			{
				System.out.println("P1 Chose: Scissors");
			}
		   
			/////Calculator for P2 input based on last moves
			
			if (lastMovep2 == 0)
			{
				player2Move = 1;
				lastMovep2 = 1;
			}
			else if (lastMovep2 == 1)
			{
				player2Move = 2;
				lastMovep2 = 2;
			}
			else if (lastMovep2 == 2)
			{
				player2Move = 3;
				lastMovep2 = 3;
			}
			else if (lastMovep2 == 3)
			{
				player2Move = 1;
				lastMovep2 = 1;
			}
			
           //////Print Function for P2 Choice
			
			if ((int)player2Move == 1)
			{
				System.out.println("P2 Chose: Rock");
			}
			else if ((int)player2Move == 2)
			{ 
				System.out.println("P2 Chose: Paper");
			}
			else if ((int)player2Move == 3)
			{
				System.out.println("P2 Chose: Scissors");
			}
			
 ////////////////Wins Calculator:
			
			if (player1Move == 1 && player2Move == 1)
			{
				System.out.println("--Tie!");
				ties = ties + 1;
			}
			else if (player1Move == 1 && player2Move == 2)
			{
				System.out.println("--P2 Wins!");
				winsP2 = winsP2 + 1;		
			}
			else if (player1Move == 1 && player2Move == 3)
			{
				System.out.println("--P1 Wins!");
				winsP1 = winsP1 + 1;
			}
			else if (player1Move == 2 && player2Move == 1)
			{
				System.out.println("--P1 Wins!");
				winsP1 = winsP1 + 1;
			}
			else if (player1Move == 2 && player2Move == 2)
			{
				System.out.println("--Tie!");
				ties = ties + 1;
			}
			else if (player1Move == 2 && player2Move == 3)
			{
				System.out.println("--P2 Wins!");
				winsP2 = winsP2 + 1;
			}
			else if (player1Move == 3 && player2Move == 1)
			{
				System.out.println("--P2 Wins!");
				winsP2 = winsP2 + 1;
			}
			else if (player1Move == 3 && player2Move == 2)
			{
				System.out.println("--P1 Wins!");
				winsP1 = winsP1 + 1;
			}
			else if (player1Move == 3 && player2Move == 3)
			{
				System.out.println("--Tie!");
				ties = ties + 1;
			}
			else
			{
				System.out.println("--ERROR!!! Invalid input!");
			}	
			
			//increments the number of actual rounds progressed in memory
			roundsActual = roundsActual + 1;
			
		}
		while (roundsActual < roundsEntered);

		//prints the fraction of wins/losses/ties and total rounds played to console
		System.out.println("");
		System.out.println("P1 won " + winsP1 + " time(s).");
		System.out.println("P2 won " + winsP2 + " time(s).");
		System.out.println("There were a total of " + ties +" tie(s).");
		System.out.println("The total number of rounds played was: " + roundsActual + ".");	
		
	}
}
