// Program to perform basic mathematical operations (addition, subtraction, multiplication, division) based on user input

import java.util.Scanner;

public class BasicCalculator {
    	public static void main(String[] args) {
        	Scanner sc = new Scanner(System.in);

        	System.out.println("Basic Calculator: 1 - Addition, 2 - Subtraction, 3 - Multiplication, 4 - Division");
        	System.out.print("Enter your choice (1-4): ");

        	int choice = sc.nextInt();

        	System.out.print("Enter the first number: ");
        	double number1 = sc.nextDouble();

        	System.out.print("Enter the second number: ");
        	double number2 = sc.nextDouble();

        	double result;

        	switch (choice) {
            		case 1:
                		result = addNumbers(number1, number2);
                		System.out.println("Result: " + result);
                		break;
            		case 2:
                		result = subtractNumbers(number1, number2);
                		System.out.println("Result: " + result);
                		break;
            		case 3:
                		result = multiplyNumbers(number1, number2);
                		System.out.println("Result: " + result);
                		break;
            		case 4:
                		if (number2 != 0) {
                    			result = divideNumbers(number1, number2);
                    			System.out.println("Result: " + result);
                		}
				else {
                    			System.out.println("Cannot divide by zero.");
                		}
                		break;
            		default:
                		System.out.println("Invalid choice.");
        	}
    	}

	// addNumbers() method to add the two numbers
    	public static double addNumbers(double number1, double number2) {
        	return number1 + number2;
    	}

	// subtractNumbers() method to subtract the two numbers
    	public static double subtractNumbers(double number1, double number2) {
        	return number1 - number2;
    	}

	// multiplyNumbers() method to multiply the two numbers
    	public static double multiplyNumbers(double number1, double number2) {
        	return number1 * number2;
    	}

	// divideNumbers() method to divide the two numbers
    	public static double divideNumbers(double number1, double number2) {
        	return number1 / number2;
    	}
}

/*
Input:
	Basic Calculator: 1 - Addition, 2 - Subtraction, 3 - Multiplication, 4 - Division
	Enter your choice (1-4): 1
	Enter the first number: 2
	Enter the second number: 4
Output:
	Result: 6.0
*/
