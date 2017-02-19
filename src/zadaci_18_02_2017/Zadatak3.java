package zadaci_18_02_2017;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Zadatak3 {

	public static void main(String[] args) {
		System.out.println("Current date and time: " + getDate() + " " + getTime());

	}

	public static String getTime() {
		long milliseconds = System.currentTimeMillis();
		long totalSeconds = milliseconds / 1000 + 3600;
		long currentSeconds = totalSeconds % 60;
		long totalMinutes = totalSeconds / 60;
		long currentMinutes = totalMinutes % 60;
		long totalHour = totalMinutes / 60;
		long currentHour = totalHour % 24;
		String time = currentHour + ":" + ((currentMinutes < 10) ? "0" + currentMinutes : currentMinutes) + ":"
				+ ((currentSeconds < 10) ? "0" + currentSeconds : currentSeconds);
		// Vraca trenutno vrijeme
		return time;
	}

	public static String monthName(int month) {
		// String sa imenima mjeseci
		String[] monthName = { "Januar", "Februar", "Mart", "April", "May", "Juni", "Juli", "August", "Septembar",
				"Oktobar", "Decembar" };
		return monthName[month];
	}

	public static String getDate() {

		Calendar calendar = new GregorianCalendar();

		String cDate = calendar.get(Calendar.DATE) + ". " + monthName(calendar.get(Calendar.MONTH)) + " "
				+ calendar.get(Calendar.YEAR);
		// Vraca datum (dan, mjesec, godina)
		return cDate;
	}

}
