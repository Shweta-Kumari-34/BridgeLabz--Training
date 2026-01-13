package customerQueueManager;

public class Customer {
	 String id;
	    String name;
	    boolean isVIP;
	    int priority;   // higher value = higher priority

	    Customer(String id, String name, boolean isVIP, int priority) {
	        this.id = id;
	        this.name = name;
	        this.isVIP = isVIP;
	        this.priority = priority;
	    }
}
