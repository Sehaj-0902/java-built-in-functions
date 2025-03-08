// Program to generate the Fibonacci sequence up to a given number of terms

import java.util.Scanner;

public class FibonacciSequenceGenerator {
	public static void main(String[] args) {
        	Scanner sc = new Scanner(System.in);

        	System.out.print("Enter the number of terms: ");
        	int numberOfTerms = sc.nextInt();

		// Call generateFibonacciSequence() method
        	generateFibonacciSequence(numberOfTerms);
    	}

    	// generateFibonacciSequence() method to calculate and print the Fibonacci sequence
    	public static void generateFibonacciSequence(int numberOfTerms) {
        	if (numberOfTerms <= 0) {
            		System.out.println("Please enter a positive number of terms.");
            		return;
        	}

        	int firstTerm = 0, secondTerm = 1;

        	System.out.print("Fibonacci sequence: ");

        	for (int i = 1; i <= numberOfTerms; ++i) {
            		System.out.print(firstTerm + " ");

            		int nextTerm = firstTerm + secondTerm;
            		firstTerm = secondTerm;
            		secondTerm = nextTerm;
        	}
        	System.out.println();
    	}
}

/*
Input:
	Enter the number of terms: 4
Output:
	Fibonacci sequence: 0 1 1 2

Input:
	Enter the number of terms: 6
Output:
    	Fibonacci sequence: 0 1 1 2 3 5

Input:
    	Enter the number of terms: 10
Output:
    	Fibonacci sequence: 0 1 1 2 3 5 8 13 21 34
*/
