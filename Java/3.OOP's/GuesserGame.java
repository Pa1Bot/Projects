import java.util.*;
class Guesser
{
	int guessingNumber;
	
	int guessTheNumber()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Guesser kindly guess the number");
		guessingNumber= scan.nextInt();
		return guessingNumber;
	}
}

class Player
{
	int guessingNumber;
	
	int guessTheNumer()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Player! Kindly guess the number");
		guessingNumber=scan.nextInt();
		return guessingNumber;
	}
	
}

class Umpire
{
	int numFromGuesser;
	int numFromP1;
	int numFromP2;
	int numFromP3;
	
	
	void collectNumFromGuesser()
	{
		Guesser g=new Guesser();
		numFromGuesser=g.guessTheNumber();
		
	}
	void collectNumFromPlayers()
	{
		Player p1=new Player();
		Player p2=new Player();
		Player p3=new Player();
		
		numFromP1=p1.guessTheNumer();
		numFromP2=p2.guessTheNumer();
		numFromP3=p3.guessTheNumer();
	}
	
	void compare()
	{
		if(numFromGuesser==numFromP1)
		{
			if(numFromGuesser==numFromP2 && numFromGuesser==numFromP3)
			{
				System.out.println("All 3 players guessed correctly game tied");
				
			}
			else if(numFromGuesser==numFromP2)
			{
				System.out.println("Player 1 and Player 2 guess correctly. Game tied b/w p1 and p2");
			}
			else if(numFromGuesser==numFromP3)
			{
				System.out.println("Player 1 and Player 3 guess correctly. Game tied b/w p1 and p3");
				
			}
			else
			{
				System.out.println("Player 1 won the game");
				
			}
			
		}
		else if(numFromGuesser==numFromP2)
		{
			if(numFromGuesser==numFromP3)
			{
				System.out.println("P2 and p3 guessed correctly. Game tired b/w them");
			}
			else
			{
				System.out.println("Player 2 won the game");
				
			}
			
		}
		else if(numFromGuesser==numFromP3)
		{
			System.out.println("Player 3 won the game");
		}
		else
		{
			System.out.println("GameLost! Try again");
		}
	}
}

public class GuesserGame
{

	public static void main(String[] args) 
	{
		Umpire u=new Umpire();
		u.collectNumFromGuesser();
		u.collectNumFromPlayers();
		u.compare();

	}

}
