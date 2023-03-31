package first;

import java.util.Scanner;

public class JorgeTorres_PraticeOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		// naming variables 
		int a;
		int b;
		System.out.println("Enter a number: ");
		a = in.nextInt(); // users number
		//b = a * 15; // new value for a
		
		//System.out.println("The new value of the number you put in is:" + b);
		
		// checks to see if the new value is even or odd
		if (a % 2 == 1) {
			System.out.println(a + " is an odd number");// odd statement
		} else {
			System.out.println(a + " is an even number");// even statement
		}
	}
}




