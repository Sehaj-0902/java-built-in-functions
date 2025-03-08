// Program to calculate GCD and LCM of two numbers using functions

import java.util.Scanner;

public class GCD_LCM_Calculator {
    	public static void main(String[] args) {
        	Scanner sc = new Scanner(System.in);

        	System.out.print("Enter the first number: ");
        	int number1 = sc.nextInt();

        	System.out.print("Enter the second number: ");
        	int number2 = sc.nextInt();

        	int gcd = calculateGCD(number1, number2);
        	int lcm = calculateLCM(number1, number2);

        	System.out.println("GCD of " + number1 + " and " + number2 + " is: " + gcd);
        	System.out.println("LCM of " + number1 + " and " + number2 + " is: " + lcm);
	}

	// calculateGCD() method to calculate GCD of two numbers
    	public static int calculateGCD(int number1, int number2) {
        	while (number2 != 0) {
            		int temp = number2;
            		number2 = number1 % number2;
            		number1 = temp;
        	}
        	return number1;
    	}

	// calculateLCM() method to calculate LCM of two numbers
    	public static int calculateLCM(int number1, int number2) {
        	return (number1 * number2) / calculateGCD(number1, number2);
    	}
}

/*
Input:
	Enter the first number: 4
	Enter the second number: 24
Output:
	GCD of 4 and 24 is: 4
	LCM of 4 and 24 is: 24
*/
