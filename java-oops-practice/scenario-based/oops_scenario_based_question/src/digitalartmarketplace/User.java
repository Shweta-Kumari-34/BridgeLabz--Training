package digitalartmarketplace;

public class User {
protected String name;
protected static double walletBalance = 5000;
User(String name, double walletBalance ){
	this.name =name;
	this.walletBalance= walletBalance;
}
public static void updateBalance(double price) {
	walletBalance= walletBalance-price;
}

public static double getWalletBalance() {
	return walletBalance;
}

}
