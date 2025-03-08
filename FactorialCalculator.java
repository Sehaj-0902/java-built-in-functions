// Program to calculate the factorial of a number using a recursive function

import java.util.Scanner;

public class FactorialCalculator {
    	public static void main(String[] args) {
        	int number = getInput();

		// Call calculateFactorial() method
		long factorial = calculateFactorial(number);

		// Call displayResults() method
	        displayResults(number, factorial);
    	}

	// getInput() method to get user input
    	public static int getInput() {
        	Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number: ");
	        int number = sc.nextInt();

	        return number;
    	}

	// calculateFactorial() method to calculate factorial of a number
    	public static long calculateFactorial(int number) {
        	if (number < 0) {
            		return -1;
        	}
		else if (number == 0 || number == 1) {
            		return 1;
        	}
		else {
            		return number * calculateFactorial(number - 1);
        	}
    	}

	// displayResults() method to display the results
    	public static void displayResults(int number, long factorial) {
        	if (factorial == -1) {
            		System.out.println("Please enter a positive number.");
        	}
		else {
            		System.out.println("Factorial of " + number + " is: " + factorial);
        	}
    	}
}

/*
Input:
	Enter a number: 4
Output:
	Factorial of 4 is: 24
*/
