package browserBuddyHistoryManager;

import java.util.Stack;

public class BrowserManager {
	private Stack<BrowserTab> closedTabs = new Stack<>();
    private BrowserTab currentTab = new BrowserTab();

    public BrowserTab getCurrentTab() {
        return currentTab;
    }

    // close current tabs
    public void closeTab() {
        closedTabs.push(currentTab);
        currentTab = new BrowserTab();
        System.out.println("Tab is closed");
    }

    // restore recently closed tab
    public void reopenTab() {
        if (!closedTabs.isEmpty()) {
            currentTab = closedTabs.pop();
            System.out.println("Tab is  restored");
        } else {
            System.out.println("No tabs to restore");
        }
    }
}
