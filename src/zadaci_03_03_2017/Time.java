package zadaci_03_03_2017;

public class Time {
	private long hour;
	private long minute;
	private long second;

	public Time() {
		long milliseconds = System.currentTimeMillis();

		long totalSeconds = milliseconds / 1000 + 3600;
		second = totalSeconds % 60;
		long totalMinutes = totalSeconds / 60;
		minute = totalMinutes % 60;
		long totalHours = totalMinutes / 60;
		hour = totalHours % 24;

	}

	public Time(long elapsedTime) {
		
		long totalSeconds = elapsedTime / 1000;
		
		second = totalSeconds % 60;
		long totalMinutes = totalSeconds / 60;
		minute = totalMinutes % 60;
		long totalHours = totalMinutes / 60;
		hour = totalHours % 24;

	}

	public long getHour() {
		return hour;
	}

	public long getMinute() {
		return minute;
	}

	public long getSecond() {
		return second;
	}
	public void setTime(long elapseTime){
		Time time=new Time(elapseTime);
		this.hour=time.getHour();
		this.minute=time.getMinute();
	    this.second=time.getSecond();
		
	}
	public String toString(){
		return "Time: "+ hour+":"+minute+":"+second;
	}
	

}
