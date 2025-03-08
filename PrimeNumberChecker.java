// Program to check if a number is prime or not

import java.util.Scanner;

public class PrimeNumberChecker {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int number = sc.nextInt();

		if (isPrimeNumber(number)) {
			System.out.println(number + " is a prime number");
		}
		else {
			System.out.println(number + " is not prime number");
		}
	}

	// isPrimeNumber() method to check if a number is prime or not
	public static boolean isPrimeNumber(int number) {
		if (number <= 1) {
			return false;
		}

		for (int i = 2; i <= Math.sqrt(number); i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}
}

/*
Input:
	Enter a number: 3
Output:
	3 is a prime number

Input:
	Enter a number: 8
Output:
	8 is not a prime number
*/
