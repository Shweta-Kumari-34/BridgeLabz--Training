package com.stacksandqueue.stack_sort_recursion;

import java.util.Stack;

public class StackSort {

	public static void sortStack(Stack<Integer> stack) {
		if (stack.isEmpty()) {
			return; 
		}

		int top = stack.pop();

		sortStack(stack);

		insertInSortedOrder(stack, top);
	}

	private static void insertInSortedOrder(Stack<Integer> stack, int element) {
		if (stack.isEmpty() || stack.peek() <= element) {
			stack.push(element);
			return;
		}

		int top = stack.pop();
		insertInSortedOrder(stack, element);

		stack.push(top);
	}
}
