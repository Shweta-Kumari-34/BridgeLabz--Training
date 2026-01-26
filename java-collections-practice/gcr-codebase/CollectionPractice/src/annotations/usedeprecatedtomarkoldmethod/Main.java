package annotations.usedeprecatedtomarkoldmethod;

public class Main {
	 public static void main(String[] args) {

	        // creating object of LegacyAPI
	        LegacyAPI api = new LegacyAPI();

	        // calling deprecated method (compiler warning will appear)
	        api.oldFeature();

	        // calling new method
	        api.newFeature();
	    }
}
