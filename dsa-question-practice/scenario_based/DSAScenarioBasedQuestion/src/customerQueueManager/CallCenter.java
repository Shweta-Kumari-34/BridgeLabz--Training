package customerQueueManager;
import java.util.*;
public class CallCenter {

	    // normal customers
	    private Queue<Customer> normalQueue = new LinkedList<>();

	    // VIP customers higher priority served first
	    private PriorityQueue<Customer> vipQueue =
	        new PriorityQueue<>((a, b) -> b.priority - a.priority);

	    // keep track call count
	    private HashMap<String, Integer> callCountMap = new HashMap<>();

	    // Incoming call
	    public void receiveCall(Customer c) {

	        // update call count
	        callCountMap.put(c.id, callCountMap.getOrDefault(c.id, 0) + 1);

	        if (c.isVIP) {
	            vipQueue.offer(c);
	            System.out.println("VIP call received: " + c.name);
	        } else {
	            normalQueue.offer(c);
	            System.out.println("Normal call received: " + c.name);
	        }
	    }

	    // handle next call
	    public void handleCall() {

	        Customer c;

	        if (!vipQueue.isEmpty()) {
	            c = vipQueue.poll();
	        } else if (!normalQueue.isEmpty()) {
	            c = normalQueue.poll();
	        } else {
	            System.out.println("No calls in queue");
	            return;
	        }

	        System.out.println("Handling call from: " + c.name);
	    }

	    // displaying call count
	    public void displayCallStats() {
	        System.out.println("\nCall Count This Month:");
	        for (String id : callCountMap.keySet()) {
	            System.out.println(id + " → " + callCountMap.get(id));
	        }
	    }
	}


