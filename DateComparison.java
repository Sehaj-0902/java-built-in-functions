// Program to compare two dates and check if the first date is before, after, or same as the second date

import java.util.Scanner;
import java.time.LocalDate;

public class DateComparison {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Input the first date
		System.out.print("Enter first date (yyyy-MM-dd): ");
		String firstDate = sc.nextLine();

		// Input the second date
		System.out.print("Enter second date (yyyy-MM-dd): ");
                String secondDate = sc.nextLine();

		// Parse the input dates
		LocalDate date1 = LocalDate.parse(firstDate);
		LocalDate date2 = LocalDate.parse(secondDate);

		// Check if the first date is before, after, or same as the second date
		if (date1.isBefore(date2)) {
			System.out.println("The first date " + date1 + " is before the second date " + date2);
		}
		if (date1.isAfter(date2)) {
                        System.out.println("The first date " + date1 + " is after the second date " + date2);
                }
		if (date1.isEqual(date2)) {
                        System.out.println("The first date " + date1 + " is the same as the second date " + date2);
                }

	}
}

/*
Input:
	Enter first date (yyyy-MM-dd): 2025-04-12
	Enter second date (yyyy-MM-dd): 2025-08-16
Output:
	The first date 2025-04-12 is before the second date 2025-08-16
*/
