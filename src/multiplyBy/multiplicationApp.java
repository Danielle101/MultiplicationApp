// This program calculates multiples for integers entered by the user. 
package multiplyBy;

import java.util.*;

public class multiplicationApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String choice = "y";
		//scanner for user input
		Scanner scan = new Scanner(System.in);
		
		//welcome message followed by instructions
		System.out.println("Welcome to John's Multiplication App!\n");
		while (choice.equalsIgnoreCase("y")){
		System.out.println("Enter any number between 1 & 50 and receive the first 10 multiples of " + "that number.");
		System.out.println("Please enter a number (1-50):");
		int userInput = Validator.getValidInt(1, 50);
		System.out.println("");
		getMath.getMultiples(userInput);
		System.out.println("\nWould you like to enter another number(y/n):");
        choice = scan.nextLine();
        System.out.println();
}
		//close scanner and exit program
		scan.close();
		System.out.println("Good Bye!");
	}
}
