// Program to check if a string is palindrome or not

import java.util.Scanner;

public class PalindromeChecker {
    	public static void main(String[] args) {
        	String string = getInput();

		// Call checkPalindrome() method
        	boolean isPalindrome = checkPalindrome(string);

		// Call displayResults() method
        	displayResults(string, isPalindrome);
    	}

	// getInput() method to get user input
    	public static String getInput() {
        	Scanner sc= new Scanner(System.in);

		System.out.print("Enter a string: ");
        	String input = sc.nextLine();

        	return input;
    	}

	// checkPalindrome() method to check if a string is palindrome or not
    	public static boolean checkPalindrome(String string) {
        	if (string == null || string.isEmpty()) {
            		return true;
        	}
        	string = string.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        	int left = 0;
        	int right = string.length() - 1;

        	while (left < right) {
            		if (string.charAt(left) != string.charAt(right)) {
                		return false;
            		}
            		left++;
            		right--;
        	}
        	return true;
    	}

	// displayResults() method to display the results
    	public static void displayResults(String string, boolean isPalindrome) {
        	if (isPalindrome) {
            		System.out.println("\"" + string + "\" is a palindrome");
        	}
		else {
            		System.out.println("\"" + string + "\" is not a palindrome.");
        	}
    	}
}

/*
Input:
	Enter a string: "abba"
Output:
	"abba" is a palindrome

Input:
	Enter a string: "hello"
Output:
	"hello" is not a palindrome.
*/
