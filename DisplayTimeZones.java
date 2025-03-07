// Program to display the current time in different time zones using ZonedDateTime and ZoneId

import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DisplayTimeZones {
	public static void main(String[] args) {
		// Formatter to display and parse date-time objects
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

		// Current time in GMT (Greenwich Mean Time)
		ZoneId gmtZone = ZoneId.of("GMT");
		ZonedDateTime gmtTime = ZonedDateTime.now(gmtZone);

		// Current time in IST (Indian Standard Time)
		ZoneId istZone = ZoneId.of("Asia/Kolkata");
		ZonedDateTime istTime = ZonedDateTime.now(istZone);

		// Current time in PST (Pacific Standard Time)
		ZoneId pstZone = ZoneId.of("America/Los_Angeles");
		ZonedDateTime pstTime = ZonedDateTime.now(pstZone);
		
		// Print current time in different time zones
		System.out.println("Current time (GMT): " + gmtTime.format(dateTimeFormatter));
		System.out.println("Current time (IST): " + istTime.format(dateTimeFormatter));
		System.out.println("Current time (PST): " + pstTime.format(dateTimeFormatter));
	}
}
