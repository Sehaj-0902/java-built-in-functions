// Program to display the current date in three different formats

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormatting {
	public static void main(String[] args) {
		// Get current date
		LocalDate currentDate = LocalDate.now();

		// Formatter to display current date in three different formats
		DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		DateTimeFormatter dateTimeFormatter3 = DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy");

		// Print the current date in three differnt formats
		System.out.println("The current date in format dd/MM/yyyy : " + currentDate.format(dateTimeFormatter1));
		System.out.println("The current date in format yyyy-MM-dd : " + currentDate.format(dateTimeFormatter2));
		System.out.println("The current date in format EEE, MMM dd, yyyy : " + currentDate.format(dateTimeFormatter3));
	}
}

/*
Output:
	The current date in format dd/MM/yyyy : 08/03/2025
	The current date in format yyyy-MM-dd : 2025-03-08
	The current date in format EEE, MMM dd, yyyy : Sat, Mar 08, 2025
*/
