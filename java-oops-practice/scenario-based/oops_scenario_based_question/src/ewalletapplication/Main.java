package ewalletapplication;


	public class Main {
	    public static void main(String[] args) {

	        Wallet pw = new PersonalWallet(100);   
	        Wallet bw = new BusinessWallet(500);   

	        User u1 = new User(1, "Rohit", pw);
	        User u2 = new User(2, "Neha", bw);

	        pw.loadMoney(1000);
	        bw.loadMoney(2000);

	     
	        pw.transferTo(u2, 300);
	        bw.transferTo(u1, 500);

	        System.out.println("Rohit Balance: ₹" + pw.getBalance());
	        System.out.println("Neha Balance: ₹" + bw.getBalance());
	    }
	}
	


