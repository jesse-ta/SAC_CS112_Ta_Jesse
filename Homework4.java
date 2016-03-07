import java.util.Random; // Needed this to make a random number to get different results every time the game is played
import java.util.Scanner;

public class Homework4 {
	public static void main (String args[])
	{
		Scanner input = new Scanner(System.in); //Scans keyboard
		
		String choice;
		Random rand = new Random();
		String rock = "";
		String paper = "";
		String scissor = "";
		
		while (true) // Making it loop forever!
		{
		System.out.println("Let's play rock, paper, scissors!");
		
		System.out.print("Enter choice (rock, paper, or scissor): ");
		
		choice = input.next(); // Lets you input a choice

		int vs = rand.nextInt(3)+1; // Gives a random number from 1-3 to be used for next 3 if statements
		
		if (vs == 1)
			rock = "rock";
		if (vs == 2)
			paper = "paper";
		if (vs == 3)
			scissor = "scissor";
		
		System.out.println("You have entered in " + choice + ".");
		if (choice.equals("rock")) // Set of conditions that happens if "rock" was entered in
		{
			if (vs == 1)
			{
				System.out.println("System has chose rock.");
				System.out.println("You have tied.");	
			}
			if (vs == 2)
			{
				System.out.println("System has chose paper.");
				System.out.println("You have lost...");	
			}
			if (vs == 3)
			{
				System.out.println("System has chose scissors.");
				System.out.println("You have won!");	
			}
		}
		else if (choice.equals("paper")) // Set of conditions that happens if "paper" was entered in
		{
			if (vs == 1)
			{
				System.out.println("System has chose rock.");
				System.out.println("You have won!");	
			}
			if (vs == 2)
			{
				System.out.println("System has chose paper.");
				System.out.println("You have tied.");	
			}
			if (vs == 3)
			{
				System.out.println("System has chose scissors.");
				System.out.println("You have lost...");	
			}
		}
		else if (choice.equals("scissor")) // Set of conditions that happens if "scissor" was entered in
		{
			if (vs == 1)
			{
				System.out.println("System has chose rock.");
				System.out.println("You have lost...");	
			}
			if (vs == 2)
			{
				System.out.println("System has chose paper.");
				System.out.println("You have won!");	
			}
			if (vs == 3)
			{
				System.out.println("System has chose scissors.");
				System.out.println("You have tied.");	
			}
		}
		else // Used if there was something other than rock, paper, or scissor was entered in
			System.out.println("Invalid entry. Starting over... ");
	}
}
}

// Good job...see notes
