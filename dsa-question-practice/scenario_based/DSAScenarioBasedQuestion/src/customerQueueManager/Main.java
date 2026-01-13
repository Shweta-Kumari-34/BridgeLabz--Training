package customerQueueManager;

public class Main {

	public static void main(String[] args) {

        CallCenter center = new CallCenter();

        Customer c1 = new Customer("C101", "Ravi", false, 0);
        Customer c2 = new Customer("C102", "Neha", true, 5);
        Customer c3 = new Customer("C103", "Amit", false, 0);
        Customer c4 = new Customer("C102", "Neha", true, 5);

        center.receiveCall(c1);
        center.receiveCall(c2);
        center.receiveCall(c3);
        center.receiveCall(c4);

        center.handleCall();
        center.handleCall();
        center.handleCall();

        center.displayCallStats();
    }
}
