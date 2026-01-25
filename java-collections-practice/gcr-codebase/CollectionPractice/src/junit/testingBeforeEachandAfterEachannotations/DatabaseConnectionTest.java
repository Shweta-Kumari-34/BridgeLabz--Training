package junit.testingBeforeEachandAfterEachannotations;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DatabaseConnectionTest {
	private DatabaseConnection dbConnection;

	// Runs BEFORE each test method
	@BeforeEach
	public void setUp() {
		dbConnection = new DatabaseConnection();
		dbConnection.connect();
	}

	// Test to verify database connection is established
	@Test
	public void testConnectionEstablished() {
		assertTrue(dbConnection.isConnected(), "Database should be connected");
	}

	// Runs AFTER each test method
	@AfterEach
	public void tearDown() {
		dbConnection.disconnect();
		assertFalse(dbConnection.isConnected(), "Database should be disconnected");
	}
}
