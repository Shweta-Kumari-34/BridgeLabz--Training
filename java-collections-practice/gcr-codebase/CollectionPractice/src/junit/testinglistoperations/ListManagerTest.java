package junit.testinglistoperations;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

public class ListManagerTest {

	// Creating object of ListManager class
	ListManager listManager = new ListManager();

	// Test case to verify element addition
	@Test
	public void testAddElement() {
		List<Integer> list = new ArrayList<>();

		listManager.addElement(list, 10);
		listManager.addElement(list, 20);

		assertEquals(2, list.size());
		assertTrue(list.contains(10));
		assertTrue(list.contains(20));
	}

	// Test case to verify element removal
	@Test
	public void testRemoveElement() {
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);

		listManager.removeElement(list, 10);

		assertEquals(1, list.size());
		assertFalse(list.contains(10));
	}

	// Test case to verify list size
	@Test
	public void testGetSize() {
		List<Integer> list = new ArrayList<>();
		list.add(5);
		list.add(15);

		assertEquals(2, listManager.getSize(list));
	}
}
