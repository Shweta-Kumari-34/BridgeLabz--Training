package browserBuddyHistoryManager;

public class BrowserTab {

	private PageNode current;

	// visit new page
	public void visit(String url) {
		PageNode newPage = new PageNode(url);

		if (current != null) {
			current.next = newPage;
			newPage.prev = current;
		}

		current = newPage;
		System.out.println("Visited page : " + url);
	}

	// back navigation
	public void back() {
		if (current != null && current.prev != null) {
			current = current.prev;
			System.out.println("Back to page: " + current.url);
		} else {
			System.out.println("Previous page not found");
		}
	}

	// forward navigation
	public void forward() {
		if (current != null && current.next != null) {
			current = current.next;
			System.out.println("Forward to page: " + current.url);
		} else {
			System.out.println("No next page found");
		}
	}

	public String getCurrentPage() {
		return current != null ? current.url : "Empty Tab found";
	}
}
