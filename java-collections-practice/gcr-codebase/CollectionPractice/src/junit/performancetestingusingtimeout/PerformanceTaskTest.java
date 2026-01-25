package junit.performancetestingusingtimeout;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

public class PerformanceTaskTest {
	PerformanceTask task;

	// Initialize object before each test
	@org.junit.jupiter.api.BeforeEach
	void setUp() {
		task = new PerformanceTask();
	}

	// Performance test: should fail if execution exceeds 2 seconds
	@Test
	@Timeout(2) // timeout in seconds
	void testLongRunningTaskTimeout() throws InterruptedException {
		task.longRunningTask();
	}
}
