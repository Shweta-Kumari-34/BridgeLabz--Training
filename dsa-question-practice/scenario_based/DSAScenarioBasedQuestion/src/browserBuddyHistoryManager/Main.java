package browserBuddyHistoryManager;

public class Main {
	    public static void main(String[] args) {

	        BrowserManager browser = new BrowserManager();
	        BrowserTab tab = browser.getCurrentTab();

	        tab.visit("google.com");
	        tab.visit("youtube.com");
	        tab.visit("stackoverflow.com");

	        tab.back();
	        tab.back();
	        tab.forward();

	        browser.closeTab();
	        browser.reopenTab();

	        System.out.println("Current Page is: " + tab.getCurrentPage());
	    }
	}


