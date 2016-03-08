import java.util.Random; // Needed this to make a random number to get different results every time the game is played
import java.util.Scanner;

public class Homework4 
{
	public static void main (String args[])
	{
		Scanner input = new Scanner(System.in); //Scans keyboard
		
		String choice;
		Random rand = new Random();
		int count = 2;
		int cont;
		
		while (count > 1) // Making it loop forever!
		{
			System.out.println("Let's play rock, paper, scissors!");
		
			System.out.print("Enter choice (rock, paper, or scissor): ");
		
			choice = input.next(); // Lets you input a choice

			int vs = rand.nextInt(3)+1; // Gives a random number from 1-3 for rock, paper, or scissor
		
			System.out.println("You have entered in " + choice + ".");
			if (choice.equals("rock")) // Set of conditions that happens if "rock" was entered in
			{
				if (vs == 1)
				{
				System.out.println("System has chosen rock.");
				System.out.println("You have tied.");	
				}
				if (vs == 2)
				{
				System.out.println("System has chosen paper.");
				System.out.println("You have lost...");	
				}
				if (vs == 3)
				{
				System.out.println("System has chosen scissors.");
				System.out.println("You have won!");	
				}
			}
			else if (choice.equals("paper")) // Set of conditions that happens if "paper" was entered in
			{
				if (vs == 1)
				{
					System.out.println("System has chosen rock.");
					System.out.println("You have won!");	
				}
				if (vs == 2)
				{
					System.out.println("System has chosen paper.");
					System.out.println("You have tied.");	
				}
				if (vs == 3)
				{
					System.out.println("System has chosen scissors.");
					System.out.println("You have lost...");	
				}
			}
			else if (choice.equals("scissor")) // Set of conditions that happens if "scissor" was entered in
			{
				if (vs == 1)
				{
					System.out.println("System has chosen rock.");
					System.out.println("You have lost...");	
				}
				if (vs == 2)
				{
					System.out.println("System has chosen paper.");
					System.out.println("You have won!");	
				}
				if (vs == 3)
				{
					System.out.println("System has chosen scissors.");
					System.out.println("You have tied.");	
				}
			}
			else // Used if there was something other than rock, paper, or scissor was entered in
				System.out.println("Invalid entry. Starting over... ");
			System.out.print("Do you want to play again? (y/n) "); // Asks user if they want to continue playing
			cont = 1; // Sets the loop
			while (cont == 1)
			{
				choice = input.next();
				if (choice.equals("y") || choice.equals("yes"))
				{
					System.out.println("Let's play again!");
					cont++;
				}
				else if (choice.equals("n") || choice.equals("no"))
				{
					System.out.println("Thank you for playing!");
					cont++;
					count--;
				}
				else
					System.out.print("Invalid entry. Do you want to play again? (y/n) "); // Input error checking
			}
			
		}
	}
}
// Good job...see notes
