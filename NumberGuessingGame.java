// Program to ask the user to think of a number between 1 and 100, and then computer tries to guess the number by generating random guesses

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    	public static void main(String[] args) {
        	int low = 1;
        	int high = 100;
        	int guess;
        	char feedback;
        	boolean correctGuess = false;

        	System.out.println("Think of a number between 1 and 100.");

        	while (!correctGuess) {
            		guess = generateGuess(low, high);
            		feedback = getUserFeedback(guess);

            		if (feedback == 'c') {
                		System.out.println("The guessed number: " + guess);
                		correctGuess = true;
            		}
			else if (feedback == 'h') {
                		high = guess - 1;
            		}
			else if (feedback == 'l') {
                		low = guess + 1;
            		}
			else {
                		System.out.println("Invalid input. Please enter 'h', 'l', or 'c'.");
            		}

            		if(low > high){
                		System.out.println("Inconsistent input, game ending.");
                		break;
            		}
        	}
    	}

	// generateGuess() method to generate a guess
    	public static int generateGuess(int low, int high) {
        	Random random = new Random();
        	return random.nextInt(high - low + 1) + low;
    	}

	// getUserFeedback() method to get user feedback
    	public static char getUserFeedback(int guess) {
        	Scanner sc = new Scanner(System.in);
        	System.out.println("Is your number " + guess + "?");
        	System.out.print("Enter 'h' (high), 'l' (low), or 'c' (correct): ");
        	char feedback = sc.next().charAt(0);
        	return feedback;
    	}

	// determineNextGuess() method to determine the next guess
    	public static int determineNextGuess(char feedback, int guess, int low, int high) {
        	if (feedback == 'h') {
            		return guess - 1;
        	}
		else if (feedback == 'l') {
            		return guess + 1;
        	}
		else {
            		return guess;
        	}
    	}
}

/*
Output:
	Think of a number between 1 and 100.
	Is your number 89?
	Enter 'h' (high), 'l' (low), or 'c' (correct): h
	Is your number 85?
	Enter 'h' (high), 'l' (low), or 'c' (correct): h
	Is your number 16?
	Enter 'h' (high), 'l' (low), or 'c' (correct): l
	Is your number 70?
	Enter 'h' (high), 'l' (low), or 'c' (correct): h
	Is your number 39?
	Enter 'h' (high), 'l' (low), or 'c' (correct): l
	Is your number 59?
	Enter 'h' (high), 'l' (low), or 'c' (correct): h
	Is your number 41?
	Enter 'h' (high), 'l' (low), or 'c' (correct): l
	Is your number 52?
	Enter 'h' (high), 'l' (low), or 'c' (correct): c
	The guessed number: 52
*/
