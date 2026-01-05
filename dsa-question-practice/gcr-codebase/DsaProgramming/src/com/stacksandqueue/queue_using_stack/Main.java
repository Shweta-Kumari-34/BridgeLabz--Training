package com.stacksandqueue.queue_using_stack;

public class Main {
	public static void main(String[] args) {
		QueueUsingStacks<Integer> queue = new QueueUsingStacks<>(5);

		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);

		System.out.println("Front Element: " + queue.peek());

		queue.dequeue();
		queue.dequeue();

		queue.enqueue(40);
		queue.enqueue(50);
		queue.enqueue(60);
		queue.enqueue(70); 

		// dequeue remaining elements
		while (!queue.isEmpty()) {
			queue.dequeue();
		}

		// underflow example
		queue.dequeue();
	}
}
