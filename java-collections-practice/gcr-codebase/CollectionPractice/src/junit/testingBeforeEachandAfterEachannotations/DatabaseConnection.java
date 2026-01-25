package junit.testingBeforeEachandAfterEachannotations;

public class DatabaseConnection {
	private boolean connected = false;

	// Method to connect to database
	public void connect() {
		connected = true;
		System.out.println("Database connected");
	}

	// Method to disconnect from database
	public void disconnect() {
		connected = false;
		System.out.println("Database disconnected");
	}

	// Method to check connection status
	public boolean isConnected() {
		return connected;
	}
}
