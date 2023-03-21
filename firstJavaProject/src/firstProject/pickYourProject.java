package firstProject;

import java.util.Scanner;

public class pickYourProject {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		boolean keepPlaying = true;

		System.out.println("Wecome to the project picker!\n");
		
		do	{
		System.out.print("Which project (1-3) would you like to select?\t");
		int answer = in.nextInt();
		
		if (answer == 1)	{
			System.out.print("Input two integers:\t");
			int a = in.nextInt();
			int b = in.nextInt();
			
			project1(a, b);
		}
		else if (answer == 2)	{
			System.out.print("Comparison game! Which letter do you think the computer will choose?\t");
			char letter = in.next().charAt(0);
			
			project2(letter);
		}
		else if (answer == 3)	{
			System.out.print("Input a string:\t");
			String input = in.next();
			
			project3(input);
		}
		else	{
			System.out.println("That is not a valid input!");
		}
		
		System.out.print("Would you like to play again? (y/n)\t");
		String answer2 = in.next();
		
		if (answer2.equals("y"))	{
			continue;
		}
		else if (answer2.equals("n"))	{
			System.out.println("\nTerminating program...");
			break;
		}
		else	{
			System.out.println("\nInvalid input! Terminating program...");
			break;
		}
		
		}
		while(keepPlaying == true);
		
		System.out.println("Thanks for playing!");
		
		in.close();
	}
	
	public static void project1(/*put input values here*/)	{
		// Topics tested: integers, basic variable assignment
		// Goal: create input parameters of two numbers and print their addition, subtraction, division, and multiplication to the console
		// Further thinking: test lots of different numbers - are some values not what you expected? is there another data type that could be more accurate?
		
	}
	
	public static boolean project2(/*put input values here*/)	{
		// Topics tested: booleans, conditional statements, return values, input
		// Goal: Pick a letter, any letter! If the input string is your word of choice, return a true value to the main method. Otherwise, return false.
		// Further thinking: Modify the main program to print true / false in the console using the method call
		
		
		return true;
	}
	
	public static String project3(/*put input values here*/)	{
		// Topics tested: loops, strings, return values, input
		// Goal: Take an input of string and return that string backwards using a for loop
		// Further thinking: Modify the main program to print out your string in the console using the method call
		
		return null;
	}
	
	public static char project4()	{
		// Hardest project if needed
		// Topics tested: user input, ascii
		// Goal: create a method that asks the user for a number (1-26), return the value to main, and print out the letter that corresponds to that placement in the alphabet in the console
		// Note: do NOT use 26 if-else statements -> if stuck, research ascii system
		
		return 0;
		
	}

}
