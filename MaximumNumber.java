// Program to find the maximum of the three numbers

import java.util.Scanner;

public class MaximumNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number 1: ");
		int number1 = sc.nextInt();

		System.out.print("Enter number 2: ");
                int number2 = sc.nextInt();

		System.out.print("Enter number 3: ");
                int number3 = sc.nextInt();

		// Call findMaximumNumber() method 
		int result = findMaximumNumber(number1, number2, number3);

		if (result == number1) {
			System.out.println("The maximum number is: " + number1);
		}
		else if (result == number2) {
                        System.out.println("The maximum number is: " + number2);
                }
		else {
                        System.out.println("The maximum number is: " + number3);
                }
	}

	// findMaximumNumber() method to find maximum of the three numbers
	public static int findMaximumNumber(int number1, int number2, int number3) {
		int maxNumber = Math.max(number1, Math.max(number2, number3));
		return maxNumber;
	}
}

/*
Input:
	Enter number 1: 12
	Enter number 2: 13
	Enter number 3: 11
Output:
	The maximum number is: 13
*/
