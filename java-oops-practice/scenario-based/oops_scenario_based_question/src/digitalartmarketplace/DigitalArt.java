package digitalartmarketplace;

public class DigitalArt extends Artwork {
	private String licenseType ;
	private static  double purchasePrice =1050.0;
	private static double licenseAmt=500;
	private  static double subscribePrice= 700;
	
	DigitalArt(String title, String artist, double price, String licenseType ){
		super(title, artist, price, licenseType);
		
	}
	
public static	 double getPrice() {
		return purchasePrice;
	}

public static  double getLicenseAmt() {
	return  licenseAmt;
}
public static double getSubscribePrice() {
	return subscribePrice ;
}


}
