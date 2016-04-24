package multiplyBy;
import java.util.*;
public class multiplicationApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner (System.in);
System.out.println("Welcome to John's Multiplication App!\n");
System.out.println("Enter any number between 1 & 50 and receive the first 10 multiples of"
		+ "that number.");
System.out.println("Please enter a number (1-50):");
int userInput = scan.nextInt();
System.out.println("");
//return userInput;
for (int i = 1; i<11; i++){
int multiply = userInput*i;	
System.out.println(userInput + " multiplied by "+ i + " is "+ multiply+"."); 
}	


}
}

