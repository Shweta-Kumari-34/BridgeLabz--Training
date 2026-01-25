package junit.performancetestingusingtimeout;

public class PerformanceTask {
	// Method that simulates a long-running task
		public String longRunningTask() throws InterruptedException {
			Thread.sleep(3000); // sleep for 3 seconds
			return "Task Completed";
		}
}
