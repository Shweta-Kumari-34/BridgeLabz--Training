package digitalartmarketplace;

public class PrintArt extends Artwork {
	private static double purchasePrice = 2050.0;
	private static double licenseAmt = 900;
	private static double subscribePrice = 1300;

	PrintArt(String title, String artist, double price, String licenseType) {
		super(title, artist, price, licenseType);

	}

	public static double getPrice() {
		return purchasePrice;
	}

	public static double getLicenseAmt() {
		return licenseAmt;
	}

	public static double getSubscribePrice() {
		return subscribePrice;
	}

}
