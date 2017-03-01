package zadaci_28_02_2017;

public class StopWatch {

	double startTime;
	double endTime;

	StopWatch() {
		startTime = System.currentTimeMillis();
	}

	void start() {
		startTime = System.currentTimeMillis();
	}

	void stop() {
		endTime = System.currentTimeMillis();
	}

	double getElapdesTime() {
		return endTime - startTime;
	}

}
