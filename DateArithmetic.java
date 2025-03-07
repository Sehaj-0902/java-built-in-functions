// Program to modify a date using arithmetic operation methods

import java.util.Scanner;
import java.time.LocalDate;

public class DateArithmetic {
	public static void main(String[] args) {
        	Scanner sc = new Scanner(System.in);

		// Input date from user
        	System.out.print("Enter a date (yyyy-MM-dd): ");
        	String string = sc.nextLine();

		// Parse the input date
        	LocalDate inputDate = LocalDate.parse(string);

		// Add 7 days, 1 month, and 2 years to current date
        	LocalDate modifiedDate = inputDate.plusDays(7).plusMonths(1).plusYears(2);

		// Subtract 3 weeks from calculatedDate
		modifiedDate = modifiedDate.minusWeeks(3);

		// Print the modified date
        	System.out.println("The modified date is: " + modifiedDate);
    	}
}

/*
Input:
	Enter a date (yyyy-MM-dd): 2025-03-08
Output:
	The modified date is: 2027-03-25
*/
