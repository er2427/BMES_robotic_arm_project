package firstJavaProject;

import java.util.*;

public class practiceProject {

	public static void main(String[] args) {
		
		int input;
		
		Scanner in = new Scanner(System.in);

		System.out.println("Which program would you like to implement? Choose 1, 2, or 3:\t");
		input = in.nextInt();
		
		if (input == 1) {
			program1();
		}
		else if (input == 2) {
			program2();
		}
		else if (input == 3) {
	
		}
		else	{
			System.out.println("This is not a valid number!");
		}

	}
	
	public static int program1(/*here is where you will place your inputs*/)	{
		
		return 0;
	}
	
	public static char program2(/*here is where you will place your inputs*/)	{
		
		return 'a';
	}
	
	public static void program3(/*here is where you will place your inputs*/)	{
		
	}

}
