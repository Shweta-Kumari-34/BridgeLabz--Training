package payXpressBillPaymentSystem;

public class Main {
	 public static void main(String[] args) {

	        Bill bill1 = new ElectricityBill(1200);
	        Bill bill2 = new InternetBill(999);

	        bill1.sendReminder();
	        bill1.pay();

	        bill2.sendReminder();
	        System.out.println("Late fee: " + bill2.calculateLateFee(100));
	    }
}
