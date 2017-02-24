package zadaci_23_02_2017;

import java.util.Calendar;

import java.util.GregorianCalendar;

public class Zadatak4 {

	public static void main(String[] args) {
		System.out.println("Time: " + getTime());
		System.out.println("Date: " + getDate());

	}

	public static String getTime() {
		long milliseconds = System.currentTimeMillis();
		long totalSeconds = milliseconds / 1000 + 3600;
		long currentSeconds = totalSeconds % 60;

		long totalMinutes = totalSeconds / 60;
		long currentMinutes = totalMinutes % 60;

		long totalHours = totalMinutes / 60;
		long currentHours = totalHours % 24;

		String currentTime = currentHours + ":" + currentMinutes + ":" + currentSeconds;

		return currentTime;
	}

	public static String getDate() {

		Calendar newCalendar = new GregorianCalendar();
		String currentDate = newCalendar.get(Calendar.DATE) + "." + (newCalendar.get(Calendar.MONTH) + 1) + "."
				+ newCalendar.get(Calendar.YEAR) + ".";

		return currentDate;
	}

}
