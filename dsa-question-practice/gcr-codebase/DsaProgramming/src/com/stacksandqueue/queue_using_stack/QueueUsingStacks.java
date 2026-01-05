package com.stacksandqueue.queue_using_stack;

import java.util.Stack;

public class QueueUsingStacks<T> {
	private Stack<T> stackEnqueue = new Stack<>();
	private Stack<T> stackDequeue = new Stack<>();
	private int maxSize;

	public QueueUsingStacks(int size) {
		this.maxSize = size;
	}

	public void enqueue(T value) {
		if (stackEnqueue.size() + stackDequeue.size() >= maxSize) {
			System.out.println("Queue Overflow! Cannot enqueue " + value);
			return;
		}
		stackEnqueue.push(value);
		System.out.println("Enqueued: " + value);
	}

	public T dequeue() {
		if (stackDequeue.isEmpty()) {
			while (!stackEnqueue.isEmpty()) {
				stackDequeue.push(stackEnqueue.pop());
			}
		}

		if (stackDequeue.isEmpty()) {
			System.out.println("Queue Underflow! Cannot dequeue.");
			return null;
		}

		T dequeuedValue = stackDequeue.pop();
		System.out.println("Dequeued: " + dequeuedValue);
		return dequeuedValue;
	}

	public T peek() {
		if (stackDequeue.isEmpty()) {
			while (!stackEnqueue.isEmpty()) {
				stackDequeue.push(stackEnqueue.pop());
			}
		}

		if (stackDequeue.isEmpty()) {
			System.out.println("Queue is empty!");
			return null;
		}

		return stackDequeue.peek();
	}

	public boolean isEmpty() {
		return stackEnqueue.isEmpty() && stackDequeue.isEmpty();
	}
}
