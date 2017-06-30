import java.util.Scanner;

public class Pig {

	public static void main(String[] args) {
		Scanner scanin = new Scanner(System.in);
		int player0score = 0;
		int player1score = 0;
		int player0roundscore = 0;
		int player1roundscore = 0;
		int diceroll = (int) (Math.random() * 6) + 1;
		int playerturndecision = (int) (Math.random() * 2) + 1;
		boolean player0turn = false;
		boolean player1turn = false;
		boolean playervictory = false;
		if (playerturndecision == 1)
		{
			player0turn = true;
		}
		else {
			player1turn = true;
		}
		
		if (playervictory == false)
		{
			while (player0turn == true)
			{
				System.out.println("It is player0's turn!");
				diceroll = (int) (Math.random() * 6) + 1;
				System.out.println("Player0 has rolled a " + diceroll);
				player0roundscore = player0roundscore + diceroll;
				if (diceroll == 1)
				{
					player0roundscore = 0;
					System.out.println("Your total round score at this moment is now " + player0roundscore + "YOU'VE DUN GOOFED");
					player0turn = false;
					player1turn = true;
				}
				else
				{
					System.out.println("Your total round score at this moment will be " + player0roundscore );
					System.out.println("Would you like to continue? [Y/N]");
					String usrresponse = scanin.nextLine();
					String comp0 = usrresponse.toLowerCase();
					System.out.println(comp0);
					if (comp0.equals("y"))
					{
						player0turn = true;
						System.out.println("You have selected to continue");
					}
					else {
						player0turn = false;
						//System.out.println("You have chosen not to contiue");
						player1turn = true;
					}
					
				}
			}
			if (player0roundscore == 100 || player1roundscore == 100)
			{
				playervictory = true;
			}
			
			while (player1turn == true)
			{
				System.out.println("It is player1's turn!");
				diceroll = (int)(Math.random() * 6) + 1;
				System.out.println("Player1 has rolled a " + diceroll);
				player1roundscore = player1roundscore + diceroll;
				if (diceroll == 1)
				{
					player1turn = false;
					player0turn = true;
				}
				else
				{
					System.out.println("Your total round score at this moment will be " + player1roundscore);
					System.out.println("Would you like to continue? [Y/N]");
					String usrresponse = scanin.nextLine();
					String comp0 = usrresponse.toLowerCase();
					System.out.println(comp0);
					if (comp0.equals("y"))
					{
						player1turn = true;
						System.out.println("You have selected to continue");
					}
					else
					{
						player1turn = false;
						player0turn = true;
						System.out.println("You have chosen not to continue");
						//player1turn = false;
						//player0turn = true;
					}
				}
			}
		}
		else
		{
			System.out.println("A player has won!");
		}
		
		
		

	}

}
