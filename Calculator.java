/**
*The purpose of this application is to provide the 
*user with a basic calculator that gives a return value 
*from two integers the user inputs
* Natalya Habib  
*/

import java.util.Scanner; // imports Scanner method from Java API

public class Calculator{
	
	public static void main(String[] args){
		Scanner user_input = new Scanner(System.in); // calls Scanner method in new instance
		int i = 0; // variable called within last else if statement

		System.out.print("Enter first number: "); // requires user to input a number 
		int first_number = user_input.nextInt();

		System.out.print("Enter second number: "); // requires user to input a second number
		int second_number = user_input.nextInt();
    
    /* do while loop will allow the user to continue 
    to try out different operations until they input
    "6" which will exit the application
    */
	do{
		System.out.println("-------------------------------"); // Shows operators the user can choose from 
		System.out.println("Would you like to: ");
		System.out.println("1. Add Numbers ");
		System.out.println("2. Subtract Numbers ");
		System.out.println("3. Multiply Numbers ");
		System.out.println("4. Divide Numbers ");
		System.out.println("5. Remainder of Numbers ");
		System.out.println("6. Exit Application ");
		System.out.println("-------------------------------");
		
		System.out.print("Enter a selection number ");
		int operation_number = user_input.nextInt();

		// Each number is given a different operator - based on user input
		if (operation_number == 1) {
			System.out.println("Total = " + first_number + second_number);
		}
		else if (operation_number == 2) {
			System.out.println("Total = " + (first_number - second_number));
		}
		else if (operation_number == 3) {
			System.out.println("Total = " + first_number * second_number);
		}
		else if (operation_number == 4) {
			System.out.println("Total = " + first_number / second_number);
		}
		else if (operation_number == 5) {
			System.out.println("Total = " + first_number % second_number);
		}
		else if (operation_number == 6) {
			i++;
		}
	/* if operation_number > 6 the following statement will print and
	proceed to ask the user for a valid input
	*/
		else { 
			System.out.println("-------------------------------------------");
			System.out.println("***PLEASE ENTER A VALID SELECTION NUMBER***");
			System.out.println("-------------------------------------------");
		}
	}
	while (i<1);
}
}